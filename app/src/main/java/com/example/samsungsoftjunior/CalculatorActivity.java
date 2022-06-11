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
    Button buttonPlus;
    Button buttonClear;

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
                textViewResult.setText("2");
            }
        });

        button3= findViewById(R.id.button_3);
        buttonPlus = findViewById(R.id.button_plus);

        buttonClear = findViewById(R.id.button_clear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResult.setText("0");
            }
        });
    }
}