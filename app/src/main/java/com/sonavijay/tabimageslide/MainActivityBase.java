package com.sonavijay.tabimageslide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by vijayson on 1/21/2016.
 */
public class MainActivityBase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_layout);
        Button btn1 = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBase.this, MainActivity.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivityBase.this, TabActivity.class);
                startActivity(i);
            }
        });


    }
}
