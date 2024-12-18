package com.google.android.material.behavior;

import X.AbstractC153306uz;
import X.AbstractC167007dF;
import X.U5Q;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;

/* loaded from: classes11.dex */
public class HideBottomViewOnScrollBehavior extends CoordinatorLayout.Behavior {
    public ViewPropertyAnimator A02;
    public int A01 = 0;
    public int A00 = 2;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void A0J(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        TimeInterpolator timeInterpolator;
        long j;
        ViewPropertyAnimator animate;
        float f;
        if (i2 > 0) {
            if (this.A00 != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.A02;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.A00 = 1;
                int i6 = this.A01;
                timeInterpolator = AbstractC153306uz.A01;
                j = 175;
                animate = view.animate();
                f = i6;
            } else {
                return;
            }
        } else {
            if (i2 >= 0 || this.A00 == 2) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.A02;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.A00 = 2;
            timeInterpolator = AbstractC153306uz.A04;
            j = 225;
            animate = view.animate();
            f = 0.0f;
        }
        this.A02 = animate.translationY(f).setInterpolator(timeInterpolator).setDuration(j).setListener(new U5Q(this, 7));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean A0N(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
        if (this instanceof BottomAppBar$Behavior) {
            throw new NullPointerException("getHideOnScroll");
        }
        return AbstractC167007dF.A1P(i, 2);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A01 = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }

    public HideBottomViewOnScrollBehavior() {
    }
}
