package com.pwk.app.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView LV = (ListView) findViewById(R.id.listview);

        String[] ar = {"AnotherActivity", "ScrollActivity", "ListActivity", "GridActivity"};

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ar);
        LV.setAdapter(adapter);

        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//              startActivity(new Intent(mContext, CustomListActivity.class));
                switch (position) {
                    case 0:
                        Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();
                        Log.d("PWK", "Btn Click");
                        Intent i = new Intent(MainActivity.this, AnotherAvtivity.class);
                        i.putExtra("msg", "Sample Msg");
                        i.putExtra("chk", true);
                        startActivity(i);
                        break;

                    case 1:
                        startActivity(new Intent(MainActivity.this, ScrollActivity.class));
                        break;

                    case 2:
                        startActivity(new Intent(MainActivity.this, ListViewActivity.class));
                        break;

                    case 3:
                        startActivity(new Intent(MainActivity.this, GridActivity.class));
                        break;

                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater MI = (MenuInflater)new MenuInflater(MainActivity.this);
        MI.inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.aaa:
                Toast.makeText(MainActivity.this,"Menu aaa clicked",Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }
}



//        Button Btn;
//        Btn = (Button)findViewById(R.id.btn);
//        Btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();
//                Log.d("PWK", "Btn Click");
//
//                Intent i = new Intent(MainActivity.this, AnotherAvtivity.class);
//                i.putExtra("msg","Sample Msg");
//                i.putExtra("chk", true);
//                startActivity(i);
//            }
//        });
//
//        Button ScrollBtn = (Button)findViewById(R.id.scrollbtn);
//        ScrollBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, ScrollActivity.class));
//            }
//        });
//
//        Button ListBtn = (Button)findViewById(R.id.listbtn);
//        ListBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, ListViewActivity.class));
//            }
//        });