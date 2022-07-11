package com.example.samsungsoftjunior;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BoundBallActivity extends AppCompatActivity {

    ImageView myImage;
    Button myStartButton;

    Handler handler;

    int screenWidth;
    int screenHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bound_ball);

        initView();

        initValue();


    }

    private void initValue() {
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point(); display.getRealSize(size);
        screenWidth = size.x - 200; // 화면의 너비
        screenHeight = size.y - 800; // 화면의 높이
    }
int b = 0;
int a = 0;
    private void setTimer() {
        handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //myImage.setY(myImage.getY() + 10); // 1) 이미지뷰의 좌표를 현재의 좌표를 가져와서 +10 설정
                    // 위의 명령 대신 다음과 같은 작업이 필요.

                    // if 현재의 Y 좌표가 0보다 크고 화면 높이 보다 변화값을 증가
                    if(a == 1 && myImage.getY() < 0) {
                        a -= 1;
                    }else if(a == 1) {
                        myImage.setY(myImage.getY() - 10);

                    }else if(myImage.getY() >= screenHeight) {
                        a += 1;
                    }else if(a == 0) {
                        myImage.setY(myImage.getY() + 10);
                    }

                    if(b == 1 && myImage.getX() < 0) {
                        b -= 1;
                    }else if(b == 1) {
                        myImage.setX(myImage.getX() - 10);

                    }else if(myImage.getX() >= screenWidth) {
                        b += 1;
                    }else if(b == 0) {
                        myImage.setX(myImage.getX() + 10);
                    }

                    // else if 현재의 Y 좌표가 화면의 높이보다 크면 변화값을 감소

                    // 생각해볼 부분 : 어떻게 방향성을 유지 할것인가?

                    handler.postDelayed(this,10); // 2) ms (천분의 1초) 100ms 후에 반복 : 0.1초
                }
            }, 0, 0); // 3)
    }

    private void initView() {
        myImage = findViewById(R.id.my_image);
        myStartButton = findViewById(R.id.start_button);

        myStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTimer();
            }
        });

    }
}