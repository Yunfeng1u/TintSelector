package com.luyunfeng.tintselector;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringDef;
import android.support.v4.graphics.drawable.DrawableCompat;

/**
 * Created by luyunfeng on 2017/1/8.
 */

public class Util {

    public static Drawable getCheckTintSelector(Context context, String function, @ColorRes int color) {

        int defaultId = context.getResources().getIdentifier(function, "drawable", BuildConfig.APPLICATION_ID);

        if (defaultId == 0) {
            defaultId = R.drawable.ic_launcher;
        }

        return getCheckTintSelector(context, defaultId, color);
    }

    public static Drawable getCheckTintSelector(Context context, @DrawableRes int drawableId, @ColorRes int color) {

        Resources resources = context.getResources();

        Drawable drawable = resources.getDrawable(drawableId);

        ColorStateList colorList = resources.getColorStateList(
                color
        );

        return tintDrawable(drawable, colorList);
    }

    private static Drawable tintDrawable(Drawable drawable, ColorStateList colors) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            drawable.setTintList(colors);
            return drawable;
        }else{
            final Drawable wrappedDrawable = DrawableCompat.wrap(drawable);
            DrawableCompat.setTintList(wrappedDrawable, colors);
            return wrappedDrawable;
        }
    }
}
