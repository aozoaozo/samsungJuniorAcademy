package com.example.samsungsoftjunior;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    double result = 0;
    TextView textViewResult;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonPlus;
    Button buttonClear;
    Button buttonEqual;
    Button buttonMin;
    Button buttonX;
    Button buttonNanu;

    int First;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        textViewResult = findViewById(R.id.calculate_result_textView);

        button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = textViewResult.getText();
                // 1.기존 텍스트뷰 값을 값을 얻어옴

                Integer value = Integer.valueOf((String) text);
                // 2. 가져온 값을 숫자로 바꿈.

                value = value * 10;
                // 3. 기존 자릿수 * 10

                value = value + 1;
                // 4. 더하기 1

                textViewResult.setText(value.toString());
                // 5. 텍스트형태로 변경하여 화면에 표시
            }
        });

        button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = textViewResult.getText();
                Integer value = Integer.valueOf((String) text);
                value = value * 10;
                value = value + 2;
                textViewResult.setText(value.toString());
            }
        });

        button3= findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = textViewResult.getText();
                Integer value = Integer.valueOf((String) text);
                value = value * 10;
                value = value + 3;
                textViewResult.setText(value.toString());
            }
        });

        button4 = findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = textViewResult.getText();
                Integer value = Integer.valueOf((String) text);
                value = value * 10;
                value = value + 4;
                textViewResult.setText(value.toString());
            }
        });

        button5 = findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = textViewResult.getText();
                Integer value = Integer.valueOf((String) text);
                value = value * 10;
                value = value + 5;
                textViewResult.setText(value.toString());
            }
        });

        button6 = findViewById(R.id.button_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = textViewResult.getText();
                Integer value = Integer.valueOf((String) text);
                value = value * 10;
                value = value + 6;
                textViewResult.setText(value.toString());
            }
        });

        button7 = findViewById(R.id.button_7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = textViewResult.getText();
                Integer value = Integer.valueOf((String) text);
                value = value * 10;
                value = value + 7;
                textViewResult.setText(value.toString());
            }
        });

        button8 = findViewById(R.id.button_8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = textViewResult.getText();
                Integer value = Integer.valueOf((String) text);
                value = value * 10;
                value = value + 8;
                textViewResult.setText(value.toString());
            }
        });

        button9 = findViewById(R.id.button_9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = textViewResult.getText();
                Integer value = Integer.valueOf((String) text);
                value = value * 10;
                value = value + 9;
                textViewResult.setText(value.toString());
            }
        });

        buttonPlus = findViewById(R.id.button_plus);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1. 기존 입력값을 First 에 저장.
                CharSequence text = textViewResult.getText();
                First = Integer.valueOf((String) text);

                //2. operator 에 + 를 저장
                operator = "+";

                //3. textView 의 값을 0으로 초기화
                textViewResult.setText("0");
            }
        });

        buttonClear = findViewById(R.id.button_clear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResult.setText("0");
            }
        });


        buttonEqual = findViewById(R.id.button_equel);
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1 textView 의 숫자를 가져옴
                CharSequence text = textViewResult.getText();
                Integer value = Integer.valueOf((String) text);

                // 2 First 와 operator 를 꺼내와서 연산
                int result = 0;
                if(operator == "+") {
                    result = First + value;
                } else if (operator == "-") {
                    result = First - value;
                } else if (operator == "*") {
                    result = First * value;
                } else if (operator == "/") {
                    result = First / value;
                }

                // 3 결과를 textView 에 표시
                textViewResult.setText(""+result);
            }
        });
        buttonMin = findViewById(R.id.button_min);
        buttonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1. 기존 입력값을 First 에 저장.
                CharSequence text = textViewResult.getText();
                First = Integer.valueOf((String) text);

                //2. operator 에 + 를 저장
                operator = "-";

                //3. textView 의 값을 0으로 초기화
                textViewResult.setText("0");
            }
        });
        buttonX = findViewById(R.id.button_x);
        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1. 기존 입력값을 First 에 저장.
                CharSequence text = textViewResult.getText();
                First = Integer.valueOf((String) text);

                //2. operator 에 + 를 저장
                operator = "*";

                //3. textView 의 값을 0으로 초기화
                textViewResult.setText("0");
            }
        });
        buttonNanu = findViewById(R.id.button_nanu);
        buttonNanu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1. 기존 입력값을 First 에 저장.
                CharSequence text = textViewResult.getText();
                First = Integer.valueOf((String) text);

                //2. operator 에 + 를 저장
                operator = "/";

                //3. textView 의 값을 0으로 초기화
                textViewResult.setText("0");
            }
        });

    }
}