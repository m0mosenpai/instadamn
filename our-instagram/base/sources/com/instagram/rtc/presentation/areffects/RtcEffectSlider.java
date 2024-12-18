package com.instagram.rtc.presentation.areffects;

import X.AbstractC167017dG;
import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.ui.widget.drawing.EffectSlider;

/* loaded from: classes9.dex */
public final class RtcEffectSlider extends EffectSlider {
    public boolean A00;

    private final void A00() {
        float paddingLeft;
        boolean z = this.A00;
        int width = getWidth();
        if (z) {
            paddingLeft = (width / 2.0f) - getPaddingRight();
        } else {
            paddingLeft = ((-width) / 2.0f) + getPaddingLeft();
        }
        this.A01 = paddingLeft;
    }

    public final void setAlignedLeft(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            A00();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcEffectSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC167017dG.A1P(context, attributeSet);
    }

    @Override // com.instagram.ui.widget.drawing.EffectSlider, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00();
    }

    @Override // com.instagram.ui.widget.drawing.EffectSlider, android.view.View
    public final void onMeasure(int i, int i2) {
        this.A0R = View.MeasureSpec.getSize(i);
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcEffectSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC167017dG.A1P(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcEffectSlider(Context context) {
        super(context, null);
        C14360o3.A0B(context, 1);
    }
}
