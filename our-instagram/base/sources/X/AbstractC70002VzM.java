package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* renamed from: X.VzM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70002VzM {
    public static final int[] A00 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.X6u] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, X.X6u] */
    public static InterfaceC71837X6u A00(XGj xGj, boolean z, boolean z2) {
        boolean z3;
        int[] iArr;
        long length = xGj.getLength();
        long j = OdexSchemeArtXdex.STATE_PGO_NEEDED;
        long j2 = -1;
        if (length != -1 && length <= OdexSchemeArtXdex.STATE_PGO_NEEDED) {
            j = length;
        }
        int i = (int) j;
        WFa wFa = new WFa(64);
        int i2 = 0;
        int i3 = 0;
        boolean z4 = false;
        while (i3 < i) {
            wFa.A0M(8);
            if (!xGj.E3t(wFa.A02, i2, 8, true)) {
                break;
            }
            long A0C = wFa.A0C();
            int A01 = wFa.A01();
            int i4 = 16;
            if (A0C == 1) {
                xGj.E3s(wFa.A02, 8, 8);
                wFa.A0N(16);
                A0C = wFa.A0B();
            } else {
                if (A0C == 0 && length != j2) {
                    A0C = (length - xGj.Bc8()) + 8;
                }
                i4 = 8;
            }
            long j3 = i4;
            if (A0C < j3) {
                return new Object();
            }
            i3 += i4;
            if (A01 == 1836019574) {
                i += (int) A0C;
                if (length != j2 && i > length) {
                    i = (int) length;
                }
            } else if (A01 != 1836019558 && A01 != 1836475768) {
                if (A01 == 1835295092) {
                    z4 = true;
                }
                if ((i3 + A0C) - j3 >= i) {
                    break;
                }
                int i5 = (int) (A0C - j3);
                i3 += i5;
                if (A01 == 1718909296) {
                    if (i5 < 8) {
                        return new Object();
                    }
                    wFa.A0M(i5);
                    xGj.E3s(wFa.A02, i2, i5);
                    int A012 = wFa.A01();
                    if ((A012 >>> 8) != 3368816 && (A012 != 1751476579 || !z2)) {
                        int[] iArr2 = A00;
                        int i6 = 0;
                        while (iArr2[i6] != A012) {
                            i6++;
                            if (i6 >= 29) {
                                break;
                            }
                        }
                    }
                    z4 = true;
                    wFa.A0P(4);
                    int i7 = (wFa.A00 - wFa.A01) / 4;
                    if (!z4) {
                        if (i7 > 0) {
                            iArr = new int[i7];
                            do {
                                int A013 = wFa.A01();
                                iArr[i2] = A013;
                                if ((A013 >>> 8) != 3368816 && (A013 != 1751476579 || !z2)) {
                                    int[] iArr3 = A00;
                                    int i8 = 0;
                                    while (iArr3[i8] != A013) {
                                        i8++;
                                        if (i8 >= 29) {
                                            i2++;
                                        }
                                    }
                                }
                            } while (i2 < i7);
                        } else {
                            iArr = null;
                        }
                        return new WS1(iArr);
                    }
                    z4 = true;
                } else if (i5 != 0) {
                    xGj.AB0(i5);
                }
                j2 = -1;
                i2 = 0;
            } else {
                z3 = true;
                break;
            }
        }
        z3 = false;
        if (!z4) {
            return WS2.A00;
        }
        if (z != z3) {
            if (z3) {
                return WS3.A00;
            }
            return WS3.A01;
        }
        return null;
    }
}
