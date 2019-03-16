package com.example.deewanshigrover.fragmenttabdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Status extends Fragment {

    ListView listView;
    ArrayList<Complaints> arrayList=new ArrayList<>();
    MyAdapter obj=new MyAdapter(this,R.layout.mylist,arrayList);;

    public Status() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Complaints e1=new Complaints();
        Complaints e2=new Complaints();
        Complaints e3=new Complaints();

        View view= inflater.inflate(R.layout.fragment_status, container, false);
        listView=view.findViewById(R.id.list);
        e1.setString("Complaint 1:");
        e2.setString("Complaint 2:");
        e3.setString("Complaint 3:");
        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        listView.setAdapter(obj);
        return view;
    }

}

