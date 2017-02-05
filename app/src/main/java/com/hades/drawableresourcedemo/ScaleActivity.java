package com.hades.drawableresourcedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

/**
 * Created by Hades on 2/5/2017.
 */

public class ScaleActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        ImageView view30 = (ImageView) findViewById(R.id.image30);
        view30.setImageLevel(1);

        ImageView view50 = (ImageView) findViewById(R.id.image50);
        view50.setImageLevel(1);

        ImageView view80 = (ImageView) findViewById(R.id.image80);
        view80.setImageLevel(1);
    }

}
