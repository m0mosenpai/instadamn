package com.facebook.smartcapture.ui;

import X.AbstractC55872hT;
import X.AbstractC55922hc;
import X.C14360o3;
import X.C55862hS;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes11.dex */
public final class SCImageView extends ImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SCImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A00(context, attributeSet, i);
    }

    private final void A00(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A24, i, 0);
            C14360o3.A07(obtainStyledAttributes);
            try {
                setImageResource(obtainStyledAttributes.getResourceId(0, 0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (i != 0) {
            try {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                C55862hS c55862hS = new C55862hS();
                ((AbstractC55872hT) c55862hS).A00 = resources.getDrawable(i, theme);
                setImageDrawable(c55862hS);
            } catch (Exception unused) {
                super.setImageResource(i);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SCImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        A00(context, attributeSet, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SCImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A00(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SCImageView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }
}
