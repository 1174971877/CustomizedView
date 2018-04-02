package com.example.chf.customizedview.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.chf.customizedview.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button goTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goTo = (Button) findViewById(R.id.goTo);
        goTo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.goTo:
                Intent intent1 = new Intent(this, Second.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}
