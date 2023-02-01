package com.gupsa.allocate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gupsa.allocate.adminPage.AdmHomeFragment;
import com.gupsa.allocate.databinding.IdSearchBinding;
import com.gupsa.allocate.id_pw_searchPage.IdSearchFragment;
import com.gupsa.allocate.utils.Constants;
import com.gupsa.allocate.utils.UserType;

public class IdSearchActivity extends AppCompatActivity {
    IdSearchBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = IdSearchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnArrowSignup.setOnClickListener(v -> {
            Intent intent = new Intent(IdSearchActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        Intent intent2 = getIntent();
        getSupportFragmentManager().beginTransaction().add(R.id.container_id_search, new IdSearchFragment()).commit();
        

    }
}