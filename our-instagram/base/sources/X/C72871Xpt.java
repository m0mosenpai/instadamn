package X;

/* renamed from: X.Xpt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72871Xpt {
    public final Y25 A00;
    public final int[] A01;

    public final int A00(int i) {
        if (i == 0) {
            return this.A01[r1.length - 1];
        }
        int[] iArr = this.A01;
        if (i == 1) {
            int i2 = 0;
            for (int i3 : iArr) {
                i2 ^= i3;
            }
            return i2;
        }
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = this.A00.A01(i, i4) ^ iArr[i5];
        }
        return i4;
    }

    public final C72871Xpt A01(int i) {
        if (i == 0) {
            return this.A00.A02;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = this.A01;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = this.A00.A01(iArr[i2], i);
        }
        return new C72871Xpt(this.A00, iArr2);
    }

    public final C72871Xpt A02(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.A00.A02;
            }
            int[] iArr = this.A01;
            int length = iArr.length;
            int[] iArr2 = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr2[i3] = this.A00.A01(iArr[i3], i2);
            }
            return new C72871Xpt(this.A00, iArr2);
        }
        throw new IllegalArgumentException();
    }

    public final C72871Xpt A03(C72871Xpt c72871Xpt) {
        Y25 y25 = this.A00;
        if (y25.equals(c72871Xpt.A00)) {
            int[] iArr = this.A01;
            if (iArr[0] != 0) {
                int[] iArr2 = c72871Xpt.A01;
                if (iArr2[0] == 0) {
                    return this;
                }
                int[] iArr3 = iArr;
                if (iArr.length <= iArr2.length) {
                    iArr3 = iArr2;
                    iArr2 = iArr;
                }
                int length = iArr3.length;
                int[] iArr4 = new int[length];
                int length2 = length - iArr2.length;
                System.arraycopy(iArr3, 0, iArr4, 0, length2);
                for (int i = length2; i < length; i++) {
                    iArr4[i] = iArr2[i - length2] ^ iArr3[i];
                }
                return new C72871Xpt(y25, iArr4);
            }
            return c72871Xpt;
        }
        throw AbstractC166987dD.A12("GenericGFPolys do not have same GenericGF field");
    }

    public final C72871Xpt A04(C72871Xpt c72871Xpt) {
        Y25 y25 = this.A00;
        if (y25.equals(c72871Xpt.A00)) {
            int[] iArr = this.A01;
            if (iArr[0] != 0) {
                int[] iArr2 = c72871Xpt.A01;
                if (iArr2[0] != 0) {
                    int length = iArr.length;
                    int length2 = iArr2.length;
                    int[] iArr3 = new int[(length + length2) - 1];
                    for (int i = 0; i < length; i++) {
                        int i2 = iArr[i];
                        for (int i3 = 0; i3 < length2; i3++) {
                            int i4 = i + i3;
                            iArr3[i4] = iArr3[i4] ^ y25.A01(i2, iArr2[i3]);
                        }
                    }
                    return new C72871Xpt(y25, iArr3);
                }
            }
            return y25.A02;
        }
        throw AbstractC166987dD.A12("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[EDGE_INSN: B:29:0x0073->B:30:0x0073 BREAK  A[LOOP:0: B:6:0x0015->B:19:0x0044], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r7 = this;
            int[] r6 = r7.A01
            r0 = 0
            r0 = r6[r0]
            if (r0 != 0) goto La
            java.lang.String r0 = "0"
            return r0
        La:
            int r0 = r6.length
            int r5 = r0 + (-1)
            int r0 = r5 * 8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r3 = r5
        L15:
            if (r3 < 0) goto L73
            int r0 = r5 - r3
            r1 = r6[r0]
            if (r1 == 0) goto L44
            if (r1 >= 0) goto L61
            if (r3 != r5) goto L5e
            java.lang.String r0 = "-"
        L23:
            r4.append(r0)
            int r1 = -r1
        L27:
            r2 = 1
            if (r3 == 0) goto L2c
            if (r1 == r2) goto L3d
        L2c:
            X.Y25 r0 = r7.A00
            if (r1 == 0) goto L6d
            int[] r0 = r0.A04
            r1 = r0[r1]
            if (r1 != 0) goto L50
            r0 = 49
        L38:
            r4.append(r0)
        L3b:
            if (r3 == 0) goto L73
        L3d:
            if (r3 != r2) goto L47
            r0 = 120(0x78, float:1.68E-43)
            r4.append(r0)
        L44:
            int r3 = r3 + (-1)
            goto L15
        L47:
            java.lang.String r0 = "x^"
            r4.append(r0)
            r4.append(r3)
            goto L44
        L50:
            if (r1 != r2) goto L55
            r0 = 97
            goto L38
        L55:
            java.lang.String r0 = "a^"
            r4.append(r0)
            r4.append(r1)
            goto L3b
        L5e:
            java.lang.String r0 = " - "
            goto L23
        L61:
            int r0 = r4.length()
            if (r0 <= 0) goto L27
            java.lang.String r0 = " + "
            r4.append(r0)
            goto L27
        L6d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L73:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72871Xpt.toString():java.lang.String");
    }

    public C72871Xpt(Y25 y25, int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            this.A00 = y25;
            if (length > 1 && iArr[0] == 0) {
                int i = 1;
                while (iArr[i] == 0 && (i = i + 1) < length) {
                }
                if (i == length) {
                    this.A01 = new int[]{0};
                    return;
                }
                int i2 = length - i;
                int[] iArr2 = new int[i2];
                this.A01 = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, i2);
                return;
            }
            this.A01 = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }
}
