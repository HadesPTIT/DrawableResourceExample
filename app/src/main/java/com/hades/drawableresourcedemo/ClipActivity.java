package com.hades.drawableresourcedemo;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

/**
 * Created by Hades on 2/5/2017.
 */

public class ClipActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ClipDrawable drawable = (ClipDrawable) imageView.getBackground();
        //level:0-10000.
        drawable.setLevel(5000);

        ImageView clipRight = (ImageView) findViewById(R.id.rightClip);
        ClipDrawable clipRightDrawable = (ClipDrawable) clipRight.getBackground();
        //level:0-10000.
        clipRightDrawable.setLevel(5000);
    }
}
