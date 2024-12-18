package X;

/* renamed from: X.01Y, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C01Y {
    public int A00;
    public int A01;
    public long[] A03 = AbstractC004701m.A00;
    public long[] A02 = C01Z.A00;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (((r15 & ((r15 ^ (-1)) << 6)) & (-9187201950435737472L)) != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(long r20) {
        /*
            r19 = this;
            r0 = 32
            long r0 = r20 >>> r0
            long r2 = r20 ^ r0
            int r1 = (int) r2
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r7 = r1 & 127(0x7f, float:1.78E-43)
            r8 = r19
            int r6 = r8.A00
            int r18 = r1 >>> 7
            r18 = r18 & r6
            r17 = 0
        L1a:
            long[] r3 = r8.A03
            int r2 = r18 >> 3
            r0 = r18 & 7
            int r1 = r0 << 3
            r9 = r3[r2]
            long r9 = r9 >>> r1
            int r0 = r2 + 1
            r15 = r3[r0]
            int r0 = 64 - r1
            long r15 = r15 << r0
            long r3 = (long) r1
            long r1 = -r3
            r0 = 63
            long r1 = r1 >> r0
            long r15 = r15 & r1
            long r15 = r15 | r9
            long r4 = (long) r7
            r2 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r4 = r4 * r2
            long r4 = r4 ^ r15
            long r0 = r4 - r2
            r13 = -1
            long r4 = r4 ^ r13
            long r4 = r4 & r0
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r11
        L47:
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L69
            int r0 = java.lang.Long.numberOfTrailingZeros(r4)
            int r3 = r0 >> 3
            int r3 = r3 + r18
            r3 = r3 & r6
            long[] r0 = r8.A02
            r1 = r0[r3]
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 != 0) goto L63
            r0 = 1
            if (r3 >= 0) goto L62
        L61:
            r0 = 0
        L62:
            return r0
        L63:
            r2 = 1
            long r0 = r4 - r2
            long r4 = r4 & r0
            goto L47
        L69:
            long r1 = r15 ^ r13
            r0 = 6
            long r1 = r1 << r0
            long r15 = r15 & r1
            long r15 = r15 & r11
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 != 0) goto L61
            int r17 = r17 + 8
            int r18 = r18 + r17
            r18 = r18 & r6
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01Y.A02(long):boolean");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C01Y) {
                C01Y c01y = (C01Y) obj;
                if (c01y.A01 == this.A01) {
                    long[] jArr = this.A02;
                    long[] jArr2 = this.A03;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        loop0: while (true) {
                            long j = jArr2[i];
                            if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128 && !c01y.A02(jArr[(i << 3) + i3])) {
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
        long[] jArr = this.A02;
        long[] jArr2 = this.A03;
        int length = jArr2.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr2[i2];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - (((i2 - length) ^ (-1)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i2 << 3) + i4];
                            i += (int) (j2 ^ (j2 >>> 32));
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
        long[] jArr = this.A02;
        long[] jArr2 = this.A03;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - (((i - length) ^ (-1)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            long j2 = jArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(j2);
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
}
