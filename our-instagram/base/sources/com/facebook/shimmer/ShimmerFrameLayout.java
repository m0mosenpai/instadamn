package com.facebook.shimmer;

import X.AbstractC84763qQ;
import X.AbstractC84783qS;
import X.C0f9;
import X.C167847ee;
import X.C84743qO;
import X.C84773qR;
import X.C84793qT;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public boolean A00;
    public boolean A01;
    public final C84743qO A02;
    public final Paint A03;

    private void A00(Context context, AttributeSet attributeSet) {
        AbstractC84783qS c84773qR;
        setWillNotDraw(false);
        this.A02.setCallback(this);
        if (attributeSet == null) {
            A04(new C84773qR().A01());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC84763qQ.A00, 0, 0);
        try {
            if (obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) {
                c84773qR = new C167847ee();
            } else {
                c84773qR = new C84773qR();
            }
            c84773qR.A00(obtainStyledAttributes);
            A04(c84773qR.A01());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void A03() {
        this.A01 = false;
        C84743qO c84743qO = this.A02;
        ValueAnimator valueAnimator = c84743qO.A01;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            c84743qO.A01.cancel();
        }
    }

    public void A06(boolean z) {
        this.A00 = true;
        A02();
        invalidate();
    }

    public final void A04(C84793qT c84793qT) {
        int i;
        Paint paint;
        this.A02.A03(c84793qT);
        if (c84793qT != null && c84793qT.A0I) {
            i = 2;
            paint = this.A03;
        } else {
            i = 0;
            paint = null;
        }
        setLayerType(i, paint);
    }

    public C84793qT getShimmer() {
        return this.A02.A02;
    }

    public void setStaticAnimationProgress(float f) {
        C84743qO c84743qO = this.A02;
        float f2 = c84743qO.A00;
        if (Float.compare(f, f2) != 0) {
            if (f < 0.0f && f2 < 0.0f) {
                return;
            }
            c84743qO.A00 = Math.min(f, 1.0f);
            c84743qO.invalidateSelf();
        }
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A03 = new Paint();
        this.A02 = new C84743qO();
        this.A00 = true;
        this.A01 = false;
        A00(context, attributeSet);
    }

    public final void A02() {
        if (isAttachedToWindow()) {
            this.A02.A02();
        }
    }

    public void A05() {
        A03();
        this.A00 = false;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.A00) {
            this.A02.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1571718851);
        super.onAttachedToWindow();
        if (this.A00) {
            this.A02.A01();
        }
        C0f9.A0D(542711130, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1986135573);
        super.onDetachedFromWindow();
        A03();
        C0f9.A0D(1362900648, A06);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A02.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        C84743qO c84743qO = this.A02;
        if (c84743qO != null) {
            if (i != 0) {
                ValueAnimator valueAnimator = c84743qO.A01;
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    A03();
                    z = true;
                } else {
                    return;
                }
            } else {
                if (!this.A01) {
                    return;
                }
                c84743qO.A01();
                z = false;
            }
            this.A01 = z;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.A02) {
            return false;
        }
        return true;
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = new Paint();
        this.A02 = new C84743qO();
        this.A00 = true;
        this.A01 = false;
        A00(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = new Paint();
        this.A02 = new C84743qO();
        this.A00 = true;
        this.A01 = false;
        A00(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context) {
        super(context);
        this.A03 = new Paint();
        this.A02 = new C84743qO();
        this.A00 = true;
        this.A01 = false;
        A00(context, null);
    }
}
