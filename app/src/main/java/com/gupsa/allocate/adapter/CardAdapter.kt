package com.gupsa.allocate.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.gupsa.allocate.R
import com.gupsa.allocate.databinding.ItemAllocationBinding
import com.gupsa.allocate.models.AllocationModel
import com.gupsa.allocate.utils.StampStatus
import com.gupsa.allocate.utils.ToggleAnimation
import com.gupsa.allocate.utils.Utils

class CardAdapter(
    private val context: Context,
    private val models: ArrayList<AllocationModel>,
) :
    RecyclerView.Adapter<CardAdapter.Holder>() {

    var viewStamp = false
    val isExpanded = Array(models.size) { false }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    interface OnWorkStatusChangeListener {
        fun onWorkStatusChange(position: Int, status: StampStatus)
    }

    var onWorkFinishListener: OnWorkStatusChangeListener? = null
    var onItemClickListener: OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = inflater.inflate(R.layout.item_allocation, parent, false)

        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.binding.run {
            val model = models[position]

            if (viewStamp) holder.setStampViewBind()

            tvPoint.text = "${Utils.getCommaString(model.point)} P"
            tvLocationStart.text = model.locationStart
            tvLocationEnd.text = model.locationEnd
            tvWeight.text = "${model.weight} 톤"

            val dateString =
                Utils.timeStampToKor(model.durationStart) +
                        if (model.durationEnd != null) " ~ " + Utils.timeStampToKor(model.durationEnd) else ""

            tvDate.text = dateString

            tvClientCompanyName.text = model.clientCompany
            tvClientCall.text = Utils.getPhoneString(model.clientCall)
            tvClientName.text = model.clientName

            llExpand.visibility = if (isExpanded[position]) View.VISIBLE else View.GONE
        }
    }

    override fun getItemCount(): Int {
        return models.size
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemAllocationBinding.bind(itemView)

        init {
            itemView.setOnClickListener { onItemClickListener?.onItemClick(adapterPosition) }

            binding.ivExpand.setOnClickListener {
                val show = toggleLayout(!isExpanded[adapterPosition], it, binding.llExpand)
                isExpanded[adapterPosition] = show
            }

            binding.btnStampStart.setOnClickListener {
                models[adapterPosition].nextStampStatus()
                onWorkFinishListener?.onWorkStatusChange(adapterPosition, models[adapterPosition].stampStatus)
                notifyItemChanged(adapterPosition)
            }

            binding.btnStampEnd.setOnClickListener {
                models[adapterPosition].nextStampStatus()
                onWorkFinishListener?.onWorkStatusChange(adapterPosition, models[adapterPosition].stampStatus)
                notifyItemChanged(adapterPosition)
            }
        }

        private fun toggleLayout(
            isExpanded: Boolean,
            view: View,
            layoutExpand: LinearLayout
        ): Boolean {
            ToggleAnimation.toggleArrow(view, isExpanded)
            if (isExpanded) {
                ToggleAnimation.expand(layoutExpand)
            } else {
                ToggleAnimation.collapse(layoutExpand)
            }
            return isExpanded
        }

        fun setStampViewBind() {
            when (models[adapterPosition].stampStatus) {
                StampStatus.NONE -> {
                    binding.llStamp.visibility = View.VISIBLE
                    binding.flContainer.setBackgroundColor(context.getColor(R.color.white))
                    binding.btnStampStart.isEnabled = true
                    binding.btnStampStart.setBackgroundResource(R.drawable.btn_main_semi_round)
                    binding.btnStampEnd.isEnabled = false
                    binding.btnStampEnd.setBackgroundResource(R.drawable.btn_disable_semi_round)

                }
                StampStatus.WORKING -> {
                    binding.llStamp.visibility = View.VISIBLE
                    binding.flContainer.setBackgroundColor(context.getColor(R.color.white))
                    binding.btnStampStart.isEnabled = false
                    binding.btnStampStart.setBackgroundResource(R.drawable.btn_disable_semi_round)
                    binding.btnStampEnd.isEnabled = true
                    binding.btnStampEnd.setBackgroundResource(R.drawable.btn_main_semi_round)

                }
                else -> {
                    binding.llStamp.visibility = View.GONE
                    binding.flContainer.setBackgroundColor(context.getColor(R.color.gray_light))
                }
            }
        }
    }
}