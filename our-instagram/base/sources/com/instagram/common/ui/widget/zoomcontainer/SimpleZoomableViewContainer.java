package com.instagram.common.ui.widget.zoomcontainer;

import X.AbstractC63123SdR;
import X.C14360o3;
import X.InterfaceC73933Tf;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class SimpleZoomableViewContainer extends FrameLayout implements InterfaceC73933Tf {
    public float A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleZoomableViewContainer(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f = this.A00;
        if (f > 0.0f) {
            View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getSize(i2);
            int size = View.MeasureSpec.getSize(i);
            i2 = View.MeasureSpec.makeMeasureSpec((int) (size / f), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
            i = View.MeasureSpec.makeMeasureSpec(size, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        }
        super.onMeasure(i, i2);
    }

    @Override // X.InterfaceC73933Tf
    public final void AP8(View view) {
        super.detachViewFromParent(view);
    }

    public final void setAspectRatio(float f) {
        this.A00 = f;
    }

    @Override // X.InterfaceC73933Tf
    public final void AD2(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleZoomableViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = -1.0f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleZoomableViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ SimpleZoomableViewContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
