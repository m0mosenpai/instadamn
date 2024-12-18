package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.view.animation.AlphaAnimation;
import android.view.animation.Transformation;

/* renamed from: X.710, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass710 extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public int A0B;
    public long A0C;
    public final AlphaAnimation A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final RectF A0J;
    public final Transformation A0K;
    public final int[] A0L;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void A01(float f) {
        this.A08 = f;
        if (f < 0.5f) {
            this.A03 = false;
        }
        invalidateSelf();
    }

    public final void A02(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            if (z) {
                this.A0C = System.currentTimeMillis();
                if (this.A05) {
                    AlphaAnimation alphaAnimation = this.A0D;
                    alphaAnimation.reset();
                    alphaAnimation.setStartTime(-1L);
                    alphaAnimation.start();
                }
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        boolean z;
        Paint paint;
        Rect bounds = getBounds();
        float f2 = this.A08;
        float f3 = 0.0f;
        int round = Math.round(AbstractC13600mm.A02(f2, 0.5f, 1.0f, 0.0f, 190.0f));
        int round2 = Math.round(AbstractC13600mm.A02(f2, 0.5f, 1.0f, 0.0f, 255.0f));
        RectF rectF = this.A0J;
        rectF.set(bounds);
        float f4 = this.A0E;
        rectF.inset(f4, f4);
        float f5 = this.A06;
        float f6 = this.A09;
        float f7 = this.A07;
        rectF.set(f5 - f6, f7 - f6, f5 + f6, f7 + f6);
        if (!this.A04 && !this.A03) {
            Paint paint2 = this.A0I;
            paint2.setColor(this.A0G);
            if (paint2.getColor() != 0) {
                paint2.setAlpha(round);
            }
            canvas.drawCircle(this.A06, this.A07, this.A09, paint2);
            paint2.setColor(this.A0F);
            if (paint2.getColor() != 0) {
                paint2.setAlpha(round);
            }
            f = AbstractC13600mm.A02(this.A08, 0.5f, 1.0f, 0.0f, 360.0f);
            f3 = -90.0f;
            z = false;
            paint = paint2;
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.A0C;
            if (this.A05) {
                AlphaAnimation alphaAnimation = this.A0D;
                Transformation transformation = this.A0K;
                if (alphaAnimation.getTransformation(currentTimeMillis, transformation)) {
                    float abs = 1.2f - Math.abs(transformation.getAlpha());
                    canvas.scale(abs, abs, bounds.width() / 2.0f, bounds.height() / 2.0f);
                }
            }
            Paint paint3 = this.A0I;
            paint3.setColor(this.A0G);
            if (paint3.getColor() != 0) {
                paint3.setAlpha(round);
            }
            canvas.drawCircle(this.A06, this.A07, this.A09, paint3);
            paint3.setColor(this.A0F);
            float f8 = (float) currentTimeMillis;
            int A02 = (int) AbstractC13600mm.A02(f8, 0.0f, 300.0f, round, 0.0f);
            if (paint3.getColor() != 0) {
                paint3.setAlpha(A02);
            }
            canvas.drawCircle(this.A06, this.A07, this.A09, paint3);
            float A01 = AbstractC13600mm.A01((float) (currentTimeMillis % 750), 0.0f, 750.0f, 0.0f, 1.0f) * 360.0f;
            double A012 = AbstractC13600mm.A01(f8, 0.0f, 1250.0f, 0.0f, 1.0f);
            double floor = Math.floor(A012);
            float f9 = (float) (A012 - floor);
            if (floor % 2.0d == 1.0d) {
                f9 = 1.0f - f9;
            }
            f = f9 * 225.0f;
            if (this.A0B != 0) {
                this.A0H.setAlpha(round2);
            }
            canvas.rotate(A01 - 90.0f, this.A06, this.A07);
            z = false;
            paint = this.A0H;
        }
        canvas.drawArc(rectF, f3, f, z, paint);
        if (this.A04 || this.A03) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A02;
    }

    public AnonymousClass710(int[] iArr, float f, int i, int i2, int i3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(-0.2f, 0.2f);
        this.A0D = alphaAnimation;
        this.A0K = new Transformation();
        this.A02 = -1;
        this.A01 = -1;
        this.A0G = i;
        this.A0F = i2;
        this.A0L = iArr;
        this.A0A = f;
        alphaAnimation.setDuration(300L);
        Paint paint = new Paint(1);
        this.A0I = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(this.A0A);
        Paint paint2 = new Paint();
        this.A0H = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(this.A0A);
        this.A0E = i3;
        this.A0J = new RectF();
        this.A00 = 0.5f / 2.0f;
    }

    public static AnonymousClass710 A00(Context context, int[] iArr, float f, int i, int i2, int i3) {
        int color = context.getColor(i);
        int color2 = context.getColor(i2);
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr2[i4] = context.getColor(iArr[i4]);
        }
        return new AnonymousClass710(iArr2, AbstractC13880nE.A00(context, f), color, color2, i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int width = rect.width();
        int height = rect.height();
        float f = width;
        float f2 = f / 2.0f;
        this.A06 = f2;
        float f3 = height / 2.0f;
        this.A07 = f3;
        this.A09 = (f * this.A00) - (this.A0A / 2.0f);
        SweepGradient sweepGradient = new SweepGradient(f2, f3, this.A0L, (float[]) null);
        Paint paint = this.A0H;
        paint.setShader(sweepGradient);
        this.A0B = paint.getColor();
    }

    public AnonymousClass710() {
    }
}
