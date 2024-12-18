package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior {
    public int A00;
    public int A01;
    public final Rect A02;
    public final Rect A03;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0S(android.view.View r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            r4 = 0
            if (r0 == 0) goto L43
            boolean r0 = r6 instanceof com.google.android.material.appbar.AppBarLayout
            if (r0 == 0) goto L2b
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            int r3 = r6.getTotalScrollRange()
            int r2 = r6.getDownNestedPreScrollRange()
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            X.2iI r0 = (X.C56292iI) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r0.A0A
            boolean r0 = r1 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
            if (r0 == 0) goto L41
            com.google.android.material.appbar.HeaderBehavior r1 = (com.google.android.material.appbar.HeaderBehavior) r1
            int r1 = r1.A0S()
        L25:
            if (r2 == 0) goto L37
            int r0 = r3 + r1
            if (r0 > r2) goto L37
        L2b:
            r1 = 0
        L2c:
            int r2 = r5.A00
            float r0 = (float) r2
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r0 < r4) goto L43
            r4 = r0
            if (r0 <= r2) goto L43
            return r2
        L37:
            int r3 = r3 - r2
            if (r3 == 0) goto L2b
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r1
            float r0 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r2
            goto L2c
        L41:
            r1 = 0
            goto L25
        L43:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderScrollingViewBehavior.A0S(android.view.View):int");
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super.A00 = 0;
        this.A02 = new Rect();
        this.A03 = new Rect();
        this.A01 = 0;
    }

    public HeaderScrollingViewBehavior() {
        this.A02 = new Rect();
        this.A03 = new Rect();
        this.A01 = 0;
    }
}
