package com.example.kuis1skeluarga1718088;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity  extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KeluargaAdapter keluargaAdapter;
    private ArrayList<Keluarga>keluargaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recyclerview);
        keluargaAdapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(keluargaAdapter);
    }
    private void tambahData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Sujarwo", "Ayah",  getDrawable(R.drawable.yh)));
        keluargaArrayList.add(new Keluarga("Ngatmiyatun", "Ibu", getDrawable(R.drawable.mmi)));
        keluargaArrayList.add(new Keluarga("Juliant Perdana", "Anak Pertama", getDrawable(R.drawable.joo)));
        keluargaArrayList.add(new Keluarga("Novanty Shita N", "Anak Kedua", getDrawable(R.drawable.sh)));
    }
}
