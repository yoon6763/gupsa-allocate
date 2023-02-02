package com.gupsa.allocate.id_pw_searchPage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gupsa.allocate.R;
import com.gupsa.allocate.databinding.FragmentPwsearchPageBinding;


public class PwSearchPageFragment extends Fragment {

    private FragmentPwsearchPageBinding binding;

    public PwSearchPageFragment() {
        // Required empty public constructor
    }


    public static PwSearchPageFragment newInstance(String param1, String param2) {
        return new PwSearchPageFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPwsearchPageBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}