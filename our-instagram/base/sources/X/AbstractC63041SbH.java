package X;

import android.graphics.Path;

/* renamed from: X.SbH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63041SbH {
    public static void A01(Path path, C63135Sdg[] c63135SdgArr) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float[] fArr = new float[6];
        char c = 'm';
        for (C63135Sdg c63135Sdg : c63135SdgArr) {
            char c2 = c63135Sdg.A00;
            float[] fArr2 = c63135Sdg.A01;
            float f7 = fArr[0];
            float f8 = fArr[1];
            float f9 = fArr[2];
            float f10 = fArr[3];
            float f11 = fArr[4];
            float f12 = fArr[5];
            switch (c2) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    f7 = f11;
                    path.moveTo(f7, f12);
                    f9 = f7;
                    f8 = f12;
                    f10 = f12;
                    break;
            }
            i = 2;
            int i2 = 0;
            while (i2 < fArr2.length) {
                if (c2 != 'A') {
                    if (c2 != 'C') {
                        if (c2 != 'H') {
                            if (c2 != 'Q') {
                                if (c2 != 'V') {
                                    if (c2 != 'a') {
                                        if (c2 != 'c') {
                                            if (c2 != 'h') {
                                                if (c2 != 'q') {
                                                    if (c2 != 'v') {
                                                        if (c2 != 'L') {
                                                            if (c2 != 'M') {
                                                                if (c2 != 'S') {
                                                                    if (c2 != 'T') {
                                                                        if (c2 != 'l') {
                                                                            if (c2 != 'm') {
                                                                                if (c2 != 's') {
                                                                                    if (c2 == 't') {
                                                                                        if (c != 'q' && c != 't' && c != 'Q' && c != 'T') {
                                                                                            f6 = 0.0f;
                                                                                            f5 = 0.0f;
                                                                                        } else {
                                                                                            f5 = f7 - f9;
                                                                                            f6 = f8 - f10;
                                                                                        }
                                                                                        int i3 = i2 + 1;
                                                                                        path.rQuadTo(f5, f6, fArr2[i2], fArr2[i3]);
                                                                                        f9 = f5 + f7;
                                                                                        f10 = f6 + f8;
                                                                                        f7 += fArr2[i2];
                                                                                        f8 += fArr2[i3];
                                                                                    }
                                                                                } else {
                                                                                    if (c != 'c' && c != 's' && c != 'C' && c != 'S') {
                                                                                        f3 = 0.0f;
                                                                                        f4 = 0.0f;
                                                                                    } else {
                                                                                        f3 = f7 - f9;
                                                                                        f4 = f8 - f10;
                                                                                    }
                                                                                    int i4 = i2 + 1;
                                                                                    int i5 = i2 + 2;
                                                                                    int i6 = i2 + 3;
                                                                                    path.rCubicTo(f3, f4, fArr2[i2], fArr2[i4], fArr2[i5], fArr2[i6]);
                                                                                    f9 = fArr2[i2] + f7;
                                                                                    f10 = fArr2[i4] + f8;
                                                                                    f7 += fArr2[i5];
                                                                                    f = fArr2[i6];
                                                                                }
                                                                            } else {
                                                                                float f13 = fArr2[i2];
                                                                                f7 += f13;
                                                                                float f14 = fArr2[i2 + 1];
                                                                                f8 += f14;
                                                                                if (i2 > 0) {
                                                                                    path.rLineTo(f13, f14);
                                                                                } else {
                                                                                    path.rMoveTo(f13, f14);
                                                                                    f12 = f8;
                                                                                    f11 = f7;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            int i7 = i2 + 1;
                                                                            path.rLineTo(fArr2[i2], fArr2[i7]);
                                                                            f7 += fArr2[i2];
                                                                            f2 = fArr2[i7];
                                                                        }
                                                                    } else {
                                                                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                                                            f7 = (f7 * 2.0f) - f9;
                                                                            f8 = (f8 * 2.0f) - f10;
                                                                        }
                                                                        int i8 = i2 + 1;
                                                                        path.quadTo(f7, f8, fArr2[i2], fArr2[i8]);
                                                                        float f15 = fArr2[i2];
                                                                        float f16 = fArr2[i8];
                                                                        f10 = f8;
                                                                        f9 = f7;
                                                                        f7 = f15;
                                                                        f8 = f16;
                                                                    }
                                                                } else {
                                                                    if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                                                        f7 = (f7 * 2.0f) - f9;
                                                                        f8 = (f8 * 2.0f) - f10;
                                                                    }
                                                                    int i9 = i2 + 1;
                                                                    int i10 = i2 + 2;
                                                                    int i11 = i2 + 3;
                                                                    path.cubicTo(f7, f8, fArr2[i2], fArr2[i9], fArr2[i10], fArr2[i11]);
                                                                    f9 = fArr2[i2];
                                                                    f10 = fArr2[i9];
                                                                    f7 = fArr2[i10];
                                                                    f8 = fArr2[i11];
                                                                }
                                                            } else {
                                                                f7 = fArr2[i2];
                                                                f8 = fArr2[i2 + 1];
                                                                if (i2 > 0) {
                                                                    path.lineTo(f7, f8);
                                                                } else {
                                                                    path.moveTo(f7, f8);
                                                                    f12 = f8;
                                                                    f11 = f7;
                                                                }
                                                            }
                                                        } else {
                                                            int i12 = i2 + 1;
                                                            path.lineTo(fArr2[i2], fArr2[i12]);
                                                            f7 = fArr2[i2];
                                                            f8 = fArr2[i12];
                                                        }
                                                    } else {
                                                        path.rLineTo(0.0f, fArr2[i2]);
                                                        f2 = fArr2[i2];
                                                    }
                                                    f8 += f2;
                                                } else {
                                                    int i13 = i2 + 1;
                                                    int i14 = i2 + 2;
                                                    int i15 = i2 + 3;
                                                    path.rQuadTo(fArr2[i2], fArr2[i13], fArr2[i14], fArr2[i15]);
                                                    f9 = fArr2[i2] + f7;
                                                    f10 = fArr2[i13] + f8;
                                                    f7 += fArr2[i14];
                                                    f = fArr2[i15];
                                                }
                                            } else {
                                                path.rLineTo(fArr2[i2], 0.0f);
                                                f7 += fArr2[i2];
                                            }
                                        } else {
                                            int i16 = i2 + 2;
                                            int i17 = i2 + 3;
                                            int i18 = i2 + 4;
                                            int i19 = i2 + 5;
                                            path.rCubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                                            f9 = fArr2[i16] + f7;
                                            f10 = fArr2[i17] + f8;
                                            f7 += fArr2[i18];
                                            f = fArr2[i19];
                                        }
                                        f8 += f;
                                    } else {
                                        int i20 = i2 + 5;
                                        int i21 = i2 + 6;
                                        C63135Sdg.A00(path, f7, f8, fArr2[i20] + f7, fArr2[i21] + f8, fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], AbstractC167007dF.A1M((fArr2[i2 + 3] > 0.0f ? 1 : (fArr2[i2 + 3] == 0.0f ? 0 : -1))), AbstractC167007dF.A1M((fArr2[i2 + 4] > 0.0f ? 1 : (fArr2[i2 + 4] == 0.0f ? 0 : -1))));
                                        f7 += fArr2[i20];
                                        f8 += fArr2[i21];
                                    }
                                } else {
                                    path.lineTo(f7, fArr2[i2]);
                                    f8 = fArr2[i2];
                                }
                            } else {
                                int i22 = i2 + 1;
                                int i23 = i2 + 2;
                                int i24 = i2 + 3;
                                path.quadTo(fArr2[i2], fArr2[i22], fArr2[i23], fArr2[i24]);
                                f9 = fArr2[i2];
                                f10 = fArr2[i22];
                                f7 = fArr2[i23];
                                f8 = fArr2[i24];
                            }
                        } else {
                            path.lineTo(fArr2[i2], f8);
                            f7 = fArr2[i2];
                        }
                    } else {
                        int i25 = i2 + 2;
                        int i26 = i2 + 3;
                        int i27 = i2 + 4;
                        int i28 = i2 + 5;
                        path.cubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                        f7 = fArr2[i27];
                        f8 = fArr2[i28];
                        f9 = fArr2[i25];
                        f10 = fArr2[i26];
                    }
                    i2 += i;
                    c = c2;
                } else {
                    int i29 = i2 + 5;
                    int i30 = i2 + 6;
                    C63135Sdg.A00(path, f7, f8, fArr2[i29], fArr2[i30], fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], AbstractC167007dF.A1M((fArr2[i2 + 3] > 0.0f ? 1 : (fArr2[i2 + 3] == 0.0f ? 0 : -1))), AbstractC167007dF.A1M((fArr2[i2 + 4] > 0.0f ? 1 : (fArr2[i2 + 4] == 0.0f ? 0 : -1))));
                    f7 = fArr2[i29];
                    f8 = fArr2[i30];
                }
                f10 = f8;
                f9 = f7;
                i2 += i;
                c = c2;
            }
            fArr[0] = f7;
            fArr[1] = f8;
            fArr[2] = f9;
            fArr[3] = f10;
            fArr[4] = f11;
            fArr[5] = f12;
            c = c63135Sdg.A00;
        }
    }

    public static Path A00(String str) {
        Path A0T = AbstractC166987dD.A0T();
        try {
            A01(A0T, A02(str));
            return A0T;
        } catch (RuntimeException e) {
            throw AbstractC58318PtA.A0e(AnonymousClass001.A0R("Error in parsing ", str), e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0091. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C63135Sdg[] A02(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63041SbH.A02(java.lang.String):X.Sdg[]");
    }
}
