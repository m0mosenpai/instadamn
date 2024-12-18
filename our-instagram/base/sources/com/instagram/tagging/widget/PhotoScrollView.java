package com.instagram.tagging.widget;

import X.C0f9;
import X.RunnableC71379Wso;
import X.X8E;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* loaded from: classes11.dex */
public class PhotoScrollView extends ScrollView {
    public float A00;
    public X8E A01;

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setScrollTarget(float f) {
        this.A00 = f;
        A00(this, f);
    }

    public PhotoScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
    }

    public static void A00(PhotoScrollView photoScrollView, float f) {
        if (photoScrollView.getChildCount() != 0) {
            photoScrollView.smoothScrollTo(0, (int) (((photoScrollView.getChildAt(r0 - 1).getBottom() + photoScrollView.getPaddingBottom()) * f) - (photoScrollView.getHeight() / 2)));
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(674608206);
        super.onSizeChanged(i, i2, i3, i4);
        postDelayed(new RunnableC71379Wso(this), 500L);
        C0f9.A0D(1217616503, A06);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0f9.A0C(1512504232, C0f9.A05(-1070831124));
        return false;
    }

    public void setOnMeasureListener(X8E x8e) {
        this.A01 = x8e;
    }

    public PhotoScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
    }

    public PhotoScrollView(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
    }
}
