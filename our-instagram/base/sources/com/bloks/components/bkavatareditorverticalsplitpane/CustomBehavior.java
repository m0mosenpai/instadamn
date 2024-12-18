package com.bloks.components.bkavatareditorverticalsplitpane;

import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C131785xE;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes11.dex */
public final class CustomBehavior extends BottomSheetBehavior {
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean A0O(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        AbstractC167017dG.A1P(view, view2);
        if ((view2 instanceof C131785xE) && !view2.canScrollVertically((int) f2)) {
            return super.A0O(view, view2, coordinatorLayout, f, f2);
        }
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ void A0P(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
        AbstractC167027dH.A12(coordinatorLayout, view, view2);
        if ((view2 instanceof C131785xE) && !view2.canScrollVertically(i2)) {
            super.A0P(view, view2, coordinatorLayout, iArr, i, i2, i3);
        }
    }
}
