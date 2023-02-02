package com.gupsa.allocate.id_pw_searchPage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gupsa.allocate.R;
import com.gupsa.allocate.databinding.FragmentIdsearchPageBinding;


public class IdSearchPageFragment extends Fragment {

    private FragmentIdsearchPageBinding binding;
    public IdSearchPageFragment() {
        // Required empty public constructor
    }

    public static IdSearchPageFragment newInstance(String param1, String param2) {
        return new IdSearchPageFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentIdsearchPageBinding.inflate(inflater, container,false);
        return binding.getRoot();
        // Inflate the layout for this fragment

    }
}