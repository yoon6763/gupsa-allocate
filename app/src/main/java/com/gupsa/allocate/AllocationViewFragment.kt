package com.gupsa.allocate

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.firebase.Timestamp
import com.gupsa.allocate.adapter.CardAdapter
import com.gupsa.allocate.databinding.FragmentAllocationViewBinding
import com.gupsa.allocate.models.AllocationModel


class AllocationViewFragment : Fragment() {

    private lateinit var binding: FragmentAllocationViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAllocationViewBinding.inflate(inflater, container, false)


        val cardList = ArrayList<AllocationModel>()
//        String company;
//        String employee; // nullable
//        String clientName;
//        String clientCall;
//        String locationStart;
//        String locationEnd;
//        Timestamp durationStart;
//        Timestamp durationEnd;
//        String status;
//        int point;
//        float weight;
        //        String company;
//        String employee; // nullable
//        String clientName;
//        String clientCall;
//        String locationStart;
//        String locationEnd;
//        Timestamp durationStart;
//        Timestamp durationEnd;
//        String status;
//        int point;
//        float weight;
        cardList.add(
            AllocationModel(
                "Gupsa",
                "Gupsa",
                "Gupsa",
                "김대리",
                "01011112222",
                "경기도 용인시 처인구 xxx",
                "충청남도 천안시 서북구 xxx",
                Timestamp.now(),
                Timestamp.now(),
                "Gupsa",
                100000,
                1.0f
            )
        )
        cardList.add(
            AllocationModel(
                "Gupsa",
                "Gupsa",
                "Gupsa",
                "김대리",
                "01011112222",
                "경기도 용인시 처인구 xxx",
                "충청남도 천안시 서북구 xxx",
                Timestamp.now(),
                null,
                "Gupsa",
                100000,
                1.0f
            )
        )
        cardList.add(
            AllocationModel(
                "Gupsa",
                "Gupsa",
                "Gupsa",
                "김대리",
                "01011112222",
                "경기도 용인시 처인구 xxx",
                "충청남도 천안시 서북구 xxx",
                Timestamp.now(),
                null,
                "Gupsa",
                100000,
                1.0f
            )
        )
        cardList.add(
            AllocationModel(
                "Gupsa",
                "Gupsa",
                "Gupsa",
                "김대리",
                "01011112222",
                "경기도 용인시 처인구 xxx",
                "충청남도 천안시 서북구 xxx",
                Timestamp.now(),
                null,
                "Gupsa",
                100000,
                1.0f
            )
        )
        cardList.add(
            AllocationModel(
                "Gupsa",
                "Gupsa",
                "Gupsa",
                "김대리",
                "01011112222",
                "경기도 용인시 처인구 xxx",
                "충청남도 천안시 서북구 xxx",
                Timestamp.now(),
                null,
                "Gupsa",
                100000,
                1.0f
            )
        )
        cardList.add(
            AllocationModel(
                "Gupsa",
                "Gupsa",
                "Gupsa",
                "김대리",
                "01011112222",
                "경기도 용인시 처인구 xxx",
                "충청남도 천안시 서북구 xxx",
                Timestamp.now(),
                null,
                "Gupsa",
                100000,
                1.0f
            )
        )
        cardList.add(
            AllocationModel(
                "Gupsa",
                "Gupsa",
                "Gupsa",
                "김대리",
                "01011112222",
                "경기도 용인시 처인구 xxx",
                "충청남도 천안시 서북구 xxx",
                Timestamp.now(),
                null,
                "Gupsa",
                100000,
                1.0f
            )
        )
        cardList.add(
            AllocationModel(
                "Gupsa",
                "Gupsa",
                "Gupsa",
                "김대리",
                "01011112222",
                "경기도 용인시 처인구 xxx",
                "충청남도 천안시 서북구 xxx",
                Timestamp.now(),
                null,
                "Gupsa",
                100000,
                1.0f
            )
        )
        cardList.add(
            AllocationModel(
                "Gupsa",
                "Gupsa",
                "Gupsa",
                "김대리",
                "01011112222",
                "경기도 용인시 처인구 xxx",
                "충청남도 천안시 서북구 xxx",
                Timestamp.now(),
                null,
                "Gupsa",
                100000,
                1.0f
            )
        )
        cardList.add(
            AllocationModel(
                "Gupsa",
                "Gupsa",
                "Gupsa",
                "김대리",
                "01011112222",
                "경기도 용인시 처인구 xxx",
                "충청남도 천안시 서북구 xxx",
                Timestamp.now(),
                null,
                "Gupsa",
                100000,
                1.0f
            )
        )


        val cardAdapter = CardAdapter(requireContext(), cardList)

        binding.rvCard.adapter = cardAdapter
        cardAdapter.notifyDataSetChanged()

        cardAdapter.onItemClickListener = object : CardAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                startActivity(Intent(context, AllocateDetailActivity::class.java))
            }
        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) = AllocationViewFragment()
    }
}