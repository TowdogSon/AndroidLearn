package com.example.tuikai.gamedemo;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {

  GameView gameView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_view);

         gameView =(GameView)findViewById(R.id.gameView);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x =  event.getX();
        float y = event.getY();

        gameView.setPlaneX((int)x);
        gameView.setPlaneY((int)y);
        gameView.invalidate();//自动呈现方法
        return super.onTouchEvent(event);
    }
}
