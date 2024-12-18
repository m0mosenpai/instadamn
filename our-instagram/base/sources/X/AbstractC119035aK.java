package X;

/* renamed from: X.5aK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC119035aK {
    public static final long A00(int i) {
        if (i >= 0) {
            return C5AU.A05(0, Integer.MAX_VALUE, i, i);
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("height(", ") must be >= 0", i));
    }

    public static final long A01(int i) {
        if (i >= 0) {
            return C5AU.A05(i, i, 0, Integer.MAX_VALUE);
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("width(", ") must be >= 0", i));
    }

    public static final long A02(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            return C5AU.A05(i, i, i2, i2);
        }
        throw new IllegalArgumentException(AnonymousClass001.A0n("width(", ") and height(", ") must be >= 0", i, i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A03(int r4, int r5, int r6, int r7) {
        /*
            r0 = 262142(0x3fffe, float:3.67339E-40)
            int r3 = java.lang.Math.min(r6, r0)
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r7 != r2) goto L23
            r1 = 2147483647(0x7fffffff, float:NaN)
        Lf:
            r0 = r3
        L10:
            int r0 = X.C5AU.A00(r0)
            if (r5 == r2) goto L1a
            int r2 = java.lang.Math.min(r0, r5)
        L1a:
            int r0 = java.lang.Math.min(r0, r4)
            long r0 = X.C5AU.A04(r0, r2, r3, r1)
            return r0
        L23:
            int r1 = java.lang.Math.min(r7, r0)
            r0 = r1
            if (r1 != r2) goto L10
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC119035aK.A03(int, int, int, int):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A04(int r3, int r4, int r5, int r6) {
        /*
            r0 = 262142(0x3fffe, float:3.67339E-40)
            int r3 = java.lang.Math.min(r3, r0)
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r2) goto L23
            r1 = 2147483647(0x7fffffff, float:NaN)
        Lf:
            r0 = r3
        L10:
            int r0 = X.C5AU.A00(r0)
            if (r6 == r2) goto L1a
            int r2 = java.lang.Math.min(r0, r6)
        L1a:
            int r0 = java.lang.Math.min(r0, r5)
            long r0 = X.C5AU.A04(r3, r1, r0, r2)
            return r0
        L23:
            int r1 = java.lang.Math.min(r4, r0)
            r0 = r1
            if (r1 != r2) goto L10
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC119035aK.A04(int, int, int, int):long");
    }
}
