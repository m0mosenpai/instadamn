package X;

import java.util.Arrays;

/* loaded from: classes12.dex */
public abstract class Y6E {
    public static final int[][] A01;
    public static final int[][] A03;
    public static final int[][] A02 = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] A00 = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    static {
        int[][] iArr = new int[40];
        System.arraycopy(new int[][]{new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, AbstractC62862SUj.MAX_FACTORIAL}}, AbstractC31175DnJ.A1b(new int[][]{new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}}, iArr) ? 1 : 0, iArr, 27, 13);
        A01 = iArr;
        A03 = new int[][]{new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:111:0x01d4. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(YG1 yg1, Y7W y7w, C72829XoL c72829XoL, Integer num, int i) {
        int i2;
        int i3;
        int i4;
        byte[][] bArr = c72829XoL.A02;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = A02[0].length;
        A02(c72829XoL, 0, 0);
        int i5 = c72829XoL.A01;
        int i6 = i5 - length;
        A02(c72829XoL, i6, 0);
        A02(c72829XoL, 0, i6);
        A01(c72829XoL, 0, 7);
        int i7 = i5 - 8;
        A01(c72829XoL, i7, 7);
        A01(c72829XoL, 0, i7);
        A03(c72829XoL, 7, 0);
        int i8 = c72829XoL.A00;
        int i9 = i8 - 7;
        A03(c72829XoL, i9 - 1, 0);
        A03(c72829XoL, 7, i9);
        byte[] bArr3 = bArr[i8 - 8];
        if (bArr3[8] != 0) {
            bArr3[8] = 1;
            int i10 = y7w.A01;
            if (i10 >= 2) {
                int[] iArr = A01[i10 - 1];
                for (int i11 : iArr) {
                    if (i11 >= 0) {
                        for (int i12 : iArr) {
                            if (i12 >= 0 && bArr[i11][i12] == -1) {
                                int i13 = i12 - 2;
                                int i14 = i11 - 2;
                                for (int i15 = 0; i15 < 5; i15++) {
                                    int[] iArr2 = A00[i15];
                                    int i16 = 0;
                                    do {
                                        bArr[i14 + i15][i13 + i16] = (byte) iArr2[i16];
                                        i16++;
                                    } while (i16 < 5);
                                }
                            }
                        }
                    }
                }
            }
            int i17 = 8;
            while (i17 < i5 - 8) {
                int i18 = i17 + 1;
                int i19 = i18 % 2;
                byte[] bArr4 = bArr[6];
                if (bArr4[i17] == -1) {
                    bArr4[i17] = (byte) i19;
                }
                if (bArr[i17][6] == -1) {
                    bArr[i17][6] = (byte) i19;
                }
                i17 = i18;
            }
            YG1 yg12 = new YG1();
            if (i >= 0) {
                switch (num.intValue()) {
                    case 1:
                        i2 = 0;
                        break;
                    case 2:
                        i2 = 3;
                        break;
                    case 3:
                        i2 = 2;
                        break;
                    default:
                        i2 = 1;
                        break;
                }
                int i20 = (i2 << 3) | i;
                yg12.A01(i20, 5);
                int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(1335);
                int i21 = i20 << (numberOfLeadingZeros - 1);
                while (32 - Integer.numberOfLeadingZeros(i21) >= numberOfLeadingZeros) {
                    i21 ^= 1335 << ((32 - Integer.numberOfLeadingZeros(i21)) - numberOfLeadingZeros);
                }
                yg12.A01(i21, 10);
                YG1 yg13 = new YG1();
                yg13.A01(21522, 15);
                int i22 = yg12.A00;
                if (i22 == yg13.A00) {
                    int i23 = 0;
                    while (true) {
                        int[] iArr3 = yg12.A01;
                        if (i23 < iArr3.length) {
                            iArr3[i23] = iArr3[i23] ^ yg13.A01[i23];
                            i23++;
                        } else {
                            if (i22 == 15) {
                                int i24 = 0;
                                do {
                                    boolean A032 = yg12.A03(14 - i24);
                                    int[] iArr4 = A03[i24];
                                    int i25 = iArr4[0];
                                    byte[] bArr5 = bArr[iArr4[1]];
                                    byte b = A032 ? (byte) 1 : (byte) 0;
                                    bArr5[i25] = b;
                                    if (i24 < 8) {
                                        bArr[8][(i5 - i24) - 1] = b;
                                    } else {
                                        bArr[(i8 - 7) + (i24 - 8)][8] = b;
                                    }
                                    i24++;
                                } while (i24 < i22);
                                if (i10 >= 7) {
                                    YG1 yg14 = new YG1();
                                    yg14.A01(i10, 6);
                                    int numberOfLeadingZeros2 = 32 - Integer.numberOfLeadingZeros(7973);
                                    int i26 = i10 << (numberOfLeadingZeros2 - 1);
                                    while (32 - Integer.numberOfLeadingZeros(i26) >= numberOfLeadingZeros2) {
                                        i26 ^= 7973 << ((32 - Integer.numberOfLeadingZeros(i26)) - numberOfLeadingZeros2);
                                    }
                                    yg14.A01(i26, 12);
                                    int i27 = yg14.A00;
                                    if (i27 == 18) {
                                        int i28 = 17;
                                        int i29 = 0;
                                        do {
                                            int i30 = 0;
                                            do {
                                                boolean A033 = yg14.A03(i28);
                                                i28--;
                                                int i31 = (i8 - 11) + i30;
                                                byte[] bArr6 = bArr[i31];
                                                byte b2 = A033 ? (byte) 1 : (byte) 0;
                                                bArr6[i29] = b2;
                                                bArr[i29][i31] = b2;
                                                i30++;
                                            } while (i30 < 3);
                                            i29++;
                                        } while (i29 < 6);
                                    } else {
                                        throw new Exception(AnonymousClass001.A0O("should not happen but we got: ", i27));
                                    }
                                }
                                int i32 = i5 - 1;
                                int i33 = i8 - 1;
                                int i34 = 0;
                                int i35 = -1;
                                while (i32 > 0) {
                                    if (i32 == 6) {
                                        i32 = 5;
                                    }
                                    while (i33 >= 0 && i33 < i8) {
                                        int i36 = 0;
                                        do {
                                            int i37 = i32 - i36;
                                            if (bArr[i33][i37] == -1) {
                                                if (i34 < yg1.A00) {
                                                    boolean A034 = yg1.A03(i34);
                                                    i34++;
                                                    i3 = A034;
                                                } else {
                                                    i3 = 0;
                                                }
                                                int i38 = i37;
                                                int i39 = i33;
                                                switch (i) {
                                                    case 0:
                                                        i39 += i38;
                                                        i4 = i39 & 1;
                                                        break;
                                                    case 1:
                                                        i4 = i39 & 1;
                                                        break;
                                                    case 2:
                                                        i4 = i37 % 3;
                                                        break;
                                                    case 3:
                                                        i4 = (i33 + i37) % 3;
                                                        break;
                                                    case 4:
                                                        i39 = i33 / 2;
                                                        i38 = i37 / 3;
                                                        i39 += i38;
                                                        i4 = i39 & 1;
                                                        break;
                                                    case 5:
                                                        int i40 = i33 * i37;
                                                        i4 = (i40 & 1) + (i40 % 3);
                                                        break;
                                                    case 6:
                                                        int i41 = i33 * i37;
                                                        i39 = i41 & 1;
                                                        i38 = i41 % 3;
                                                        i39 += i38;
                                                        i4 = i39 & 1;
                                                        break;
                                                    default:
                                                        i39 = (i33 * i37) % 3;
                                                        i38 = (i33 + i37) & 1;
                                                        i39 += i38;
                                                        i4 = i39 & 1;
                                                        break;
                                                }
                                                if (i4 == 0) {
                                                    i3 = ~i3;
                                                }
                                                bArr[i33][i37] = (byte) i3;
                                            }
                                            i36++;
                                        } while (i36 < 2);
                                        i33 += i35;
                                    }
                                    i35 = -i35;
                                    i33 += i35;
                                    i32 -= 2;
                                }
                                int i42 = yg1.A00;
                                if (i34 == i42) {
                                    return;
                                } else {
                                    throw new Exception(AnonymousClass001.A0J("Not all bits consumed: ", '/', i34, i42));
                                }
                            }
                            throw new Exception(AnonymousClass001.A0O("should not happen but we got: ", i22));
                        }
                    }
                } else {
                    throw AbstractC166987dD.A12("Sizes don't match");
                }
            } else {
                throw new Exception("Invalid mask pattern");
            }
        } else {
            throw new Exception();
        }
    }

    public static void A01(C72829XoL c72829XoL, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i + i3;
            byte[] bArr = c72829XoL.A02[i2];
            if (bArr[i4] == -1) {
                bArr[i4] = 0;
                i3++;
            } else {
                throw new Exception();
            }
        } while (i3 < 8);
    }

    public static void A02(C72829XoL c72829XoL, int i, int i2) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = A02[i3];
            int i4 = 0;
            do {
                int i5 = iArr[i4];
                c72829XoL.A02[i2 + i3][i + i4] = (byte) i5;
                i4++;
            } while (i4 < 7);
        }
    }

    public static void A03(C72829XoL c72829XoL, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 + i3;
            byte[][] bArr = c72829XoL.A02;
            if (bArr[i4][i] == -1) {
                bArr[i4][i] = 0;
                i3++;
            } else {
                throw new Exception();
            }
        } while (i3 < 7);
    }
}
