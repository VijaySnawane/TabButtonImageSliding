package com.sonavijay.tabimageslide;


import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SlideView extends LinearLayout{



    @Bind(R.id.header_view_sub_title)
    ImageView subTitle;


    public SlideView(Context context) {
        super(context);
    }

    public SlideView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SlideView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public SlideView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);
    }



    public void bindTo(int image) {
        subTitle.setBackgroundResource(image);
    }

}
