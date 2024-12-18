package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: X.Sh9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63303Sh9 {
    public static final Matrix A0G = AbstractC166987dD.A0Q();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public Paint A05;
    public Paint A06;
    public PathMeasure A07;
    public Boolean A08;
    public String A09;
    public int A0A;
    public final Matrix A0B;
    public final Path A0C;
    public final Path A0D;
    public final C20030yX A0E;
    public final Q9n A0F;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x010f, code lost:
    
        if (r1.A00 != 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.graphics.Canvas r18, android.graphics.Matrix r19, X.Q9n r20, X.C63303Sh9 r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63303Sh9.A00(android.graphics.Canvas, android.graphics.Matrix, X.Q9n, X.Sh9, int, int):void");
    }

    public float getAlpha() {
        return this.A04 / 255.0f;
    }

    public int getRootAlpha() {
        return this.A04;
    }

    public void setAlpha(float f) {
        this.A04 = (int) (f * 255.0f);
    }

    public C63303Sh9(C63303Sh9 c63303Sh9) {
        this.A0B = AbstractC166987dD.A0Q();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A04 = 255;
        this.A09 = null;
        this.A08 = null;
        C20030yX A0A = AbstractC58319PtB.A0A();
        this.A0E = A0A;
        this.A0F = new Q9n(A0A, c63303Sh9.A0F);
        this.A0C = new Path(c63303Sh9.A0C);
        this.A0D = new Path(c63303Sh9.A0D);
        this.A01 = c63303Sh9.A01;
        this.A00 = c63303Sh9.A00;
        this.A03 = c63303Sh9.A03;
        this.A02 = c63303Sh9.A02;
        this.A0A = c63303Sh9.A0A;
        this.A04 = c63303Sh9.A04;
        this.A09 = c63303Sh9.A09;
        String str = c63303Sh9.A09;
        if (str != null) {
            A0A.put(str, this);
        }
        this.A08 = c63303Sh9.A08;
    }

    public void setRootAlpha(int i) {
        this.A04 = i;
    }

    public C63303Sh9() {
        this.A0B = AbstractC166987dD.A0Q();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A04 = 255;
        this.A09 = null;
        this.A08 = null;
        this.A0E = AbstractC58319PtB.A0A();
        this.A0F = new Q9n();
        this.A0C = AbstractC166987dD.A0T();
        this.A0D = AbstractC166987dD.A0T();
    }
}
