package com.example.shualeduritesti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public  void LaunchSecondActivity(View view){
        Intent SecondActivityIntent = new Intent(this, SecondActivity.class);
        startActivity(SecondActivityIntent);
    }






        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}