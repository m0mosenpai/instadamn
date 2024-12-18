package com.instagram.ui.viewpager;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC43594JPz;
import X.AbstractC44803JsT;
import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes8.dex */
public final class BakeOffViewPager extends AbstractC44803JsT {
    public float A00;
    public float A01;
    public float A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BakeOffViewPager(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A02 = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                if (!this.A04 && !this.A03) {
                    float rawX = this.A00 - motionEvent.getRawX();
                    float rawY = this.A01 - motionEvent.getRawY();
                    boolean A1O = AbstractC167007dF.A1O((AbstractC43594JPz.A00(rawX, rawY) > this.A02 ? 1 : (AbstractC43594JPz.A00(rawX, rawY) == this.A02 ? 0 : -1)));
                    double A01 = AbstractC43594JPz.A01(rawY, rawX);
                    if (A1O) {
                        if (A01 < 90.0d) {
                            this.A03 = true;
                        } else {
                            this.A04 = true;
                        }
                    }
                }
                if (this.A03) {
                    if (!this.A05) {
                        this.A05 = true;
                    }
                }
                return false;
            }
        } else {
            this.A03 = false;
            this.A04 = false;
            this.A00 = motionEvent.getRawX();
            this.A01 = motionEvent.getRawY();
            this.A05 = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BakeOffViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC167017dG.A1P(context, attributeSet);
        this.A02 = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
    }
}
