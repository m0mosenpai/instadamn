package com.instagram.ui.widget.framelayout;

import X.AbstractC43201yn;
import X.AbstractC55922hc;
import X.AbstractC63123SdR;
import X.C0f9;
import X.C14360o3;
import X.InterfaceC74623Ww;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class MediaFrameLayout extends AbstractC43201yn implements InterfaceC74623Ww {
    public float A00;
    public float A01;
    public Path A02;
    public boolean A03;
    public boolean A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaFrameLayout(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.ViewGroup, X.InterfaceC74623Ww
    public final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(layoutParams, 2);
        super.attachViewToParent(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, X.InterfaceC74623Ww
    public final void detachViewFromParent(View view) {
        C14360o3.A0B(view, 0);
        super.detachViewFromParent(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Path path = this.A02;
        if (this.A04 && path != null) {
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        float f = this.A00;
        if (f != -1.0f && f > 0.0f) {
            boolean z = this.A03;
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i);
            if (!z && (mode == Integer.MIN_VALUE || mode == 1073741824)) {
                float f2 = size;
                if (f2 < size2 / f) {
                    i = View.MeasureSpec.makeMeasureSpec((int) (f2 * f), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                    i2 = View.MeasureSpec.makeMeasureSpec(size, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                }
            }
            i2 = View.MeasureSpec.makeMeasureSpec((int) (size2 / f), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
            i = View.MeasureSpec.makeMeasureSpec(size2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-1252753513);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A04) {
            Path path = new Path();
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            float f = this.A01;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            this.A02 = path;
        }
        C0f9.A0D(-758044507, A06);
    }

    public final void setAspectRatio(float f) {
        this.A00 = f;
    }

    public final void setForFullWidth(boolean z) {
        this.A03 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = 1.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1j);
        C14360o3.A07(obtainStyledAttributes);
        this.A03 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ MediaFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
