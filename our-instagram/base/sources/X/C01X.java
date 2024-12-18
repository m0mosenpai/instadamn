package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.01X, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C01X {
    public int A00;
    public int A01;
    public long[] A03 = AbstractC004701m.A00;
    public long[] A02 = C01Z.A00;
    public Object[] A04 = AbstractC005301s.A02;

    public final Object A03(long j) {
        int i = ((int) (j ^ (j >>> 32))) * (-862048943);
        int i2 = i ^ (i << 16);
        int i3 = i2 & StringTreeSet.MAX_SYMBOL_COUNT;
        int i4 = this.A00;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.A03;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (i3 * 72340172838076673L) ^ j2;
            for (long j4 = (j3 ^ (-1)) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.A02[numberOfTrailingZeros] == j) {
                    if (numberOfTrailingZeros >= 0) {
                        return this.A04[numberOfTrailingZeros];
                    }
                    return null;
                }
            }
            if ((j2 & ((j2 ^ (-1)) << 6) & (-9187201950435737472L)) == 0) {
                i6 += 8;
                i5 = (i5 + i6) & i4;
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d8, code lost:
    
        if (((r20 & ((r20 ^ (-1)) << 6)) & (-9187201950435737472L)) != 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01X.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        long[] jArr = this.A02;
        Object[] objArr = this.A04;
        long[] jArr2 = this.A03;
        int length = jArr2.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr2[i3];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - (((i3 - length) ^ (-1)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            long j2 = jArr[i6];
                            Object obj = objArr[i6];
                            int i7 = (int) (j2 ^ (j2 >>> 32));
                            if (obj != null) {
                                i = obj.hashCode();
                            } else {
                                i = 0;
                            }
                            i2 += i ^ i7;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    public final String toString() {
        if (this.A01 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        long[] jArr = this.A02;
        Object[] objArr = this.A04;
        long[] jArr2 = this.A03;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr2[i];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - (((i - length) ^ (-1)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            long j2 = jArr[i5];
                            Object obj = objArr[i5];
                            sb.append(j2);
                            sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
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
        String obj2 = sb.toString();
        C14360o3.A07(obj2);
        return obj2;
    }
}
