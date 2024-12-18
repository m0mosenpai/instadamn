package com.instagram.igds.components.shimmer.placeholder;

import X.AbstractC55922hc;
import X.AbstractC84813qV;
import X.C14360o3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class SimpleShimmerPlaceholderView extends AbstractC84813qV {
    public int A00;
    public int A01;
    public Paint A02;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A02);
    }

    public /* synthetic */ SimpleShimmerPlaceholderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void setFillColor(int i) {
        this.A01 = i;
        this.A02.setColor(i);
    }

    public final void setCornerRadius(int i) {
        this.A00 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleShimmerPlaceholderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A02 = new Paint();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A2B);
            C14360o3.A07(obtainStyledAttributes);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.A01 = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
        }
        this.A02.setColor(this.A01);
    }
}
