package com.example.tuikai.gamedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button button1 ,button2;
    LinearLayout layout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.line_layout);
        button1 =(Button)findViewById(R.id.button1);
        button2 =(Button)findViewById(R.id.button2);
        layout =(LinearLayout)findViewById(R.id.layout);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //横向

              layout.setOrientation(LinearLayout.HORIZONTAL);


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //纵向

                layout.setOrientation(LinearLayout.VERTICAL);

            }
        });
    }


}
