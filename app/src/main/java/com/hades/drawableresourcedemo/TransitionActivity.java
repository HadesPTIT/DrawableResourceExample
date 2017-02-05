package com.hades.drawableresourcedemo;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Hades on 2/5/2017.
 */

public class TransitionActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);

        ImageView button = (ImageView) findViewById(R.id.imagebutton);
        Button btnReset = (Button) findViewById(R.id.btnReset);
        final TransitionDrawable drawable = (TransitionDrawable) button.getDrawable();
        drawable.startTransition(5000);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawable.resetTransition();
                drawable.startTransition(5000);
            }
        });
    }

}
