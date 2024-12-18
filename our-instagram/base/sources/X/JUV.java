package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* loaded from: classes8.dex */
public abstract class JUV extends Drawable {
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public int A02 = -1;
    public int A01 = -1;
    public float A00 = 1.0f;
    public final C47220Ktt[] A08 = new C47220Ktt[3];

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i = 0;
        while (true) {
            C47220Ktt[] c47220KttArr = this.A08;
            if (i < c47220KttArr.length) {
                c47220KttArr[i].A00.setColorFilter(colorFilter);
                i++;
            } else {
                return;
            }
        }
    }

    public final void start() {
        JUX jux = (JUX) this;
        if (!jux.A01) {
            jux.A01 = true;
            AnimatorSet animatorSet = jux.A00;
            if (animatorSet != null) {
                animatorSet.start();
            }
            jux.invalidateSelf();
        }
    }

    public final void stop() {
        JUX jux = (JUX) this;
        if (jux.A01) {
            jux.A01 = false;
            AnimatorSet animatorSet = jux.A00;
            if (animatorSet != null && animatorSet.isStarted()) {
                jux.A00.end();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = this.A05;
        float f = this.A00;
        int i2 = (int) (i * f);
        int i3 = (int) (f * this.A04);
        int i4 = (this.A01 - i) / 2;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            C47220Ktt[] c47220KttArr = this.A08;
            if (i5 < c47220KttArr.length) {
                int i7 = i6 + i2;
                int round = Math.round(((Number) ((JUX) this).A02[i5].getAnimatedValue()).floatValue()) + i4;
                Drawable drawable = c47220KttArr[i5].A00;
                drawable.setBounds(i6, round, i7, round + i2);
                drawable.draw(canvas);
                i6 = i7 + i3;
                i5++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A07;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.A07;
    }

    public JUV(int i, int i2, int i3) {
        this.A05 = i;
        this.A04 = i2;
        this.A03 = i3;
        int i4 = 0;
        this.A07 = (i * 3) + (Math.max(0, 2) * i2);
        this.A06 = i + (i3 * 2);
        while (true) {
            C47220Ktt[] c47220KttArr = this.A08;
            if (i4 < c47220KttArr.length) {
                int i5 = this.A05;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                AbstractC166987dD.A1R(shapeDrawable.getPaint());
                shapeDrawable.setIntrinsicHeight(i5);
                shapeDrawable.setIntrinsicWidth(i5);
                c47220KttArr[i4] = new C47220Ktt(shapeDrawable);
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        super.setBounds(i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.A02 == i5 && this.A01 == i6) {
            return;
        }
        this.A02 = i5;
        this.A01 = i6;
        int i7 = this.A07;
        float f3 = 1.0f;
        if (i7 <= i5) {
            f = 1.0f;
        } else {
            f = i5 / i7;
        }
        int i8 = this.A05;
        if (i8 > i6) {
            f3 = i6 / i8;
        }
        this.A00 = Math.min(f, f3);
        JUX jux = (JUX) this;
        int min = (int) Math.min(jux.A03, i6 - ((jux.A05 * ((JUV) jux).A00) / 2.0f));
        float abs = Math.abs(AbstractC47204Ktd.A00);
        float abs2 = Math.abs(AbstractC47204Ktd.A01);
        float f4 = 1.0f;
        if (abs == 0.0f) {
            f2 = 1.0f;
        } else {
            f2 = min / abs;
        }
        if (abs2 != 0.0f) {
            f4 = min / abs2;
        }
        float min2 = Math.min(f2, f4);
        float[] fArr = AbstractC47204Ktd.A02;
        float[] fArr2 = new float[98];
        int i9 = 0;
        do {
            fArr2[i9] = (fArr[i9] * min2) + 0.0f;
            i9++;
        } while (i9 < 98);
        float[] fArr3 = AbstractC47204Ktd.A03;
        float[] fArr4 = new float[98];
        int i10 = 0;
        do {
            fArr4[i10] = (fArr3[i10] * min2) + 0.0f;
            i10++;
        } while (i10 < 98);
        float[] fArr5 = AbstractC47204Ktd.A04;
        float[] fArr6 = new float[98];
        int i11 = 0;
        do {
            fArr6[i11] = (fArr5[i11] * min2) + 0.0f;
            i11++;
        } while (i11 < 98);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(fArr2);
        valueAnimator.setRepeatCount(-1);
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setFloatValues(fArr4);
        valueAnimator2.setRepeatCount(-1);
        ValueAnimator valueAnimator3 = new ValueAnimator();
        valueAnimator3.setFloatValues(fArr6);
        valueAnimator3.setRepeatCount(-1);
        ValueAnimator[] valueAnimatorArr = {valueAnimator, valueAnimator2, valueAnimator3};
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new LLs(animatorSet, 0));
        animatorSet.playTogether(valueAnimatorArr[0], valueAnimatorArr[1], valueAnimatorArr[2]);
        animatorSet.setDuration(1633L);
        ValueAnimator[] valueAnimatorArr2 = jux.A02;
        int length = valueAnimatorArr2.length;
        if (length == 3) {
            boolean isRunning = jux.isRunning();
            if (isRunning) {
                jux.stop();
            }
            jux.A00 = animatorSet;
            System.arraycopy(valueAnimatorArr, 0, valueAnimatorArr2, 0, length);
            if (!isRunning) {
                return;
            }
            jux.start();
            return;
        }
        throw new IllegalStateException();
    }
}
