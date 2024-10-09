package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView result1, result2;
    Integer num1, num2, answer;
    String sign, val_1, val_2;
    boolean has_Dot;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result1 = (TextView) findViewById(R.id.result1);
        result2 = (TextView) findViewById(R.id.result2);
        has_Dot = false;

    }

    @SuppressLint("SetTextI18n")
    public void b0(View view) {
        result1.setText(result1.getText() + "0");
    }
    @SuppressLint("SetTextI18n")
    public void b1(View view) {
        result1.setText(result1.getText() + "1");
    }

    @SuppressLint("SetTextI18n")
    public void b2(View view) {
        result1.setText(result1.getText() + "2");
    }

    @SuppressLint("SetTextI18n")
    public void b3(View view) {
        result1.setText(result1.getText() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void b4(View view) {
        result1.setText(result1.getText() + "4");
    }

    @SuppressLint("SetTextI18n")
    public void b5(View view) {
        result1.setText(result1.getText() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void b6(View view) {
        result1.setText(result1.getText() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void b7(View view) {
        result1.setText(result1.getText() + "7");
    }

    @SuppressLint("SetTextI18n")
    public void b8(View view) {
        result1.setText(result1.getText() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void b9(View view) {
        result1.setText(result1.getText() + "9");
    }
    @SuppressLint("SetTextI18n")
    public void b00(View view) {
        result1.setText(result1.getText() + "00");
    }
    @SuppressLint("SetTextI18n")
    public void bdot(View view) {
        result1.setText(result1.getText() + ".");
    }



    public void badd(View view) {
        sign = "+";
        val_1 = result1.getText().toString();
        result1.setText(null);
        result2.setText("+");
        has_Dot = false;
    }

    public void bdel(View view) {
        sign = "-";
        val_1 = result1.getText().toString();
        result1.setText(null);
        result2.setText("-");
        has_Dot = false;
    }

    public void bmul(View view) {
        sign = "*";
        val_1 = result1.getText().toString();
        result1.setText(null);
        result2.setText("×");
        has_Dot = false;
    }

    public void bdiv(View view) {
        sign = "/";
        val_1 = result1.getText().toString();
        result1.setText(null);
        result2.setText("÷");
        has_Dot = false;
    }
    public void bmod(View view)
    {
        sign = "%";
        val_1 = result1.getText().toString();
        result1.setText(null);
        result2.setText("%");
        has_Dot = false;

    }




    public void bequals(View view) {
        if (sign == null) {
            result2.setText("Error!");
        } else if (result1.getText().equals("")) {
            result2.setText("Error!");
        } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && val_1.equals("")) {
            result2.setText("Error!");
        }


        else {
            switch (sign) {
                default:
                    break;

                case "+":
                    val_2 = result1.getText().toString();
                    num1 = Integer.parseInt(val_1);
                    num2 = Integer.parseInt(val_2);
                    answer = num1 + num2;
                    result1.setText(answer + "");
                    sign = null;
                    result2.setText(null);
                    break;
                case "-":
                    val_2 = result1.getText().toString();
                    num1 = Integer.parseInt(val_1);
                    num2 = Integer.parseInt(val_2);
                    answer = num1 - num2;
                    result1.setText(answer + "");
                    sign = null;
                    result2.setText(null);
                    break;
                case "*":
                    val_2 = result1.getText().toString();
                    num1 = Integer.parseInt(val_1);
                    num2 = Integer.parseInt(val_2);
                    answer = num1 * num2;
                    result1.setText(answer + "");
                    sign = null;
                    result2.setText(null);
                    break;
                case "/":
                    val_2 = result1.getText().toString();
                    num1 = Integer.parseInt(val_1);
                    num2 = Integer.parseInt(val_2);
                    answer = num1 / num2;
                    result1.setText(answer + "");
                    sign = null;
                    result2.setText(null);
                    break;
                case "%":
                    val_2 = result1.getText().toString();
                    num1 = Integer.parseInt(val_1);
                    num2 = Integer.parseInt(val_2);
                    answer = num1 % num2;
                    result1.setText(answer + "");
                    sign = null;
                    result2.setText(null);
                    break;
            }

        }
    }


    public void bc(View view) {
        if (result1.getText().equals("")) {
            result1.setText(null);
        } else {
            int len = result1.getText().length();
            String s = result1.getText().toString();
            if (s.charAt(len - 1) == '.') {
                has_Dot = false;
                result1.setText(result1.getText().subSequence(0, result1.getText().length() - 1));

            } else {
                result1.setText(result1.getText().subSequence(0, result1.getText().length() - 1));
            }
        }
    }

    public void bac(View view) {

        result1.setText(null);
        result2.setText(null);
        val_1 = null;
        val_2 = null;
        sign = null;
        has_Dot = false;
    }
}
