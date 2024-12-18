package com.instagram.ui.widget.roundedcornerlayout;

import X.AbstractC43201yn;
import X.C74833Xx;
import X.InterfaceC74623Ww;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class RoundedCornerFrameLayout extends AbstractC43201yn implements InterfaceC74623Ww {
    public C74833Xx A00;

    public final void A01(float f, float f2, float f3, float f4) {
        if (this.A00.A07(f, f2, f3, f4)) {
            invalidate();
        }
    }

    public void setCornerBackgroundColor(int i) {
        if (this.A00.A08(i)) {
            invalidate();
            boolean z = false;
            if (this.A00.A00 == 0) {
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

    public RoundedCornerFrameLayout(Context context) {
        super(context);
        A00(null);
    }

    private void A00(AttributeSet attributeSet) {
        C74833Xx A00 = C74833Xx.A00(getContext(), attributeSet);
        this.A00 = A00;
        boolean z = false;
        if (A00.A00 == 0) {
            z = true;
        }
        int i = 0;
        if (z) {
            i = 2;
        }
        setLayerType(i, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A00.A04(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A00.A03(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, X.InterfaceC74623Ww
    public final void detachViewFromParent(View view) {
        super.detachViewFromParent(view);
    }

    @Override // android.view.ViewGroup, X.InterfaceC74623Ww
    public final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet);
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet);
    }
}
