package com.example.barna.cantarileevaghelieiacorduri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;

    String [] songs = {"1. Slava dati Domnului","2. Doamne mare Te slavim","3. Sfant esti sfant " +
            "esti", "4. O Doamne mare cand privesc"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list =(ListView) findViewById(R.id.list);
        ArrayAdapter  <String> adapter = new ArrayAdapter<String>(this,android.R.layout
                .simple_list_item_1,songs);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 1 :
                        Intent myintent = new Intent(view.getContext(), Song1.class);
                        startActivityForResult(myintent, 0);
                        break;
                    case 2 :
                        Intent myintent2 = new Intent(view.getContext(), Song2.class);
                        startActivityForResult(myintent2, 1);


                }


                
                if (position == 2) {
                    Intent myintent = new Intent(view.getContext(), Song3.class);
                    startActivityForResult(myintent, 2);
                }
                if (position == 3) {
                    Intent myintent = new Intent(view.getContext(), Song4.class);
                    startActivityForResult(myintent, 3);
                }


        }


    });
}
    }
