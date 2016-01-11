package com.pwk.app.myapplication;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CustomListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        final SwipeRefreshLayout SRL = (SwipeRefreshLayout)findViewById(R.id.srl);

        ListView LV = (ListView)findViewById(R.id.listView);

        String[] Title = {"TItle A", "TItle B", "TItle C", "TItle D"};
        String[] Date = {"1.1", "1.2", "1.3", "1.4"};

        CustomListAdapter Adapter = new CustomListAdapter(CustomListActivity.this, Title, Date);
        LV.setAdapter(Adapter);


        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        SRL.setOnRefreshListener(new SwipeRefreshClass(CustomListActivity.this, SRL));
    }
}
