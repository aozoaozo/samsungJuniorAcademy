package com.example.samsungsoftjunior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button subActivityMoveBtn;

    private TextView myTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main); // 리소스에서 그려질 화면을 가져옵니다.

        subActivityMoveBtn = findViewById(R.id.btn); // id가 btn 라는 녀석을 찾아서 btn 라는 인스턴스에 할당했습니다.

        subActivityMoveBtn.setOnClickListener(new View.OnClickListener() { // btn 가 클릭이라는 이벤트를 처리 합니다.
            @Override
            public void onClick(View v) { // 이벤트가 발생 할시
                myTextview.setText("안녕하세요 저는 미래의 SW 개발자 입니다.");
            }
        });

        myTextview = findViewById(R.id.my_textview);
        // 1. id 가 my_textview 라는  녀석을 찾아서 "myTextView" 라는 인스턴스에 할당했습니다.







    }
}