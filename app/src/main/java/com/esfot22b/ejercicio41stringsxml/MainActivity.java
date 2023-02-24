package com.esfot22b.ejercicio41stringsxml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText val1, val2;
    RadioButton rb1, rb2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);
        rb1 = findViewById(R.id.radioButtonAdd);
        rb2 = findViewById(R.id.radioButtonSub);
        result = findViewById(R.id.result);
    }

    public void operar(View v) {
        int v1 = Integer.parseInt(val1.getText().toString());
        int v2 = Integer.parseInt(val2.getText().toString());
        if (rb1.isChecked()) {
            result.setText(String.valueOf(v1 + v2));
        } else if (rb2.isChecked()) {
            result.setText(String.valueOf(v1 - v2));
        }
    }
}