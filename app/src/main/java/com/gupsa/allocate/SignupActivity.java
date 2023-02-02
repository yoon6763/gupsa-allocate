package com.gupsa.allocate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Bundle;

import com.gupsa.allocate.databinding.ActivityLoginBinding;
import com.gupsa.allocate.databinding.ActivitySignupBinding;
import com.gupsa.allocate.utils.Constants;
import com.gupsa.allocate.utils.UserType;

public class SignupActivity extends AppCompatActivity {

    ActivitySignupBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnArrowSignup.setOnClickListener(v -> {
            Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
            intent.putExtra(Constants.INTENT_EXTRA_USER_TYPE, UserType.EMPLOYEE);
            startActivity(intent);
        });

        binding.btnEmpSignup.setOnClickListener(v -> {
            Intent intent = new Intent(SignupActivity.this, SignupEmpActivity.class);
            intent.putExtra(Constants.INTENT_EXTRA_USER_TYPE, UserType.EMPLOYEE);
            startActivity(intent);
        });

        binding.btnAdmSignup.setOnClickListener(v -> {
            Intent intent = new Intent(SignupActivity.this, SignupAdmActivity.class);
            intent.putExtra(Constants.INTENT_EXTRA_USER_TYPE, UserType.EMPLOYEE);
            startActivity(intent);
        });

    }
}