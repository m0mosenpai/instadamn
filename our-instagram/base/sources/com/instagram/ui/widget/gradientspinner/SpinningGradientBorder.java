package com.instagram.ui.widget.gradientspinner;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31175DnJ;
import X.C0f9;
import X.C55241OfD;
import X.MSX;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.facebook.R;

/* loaded from: classes9.dex */
public class SpinningGradientBorder extends FrameLayout {
    public int A00;
    public LinearGradient A01;
    public final float A02;
    public final float A03;
    public final Paint A04;
    public final RectF A05;
    public final int A06;
    public final ValueAnimator A07;
    public final Matrix A08;

    public void setCurrentPlayTime(long j) {
        this.A07.setCurrentPlayTime(j);
    }

    public void setSpinnerState(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw AbstractC31175DnJ.A0U("Invalid SpinnerState ", i);
                    }
                } else {
                    this.A07.start();
                    invalidate();
                }
            }
            this.A07.cancel();
            invalidate();
        }
    }

    public SpinningGradientBorder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 0;
        this.A02 = AbstractC167017dG.A06(context);
        float A00 = AbstractC13880nE.A00(context, 1.5f);
        this.A03 = A00;
        Paint A0P = AbstractC166997dE.A0P();
        this.A04 = A0P;
        A0P.setStyle(Paint.Style.STROKE);
        A0P.setStrokeWidth(A00);
        A0P.setStrokeCap(Paint.Cap.ROUND);
        this.A05 = AbstractC166987dD.A0X();
        this.A08 = new Matrix();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(1200L);
        this.A07 = duration;
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatCount(-1);
        C55241OfD.A01(duration, this, 13);
        this.A06 = AbstractC167007dF.A09(context, R.attr.gradientSpinnerDoneColor);
        setWillNotDraw(false);
    }

    private LinearGradient getGradient() {
        Context context = getContext();
        LinearGradient linearGradient = this.A01;
        if (linearGradient == null) {
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AbstractC166987dD.A07(this), AbstractC166987dD.A08(this), MSX.A02(context), this.A06, Shader.TileMode.CLAMP);
            this.A01 = linearGradient2;
            return linearGradient2;
        }
        return linearGradient;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(787297186);
        super.onDetachedFromWindow();
        this.A07.end();
        C0f9.A0D(-2123829886, A06);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        super.onDraw(canvas);
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    paint = this.A04;
                    paint.setShader(null);
                    paint.setColor(this.A06);
                } else {
                    throw AbstractC31175DnJ.A0U("Invalid SpinnerState ", i);
                }
            } else {
                paint = this.A04;
                paint.setShader(getGradient());
                float A09 = (AbstractC166987dD.A09(this.A07.getAnimatedValue()) * 360.0f) - 45.0f;
                Matrix matrix = this.A08;
                matrix.setRotate(A09, getWidth() / 2, getHeight() / 2);
                getGradient().setLocalMatrix(matrix);
            }
            RectF rectF = this.A05;
            float f = this.A03;
            rectF.set(f, f, AbstractC166987dD.A07(this) - f, AbstractC166987dD.A08(this) - f);
            float f2 = this.A02;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    public SpinningGradientBorder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpinningGradientBorder(Context context) {
        this(context, null);
    }
}
