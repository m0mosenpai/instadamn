package com.google.android.material.appbar;

import X.C1343765g;
import X.C72E;
import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes3.dex */
public abstract class HeaderBehavior extends ViewOffsetBehavior {
    public VelocityTracker A00;
    public OverScroller A01;
    public Runnable A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;

    public final int A0S() {
        int i;
        AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
        C72E c72e = ((ViewOffsetBehavior) baseBehavior).A01;
        if (c72e != null) {
            i = c72e.A02;
        } else {
            i = 0;
        }
        return i + baseBehavior.A01;
    }

    public final int A0T(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3) {
        int i4;
        AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int A0S = baseBehavior.A0S();
        int i5 = 0;
        if (i2 != 0 && A0S >= i2 && A0S <= i3) {
            if (i >= i2) {
                i2 = i;
                if (i > i3) {
                    i2 = i3;
                }
            }
            if (A0S != i2) {
                int i6 = i2;
                if (appBarLayout.A0A) {
                    int abs = Math.abs(i2);
                    int childCount = appBarLayout.getChildCount();
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= childCount) {
                            break;
                        }
                        View childAt = appBarLayout.getChildAt(i8);
                        C1343765g c1343765g = (C1343765g) childAt.getLayoutParams();
                        Interpolator interpolator = c1343765g.A01;
                        if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                            if (interpolator != null) {
                                int i9 = c1343765g.A00;
                                if ((i9 & 1) != 0) {
                                    i7 = childAt.getHeight() + ((ViewGroup.MarginLayoutParams) c1343765g).topMargin + ((ViewGroup.MarginLayoutParams) c1343765g).bottomMargin;
                                    if ((i9 & 2) != 0) {
                                        i7 -= childAt.getMinimumHeight();
                                    }
                                }
                                if (childAt.getFitsSystemWindows()) {
                                    i7 -= appBarLayout.getTopInset();
                                }
                                if (i7 > 0) {
                                    float f = i7;
                                    i6 = Integer.signum(i2) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((abs - childAt.getTop()) / f)));
                                }
                            }
                        } else {
                            i8++;
                        }
                    }
                }
                boolean A0R = baseBehavior.A0R(i6);
                i5 = A0S - i2;
                baseBehavior.A01 = i2 - i6;
                if (!A0R && appBarLayout.A0A) {
                    coordinatorLayout.A0D(appBarLayout);
                }
                C72E c72e = ((ViewOffsetBehavior) baseBehavior).A01;
                if (c72e != null) {
                    i4 = c72e.A02;
                } else {
                    i4 = 0;
                }
                appBarLayout.A01(i4);
                int i10 = 1;
                if (i2 < A0S) {
                    i10 = -1;
                }
                AppBarLayout.BaseBehavior.A08(coordinatorLayout, appBarLayout, i2, i10, false);
            }
        } else {
            baseBehavior.A01 = 0;
        }
        AppBarLayout.BaseBehavior.A06(coordinatorLayout, baseBehavior, appBarLayout);
        return i5;
    }

    public final void A0U(View view, CoordinatorLayout coordinatorLayout) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        AppBarLayout.BaseBehavior.A05(coordinatorLayout, (AppBarLayout.BaseBehavior) this, appBarLayout);
        if (appBarLayout.A0B) {
            appBarLayout.A05(appBarLayout.A04(AppBarLayout.BaseBehavior.A04(coordinatorLayout)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
    
        if (r10.A0G(r9, r5, r2) == false) goto L29;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A0L(android.view.MotionEvent r8, android.view.View r9, androidx.coordinatorlayout.widget.CoordinatorLayout r10) {
        /*
            r7 = this;
            int r0 = r7.A05
            if (r0 >= 0) goto L12
            android.content.Context r0 = r10.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.A05 = r0
        L12:
            int r1 = r8.getActionMasked()
            r0 = 2
            r6 = 1
            r4 = -1
            r3 = 0
            if (r1 != r0) goto L3e
            boolean r0 = r7.A06
            if (r0 == 0) goto L3e
            int r0 = r7.A03
            if (r0 == r4) goto La0
            int r0 = r8.findPointerIndex(r0)
            if (r0 == r4) goto La0
            float r0 = r8.getY(r0)
            int r2 = (int) r0
            int r0 = r7.A04
            int r0 = r2 - r0
            int r1 = java.lang.Math.abs(r0)
            int r0 = r7.A05
            if (r1 <= r0) goto L3e
            r7.A04 = r2
            return r6
        L3e:
            int r0 = r8.getActionMasked()
            if (r0 != 0) goto L99
            r7.A03 = r4
            float r0 = r8.getX()
            int r5 = (int) r0
            float r0 = r8.getY()
            int r2 = (int) r0
            r0 = r7
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            java.lang.ref.WeakReference r0 = r0.A04
            if (r0 == 0) goto L6b
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L72
            boolean r0 = r1.isShown()
            if (r0 == 0) goto L72
            boolean r0 = r1.canScrollVertically(r4)
            if (r0 != 0) goto L72
        L6b:
            boolean r1 = r10.A0G(r9, r5, r2)
            r0 = 1
            if (r1 != 0) goto L73
        L72:
            r0 = 0
        L73:
            r7.A06 = r0
            if (r0 == 0) goto L99
            r7.A04 = r2
            int r0 = r8.getPointerId(r3)
            r7.A03 = r0
            android.view.VelocityTracker r0 = r7.A00
            if (r0 != 0) goto L89
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.A00 = r0
        L89:
            android.widget.OverScroller r0 = r7.A01
            if (r0 == 0) goto L99
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L99
            android.widget.OverScroller r0 = r7.A01
            r0.abortAnimation()
            return r6
        L99:
            android.view.VelocityTracker r0 = r7.A00
            if (r0 == 0) goto La0
            r0.addMovement(r8)
        La0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.A0L(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A0M(android.view.MotionEvent r18, android.view.View r19, androidx.coordinatorlayout.widget.CoordinatorLayout r20) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.A0M(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public final void A0V(View view, CoordinatorLayout coordinatorLayout, int i) {
        A0T(view, coordinatorLayout, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super.A00 = 0;
        this.A03 = -1;
        this.A05 = -1;
    }

    public HeaderBehavior() {
        this.A03 = -1;
        this.A05 = -1;
    }
}
