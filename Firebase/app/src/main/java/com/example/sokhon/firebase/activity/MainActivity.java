package com.example.sokhon.firebase.activity;

import android.support.annotation.Nullable;
import android.os.Bundle;

import com.example.sokhon.firebase.R;
import com.example.sokhon.firebase.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public String toolbarTitle() {
        return "HOME";
    }
}
