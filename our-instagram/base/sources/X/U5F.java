package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import kotlin.Deprecated;

/* loaded from: classes11.dex */
public final class U5F extends Drawable implements Animatable {
    public float A00;
    public float A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final ValueAnimator.AnimatorUpdateListener A05;
    public final ValueAnimator A06;
    public final Paint A07;
    public final RectF A08;
    public static final Interpolator A0A = new LinearInterpolator();
    public static final Interpolator A09 = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
    public static final float[] A0D = {0.0f, 0.7f, 0.45f, 0.7f, 0.0f};
    public static final float[] A0B = {0.8f, 0.8f, 1.0f, 0.8f, 0.8f};
    public static final float[] A0C = {0.0f, 180.0f, 360.0f, 540.0f, 1080.0f};

    public U5F(Context context, float f, int i, int i2) {
        this.A03 = i;
        this.A04 = i2;
        Paint paint = new Paint(1);
        this.A07 = paint;
        this.A08 = new RectF();
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A06 = valueAnimator;
        this.A01 = -90.0f;
        C65759TtZ c65759TtZ = new C65759TtZ(this, 19);
        this.A05 = c65759TtZ;
        valueAnimator.setInterpolator(A0A);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(c65759TtZ);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setDuration(2000L);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(TypedValue.applyDimension(1, f, AbstractC167007dF.A0K(context)));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Paint paint = this.A07;
        paint.setColor(this.A03);
        canvas.drawArc(this.A08, this.A01, this.A00, false, paint);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        float strokeWidth = this.A07.getStrokeWidth() / 2.0f;
        RectF rectF = this.A08;
        rectF.set(rect);
        rectF.offset(strokeWidth, strokeWidth);
        int i = rect.left;
        int i2 = this.A04;
        rectF.right = (i + i2) - strokeWidth;
        rectF.bottom = (rect.top + i2) - strokeWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A04;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.A06.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = this.A02;
        if (!z) {
            if (z3) {
                this.A06.cancel();
            }
        } else if (z3) {
            this.A06.start();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.A06.start();
        this.A02 = true;
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.A06.cancel();
        this.A02 = false;
    }
}
