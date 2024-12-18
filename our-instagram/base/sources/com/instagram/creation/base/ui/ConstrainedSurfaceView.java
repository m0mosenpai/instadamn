package com.instagram.creation.base.ui;

import X.C14360o3;
import X.InterfaceC25168BBo;
import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

/* loaded from: classes9.dex */
public final class ConstrainedSurfaceView extends SurfaceView implements InterfaceC25168BBo {
    public float A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstrainedSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = 1.0f;
    }

    public float getAspectRatio() {
        return this.A00;
    }

    @Override // X.InterfaceC25168BBo
    public void setAspectRatio(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            requestLayout();
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int i3;
        super.onMeasure(i, i2);
        float f = this.A00;
        if (f > 0.0f) {
            if (f < 1.0f) {
                i3 = getMeasuredHeight();
                measuredWidth = (int) ((i3 * this.A00) + 0.5f);
            } else {
                measuredWidth = getMeasuredWidth();
                i3 = (int) ((measuredWidth / this.A00) + 0.5f);
            }
            setMeasuredDimension(measuredWidth, i3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstrainedSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A00 = 1.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstrainedSurfaceView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A00 = 1.0f;
    }
}
