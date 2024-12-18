package X;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.0Zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07190Zs {
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public String A0A;
    public boolean A0C;
    public final int[] A0F = new int[3];
    public final int[] A0G = new int[3];
    public final int[] A0D = new int[3];
    public final int[] A0E = new int[3];
    public int A02 = -1;
    public ArrayList A0B = new ArrayList();

    public final void A00() {
        this.A0A = null;
        this.A08 = 0;
        this.A00 = 0;
        this.A0C = false;
        this.A05 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A06 = 0;
        this.A02 = -1;
        Arrays.fill(this.A0D, 0);
        int[] iArr = this.A0E;
        Arrays.fill(iArr, 0);
        Arrays.fill(this.A0F, 0);
        Arrays.fill(iArr, 0);
        this.A09 = 0;
        this.A07 = 0;
        this.A01 = 0;
        this.A0B.clear();
    }

    public final void A01(int i, int i2) {
        int[] iArr = this.A0F;
        int[] iArr2 = this.A0G;
        int binarySearch = Arrays.binarySearch(iArr2, i2);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        if (binarySearch > 0) {
            System.arraycopy(iArr2, 1, iArr2, 0, binarySearch);
            System.arraycopy(iArr, 1, iArr, 0, binarySearch);
        } else if (binarySearch < 0) {
            return;
        }
        iArr2[binarySearch] = i2;
        iArr[binarySearch] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057 A[EDGE_INSN: B:24:0x0057->B:25:0x0057 BREAK  A[LOOP:0: B:14:0x003f->B:21:0x0051], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C07190Zs r8) {
        /*
            r7 = this;
            int r0 = r8.A08
            if (r0 > 0) goto L6
            int r0 = r7.A08
        L6:
            r7.A08 = r0
            int r0 = r8.A00
            if (r0 > 0) goto Le
            int r0 = r7.A00
        Le:
            r7.A00 = r0
            boolean r1 = r7.A0C
            boolean r0 = r8.A0C
            r1 = r1 & r0
            r7.A0C = r1
            int r1 = r7.A05
            int r0 = r8.A05
            int r1 = r1 + r0
            r7.A05 = r1
            int r1 = r7.A04
            int r0 = r8.A04
            int r1 = r1 + r0
            r7.A04 = r1
            int r1 = r7.A03
            int r0 = r8.A03
            int r1 = r1 + r0
            r7.A03 = r1
            int r1 = r7.A06
            int r0 = r8.A06
            int r1 = r1 + r0
            r7.A06 = r1
            int r1 = r7.A02
            if (r1 < 0) goto L54
            int r0 = r8.A02
            if (r0 < 0) goto L3e
            int r1 = r1 + r0
        L3c:
            r7.A02 = r1
        L3e:
            r2 = 0
        L3f:
            int[] r1 = r8.A0F
            r0 = 3
            if (r2 >= r0) goto L57
            r1 = r1[r2]
            int[] r0 = r8.A0G
            r0 = r0[r2]
            if (r1 == 0) goto L51
            if (r0 == 0) goto L51
            r7.A01(r1, r0)
        L51:
            int r2 = r2 + 1
            goto L3f
        L54:
            int r1 = r8.A02
            goto L3c
        L57:
            int r1 = r7.A09
            int r0 = r8.A09
            int r0 = java.lang.Math.max(r1, r0)
            r7.A09 = r0
            int r1 = r7.A07
            int r0 = r8.A07
            int r1 = r1 + r0
            r7.A07 = r1
            int r1 = r7.A01
            int r0 = r8.A01
            int r1 = r1 + r0
            r7.A01 = r1
            java.util.ArrayList r0 = r7.A0B
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.ArrayList r0 = r8.A0B
            java.util.Iterator r6 = r0.iterator()
        L7c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lc4
            java.lang.Object r5 = r6.next()
            X.0Zt r5 = (X.C07200Zt) r5
            java.util.ArrayList r0 = r7.A0B
            java.util.Iterator r4 = r0.iterator()
        L8e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lc0
            java.lang.Object r2 = r4.next()
            X.0Zt r2 = (X.C07200Zt) r2
            int r1 = r5.A01
            int r0 = r2.A01
            if (r1 != r0) goto L8e
            int r1 = r2.A02
            int r0 = r5.A02
            int r1 = r1 + r0
            r2.A02 = r1
            int r1 = r2.A03
            int r0 = r5.A03
            int r1 = r1 + r0
            r2.A03 = r1
            int r1 = r2.A00
            int r0 = r5.A00
            int r1 = r1 + r0
            r2.A00 = r1
            int r1 = r2.A04
            int r0 = r5.A04
            int r0 = java.lang.Math.max(r1, r0)
            r2.A04 = r0
            goto L7c
        Lc0:
            r3.add(r5)
            goto L7c
        Lc4:
            r7.A0B = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07190Zs.A02(X.0Zs):void");
    }
}
