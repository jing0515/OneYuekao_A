package com.bawei.lvwenjing.pingdaoguanli;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;


public class ScaleActivity extends Activity {

    private ImageView imageView;
    float  last = -1 ;
    float current = 0 ;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);





    }


}
