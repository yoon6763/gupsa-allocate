package com.gupsa.allocate.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gupsa.allocate.R
import com.gupsa.allocate.databinding.ItemAllocateLogBinding
import com.gupsa.allocate.models.AllocationLogModel

class AllocationLogAdapter(
    private val context: Context,
    private val models: ArrayList<AllocationLogModel>,
) :
    RecyclerView.Adapter<AllocationLogAdapter.Holder>() {

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    var onItemClickListener: OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = inflater.inflate(R.layout.item_allocate_log, parent, false)

        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.binding.run {
            val model = models[position]

            tvCompany.text = model.company
            tvDuration.text = model.date
            tvWeightPoint.text = "${model.weight} 톤 | ${model.point} P"
            tvLocation.text = model.location
        }
    }

    override fun getItemCount(): Int {
        return models.size
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemAllocateLogBinding.bind(itemView)

        init {
            itemView.setOnClickListener {
                onItemClickListener?.onItemClick(adapterPosition)
            }
        }
    }
}