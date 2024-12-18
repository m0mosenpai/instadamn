package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* renamed from: X.3qO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84743qO extends Drawable {
    public float A00;
    public ValueAnimator A01;
    public C84793qT A02;
    public final ValueAnimator.AnimatorUpdateListener A03 = new ValueAnimator.AnimatorUpdateListener() { // from class: X.3qP
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C84743qO.this.invalidateSelf();
        }
    };
    public final Matrix A04;
    public final Paint A05;
    public final Rect A06;

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void A01() {
        C84793qT c84793qT;
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null && !valueAnimator.isStarted() && (c84793qT = this.A02) != null && c84793qT.A0H && getCallback() != null) {
            this.A01.start();
        }
    }

    public final void A02() {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null && !valueAnimator.isStarted() && getCallback() != null) {
            this.A01.start();
        }
    }

    public final void A03(C84793qT c84793qT) {
        boolean z;
        PorterDuff.Mode mode;
        this.A02 = c84793qT;
        if (c84793qT != null) {
            Paint paint = this.A05;
            if (c84793qT.A0G) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        A00();
        if (this.A02 != null) {
            ValueAnimator valueAnimator = this.A01;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                this.A01.cancel();
                this.A01.removeAllUpdateListeners();
            } else {
                z = false;
            }
            C84793qT c84793qT2 = this.A02;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (c84793qT2.A0E / c84793qT2.A0D)) + 1.0f);
            this.A01 = ofFloat;
            ofFloat.setInterpolator(new LinearInterpolator());
            this.A01.setRepeatMode(this.A02.A0B);
            this.A01.setStartDelay(this.A02.A0F);
            this.A01.setRepeatCount(this.A02.A0A);
            ValueAnimator valueAnimator2 = this.A01;
            C84793qT c84793qT3 = this.A02;
            valueAnimator2.setDuration(c84793qT3.A0D + c84793qT3.A0E);
            this.A01.addUpdateListener(this.A03);
            if (z) {
                this.A01.start();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        if (this.A02 != null) {
            Paint paint = this.A05;
            if (paint.getShader() != null) {
                float tan = (float) Math.tan(Math.toRadians(this.A02.A03));
                Rect rect = this.A06;
                float height = rect.height() + (rect.width() * tan);
                float width = rect.width() + (tan * rect.height());
                float f2 = this.A00;
                float f3 = 0.0f;
                if (f2 < 0.0f) {
                    ValueAnimator valueAnimator = this.A01;
                    if (valueAnimator != null) {
                        f2 = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                    } else {
                        f2 = 0.0f;
                    }
                }
                int i = this.A02.A06;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            float f4 = -width;
                            f3 = f4 + ((width - f4) * f2);
                        } else {
                            f = (((-height) - height) * f2) + height;
                        }
                    } else {
                        f3 = width + (((-width) - width) * f2);
                    }
                    f = 0.0f;
                } else {
                    float f5 = -height;
                    f = f5 + ((height - f5) * f2);
                }
                Matrix matrix = this.A04;
                matrix.reset();
                matrix.setRotate(this.A02.A03, rect.width() / 2.0f, rect.height() / 2.0f);
                matrix.preTranslate(f3, f);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        C84793qT c84793qT = this.A02;
        if (c84793qT != null) {
            if (c84793qT.A0I || c84793qT.A0G) {
                return -3;
            }
            return -1;
        }
        return -1;
    }

    public C84743qO() {
        Paint paint = new Paint();
        this.A05 = paint;
        this.A06 = new Rect();
        this.A04 = new Matrix();
        this.A00 = -1.0f;
        paint.setAntiAlias(true);
    }

    private void A00() {
        C84793qT c84793qT;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (c84793qT = this.A02) != null) {
            int i = c84793qT.A08;
            if (i <= 0) {
                i = Math.round(c84793qT.A04 * width);
            }
            int i2 = c84793qT.A07;
            if (i2 <= 0) {
                i2 = Math.round(c84793qT.A01 * height);
            }
            if (c84793qT.A0C != 1) {
                int i3 = c84793qT.A06;
                if (i3 != 1 && i3 != 3) {
                    i2 = 0;
                } else {
                    i = 0;
                }
                radialGradient = new LinearGradient(0.0f, 0.0f, i, i2, c84793qT.A0L, c84793qT.A0K, Shader.TileMode.CLAMP);
            } else {
                radialGradient = new RadialGradient(i / 2.0f, i2 / 2.0f, (float) (Math.max(i, i2) / Math.sqrt(2.0d)), c84793qT.A0L, c84793qT.A0K, Shader.TileMode.CLAMP);
            }
            this.A05.setShader(radialGradient);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A06.set(rect);
        A00();
        A01();
    }
}
