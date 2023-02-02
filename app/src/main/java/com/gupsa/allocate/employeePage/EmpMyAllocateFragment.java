package com.gupsa.allocate.employeePage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.gupsa.allocate.AllocationViewFragment;
import com.gupsa.allocate.adapter.AllocateViewPagerAdapter;
import com.gupsa.allocate.databinding.FragmentEmpBoardBinding;
import com.gupsa.allocate.databinding.FragmentEmpMyAllocateBinding;

import java.util.ArrayList;


public class EmpMyAllocateFragment extends Fragment {
    FragmentEmpMyAllocateBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentEmpMyAllocateBinding.inflate(inflater, container, false);

        ArrayList<Fragment> fragments = new ArrayList<>();
        String[] titles = new String[3];
        titles[0] = "승인 완료";
        titles[1] = "승인 전";
        titles[2] = "요청 건";

        for (int i = 0; i < 3; i++) {
            fragments.add(new AllocationViewFragment());
        }

        ((AllocationViewFragment) fragments.get(0)).setEnableStampView(true);


        // 프래그먼트 안에서 프래그먼트를 사용할 때는 getChildFragmentManager() 를 사용해야 함
        AllocateViewPagerAdapter viewPagerAdapter = new AllocateViewPagerAdapter(fragments, titles, getChildFragmentManager());

        binding.vpAllocation.setAdapter(viewPagerAdapter);
        binding.tlAllocation.setupWithViewPager(binding.vpAllocation);


        return binding.getRoot();
    }
}