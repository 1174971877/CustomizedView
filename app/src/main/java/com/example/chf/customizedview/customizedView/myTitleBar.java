package com.example.chf.customizedview.customizedView;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.chf.customizedview.R;

/**
 * Created by chf on 2018/4/2.
 */

public class myTitleBar extends LinearLayout{
    private ImageButton back;
    private TextView title;
    private String titleString;
    public myTitleBar(Context context, AttributeSet set) {
        super(context,set);
        initAttrs(context,set);
        View.inflate(context, R.layout.titlebar,this);
        back = findViewById(R.id.back);
        title = findViewById(R.id.title);
        init();
    }
    private void initAttrs(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.myTitleBar);
        titleString = typedArray.getString(R.styleable.myTitleBar_title_text);
    }
    private void init(){
        title.setText(titleString);
    }
    public ImageButton getBack(){
        return this.back;
    }
}
