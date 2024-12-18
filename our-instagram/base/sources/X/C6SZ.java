package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* renamed from: X.6SZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6SZ extends Drawable implements ValueAnimator.AnimatorUpdateListener {
    public float A00;
    public float A01;
    public int A02;
    public ValueAnimator A03;
    public int[] A04;
    public float A05;
    public float A06;
    public float A07;
    public final Paint A08;

    public C6SZ(Context context, int i, int i2) {
        int[] iArr = {context.getColor(i), context.getColor(i2)};
        this.A08 = new Paint();
        this.A00 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A03 = ofFloat;
        this.A04 = iArr;
        this.A02 = 10000;
        this.A01 = 1.0f;
        ofFloat.addUpdateListener(this);
        ofFloat.setDuration(this.A02);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A08.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.rotate(this.A00, this.A05, this.A06);
        canvas.drawCircle(this.A05, this.A06, this.A07, this.A08);
        canvas.restore();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00 = ((Number) valueAnimator.getAnimatedValue()).floatValue() * 360.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float f;
        float f2;
        float f3;
        float f4;
        float width = rect.width();
        float height = rect.height();
        this.A07 = ((float) Math.sqrt((width * width) + (height * height))) / 2.0f;
        this.A05 = width / 2.0f;
        this.A06 = height / 2.0f;
        float f5 = this.A01;
        float f6 = 1.0f - f5;
        if (width > height) {
            f3 = (f6 * width) / 2.0f;
            f4 = width * (((f5 - 1.0f) / 2.0f) + 1.0f);
            f2 = 0.0f;
            f = 0.0f;
        } else {
            float f7 = (f6 * height) / 2.0f;
            f = height * (((f5 - 1.0f) / 2.0f) + 1.0f);
            f2 = f7;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        this.A08.setShader(new LinearGradient(f3, f2, f4, f, this.A04, (float[]) null, Shader.TileMode.CLAMP));
    }
}
