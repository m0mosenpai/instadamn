package com.instagram.ui.text;

import X.C0f9;
import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes11.dex */
public final class BadgeTextView extends TextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int A06 = C0f9.A06(-1559050703);
        super.onMeasure(i, i2);
        if (getMeasuredWidth() < getMeasuredHeight()) {
            int measuredHeight = (getMeasuredHeight() - getMeasuredWidth()) / 2;
            setPadding(getPaddingLeft() + measuredHeight, getPaddingTop(), getPaddingRight() + measuredHeight, getPaddingBottom());
            setMeasuredDimension(getMeasuredHeight(), getMeasuredHeight());
        }
        C0f9.A0D(-994216764, A06);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeTextView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }
}
