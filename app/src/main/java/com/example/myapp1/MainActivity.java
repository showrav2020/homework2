package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAC,btnPrcent,btnRCL,btn,btnENG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAC=(Button)findViewById(R.id.btnAC);
        btnPrcent=(Button)findViewById(R.id.btnPrcent);




        btnAC.setOnClickListener(this);
        btnPrcent.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.btnAC)
        {


        }
        if (v.getId()==R.id.btnPrcent)
        {

        }

    }
}
