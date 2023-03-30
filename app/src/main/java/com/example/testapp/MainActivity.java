package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
    }

    public void saveShow(View v){
        String text = ((EditText)findViewById(R.id.input)).getText().toString();
        ((TextView)findViewById(R.id.textfluid)).setText(text);

    }

    public void goAbout(View a){
        Intent i = new Intent(this, aboutActivity.class);
        String text = ((EditText)findViewById(R.id.input)).getText().toString();
        i.putExtra("1",text);
        startActivity(i);
    }
}