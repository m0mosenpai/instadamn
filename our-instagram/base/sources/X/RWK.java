package X;

/* loaded from: classes10.dex */
public final class RWK extends AbstractC63036SbB {
    public int A00 = Integer.MAX_VALUE;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final byte[] A06;

    public static void A00(RWK rwk) {
        int i = rwk.A02 + rwk.A05;
        rwk.A02 = i;
        int i2 = i - rwk.A04;
        int i3 = rwk.A00;
        if (i2 > i3) {
            int i4 = i2 - i3;
            rwk.A05 = i4;
            rwk.A02 = i - i4;
            return;
        }
        rwk.A05 = 0;
    }

    public final int A0V() {
        int i = this.A03;
        if (this.A02 - i >= 4) {
            byte[] bArr = this.A06;
            this.A03 = i + 4;
            return AbstractC58321PtD.A0F(bArr, i);
        }
        throw C4L5.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (r4[r2] < 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0W() {
        /*
            r5 = this;
            int r0 = r5.A03
            int r1 = r5.A02
            if (r1 == r0) goto L3c
            byte[] r4 = r5.A06
            int r2 = r0 + 1
            r3 = r4[r0]
            if (r3 < 0) goto L5d
            r5.A03 = r2
            return r3
        L11:
            int r2 = r1 + 1
            r1 = r4[r1]
            int r0 = r1 << 28
            r3 = r3 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r3 = r3 ^ r0
            if (r1 >= 0) goto L4d
            int r1 = r2 + 1
            r0 = r4[r2]
            if (r0 >= 0) goto L6d
            int r2 = r1 + 1
            r0 = r4[r1]
            if (r0 >= 0) goto L4d
            int r1 = r2 + 1
            r0 = r4[r2]
            if (r0 >= 0) goto L6d
            int r2 = r1 + 1
            r0 = r4[r1]
            if (r0 >= 0) goto L4d
            int r1 = r2 + 1
            r0 = r4[r2]
            if (r0 >= 0) goto L6d
        L3c:
            long r0 = r5.A0Z()
            int r3 = (int) r0
            return r3
        L42:
            int r2 = r1 + 1
            r0 = r4[r1]
            int r0 = r0 << 14
            r3 = r3 ^ r0
            if (r3 < 0) goto L4f
            r3 = r3 ^ 16256(0x3f80, float:2.278E-41)
        L4d:
            r1 = r2
            goto L6d
        L4f:
            int r1 = r2 + 1
            r0 = r4[r2]
            int r0 = r0 << 21
            r3 = r3 ^ r0
            if (r3 >= 0) goto L11
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r3 = r3 ^ r0
            goto L6d
        L5d:
            int r1 = r1 - r2
            r0 = 9
            if (r1 < r0) goto L3c
            int r1 = r2 + 1
            r0 = r4[r2]
            int r0 = r0 << 7
            r3 = r3 ^ r0
            if (r3 >= 0) goto L42
            r3 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
        L6d:
            r5.A03 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RWK.A0W():int");
    }

    public final long A0X() {
        int i = this.A03;
        if (this.A02 - i >= 8) {
            byte[] bArr = this.A06;
            this.A03 = i + 8;
            return AbstractC58321PtD.A0I(bArr, i);
        }
        throw C4L5.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0023, code lost:
    
        if (r5[r9] < 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A0Y() {
        /*
            r10 = this;
            int r0 = r10.A03
            int r3 = r10.A02
            if (r3 == r0) goto L25
            byte[] r5 = r10.A06
            int r2 = r0 + 1
            r1 = r5[r0]
            if (r1 < 0) goto L96
            r10.A03 = r2
            long r3 = (long) r1
            return r3
        L12:
            int r9 = r6 + 1
            long r3 = X.AbstractC58321PtD.A0J(r5, r6, r1)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L36
            int r6 = r9 + 1
            r0 = r5[r9]
            long r1 = (long) r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto La7
        L25:
            long r3 = r10.A0Z()
            return r3
        L2a:
            int r9 = r6 + 1
            r0 = r5[r6]
            int r0 = r0 << 14
            r1 = r1 ^ r0
            if (r1 < 0) goto L38
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
            long r3 = (long) r0
        L36:
            r6 = r9
            goto La7
        L38:
            int r6 = r9 + 1
            r0 = r5[r9]
            int r0 = r0 << 21
            r1 = r1 ^ r0
            if (r1 >= 0) goto L46
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r1 = r1 ^ r0
            goto La6
        L46:
            long r1 = (long) r1
            int r9 = r6 + 1
            r0 = r5[r6]
            long r3 = (long) r0
            r0 = 28
            long r3 = r3 << r0
            long r1 = r1 ^ r3
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L5b
            r3 = 266354560(0xfe03f80, double:1.315966377E-315)
        L59:
            long r3 = r3 ^ r1
            goto L36
        L5b:
            int r6 = r9 + 1
            r0 = r5[r9]
            long r3 = (long) r0
            r0 = 35
            long r3 = r3 << r0
            long r1 = r1 ^ r3
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L70
            r7 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L6d:
            long r3 = r1 ^ r7
            goto La7
        L70:
            int r9 = r6 + 1
            r0 = r5[r6]
            long r3 = (long) r0
            r0 = 42
            long r3 = r3 << r0
            long r1 = r1 ^ r3
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L83
            r3 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L59
        L83:
            int r6 = r9 + 1
            r0 = r5[r9]
            long r3 = (long) r0
            r0 = 49
            long r3 = r3 << r0
            long r1 = r1 ^ r3
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L12
            r7 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L6d
        L96:
            int r3 = r3 - r2
            r0 = 9
            if (r3 < r0) goto L25
            int r6 = r2 + 1
            r0 = r5[r2]
            int r0 = r0 << 7
            r1 = r1 ^ r0
            if (r1 >= 0) goto L2a
            r1 = r1 ^ (-128(0xffffffffffffff80, float:NaN))
        La6:
            long r3 = (long) r1
        La7:
            r10.A03 = r6
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RWK.A0Y():long");
    }

    public final long A0Z() {
        long j = 0;
        int i = 0;
        do {
            int i2 = this.A03;
            if (i2 != this.A02) {
                byte[] bArr = this.A06;
                this.A03 = i2 + 1;
                j |= (r2 & Byte.MAX_VALUE) << i;
                if ((bArr[i2] & 128) == 0) {
                    return j;
                }
                i += 7;
            } else {
                throw C4L5.A02();
            }
        } while (i < 64);
        throw AbstractC58320PtC.A0e("CodedInputStream encountered a malformed varint.");
    }

    public RWK(byte[] bArr, int i, int i2) {
        this.A06 = bArr;
        this.A02 = i2 + i;
        this.A03 = i;
        this.A04 = i;
    }
}
