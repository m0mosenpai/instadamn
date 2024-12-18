package com.instagram.ui.widget.base;

import X.AbstractC63123SdR;
import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class AspectRatioLinearLayout extends LinearLayout {
    public float A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AspectRatioLinearLayout(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setAspectRatio(float f) {
        this.A00 = f;
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.A00;
        if (f > 1.0f) {
            measuredHeight = (int) (measuredWidth / f);
        } else {
            measuredWidth = (int) (measuredHeight * f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(measuredHeight, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = 1.0f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AspectRatioLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ AspectRatioLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
