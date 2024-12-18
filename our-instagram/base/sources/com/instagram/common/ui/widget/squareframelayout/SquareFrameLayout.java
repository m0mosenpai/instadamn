package com.instagram.common.ui.widget.squareframelayout;

import X.AbstractC46674Kkr;
import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes8.dex */
public final class SquareFrameLayout extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquareFrameLayout(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int A00 = AbstractC46674Kkr.A00(i, i2);
        super.onMeasure(A00, A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquareFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquareFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }
}
