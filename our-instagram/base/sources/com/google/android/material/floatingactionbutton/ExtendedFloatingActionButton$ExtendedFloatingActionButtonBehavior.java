package com.google.android.material.floatingactionbutton;

import X.C00O;
import X.C56292iI;
import X.C65N;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;

/* loaded from: classes11.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends CoordinatorLayout.Behavior {
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i) {
        List A0B = coordinatorLayout.A0B(null);
        int size = A0B.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) A0B.get(i2);
            if (view2 instanceof AppBarLayout) {
                throw new NullPointerException("getLayoutParams");
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof C56292iI) && (((C56292iI) layoutParams).A0A instanceof BottomSheetBehavior)) {
                throw new NullPointerException("getLayoutParams");
            }
        }
        coordinatorLayout.A0E(null, i);
        throw C00O.createAndThrow();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean A0D(View view, View view2, CoordinatorLayout coordinatorLayout) {
        if (view2 instanceof AppBarLayout) {
            throw new NullPointerException("getLayoutParams");
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if ((layoutParams instanceof C56292iI) && (((C56292iI) layoutParams).A0A instanceof BottomSheetBehavior)) {
            throw new NullPointerException("getLayoutParams");
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void A0K(C56292iI c56292iI) {
        if (c56292iI.A01 == 0) {
            c56292iI.A01 = 80;
        }
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C65N.A0D);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }
}
