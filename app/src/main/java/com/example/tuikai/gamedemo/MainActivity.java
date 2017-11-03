package com.example.tuikai.gamedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3;
    LinearLayout layout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caculator_layout);
        button1 =(Button)findViewById(R.id.button30);
        button2 =(Button)findViewById(R.id.button31);
        button3 =(Button)findViewById(R.id.button32);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getVisibility() == View.VISIBLE) {
                    button3.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.VISIBLE);
                }else
                {
                    button3.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                }
            }
        });


    }


}
