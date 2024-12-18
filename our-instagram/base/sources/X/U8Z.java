package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class U8Z extends Drawable {
    public float A00;
    public C68657VZq A01;
    public C68657VZq A02;
    public float A03;
    public ValueAnimator A05;
    public boolean A06;
    public final C68657VZq[] A07;
    public final float A08;
    public final int A09;
    public final List A0C;
    public final boolean A0D;
    public final float[] A0E;
    public final ValueAnimator.AnimatorUpdateListener A0A = new C65759TtZ(this, 0);
    public final Path A0B = new Path();
    public int A04 = 255;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.Vka, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.Vka, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.Vka, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.Vka, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.Vka, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.Vka, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.Vka, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [X.Vka, java.lang.Object] */
    public U8Z(Context context, float[] fArr, int i, boolean z) {
        C68657VZq[] c68657VZqArr = new C68657VZq[4];
        this.A07 = c68657VZqArr;
        this.A09 = i;
        this.A0E = fArr;
        C14360o3.A0B(fArr, 0);
        int length = fArr.length;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (fArr[i2] > 0.0f) {
                z2 = true;
                break;
            }
            i2++;
        }
        this.A0D = z2;
        this.A08 = U5C.A00(context, 375.0f);
        this.A0C = Arrays.asList(new W36(0.0f, U5C.A00(context, 116.0f), 0, U5C.A00(context, 350.0f), -15173646, U5C.A00(context, 232.0f)), new W36(0.0f, U5C.A00(context, -219.0f), 1, U5C.A00(context, 226.0f), -14298266, U5C.A00(context, 153.0f)), new W36(U5C.A00(context, 124.0f), U5C.A00(context, -438.0f), 2, U5C.A00(context, 156.0f), -668109, U5C.A00(context, 100.0f)), new W36(U5C.A00(context, 238.0f), U5C.A00(context, -196.0f), 3, U5C.A00(context, 206.0f), -37796, U5C.A00(context, 132.0f)), new W36(U5C.A00(context, -175.0f), U5C.A00(context, 373.0f), 4, U5C.A00(context, 272.0f), -15173646, U5C.A00(context, 175.0f)), new W36(U5C.A00(context, 308.0f), U5C.A00(context, -71.0f), 5, U5C.A00(context, 176.0f), -6278145, U5C.A00(context, 119.0f)));
        HashMap hashMap = new HashMap();
        ?? obj = new Object();
        obj.A04 = true;
        obj.A01 = 90.0f;
        hashMap.put(-1, obj);
        ?? obj2 = new Object();
        obj2.A03 = true;
        hashMap.put(4, obj2);
        ?? obj3 = new Object();
        obj3.A02 = true;
        obj3.A00 = 0.5f;
        hashMap.put(5, obj3);
        c68657VZqArr[1] = new C68657VZq(hashMap);
        HashMap hashMap2 = new HashMap();
        ?? obj4 = new Object();
        obj4.A04 = true;
        obj4.A01 = 180.0f;
        hashMap2.put(-1, obj4);
        ?? obj5 = new Object();
        obj5.A02 = true;
        obj5.A00 = 0.5f;
        obj5.A03 = true;
        hashMap2.put(5, obj5);
        c68657VZqArr[2] = new C68657VZq(hashMap2);
        HashMap hashMap3 = new HashMap();
        ?? obj6 = new Object();
        obj6.A04 = true;
        obj6.A01 = 270.0f;
        hashMap3.put(-1, obj6);
        ?? obj7 = new Object();
        obj7.A02 = true;
        obj7.A00 = 0.5f;
        hashMap3.put(5, obj7);
        ?? obj8 = new Object();
        obj8.A03 = true;
        hashMap3.put(1, obj8);
        c68657VZqArr[3] = new C68657VZq(hashMap3);
        setAlpha(z ? 10 : 8);
    }

    public final void A01(boolean z) {
        if (this.A06 != z) {
            ValueAnimator valueAnimator = this.A05;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.A05 = null;
            }
            if (z) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.A05 = valueAnimator2;
                valueAnimator2.addUpdateListener(this.A0A);
                this.A05.setRepeatCount(-1);
                this.A05.setDuration(this.A07.length * 3000);
                this.A05.setFloatValues(0.0f, 1.0f);
                AbstractC43593JPy.A18(this.A05);
                this.A05.start();
            }
            this.A06 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C69266Vka c69266Vka;
        C69266Vka c69266Vka2;
        float f;
        float f2;
        C69266Vka c69266Vka3;
        C69266Vka c69266Vka4;
        float f3;
        float f4;
        int save = canvas.save();
        if (this.A0D) {
            canvas.clipPath(this.A0B);
        }
        if (this.A03 > 1.0f) {
            Rect bounds = getBounds();
            float f5 = this.A03;
            canvas.scale(f5, f5, bounds.exactCenterX(), bounds.exactCenterY());
        }
        canvas.drawColor(this.A09);
        C68657VZq c68657VZq = this.A01;
        if (c68657VZq != null) {
            c69266Vka = (C69266Vka) AbstractC166997dE.A0m(c68657VZq.A00, -1);
        } else {
            c69266Vka = null;
        }
        C68657VZq c68657VZq2 = this.A02;
        if (c68657VZq2 != null) {
            c69266Vka2 = (C69266Vka) AbstractC166997dE.A0m(c68657VZq2.A00, -1);
        } else {
            c69266Vka2 = null;
        }
        if (c69266Vka != null && c69266Vka.A04) {
            f = c69266Vka.A01;
        } else {
            f = 0.0f;
        }
        if (c69266Vka2 != null && c69266Vka2.A04) {
            f2 = c69266Vka2.A01;
        } else {
            f2 = 0.0f;
        }
        if (f == 270.0f && f2 == 0.0f) {
            f2 = 360.0f;
        }
        float f6 = f + (this.A00 * (f2 - f));
        Rect bounds2 = getBounds();
        if (f6 != 0.0f) {
            canvas.rotate(f6, bounds2.exactCenterX(), bounds2.exactCenterY());
        }
        for (W36 w36 : this.A0C) {
            int save2 = canvas.save();
            C68657VZq c68657VZq3 = this.A01;
            if (c68657VZq3 != null) {
                c69266Vka3 = (C69266Vka) AbstractC166997dE.A0m(c68657VZq3.A00, w36.A06);
            } else {
                c69266Vka3 = null;
            }
            C68657VZq c68657VZq4 = this.A02;
            if (c68657VZq4 != null) {
                c69266Vka4 = (C69266Vka) AbstractC166997dE.A0m(c68657VZq4.A00, w36.A06);
            } else {
                c69266Vka4 = null;
            }
            float f7 = w36.A00;
            float exactCenterX = bounds2.exactCenterX();
            if (c69266Vka3 != null && c69266Vka3.A03) {
                f3 = 0.0f + exactCenterX;
            } else {
                f3 = f7;
            }
            if (c69266Vka4 != null && c69266Vka4.A03) {
                f7 = exactCenterX + 0.0f;
            }
            float f8 = f3 + (this.A00 * (f7 - f3));
            float f9 = w36.A01;
            float exactCenterY = bounds2.exactCenterY();
            if (c69266Vka3 != null && c69266Vka3.A03) {
                f4 = 0.0f + exactCenterY;
            } else {
                f4 = f9;
            }
            if (c69266Vka4 != null && c69266Vka4.A03) {
                f9 = exactCenterY + 0.0f;
            }
            canvas.translate(f8, f4 + (this.A00 * (f9 - f4)));
            float f10 = w36.A04;
            float f11 = w36.A05;
            float max = Math.max(f10, f11);
            canvas.scale(1.0f, Math.min(f10, f11) / max);
            C69266Vka c69266Vka5 = c69266Vka3;
            C69266Vka c69266Vka6 = c69266Vka4;
            A00(canvas, w36.A09, c69266Vka5, c69266Vka6, max * 2.0f);
            A00(canvas, w36.A08, c69266Vka5, c69266Vka6, max * 1.5f);
            A00(canvas, w36.A07, c69266Vka3, c69266Vka4, max);
            canvas.restoreToCount(save2);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A04 = i;
        for (W36 w36 : this.A0C) {
            w36.A07.setAlpha(i);
            w36.A08.setAlpha(i);
            w36.A09.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        for (W36 w36 : this.A0C) {
            w36.A07.setColorFilter(colorFilter);
            w36.A08.setColorFilter(colorFilter);
            w36.A09.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z3 = this.A06;
        if (!z) {
            if (z3 && (valueAnimator2 = this.A05) != null && valueAnimator2.isStarted()) {
                this.A05.cancel();
            }
        } else if (z3 && (valueAnimator = this.A05) != null && !valueAnimator.isStarted()) {
            this.A05.start();
        }
        return super.setVisible(z, z2);
    }

    private void A00(Canvas canvas, Paint paint, C69266Vka c69266Vka, C69266Vka c69266Vka2, float f) {
        float f2;
        int alpha = paint.getAlpha();
        float f3 = 1.0f;
        if (c69266Vka != null && c69266Vka.A02) {
            f2 = c69266Vka.A00;
        } else {
            f2 = 1.0f;
        }
        if (c69266Vka2 != null && c69266Vka2.A02) {
            f3 = c69266Vka2.A00;
        }
        float alpha2 = paint.getAlpha();
        float f4 = f2 * alpha2;
        paint.setAlpha((int) (f4 + (this.A00 * ((f3 * alpha2) - f4))));
        canvas.drawCircle(0.0f, 0.0f, f, paint);
        paint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float f;
        super.onBoundsChange(rect);
        for (W36 w36 : this.A0C) {
            w36.A00 = rect.centerX() + w36.A02;
            w36.A01 = rect.centerY() + w36.A03;
        }
        Path path = this.A0B;
        path.reset();
        path.addRoundRect(new RectF(rect), this.A0E, Path.Direction.CW);
        path.close();
        float width = rect.width();
        float f2 = this.A08;
        if (width > f2) {
            f = width / f2;
        } else {
            f = 0.0f;
        }
        this.A03 = f;
    }
}
