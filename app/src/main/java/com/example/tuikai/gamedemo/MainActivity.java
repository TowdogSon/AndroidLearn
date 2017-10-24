package com.example.tuikai.gamedemo;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {

   Button sureBt ;TextView resultText;String selectedMusic,selectedSound,selectedPlaneType;
   RadioGroup rg1,rg2,rg3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //关联控件

        sureBt=(Button)findViewById(R.id.sureBt);
        resultText=(TextView)findViewById(R.id.resultText);
        rg1=(RadioGroup)findViewById(R.id.musicRG);
        rg2=(RadioGroup)findViewById(R.id.soundRG);
        rg3=(RadioGroup)findViewById(R.id.planeRG);

        selectedMusic="开";
        selectedSound="开";
        selectedPlaneType="歼20";



        //确定按钮
        sureBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "音乐"+selectedMusic+"  音效"+selectedSound+"  战斗机"+selectedPlaneType;

                resultText.setText(result);

            }
        });

        //RadioButton 响应事件
        changeListener listen = new changeListener();
        rg1.setOnCheckedChangeListener(listen);
        rg2.setOnCheckedChangeListener(listen);
        rg3.setOnCheckedChangeListener(listen);

    }

    //新类
    class  changeListener implements RadioGroup.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

            switch (group.getId()){

                case R.id.musicRG:
                   if (checkedId == R.id.bgmusicOpen){
                       selectedMusic ="开";
                   }else{
                       selectedMusic ="关";

                   }

                    break;
                case  R.id.soundRG:

                    if (checkedId == R.id.soundOpen){
                        selectedSound ="开";
                    }else{
                        selectedSound ="关";

                    }

                    break;
                case  R.id.planeRG:

                    if(checkedId == R.id.planeType) {
                        selectedPlaneType = "歼20";
                    }else if(checkedId == R.id.planeType2){
                        selectedPlaneType = "歼30";

                    }else if(checkedId == R.id.planeType3){
                        selectedPlaneType = "歼40";

                    }
                    break;


            }



        }
    }

}
