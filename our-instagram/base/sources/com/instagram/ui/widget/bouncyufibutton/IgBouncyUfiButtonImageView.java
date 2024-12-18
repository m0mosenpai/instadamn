package com.instagram.ui.widget.bouncyufibutton;

import X.C14360o3;
import X.InterfaceC684236f;
import X.InterfaceC74253Vg;
import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* loaded from: classes2.dex */
public final class IgBouncyUfiButtonImageView extends ColorFilterAlphaImageView implements InterfaceC74253Vg, InterfaceC684236f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgBouncyUfiButtonImageView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }

    @Override // X.InterfaceC74253Vg
    public final /* synthetic */ void CwW() {
    }

    public final void A05() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
    }

    @Override // X.InterfaceC74253Vg
    public final void Cwl(boolean z, float f) {
        setScaleX(f);
        setScaleY(f);
        if (!z) {
            f = 1.0f;
        }
        setAlpha(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgBouncyUfiButtonImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgBouncyUfiButtonImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }
}
