package com.pwk.app.myapplication;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.Toast;

/**
 * Created by pwk82_000 on 2016-01-11.
 */
public class SwipeRefreshClass implements SwipeRefreshLayout.OnRefreshListener{
    Context mContext;
    SwipeRefreshLayout mSRL;

    public SwipeRefreshClass(Context c, SwipeRefreshLayout srl){
        mContext = c;
        mSRL = srl;
    }

    @Override
    public void onRefresh() {
        Toast.makeText(mContext, "Refreshing...",Toast.LENGTH_LONG).show();
        mSRL.setRefreshing(false);

    }
}
