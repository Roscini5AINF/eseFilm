package com.example.esefilm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class vistafilm extends AppCompatActivity {
    String Film[]={ "@string/f1", "@string/f2", "@string/f3"};
    ListView l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vistafilm);
        l1=(ListView) findViewById(R.id.l1);
        ArrayAdapter<String> adattatore= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Film);
        l1.setAdapter(adattatore);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                play(view,position);
            }
        });
    }
    public void play(View r, int p){
        Intent i=new Intent(getApplicationContext(), vistafilm.class);
        i.putExtra("titolo", p );
        startActivity(i);
    }
}