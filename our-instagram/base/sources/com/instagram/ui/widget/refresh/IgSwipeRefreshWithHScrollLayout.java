package com.instagram.ui.widget.refresh;

import X.AbstractC43594JPz;
import X.C0f9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes11.dex */
public class IgSwipeRefreshWithHScrollLayout extends IgSwipeRefreshLayout {
    public float A00;
    public float A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public final int A05;

    public IgSwipeRefreshWithHScrollLayout(Context context) {
        this(context, null);
    }

    private void A00(MotionEvent motionEvent) {
        if (!this.A03 && !this.A02) {
            float rawX = this.A00 - motionEvent.getRawX();
            float rawY = this.A01 - motionEvent.getRawY();
            double A00 = AbstractC43594JPz.A00(rawX, rawY);
            double A01 = AbstractC43594JPz.A01(rawY, rawX);
            if (A00 > this.A05) {
                if (A01 < this.A04) {
                    this.A02 = true;
                } else {
                    this.A03 = true;
                }
            }
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                A00(motionEvent);
                float abs = Math.abs(this.A00 - motionEvent.getX());
                float abs2 = Math.abs(this.A01 - motionEvent.getY());
                if (this.A02 || abs > abs2) {
                    return false;
                }
            }
        } else {
            this.A00 = motionEvent.getX();
            this.A01 = motionEvent.getY();
            this.A02 = false;
            this.A03 = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        int A05 = C0f9.A05(-138051306);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                A00(motionEvent);
                if (this.A02) {
                    ViewParent parent = getParent();
                    parent.getClass();
                    onTouchEvent = true;
                    parent.requestDisallowInterceptTouchEvent(true);
                    i = 1726160706;
                    C0f9.A0C(i, A05);
                    return onTouchEvent;
                }
            }
        } else {
            this.A00 = motionEvent.getX();
            this.A01 = motionEvent.getY();
            this.A02 = false;
            this.A03 = false;
        }
        onTouchEvent = super.onTouchEvent(motionEvent);
        i = 1181906629;
        C0f9.A0C(i, A05);
        return onTouchEvent;
    }

    public void setXDraggingAngleRange(int i) {
        this.A04 = i;
    }

    public IgSwipeRefreshWithHScrollLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = 85;
        this.A05 = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
