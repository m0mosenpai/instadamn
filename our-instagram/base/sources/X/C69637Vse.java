package X;

/* renamed from: X.Vse, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69637Vse {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C69437VnM A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A00(long r6) {
        /*
            r5 = this;
            long[] r4 = r5.A07
            int r3 = java.util.Arrays.binarySearch(r4, r6)
            if (r3 >= 0) goto L18
            r1 = r3 ^ (-1)
        La:
            int r0 = r4.length
            if (r1 >= r0) goto L27
            int[] r0 = r5.A04
            r0 = r0[r1]
            r0 = r0 & 1
            if (r0 != 0) goto L28
            int r1 = r1 + 1
            goto La
        L18:
            int r3 = r3 + 1
            int r0 = r4.length
            if (r3 >= r0) goto L24
            r1 = r4[r3]
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L24
            goto L18
        L24:
            int r1 = r3 + (-1)
            goto La
        L27:
            r1 = -1
        L28:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69637Vse.A00(long):int");
    }

    public C69637Vse(C69437VnM c69437VnM, int[] iArr, int[] iArr2, long[] jArr, long[] jArr2, int i, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        WDn.A01(AbstractC167007dF.A1P(length, length2));
        int length3 = jArr.length;
        WDn.A01(AbstractC167007dF.A1P(length3, length2));
        int length4 = iArr2.length;
        WDn.A01(length4 == length2);
        this.A03 = c69437VnM;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j;
        this.A01 = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }
}
