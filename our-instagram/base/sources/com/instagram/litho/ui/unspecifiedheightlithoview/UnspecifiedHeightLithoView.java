package com.instagram.litho.ui.unspecifiedheightlithoview;

import X.AbstractC75953b0;
import X.C14360o3;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.litho.LithoView;

/* loaded from: classes3.dex */
public final class UnspecifiedHeightLithoView extends LithoView {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnspecifiedHeightLithoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
        this.A00 = AbstractC75953b0.A00;
    }

    @Override // com.facebook.litho.LithoView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, this.A00);
    }
}
