package com.gupsa.allocate;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.gupsa.allocate.databinding.ActivityAllocateDetailBinding;

import java.util.Random;

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

        Random rd = new Random();

        int workState = rd.nextInt(5);

        // LinearLayout에 특정 idx의 ImageView를 가져와서 이미지를 변경
        ((ImageView) binding.llStatus.getChildAt(workState)).setImageDrawable(getDrawable(R.drawable.ic_truck_resize));

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}