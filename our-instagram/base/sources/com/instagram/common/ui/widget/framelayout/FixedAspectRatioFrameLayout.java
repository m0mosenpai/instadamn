package com.instagram.common.ui.widget.framelayout;

import X.AbstractC31172DnG;
import X.AbstractC63123SdR;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class FixedAspectRatioFrameLayout extends FrameLayout {
    public float A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = 1.0f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        float f = this.A00;
        if (f > 0.0f) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                float f2 = size;
                if (f2 < size2 / f) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (f2 * f), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                    super.onMeasure(makeMeasureSpec, makeMeasureSpec2);
                    return;
                }
            }
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) (size2 / f), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
            super.onMeasure(makeMeasureSpec, makeMeasureSpec2);
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    public final void setAspectRatio(float f) {
        this.A00 = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioFrameLayout(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
