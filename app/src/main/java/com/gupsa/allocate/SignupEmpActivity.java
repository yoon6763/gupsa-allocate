package com.gupsa.allocate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gupsa.allocate.databinding.ActivitySignupBinding;
import com.gupsa.allocate.databinding.SignupEmpBinding;
import com.gupsa.allocate.utils.Constants;
import com.gupsa.allocate.utils.UserType;

public class SignupEmpActivity extends AppCompatActivity {
    SignupEmpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = SignupEmpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnArrowSignup.setOnClickListener(v -> {
            Intent intent = new Intent(SignupEmpActivity.this, LoginActivity.class);
            intent.putExtra(Constants.INTENT_EXTRA_USER_TYPE, UserType.EMPLOYEE);
            startActivity(intent);
        });
    }
}