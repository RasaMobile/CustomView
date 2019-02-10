package com.rasa.customView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

/**
 * Created by Mehdi on 4/11/2017 AD.
 */

public class CustomTextViewLight extends androidx.appcompat.widget.AppCompatTextView {
    public CustomTextViewLight(Context context) {
        super(context);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "fonts/Font-Light.ttf");
        this.setTypeface(face);
    }

    public CustomTextViewLight(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "fonts/Font-Light.ttf");
        this.setTypeface(face);
    }

    public CustomTextViewLight(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Typeface face = Typeface.createFromAsset(context.getAssets(), "fonts/Font-Light.ttf");
        this.setTypeface(face);
    }
}