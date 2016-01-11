package com.pwk.app.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class GridActivity extends AppCompatActivity {
    Context mContext = GridActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        GridView GV = (GridView)findViewById(R.id.gridview);

        Drawable[] ImgData = { mContext.getResources().getDrawable(R.drawable.ic_3d_rotation_24dp),
        mContext.getResources().getDrawable(R.drawable.ic_accessibility_24dp),
        mContext.getResources().getDrawable(R.drawable.ic_account_balance_wallet_24dp),
        mContext.getResources().getDrawable(R.drawable.ic_account_balance_24dp)};

        String[] Desc = {"A","B","C","D"};

        CustomGridAdapter Adapter = new CustomGridAdapter(mContext, ImgData, Desc);

        GV.setAdapter(Adapter);
    }
}
