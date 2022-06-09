package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    String data = "";
    TextView txt_ans;
    Button btn_equal, btnsub, btnmulti, btnsum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_ans = findViewById(R.id.txt_ans);
        Button btn9 = findViewById(R.id.btn_9);
        Button btn8 = findViewById(R.id.btn_8);
        Button btn7 = findViewById(R.id.btn_7);
        Button btn6 = findViewById(R.id.btn_6);
        Button btn5 = findViewById(R.id.btn_5);
        Button btn4 = findViewById(R.id.btn_4);
        Button btn3 = findViewById(R.id.btn_3);
        Button btn2 = findViewById(R.id.btn_2);
        Button btn1 = findViewById(R.id.btn_1);
        Button btn0 = findViewById(R.id.btn_0);
        Button btn00 = findViewById(R.id.btn_00);
        btnsum = findViewById(R.id.btn_sum);
        btnsub = findViewById(R.id.btn_sub);
        btnmulti = findViewById(R.id.btn_multi);
        btn_equal = findViewById(R.id.btn_eq);
        Button ac = findViewById(R.id.btn_ac);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = txt_ans.getText().toString();
                txt_ans.setText(data + "9");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = txt_ans.getText().toString();
                txt_ans.setText(data + "8");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = txt_ans.getText().toString();
                txt_ans.setText(data + "7");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = txt_ans.getText().toString();
                txt_ans.setText(data + "6");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = txt_ans.getText().toString();
                txt_ans.setText(data + "5");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = txt_ans.getText().toString();
                txt_ans.setText(data + "4");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = txt_ans.getText().toString();
                txt_ans.setText(data + "3");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = txt_ans.getText().toString();
                txt_ans.setText(data + "2");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = txt_ans.getText().toString();
                txt_ans.setText(data + "1");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = txt_ans.getText().toString();
                txt_ans.setText(data + "0");
            }
        });
        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = txt_ans.getText().toString();
                txt_ans.setText(data + "00");
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = txt_ans.getText().toString();
                txt_ans.setText(data + "-");
            }
        });
        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = txt_ans.getText().toString();
                txt_ans.setText(data + "+");
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_ans.setText("");
            }
        });


        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = txt_ans.getText().toString();
                txt_ans.setText(data + "*");
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = txt_ans.getText().toString();
                calculate();
            }
        });

    }

    void calculate() {
        int i, ps = 0, j;
        String temp = "", temp1 = "";
        for (i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '+' || data.charAt(i) == '-' || data.charAt(i) == '*') {
                ps = i;
                System.out.println(temp);
                break;
            } else {
                temp = temp + data.charAt(i);
            }
        }

        for (j = ps + 1; j < data.length(); j++) {
            temp1 = temp1 + data.charAt(j);
        }
        System.out.println(temp1);
        result(temp, temp1, data.charAt(ps));
    }

    void result(String t1, String t2, char sy) {
        int a = Integer.parseInt(t1);
        int b = Integer.parseInt(t2);

        System.out.println(a + b);
        switch (sy) {
            case '+':
                txt_ans.setText("" + (a + b));
                Toast.makeText(MainActivity.this, "Answer is " + (a + b), Toast.LENGTH_SHORT).show();
                break;
            case '-':
                txt_ans.setText("" + (a - b));
                Toast.makeText(MainActivity.this, "Answer is " + (a - b), Toast.LENGTH_SHORT).show();
                break;
            case '*':
                txt_ans.setText("" + (a * b));
                Toast.makeText(MainActivity.this, "Answer is " + (a * b), Toast.LENGTH_SHORT).show();
                break;

        }


    }
}
