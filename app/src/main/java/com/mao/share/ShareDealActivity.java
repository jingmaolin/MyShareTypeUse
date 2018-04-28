package com.mao.share;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Description ：应用接受的分享类型处理
 * Created by jingmaolin on 2018/4/28.
 */

public class ShareDealActivity extends AppCompatActivity {
    private static final String TAG = "ShareDealActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_deal);

        dealWith();
    }

    private void dealWith() {
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        Log.d(TAG+"maolin", "dealWith: "+intent.getType());
        Log.d(TAG+"maolin", "dealWith: "+intent.getClipData().toString());
        Log.d(TAG+"maolin", "dealWith: "+intent.getData());

        for (String key : bundle.keySet()) {
            Log.d(TAG+"maolin", "dealWith: " + "key=" + key + ";" + "value=" + bundle.getString(key));
        }
        Log.d(TAG+"maolin", "dealWith: "+"------------------------------------------------------------------------------");
    }
}
