package com.gupsa.allocate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gupsa.allocate.databinding.SignupAdmBinding;
import com.gupsa.allocate.databinding.SignupEmpBinding;
import com.gupsa.allocate.utils.Constants;
import com.gupsa.allocate.utils.UserType;

public class SignupAdmActivity extends AppCompatActivity {

    SignupAdmBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = SignupAdmBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnArrowSignup.setOnClickListener(v -> {
            Intent intent = new Intent(SignupAdmActivity.this, SignupActivity.class);
            intent.putExtra(Constants.INTENT_EXTRA_USER_TYPE, UserType.EMPLOYEE);
            startActivity(intent);
        });

    }
}