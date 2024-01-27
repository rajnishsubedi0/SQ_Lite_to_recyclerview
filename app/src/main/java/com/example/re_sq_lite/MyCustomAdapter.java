package com.example.re_sq_lite;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyCustomAdapter extends RecyclerView.Adapter<MyViewHolder>{
    ArrayList<DataHolder> arrayList;
    public MyCustomAdapter(ArrayList<DataHolder> arrayList){
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_for_recycler_view,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String string=arrayList.get(holder.getAdapterPosition()).getNameee();
        holder.textView.setText(string);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
