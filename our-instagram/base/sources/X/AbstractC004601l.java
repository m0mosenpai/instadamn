package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.01l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC004601l {
    public int A00;
    public int A01;
    public long[] A02 = AbstractC004701m.A00;
    public Object[] A03;
    public Object[] A04;

    public final Object A03(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i2 = i * (-862048943);
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 & StringTreeSet.MAX_SYMBOL_COUNT;
        int i5 = this.A00;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.A02;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            for (long j3 = (j2 ^ (-1)) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (C14360o3.A0K(this.A03[numberOfTrailingZeros], obj)) {
                    if (numberOfTrailingZeros >= 0) {
                        return this.A04[numberOfTrailingZeros];
                    }
                    return null;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) == 0) {
                i7 += 8;
                i6 = (i6 + i7) & i5;
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (((r16 & ((r16 ^ (-1)) << 6)) & (-9187201950435737472L)) != 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(java.lang.Object r21) {
        /*
            r20 = this;
            r8 = r21
            if (r21 == 0) goto L83
            int r1 = r8.hashCode()
        L8:
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r7 = r1 & 127(0x7f, float:1.78E-43)
            r9 = r20
            int r6 = r9.A00
            int r19 = r1 >>> 7
            r19 = r19 & r6
            r18 = 0
        L1b:
            long[] r3 = r9.A02
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
        L4c:
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 == 0) goto L70
            int r0 = java.lang.Long.numberOfTrailingZeros(r4)
            int r1 = r0 >> 3
            int r1 = r1 + r19
            r1 = r1 & r6
            java.lang.Object[] r0 = r9.A03
            r0 = r0[r1]
            boolean r0 = X.C14360o3.A0K(r0, r8)
            if (r0 == 0) goto L6a
            r0 = 1
            if (r1 >= 0) goto L69
        L68:
            r0 = 0
        L69:
            return r0
        L6a:
            r2 = 1
            long r0 = r4 - r2
            long r4 = r4 & r0
            goto L4c
        L70:
            long r1 = r16 ^ r14
            r0 = 6
            long r1 = r1 << r0
            long r16 = r16 & r1
            long r16 = r16 & r12
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 != 0) goto L68
            int r18 = r18 + 8
            int r19 = r19 + r18
            r19 = r19 & r6
            goto L1b
        L83:
            r1 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC004601l.A04(java.lang.Object):boolean");
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj != this) {
            if (obj instanceof AbstractC004601l) {
                AbstractC004601l abstractC004601l = (AbstractC004601l) obj;
                if (abstractC004601l.A01 == this.A01) {
                    Object[] objArr = this.A03;
                    Object[] objArr2 = this.A04;
                    long[] jArr = this.A02;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        loop0: while (true) {
                            long j = jArr[i];
                            if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        int i4 = (i << 3) + i3;
                                        Object obj2 = objArr[i4];
                                        Object obj3 = objArr2[i4];
                                        Object A03 = abstractC004601l.A03(obj2);
                                        if (obj3 == null) {
                                            if (A03 != null) {
                                                break loop0;
                                            }
                                            equals = abstractC004601l.A04(obj2);
                                        } else {
                                            equals = obj3.equals(A03);
                                        }
                                        if (!equals) {
                                            break loop0;
                                        }
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
        int i;
        int i2;
        Object[] objArr = this.A03;
        Object[] objArr2 = this.A04;
        long[] jArr = this.A02;
        int length = jArr.length - 2;
        int i3 = 0;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr[i4];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - (((i4 - length) ^ (-1)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j) < 128) {
                            int i7 = (i4 << 3) + i6;
                            Object obj = objArr[i7];
                            Object obj2 = objArr2[i7];
                            if (obj != null) {
                                i = obj.hashCode();
                            } else {
                                i = 0;
                            }
                            if (obj2 != null) {
                                i2 = obj2.hashCode();
                            } else {
                                i2 = 0;
                            }
                            i3 += i2 ^ i;
                        }
                        j >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        return i3;
    }

    public final String toString() {
        if (this.A01 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Object[] objArr = this.A03;
        Object[] objArr2 = this.A04;
        long[] jArr = this.A02;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - (((i - length) ^ (-1)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i2++;
                            if (i2 < this.A01) {
                                sb.append(',');
                                sb.append(' ');
                            }
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
        sb.append('}');
        String obj3 = sb.toString();
        C14360o3.A07(obj3);
        return obj3;
    }

    public AbstractC004601l() {
        Object[] objArr = AbstractC005301s.A02;
        this.A03 = objArr;
        this.A04 = objArr;
    }
}
