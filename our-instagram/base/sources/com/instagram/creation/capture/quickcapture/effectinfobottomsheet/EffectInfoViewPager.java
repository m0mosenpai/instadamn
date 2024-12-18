package com.instagram.creation.capture.quickcapture.effectinfobottomsheet;

import X.AbstractC63123SdR;
import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes8.dex */
public final class EffectInfoViewPager extends ViewPager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectInfoViewPager(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i, int i2) {
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            i2 = View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectInfoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }
}
