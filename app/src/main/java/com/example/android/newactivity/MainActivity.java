package com.example.android.newactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.myListView);

        final ArrayList<String> friendsName = new ArrayList<>();
        friendsName.add("Mannu");
        friendsName.add("Suraj");
        friendsName.add("Shivansh");
        friendsName.add("Akash");
        friendsName.add("Avnish");
        friendsName.add("Goyal");
        friendsName.add("Divyanshu");
        friendsName.add("Arjun");
        friendsName.add("Mannu");
        friendsName.add("Suraj");
        friendsName.add("Shivansh");
        friendsName.add("Akash");
        friendsName.add("Avnish");
        friendsName.add("Goyal");
        friendsName.add("Divyanshu");
        friendsName.add("Arjun");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,friendsName);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);

                intent.putExtra("Name=",friendsName.get(i));
                startActivity(intent);
                //Toast.makeText(getApplicationContext(),friendsName.get(i),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
