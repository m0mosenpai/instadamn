package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/* renamed from: X.6Po, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138586Po extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public ColorStateList A04;
    public boolean A05;
    public final float A06;
    public final int A07;
    public final int A08;
    public final Paint A09;
    public final Paint A0A;
    public final Paint A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final RectF A0F;
    public final RectF A0G;
    public final RectF A0H;
    public final RectF A0I;
    public final Interpolator A0J = new AccelerateDecelerateInterpolator();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        long elapsedRealtime;
        float f;
        float f2;
        float interpolation;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        C14360o3.A0B(canvas, 0);
        int i = this.A02;
        if (i != -1) {
            elapsedRealtime = i;
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        long j = elapsedRealtime % 1200;
        if (!this.A05) {
            f5 = this.A0D;
            f7 = this.A08;
            f4 = f7;
        } else {
            if (j < 600) {
                float f10 = (float) j;
                f = 0.0f;
                float f11 = 600.0f - 0.0f;
                f2 = 1.0f - 0.0f;
                float f12 = 0.0f;
                if (f11 != 0.0f) {
                    f12 = (f10 - 0.0f) / f11;
                }
                interpolation = this.A0J.getInterpolation((f12 * f2) + 0.0f);
                f4 = this.A08;
                f3 = this.A0D;
                float f13 = f3 - f4;
                float f14 = 0.0f;
                if (f2 != 0.0f) {
                    f14 = (interpolation - 0.0f) / f2;
                }
                f5 = (f14 * f13) + f4;
                f6 = f4 - f3;
            } else {
                float f15 = (float) j;
                f = 0.0f;
                float f16 = 1200.0f - 600.0f;
                f2 = 1.0f - 0.0f;
                float f17 = 0.0f;
                if (f16 != 0.0f) {
                    f17 = (f15 - 600.0f) / f16;
                }
                interpolation = this.A0J.getInterpolation((f17 * f2) + 0.0f);
                float f18 = this.A0D;
                f3 = this.A08;
                f4 = f3;
                float f19 = f3 - f18;
                float f20 = 0.0f;
                if (f2 != 0.0f) {
                    f20 = (interpolation - 0.0f) / f2;
                }
                f5 = (f20 * f19) + f18;
                f6 = f18 - f3;
            }
            float f21 = 0.0f;
            if (f2 != f) {
                f21 = (interpolation - f) / f2;
            }
            f7 = (f21 * f6) + f3;
        }
        float f22 = f5 / 2.0f;
        float f23 = f7 / 2.0f;
        RectF rectF = this.A0H;
        float f24 = this.A0C;
        int i2 = this.A0E;
        float f25 = i2;
        rectF.set(0.0f, f24 - f22, f25, f24 + f22);
        RectF rectF2 = this.A0G;
        rectF2.set(0.0f, f24 - f23, f25, f24 + f23);
        canvas.save();
        RectF rectF3 = this.A0F;
        canvas.translate(rectF3.left, rectF3.top);
        Paint paint = this.A09;
        if (paint.getColor() != -1) {
            float f26 = this.A01;
            canvas.drawRoundRect(rectF3, f26, f26, paint);
        }
        float width = rectF3.width();
        float height = rectF3.height();
        float intrinsicWidth = getIntrinsicWidth();
        if (width > intrinsicWidth) {
            f8 = (width / 2.0f) - (intrinsicWidth / 2.0f);
        } else {
            f8 = 0.0f;
        }
        if (height > f4) {
            f9 = (height / 2.0f) - (f4 / 2.0f);
        } else {
            f9 = 0.0f;
        }
        canvas.translate(f8, f9);
        int i3 = 0;
        boolean z = true;
        loop0: while (true) {
            RectF rectF4 = rectF;
            do {
                int i4 = this.A03;
                if (i4 > 0) {
                    RectF rectF5 = this.A0I;
                    float f27 = -i4;
                    rectF5.left = rectF4.left + f27;
                    rectF5.top = rectF4.top + f27;
                    rectF5.right = rectF4.right - f27;
                    rectF5.bottom = rectF4.bottom - f27;
                    float f28 = this.A00;
                    canvas.drawRoundRect(rectF5, f28, f28, this.A0B);
                }
                float f29 = this.A06;
                canvas.drawRoundRect(rectF4, f29, f29, this.A0A);
                if (i3 >= 2) {
                    break loop0;
                }
                float f30 = this.A07 + i2;
                rectF.offset(f30, 0.0f);
                rectF2.offset(f30, 0.0f);
                z = !z;
                i3++;
                if (i3 >= 3) {
                    break loop0;
                } else {
                    rectF4 = rectF2;
                }
            } while (!z);
        }
        canvas.restore();
        if (this.A05) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A0F.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (this.A0E * 3) + (this.A07 * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.A04;
        if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.A04;
        if (colorStateList != null) {
            this.A0A.setColor(colorStateList.getColorForState(getState(), -1));
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0A.setAlpha(i);
        Paint paint = this.A09;
        if (paint.getColor() != -1) {
            paint.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0A.setColorFilter(colorFilter);
        this.A09.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Paint paint = this.A0A;
        paint.setShader(null);
        if (this.A04 != colorStateList) {
            this.A04 = colorStateList;
            if (colorStateList != null) {
                paint.setColor(colorStateList.getColorForState(getState(), -1));
            }
            invalidateSelf();
        }
    }

    public C138586Po(int i, int i2, int i3, int i4, boolean z) {
        Paint paint = new Paint(1);
        this.A0A = paint;
        Paint paint2 = new Paint(1);
        this.A0B = paint2;
        Paint paint3 = new Paint(1);
        this.A09 = paint3;
        this.A0F = new RectF();
        RectF rectF = new RectF();
        this.A0G = rectF;
        RectF rectF2 = new RectF();
        this.A0H = rectF2;
        this.A0I = new RectF();
        this.A02 = -1;
        this.A05 = true;
        this.A0E = i;
        this.A07 = i2;
        this.A08 = i3;
        this.A0D = i4;
        this.A0C = i3 - i4;
        float f = i;
        this.A06 = f / 2.0f;
        paint.setColor(z ? -16777216 : -1);
        paint3.setColor(-1);
        paint2.setColor(-1);
        rectF.set(0.0f, 0.0f, f, i4);
        rectF2.set(0.0f, 0.0f, f, i3);
    }
}
