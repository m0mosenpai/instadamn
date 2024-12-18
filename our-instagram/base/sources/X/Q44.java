package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;

/* loaded from: classes10.dex */
public class Q44 extends ReplacementSpan {
    public int A00;
    public int A01;
    public Rect A02;
    public final int A03;
    public final Paint.FontMetricsInt A04 = new Paint.FontMetricsInt();
    public final Rect A05;
    public final Drawable A06;

    public static final void A00(Paint.FontMetricsInt fontMetricsInt, int i, int i2) {
        if (i < fontMetricsInt.ascent) {
            fontMetricsInt.ascent = i;
        }
        if (i < fontMetricsInt.top) {
            fontMetricsInt.top = i;
        }
        if (i2 > fontMetricsInt.descent) {
            fontMetricsInt.descent = i2;
        }
        if (i2 > fontMetricsInt.bottom) {
            fontMetricsInt.bottom = i2;
        }
    }

    public final int A01(int i, int i2) {
        int i3;
        int i4;
        int i5 = this.A03;
        if (i5 != 0) {
            if (i5 != 2) {
                i4 = -this.A00;
                i3 = this.A05.bottom;
            } else {
                Rect rect = this.A05;
                int i6 = (i2 - i) + rect.top;
                i3 = rect.bottom;
                i4 = i + (((i6 + i3) - this.A00) / 2);
            }
            return i4 - i3;
        }
        return (i2 - this.A00) - this.A05.bottom;
    }

    public final void A02() {
        Rect bounds = this.A06.getBounds();
        this.A02 = bounds;
        int width = bounds.width();
        Rect rect = this.A05;
        this.A01 = width + rect.left + rect.right;
        this.A00 = this.A02.height();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int A01;
        Paint.FontMetricsInt fontMetricsInt = this.A04;
        paint.getFontMetricsInt(fontMetricsInt);
        int i6 = fontMetricsInt.ascent;
        int i7 = fontMetricsInt.descent;
        if (this instanceof R8G) {
            R8G r8g = (R8G) this;
            if (r8g.A01 != 1) {
                i6 = i3 - i4;
                i7 = i5 - i4;
            }
            A01 = r8g.A01(i6, i7);
        } else {
            A01 = A01(i6, i7);
        }
        float f2 = f + this.A05.left;
        canvas.translate(f2, i4 + A01);
        this.A06.draw(canvas);
        canvas.translate(-f2, -r12);
    }

    public Q44(Rect rect, Drawable drawable, int i) {
        this.A06 = drawable;
        this.A03 = i;
        this.A05 = rect;
        A02();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        int i4;
        A02();
        if (fontMetricsInt != null) {
            if (this instanceof R8G) {
                R8G r8g = (R8G) this;
                int i5 = r8g.A01;
                if (i5 == 1) {
                    i3 = fontMetricsInt.ascent;
                    i4 = fontMetricsInt.descent;
                } else {
                    i3 = fontMetricsInt.top;
                    i4 = fontMetricsInt.bottom;
                }
                int A01 = r8g.A01(i3, i4);
                int i6 = ((Q44) r8g).A00 + A01;
                int i7 = r8g.A00;
                Rect rect = r8g.A05;
                int i8 = A01 - rect.top;
                if (i7 == 2) {
                    i6 += rect.bottom;
                    if (i5 == 0) {
                        int abs = Math.abs(fontMetricsInt.bottom) / 2;
                        i8 -= abs;
                        i6 += abs;
                    }
                }
                A00(fontMetricsInt, i8, i6);
                return ((Q44) r8g).A01;
            }
            int A012 = A01(fontMetricsInt.ascent, fontMetricsInt.descent);
            int i9 = this.A00 + A012;
            int i10 = this.A03;
            Rect rect2 = this.A05;
            int i11 = A012 - rect2.top;
            if (i10 == 2) {
                i9 += rect2.bottom;
            }
            A00(fontMetricsInt, i11, i9);
        }
        return this.A01;
    }
}
