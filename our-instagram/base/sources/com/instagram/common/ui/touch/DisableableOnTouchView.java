package com.instagram.common.ui.touch;

import X.C0f9;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class DisableableOnTouchView extends View {
    public boolean A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisableableOnTouchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    public final boolean getTouchDisabled() {
        return this.A00;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int A05 = C0f9.A05(1609424830);
        C14360o3.A0B(motionEvent, 0);
        if (this.A00) {
            onTouchEvent = false;
        } else {
            onTouchEvent = super.onTouchEvent(motionEvent);
        }
        C0f9.A0C(1500194073, A05);
        return onTouchEvent;
    }

    public final void setTouchDisabled(boolean z) {
        this.A00 = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisableableOnTouchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ DisableableOnTouchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisableableOnTouchView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
