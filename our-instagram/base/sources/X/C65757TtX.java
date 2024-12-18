package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* renamed from: X.TtX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65757TtX {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public float A0F;
    public float A0G;
    public float A0H;
    public float A0I;
    public float A0J;
    public float A0L;
    public float A0M;
    public int A0Q;
    public TimeInterpolator A0U;
    public TimeInterpolator A0V;
    public ColorStateList A0W;
    public ColorStateList A0X;
    public ColorStateList A0Y;
    public ColorStateList A0Z;
    public Typeface A0a;
    public Typeface A0b;
    public StaticLayout A0c;
    public C67767Uxi A0d;
    public C67767Uxi A0e;
    public CharSequence A0f;
    public CharSequence A0g;
    public CharSequence A0h;
    public boolean A0i;
    public boolean A0j;
    public int[] A0l;
    public float A0m;
    public Typeface A0n;
    public boolean A0o;
    public boolean A0p;
    public final Rect A0q;
    public final Rect A0r;
    public final RectF A0s;
    public final TextPaint A0t;
    public final TextPaint A0u;
    public final View A0v;
    public int A0R = 16;
    public int A0P = 16;
    public float A0K = 15.0f;
    public float A07 = 15.0f;
    public boolean A0k = true;
    public int A0T = 1;
    public float A0N = 0.0f;
    public float A0O = 1.0f;
    public int A0S = 1;

    public static int A01(ColorStateList colorStateList, C65757TtX c65757TtX) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = c65757TtX.A0l;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void A07(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.A0E) {
            this.A0E = f;
            A02();
        }
    }

    public final void A0E(Canvas canvas) {
        float lineLeft;
        int save = canvas.save();
        if (this.A0g != null && this.A0p) {
            int i = this.A0T;
            StaticLayout staticLayout = this.A0c;
            if (i > 1) {
                lineLeft = staticLayout.getLineStart(0);
            } else {
                lineLeft = staticLayout.getLineLeft(0);
            }
            float f = (this.A08 + lineLeft) - (this.A0D * 2.0f);
            TextPaint textPaint = this.A0t;
            textPaint.setTextSize(this.A0A);
            float f2 = this.A08;
            float f3 = this.A09;
            float f4 = this.A0m;
            if (f4 != 1.0f && !this.A0i) {
                canvas.scale(f4, f4, f2, f3);
            }
            if (this.A0T > 1 && ((!this.A0j || this.A0i) && (!this.A0i || this.A0E > this.A0M))) {
                int alpha = textPaint.getAlpha();
                canvas.translate(f, f3);
                float f5 = alpha;
                textPaint.setAlpha((int) (this.A0J * f5));
                this.A0c.draw(canvas);
                textPaint.setAlpha((int) (this.A06 * f5));
                int lineBaseline = this.A0c.getLineBaseline(0);
                CharSequence charSequence = this.A0h;
                float f6 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f6, textPaint);
                if (!this.A0i) {
                    String trim = this.A0h.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    textPaint.setAlpha(alpha);
                    canvas.drawText(trim, 0, Math.min(this.A0c.getLineEnd(0), trim.length()), 0.0f, f6, (Paint) textPaint);
                }
            } else {
                canvas.translate(f2, f3);
                this.A0c.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public static int A00(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private void A02() {
        View view;
        float f;
        int A01;
        float f2;
        float f3;
        float f4;
        float f5;
        Rect rect;
        float f6 = this.A0E;
        boolean z = this.A0i;
        RectF rectF = this.A0s;
        if (z) {
            if (f6 < this.A0M) {
                rect = this.A0r;
            } else {
                rect = this.A0q;
            }
            rectF.set(rect);
        } else {
            Rect rect2 = this.A0r;
            float f7 = rect2.left;
            Rect rect3 = this.A0q;
            float f8 = rect3.left;
            TimeInterpolator timeInterpolator = this.A0U;
            float f9 = f6;
            if (timeInterpolator != null) {
                f9 = timeInterpolator.getInterpolation(f6);
            }
            TimeInterpolator timeInterpolator2 = AbstractC153306uz.A00;
            rectF.left = f7 + (f9 * (f8 - f7));
            float f10 = this.A0C;
            float f11 = this.A01;
            TimeInterpolator timeInterpolator3 = this.A0U;
            float f12 = f6;
            if (timeInterpolator3 != null) {
                f12 = timeInterpolator3.getInterpolation(f6);
            }
            rectF.top = f10 + (f12 * (f11 - f10));
            float f13 = rect2.right;
            float f14 = rect3.right;
            TimeInterpolator timeInterpolator4 = this.A0U;
            float f15 = f6;
            if (timeInterpolator4 != null) {
                f15 = timeInterpolator4.getInterpolation(f6);
            }
            rectF.right = f13 + (f15 * (f14 - f13));
            float f16 = rect2.bottom;
            float f17 = rect3.bottom;
            TimeInterpolator timeInterpolator5 = this.A0U;
            float f18 = f6;
            if (timeInterpolator5 != null) {
                f18 = timeInterpolator5.getInterpolation(f6);
            }
            rectF.bottom = f16 + (f18 * (f17 - f16));
        }
        if (this.A0i) {
            if (f6 < this.A0M) {
                this.A08 = this.A0B;
                this.A09 = this.A0C;
                A03(false, this.A0K);
                view = this.A0v;
                view.postInvalidateOnAnimation();
                f = 0.0f;
            } else {
                this.A08 = this.A00;
                this.A09 = this.A01 - Math.max(0, this.A0Q);
                A03(false, this.A07);
                view = this.A0v;
                view.postInvalidateOnAnimation();
                f = 1.0f;
            }
        } else {
            float f19 = this.A0B;
            float f20 = this.A00;
            TimeInterpolator timeInterpolator6 = this.A0U;
            float f21 = f6;
            if (timeInterpolator6 != null) {
                f21 = timeInterpolator6.getInterpolation(f6);
            }
            TimeInterpolator timeInterpolator7 = AbstractC153306uz.A00;
            this.A08 = f19 + (f21 * (f20 - f19));
            float f22 = this.A0C;
            float f23 = this.A01;
            TimeInterpolator timeInterpolator8 = this.A0U;
            float f24 = f6;
            if (timeInterpolator8 != null) {
                f24 = timeInterpolator8.getInterpolation(f6);
            }
            this.A09 = f22 + (f24 * (f23 - f22));
            float f25 = this.A0K;
            float f26 = this.A07;
            TimeInterpolator timeInterpolator9 = this.A0V;
            float f27 = f6;
            if (timeInterpolator9 != null) {
                f27 = timeInterpolator9.getInterpolation(f6);
            }
            A03(false, f25 + (f27 * (f26 - f25)));
            view = this.A0v;
            view.postInvalidateOnAnimation();
            f = f6;
        }
        TimeInterpolator timeInterpolator10 = AbstractC153306uz.A02;
        this.A06 = 1.0f - (0.0f + (timeInterpolator10.getInterpolation(1.0f - f6) * (1.0f - 0.0f)));
        view.postInvalidateOnAnimation();
        this.A0J = 1.0f + (timeInterpolator10.getInterpolation(f6) * (0.0f - 1.0f));
        view.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.A0X;
        ColorStateList colorStateList2 = this.A0Z;
        TextPaint textPaint = this.A0t;
        if (colorStateList != colorStateList2) {
            A01 = A00(f, A01(colorStateList2, this), A01(this.A0X, this));
        } else {
            A01 = A01(colorStateList, this);
        }
        textPaint.setColor(A01);
        float f28 = this.A02;
        float f29 = this.A0F;
        if (f28 != f29) {
            f28 = f29 + (timeInterpolator10.getInterpolation(f6) * (f28 - f29));
        }
        textPaint.setLetterSpacing(f28);
        float f30 = this.A0I;
        float f31 = f30 + ((this.A05 - f30) * f6);
        float f32 = this.A0G;
        float f33 = f32 + ((this.A03 - f32) * f6);
        float f34 = this.A0H;
        textPaint.setShadowLayer(f31, f33, f34 + ((this.A04 - f34) * f6), A00(f6, A01(this.A0Y, this), A01(this.A0W, this)));
        if (this.A0i) {
            float f35 = this.A0M;
            if (f6 <= f35) {
                float f36 = this.A0L;
                f2 = 1.0f;
                f3 = 0.0f;
                if (f6 >= f36) {
                    if (f6 > f35) {
                        f2 = 0.0f;
                    } else {
                        f4 = f6 - f36;
                        f5 = f35 - f36;
                        f2 += (f4 / f5) * (f3 - f2);
                    }
                }
                textPaint.setAlpha((int) (f2 * 255.0f));
            } else {
                f2 = 0.0f;
                f3 = 1.0f;
                if (f6 >= f35) {
                    if (f6 > 1.0f) {
                        f2 = 1.0f;
                    } else {
                        f4 = f6 - f35;
                        f5 = 1.0f - f35;
                        f2 += (f4 / f5) * (f3 - f2);
                    }
                }
                textPaint.setAlpha((int) (f2 * 255.0f));
            }
        }
        view.postInvalidateOnAnimation();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r0 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A03(boolean r16, float r17) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65757TtX.A03(boolean, float):void");
    }

    public final float A04() {
        if (this.A0f == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.A0u;
        textPaint.setTextSize(this.A07);
        textPaint.setTypeface(this.A0a);
        textPaint.setLetterSpacing(this.A02);
        CharSequence charSequence = this.A0f;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final float A05() {
        TextPaint textPaint = this.A0u;
        textPaint.setTextSize(this.A07);
        textPaint.setTypeface(this.A0a);
        textPaint.setLetterSpacing(this.A02);
        return -textPaint.ascent();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r1.height() <= 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06() {
        /*
            r2 = this;
            android.graphics.Rect r1 = r2.A0q
            int r0 = r1.width()
            if (r0 <= 0) goto L1d
            int r0 = r1.height()
            if (r0 <= 0) goto L1d
            android.graphics.Rect r1 = r2.A0r
            int r0 = r1.width()
            if (r0 <= 0) goto L1d
            int r1 = r1.height()
            r0 = 1
            if (r1 > 0) goto L1e
        L1d:
            r0 = 0
        L1e:
            r2.A0p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65757TtX.A06():void");
    }

    public final void A08(int i) {
        Context context = this.A0v.getContext();
        C70154WDd c70154WDd = new C70154WDd(context, i);
        ColorStateList colorStateList = c70154WDd.A0A;
        if (colorStateList != null) {
            this.A0X = colorStateList;
        }
        float f = c70154WDd.A00;
        if (f != 0.0f) {
            this.A07 = f;
        }
        ColorStateList colorStateList2 = c70154WDd.A09;
        if (colorStateList2 != null) {
            this.A0W = colorStateList2;
        }
        this.A03 = c70154WDd.A04;
        this.A04 = c70154WDd.A05;
        this.A05 = c70154WDd.A06;
        this.A02 = c70154WDd.A03;
        C67767Uxi c67767Uxi = this.A0d;
        if (c67767Uxi != null) {
            c67767Uxi.A00 = true;
        }
        C65798TuG c65798TuG = new C65798TuG(this);
        C70154WDd.A00(c70154WDd);
        C67767Uxi c67767Uxi2 = new C67767Uxi(c70154WDd.A01, c65798TuG);
        this.A0d = c67767Uxi2;
        c70154WDd.A05(context, c67767Uxi2);
        A0G(false);
    }

    public final void A09(int i) {
        if (this.A0P != i) {
            this.A0P = i;
            A0G(false);
        }
    }

    public final void A0A(int i) {
        Context context = this.A0v.getContext();
        C70154WDd c70154WDd = new C70154WDd(context, i);
        ColorStateList colorStateList = c70154WDd.A0A;
        if (colorStateList != null) {
            this.A0Z = colorStateList;
        }
        float f = c70154WDd.A00;
        if (f != 0.0f) {
            this.A0K = f;
        }
        ColorStateList colorStateList2 = c70154WDd.A09;
        if (colorStateList2 != null) {
            this.A0Y = colorStateList2;
        }
        this.A0G = c70154WDd.A04;
        this.A0H = c70154WDd.A05;
        this.A0I = c70154WDd.A06;
        this.A0F = c70154WDd.A03;
        C67767Uxi c67767Uxi = this.A0e;
        if (c67767Uxi != null) {
            c67767Uxi.A00 = true;
        }
        C65797TuF c65797TuF = new C65797TuF(this);
        C70154WDd.A00(c70154WDd);
        C67767Uxi c67767Uxi2 = new C67767Uxi(c70154WDd.A01, c65797TuF);
        this.A0e = c67767Uxi2;
        c70154WDd.A05(context, c67767Uxi2);
        A0G(false);
    }

    public final void A0B(int i, int i2, int i3, int i4) {
        Rect rect = this.A0q;
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return;
        }
        rect.set(i, i2, i3, i4);
        this.A0o = true;
        A06();
    }

    public final void A0C(int i, int i2, int i3, int i4) {
        Rect rect = this.A0r;
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return;
        }
        rect.set(i, i2, i3, i4);
        this.A0o = true;
        A06();
    }

    public final void A0D(ColorStateList colorStateList) {
        if (this.A0X != colorStateList) {
            this.A0X = colorStateList;
            A0G(false);
        }
    }

    public final void A0F(Typeface typeface) {
        boolean z;
        boolean z2;
        C67767Uxi c67767Uxi = this.A0d;
        if (c67767Uxi != null) {
            c67767Uxi.A00 = true;
        }
        if (this.A0a != typeface) {
            this.A0a = typeface;
            z = true;
        } else {
            z = false;
        }
        C67767Uxi c67767Uxi2 = this.A0e;
        if (c67767Uxi2 != null) {
            c67767Uxi2.A00 = true;
        }
        if (this.A0b != typeface) {
            this.A0b = typeface;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            A0G(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(boolean r15) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65757TtX.A0G(boolean):void");
    }

    public C65757TtX(View view) {
        this.A0v = view;
        TextPaint textPaint = new TextPaint(129);
        this.A0t = textPaint;
        this.A0u = new TextPaint(textPaint);
        this.A0q = new Rect();
        this.A0r = new Rect();
        this.A0s = new RectF();
        float f = this.A0L;
        this.A0M = f + ((1.0f - f) * 0.5f);
    }
}
