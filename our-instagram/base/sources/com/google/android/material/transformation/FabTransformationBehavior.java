package com.google.android.material.transformation;

import X.C56292iI;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
/* loaded from: classes11.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect A00 = new Rect();
    public final RectF A01 = new RectF();
    public final RectF A02 = new RectF();

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void A0K(C56292iI c56292iI) {
        if (c56292iI.A01 == 0) {
            c56292iI.A01 = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean A0C(View view, View view2, CoordinatorLayout coordinatorLayout) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public FabTransformationBehavior() {
    }
}
