package com.example.midsolution;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

public class adapter extends RecyclerView.Adapter<adapter.myholder> {
    String name[];
    int icon[];
    Context cxt;

    public adapter(String[] name , int icon[], Context cxt) {
        this.name = name;
        this.icon=icon;
        this.cxt=cxt;
    }

    @NonNull
    @Override
    public myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(cxt);
        View view=inflater.inflate(R.layout.layoutdata,parent,false);
        return new myholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull myholder holder, int position) {
        holder.tv.setText(name[position]);
        holder.dp.setImageResource(icon[position]);

    }

    @Override
    public int getItemCount() {
        return icon.length;
    }

    public class myholder extends RecyclerView.ViewHolder {
        TextView tv;
        ImageView dp;


        public myholder(@NonNull View itemView) {
            super(itemView);
            tv= (TextView)itemView.findViewById(R.id.tv);
            dp= (ImageView)itemView.findViewById(R.id.dp);


        }
    }
}
