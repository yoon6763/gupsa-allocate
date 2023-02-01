package com.gupsa.allocate.id_pw_searchPage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gupsa.allocate.AllocationViewFragment;
import com.gupsa.allocate.adapter.AllocateViewPagerAdapter;
import com.gupsa.allocate.databinding.FragmentIdSearchBinding;

import java.util.ArrayList;


public class IdSearchFragment extends Fragment {

    FragmentIdSearchBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentIdSearchBinding.inflate(inflater, container, false);

        ArrayList<Fragment> fragments = new ArrayList<>();
        String[] titles = new String[2];
        titles[0] = "아이디 찾기";
        titles[1] = "비밀번호 찾기";

        for (int i = 0; i < 2; i++) {
            fragments.add(new AllocationViewFragment());
        }

        // 프래그먼트 안에서 프래그먼트를 사용할 때는 getChildFragmentManager() 를 사용해야 함
        AllocateViewPagerAdapter viewPagerAdapter = new AllocateViewPagerAdapter(fragments, titles, getParentFragmentManager());

        binding.searchVpAllocation.setAdapter(viewPagerAdapter);
        binding.searchTlAllocation.setupWithViewPager(binding.searchVpAllocation);

        return binding.getRoot();
    }
}