package com.example.dell.sushirestaurant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;


public class Typefood_Activity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);

        int[] resId = { R.drawable.setfood
                , R.drawable.sushi, R.drawable.rice
                , R.drawable.snack, R.drawable.salad
                , R.drawable.rameng, R.drawable.dessert
                , R.drawable.drink};

        final String[] list = { "อาหารชุด", "ข้าวปั้น", "ข้าว", "ของทานเล่น", "สลัด", "ราเมง", "ขนมหวาน", "เครื่องดื่ม"};


        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), list, resId);

        ListView listView = (ListView)findViewById(R.id.listview_typefood);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Typefood_Activity.this,"Position = "+position,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Typefood_Activity.this,Typefood_show.class);
                intent.putExtra("Message", list[position]);


                startActivity(intent);

            }
        });
    }

}
