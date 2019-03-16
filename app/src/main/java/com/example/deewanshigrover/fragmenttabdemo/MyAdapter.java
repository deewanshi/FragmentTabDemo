package com.example.deewanshigrover.fragmenttabdemo;

import android.app.Activity;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DEEWANSHI GROVER on 16-03-2019.
 */

public class MyAdapter extends BaseAdapter {

    Status obj;
    int res;
    ArrayList<Complaints> A1=new ArrayList<>();

    public MyAdapter(Status obj, int res, ArrayList<Complaints> A1)
    {
        this.obj=obj;
        this.res=res;
        this.A1=A1;
    }


    @Override
    public int getCount() {
        return A1.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view= LayoutInflater.from(obj).inflate(res,parent,false); // obj must be of status and status must be activity. however in our case status is a fragment.
        Complaints complaints=A1.get(position);
        TextView textView1=view.findViewById(R.id.tv1);
        Button button=view.findViewById(R.id.btn);
        textView1.setText(complaints.getString());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder builder = new AlertDialog.Builder(); // which activity to put

                // Set a title for alert dialog
                builder.setTitle("Status");

                // Ask the final question
                builder.setMessage("Complaint is with vendor"); //this would be updated as per database updation.

                // Set click listener for alert dialog buttons
                DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch(which){

                            case DialogInterface.BUTTON_NEGATIVE:
                                // User clicked the No button
                                break;
                        }
                    }
                };

                // Set the alert dialog no button click listener
                builder.setNegativeButton("OK",dialogClickListener);

                AlertDialog dialog = builder.create();
                // Display the alert dialog on interface
                dialog.show();
            }
        });
        return view;
    }
}
