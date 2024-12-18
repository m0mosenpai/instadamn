package com.instagram.ui.widget.textureview;

import X.AbstractC97744aC;
import X.EnumC95184Qe;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;

/* loaded from: classes2.dex */
public class ScalingTextureView extends MultiListenerTextureView {
    public float A00;
    public int A01;
    public int A02;
    public float A03;
    public float A04;
    public EnumC95184Qe A05;

    public ScalingTextureView(Context context) {
        this(context, null);
    }

    public static void A00(ScalingTextureView scalingTextureView) {
        int i;
        int i2 = scalingTextureView.A02;
        if (i2 > 0 && (i = scalingTextureView.A01) > 0) {
            AbstractC97744aC.A01(scalingTextureView, scalingTextureView.A05, null, scalingTextureView.A04, scalingTextureView.A03, scalingTextureView.A00, i2, i);
        }
    }

    public int getVideoHeight() {
        return this.A01;
    }

    public int getVideoWidth() {
        return this.A02;
    }

    public void setScaleType(EnumC95184Qe enumC95184Qe) {
        if (this.A05 != enumC95184Qe) {
            this.A05 = enumC95184Qe;
            A00(this);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this);
    }

    public void setCropTopCoordinate(float f) {
        this.A00 = f;
    }

    public ScalingTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = EnumC95184Qe.A03;
        this.A04 = 0.8f;
        this.A03 = 1.91f;
        this.A00 = 0.0f;
    }

    public ScalingTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
