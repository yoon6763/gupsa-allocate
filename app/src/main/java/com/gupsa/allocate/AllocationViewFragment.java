package com.gupsa.allocate;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.firebase.Timestamp;
import com.gupsa.allocate.adapter.CardAdapter;
import com.gupsa.allocate.databinding.FragmentAllocationViewBinding;
import com.gupsa.allocate.models.AllocationModel;
import com.gupsa.allocate.utils.StampStatus;

import java.util.ArrayList;

public class AllocationViewFragment extends Fragment {
    CardAdapter cardAdapter;
    boolean stampEnabled = false;
    private FragmentAllocationViewBinding binding;
    private ArrayList<AllocationModel> cardList;

    public AllocationViewFragment() {
        // Required empty public constructor
    }


    public static AllocationViewFragment newInstance(String param1, String param2) {
        return new AllocationViewFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAllocationViewBinding.inflate(inflater, container, false);

        cardList = new ArrayList<AllocationModel>();
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222", "경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), Timestamp.now(), "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222", "경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), Timestamp.now(), "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222", "경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), null, "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222", "경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), Timestamp.now(), "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222", "경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), Timestamp.now(), "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222", "경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), Timestamp.now(), "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222", "경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), null, "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222", "경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), null, "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222", "경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), null, "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222", "경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), Timestamp.now(), "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222", "경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), null, "Gupsa", 100000, 1.0f));
        cardList.add(new AllocationModel("Gupsa", "Gupsa", "Gupsa", "김대리", "01011112222", "경기도 용인시 처인구 xxx", "충청남도 천안시 서북구 xxx", Timestamp.now(), null, "Gupsa", 100000, 1.0f));


        cardAdapter = new CardAdapter(requireContext(), cardList);

        CardAdapter.OnWorkStatusChangeListener listener = new CardAdapter.OnWorkStatusChangeListener() {
            @Override
            public void onWorkStatusChange(int position, @NonNull StampStatus status) {
                if (status == StampStatus.FINISHED) {
                    Toast.makeText(requireContext(), "작업 완료", Toast.LENGTH_SHORT).show();
                } else if (status == StampStatus.WORKING) {
                    Toast.makeText(requireContext(), "작업 시작", Toast.LENGTH_SHORT).show();
                }
            }
        };

        binding.rvCard.setAdapter(cardAdapter);
        if (stampEnabled) {
            setStampView(listener);
        }
        cardAdapter.notifyDataSetChanged();

        cardAdapter.setOnItemClickListener(new CardAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                startActivity(new Intent(requireContext(), AllocateDetailActivity.class));
            }
        });

        return binding.getRoot();
    }

    public void setEnableStampView(boolean stampEnabled) {
        this.stampEnabled = stampEnabled;
    }

    private void setStampView(CardAdapter.OnWorkStatusChangeListener listener) {
        cardAdapter.setViewStamp(stampEnabled);
        cardAdapter.setOnWorkFinishListener(listener);
    }
}