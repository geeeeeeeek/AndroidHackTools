package com.geeeeeeeek.hacktools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Student> data = new ArrayList<>();
        data.add(new Student("http://p3.pstatp.com/origin/3a07000086e601d3f2a6", "hahhhh"));
        data.add(new Student("http://p3.pstatp.com/origin/3a07000086e601d3f2a6", "hahhhh"));
        data.add(new Student("http://p3.pstatp.com/origin/3a07000086e601d3f2a6", "hahhhh"));
        data.add(new Student("http://p3.pstatp.com/origin/3a07000086e601d3f2a6", "hahhhh"));
        data.add(new Student("http://p3.pstatp.com/origin/3a07000086e601d3f2a6", "hahhhh"));

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        mRecyclerView.setAdapter(new RvAdapter(this,data));
    }

}
