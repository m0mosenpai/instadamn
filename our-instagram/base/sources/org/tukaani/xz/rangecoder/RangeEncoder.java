package org.tukaani.xz.rangecoder;

import X.AbstractC20430zK;
import com.facebook.common.dextricks.Constants;

/* loaded from: classes.dex */
public final class RangeEncoder extends AbstractC20430zK {
    public static final int[] A06;
    public final byte[] A05 = new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED];
    public long A04 = 0;
    public int A03 = -1;
    public byte A00 = 0;
    public int A02 = 1;
    public int A01 = 0;

    public static int A00(short[] sArr, int i) {
        int length = i | sArr.length;
        int i2 = 0;
        do {
            int i3 = length & 1;
            length >>>= 1;
            i2 += A06[(sArr[length] ^ ((-i3) & 2047)) >>> 4];
        } while (length != 1);
        return i2;
    }

    public static void A01(RangeEncoder rangeEncoder) {
        int i;
        long j = rangeEncoder.A04;
        int i2 = (int) (j >>> 32);
        if (i2 != 0 || j < 4278190080L) {
            byte b = rangeEncoder.A00;
            do {
                byte[] bArr = rangeEncoder.A05;
                int i3 = rangeEncoder.A01;
                rangeEncoder.A01 = i3 + 1;
                bArr[i3] = (byte) (b + i2);
                b = 255;
                i = rangeEncoder.A02 - 1;
                rangeEncoder.A02 = i;
            } while (i != 0);
            rangeEncoder.A00 = (byte) (j >>> 24);
        }
        rangeEncoder.A02++;
        rangeEncoder.A04 = (j & 16777215) << 8;
    }

    public final void A02(short[] sArr, int i) {
        int length = sArr.length;
        int i2 = 1;
        do {
            length >>>= 1;
            int i3 = i & length;
            A03(sArr, i2, i3);
            i2 <<= 1;
            if (i3 != 0) {
                i2 |= 1;
            }
        } while (length != 1);
    }

    public final void A03(short[] sArr, int i, int i2) {
        int i3;
        short s = sArr[i];
        int i4 = this.A03;
        int i5 = (i4 >>> 11) * s;
        if (i2 == 0) {
            this.A03 = i5;
            i3 = s + ((2048 - s) >>> 5);
        } else {
            this.A04 += i5 & 4294967295L;
            int i6 = i4 - i5;
            this.A03 = i6;
            i5 = i6;
            i3 = s - (s >>> 5);
        }
        sArr[i] = (short) i3;
        if (((-16777216) & i5) == 0) {
            this.A03 = i5 << 8;
            A01(this);
        }
    }

    static {
        try {
            Class.forName("org.tukaani.xz.rangecoder.RangeEncoder");
            int[] iArr = new int[128];
            A06 = iArr;
            for (int i = 8; i < 2048; i += 16) {
                int i2 = 0;
                int i3 = i;
                int i4 = 0;
                do {
                    i3 *= i3;
                    i4 <<= 1;
                    while (((-65536) & i3) != 0) {
                        i3 >>>= 1;
                        i4++;
                    }
                    i2++;
                } while (i2 < 4);
                iArr[i >> 4] = 161 - i4;
            }
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }
}
