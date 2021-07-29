package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String Jarr[]={"Amazon","Walmart","Families","call center","Radio"};
    String Jdesk[]={"Shippping company, needed customer realtions officer","Supermarket, needed announcements person","Shop, needed for xyz","delivery company, needed assistance incharge","needed voice actors"};
    String Jphno[]={"9431935255","8349185669","1234","45678","9087"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Default or pre-existing Adapter
          listView=(ListView)findViewById(R.id.listview);
//        ArrayAdapter ad= new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
//        listView.setAdapter(ad);
          AftabAdapter ad= new AftabAdapter(this,R.layout.aftablayout,Jarr,Jdesk,Jphno);
          listView.setAdapter(ad);


    }
}