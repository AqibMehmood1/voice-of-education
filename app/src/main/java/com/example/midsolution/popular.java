package com.example.midsolution;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class popular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular);

        TextView Hist=findViewById(R.id.textView4);
        TextView Rom=findViewById(R.id.textView7);
        TextView Busn=findViewById(R.id.textView5);
        TextView Des=findViewById(R.id.textView8);

        Hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                history f1=new history();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f1);
                transaction.commit();

            }
        });
        Rom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Romance f1=new Romance();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f1);
                transaction.commit();
            }
        });
        Busn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Business f1=new Business();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f1);
                transaction.commit();
            }
        });
        Des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Design f1=new Design();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.lastl,f1);
                transaction.commit();
            }
        });
    }
}