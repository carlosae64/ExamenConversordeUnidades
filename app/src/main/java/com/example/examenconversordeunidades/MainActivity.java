package com.example.examenconversordeunidades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),CelsiusFarenheit.class);
                startActivityForResult(intent, 0);
            }
        });
        Button btn5 =(Button)findViewById(R.id.btn4);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MetroHectarea.class);
                startActivityForResult(intent, 0);
            }
        });
        Button btn6 =(Button)findViewById(R.id.btn3);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MetroCentimetro.class);
                startActivityForResult(intent, 0);
            }
        });




    }
}

