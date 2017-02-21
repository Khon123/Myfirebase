package com.example.sokhon.firebase.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.sokhon.firebase.R;

/**
 * Created by Sokhon on 2/20/2017.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        super.setContentView(R.layout.activity_base);

        TextView title=(TextView)findViewById(R.id.title);
        TextView icon=(TextView)findViewById(R.id.icon);

        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        title.setText(toolbarTitle());
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        //((FrameLayout) findViewById(R.id.contentView)).addView(getLayoutInflater().inflate(layoutResID,null));
        ((FrameLayout)findViewById(R.id.contentView)).addView(getLayoutInflater().inflate(layoutResID,null));
    }

    public abstract String toolbarTitle();
}
