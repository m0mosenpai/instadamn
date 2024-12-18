package com.instagram.ui.animation.pushlayout;

import X.C14360o3;
import X.C71C;
import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public class PushDynamicCoordinatorLayout extends CoordinatorLayout {
    public C71C A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushDynamicCoordinatorLayout(Context context) {
        super(context, null);
        C14360o3.A0B(context, 1);
    }

    public final float getXFraction() {
        int width = getWidth();
        float x = getX();
        if (width != 0) {
            return x / width;
        }
        return x;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C71C c71c = this.A00;
        if (c71c != null && c71c.DRC()) {
            super.onMeasure(i, i2);
        }
    }

    public final void setXFraction(float f) {
        float f2;
        int width = getWidth();
        if (width > 0) {
            f2 = f * width;
        } else {
            f2 = -9999.0f;
        }
        setX(f2);
    }

    public void setOnMeasureListener(C71C c71c) {
        this.A00 = c71c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushDynamicCoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushDynamicCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
    }
}
