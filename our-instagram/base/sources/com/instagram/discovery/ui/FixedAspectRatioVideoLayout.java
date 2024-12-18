package com.instagram.discovery.ui;

import X.AbstractC166987dD;
import X.AbstractC31172DnG;
import X.AbstractC43593JPy;
import X.AbstractC63123SdR;
import X.C0f9;
import X.C1342264k;
import X.C14360o3;
import X.JQ0;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class FixedAspectRatioVideoLayout extends SimpleVideoLayout {
    public float A00;
    public final C1342264k A01;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        this.A01.A00(canvas);
    }

    public final void setAspectRatio(float f) {
        if (f > 0.0f) {
            this.A00 = f;
            return;
        }
        throw AbstractC166987dD.A12("aspect ratio shall be > 0");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f = this.A00;
        if (f > 0.0f) {
            View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getSize(i2);
            int size = View.MeasureSpec.getSize(i);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec((int) (size / f), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    public final void setEnableTouchOverlay(boolean z) {
        this.A01.A00 = z;
    }

    public /* synthetic */ FixedAspectRatioVideoLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A03 = AbstractC43593JPy.A03(motionEvent, 818847099);
        C1342264k c1342264k = this.A01;
        if (c1342264k.A00) {
            c1342264k.A02.A02(motionEvent);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        C0f9.A0C(-228208669, A03);
        return onTouchEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = 1.0f;
        this.A01 = new C1342264k(this);
        setWillNotDraw(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioVideoLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioVideoLayout(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
