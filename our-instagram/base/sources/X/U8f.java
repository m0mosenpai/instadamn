package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class U8f extends Drawable implements Animatable {
    public AnimatorSet A00;
    public boolean A01;
    public final List A02 = new ArrayList();
    public final List A03;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        C14360o3.A0B(canvas, 0);
        for (C70099W2z c70099W2z : this.A03) {
            Paint paint = c70099W2z.A01;
            if (paint != null) {
                C69329Vlb c69329Vlb = c70099W2z.A05;
                float f2 = c69329Vlb.A02;
                C69329Vlb c69329Vlb2 = c70099W2z.A04;
                float f3 = c69329Vlb2.A02;
                float f4 = c70099W2z.A00;
                float f5 = c69329Vlb.A03;
                float f6 = f5 + ((c69329Vlb2.A03 - f5) * f4);
                float f7 = c69329Vlb.A04;
                float f8 = f7 + ((c69329Vlb2.A04 - f7) * f4);
                float f9 = c69329Vlb.A05;
                float f10 = f9 + ((c69329Vlb2.A05 - f9) * f4);
                float f11 = c69329Vlb.A00;
                float f12 = f11 + ((c69329Vlb2.A00 - f11) * f4);
                float f13 = c69329Vlb.A01;
                float f14 = f13 + (f4 * (c69329Vlb2.A01 - f13));
                float sqrt = (float) Math.sqrt(((float) Math.pow(f6 - (f2 + ((f3 - f2) * f4)), 2.0d)) + ((float) Math.pow(f10 - f8, 2.0d)));
                float sqrt2 = (float) Math.sqrt(((float) Math.pow(f5 - f2, 2.0d)) + ((float) Math.pow(f9 - f7, 2.0d)));
                if (sqrt2 == 0.0f) {
                    f = 1.0f;
                } else {
                    f = sqrt / sqrt2;
                }
                float A0H = AbstractC166997dE.A0H(this) * f11;
                float A0G = AbstractC166997dE.A0G(this) * f13;
                canvas.save();
                canvas.translate((AbstractC166997dE.A0H(this) * f12) - A0H, (AbstractC166997dE.A0G(this) * f14) - A0G);
                canvas.rotate(c70099W2z.A00 * c70099W2z.A02, A0H, A0G);
                canvas.scale(f, f, A0H, A0G);
                canvas.drawPaint(paint);
                canvas.restore();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        for (C70099W2z c70099W2z : this.A03) {
            float width = rect.width();
            float height = rect.height();
            Paint paint = c70099W2z.A01;
            if (paint == null) {
                paint = new Paint(5);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                c70099W2z.A01 = paint;
            }
            C69329Vlb c69329Vlb = c70099W2z.A05;
            paint.setShader(new LinearGradient(c69329Vlb.A02 * width, c69329Vlb.A04 * height, c69329Vlb.A03 * width, c69329Vlb.A05 * height, c70099W2z.A07, (float[]) null, Shader.TileMode.CLAMP));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        A00(true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        A00(false);
    }

    private final void A00(boolean z) {
        if (this.A01 != z) {
            AnimatorSet animatorSet = this.A00;
            if (animatorSet != null) {
                animatorSet.cancel();
                animatorSet.removeAllListeners();
                List list = this.A02;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Animator) it.next()).removeAllListeners();
                }
                this.A00 = null;
                list.clear();
            }
            if (z) {
                for (C70099W2z c70099W2z : this.A03) {
                    int i = 2;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    AbstractC43593JPy.A18(ofFloat);
                    boolean z2 = c70099W2z.A06;
                    if (!z2) {
                        i = 1;
                    }
                    ofFloat.setRepeatMode(i);
                    int i2 = 0;
                    if (z2) {
                        i2 = -1;
                    }
                    ofFloat.setRepeatCount(i2);
                    ofFloat.setDuration(c70099W2z.A03);
                    ofFloat.addUpdateListener(new WH5(0, c70099W2z, this));
                    this.A02.add(ofFloat);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(this.A02);
                animatorSet2.start();
                this.A00 = animatorSet2;
            }
            this.A01 = z;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        AnimatorSet animatorSet = this.A00;
        if (animatorSet != null) {
            return animatorSet.isRunning();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            Paint paint = ((C70099W2z) it.next()).A01;
            if (paint != null) {
                paint.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        AnimatorSet animatorSet = this.A00;
        if (animatorSet != null) {
            if (!z) {
                animatorSet.pause();
            } else {
                animatorSet.resume();
            }
        }
        return super.setVisible(z, z2);
    }

    public U8f(List list) {
        this.A03 = list;
    }
}
