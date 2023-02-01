package com.gupsa.allocate;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.gupsa.allocate.databinding.ActivityAllocateDetailBinding;

public class AllocateDetailActivity extends AppCompatActivity {

    ActivityAllocateDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAllocateDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 툴바 뒤로가기 설정
        setSupportActionBar(binding.toolbarAllocateDetail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}