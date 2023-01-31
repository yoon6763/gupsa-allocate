package com.gupsa.allocate.employeePage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.google.firebase.Timestamp;
import com.gupsa.allocate.adapter.CardAdapter;
import com.gupsa.allocate.databinding.FragmentEmpBoardBinding;
import com.gupsa.allocate.models.AllocationModel;

import java.util.ArrayList;

public class EmpBoardFragment extends Fragment {

    private FragmentEmpBoardBinding binding;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentEmpBoardBinding.inflate(inflater, container, false);

        ArrayList<AllocationModel> cardList = new ArrayList<>();
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
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222","경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), Timestamp.now(), "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222","경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), Timestamp.now(), "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222","경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), Timestamp.now(), "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222","경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), null, "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222","경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), null, "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222","경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), null, "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222","경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), null, "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222","경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), null, "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222","경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), null, "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222","경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), null, "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222","경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), null, "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222","경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), null, "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222","경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), null, "Gupsa", 100000, 1.0f));


        CardAdapter cardAdapter = new CardAdapter(getContext(), cardList);

        binding.rvCard.setAdapter(cardAdapter);
        cardAdapter.notifyDataSetChanged();


        return binding.getRoot();
    }
}