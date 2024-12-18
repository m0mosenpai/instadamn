package X;

/* renamed from: X.2Us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC50712Us {
    public static final C50722Ut A00 = new Object();
    public static final AbstractC50712Us A01 = AbstractC50732Uu.A00.A00();

    public abstract double A00();

    public abstract float A02();

    public abstract int A03();

    public abstract int A04(int i);

    public abstract int A05(int i);

    public abstract long A07();

    public abstract boolean A0A();

    public abstract byte[] A0B(byte[] bArr);

    public double A01(double d, double d2) {
        double A002;
        if (d2 > d) {
            double d3 = d2 - d;
            if (Double.isInfinite(d3) && !Double.isInfinite(d) && !Double.isNaN(d) && !Double.isInfinite(d2) && !Double.isNaN(d2)) {
                double A003 = A00() * ((d2 / 2.0d) - (d / 2.0d));
                A002 = d + A003 + A003;
            } else {
                A002 = d + (A00() * d3);
            }
            if (A002 >= d2) {
                return Math.nextAfter(d2, Double.NEGATIVE_INFINITY);
            }
            return A002;
        }
        throw new IllegalArgumentException(AbstractC172607mU.A01(Double.valueOf(d), Double.valueOf(d2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x001a, code lost:
    
        if (((-r4) & r4) == r4) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001d, code lost:
    
        r2 = A03() >>> 1;
        r1 = r2 % r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        if (((r2 - r1) + (r4 - 1)) < 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int A06(int r6, int r7) {
        /*
            r5 = this;
            if (r7 <= r6) goto L34
            int r4 = r7 - r6
            r3 = 1
            if (r4 > 0) goto L18
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r0) goto L2b
        Lb:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)
            int r0 = 31 - r0
            int r1 = r5.A04(r0)
        L15:
            int r0 = r6 + r1
            return r0
        L18:
            int r0 = -r4
            r0 = r0 & r4
            if (r0 != r4) goto L1d
            goto Lb
        L1d:
            int r2 = r5.A03()
            int r2 = r2 >>> r3
            int r1 = r2 % r4
            int r2 = r2 - r1
            int r0 = r4 + (-1)
            int r2 = r2 + r0
            if (r2 < 0) goto L1d
            goto L15
        L2b:
            int r0 = r5.A03()
            if (r6 > r0) goto L2b
            if (r0 >= r7) goto L2b
            return r0
        L34:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.String r1 = X.AbstractC172607mU.A01(r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC50712Us.A06(int, int):int");
    }

    public long A08(long j) {
        return A09(0L, j);
    }

    public long A09(long j, long j2) {
        long A07;
        long j3;
        int A03;
        if (j2 > j) {
            long j4 = j2 - j;
            if (j4 > 0) {
                if (((-j4) & j4) == j4) {
                    int i = (int) j4;
                    int i2 = (int) (j4 >>> 32);
                    if (i != 0) {
                        A03 = A04(31 - Integer.numberOfLeadingZeros(i));
                    } else if (i2 == 1) {
                        A03 = A03();
                    } else {
                        j3 = (A04(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (A03() & 4294967295L);
                        return j + j3;
                    }
                    j3 = A03 & 4294967295L;
                    return j + j3;
                }
                do {
                    A07 = A07() >>> 1;
                    j3 = A07 % j4;
                } while ((A07 - j3) + (j4 - 1) < 0);
                return j + j3;
            }
            while (true) {
                long A072 = A07();
                if (j <= A072 && A072 < j2) {
                    return A072;
                }
            }
        } else {
            throw new IllegalArgumentException(AbstractC172607mU.A01(Long.valueOf(j), Long.valueOf(j2)));
        }
    }
}
