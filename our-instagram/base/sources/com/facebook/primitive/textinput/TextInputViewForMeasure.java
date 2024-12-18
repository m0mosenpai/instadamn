package com.facebook.primitive.textinput;

import X.C0f9;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class TextInputViewForMeasure extends EditText {
    public /* synthetic */ TextInputViewForMeasure(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        super(context, null);
    }

    @Override // android.view.View
    public final void requestLayout() {
    }

    @Override // android.view.View
    public final void invalidate() {
        C0f9.A0A(268791643, C0f9.A03(897817502));
    }

    public TextInputViewForMeasure(Context context) {
        super(context, null);
    }

    public TextInputViewForMeasure(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
