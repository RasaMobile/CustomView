package com.rasa.customView;


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

/**
 * Created by mehdi on 9/20/15 AD.
 */
public class IconButton extends AppCompatButton {


    public IconButton(Context context) {
        super(context);
    }

    public IconButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Font-Icon.ttf"));
    }

    public IconButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Font-Icon.ttf"));
    }
}