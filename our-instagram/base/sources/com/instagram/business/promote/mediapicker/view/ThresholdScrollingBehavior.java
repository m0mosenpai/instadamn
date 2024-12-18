package com.instagram.business.promote.mediapicker.view;

import X.AbstractC167017dG;
import X.C14360o3;
import X.C56292iI;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes11.dex */
public final class ThresholdScrollingBehavior extends AppBarLayout.ScrollingViewBehavior {
    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean A0D(View view, View view2, CoordinatorLayout coordinatorLayout) {
        C56292iI c56292iI;
        C14360o3.A0B(coordinatorLayout, 0);
        AbstractC167017dG.A1P(view, view2);
        super.A0D(view, view2, coordinatorLayout);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        CoordinatorLayout.Behavior behavior = null;
        if ((layoutParams instanceof C56292iI) && (c56292iI = (C56292iI) layoutParams) != null) {
            behavior = c56292iI.A0A;
        }
        if ((behavior instanceof AppBarLayout.Behavior) && behavior != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = coordinatorLayout.getHeight() - view.getTop();
            }
            view.requestLayout();
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThresholdScrollingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC167017dG.A1P(context, attributeSet);
    }

    public ThresholdScrollingBehavior() {
    }
}
