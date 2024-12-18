package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.Siw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63382Siw {
    public static int A01(C62904SWl c62904SWl, InterfaceC65579TnE interfaceC65579TnE, Object obj, byte[] bArr, int i, int i2, int i3) {
        int A09 = ((C64250T5z) interfaceC65579TnE).A09(c62904SWl, obj, bArr, i, i2, i3);
        c62904SWl.A02 = obj;
        return A09;
    }

    public static int A02(C62904SWl c62904SWl, InterfaceC65579TnE interfaceC65579TnE, byte[] bArr, int i, int i2, int i3) {
        RLJ FG5 = interfaceC65579TnE.FG5();
        int A01 = A01(c62904SWl, interfaceC65579TnE, FG5, bArr, i, i2, i3);
        interfaceC65579TnE.FGG(FG5);
        c62904SWl.A02 = FG5;
        return A01;
    }

    public static int A03(C62904SWl c62904SWl, C63300Sh4 c63300Sh4, byte[] bArr, int i, int i2, int i3) {
        Object rln;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 5) {
                                c63300Sh4.A02(i, Integer.valueOf(A08(bArr, i2)));
                                return i2 + 4;
                            }
                        } else {
                            int i6 = (i & (-8)) | 4;
                            C63300Sh4 A00 = C63300Sh4.A00();
                            int i7 = 0;
                            while (i4 < i3) {
                                i4 = A05(c62904SWl, bArr, i4);
                                i7 = c62904SWl.A00;
                                if (i7 == i6) {
                                    break;
                                }
                                i4 = A03(c62904SWl, A00, bArr, i7, i4, i3);
                            }
                            if (i4 <= i3 && i7 == i6) {
                                c63300Sh4.A02(i, A00);
                                return i4;
                            }
                            throw C61029Rdx.A00("Failed to parse the message.");
                        }
                    } else {
                        int A05 = A05(c62904SWl, bArr, i2);
                        int i8 = c62904SWl.A00;
                        if (i8 >= 0) {
                            int length = bArr.length;
                            if (i8 <= length - A05) {
                                if (i8 == 0) {
                                    rln = AbstractC64536TIs.A01;
                                } else {
                                    AbstractC64536TIs.A00(A05, A05 + i8, length);
                                    rln = new RLN(AbstractC58319PtB.A1X(bArr, i8, A05));
                                }
                                c63300Sh4.A02(i, rln);
                                return A05 + i8;
                            }
                            throw C61029Rdx.A00("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        throw C61029Rdx.A00("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                } else {
                    c63300Sh4.A02(i, Long.valueOf(AbstractC58324PtG.A02(bArr, i2)));
                    return i2 + 8;
                }
            } else {
                int A06 = A06(c62904SWl, bArr, i2);
                c63300Sh4.A02(i, Long.valueOf(c62904SWl.A01));
                return A06;
            }
        }
        throw C61029Rdx.A00("Protocol message contained an invalid tag (zero).");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r5 >= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(X.C62904SWl r6, X.InterfaceC65579TnE r7, java.lang.Object r8, byte[] r9, int r10, int r11) {
        /*
            int r4 = r10 + 1
            r3 = r9
            r5 = r9[r10]
            r1 = r6
            if (r5 >= 0) goto L10
            int r4 = A07(r6, r9, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L1c
        L10:
            int r11 = r11 - r4
            if (r5 > r11) goto L1c
            int r5 = r5 + r4
            r0 = r7
            r2 = r8
            r0.FGT(r1, r2, r3, r4, r5)
            r6.A02 = r8
            return r5
        L1c:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.Rdx r0 = X.C61029Rdx.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63382Siw.A00(X.SWl, X.TnE, java.lang.Object, byte[], int, int):int");
    }

    public static int A05(C62904SWl c62904SWl, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c62904SWl.A00 = b;
            return i2;
        }
        return A07(c62904SWl, bArr, b, i2);
    }

    public static int A06(C62904SWl c62904SWl, byte[] bArr, int i) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c62904SWl.A01 = j;
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
        c62904SWl.A01 = j2;
        return i3;
    }

    public static int A07(C62904SWl c62904SWl, byte[] bArr, int i, int i2) {
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
                        c62904SWl.A00 = i5;
                        return i7;
                    }
                }
            }
            c62904SWl.A00 = i9 | i4;
            return i10;
        }
        i5 = i8 | i3;
        c62904SWl.A00 = i5;
        return i7;
    }

    public static int A08(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int A04(C62904SWl c62904SWl, byte[] bArr, int i) {
        int A05 = A05(c62904SWl, bArr, i);
        int i2 = c62904SWl.A00;
        if (i2 >= 0) {
            int length = bArr.length;
            if (i2 <= length - A05) {
                if (i2 == 0) {
                    c62904SWl.A02 = AbstractC64536TIs.A01;
                    return A05;
                }
                AbstractC64536TIs.A00(A05, A05 + i2, length);
                c62904SWl.A02 = new RLN(AbstractC58319PtB.A1X(bArr, i2, A05));
                return A05 + i2;
            }
            throw C61029Rdx.A00("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw C61029Rdx.A00("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
