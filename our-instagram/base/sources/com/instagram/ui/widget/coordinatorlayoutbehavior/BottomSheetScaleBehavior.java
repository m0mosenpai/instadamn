package com.instagram.ui.widget.coordinatorlayoutbehavior;

import X.AbstractC167017dG;
import X.C14360o3;
import X.C56292iI;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes9.dex */
public final class BottomSheetScaleBehavior extends CoordinatorLayout.Behavior {
    public int A00;
    public boolean A01 = true;

    public BottomSheetScaleBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean A0C(View view, View view2, CoordinatorLayout coordinatorLayout) {
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        return ((C56292iI) layoutParams).A0A instanceof BottomSheetBehavior;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean A0D(View view, View view2, CoordinatorLayout coordinatorLayout) {
        AbstractC167017dG.A1P(view, view2);
        if (this.A01) {
            if (view.getVisibility() != 8 && view.getBottom() - this.A00 != 0) {
                view.setPivotX(view.getWidth() / 2);
                view.setPivotY(this.A00);
                float min = Math.min(1.0f, ((view2.getTop() + view2.getPaddingTop()) - this.A00) / (view.getBottom() - this.A00));
                view.setScaleY(min);
                view.setScaleX(min);
            } else {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                return false;
            }
        }
        return false;
    }

    public BottomSheetScaleBehavior(Context context, AttributeSet attributeSet) {
    }
}
