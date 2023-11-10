package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView NamaDetail, HpDetail, StatusDetail;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        CModel element = (CModel) getIntent().getSerializableExtra("CModel");
        NamaDetail = findViewById(R.id.NamaDetail);
        HpDetail = findViewById(R.id.HpDetail);
        StatusDetail = findViewById(R.id.StatusDetail);

        NamaDetail.setText(element.getNama());
        NamaDetail.setTextColor(Color.parseColor(element.getColor()));
        HpDetail.setText(element.getHp());
        StatusDetail.setText(element.getStatus());
    }
}