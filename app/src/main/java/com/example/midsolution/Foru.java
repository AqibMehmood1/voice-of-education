package com.example.midsolution;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Foru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foru);
        RecyclerView rv=findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        String[] name={
        "Chrysanthemum\n" +
                "by Kevin Henkes","My Name Is Yoon\n" +
                "by Helen Recorvits","The Name Jar\n" +
                "by Yangsook Choi","Yoko Writes Her Name\n" +
                "by Rosemary Wells","My Name Is Sangoel\n" +
                "by Karen Lynn Williams","My Name is Elizabeth!\n" +
                "by Annika Dunklee","A Porcupine Named Fluffy\n" +
                "by Helen Lester","Maple\n" +
                "by Lori Nichols",
                "How Nivi Got Her Names\n" +
                        "by Laura Deal","\tHope\n" +
                "by Isabell Monk","Your Name Is a Song\n" +
                "by Jamilah Thompkins-Bigelow","The Change Your Name Store\n" +
                "by Leanne Shirtliffe","Alma and How She Got Her Name\n" +
                "by Juana Martinez-Neal","A Perfect Name\n" +
                "by Charlene Costanzo","Hello, My Name Is... : How Adorabilis Got His Name\n" +
                "by Marisa Polansky"


        };

        int [] icons={R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,R.drawable.pic7,R.drawable.pic8,R.drawable.pic9,
                R.drawable.pic10,R.drawable.pic11,R.drawable.pic12,R.drawable.pic13,R.drawable.pic14,R.drawable.pic15              };
        rv.setAdapter(new adapter(name,icons,Foru.this));
    }
}