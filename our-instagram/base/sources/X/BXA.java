package X;

import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class BXA extends Drawable implements Animatable {
    public static final ArgbEvaluator A08 = new ArgbEvaluator();
    public static final TimeInterpolator A09 = new BXB();
    public boolean A00;
    public final float A01;
    public final int A02;
    public final ValueAnimator.AnimatorUpdateListener A03;
    public final ValueAnimator A04;
    public final Paint A05;
    public final RectF A06;
    public final EnumC25700BXk A07;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public BXA(C27881CQs c27881CQs, C27881CQs c27881CQs2, EnumC25700BXk enumC25700BXk, float f, int i, int i2, boolean z) {
        float f2;
        float f3;
        BFF bff = new BFF(this, 15);
        this.A03 = bff;
        this.A07 = enumC25700BXk;
        this.A06 = AbstractC166987dD.A0X();
        Paint A0R = AbstractC166987dD.A0R();
        this.A05 = A0R;
        AbstractC166987dD.A1R(A0R);
        A0R.setAntiAlias(true);
        this.A02 = i2;
        this.A01 = f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A04 = valueAnimator;
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(bff);
        valueAnimator.setStartDelay((i % 10) * 200);
        valueAnimator.setDuration(2000L);
        valueAnimator.setInterpolator(A09);
        valueAnimator.setEvaluator(A08);
        if (z) {
            f2 = c27881CQs2.A00;
            f3 = c27881CQs2.A01;
        } else {
            f2 = c27881CQs.A00;
            f3 = c27881CQs.A01;
        }
        valueAnimator.setFloatValues(f2, f3);
        A0R.setColor(AbstractC25689BWz.A00(i2, f2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int ordinal = this.A07.ordinal();
        RectF rectF = this.A06;
        if (ordinal != 0) {
            float f = this.A01;
            canvas.drawRoundRect(rectF, f, f, this.A05);
        } else {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.A05);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.A04.isStarted();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.A05;
        if (paint.getAlpha() != i) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (!z) {
            this.A04.cancel();
        } else if (this.A00) {
            this.A04.start();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.A04.start();
        this.A00 = true;
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.A04.cancel();
        this.A00 = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A06.set(rect);
    }
}
