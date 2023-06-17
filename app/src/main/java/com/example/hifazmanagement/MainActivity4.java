package com.example.hifazmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {

    EditText surat , start , end , sabki, manzil;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        surat = findViewById(R.id.editTextText4);
        start = findViewById(R.id.editTextText5);
        end = findViewById(R.id.editTextText6);
        sabki = findViewById(R.id.editTextText7);
        manzil = findViewById(R.id.editTextText8);

        button = findViewById(R.id.button6);


    }
}