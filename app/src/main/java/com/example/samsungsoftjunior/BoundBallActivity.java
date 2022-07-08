package com.example.samsungsoftjunior;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

public class BoundBallActivity extends AppCompatActivity {

    ImageView myImage;

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_bound_ball);


        initView();


        setTimer();
    }

    private void setTimer() {
        handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    myImage.setY(myImage.getY() + 10); // 1) 이미지뷰의 좌표를 현재의 좌표를 가져와서 +10 설정
                    handler.postDelayed(this,100); // 2) ms (천분의 1초) 100ms 후에 반복 : 0.1초
                }
            }, 0, 0); // 3)
    }

    private void initView() {
        myImage = findViewById(R.id.my_image);
    }
}