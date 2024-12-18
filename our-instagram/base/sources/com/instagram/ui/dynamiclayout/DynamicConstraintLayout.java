package com.instagram.ui.dynamiclayout;

import X.C71C;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public class DynamicConstraintLayout extends ConstraintLayout {
    public C71C A00;

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C71C c71c = this.A00;
        if (c71c != null && c71c.DRC()) {
            super.onMeasure(i, i2);
        }
    }

    public DynamicConstraintLayout(Context context) {
        super(context);
    }

    public void setOnMeasureListener(C71C c71c) {
        this.A00 = c71c;
    }

    public DynamicConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DynamicConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
