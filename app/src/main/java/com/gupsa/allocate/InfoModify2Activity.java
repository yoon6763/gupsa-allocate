package com.gupsa.allocate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gupsa.allocate.databinding.ActivityInfoModify2Binding;
import com.gupsa.allocate.databinding.ActivityInfoModifyBinding;

public class InfoModify2Activity extends AppCompatActivity {

    ActivityInfoModify2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInfoModify2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnArrowSignup.setOnClickListener(v -> {
            Intent intent = new Intent(InfoModify2Activity.this, InfoModifyActivity.class);
            startActivity(intent);
        });


    }
}