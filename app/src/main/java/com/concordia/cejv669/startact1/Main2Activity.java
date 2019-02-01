package com.concordia.cejv669.startact1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

     Intent intent = getIntent();
     String message = intent.getStringExtra("Value1");
     int show_age = intent.getIntExtra("age",0);
        TextView tv = findViewById(R.id.secondActivity);
        tv.setText("Hello, " + message + "!\n Your favorite number is " + String.valueOf(show_age));

    }
}
