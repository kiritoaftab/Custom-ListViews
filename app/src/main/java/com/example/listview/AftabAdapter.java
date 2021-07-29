package com.example.listview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AftabAdapter extends ArrayAdapter<String> {
    private  Context context;
    private String arr[];
    private String darr[];
    private String phno[];
    public AftabAdapter(@NonNull Context context, int resource, @NonNull String[] arr,@NonNull String[] darr,@NonNull String[] phno) {
        super(context, resource, arr);
        this.arr=arr;
        this.darr=darr;
        this.context=context;
        this.phno=phno;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.aftablayout,parent,false);
        TextView t=convertView.findViewById(R.id.textView);
        t.setText(arr[position]);
        TextView d=convertView.findViewById(R.id.disc);
        d.setText(darr[position]);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Calling : "+arr[position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phno[position]));
                context.startActivity(intent);
            }
        });
        return convertView;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }
}
