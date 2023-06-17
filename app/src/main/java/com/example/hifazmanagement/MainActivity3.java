package com.example.hifazmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList = new ArrayList<>();

    DbHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listView =  findViewById(R.id.list1);

        db = new DbHelper(this);

        List<Student> list = db.selectAllStudents();

        ArrayAdapter<Student> arrayAdapter = new ArrayAdapter<Student>(this , android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);





    }
}