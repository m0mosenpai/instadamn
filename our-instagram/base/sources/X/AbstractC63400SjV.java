package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.SjV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63400SjV {
    public static int A04(C62905SWm c62905SWm, InterfaceC65591TnW interfaceC65591TnW, Object obj, byte[] bArr, int i, int i2, int i3) {
        int A0U = ((C64254T6d) interfaceC65591TnW).A0U(c62905SWm, obj, bArr, i, i2, i3);
        c62905SWm.A02 = obj;
        return A0U;
    }

    public static int A05(C62905SWm c62905SWm, InterfaceC65591TnW interfaceC65591TnW, byte[] bArr, int i, int i2) {
        RO8 FGC = interfaceC65591TnW.FGC();
        int A03 = A03(c62905SWm, interfaceC65591TnW, FGC, bArr, i, i2);
        interfaceC65591TnW.FGM(FGC);
        c62905SWm.A02 = FGC;
        return A03;
    }

    public static int A06(C62905SWm c62905SWm, InterfaceC65591TnW interfaceC65591TnW, byte[] bArr, int i, int i2, int i3) {
        RO8 FGC = interfaceC65591TnW.FGC();
        int A04 = A04(c62905SWm, interfaceC65591TnW, FGC, bArr, i, i2, i3);
        interfaceC65591TnW.FGM(FGC);
        c62905SWm.A02 = FGC;
        return A04;
    }

    public static int A07(C62905SWm c62905SWm, C63372Sid c63372Sid, byte[] bArr, int i, int i2, int i3) {
        Object A01;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 5) {
                                c63372Sid.A08(i, Integer.valueOf(A0C(bArr, i2)));
                                return i2 + 4;
                            }
                        } else {
                            int i6 = (i & (-8)) | 4;
                            C63372Sid A012 = C63372Sid.A01();
                            int i7 = 0;
                            while (i4 < i3) {
                                i4 = A09(c62905SWm, bArr, i4);
                                i7 = c62905SWm.A00;
                                if (i7 == i6) {
                                    break;
                                }
                                i4 = A07(c62905SWm, A012, bArr, i7, i4, i3);
                            }
                            if (i4 <= i3 && i7 == i6) {
                                c63372Sid.A08(i, A012);
                                return i4;
                            }
                            throw C61035Re7.A04();
                        }
                    } else {
                        int A09 = A09(c62905SWm, bArr, i2);
                        int i8 = c62905SWm.A00;
                        if (i8 >= 0) {
                            if (i8 <= bArr.length - A09) {
                                if (i8 == 0) {
                                    A01 = AbstractC64539TIv.A01;
                                } else {
                                    A01 = AbstractC64539TIv.A01(bArr, A09, i8);
                                }
                                c63372Sid.A08(i, A01);
                                return A09 + i8;
                            }
                            throw C61035Re7.A05();
                        }
                        throw C61035Re7.A03();
                    }
                } else {
                    c63372Sid.A08(i, Long.valueOf(A0D(bArr, i2)));
                    return i2 + 8;
                }
            } else {
                int A0A = A0A(c62905SWm, bArr, i2);
                c63372Sid.A08(i, Long.valueOf(c62905SWm.A01));
                return A0A;
            }
        }
        throw C61035Re7.A01();
    }

    public static int A01(C62905SWm c62905SWm, InterfaceC65693TsF interfaceC65693TsF, byte[] bArr, int i) {
        RO9 ro9 = (RO9) interfaceC65693TsF;
        int A09 = A09(c62905SWm, bArr, i);
        int i2 = c62905SWm.A00 + A09;
        while (A09 < i2) {
            A09 = A09(c62905SWm, bArr, A09);
            ro9.FGX(c62905SWm.A00);
        }
        if (A09 == i2) {
            return A09;
        }
        throw C61035Re7.A05();
    }

    public static int A02(C62905SWm c62905SWm, InterfaceC65693TsF interfaceC65693TsF, byte[] bArr, int i, int i2, int i3) {
        int A09;
        RO9 ro9 = (RO9) interfaceC65693TsF;
        do {
            A09 = A09(c62905SWm, bArr, i2);
            ro9.FGX(c62905SWm.A00);
            if (A09 >= i3) {
                break;
            }
            i2 = A09(c62905SWm, bArr, A09);
        } while (i == c62905SWm.A00);
        return A09;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r5 >= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(X.C62905SWm r6, X.InterfaceC65591TnW r7, java.lang.Object r8, byte[] r9, int r10, int r11) {
        /*
            int r4 = r10 + 1
            r3 = r9
            r5 = r9[r10]
            r1 = r6
            if (r5 >= 0) goto L10
            int r4 = A0B(r6, r9, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L1c
        L10:
            int r11 = r11 - r4
            if (r5 > r11) goto L1c
            int r5 = r5 + r4
            r0 = r7
            r2 = r8
            r0.FGa(r1, r2, r3, r4, r5)
            r6.A02 = r8
            return r5
        L1c:
            X.Re7 r0 = X.C61035Re7.A05()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63400SjV.A03(X.SWm, X.TnW, java.lang.Object, byte[], int, int):int");
    }

    public static int A09(C62905SWm c62905SWm, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c62905SWm.A00 = b;
            return i2;
        }
        return A0B(c62905SWm, bArr, b, i2);
    }

    public static int A0A(C62905SWm c62905SWm, byte[] bArr, int i) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c62905SWm.A01 = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            i3++;
        }
        c62905SWm.A01 = j2;
        return i3;
    }

    public static int A0B(C62905SWm c62905SWm, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = bArr[i2];
        int i7 = i2 + 1;
        int i8 = i & StringTreeSet.MAX_SYMBOL_COUNT;
        if (i6 >= 0) {
            i3 = i6 << 7;
        } else {
            int i9 = i8 | ((i6 & StringTreeSet.MAX_SYMBOL_COUNT) << 7);
            int i10 = i7 + 1;
            int i11 = bArr[i7];
            if (i11 >= 0) {
                i4 = i11 << 14;
            } else {
                i8 = i9 | ((i11 & StringTreeSet.MAX_SYMBOL_COUNT) << 14);
                i7 = i10 + 1;
                int i12 = bArr[i10];
                i3 = i12 << 21;
                if (i12 < 0) {
                    i9 = i8 | ((i12 & StringTreeSet.MAX_SYMBOL_COUNT) << 21);
                    i10 = i7 + 1;
                    int i13 = bArr[i7];
                    i4 = i13 << 28;
                    if (i13 < 0) {
                        i5 = i9 | ((i13 & StringTreeSet.MAX_SYMBOL_COUNT) << 28);
                        while (true) {
                            i7 = i10 + 1;
                            if (bArr[i10] >= 0) {
                                break;
                            }
                            i10 = i7;
                        }
                        c62905SWm.A00 = i5;
                        return i7;
                    }
                }
            }
            c62905SWm.A00 = i9 | i4;
            return i10;
        }
        i5 = i8 | i3;
        c62905SWm.A00 = i5;
        return i7;
    }

    public static int A0C(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int A00(C62905SWm c62905SWm, InterfaceC65693TsF interfaceC65693TsF, InterfaceC65591TnW interfaceC65591TnW, byte[] bArr, int i, int i2, int i3) {
        int A05;
        do {
            A05 = A05(c62905SWm, interfaceC65591TnW, bArr, i2, i3);
            interfaceC65693TsF.add(c62905SWm.A02);
            if (A05 >= i3) {
                break;
            }
            i2 = A09(c62905SWm, bArr, A05);
        } while (i == c62905SWm.A00);
        return A05;
    }

    public static int A08(C62905SWm c62905SWm, byte[] bArr, int i) {
        int A09 = A09(c62905SWm, bArr, i);
        int i2 = c62905SWm.A00;
        if (i2 >= 0) {
            if (i2 <= bArr.length - A09) {
                if (i2 == 0) {
                    c62905SWm.A02 = AbstractC64539TIv.A01;
                    return A09;
                }
                c62905SWm.A02 = AbstractC64539TIv.A01(bArr, A09, i2);
                return A09 + i2;
            }
            throw C61035Re7.A05();
        }
        throw C61035Re7.A03();
    }

    public static long A0D(byte[] bArr, int i) {
        return AbstractC58324PtG.A02(bArr, i);
    }
}
