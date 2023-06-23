package com.example.hifazmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity5 extends AppCompatActivity {

    ListView list2;

    ArrayList<String> arrayList = new ArrayList<>();
    List<Student> records = new ArrayList<>();
    List<Records> rc = new ArrayList<>();

    DbHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        list2 = findViewById(R.id.list2);

        db = new DbHelper(this);
        records = db.selectAllStudents();
        rc = db.selectAllRecords();


        for (int i = 0; i < records.size(); i++) {

            arrayList.add(records.get(i).getName());

        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , arrayList);
        list2.setAdapter(arrayAdapter);


        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String f = arrayList.get(position);

                int f = 0;
                /*
                for (int j = 0; j < arrayList.size(); j++) {
                    if (arrayList.get(position).equals(records.get(position).getId()) ){
                        f = records.get(position).getId();
                    }

                }

                 */

                //f = 1;


                Intent intent = new Intent(MainActivity5.this , MainActivity7.class);
                //Toast.makeText(MainActivity.this, f, Toast.LENGTH_SHORT).show();
                /*intent.putExtra("id" , f);
                intent.putExtra("date" , rc.get(f).getDate());
                intent.putExtra("surah" , rc.get(f).getSurat() );
                intent.putExtra("start" , rc.get(f).getStart() );
                intent.putExtra("end" , rc.get(f).getEnd() );
                intent.putExtra("sabki" , rc.get(f).getSabki() );
                intent.putExtra("manzil" , rc.get(f).getManzil() );
                //intent.putExtra("ayatEnd" , (SSP[position + 1]  ) );

                 */
                startActivity(intent);
            }
        });


    }
}