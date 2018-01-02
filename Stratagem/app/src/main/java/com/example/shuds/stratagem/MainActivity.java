package com.example.shuds.stratagem;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

/** Note that here we are inheriting ListActivity class instead of Activity class **/
public class MainActivity extends AppCompatActivity {

    Button addClientButton;

    ListView clientListView;

    ArrayList<String> clients;

    ArrayAdapter<String> adapter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(android.R.layout.activity_main);

        addClientButton = (Button)findViewById(R.id.addClientButton);

        clientListView = (ListView)findViewById(R.id.clientListView);

        clients = new_ArrayList<String>(MainActivity.this, android.R.layout.simple_expandable_list_item_1, clientListView);

        clientListView.setAdapter(adapter);

    }

    public void addClientButtonClick() {

        addClientButton.setOnClickListener(new View.OnClickListener(){

            @Override

            public void addClientButtonClick(View view) {



            }

        });

    }

}


