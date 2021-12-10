package com.example.esefilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String Film[]={ "Spiderman", "Batman", "Titanic"};
    ListView l1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=(ListView) findViewById(R.id.l1);
        ArrayAdapter<String> adattatore= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Film);
        l1.setAdapter(adattatore);
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Vuoi uscire", Toast.LENGTH_LONG).show();
            }
        });

    }
}