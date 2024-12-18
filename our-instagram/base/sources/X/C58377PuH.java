package X;

/* renamed from: X.PuH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58377PuH extends AbstractC61610RqZ {
    public int A00;
    public int A02;
    public final byte[] A05;
    public int A01 = Integer.MAX_VALUE;
    public int A03 = 0;
    public int A04 = 0;

    public C58377PuH(byte[] bArr) {
        this.A05 = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (r4[r2] < 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0M() {
        /*
            r5 = this;
            int r0 = r5.A04
            int r1 = r5.A03
            if (r1 == r0) goto L3c
            byte[] r4 = r5.A05
            int r2 = r0 + 1
            r3 = r4[r0]
            if (r3 < 0) goto L5d
            r5.A04 = r2
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
            long r0 = r5.A0O()
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
            r5.A04 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58377PuH.A0M():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0023, code lost:
    
        if (r5[r9] < 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A0N() {
        /*
            r10 = this;
            int r0 = r10.A04
            int r3 = r10.A03
            if (r3 == r0) goto L25
            byte[] r5 = r10.A05
            int r2 = r0 + 1
            r1 = r5[r0]
            if (r1 < 0) goto L96
            r10.A04 = r2
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
            long r3 = r10.A0O()
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
            r10.A04 = r6
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58377PuH.A0N():long");
    }

    public final long A0O() {
        long j = 0;
        int i = 0;
        do {
            int i2 = this.A04;
            if (i2 != this.A03) {
                byte[] bArr = this.A05;
                this.A04 = i2 + 1;
                j |= (r2 & Byte.MAX_VALUE) << i;
                if ((bArr[i2] & 128) == 0) {
                    return j;
                }
                i += 7;
            } else {
                throw AbstractC58321PtD.A0P();
            }
        } while (i < 64);
        throw AbstractC58318PtA.A0H("CodedInputStream encountered a malformed varint.");
    }
}
