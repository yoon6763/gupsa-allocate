package com.gupsa.allocate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gupsa.allocate.databinding.ActivityInfoModifyBinding;
import com.gupsa.allocate.employeePage.EmpBoardFragment;
import com.gupsa.allocate.employeePage.EmpMypageFragment;
import com.gupsa.allocate.utils.Constants;
import com.gupsa.allocate.utils.UserType;

public class InfoModifyActivity extends AppCompatActivity {

    ActivityInfoModifyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityInfoModifyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnArrowSignup.setOnClickListener(v -> {
            Intent intent = new Intent(InfoModifyActivity.this, MainActivity.class);
            startActivity(intent);
        });

        binding.btnAuthenticate.setOnClickListener(v -> {
            Intent intent = new Intent(InfoModifyActivity.this, InfoModify2Activity.class);
            startActivity(intent);
        });


    }
}