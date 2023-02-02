package com.gupsa.allocate;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.gupsa.allocate.adapter.AllocationLogAdapter;
import com.gupsa.allocate.databinding.ActivityAllocationLogAllBinding;
import com.gupsa.allocate.models.AllocationLogModel;

import java.util.ArrayList;
import java.util.Random;

public class AllocationLogAllActivity extends AppCompatActivity {

    ActivityAllocationLogAllBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAllocationLogAllBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 툴바 뒤로가기 설정
        setSupportActionBar(binding.toolbarAllocationLogAll);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<AllocationLogModel> allocationLogModels = new ArrayList<>();

        Random rd = new Random();

        for (int i = 0; i < 10; i++) {
            int point = rd.nextInt(100) + 1;
            point *= 10000;
            allocationLogModels.add(new AllocationLogModel("회사 " + i, "2021-01-01", "충청남도 천안시 서북구 - 충청남도 천안시 동남구", 1.0f, point));
        }


        AllocationLogAdapter adapter = new AllocationLogAdapter(AllocationLogAllActivity.this, allocationLogModels);
        binding.rvAllocationLogAll.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}