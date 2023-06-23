package com.example.hifazmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class MainActivity7 extends AppCompatActivity {

    TextView textDate, textId, textSurah , textStart, textEnd , textSabki , textManzil;

    DbHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        textDate = findViewById(R.id.textView6);
        textId = findViewById(R.id.textView7);
        textSurah = findViewById(R.id.textView11);
        textStart = findViewById(R.id.textView12);
        textEnd = findViewById(R.id.textView13);
        textSabki = findViewById(R.id.textView14);
        textManzil = findViewById(R.id.textView15);

        db = new DbHelper(this);

        Calendar calendar;
        SimpleDateFormat dateFormat;
        String date;


        calendar = Calendar.getInstance();

        dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        date = dateFormat.format(calendar.getTime());

        Intent intent = new Intent();
       /* int id = intent.getIntExtra("id" ,0);
        String date = intent.getStringExtra("date");
        int surah = intent.getIntExtra("surah" ,0);
        int start = intent.getIntExtra("start" ,0);
        int end = intent.getIntExtra("end" ,0);
        int sabki = intent.getIntExtra("sabki" ,0);
        int manzil = intent.getIntExtra("manzil" ,0);

        */


        textDate.setText(date);
        textId.setText("Id: 2");
        textSurah.setText("Surah no.:  12");
        textStart.setText("Start:  15");
        textEnd.setText("End:  20");
        textManzil.setText("Manzil:  5");
        textSabki.setText("Sabki:  4");

    }
}