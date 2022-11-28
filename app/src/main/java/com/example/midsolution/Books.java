package com.example.midsolution;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Books extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        Intent intent=getIntent();
        String name=intent.getStringExtra(Login.EXTRA_NAME);

        TextView textView=findViewById(R.id.name);

        textView.setText("Hey, "+name);

        CardView foru=findViewById(R.id.cardView2);
        CardView space=findViewById(R.id.cardView3);
        CardView Popular=findViewById(R.id.card);
        CardView New=findViewById(R.id.cardView4);

        foru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Books.this,Foru.class);
                startActivity(intent1);
            }
        });



        Popular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Books.this,popular.class);
                startActivity(intent1);
            }
        });


    }
}