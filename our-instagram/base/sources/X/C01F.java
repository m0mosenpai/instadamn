package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.NoSuchElementException;

/* renamed from: X.01F, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C01F {
    public int A00;
    public int A01;
    public int[] A02;
    public int[] A03;
    public long[] A04 = AbstractC004701m.A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C01F) {
                C01F c01f = (C01F) obj;
                if (c01f.A01 == this.A01) {
                    int[] iArr = this.A02;
                    int[] iArr2 = this.A03;
                    long[] jArr = this.A04;
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
                                        int i5 = iArr[i4];
                                        int i6 = iArr2[i4];
                                        int A03 = c01f.A03(i5);
                                        if (A03 >= 0) {
                                            if (i6 != c01f.A03[A03]) {
                                                break loop0;
                                            }
                                        } else {
                                            throw new NoSuchElementException(AnonymousClass001.A0O("Cannot find value for key ", i5));
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
        int[] iArr = this.A02;
        int[] iArr2 = this.A03;
        long[] jArr = this.A04;
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
                            int i5 = (i2 << 3) + i4;
                            i += iArr2[i5] ^ iArr[i5];
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
        int i = this.A01;
        if (i == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int[] iArr = this.A02;
        int[] iArr2 = this.A03;
        long[] jArr = this.A04;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - (((i2 - length) ^ (-1)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr[i6];
                            int i8 = iArr2[i6];
                            sb.append(i7);
                            sb.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                            sb.append(i8);
                            i3++;
                            if (i3 < i) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append('}');
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public C01F() {
        int[] iArr = C01P.A00;
        this.A02 = iArr;
        this.A03 = iArr;
    }

    public final int A03(int i) {
        int i2 = (-862048943) * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 & StringTreeSet.MAX_SYMBOL_COUNT;
        int i5 = this.A00;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.A04;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            for (long j3 = (j2 ^ (-1)) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.A02[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((j ^ (-1)) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }
}
