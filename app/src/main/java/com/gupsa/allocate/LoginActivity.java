package com.gupsa.allocate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.gupsa.allocate.databinding.ActivityLoginBinding;
import com.gupsa.allocate.utils.Constants;
import com.gupsa.allocate.utils.UserType;


public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnLogin.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra(Constants.INTENT_EXTRA_USER_TYPE, UserType.EMPLOYEE);
            startActivity(intent);
        });

        binding.btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        binding.btnSarch.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, IdPwSearchActivity.class);
            intent.putExtra(Constants.INTENT_EXTRA_USER_TYPE, UserType.EMPLOYEE);
            startActivity(intent);
        });


    }
}