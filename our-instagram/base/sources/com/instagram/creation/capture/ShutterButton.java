package com.instagram.creation.capture;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC53242c7;
import X.AbstractC56952jT;
import X.C14360o3;
import X.JQ0;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class ShutterButton extends View {
    public float A00;
    public Integer A01;
    public Integer A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final ArgbEvaluator A0G;
    public final Paint A0H;

    public ShutterButton(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        float width = canvas.getWidth() / 2.0f;
        float height = canvas.getHeight() / 2.0f;
        Paint paint = this.A0H;
        paint.setColor(this.A0F);
        canvas.drawCircle(width, height, canvas.getHeight() / 2.0f, paint);
        Integer num = this.A01;
        C14360o3.A0A(num);
        paint.setColor(num.intValue());
        canvas.drawCircle(width, height, AbstractC166987dD.A0A(0.90909094f, r4), paint);
        Integer num2 = this.A02;
        C14360o3.A0A(num2);
        paint.setColor(num2.intValue());
        canvas.drawCircle(width, height, AbstractC166987dD.A0A(r4, 0.54545456f), paint);
    }

    public final void setProgress(float f) {
        this.A00 = f;
        A00(f);
        invalidate();
    }

    public final void A00(float f) {
        ArgbEvaluator argbEvaluator;
        Integer valueOf;
        int i;
        if (!isPressed() && !isActivated()) {
            boolean isEnabled = isEnabled();
            argbEvaluator = this.A0G;
            if (!isEnabled) {
                Object evaluate = argbEvaluator.evaluate(f, Integer.valueOf(this.A0A), Integer.valueOf(this.A04));
                C14360o3.A0C(evaluate, "null cannot be cast to non-null type kotlin.Int");
                this.A01 = (Integer) evaluate;
                valueOf = Integer.valueOf(this.A0D);
                i = this.A07;
            } else {
                Object evaluate2 = argbEvaluator.evaluate(f, Integer.valueOf(this.A09), Integer.valueOf(this.A03));
                C14360o3.A0C(evaluate2, "null cannot be cast to non-null type kotlin.Int");
                this.A01 = (Integer) evaluate2;
                valueOf = Integer.valueOf(this.A0C);
                i = this.A06;
            }
        } else {
            argbEvaluator = this.A0G;
            Object evaluate3 = argbEvaluator.evaluate(f, Integer.valueOf(this.A0B), Integer.valueOf(this.A05));
            C14360o3.A0C(evaluate3, "null cannot be cast to non-null type kotlin.Int");
            this.A01 = (Integer) evaluate3;
            valueOf = Integer.valueOf(this.A0E);
            i = this.A08;
        }
        Object evaluate4 = argbEvaluator.evaluate(f, valueOf, Integer.valueOf(i));
        C14360o3.A0C(evaluate4, "null cannot be cast to non-null type kotlin.Int");
        this.A02 = (Integer) evaluate4;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        A00(this.A00);
        invalidate();
    }

    public /* synthetic */ ShutterButton(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }

    public ShutterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0G = new ArgbEvaluator();
        this.A0H = AbstractC166997dE.A0P();
        Context context2 = getContext();
        this.A0F = AbstractC53242c7.A0F(context2, R.attr.captureStrokeRing);
        this.A09 = AbstractC53242c7.A0F(context2, R.attr.captureCameraOuterRing);
        this.A0C = AbstractC53242c7.A0F(context2, R.attr.captureCameraInnerRing);
        this.A03 = AbstractC53242c7.A0F(context2, R.attr.captureCamcorderOuterRing);
        this.A06 = AbstractC53242c7.A0F(context2, R.attr.captureCamcorderInnerRing);
        this.A05 = AbstractC53242c7.A0F(context2, R.attr.captureCamcorderOuterRingPressed);
        this.A08 = AbstractC53242c7.A0F(context2, R.attr.captureCamcorderInnerRingPressed);
        this.A07 = AbstractC53242c7.A0F(context2, R.attr.captureCamcorderInnerRingDisable);
        this.A04 = AbstractC53242c7.A0F(context2, R.attr.captureCamcorderOuterRingDisable);
        this.A0B = AbstractC53242c7.A0F(context2, R.attr.captureCameraOuterRingPressed);
        this.A0E = AbstractC53242c7.A0F(context2, R.attr.captureCameraInnerRingPressed);
        this.A0A = AbstractC53242c7.A0F(context2, R.attr.captureCameraOuterRing);
        this.A0D = AbstractC53242c7.A0F(context2, R.attr.captureCameraInnerRing);
        A00(0.0f);
        AbstractC56952jT.A01(this);
    }
}
