package X;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes10.dex */
public abstract class Q42 extends ReplacementSpan {
    public final C63169SeU A01;
    public final Paint.FontMetricsInt A02 = new Paint.FontMetricsInt();
    public float A00 = 1.0f;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        short s2;
        Paint.FontMetricsInt fontMetricsInt2 = this.A02;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C63169SeU c63169SeU = this.A01;
        Q9i A00 = C63169SeU.A00(c63169SeU);
        int A002 = A00.A00(14);
        if (A002 != 0) {
            s = A00.A01.getShort(A002 + A00.A00);
        } else {
            s = 0;
        }
        this.A00 = abs / s;
        Q9i A003 = C63169SeU.A00(c63169SeU);
        int A004 = A003.A00(14);
        if (A004 != 0) {
            A003.A01.getShort(A004 + A003.A00);
        }
        Q9i A005 = C63169SeU.A00(c63169SeU);
        int A006 = A005.A00(12);
        if (A006 != 0) {
            s2 = A005.A01.getShort(A006 + A005.A00);
        } else {
            s2 = 0;
        }
        short s3 = (short) (s2 * this.A00);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }

    public Q42(C63169SeU c63169SeU) {
        C02R.A03(c63169SeU, "metadata cannot be null");
        this.A01 = c63169SeU;
    }
}
