package com.gupsa.allocate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.gupsa.allocate.databinding.SignupAdmBinding;
import com.gupsa.allocate.databinding.SignupEmpBinding;
import com.gupsa.allocate.spiner.CustomSpinnerAdapter;
import com.gupsa.allocate.utils.Constants;
import com.gupsa.allocate.utils.UserType;

import java.util.ArrayList;
import java.util.List;

public class SignupAdmActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();

    private List<String> list01 = new ArrayList<>();
    private List<String> list02 = new ArrayList<>();
    private List<String> list03 = new ArrayList<>();
    private Spinner spinner01, spinner02, spinner03;
    private CustomSpinnerAdapter adapter;
    private String selectedItem;
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

        spinner01 = findViewById(R.id.spinner01);

        // 스피너 안에 넣을 데이터 임의 생성
        for (int i = 1; i < 5; i++) {
            list01.add("아이템" + i);
        }

        // 스피너에 붙일 어댑터 초기화
        adapter = new CustomSpinnerAdapter(this, list01);
        spinner01.setAdapter(adapter);

        // 스피너 클릭 리스너
        /*spinner01.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // 어댑터에서 정의한 메서드를 통해 스피너에서 선택한 아이템의 이름을 받아온다
                selectedItem = adapter.getItem();
                //Toast.makeText(SignupAdmActivity.this, "선택한 아이템 : " + selectedItem, Toast.LENGTH_SHORT).show();
                // 어댑터에서 정의하는 게 귀찮다면 아래처럼 구할 수도 있다
                // getItemAtPosition()의 리턴형은 Object이므로 String 캐스팅이 필요하다
                //String otherItem = (String) spinner01.getItemAtPosition(position);
                //Log.e(TAG, "getItemAtPosition() - 선택한 아이템 : " + otherItem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //
            }
        });*/

        spinner02 = findViewById(R.id.spinner02);

        // 스피너 안에 넣을 데이터 임의 생성
        for (int i = 1; i < 5; i++) {
            list02.add("아이템" + i);
        }

        // 스피너에 붙일 어댑터 초기화
        adapter = new CustomSpinnerAdapter(this, list02);
        spinner02.setAdapter(adapter);

        // 스피너 클릭 리스너
        /*spinner02.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // 어댑터에서 정의한 메서드를 통해 스피너에서 선택한 아이템의 이름을 받아온다
                selectedItem = adapter.getItem();
                Toast.makeText(SignupAdmActivity.this, "선택한 아이템 : " + selectedItem, Toast.LENGTH_SHORT).show();
                // 어댑터에서 정의하는 게 귀찮다면 아래처럼 구할 수도 있다
                // getItemAtPosition()의 리턴형은 Object이므로 String 캐스팅이 필요하다
                String otherItem = (String) spinner02.getItemAtPosition(position);
                Log.e(TAG, "getItemAtPosition() - 선택한 아이템 : " + otherItem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //
            }
        });*/

        spinner03 = findViewById(R.id.spinner03);

        // 스피너 안에 넣을 데이터 임의 생성
        for (int i = 1; i < 5; i++) {
            list03.add("아이템" + i);
        }

        // 스피너에 붙일 어댑터 초기화
        adapter = new CustomSpinnerAdapter(this, list03);
        spinner03.setAdapter(adapter);

        // 스피너 클릭 리스너
        /*spinner03.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // 어댑터에서 정의한 메서드를 통해 스피너에서 선택한 아이템의 이름을 받아온다
                selectedItem = adapter.getItem();
                Toast.makeText(SignupAdmActivity.this, "선택한 아이템 : " + selectedItem, Toast.LENGTH_SHORT).show();
                // 어댑터에서 정의하는 게 귀찮다면 아래처럼 구할 수도 있다
                // getItemAtPosition()의 리턴형은 Object이므로 String 캐스팅이 필요하다
                String otherItem = (String) spinner03.getItemAtPosition(position);
                Log.e(TAG, "getItemAtPosition() - 선택한 아이템 : " + otherItem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //
            }
        });*/

    }
}