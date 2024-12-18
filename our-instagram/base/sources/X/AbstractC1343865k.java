package X;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: X.65k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1343865k extends ReplacementSpan {
    public final C54532fA A02;
    public final Paint.FontMetricsInt A03 = new Paint.FontMetricsInt();
    public short A00 = -1;
    public float A01 = 1.0f;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        short s2;
        Paint.FontMetricsInt fontMetricsInt2 = this.A03;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C54532fA c54532fA = this.A02;
        C54542fB A00 = C54532fA.A00(c54532fA);
        int A002 = A00.A00(14);
        if (A002 != 0) {
            s = A00.A04.getShort(A002 + A00.A00);
        } else {
            s = 0;
        }
        this.A01 = abs / s;
        C54542fB A003 = C54532fA.A00(c54532fA);
        int A004 = A003.A00(14);
        if (A004 != 0) {
            A003.A04.getShort(A004 + A003.A00);
        }
        C54542fB A005 = C54532fA.A00(c54532fA);
        int A006 = A005.A00(12);
        if (A006 != 0) {
            s2 = A005.A04.getShort(A006 + A005.A00);
        } else {
            s2 = 0;
        }
        short s3 = (short) (s2 * this.A01);
        this.A00 = s3;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }

    public AbstractC1343865k(C54532fA c54532fA) {
        this.A02 = c54532fA;
    }
}
