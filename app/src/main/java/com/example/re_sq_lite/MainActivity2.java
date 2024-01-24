package com.example.re_sq_lite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<DataHolder> arrayList;
   DBHandler dbHandlerrr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView = findViewById(R.id.myrecyclerView);
        arrayList = new ArrayList<>();
        dbHandlerrr = new DBHandler(getApplicationContext());
       // addData();
        addData2();
        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(arrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myCustomAdapter);
        //my another codde

    }

    private void addData2() {
        arrayList=dbHandlerrr.fetchDbData();
    }

    private void addData() {
        arrayList.add(new DataHolder("halo"));
        arrayList.add(new DataHolder("halo"));
        arrayList.add(new DataHolder("halo"));
        arrayList.add(new DataHolder("halo"));
        arrayList.add(new DataHolder("halo"));
        arrayList.add(new DataHolder("halo"));
        arrayList.add(new DataHolder("halo"));
    }
}