package com.example.midsolution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    String name,pass;
    public static final String EXTRA_NAME="name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button1=findViewById(R.id.Login);
        EditText editText1=findViewById(R.id.Logser);
        EditText editText2=findViewById(R.id.Logpas);

         name="aqib";
        pass="1122";
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name2=editText1.getText().toString();
                String pass2=editText2.getText().toString();

                if(name2.equals(name) && pass2.equals(pass)){
                    Intent intent=new Intent(getApplicationContext(),Books.class);
                    intent.putExtra(EXTRA_NAME,name);
                    startActivity(intent);

                }
                else{

                    TextView textView=findViewById(R.id.textView3);
                    textView.setText(String.valueOf("Incorrect username or password..."));
                }
            }
        });

    }
}