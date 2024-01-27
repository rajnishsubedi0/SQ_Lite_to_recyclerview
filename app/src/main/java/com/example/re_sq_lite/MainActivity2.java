package com.example.re_sq_lite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView recyclerView;
   public static ArrayList<DataHolder> arrayList;
    public static MyCustomAdapter myCustomAdapter;
   DBHandler dbHandlerrr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView = findViewById(R.id.myrecyclerView);
        arrayList = new ArrayList<>();
        dbHandlerrr = new DBHandler(getApplicationContext());

       addData();

         myCustomAdapter = new MyCustomAdapter(arrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myCustomAdapter);
        addData2();
        //my another codde

    }



    private void addData2() {
        dbHandlerrr.fetchDbData();
        myCustomAdapter.notifyDataSetChanged();

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