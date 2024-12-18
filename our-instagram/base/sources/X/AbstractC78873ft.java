package X;

/* renamed from: X.3ft, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC78873ft {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r4 > r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
    
        if (r4 > r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b6, code lost:
    
        if (r2 > r6) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A00(float r7, long r8) {
        /*
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lc6
            boolean r0 = java.lang.Float.isNaN(r7)
            if (r0 != 0) goto Lc6
            boolean r0 = java.lang.Float.isInfinite(r7)
            if (r0 != 0) goto Lc6
            boolean r5 = X.C78613fT.A06(r8)
            if (r5 != 0) goto L2a
            boolean r0 = X.C78613fT.A05(r8)
            if (r0 != 0) goto L2a
            int r1 = X.C78613fT.A03(r8)
            int r0 = X.C78613fT.A02(r8)
            long r0 = X.AbstractC78673fZ.A00(r1, r0)
            return r0
        L2a:
            int r6 = X.C78613fT.A01(r8)
            float r0 = (float) r6
            float r0 = r0 / r7
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r4 = (int) r0
            int r3 = X.C78613fT.A00(r8)
            float r0 = (float) r3
            float r0 = r0 * r7
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r2 = (int) r0
            boolean r1 = X.C78613fT.A08(r8)
            if (r1 != 0) goto La1
            if (r5 == 0) goto La1
            boolean r0 = X.C78613fT.A07(r8)
            if (r0 != 0) goto La1
            boolean r0 = X.C78613fT.A05(r8)
            if (r0 == 0) goto La1
            if (r4 <= r3) goto Lc4
        L58:
            r4 = r3
        L59:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r5) goto L84
            r2 = 2147483647(0x7fffffff, float:NaN)
        L61:
            if (r4 == r5) goto L77
            int r1 = X.C78613fT.A02(r8)
            if (r1 != r3) goto L7c
            X.3f7 r0 = X.C78413f7.A00
        L6b:
            X.17u r0 = r0.A01
            int r0 = r0.A01
            int r0 = java.lang.Math.min(r3, r0)
            int r5 = X.C17s.A03(r4, r1, r0)
        L77:
            long r0 = X.AbstractC78673fZ.A00(r2, r5)
            return r0
        L7c:
            if (r1 != 0) goto L81
            X.3f9 r0 = X.C78433f9.A00
            goto L6b
        L81:
            X.Bq5 r0 = X.C26670Bq5.A00
            goto L6b
        L84:
            int r1 = X.C78613fT.A03(r8)
            if (r1 != r6) goto L99
            X.3f7 r0 = X.C78413f7.A00
        L8c:
            X.17u r0 = r0.A01
            int r0 = r0.A01
            int r0 = java.lang.Math.min(r6, r0)
            int r2 = X.C17s.A03(r2, r1, r0)
            goto L61
        L99:
            if (r1 != 0) goto L9e
            X.3f9 r0 = X.C78433f9.A00
            goto L8c
        L9e:
            X.Bq5 r0 = X.C26670Bq5.A00
            goto L8c
        La1:
            if (r1 == 0) goto Lad
            r2 = r6
            boolean r0 = X.C78613fT.A05(r8)
            if (r0 == 0) goto L59
            if (r4 > r3) goto L58
            goto L59
        Lad:
            boolean r0 = X.C78613fT.A07(r8)
            if (r0 == 0) goto Lb9
            r4 = r3
            if (r5 == 0) goto L59
            if (r2 > r6) goto Lc4
            goto L59
        Lb9:
            if (r5 != 0) goto Lc4
            boolean r0 = X.C78613fT.A05(r8)
            if (r0 != 0) goto L58
            r4 = 0
            r2 = 0
            goto L59
        Lc4:
            r2 = r6
            goto L59
        Lc6:
            long r0 = X.AbstractC78683fa.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC78873ft.A00(float, long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A03(X.C78693fb r4, float r5, int r6, int r7, long r8) {
        /*
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            boolean r0 = X.C78613fT.A06(r8)
            if (r0 == 0) goto L6d
            int r1 = X.C78613fT.A03(r8)
            int r0 = X.C78613fT.A01(r8)
            if (r6 > r0) goto L6d
            if (r1 > r6) goto L6d
            r0 = 32
            long r1 = r8 >>> r0
            int r0 = (int) r1
            X.3f8 r0 = X.AbstractC78623fU.A00(r0)
            int r3 = r0.A03(r8)
            int r0 = (int) r8
            X.3f8 r0 = X.AbstractC78623fU.A00(r0)
            int r2 = r0.A00(r8)
            int r1 = r0.A01(r8)
            X.3fA r0 = X.C78443fA.A00
            long r1 = r0.A00(r3, r6, r2, r1)
        L36:
            boolean r0 = X.C78613fT.A05(r8)
            if (r0 == 0) goto L68
            int r3 = X.C78613fT.A02(r8)
            int r0 = X.C78613fT.A00(r8)
            if (r7 > r0) goto L68
            if (r3 > r7) goto L68
            r0 = 32
            long r3 = r1 >>> r0
            int r0 = (int) r3
            X.3f8 r0 = X.AbstractC78623fU.A00(r0)
            int r4 = r0.A03(r1)
            int r3 = r0.A02(r1)
            int r0 = (int) r1
            X.3f8 r0 = X.AbstractC78623fU.A00(r0)
            int r1 = r0.A00(r1)
            X.3fA r0 = X.C78443fA.A00
            long r1 = r0.A00(r4, r3, r1, r7)
        L68:
            long r0 = A00(r5, r1)
            return r0
        L6d:
            r1 = r8
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC78873ft.A03(X.3fb, float, int, int, long):long");
    }

    public static final long A01(long j) {
        if (C78613fT.A08(j) && C78613fT.A07(j)) {
            return AbstractC78673fZ.A00(C78613fT.A01(j), C78613fT.A00(j));
        }
        return AbstractC78683fa.A00;
    }

    public static final long A02(long j, int i, int i2) {
        boolean A06 = C78613fT.A06(j);
        if (!A06 && !C78613fT.A05(j)) {
            return AbstractC78673fZ.A00(Math.max(C78613fT.A03(j), i), Math.max(C78613fT.A02(j), i2));
        }
        if (A06) {
            i = C78613fT.A01(j);
        }
        if (C78613fT.A05(j)) {
            i2 = C78613fT.A00(j);
        }
        return AbstractC78673fZ.A00(i, i2);
    }
}
