package com.instagram.arlink.ui;

import X.AbstractC166987dD;
import X.AbstractC55922hc;
import X.C0f9;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes8.dex */
public class GradientOverlay extends View {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final Paint A05;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, this.A04, this.A02, this.A05);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.A05.setAlpha((int) (f * 255.0f));
        invalidate();
    }

    public GradientOverlay(Context context) {
        super(context);
        this.A05 = AbstractC166987dD.A0R();
    }

    private void A00(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A0t);
        this.A03 = obtainStyledAttributes.getColor(2, 0);
        this.A00 = obtainStyledAttributes.getColor(0, 0);
        this.A01 = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(571548991);
        super.onSizeChanged(i, i2, i3, i4);
        this.A04 = i;
        this.A02 = i2;
        Paint paint = this.A05;
        paint.setShader(new LinearGradient(i, 0.0f, 0.0f, i2, new int[]{this.A03, this.A00, this.A01}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        paint.setDither(true);
        C0f9.A0D(406477006, A06);
    }

    public GradientOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = AbstractC166987dD.A0R();
        A00(attributeSet);
    }

    public GradientOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = AbstractC166987dD.A0R();
        A00(attributeSet);
    }
}
