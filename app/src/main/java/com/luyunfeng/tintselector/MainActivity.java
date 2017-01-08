package com.luyunfeng.tintselector;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Drawable drawable = Util.getCheckTintSelector(this, R.drawable.sort_distance_default, R.color.normal_color_selector);
        drawable.setBounds(0, 0, 50, 50);

        CheckBox cb_test = (CheckBox) findViewById(R.id.cb_test);
        cb_test.setCompoundDrawables(drawable, null, null, null);
    }
}
