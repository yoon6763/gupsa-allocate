package com.gupsa.allocate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.gupsa.allocate.adminPage.AdmBoardFragment;
import com.gupsa.allocate.adminPage.AdmHomeFragment;
import com.gupsa.allocate.adminPage.AdmMypageFragment;
import com.gupsa.allocate.databinding.ActivityMainBinding;
import com.gupsa.allocate.employeePage.EmpMyAllocateFragment;
import com.gupsa.allocate.employeePage.EmpBoardFragment;
import com.gupsa.allocate.employeePage.EmpMypageFragment;
import com.gupsa.allocate.utils.Constants;
import com.gupsa.allocate.utils.UserType;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();

        if ((UserType) intent.getSerializableExtra(Constants.INTENT_EXTRA_USER_TYPE) == UserType.ADMIN) {
            // admin
            getSupportFragmentManager().beginTransaction().add(R.id.container_main, new AdmHomeFragment()).commit();

            binding.navMain.setOnItemSelectedListener(item -> {
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_main, new AdmHomeFragment()).commit();
                        return true;

                    case R.id.nav_board:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_main, new AdmBoardFragment()).commit();
                        return true;

                    case R.id.nav_my_page:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_main, new AdmMypageFragment()).commit();
                        return true;
                }
                return false;
            });

        } else {
            // employee

            getSupportFragmentManager().beginTransaction().add(R.id.container_main, new EmpBoardFragment()).commit();

            binding.navMain.setOnItemSelectedListener(item -> {
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_main, new EmpBoardFragment()).commit();
                        return true;

                    case R.id.nav_board:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_main, new EmpMyAllocateFragment()).commit();
                        return true;

                    case R.id.nav_my_page:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container_main, new EmpMypageFragment()).commit();
                        return true;
                }
                return false;
            });
        }

    }
}