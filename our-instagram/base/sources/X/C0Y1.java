package X;

/* renamed from: X.0Y1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Y1 {
    public final int A00;
    public final double[] A01;
    public final long[] A02;
    public final long[] A03;
    public final String[] A04;
    public final String[] A05;
    public final String[] A06;
    public final String[] A07;
    public final String[] A08;
    public final String[] A09;
    public final String[] A0A;

    public C0Y1(double[] dArr, long[] jArr, long[] jArr2, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7, int i) {
        if (strArr.length == jArr.length) {
            if (strArr2.length == strArr3.length) {
                if (strArr4.length == jArr2.length) {
                    if (strArr5.length == dArr.length) {
                        if (strArr6.length == strArr7.length) {
                            this.A06 = strArr;
                            this.A02 = jArr;
                            this.A09 = strArr2;
                            this.A08 = strArr3;
                            this.A05 = strArr4;
                            this.A03 = jArr2;
                            this.A04 = strArr5;
                            this.A01 = dArr;
                            this.A07 = strArr6;
                            this.A0A = strArr7;
                            this.A00 = i;
                            return;
                        }
                        throw new IllegalArgumentException("Different number of string aggregations and results");
                    }
                    throw new IllegalArgumentException("Different number of double aggregations and results");
                }
                throw new IllegalArgumentException("Different number of integer aggregations and results");
            }
            throw new IllegalArgumentException("Different number of string dimensions and values");
        }
        throw new IllegalArgumentException("Different number of integer dimensions and values");
    }
}
