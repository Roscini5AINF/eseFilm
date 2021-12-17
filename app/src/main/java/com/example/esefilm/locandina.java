package com.example.esefilm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class locandina extends AppCompatActivity {
    Intent i;
    ImageView i1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locandina);
        t1=(TextView)findViewById(R.id.textView);
        i= getIntent();
        i1=(ImageView) findViewById(R.id.imageView);
    }
}