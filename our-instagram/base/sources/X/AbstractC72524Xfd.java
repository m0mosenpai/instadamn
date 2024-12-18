package X;

import android.graphics.PointF;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.Xfd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72524Xfd {
    public static final C72866XpX A00(int[] iArr, int i, int i2, int i3, int i4) {
        float[][] fArr;
        int i5;
        int[][] iArr2 = new int[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            iArr2[i6] = new int[i3];
        }
        for (int i7 = 0; i7 < i4; i7++) {
            for (int i8 = 0; i8 < i3; i8++) {
                iArr2[i7][i8] = Math.max(Math.min(iArr[(i7 * i3) + i8], 255), 0);
            }
        }
        ArrayList A17 = AbstractC25225BEi.A17(i4);
        for (int i9 = 0; i9 < i4; i9++) {
            int length = iArr2[i9].length;
            ArrayList A172 = AbstractC25225BEi.A17(length);
            for (int i10 = 0; i10 < length; i10++) {
                MSX.A1Q(A172, r4[i10]);
            }
            A17.add(AbstractC001800i.A0w(A172));
        }
        float[][] fArr2 = (float[][]) A17.toArray(new float[0]);
        if (i3 == 100 && i4 == 100) {
            fArr = fArr2;
        } else {
            C14360o3.A0B(fArr2, 0);
            int length2 = fArr2[0].length;
            int length3 = fArr2.length;
            double d = length2 / 100.0d;
            double d2 = length3 / 100.0d;
            fArr = new float[100];
            int i11 = 0;
            do {
                fArr[i11] = new float[100];
                i11++;
            } while (i11 < 100);
            int i12 = 0;
            do {
                int i13 = 0;
                do {
                    double d3 = i13 * d;
                    double d4 = i12 * d2;
                    int i14 = (int) d3;
                    int i15 = (int) d4;
                    double[] A00 = Y3b.A00(d3 - i14);
                    double[] A002 = Y3b.A00(d4 - i15);
                    double d5 = 0.0d;
                    int i16 = 0;
                    do {
                        int i17 = 0;
                        do {
                            int i18 = (i14 - 1) + i16;
                            int i19 = length2 - 1;
                            if (i18 < 0) {
                                i18 = 0;
                            } else if (i18 > i19) {
                                i18 = i19;
                            }
                            int i20 = (i15 - 1) + i17;
                            int i21 = length3 - 1;
                            if (i20 < 0) {
                                i20 = 0;
                            } else if (i20 > i21) {
                                i20 = i21;
                            }
                            d5 += fArr2[i20][i18] * A00[i16] * A002[i17];
                            i17++;
                        } while (i17 < 4);
                        i16++;
                    } while (i16 < 4);
                    float[] fArr3 = fArr[i12];
                    float f = (float) d5;
                    if (f < 0.0f) {
                        f = 0.0f;
                    } else if (f > 255.0f) {
                        f = 255.0f;
                    }
                    fArr3[i13] = f;
                    i13++;
                } while (i13 < 100);
                i12++;
            } while (i12 < 100);
        }
        ArrayList A173 = AbstractC25225BEi.A17(fArr.length);
        for (float[] fArr4 : fArr) {
            ArrayList A174 = AbstractC25225BEi.A17(fArr4.length);
            for (float f2 : fArr4) {
                AbstractC166997dE.A1W(A174, (int) f2);
            }
            A173.add(AbstractC001800i.A0x(A174));
        }
        int[][] iArr3 = (int[][]) A173.toArray(new int[0]);
        int length4 = iArr3[0].length;
        int length5 = iArr3[1].length;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (int i22 = 0; i22 < i4; i22++) {
            for (int i23 = 0; i23 < i3; i23++) {
                MSX.A1Q(A1E, fArr2[i22][i23]);
            }
        }
        int length6 = iArr3.length;
        int i24 = length4 * length6;
        int[] iArr4 = new int[i24];
        for (int i25 = 0; i25 < length6; i25++) {
            for (int i26 = 0; i26 < length4; i26++) {
                iArr4[(i25 * length4) + i26] = iArr3[i25][i26];
            }
        }
        int i27 = Integer.MAX_VALUE;
        int i28 = Integer.MIN_VALUE;
        for (int i29 = 0; i29 < i24; i29++) {
            int i30 = iArr4[i29];
            i27 = Math.min(i27, i30);
            i28 = Math.max(i28, i30);
        }
        C09530e4 A1L = AbstractC166987dD.A1L(Integer.valueOf(i27), Integer.valueOf(i28));
        int A0H = AbstractC166987dD.A0H(A1L.A00);
        int A0H2 = AbstractC166987dD.A0H(A1L.A01);
        int[] iArr5 = new int[256];
        for (int i31 = 0; i31 < i24; i31++) {
            AbstractC72048XLo.A1Z(iArr5, iArr4[i31]);
        }
        int i32 = 0;
        int i33 = 0;
        do {
            i33 += iArr5[i32] * i32;
            i32++;
        } while (i32 < 256);
        double d6 = i24;
        double d7 = i33 / d6;
        int max = Math.max(A0H - 1, 0);
        double d8 = Double.NEGATIVE_INFINITY;
        double d9 = 0.0d;
        double d10 = 0.0d;
        while (max <= A0H2) {
            double d11 = d7 - d10;
            double d12 = d9 * d6 * d11 * d11;
            if (d12 > d8) {
                A0H = max;
                d8 = d12;
            }
            while (max <= A0H2 && iArr5[max] == 0) {
                max++;
            }
            int i34 = iArr5[max];
            double d13 = i34 * max;
            double d14 = (d10 * d9) + d13;
            double d15 = i34;
            d9 = d15 + d9;
            d10 = d14 / d9;
            double d16 = (d7 * d6) - d13;
            d6 -= d15;
            d7 = d16 / d6;
            max++;
        }
        C09530e4 A003 = Y0o.A00.A00(iArr3, A0H);
        int i35 = 0;
        for (int[] iArr6 : iArr3) {
            C14360o3.A0B(iArr6, 0);
            int i36 = 0;
            for (int i37 : iArr6) {
                i36 += i37;
            }
            i35 += i36;
        }
        if (i35 == 0) {
            return null;
        }
        int[][] iArr7 = (int[][]) A003.A01;
        int A0H3 = AbstractC166987dD.A0H(A003.A00);
        float f3 = i / length4;
        float f4 = i2 / length5;
        C14360o3.A0B(iArr7, 1);
        int length7 = iArr3[0].length;
        int i38 = A0H3 + 1;
        for (int i39 = 0; i39 < i38; i39++) {
        }
        int[] iArr8 = new int[i38];
        for (int i40 = 0; i40 < i38; i40++) {
            iArr8[i40] = 0;
        }
        int[] iArr9 = new int[i38];
        for (int i41 = 0; i41 < i38; i41++) {
            iArr9[i41] = 1;
        }
        int[] iArr10 = new int[i38];
        for (int i42 = 0; i42 < i38; i42++) {
            iArr10[i42] = 0;
        }
        for (int i43 = 0; i43 < length6; i43++) {
            for (int i44 = 0; i44 < length7; i44++) {
                int i45 = iArr7[i43][i44];
                if (i45 != 0) {
                    int i46 = iArr3[i43][i44];
                    int i47 = iArr8[i45];
                    if (i46 > i47) {
                        iArr8[i45] = i46;
                        iArr9[i45] = 1;
                    } else if (i46 == i47) {
                        AbstractC72048XLo.A1Z(iArr9, i45);
                    }
                    AbstractC72048XLo.A1Z(iArr10, i45);
                }
            }
        }
        if (1 <= A0H3) {
            int i48 = 1;
            int i49 = 0;
            i5 = 1;
            while (true) {
                int i50 = iArr8[i48];
                if (i50 > i49 || (i50 == i49 && iArr9[i48] > iArr9[i5])) {
                    i5 = i48;
                    i49 = i50;
                }
                if (i48 == A0H3) {
                    break;
                }
                i48++;
            }
        } else {
            i5 = 1;
        }
        int i51 = length6;
        int i52 = length7;
        int i53 = 0;
        int i54 = 0;
        for (int i55 = 0; i55 < length6; i55++) {
            for (int i56 = 0; i56 < length7; i56++) {
                if (iArr7[i55][i56] == i5) {
                    i52 = Math.min(i52, i56);
                    i51 = Math.min(i51, i55);
                    i53 = Math.max(i53, i56);
                    i54 = Math.max(i54, i55);
                }
            }
        }
        if (i52 == i53) {
            i53 = i52 + 1;
        }
        if (i51 == i54) {
            i54 = i51 + 1;
        }
        float f5 = (iArr10[i5] / length7) / length6;
        int i57 = i53 - i52;
        int i58 = i57 + 1;
        int i59 = i54 - i51;
        int i60 = i59 + 1;
        ArrayList A1E2 = AbstractC166987dD.A1E();
        int i61 = 1;
        while (true) {
            boolean z = false;
            if (i58 > i60) {
                z = true;
            }
            int i62 = i52;
            int i63 = i51;
            int[] iArr11 = new int[i61];
            for (int i64 = 0; i64 < i61; i64++) {
                iArr11[i64] = 0;
            }
            int[] iArr12 = new int[i61];
            for (int i65 = 0; i65 < i61; i65++) {
                iArr12[i65] = 0;
            }
            int[] iArr13 = new int[i61];
            for (int i66 = 0; i66 < i61; i66++) {
                iArr13[i66] = 0;
            }
            int i67 = i61 + 1;
            int[] iArr14 = new int[i67];
            for (int i68 = 0; i68 < i67; i68++) {
                iArr14[i68] = 0;
            }
            int i69 = i51;
            if (z) {
                i69 = i52;
            }
            iArr14[0] = i69;
            int i70 = i67 - 1;
            int i71 = i54 + 1;
            if (z) {
                i71 = i53 + 1;
            }
            iArr14[i70] = i71;
            for (int i72 = 1; i72 < i70; i72++) {
                int i73 = i59;
                if (z) {
                    i73 = i57;
                }
                int i74 = ((int) ((i73 / i61) * i72)) + i51;
                int i75 = i54;
                if (z) {
                    i75 = i53;
                }
                iArr14[i72] = Math.min(i74, i75);
            }
            if (i51 <= i54) {
                int i76 = i51;
                while (true) {
                    if (i52 <= i53) {
                        int i77 = i52;
                        while (true) {
                            if (iArr7[i76][i77] == i5) {
                                for (int i78 = 0; i78 < i70; i78++) {
                                    int i79 = iArr14[i78];
                                    if (!z ? !(i76 < i79 || i76 >= iArr14[i78 + 1]) : !(i77 < i79 || i77 >= iArr14[i78 + 1])) {
                                        iArr11[i78] = iArr11[i78] + i77;
                                        iArr12[i78] = iArr12[i78] + i76;
                                        AbstractC72048XLo.A1Z(iArr13, i78);
                                    }
                                }
                            }
                            if (i77 == i53) {
                                break;
                            }
                            i77++;
                        }
                    }
                    if (i76 == i54) {
                        break;
                    }
                    i76++;
                }
            }
            ArrayList A1E3 = AbstractC166987dD.A1E();
            int i80 = 0;
            while (i80 < i61) {
                float f6 = iArr11[i80];
                float f7 = iArr13[i80];
                float f8 = f6 / f7;
                float f9 = iArr12[i80] / f7;
                float f10 = Float.MAX_VALUE;
                int i81 = i52;
                int i82 = i51;
                if (i51 <= i54) {
                    while (true) {
                        if (i52 <= i53) {
                            while (true) {
                                if (iArr7[i63][i62] == i5) {
                                    float A01 = AbstractC166987dD.A01(f8, i62) + AbstractC166987dD.A01(f9, i63);
                                    if (A01 < f10) {
                                        i81 = i62;
                                        i82 = i63;
                                        f10 = A01;
                                    }
                                }
                                if (i62 == i53) {
                                    break;
                                }
                                i62++;
                            }
                        }
                        if (i63 != i54) {
                            i63++;
                            i62 = i52;
                        }
                    }
                }
                A1E3.add(new PointF(i81 * f3, i82 * f4));
                i80++;
                i62 = i52;
                i63 = i51;
            }
            while (true) {
                A1E2.add(A1E3);
                i61++;
                if (i61 < 6) {
                    if (i61 >= 4) {
                        if (i61 == 4) {
                            int i83 = i52;
                            int[] iArr15 = new int[4];
                            int i84 = 0;
                            do {
                                iArr15[i84] = 0;
                                i84++;
                            } while (i84 < 4);
                            int[] iArr16 = new int[4];
                            int i85 = 0;
                            do {
                                iArr16[i85] = 0;
                                i85++;
                            } while (i85 < 4);
                            int[] iArr17 = new int[4];
                            int i86 = 0;
                            do {
                                iArr17[i86] = 0;
                                i86++;
                            } while (i86 < 4);
                            Integer[] numArr = {Integer.valueOf(i52), Integer.valueOf((i57 / 2) + i52), Integer.valueOf(i53)};
                            Integer[] numArr2 = {Integer.valueOf(i51), Integer.valueOf((i59 / 2) + i51), Integer.valueOf(i54)};
                            if (i51 <= i54) {
                                int i87 = i51;
                                while (true) {
                                    if (i52 <= i53) {
                                        int i88 = i52;
                                        while (true) {
                                            if (iArr7[i87][i88] == i5) {
                                                int i89 = 0;
                                                do {
                                                    int i90 = 0;
                                                    do {
                                                        int i91 = i89 + (i90 * 2);
                                                        if (i88 >= numArr[i89].intValue() && i88 < numArr[i89 + 1].intValue() && i87 >= numArr2[i90].intValue() && i87 < numArr2[i90 + 1].intValue()) {
                                                            iArr15[i91] = iArr15[i91] + i88;
                                                            iArr16[i91] = iArr16[i91] + i87;
                                                            AbstractC72048XLo.A1Z(iArr17, i91);
                                                        }
                                                        i90++;
                                                    } while (i90 < 2);
                                                    i89++;
                                                } while (i89 < 2);
                                            }
                                            if (i88 == i53) {
                                                break;
                                            }
                                            i88++;
                                        }
                                    }
                                    if (i87 == i54) {
                                        break;
                                    }
                                    i87++;
                                }
                            }
                            A1E3 = AbstractC166987dD.A1E();
                            int i92 = 0;
                            do {
                                float f11 = iArr15[i92];
                                float f12 = iArr17[i92];
                                float f13 = f11 / f12;
                                float f14 = iArr16[i92] / f12;
                                float f15 = Float.MAX_VALUE;
                                int i93 = i52;
                                int i94 = i51;
                                if (i51 <= i54) {
                                    int i95 = i51;
                                    while (true) {
                                        if (i52 <= i53) {
                                            while (true) {
                                                if (iArr7[i95][i83] == i5) {
                                                    float A012 = AbstractC166987dD.A01(f13, i83) + AbstractC166987dD.A01(f14, i95);
                                                    if (A012 < f15) {
                                                        i93 = i83;
                                                        f15 = A012;
                                                        i94 = i95;
                                                    }
                                                }
                                                if (i83 == i53) {
                                                    break;
                                                }
                                                i83++;
                                            }
                                        }
                                        if (i95 == i54) {
                                            break;
                                        }
                                        i95++;
                                        i83 = i52;
                                    }
                                }
                                A1E3.add(new PointF(i93 * f3, i94 * f4));
                                i92++;
                                i83 = i52;
                            } while (i92 < 4);
                        } else {
                            A1E3 = AbstractC001800i.A0S((Iterable) A1E2.get(3), (Collection) A1E2.get(0));
                        }
                    }
                } else {
                    return new C72866XpX(new Rect((int) (i52 * f3), (int) (i51 * f4), (int) (i53 * f3), (int) (i54 * f4)), A1E2, f5);
                }
            }
        }
    }
}
