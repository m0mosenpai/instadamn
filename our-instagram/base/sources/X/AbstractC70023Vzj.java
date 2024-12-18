package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* renamed from: X.Vzj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70023Vzj {
    public static final int[] A00 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean A00(InterfaceC98284b7 interfaceC98284b7, boolean z) {
        boolean z2;
        C98274b6 c98274b6 = (C98274b6) interfaceC98284b7;
        long j = c98274b6.A04;
        long j2 = OdexSchemeArtXdex.STATE_PGO_NEEDED;
        if (j != -1 && j <= OdexSchemeArtXdex.STATE_PGO_NEEDED) {
            j2 = j;
        }
        int i = (int) j2;
        C97974ac c97974ac = new C97974ac(64);
        int i2 = 0;
        boolean z3 = false;
        while (i2 < i) {
            c97974ac.A0E(8);
            byte[] bArr = c97974ac.A02;
            if (!c98274b6.A02(8, true)) {
                break;
            }
            System.arraycopy(c98274b6.A03, c98274b6.A01 - 8, bArr, 0, 8);
            long A07 = c97974ac.A07();
            int A01 = c97974ac.A01();
            int i3 = 16;
            if (A07 == 1) {
                interfaceC98284b7.E3s(c97974ac.A02, 8, 8);
                c97974ac.A0F(16);
                A07 = c97974ac.A06();
            } else {
                if (A07 == 0 && j != -1) {
                    A07 = 8 + (j - (c98274b6.A02 + c98274b6.A01));
                }
                i3 = 8;
            }
            long j3 = i3;
            if (A07 < j3) {
                return false;
            }
            i2 += i3;
            if (A01 == 1836019574) {
                i += (int) A07;
                if (j != -1 && i > j) {
                    i = (int) j;
                }
            } else if (A01 != 1836019558 && A01 != 1836475768) {
                if ((i2 + A07) - j3 >= i) {
                    break;
                }
                int i4 = (int) (A07 - j3);
                i2 += i4;
                if (A01 == 1718909296) {
                    if (i4 < 8) {
                        return false;
                    }
                    c97974ac.A0E(i4);
                    interfaceC98284b7.E3s(c97974ac.A02, 0, i4);
                    int i5 = i4 / 4;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (i6 == 1) {
                            c97974ac.A0H(4);
                        } else {
                            int A012 = c97974ac.A01();
                            if ((A012 >>> 8) != 3368816) {
                                int[] iArr = A00;
                                int i7 = 0;
                                while (iArr[i7] != A012) {
                                    i7++;
                                    if (i7 < 29) {
                                    }
                                }
                            }
                            z3 = true;
                            break;
                        }
                    }
                    if (!z3) {
                        return false;
                    }
                } else if (i4 != 0) {
                    c98274b6.A02(i4, false);
                }
            } else {
                z2 = true;
                break;
            }
        }
        z2 = false;
        if (!z3 || z != z2) {
            return false;
        }
        return true;
    }
}
