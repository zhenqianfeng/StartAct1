package com.concordia.cejv669.startact1;

import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.btn_goToScreen2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(i);
            }
        });

        Button b2 = findViewById(R.id.btn_url);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(i);
            }
        });

        Button b3 = findViewById(R.id.btn_show);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText t = findViewById(R.id.txt_name);
                EditText a = findViewById(R.id.txt_age);
                String text = t.getText().toString();
                Integer age = Integer.parseInt(a.getText().toString());
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                i.putExtra("Value1",text);
                i.putExtra("age",age);
                startActivity(i);
            }
        });
    }
}
