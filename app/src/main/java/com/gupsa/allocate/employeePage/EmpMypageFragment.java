package com.gupsa.allocate.employeePage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;

import com.gupsa.allocate.AllocationLogAllActivity;
import com.gupsa.allocate.InfoModifyActivity;
import com.gupsa.allocate.adapter.AllocationLogAdapter;
import com.gupsa.allocate.databinding.FragmentEmpMypageBinding;
import com.gupsa.allocate.models.AllocationLogModel;

import java.util.ArrayList;

public class EmpMypageFragment extends Fragment {

    FragmentEmpMypageBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEmpMypageBinding.inflate(inflater, container, false);

        binding.tvLogAll.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), AllocationLogAllActivity.class));
        });

        binding.btnModify.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), InfoModifyActivity.class));
        });

        ArrayList<AllocationLogModel> allocationLogModels = new ArrayList<>();

        allocationLogModels.add(new AllocationLogModel("회사1", "2021-01-01", "서울", 1.0f, 1));
        allocationLogModels.add(new AllocationLogModel("회사2", "2021-01-02", "서울", 2.0f, 2));
        allocationLogModels.add(new AllocationLogModel("회사3", "2021-01-03", "서울", 3.0f, 3));

        AllocationLogAdapter adapter = new AllocationLogAdapter(getContext(), allocationLogModels);
        adapter.notifyDataSetChanged();

        binding.rvAllocationLog.setAdapter(adapter);
        binding.rvAllocationLog.addItemDecoration(new DividerItemDecoration(getContext(), 1));

        return binding.getRoot();
    }
}