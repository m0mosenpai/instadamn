package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

@Deprecated
/* loaded from: classes11.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior {
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean A0D(View view, View view2, CoordinatorLayout coordinatorLayout) {
        throw new NullPointerException("isExpanded");
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i) {
        if (!view.isLaidOut()) {
            List A0B = coordinatorLayout.A0B(view);
            int size = A0B.size();
            for (int i2 = 0; i2 < size; i2++) {
                A0C(view, (View) A0B.get(i2), coordinatorLayout);
            }
            return false;
        }
        return false;
    }

    public ExpandableBehavior() {
    }
}
