package com.example.dell.sushirestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;



public class Main_Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button order_button = (Button) findViewById(R.id.order_button);
        Button table_button = (Button) findViewById(R.id.table_button);

        order_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Activity.this, Typefood_Activity.class);
                startActivity(intent);
            }
        });
        table_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main_Activity.this, Table_Activity.class);
                startActivity(intent);
            }
        });
    }
}

