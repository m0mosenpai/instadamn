package com.instagram.ui.animation.pushlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes11.dex */
public final class PushLinearLayout extends LinearLayout {
    public final float getXFraction() {
        int width = getWidth();
        float x = getX();
        if (width != 0) {
            return x / width;
        }
        return x;
    }

    public final void setXFraction(float f) {
        float f2;
        int width = getWidth();
        if (width > 0) {
            f2 = f * width;
        } else {
            f2 = -9999.0f;
        }
        setX(f2);
    }

    public PushLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PushLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public PushLinearLayout(Context context) {
        super(context, null);
    }
}
