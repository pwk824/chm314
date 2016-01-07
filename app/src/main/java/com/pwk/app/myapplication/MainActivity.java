package com.pwk.app.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Btn;
        Btn = (Button)findViewById(R.id.btn);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();
                Log.d("PWK", "Btn Click");

                Intent i = new Intent(MainActivity.this, AnotherAvtivity.class);
                i.putExtra("msg","Sample Msg");
                i.putExtra("chk", true);
                startActivity(i);
            }
        });
    }
}
