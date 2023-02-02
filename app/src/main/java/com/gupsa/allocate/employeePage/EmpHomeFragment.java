package com.gupsa.allocate.employeePage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.google.firebase.Timestamp;
import com.gupsa.allocate.AllocationViewFragment;
import com.gupsa.allocate.adapter.AllocateViewPagerAdapter;
import com.gupsa.allocate.adapter.CardAdapter;
import com.gupsa.allocate.models.AllocationModel;

import java.util.ArrayList;

import com.gupsa.allocate.databinding.FragmentEmpHomeBinding;

public class EmpHomeFragment extends Fragment {

    private FragmentEmpHomeBinding binding;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentEmpHomeBinding.inflate(inflater, container, false);

        ArrayList<Fragment> fragments = new ArrayList<>();
        String[] titles = new String[2];
        titles[0] = "단기 일정";
        titles[1] = "장기 일정";

        for (int i = 0; i < 2; i++) {
            fragments.add(new AllocationViewFragment());
        }

        // 프래그먼트 안에서 프래그먼트를 사용할 때는 getChildFragmentManager() 를 사용해야 함
        AllocateViewPagerAdapter viewPagerAdapter = new AllocateViewPagerAdapter(fragments, titles, getChildFragmentManager());

        binding.vpAllocation.setAdapter(viewPagerAdapter);
        binding.tlAllocation.setupWithViewPager(binding.vpAllocation);

        return binding.getRoot();
    }
}