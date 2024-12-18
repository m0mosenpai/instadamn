package com.facebookpay.msc.view;

import X.C00O;
import X.C14360o3;
import X.C2FP;
import X.C2UU;
import X.JQ0;
import X.UGY;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class MSCPivotBar extends RecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MSCPivotBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C2FP.A02().A07().A00(context, 12);
        throw C00O.createAndThrow();
    }

    public final void setAdapter(UGY ugy) {
        C14360o3.A0B(ugy, 0);
        setAdapter((C2UU) ugy);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MSCPivotBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
        throw C00O.createAndThrow();
    }

    public /* synthetic */ MSCPivotBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
        throw C00O.createAndThrow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MSCPivotBar(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
        throw C00O.createAndThrow();
    }
}
