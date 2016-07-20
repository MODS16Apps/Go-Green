package org.mods.goGreen.Constants;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/**
 * Created by sergioramirez on 7/15/16.
 */
public class Methods {
    public static void setBackground(int _color, Drawable _background){
        GradientDrawable gradientDrawable = (GradientDrawable)_background;
        gradientDrawable.setColor(_color);
    }
}