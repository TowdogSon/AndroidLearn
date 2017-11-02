package com.example.tuikai.gamedemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by tuikai on 2017/11/1.
 */

public class GameView extends View {

    Bitmap bmpPlane = null;
    private   int planeX =150;
    private   int planeY =300;
    private   int bmpWidth;
    private   int bmpHeight;

    //生成get set
    public int getPlaneX() {
        return planeX;
    }

    public void setPlaneX(int planeX) {
        this.planeX = planeX;
    }

    public int getPlaneY() {
        return planeY;
    }

    public void setPlaneY(int planeY) {
        this.planeY = planeY;
    }

    //构造函数,必须实现
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        bmpPlane = BitmapFactory.decodeResource(getResources(),R.drawable.muye);
        bmpWidth =bmpPlane.getWidth();
        bmpHeight = bmpPlane.getHeight();
    }


    //view呈现时自动调用的方法
    @Override
    protected void onDraw(Canvas canvas) {

        canvas.drawBitmap(bmpPlane,planeX-bmpWidth/2,planeY-bmpHeight/2,null);
        super.onDraw(canvas);
    }




}
