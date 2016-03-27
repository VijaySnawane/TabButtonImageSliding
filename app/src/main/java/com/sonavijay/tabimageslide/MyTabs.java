package com.sonavijay.tabimageslide;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by vijayson on 1/21/2016.
 */
public class MyTabs extends LinearLayout {


    @Bind(R.id.tab1)
    Button tab1;

    @Bind(R.id.tab2)
    Button tab2;


    public MyTabs(Context context) {
        super(context);
    }

    public MyTabs(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTabs(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyTabs(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);
    }


    public void bindTo(String tab11, String tab22) {
        tab1.setText(tab11);
        tab2.setText(tab22);
    }

}