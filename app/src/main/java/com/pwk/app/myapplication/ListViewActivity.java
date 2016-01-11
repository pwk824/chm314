package com.pwk.app.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    Context mContext = ListViewActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        final SwipeRefreshLayout SRL = (SwipeRefreshLayout)findViewById(R.id.srl);

        ListView LV = (ListView)findViewById(R.id.listView);

        String[] Data = {"A", "B", "C", "D"};

        ArrayAdapter<String> Adapter= new ArrayAdapter<String>(mContext,R.layout.row, R.id.txt, Data);
        LV.setAdapter(Adapter);

        Log.d("TAG", "LIST ITEM COUNT : " + Adapter.getCount());


        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//              startActivity(new Intent(mContext, CustomListActivity.class));
                switch (position) {
                    case 0:
                        startActivity(new Intent(mContext, CustomListActivity.class));
                        break;
                    default:
                }
            }
        });

        SRL.setOnRefreshListener(new SwipeRefreshClass(mContext, SRL));
    }
}
