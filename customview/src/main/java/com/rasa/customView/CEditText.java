package com.rasa.customView;

/**
 * Created by mehdi on 1/19/16 AD.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;


public class CEditText extends AppCompatEditText {

    public CEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CEditText(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/Font-Light.ttf"));
        }
    }
}