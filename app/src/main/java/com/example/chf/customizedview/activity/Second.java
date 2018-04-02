package com.example.chf.customizedview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.chf.customizedview.R;
import com.example.chf.customizedview.customizedView.myTitleBar;

public class Second extends AppCompatActivity implements View.OnClickListener{
    private myTitleBar bar;
    private ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        bar = (myTitleBar) findViewById(R.id.titleBar);
        back = bar.getBack();
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.back:
                onBackPressed();
                break;
            default:
                break;
        }
    }
}
