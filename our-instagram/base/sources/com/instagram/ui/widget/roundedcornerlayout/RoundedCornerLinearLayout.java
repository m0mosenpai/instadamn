package com.instagram.ui.widget.roundedcornerlayout;

import X.C74833Xx;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes3.dex */
public class RoundedCornerLinearLayout extends LinearLayout {
    public C74833Xx A00;

    public void setCornerBackgroundColor(int i) {
        C74833Xx c74833Xx = this.A00;
        if (c74833Xx.A08(i)) {
            invalidate();
            boolean z = false;
            if (c74833Xx.A00 == 0) {
                z = true;
            }
            int i2 = 0;
            if (z) {
                i2 = 2;
            }
            setLayerType(i2, null);
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

    public void setStrokeWidth(float f) {
        if (this.A00.A06(f)) {
            invalidate();
        }
    }

    public RoundedCornerLinearLayout(Context context) {
        super(context);
        this.A00 = C74833Xx.A00(getContext(), null);
        setLayerType(2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A00.A04(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A00.A03(getMeasuredWidth(), getMeasuredHeight());
    }

    public RoundedCornerLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = C74833Xx.A00(getContext(), attributeSet);
        setLayerType(2, null);
    }

    public RoundedCornerLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = C74833Xx.A00(getContext(), attributeSet);
        setLayerType(2, null);
    }
}
