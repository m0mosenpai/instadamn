package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;

/* renamed from: X.5hK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122845hK {
    public C136826Hl A00;
    public C63297Sgy A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Rect A08 = new Rect();
    public final Layout A09;
    public final TextPaint A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final Paint.FontMetricsInt A0D;
    public final C122725h8 A0E;
    public final C122715h7[] A0F;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (((android.text.Spanned) r31).nextSpanTransition(-1, r5, X.C122865hM.class) >= r5) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C122845hK(android.text.TextPaint r28, android.text.TextUtils.TruncateAt r29, X.C122725h8 r30, java.lang.CharSequence r31, float r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122845hK.<init>(android.text.TextPaint, android.text.TextUtils$TruncateAt, X.5h8, java.lang.CharSequence, float, int, int, int, int, int, int, int, int):void");
    }

    public final float A00(int i) {
        float lineBaseline;
        Paint.FontMetricsInt fontMetricsInt;
        float f = this.A07;
        if (i == this.A06 - 1 && (fontMetricsInt = this.A0D) != null) {
            lineBaseline = A02(i) - fontMetricsInt.ascent;
        } else {
            lineBaseline = this.A09.getLineBaseline(i);
        }
        return f + lineBaseline;
    }

    public final float A01(int i) {
        float lineBottom;
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        int i3 = this.A06 - 1;
        if (i == i3 && (fontMetricsInt = this.A0D) != null) {
            lineBottom = this.A09.getLineBottom(i - 1);
            i2 = fontMetricsInt.bottom;
        } else {
            lineBottom = this.A07 + this.A09.getLineBottom(i);
            if (i == i3) {
                i2 = this.A04;
            } else {
                i2 = 0;
            }
        }
        return lineBottom + i2;
    }

    public final float A02(int i) {
        int i2;
        float lineTop = this.A09.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.A07;
        }
        return lineTop + i2;
    }

    public final float A03(int i, boolean z) {
        float f;
        C136826Hl c136826Hl = this.A00;
        if (c136826Hl == null) {
            c136826Hl = new C136826Hl(this.A09);
            this.A00 = c136826Hl;
        }
        float A01 = c136826Hl.A01(i, true, z);
        if (this.A09.getLineForOffset(i) == this.A06 - 1) {
            f = this.A02 + this.A03;
        } else {
            f = 0.0f;
        }
        return A01 + f;
    }

    public final float A04(int i, boolean z) {
        float f;
        C136826Hl c136826Hl = this.A00;
        if (c136826Hl == null) {
            c136826Hl = new C136826Hl(this.A09);
            this.A00 = c136826Hl;
        }
        float A01 = c136826Hl.A01(i, false, z);
        if (this.A09.getLineForOffset(i) == this.A06 - 1) {
            f = this.A02 + this.A03;
        } else {
            f = 0.0f;
        }
        return A01 + f;
    }

    public final int A05(int i) {
        Layout layout = this.A09;
        if (layout.getEllipsisStart(i) == 0) {
            return layout.getLineEnd(i);
        }
        return layout.getText().length();
    }

    public final C63297Sgy A06() {
        C63297Sgy c63297Sgy = this.A01;
        if (c63297Sgy == null) {
            Layout layout = this.A09;
            C63297Sgy c63297Sgy2 = new C63297Sgy(layout.getText(), this.A0A.getTextLocale(), layout.getText().length());
            this.A01 = c63297Sgy2;
            return c63297Sgy2;
        }
        return c63297Sgy;
    }

    public final int[] A07(RectF rectF, InterfaceC16620sF interfaceC16620sF, int i) {
        InterfaceC72029XFr A00;
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC69804Vvq.A01(rectF, this, interfaceC16620sF, i);
        }
        Layout layout = this.A09;
        C136826Hl c136826Hl = this.A00;
        if (c136826Hl == null) {
            c136826Hl = new C136826Hl(layout);
            this.A00 = c136826Hl;
        }
        CharSequence text = layout.getText();
        if (i == 1) {
            A00 = new C63585Sps(A06(), text);
        } else {
            A00 = AbstractC61622Rqm.A00(this.A0A, text);
        }
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > A01(lineForVertical) && (lineForVertical = lineForVertical + 1) >= this.A06) {
            return null;
        }
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < A02(0)) {
            return null;
        }
        while (true) {
            int A002 = VKP.A00(rectF, layout, c136826Hl, this, A00, interfaceC16620sF, lineForVertical, true);
            if (A002 != -1) {
                while (true) {
                    int A003 = VKP.A00(rectF, layout, c136826Hl, this, A00, interfaceC16620sF, lineForVertical2, false);
                    if (A003 == -1) {
                        if (lineForVertical >= lineForVertical2) {
                            return null;
                        }
                        lineForVertical2--;
                    } else {
                        return new int[]{A00.E64(A002 + 1), A00.Css(A003 - 1)};
                    }
                }
            } else {
                if (lineForVertical >= lineForVertical2) {
                    return null;
                }
                lineForVertical++;
            }
        }
    }
}
