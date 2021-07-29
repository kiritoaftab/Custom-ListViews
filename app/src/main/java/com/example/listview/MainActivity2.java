package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {
ListView listView;
String Harr[]={"Narayana","Appolo","Sakra","Aster"};
String Hdisc[]={"Specialise in eye","specialise in heart","Specialise in cancer","SPecialise in Neurology"};
    String Hphno[]={"9431935255","8349185669","1234","45678","9087"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView=(ListView)findViewById(R.id.hlistview);
        AftabAdapter ad =new AftabAdapter(this,R.layout.aftablayout,Harr,Hdisc,Hphno);
        listView.setAdapter(ad);

    }
}