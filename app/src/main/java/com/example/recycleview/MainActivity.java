package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<CModel> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
    }
    private void addData() {
        elements = new ArrayList<>();
        elements.add(new CModel("#46CBDA","Ajuna Putra", "081226731710", "Tersedia"));
        elements.add(new CModel("#46CBDA","Angin Prasmana", "081226731711", "Tersedia"));
        elements.add(new CModel("#46CBDA","Azis Praja", "081226731712", "Tidak Tersedia"));
        elements.add(new CModel("#46CBDA","Bagas Madona", "081226731713", "Tersedia"));
        elements.add(new CModel("#46CBDA","Bakri Nando", "081226731714", "Tersedia"));
        elements.add(new CModel("#46CBDA","Bondan Perkoso", "081226731715", "Tidak Tersedia"));
        elements.add(new CModel("#46CBDA","Siti Wulan", "081226731716", "Tersedia"));
        elements.add(new CModel("#46CBDA","Titip Dari", "081226731717", "Tidak Tersedia"));
        elements.add(new CModel("#46CBDA","Totok Langgeng", "081226731718", "Tersedia"));
        elements.add(new CModel("#46CBDA","Zainul Raharjo", "081226731719", "Tersedia"));

        CAdapter adapter = new CAdapter(elements, this, new CAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(CModel item) {
                detail(item);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.RKT);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void detail(CModel item) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("CModel", item);
        startActivity(intent);
    }

}