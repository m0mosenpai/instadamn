package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.7jW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170797jW extends Drawable implements Animatable {
    public static final Interpolator A06 = new LinearInterpolator();
    public static final Interpolator A07 = new C128935sB();
    public static final int[] A08 = {-16777216};
    public float A00;
    public float A01;
    public Animator A02;
    public Resources A03;
    public boolean A04;
    public final C170807jX A05;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void A00(float f) {
        C170807jX c170807jX = this.A05;
        c170807jX.A08 = f;
        c170807jX.A0J.setStrokeWidth(f);
        invalidateSelf();
    }

    public final void A01(int i) {
        float f = 7.5f;
        float f2 = 2.5f;
        float f3 = 10.0f;
        float f4 = 5.0f;
        if (i == 0) {
            f = 11.0f;
            f2 = 3.0f;
            f3 = 12.0f;
            f4 = 6.0f;
        }
        C170807jX c170807jX = this.A05;
        float f5 = this.A03.getDisplayMetrics().density;
        float f6 = f2 * f5;
        c170807jX.A08 = f6;
        c170807jX.A0J.setStrokeWidth(f6);
        c170807jX.A02 = f * f5;
        c170807jX.A0C = 0;
        c170807jX.A0D = c170807jX.A0G[0];
        c170807jX.A0B = (int) (f3 * f5);
        c170807jX.A0A = (int) (f4 * f5);
        invalidateSelf();
    }

    public final void A02(Paint.Cap cap) {
        this.A05.A0J.setStrokeCap(cap);
        invalidateSelf();
    }

    public final void A03(C170807jX c170807jX, float f) {
        int i;
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int[] iArr = c170807jX.A0G;
            int i2 = c170807jX.A0C;
            int i3 = iArr[i2];
            int i4 = iArr[(i2 + 1) % iArr.length];
            i = ((((i3 >> 24) & 255) + ((int) ((((i4 >> 24) & 255) - r8) * f2))) << 24) | ((((i3 >> 16) & 255) + ((int) ((((i4 >> 16) & 255) - r7) * f2))) << 16) | ((((i3 >> 8) & 255) + ((int) ((((i4 >> 8) & 255) - r6) * f2))) << 8) | ((i3 & 255) + ((int) (f2 * ((i4 & 255) - r4))));
        } else {
            i = c170807jX.A0G[c170807jX.A0C];
        }
        c170807jX.A0D = i;
    }

    public final void A04(C170807jX c170807jX, float f, boolean z) {
        float f2;
        float interpolation;
        if (this.A04) {
            A03(c170807jX, f);
            float f3 = c170807jX.A06;
            float floor = (float) (Math.floor(f3 / 0.8f) + 1.0d);
            float f4 = c170807jX.A07;
            float f5 = c170807jX.A05;
            c170807jX.A04 = f4 + (((f5 - 0.01f) - f4) * f);
            c170807jX.A01 = f5;
            c170807jX.A03 = f3 + ((floor - f3) * f);
            return;
        }
        if (f == 1.0f && !z) {
            return;
        }
        float f6 = c170807jX.A06;
        if (f < 0.5f) {
            interpolation = c170807jX.A07;
            f2 = (A07.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
        } else {
            f2 = c170807jX.A07 + 0.79f;
            interpolation = f2 - (((1.0f - A07.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
        }
        float f7 = f6 + (0.20999998f * f);
        float f8 = (f + this.A01) * 216.0f;
        c170807jX.A04 = interpolation;
        c170807jX.A01 = f2;
        c170807jX.A03 = f7;
        this.A00 = f8;
    }

    public final void A05(int... iArr) {
        C170807jX c170807jX = this.A05;
        c170807jX.A0G = iArr;
        c170807jX.A0C = 0;
        int i = iArr[0];
        c170807jX.A0D = i;
        c170807jX.A0C = 0;
        c170807jX.A0D = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A05.A09;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.A02.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A05.A09 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.A0J.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        long j;
        Animator animator = this.A02;
        animator.cancel();
        C170807jX c170807jX = this.A05;
        float f = c170807jX.A04;
        c170807jX.A07 = f;
        float f2 = c170807jX.A01;
        c170807jX.A05 = f2;
        c170807jX.A06 = c170807jX.A03;
        if (f2 != f) {
            this.A04 = true;
            j = 666;
        } else {
            c170807jX.A0C = 0;
            c170807jX.A0D = c170807jX.A0G[0];
            c170807jX.A07 = 0.0f;
            c170807jX.A05 = 0.0f;
            c170807jX.A06 = 0.0f;
            c170807jX.A04 = 0.0f;
            c170807jX.A01 = 0.0f;
            c170807jX.A03 = 0.0f;
            j = 1332;
        }
        animator.setDuration(j);
        animator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.A02.cancel();
        this.A00 = 0.0f;
        C170807jX c170807jX = this.A05;
        if (c170807jX.A0F) {
            c170807jX.A0F = false;
        }
        c170807jX.A0C = 0;
        c170807jX.A0D = c170807jX.A0G[0];
        c170807jX.A07 = 0.0f;
        c170807jX.A05 = 0.0f;
        c170807jX.A06 = 0.0f;
        c170807jX.A04 = 0.0f;
        c170807jX.A01 = 0.0f;
        c170807jX.A03 = 0.0f;
        invalidateSelf();
    }

    public C170797jW(Context context) {
        context.getClass();
        this.A03 = context.getResources();
        C170807jX c170807jX = new C170807jX();
        this.A05 = c170807jX;
        int[] iArr = A08;
        c170807jX.A0G = iArr;
        c170807jX.A0C = 0;
        c170807jX.A0D = iArr[0];
        A00(2.5f);
        final C170807jX c170807jX2 = this.A05;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.7jY
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                C170797jW c170797jW = this;
                C170807jX c170807jX3 = c170807jX2;
                c170797jW.A03(c170807jX3, floatValue);
                c170797jW.A04(c170807jX3, floatValue, false);
                c170797jW.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(A06);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: X.7jZ
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                C170797jW c170797jW = this;
                C170807jX c170807jX3 = c170807jX2;
                c170797jW.A04(c170807jX3, 1.0f, true);
                c170807jX3.A07 = c170807jX3.A04;
                c170807jX3.A05 = c170807jX3.A01;
                c170807jX3.A06 = c170807jX3.A03;
                int i = c170807jX3.A0C + 1;
                int[] iArr2 = c170807jX3.A0G;
                int length = i % iArr2.length;
                c170807jX3.A0C = length;
                c170807jX3.A0D = iArr2[length];
                if (c170797jW.A04) {
                    c170797jW.A04 = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    if (c170807jX3.A0F) {
                        c170807jX3.A0F = false;
                        return;
                    }
                    return;
                }
                c170797jW.A01 += 1.0f;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                this.A01 = 0.0f;
            }
        });
        this.A02 = ofFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.A00, bounds.exactCenterX(), bounds.exactCenterY());
        C170807jX c170807jX = this.A05;
        RectF rectF = c170807jX.A0K;
        float f = c170807jX.A02;
        float f2 = (c170807jX.A08 / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c170807jX.A0B * c170807jX.A00) / 2.0f, c170807jX.A08 / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = c170807jX.A04;
        float f4 = c170807jX.A03;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((c170807jX.A01 + f4) * 360.0f) - f5;
        Paint paint = c170807jX.A0J;
        paint.setColor(c170807jX.A0D);
        paint.setAlpha(c170807jX.A09);
        float f7 = c170807jX.A08 / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c170807jX.A0I);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, paint);
        if (c170807jX.A0F) {
            Path path = c170807jX.A0E;
            if (path == null) {
                Path path2 = new Path();
                c170807jX.A0E = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f9 = (c170807jX.A0B * c170807jX.A00) / 2.0f;
            c170807jX.A0E.moveTo(0.0f, 0.0f);
            c170807jX.A0E.lineTo(c170807jX.A0B * c170807jX.A00, 0.0f);
            Path path3 = c170807jX.A0E;
            float f10 = c170807jX.A0B;
            float f11 = c170807jX.A00;
            path3.lineTo((f10 * f11) / 2.0f, c170807jX.A0A * f11);
            c170807jX.A0E.offset((min + rectF.centerX()) - f9, rectF.centerY() + (c170807jX.A08 / 2.0f));
            c170807jX.A0E.close();
            Paint paint2 = c170807jX.A0H;
            paint2.setColor(c170807jX.A0D);
            paint2.setAlpha(c170807jX.A09);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c170807jX.A0E, paint2);
            canvas.restore();
        }
        canvas.restore();
    }
}
