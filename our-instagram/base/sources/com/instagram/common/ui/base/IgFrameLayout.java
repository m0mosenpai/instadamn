package com.instagram.common.ui.base;

import X.AbstractC55922hc;
import X.C14360o3;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class IgFrameLayout extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        A00(context, attributeSet);
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A19);
        C14360o3.A07(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A00(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A00(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgFrameLayout(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }
}
