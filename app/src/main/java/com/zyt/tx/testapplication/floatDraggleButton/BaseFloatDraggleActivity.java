package com.zyt.tx.testapplication.floatDraggleButton;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zyt.tx.testapplication.R;
import com.zyt.tx.testapplication.floatDraggleButton.floatDraggetButton1.FloatVActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class BaseFloatDraggleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_float_draggle);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnOne})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnOne:
                startActivity(new Intent(this, FloatVActivity.class));
                break;
        }
    }
}
