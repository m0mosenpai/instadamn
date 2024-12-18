package X;

/* renamed from: X.01O, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C01O {
    public int A00;
    public int A01;
    public long[] A03 = AbstractC004701m.A00;
    public int[] A02 = C01P.A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C01O) {
                C01O c01o = (C01O) obj;
                if (c01o.A01 == this.A01) {
                    int[] iArr = this.A02;
                    long[] jArr = this.A03;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        loop0: while (true) {
                            long j = jArr[i];
                            if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128 && !c01o.A04(iArr[(i << 3) + i3])) {
                                        break loop0;
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int[] iArr = this.A02;
        long[] jArr = this.A03;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - (((i2 - length) ^ (-1)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            i += iArr[(i2 << 3) + i4];
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.A02;
        long[] jArr = this.A03;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - (((i - length) ^ (-1)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = iArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(i5);
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append((CharSequence) "]");
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (((r16 & ((r16 ^ (-1)) << 6)) & (-9187201950435737472L)) != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(int r21) {
        /*
            r20 = this;
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            r8 = r21
            int r1 = r1 * r21
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r7 = r1 & 127(0x7f, float:1.78E-43)
            r9 = r20
            int r6 = r9.A00
            int r19 = r1 >>> 7
            r19 = r19 & r6
            r18 = 0
        L16:
            long[] r3 = r9.A03
            int r2 = r19 >> 3
            r0 = r19 & 7
            int r1 = r0 << 3
            r10 = r3[r2]
            long r10 = r10 >>> r1
            int r0 = r2 + 1
            r16 = r3[r0]
            int r0 = 64 - r1
            long r16 = r16 << r0
            long r3 = (long) r1
            long r1 = -r3
            r0 = 63
            long r1 = r1 >> r0
            long r16 = r16 & r1
            long r16 = r16 | r10
            long r4 = (long) r7
            r2 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r4 = r4 * r2
            long r4 = r4 ^ r16
            long r0 = r4 - r2
            r14 = -1
            long r4 = r4 ^ r14
            long r4 = r4 & r0
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r12
        L47:
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 == 0) goto L67
            int r0 = java.lang.Long.numberOfTrailingZeros(r4)
            int r1 = r0 >> 3
            int r1 = r1 + r19
            r1 = r1 & r6
            int[] r0 = r9.A02
            r0 = r0[r1]
            if (r0 != r8) goto L61
            r0 = 1
            if (r1 >= 0) goto L60
        L5f:
            r0 = 0
        L60:
            return r0
        L61:
            r2 = 1
            long r0 = r4 - r2
            long r4 = r4 & r0
            goto L47
        L67:
            long r1 = r16 ^ r14
            r0 = 6
            long r1 = r1 << r0
            long r16 = r16 & r1
            long r16 = r16 & r12
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 != 0) goto L5f
            int r18 = r18 + 8
            int r19 = r19 + r18
            r19 = r19 & r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01O.A04(int):boolean");
    }
}
