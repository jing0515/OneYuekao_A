package com.bawei.lvwenjing.pingdaoguanli;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;


/**
 * 事件
 * http://www.cnblogs.com/sunzn/archive/2013/05/10/3064129.html
 */
public class EventActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);


    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        System.out.println("EventActivity onTouchEvent ev = " + event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        System.out.println("EventActivity dispatchTouchEvent ev = " + ev);
        return super.dispatchTouchEvent(ev);
    }
}
