package X;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class W64 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public Integer A05;
    public final int A06;
    public final int A07;
    public final Spannable A08;
    public final TextPaint A09;
    public final Integer A0A;
    public final BreakIterator A0B;
    public final List A0C;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public W64(android.content.Context r15, android.text.Spannable r16, android.text.TextPaint r17, X.C57482kN r18, java.lang.Integer r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W64.<init>(android.content.Context, android.text.Spannable, android.text.TextPaint, X.2kN, java.lang.Integer, int, boolean):void");
    }

    public static float A00(W64 w64) {
        if (w64.A05.intValue() == 1) {
            return -(w64.A03() / 2.0f);
        }
        return 0.0f;
    }

    public final void A04(Canvas canvas, int i) {
        float f;
        float f2;
        int i2;
        C69631VsY c69631VsY;
        int i3 = 0;
        int i4 = 0;
        if (0 < i) {
            this.A0C.size();
        }
        canvas.save();
        float f3 = 0.0f;
        float A00 = this.A03 + A00(this) + 0.0f;
        float f4 = this.A04;
        if (this.A05.intValue() == 1) {
            f3 = -(A01() / 2.0f);
        }
        canvas.translate(A00, f4 + f3 + this.A00);
        float f5 = this.A02;
        float f6 = -A00(this);
        if (this.A05.intValue() == 1) {
            f = -(A01() / 2.0f);
        } else {
            f = 0.0f;
        }
        canvas.rotate(f5, f6, -f);
        List list = this.A0C;
        C69774VvB c69774VvB = (C69774VvB) AbstractC001800i.A0O(list, 0);
        if (c69774VvB != null && (c69631VsY = (C69631VsY) AbstractC001800i.A0O(c69774VvB.A04, 0)) != null) {
            f2 = c69631VsY.A03.getStrokeWidth();
        } else {
            f2 = 0.0f;
        }
        C69774VvB c69774VvB2 = (C69774VvB) AbstractC001800i.A0O(list, 0);
        if (c69774VvB2 != null) {
            i2 = c69774VvB2.A02.A01.getHeight();
        } else {
            i2 = 0;
        }
        C69774VvB c69774VvB3 = (C69774VvB) AbstractC001800i.A0O(list, 0);
        if (c69774VvB3 != null) {
            i4 = C6RE.A02(c69774VvB3.A02.A01);
        }
        canvas.saveLayerAlpha(new RectF((-i4) - f2, (-i2) - f2, A03() + f2 + i4, A01() + f2 + i2), (int) (255.0f * this.A01));
        int intValue = this.A0A.intValue();
        if (intValue != 1) {
            if (intValue != 0 && intValue != 2) {
                throw new RuntimeException();
            }
            if (0 <= i) {
                int i5 = 0;
                while (true) {
                    C69774VvB c69774VvB4 = (C69774VvB) AbstractC001800i.A0O(list, i5);
                    if (c69774VvB4 != null) {
                        c69774VvB4.A01(canvas);
                    }
                    if (i5 == i) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            if (intValue != 0 && intValue != 2) {
                throw new RuntimeException();
            }
            if (0 <= i) {
                while (true) {
                    C69774VvB c69774VvB5 = (C69774VvB) AbstractC001800i.A0O(list, i3);
                    if (c69774VvB5 != null) {
                        canvas.save();
                        canvas.translate(c69774VvB5.A00, 0.0f);
                        c69774VvB5.A02.A01.draw(canvas);
                        canvas.restore();
                    }
                    if (i3 == i) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        } else {
            C69774VvB c69774VvB6 = (C69774VvB) AbstractC001800i.A0O(list, i);
            if (c69774VvB6 != null) {
                c69774VvB6.A01(canvas);
            }
            C69774VvB c69774VvB7 = (C69774VvB) AbstractC001800i.A0O(list, i);
            if (c69774VvB7 != null) {
                canvas.save();
                canvas.translate(c69774VvB7.A00, 0.0f);
                c69774VvB7.A02.A01.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
        canvas.restore();
    }

    public final float A01() {
        if (((C69774VvB) AbstractC001800i.A0O(this.A0C, 0)) != null) {
            return r0.A02.A01.getHeight();
        }
        return 0.0f;
    }

    public final float A02() {
        int intValue = this.A0A.intValue();
        if (intValue != 1 && intValue != 0) {
            if (intValue == 2) {
                double d = 0.0d;
                while (this.A0C.iterator().hasNext()) {
                    d += ((C69774VvB) r4.next()).A00();
                }
                return (float) d;
            }
            throw new RuntimeException();
        }
        C69774VvB c69774VvB = (C69774VvB) AbstractC001800i.A0L(this.A0C);
        if (c69774VvB != null) {
            return c69774VvB.A00();
        }
        return 0.0f;
    }

    public final float A03() {
        int intValue = this.A0A.intValue();
        if (intValue != 1 && intValue != 0) {
            if (intValue == 2) {
                double d = 0.0d;
                while (this.A0C.iterator().hasNext()) {
                    d += ((C69774VvB) r4.next()).A02.A01.getLineRight(0);
                }
                return (float) d;
            }
            throw new RuntimeException();
        }
        C69774VvB c69774VvB = (C69774VvB) AbstractC001800i.A0L(this.A0C);
        if (c69774VvB != null) {
            return c69774VvB.A02.A01.getLineRight(0);
        }
        return 0.0f;
    }
}
