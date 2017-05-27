package com.bawei.lvwenjing.oneyuekao_a;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bawei.lvwenjing.pingdaoguanli.ChannelActivity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  startActivity(new Intent(MainActivity.this, ChannelActivity.class));
        startActivity(new Intent(MainActivity.this, ChannelActivity.class));
    }
}
