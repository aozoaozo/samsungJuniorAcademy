package com.example.samsungsoftjunior;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.samsungsoftjunior.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

;    boolean isFirstInput = true;
     double resultNumber = 0;
     String operator = "+";
     ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
    }
    public void operatorClick (View view){
        double inputNumber = Double.parseDouble(activityMainBinding.resultText.getText().toString());

        if(operator.equals("+")){
            resultNumber = resultNumber + inputNumber;
        }else if(operator.equals("-")){
            resultNumber = resultNumber - inputNumber;
        }else if(operator.equals("X")){
            resultNumber = resultNumber * inputNumber;
        }else if(operator.equals("%")){
            resultNumber = resultNumber / inputNumber;
        }
        activityMainBinding.resultText.setText(String.valueOf(resultNumber));
        isFirstInput = true;
        operator = view.getTag().toString();

    }
    public void num1click (View view){
        if(isFirstInput) {
            activityMainBinding.resultText.setText("1");
            isFirstInput = false;
        }else {
            activityMainBinding.resultText.append("1");
        }
    }
    public void num2click (View view){
        if(isFirstInput) {
            activityMainBinding.resultText.setText("2");
            isFirstInput = false;
        }else {
            activityMainBinding.resultText.append("2");
        }
    }
    public void num3click (View view){
        if(isFirstInput) {
            activityMainBinding.resultText.setText("3");
            isFirstInput = false;
        }else {
            activityMainBinding.resultText.append("3");
        }
    }
    public void num4click (View view){
        if(isFirstInput) {
            activityMainBinding.resultText.setText("4");
            isFirstInput = false;
        }else {
            activityMainBinding.resultText.append("4");
        }
    }
    public void num5click (View view){
        if(isFirstInput) {
            activityMainBinding.resultText.setText("5");
            isFirstInput = false;
        }else {
            activityMainBinding.resultText.append("5");
        }
    }
    public void num6click (View view){
        if(isFirstInput) {
            activityMainBinding.resultText.setText("6");
            isFirstInput = false;
        }else {
            activityMainBinding.resultText.append("6");
        }
    }
    public void num7click (View view){
        if(isFirstInput) {
            activityMainBinding.resultText.setText("7");
            isFirstInput = false;
        }else {
            activityMainBinding.resultText.append("7");
        }
    }
    public void num8click (View view){
        if(isFirstInput) {
            activityMainBinding.resultText.setText("8");
            isFirstInput = false;
        }else {
            activityMainBinding.resultText.append("8");
        }
    }
    public void num9click (View view){
        if(isFirstInput) {
            activityMainBinding.resultText.setText("9");
            isFirstInput = false;
        }else {
            activityMainBinding.resultText.append("9");
        }
    }
    public void num0click (View view){
        if(isFirstInput) {
            activityMainBinding.resultText.setText("0");
            isFirstInput = false;
        }else {
            activityMainBinding.resultText.append("0");
        }
    }
    public void numclearclick (View view){
        activityMainBinding.resultText.setText("0");
        isFirstInput = true;
        }
    //public void numballclick (View view){
    //    Button button = findViewById(view.getId());
    //    String getButtonText = button.getText().toString();
    //    if(isFirstInput){
    //        activityMainBinding.resultText.setText(getButtonText);
    //        isFirstInput = false;
    //    }else {
    //        activityMainBinding.resultText.append(getButtonText);
    //    }
//
}