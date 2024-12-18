package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.view.animation.LinearInterpolator;
import com.instagram.common.session.UserSession;

/* renamed from: X.BIm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25317BIm extends Drawable {
    public float A00;
    public int A01;
    public C6RB A02;
    public boolean A03;
    public C6RB A04;
    public Integer A05;
    public final int A06;
    public final int A07;
    public final ValueAnimator A08;
    public final Context A09;
    public final Drawable A0A;
    public final JV1 A0B;

    public C25317BIm(Context context, Typeface typeface, Drawable drawable, Spannable spannable, UserSession userSession, int i, int i2) {
        C6RB A01;
        int i3;
        C14360o3.A0B(spannable, 3);
        this.A09 = context;
        this.A0A = drawable;
        JV1 jv1 = new JV1(typeface, spannable, i, i2);
        this.A0B = jv1;
        this.A03 = true;
        if (userSession != null) {
            A01 = ((BOW) userSession.A01(BOW.class, BPJ.A00)).A00(AbstractC166987dD.A0O(context), jv1);
            this.A02 = A01;
        } else {
            int A00 = AbstractC43745JWf.A00(context, jv1);
            this.A02 = AbstractC43745JWf.A01(this.A09, this.A0B, A00);
            A01 = AbstractC43745JWf.A01(this.A09, this.A0B, A00);
        }
        this.A04 = A01;
        int A0D = AbstractC167017dG.A0D(context);
        this.A08 = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (drawable != null) {
            i3 = drawable.getIntrinsicWidth() + A0D;
        } else {
            i3 = 0;
        }
        this.A07 = i3;
        this.A06 = C1H4.A01(AbstractC13880nE.A04(context, 12));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String str;
        C14360o3.A0B(canvas, 0);
        canvas.save();
        Drawable drawable = this.A0A;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Rect bounds = getBounds();
        C14360o3.A07(bounds);
        int i = bounds.left;
        int i2 = this.A07;
        canvas.clipRect(i + i2, bounds.top, bounds.right, bounds.bottom);
        canvas.translate((-this.A00) + i2, 0.0f);
        C6RB c6rb = this.A02;
        if (c6rb == null) {
            str = "textDrawableStart";
        } else {
            c6rb.draw(canvas);
            if (this.A03) {
                canvas.translate(c6rb.A0A + this.A06, 0.0f);
                C6RB c6rb2 = this.A04;
                if (c6rb2 == null) {
                    str = "textDrawableEnd";
                } else {
                    c6rb2.draw(canvas);
                }
            }
            canvas.restore();
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void A00() {
        C6RB c6rb = this.A02;
        if (c6rb == null) {
            C14360o3.A0F("textDrawableStart");
            throw C00O.createAndThrow();
        }
        this.A01 = c6rb.A0A + this.A06;
        ValueAnimator valueAnimator = this.A08;
        valueAnimator.setDuration(r1 * 15);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setRepeatMode(1);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addListener(new BQM(this, 1));
        valueAnimator.addUpdateListener(new BFF(this, 14));
    }

    public final void A01() {
        ValueAnimator valueAnimator = this.A08;
        if (!valueAnimator.isStarted()) {
            valueAnimator.start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r2 > r4.intValue()) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(java.lang.Integer r4, java.lang.Integer r5) {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.A05
            boolean r0 = X.C14360o3.A0K(r4, r0)
            if (r0 == 0) goto Ld
            boolean r0 = r3.A03
            if (r0 != 0) goto Ld
            return
        Ld:
            r3.A05 = r4
            if (r4 == 0) goto L37
            if (r5 == 0) goto L1d
            int r1 = r5.intValue()
            int r0 = r4.intValue()
            if (r1 > r0) goto L37
        L1d:
            int r2 = r3.A07
            X.6RB r0 = r3.A02
            if (r0 != 0) goto L2d
            java.lang.String r0 = "textDrawableStart"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L2d:
            int r0 = r0.A0A
            int r2 = r2 + r0
            int r1 = r4.intValue()
            r0 = 0
            if (r2 <= r1) goto L38
        L37:
            r0 = 1
        L38:
            r3.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25317BIm.A02(java.lang.Integer, java.lang.Integer):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.A0A;
        if (drawable != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            C6RB c6rb = this.A02;
            if (c6rb != null) {
                return Math.max(intrinsicHeight, c6rb.A06);
            }
        } else {
            C6RB c6rb2 = this.A02;
            if (c6rb2 != null) {
                return c6rb2.A06;
            }
        }
        C14360o3.A0F("textDrawableStart");
        throw C00O.createAndThrow();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        String str;
        C6RB c6rb = this.A02;
        if (c6rb == null) {
            str = "textDrawableStart";
        } else {
            c6rb.setAlpha(i);
            C6RB c6rb2 = this.A04;
            if (c6rb2 == null) {
                str = "textDrawableEnd";
            } else {
                c6rb2.setAlpha(i);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        String str;
        C6RB c6rb = this.A02;
        if (c6rb == null) {
            str = "textDrawableStart";
        } else {
            c6rb.setColorFilter(colorFilter);
            C6RB c6rb2 = this.A04;
            if (c6rb2 == null) {
                str = "textDrawableEnd";
            } else {
                c6rb2.setColorFilter(colorFilter);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        String str;
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A0A;
        if (drawable != null) {
            int i5 = (i4 - i2) / 2;
            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
            drawable.setBounds(i, i5 - intrinsicHeight, drawable.getIntrinsicWidth() + i, i5 + intrinsicHeight);
        }
        C6RB c6rb = this.A02;
        if (c6rb == null) {
            str = "textDrawableStart";
        } else {
            c6rb.setBounds(i, i2, i3, i4);
            C6RB c6rb2 = this.A04;
            if (c6rb2 == null) {
                str = "textDrawableEnd";
            } else {
                c6rb2.setBounds(i, i2, i3, i4);
                A00();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
