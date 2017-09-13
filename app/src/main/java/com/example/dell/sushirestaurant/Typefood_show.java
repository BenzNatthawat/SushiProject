package com.example.dell.sushirestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Typefood_show extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typefood_show);

        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString("Message");

        Toast.makeText(Typefood_show.this,"This page is = "+text,Toast.LENGTH_LONG).show();






    }
}
