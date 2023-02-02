package com.gupsa.allocate.List;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.gupsa.allocate.R;
import com.gupsa.allocate.databinding.ActivityCompanySearchBinding;

import java.util.ArrayList;

public class CompanySearchActivity extends AppCompatActivity {
    ActivityCompanySearchBinding binding;
    private ListView listView;
    private ListViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCompanySearchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 툴바 뒤로가기 설정
        //setSupportActionBar(binding.toolbarCompanySearch);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapter = new ListViewAdapter();

        listView = (ListView) findViewById(R.id.company_listview);
        listView.setAdapter(adapter);

        adapter.addItem("회사1","천안시 서북구");
        adapter.addItem("회사2","천안시 서북구");
        adapter.addItem("회사3","천안시 서북구");
        adapter.addItem("회사4","천안시 서북구");

        adapter.notifyDataSetChanged();
    }
}