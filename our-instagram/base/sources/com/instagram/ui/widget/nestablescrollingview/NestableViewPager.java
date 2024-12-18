package com.instagram.ui.widget.nestablescrollingview;

import X.C0f9;
import X.C130735vM;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes3.dex */
public class NestableViewPager extends ViewPager {
    public C130735vM A00;
    public boolean A01;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
    
        if (r3 == false) goto L6;
     */
    @Override // androidx.viewpager.widget.ViewPager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0I(int r2, boolean r3) {
        /*
            r1 = this;
            boolean r0 = r1.A01
            if (r0 != 0) goto L7
            r0 = 1
            if (r3 != 0) goto L8
        L7:
            r0 = 0
        L8:
            super.A0I(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.nestablescrollingview.NestableViewPager.A0I(int, boolean):void");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A01) {
            return false;
        }
        this.A00.A01(motionEvent, this, true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        if (this.A01) {
            A0I(i, false);
        } else {
            super.setCurrentItem(i);
        }
    }

    public void setPassThroughEdge(int i) {
        C130735vM c130735vM = this.A00;
        c130735vM.A00 = i;
        c130735vM.A01 = false;
    }

    public NestableViewPager(Context context) {
        super(context);
        this.A00 = new C130735vM(getContext());
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        int A05 = C0f9.A05(141079147);
        if (this.A01) {
            onTouchEvent = false;
            i = 1948225680;
        } else {
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = -907873473;
        }
        C0f9.A0C(i, A05);
        return onTouchEvent;
    }

    public void setSwipingDisabled(boolean z) {
        this.A01 = z;
    }

    public NestableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = new C130735vM(getContext());
    }
}
