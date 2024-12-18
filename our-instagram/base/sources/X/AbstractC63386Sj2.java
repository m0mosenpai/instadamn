package X;

import java.util.Arrays;

/* renamed from: X.Sj2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63386Sj2 {
    public static final int[] A01 = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] A00 = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] A02 = {67108863, 33554431};
    public static final int[] A03 = {26, 25};

    public static void A04(long[] out, long[] in2, long[] in) {
        out[0] = in2[0] * in[0];
        long j = in2[0];
        long j2 = in[1] * j;
        long j3 = in2[1];
        long j4 = in[0];
        out[1] = j2 + (j3 * j4);
        long j5 = in2[1];
        long j6 = in[1];
        out[2] = (j5 * 2 * j6) + (in[2] * j) + (in2[2] * j4);
        long j7 = in[2];
        long j8 = in2[2];
        out[3] = (j5 * j7) + (j8 * j6) + (in[3] * j) + (in2[3] * j4);
        long j9 = in[3];
        long j10 = in2[3];
        out[4] = (j8 * j7) + (((j5 * j9) + (j10 * j6)) * 2) + (in[4] * j) + (in2[4] * j4);
        long j11 = in[4];
        long j12 = in2[4];
        out[5] = (j8 * j9) + (j10 * j7) + (j5 * j11) + (j12 * j6) + (in[5] * j) + (in2[5] * j4);
        long j13 = in[5];
        long j14 = in2[5];
        out[6] = (((j10 * j9) + (j5 * j13) + (j14 * j6)) * 2) + (j8 * j11) + (j12 * j7) + (in[6] * j) + (in2[6] * j4);
        long j15 = in[6];
        long j16 = in2[6];
        out[7] = (j10 * j11) + (j12 * j9) + (j8 * j13) + (j14 * j7) + (j5 * j15) + (j16 * j6) + (in[7] * j) + (in2[7] * j4);
        long j17 = in[7];
        long j18 = in2[7];
        out[8] = (j12 * j11) + (((j10 * j13) + (j14 * j9) + (j5 * j17) + (j18 * j6)) * 2) + (j8 * j15) + (j16 * j7) + (in[8] * j) + (in2[8] * j4);
        long j19 = in[8];
        long j20 = in2[8];
        out[9] = (j12 * j13) + (j14 * j11) + (j10 * j15) + (j16 * j9) + (j8 * j17) + (j18 * j7) + (j5 * j19) + (j20 * j6) + (j * in[9]) + (in2[9] * j4);
        long j21 = in[9];
        long j22 = in2[9];
        out[10] = (((j14 * j13) + (j10 * j17) + (j18 * j9) + (j5 * j21) + (j6 * j22)) * 2) + (j12 * j15) + (j16 * j11) + (j8 * j19) + (j20 * j7);
        out[11] = (j14 * j15) + (j16 * j13) + (j12 * j17) + (j18 * j11) + (j10 * j19) + (j20 * j9) + (j8 * j21) + (j7 * j22);
        out[12] = (j16 * j15) + (((j14 * j17) + (j18 * j13) + (j10 * j21) + (j9 * j22)) * 2) + (j12 * j19) + (j20 * j11);
        out[13] = (j16 * j17) + (j18 * j15) + (j14 * j19) + (j20 * j13) + (j12 * j21) + (j11 * j22);
        out[14] = (((j18 * j17) + (j14 * j21) + (j13 * j22)) * 2) + (j16 * j19) + (j20 * j15);
        out[15] = (j18 * j19) + (j20 * j17) + (j16 * j21) + (j15 * j22);
        out[16] = (j20 * j19) + (((j18 * j21) + (j17 * j22)) * 2);
        out[17] = (j20 * j21) + (j19 * j22);
        out[18] = j22 * 2 * j21;
    }

    public static void A05(long[] output, long[] in1, long[] in2) {
        int i = 0;
        do {
            output[i] = in1[i] - in2[i];
            i++;
        } while (i < 10);
    }

    public static void A06(long[] output, long[] in1, long[] in2) {
        int i = 0;
        do {
            output[i] = in1[i] + in2[i];
            i++;
        } while (i < 10);
    }

    public static void A00(long[] output) {
        output[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = output[i];
            long j2 = j / 67108864;
            output[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = output[i2] + j2;
            output[i2] = j3;
            long j4 = j3 / 33554432;
            output[i2] = j3 - (j4 << 25);
            i += 2;
            output[i] = output[i] + j4;
        }
        long j5 = output[0];
        long j6 = output[10];
        long j7 = j5 + (j6 << 4);
        output[0] = j7;
        long j8 = j7 + (j6 << 1);
        output[0] = j8;
        long j9 = j8 + j6;
        output[0] = j9;
        output[10] = 0;
        long j10 = j9 / 67108864;
        output[0] = j9 - (j10 << 26);
        output[1] = output[1] + j10;
    }

    public static void A01(long[] output) {
        long j = output[8];
        long j2 = output[18];
        long j3 = j + (j2 << 4);
        output[8] = j3;
        long j4 = j3 + (j2 << 1);
        output[8] = j4;
        output[8] = j4 + j2;
        long j5 = output[7];
        long j6 = output[17];
        long j7 = j5 + (j6 << 4);
        output[7] = j7;
        long j8 = j7 + (j6 << 1);
        output[7] = j8;
        output[7] = j8 + j6;
        long j9 = output[6];
        long j10 = output[16];
        long j11 = j9 + (j10 << 4);
        output[6] = j11;
        long j12 = j11 + (j10 << 1);
        output[6] = j12;
        output[6] = j12 + j10;
        long j13 = output[5];
        long j14 = output[15];
        long j15 = j13 + (j14 << 4);
        output[5] = j15;
        long j16 = j15 + (j14 << 1);
        output[5] = j16;
        output[5] = j16 + j14;
        long j17 = output[4];
        long j18 = output[14];
        long j19 = j17 + (j18 << 4);
        output[4] = j19;
        long j20 = j19 + (j18 << 1);
        output[4] = j20;
        output[4] = j20 + j18;
        long j21 = output[3];
        long j22 = output[13];
        long j23 = j21 + (j22 << 4);
        output[3] = j23;
        long j24 = j23 + (j22 << 1);
        output[3] = j24;
        output[3] = j24 + j22;
        long j25 = output[2];
        long j26 = output[12];
        long j27 = j25 + (j26 << 4);
        output[2] = j27;
        long j28 = j27 + (j26 << 1);
        output[2] = j28;
        output[2] = j28 + j26;
        long j29 = output[1];
        long j30 = output[11];
        long j31 = j29 + (j30 << 4);
        output[1] = j31;
        long j32 = j31 + (j30 << 1);
        output[1] = j32;
        output[1] = j32 + j30;
        long j33 = output[0];
        long j34 = output[10];
        long j35 = j33 + (j34 << 4);
        output[0] = j35;
        long j36 = j35 + (j34 << 1);
        output[0] = j36;
        output[0] = j36 + j34;
    }

    public static void A02(long[] output, long[] in) {
        long j = in[0];
        long j2 = in[0];
        long j3 = in[1];
        long j4 = in[2];
        long j5 = in[3];
        long j6 = in[4];
        long j7 = (j5 * j5) + (j4 * j6) + (in[6] * j2);
        long j8 = in[5];
        long j9 = in[6];
        long j10 = (j4 * j9) + (in[8] * j2);
        long j11 = in[7];
        long j12 = in[8];
        long j13 = in[9];
        long[] jArr = {j * j, j2 * 2 * in[1], ((j3 * j3) + (in[2] * j2)) * 2, ((j3 * j4) + (in[3] * j2)) * 2, (j4 * j4) + (j3 * 4 * j5) + (j2 * 2 * in[4]), ((j4 * j5) + (j3 * j6) + (in[5] * j2)) * 2, (j7 + (j3 * 2 * j8)) * 2, ((j5 * j6) + (j4 * j8) + (j3 * j9) + (in[7] * j2)) * 2, (j6 * j6) + ((j10 + (((j3 * j11) + (j5 * j8)) * 2)) * 2), ((j6 * j8) + (j5 * j9) + (j4 * j11) + (j3 * j12) + (j2 * in[9])) * 2, ((j8 * j8) + (j6 * j9) + (j4 * j12) + (((j5 * j11) + (j3 * j13)) * 2)) * 2, ((j8 * j9) + (j6 * j11) + (j5 * j12) + (j4 * j13)) * 2, (j9 * j9) + (((j6 * j12) + (((j8 * j11) + (j5 * j13)) * 2)) * 2), ((j9 * j11) + (j8 * j12) + (j6 * j13)) * 2, ((j11 * j11) + (j9 * j12) + (j8 * 2 * j13)) * 2, ((j11 * j12) + (j9 * j13)) * 2, (j12 * j12) + (j11 * 4 * j13), j12 * 2 * j13, 2 * j13 * j13};
        A01(jArr);
        A00(jArr);
        System.arraycopy(jArr, 0, output, 0, 10);
    }

    public static void A03(long[] output, long[] in, long[] in2) {
        long[] jArr = new long[19];
        A04(jArr, in, in2);
        A01(jArr);
        A00(jArr);
        System.arraycopy(jArr, 0, output, 0, 10);
    }

    public static byte[] A07(long[] inputLimbs) {
        int[] iArr;
        long[] copyOf = Arrays.copyOf(inputLimbs, 10);
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = 0;
            do {
                long j = copyOf[i3];
                int i4 = -((int) (((j >> 31) & j) >> A03[i3 & 1]));
                copyOf[i3] = j + (i4 << r3);
                i3++;
                copyOf[i3] = copyOf[i3] - i4;
            } while (i3 < 9);
            long j2 = copyOf[9];
            copyOf[9] = j2 + (r4 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j2 >> 31) & j2) >> 25))) * 19);
        }
        long j3 = copyOf[0];
        copyOf[0] = j3 + (r4 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j3 >> 31) & j3) >> 26)));
        int i5 = 0;
        do {
            int i6 = 0;
            do {
                long j4 = copyOf[i6];
                int i7 = (int) (j4 >> A03[i6 & 1]);
                iArr = A02;
                copyOf[i6] = j4 & iArr[r2];
                i6++;
                copyOf[i6] = copyOf[i6] + i7;
            } while (i6 < 9);
            i5++;
        } while (i5 < 2);
        copyOf[9] = copyOf[9] & 33554431;
        long j5 = copyOf[0] + (((int) (r2 >> 25)) * 19);
        copyOf[0] = j5;
        int i8 = ((((int) j5) - 67108845) >> 31) ^ (-1);
        int i9 = 1;
        do {
            int i10 = (((int) copyOf[i9]) ^ iArr[i9 & 1]) ^ (-1);
            int i11 = i10 & (i10 << 16);
            int i12 = i11 & (i11 << 8);
            int i13 = i12 & (i12 << 4);
            int i14 = i13 & (i13 << 2);
            i8 &= (i14 & (i14 << 1)) >> 31;
            i9++;
        } while (i9 < 10);
        copyOf[0] = j5 - (67108845 & i8);
        long j6 = 33554431 & i8;
        copyOf[1] = copyOf[1] - j6;
        int i15 = 2;
        do {
            copyOf[i15] = copyOf[i15] - (67108863 & i8);
            int i16 = i15 + 1;
            copyOf[i16] = copyOf[i16] - j6;
            i15 += 2;
        } while (i15 < 10);
        int i17 = 0;
        do {
            copyOf[i17] = copyOf[i17] << A00[i17];
            i17++;
        } while (i17 < 10);
        byte[] bArr = new byte[32];
        do {
            int i18 = A01[i];
            long j7 = bArr[i18];
            long j8 = copyOf[i];
            bArr[i18] = (byte) (j7 | (j8 & 255));
            bArr[i18 + 1] = (byte) (bArr[r7] | ((j8 >> 8) & 255));
            bArr[i18 + 2] = (byte) (bArr[r7] | ((j8 >> 16) & 255));
            bArr[i18 + 3] = (byte) (bArr[r3] | ((j8 >> 24) & 255));
            i++;
        } while (i < 10);
        return bArr;
    }
}
