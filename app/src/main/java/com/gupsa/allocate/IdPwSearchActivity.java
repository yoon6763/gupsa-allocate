package com.gupsa.allocate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import com.gupsa.allocate.adapter.AllocateViewPagerAdapter;
import com.gupsa.allocate.databinding.IdPwSearchBinding;
import com.gupsa.allocate.id_pw_searchPage.IdSearchPageFragment;
import com.gupsa.allocate.id_pw_searchPage.PwSearchPageFragment;

import java.util.ArrayList;

public class IdPwSearchActivity extends AppCompatActivity {
    IdPwSearchBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = IdPwSearchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnArrowSignup.setOnClickListener(v -> {
            Intent intent = new Intent(IdPwSearchActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        ArrayList<Fragment> fragments = new ArrayList<>();
        String[] titles = new String[2];
        titles[0] = "아이디 찾기";
        titles[1] = "비밀번호 찾기";

        for (int i = 0; i < 2; i++) {
            if(i==0)
                fragments.add(new IdSearchPageFragment());
            else
                fragments.add(new PwSearchPageFragment());
        }

        // 프래그먼트 안에서 프래그먼트를 사용할 때는 getChildFragmentManager() 를 사용해야 함
        AllocateViewPagerAdapter viewPagerAdapter = new AllocateViewPagerAdapter(fragments, titles, getSupportFragmentManager());

        binding.searchVpAllocation.setAdapter(viewPagerAdapter);
        binding.searchTlAllocation.setupWithViewPager(binding.searchVpAllocation);


//        Intent intent2 = getIntent();
//        getSupportFragmentManager().beginTransaction().add(R.id.container_id_search, new IdPwSearchFragment()).commit();
//

    }

}