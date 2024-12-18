package X;

/* renamed from: X.Vsv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69654Vsv {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int[] A05;
    public long[] A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final long A0A;
    public final XG2 A0B;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C69736VuW A00(long r12) {
        /*
            r11 = this;
            long r1 = r11.A0A
            int r0 = r11.A09
            long r3 = (long) r0
            long r1 = r1 / r3
            long r12 = r12 / r1
            int r4 = (int) r12
            int[] r5 = r11.A05
            int r3 = java.util.Arrays.binarySearch(r5, r4)
            if (r3 >= 0) goto L4e
            int r0 = r3 + 2
            int r3 = -r0
        L13:
            r0 = 0
            int r5 = java.lang.Math.max(r0, r3)
            int[] r10 = r11.A05
            r0 = r10[r5]
            long r7 = (long) r0
            long r7 = r7 * r1
            if (r0 != r4) goto L2f
            long[] r0 = r11.A06
            r0 = r0[r5]
            X.W5N r6 = new X.W5N
            r6.<init>(r7, r0)
        L29:
            X.VuW r1 = new X.VuW
            r1.<init>(r6, r6)
            return r1
        L2f:
            long[] r9 = r11.A06
            r3 = r9[r5]
            X.W5N r6 = new X.W5N
            r6.<init>(r7, r3)
            int r5 = r5 + 1
            int r0 = r9.length
            if (r5 >= r0) goto L29
            r0 = r10[r5]
            long r3 = (long) r0
            long r3 = r3 * r1
            r1 = r9[r5]
            X.W5N r0 = new X.W5N
            r0.<init>(r3, r1)
            X.VuW r1 = new X.VuW
            r1.<init>(r6, r0)
            return r1
        L4e:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L57
            r0 = r5[r3]
            if (r0 != r4) goto L57
            goto L4e
        L57:
            int r3 = r3 + 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69654Vsv.A00(long):X.VuW");
    }

    public C69654Vsv(XG2 xg2, int i, int i2, int i3, long j) {
        this.A0A = j;
        this.A09 = i3;
        this.A0B = xg2;
        int i4 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.A08 = i4 | (i2 == 2 ? 1667497984 : 1651965952);
        this.A07 = i2 == 2 ? i4 | 1650720768 : -1;
        this.A06 = new long[512];
        this.A05 = new int[512];
    }
}
