package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: X.5hU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122935hU extends ReplacementSpan {
    public int A00;
    public boolean A01;
    public int A02;
    public Paint.FontMetricsInt A03;
    public final int A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final int A08;
    public final int A09;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        if ((r2 + A00()) > r11.descent) goto L19;
     */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getSize(android.graphics.Paint r7, java.lang.CharSequence r8, int r9, int r10, android.graphics.Paint.FontMetricsInt r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122935hU.getSize(android.graphics.Paint, java.lang.CharSequence, int, int, android.graphics.Paint$FontMetricsInt):int");
    }

    public final int A00() {
        if (this.A01) {
            return this.A02;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    public final Paint.FontMetricsInt A01() {
        Paint.FontMetricsInt fontMetricsInt = this.A03;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        C14360o3.A0F("fontMetrics");
        throw C00O.createAndThrow();
    }

    public C122935hU(float f, float f2, float f3, int i, int i2, int i3) {
        this.A07 = f;
        this.A09 = i;
        this.A05 = f2;
        this.A08 = i2;
        this.A06 = f3;
        this.A04 = i3;
    }
}
