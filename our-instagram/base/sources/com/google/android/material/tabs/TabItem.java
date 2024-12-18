package com.google.android.material.tabs;

import X.C53122bu;
import X.C65N;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes11.dex */
public class TabItem extends View {
    public final int A00;
    public final Drawable A01;
    public final CharSequence A02;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C53122bu c53122bu = new C53122bu(context, context.obtainStyledAttributes(attributeSet, C65N.A0Z));
        TypedArray typedArray = c53122bu.A02;
        this.A02 = typedArray.getText(2);
        this.A01 = c53122bu.A02(0);
        this.A00 = typedArray.getResourceId(1, 0);
        typedArray.recycle();
    }
}
