package com.instagram.common.ui.widget.recyclerview;

import X.C14360o3;
import X.C3H7;
import X.C42362IpP;
import X.JFR;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class MainFeedRecyclerView extends RecyclerView {
    public double A00;
    public long A01;
    public C3H7 A02;
    public JFR A03;
    public double A04;
    public double A05;

    public MainFeedRecyclerView(Context context) {
        super(context, null);
        this.A00 = 1.0d;
        this.A04 = 1.0d;
        this.A05 = 1.0d;
        this.A01 = 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C3H7 c3h7 = this.A02;
        if (c3h7 != null && motionEvent.getAction() == 0) {
            c3h7.A01 = System.currentTimeMillis();
        }
        JFR jfr = this.A03;
        if (jfr != null) {
            ((C42362IpP) jfr).A00.A00("TOUCH");
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setDownwardFlingScale(double d) {
        if (d > 0.0d) {
            this.A04 = d;
        }
    }

    public void setUpwardFlingScale(double d) {
        if (d > 0.0d) {
            this.A05 = d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean A1E(int i, int i2) {
        double d;
        int i3;
        if (System.currentTimeMillis() < this.A01) {
            return true;
        }
        int i4 = (int) (i2 * this.A00);
        C3H7 c3h7 = this.A02;
        if (c3h7 != null) {
            int i5 = c3h7.A00;
            c3h7.A00 = i4;
            if (Math.abs(i4 * 2) >= Math.abs(i5) && Math.signum(i4) == Math.signum(i5) && System.currentTimeMillis() - c3h7.A01 <= 200) {
                MainFeedRecyclerView mainFeedRecyclerView = c3h7.A02;
                C14360o3.A0B(mainFeedRecyclerView, 0);
                OverScroller overScroller = mainFeedRecyclerView.mViewFlinger.A01;
                C14360o3.A06(overScroller);
                int currVelocity = (int) overScroller.getCurrVelocity();
                i3 = i4 - currVelocity;
                if (i4 > 0) {
                    i3 = currVelocity + i4;
                }
            } else {
                i3 = i4;
            }
            i4 = i3;
        }
        double d2 = i4;
        if (i4 < 0) {
            d = this.A05;
        } else {
            d = this.A04;
        }
        return super.A1E(i, (int) (d2 * d));
    }

    public void setCustomFlingVelocityFactor(double d) {
        this.A00 = d;
    }

    public void setOnTouchCallback(JFR jfr) {
        this.A03 = jfr;
    }

    public MainFeedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 1.0d;
        this.A04 = 1.0d;
        this.A05 = 1.0d;
        this.A01 = 0L;
    }

    public MainFeedRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 1.0d;
        this.A04 = 1.0d;
        this.A05 = 1.0d;
        this.A01 = 0L;
    }
}
