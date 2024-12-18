package com.instagram.ui.widget.roundedcornerlayout;

import X.C74833Xx;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public class RoundedCornerConstraintLayout extends ConstraintLayout {
    public C74833Xx A00;

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.A00.A08(i)) {
            invalidate();
        }
    }

    public void setCornerRadius(int i) {
        if (this.A00.A05(i)) {
            invalidate();
        }
    }

    public void setStrokeColor(int i) {
        C74833Xx c74833Xx = this.A00;
        if (c74833Xx.A01 != i) {
            c74833Xx.A01 = i;
            c74833Xx.A03.setColor(i);
            invalidate();
        }
    }

    public void setStrokeWidth(int i) {
        if (this.A00.A06(i)) {
            invalidate();
        }
    }

    public RoundedCornerConstraintLayout(Context context) {
        super(context);
        this.A00 = C74833Xx.A00(getContext(), null);
        setLayerType(2, null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A00.A04(canvas);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A00.A03(getMeasuredWidth(), getMeasuredHeight());
    }

    public RoundedCornerConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = C74833Xx.A00(getContext(), attributeSet);
        setLayerType(2, null);
    }

    public RoundedCornerConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = C74833Xx.A00(getContext(), attributeSet);
        setLayerType(2, null);
    }
}
