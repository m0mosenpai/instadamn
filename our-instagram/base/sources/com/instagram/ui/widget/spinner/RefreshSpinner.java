package com.instagram.ui.widget.spinner;

import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.C3DY;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.R;

/* loaded from: classes2.dex */
public class RefreshSpinner extends SpinnerImageView {
    public RefreshSpinner(Context context) {
        super(context);
        setImageResource(R.drawable.nav_spinner);
    }

    public void setDark(boolean z) {
        ColorFilter colorFilter;
        Drawable drawable = getDrawable();
        drawable.getClass();
        Drawable mutate = drawable.mutate();
        if (z) {
            colorFilter = C3DY.A00(AbstractC53242c7.A0F(getContext(), R.attr.glyphColorPrimary));
        } else {
            colorFilter = null;
        }
        mutate.setColorFilter(colorFilter);
    }

    public RefreshSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageResource(R.drawable.nav_spinner);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A1w);
            setDark(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
        }
    }

    public RefreshSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setImageResource(R.drawable.nav_spinner);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A1w);
            setDark(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
        }
    }
}
