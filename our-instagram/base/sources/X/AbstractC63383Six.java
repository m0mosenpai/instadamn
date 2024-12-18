package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.Six, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63383Six {
    public static int A01(C62906SWn c62906SWn, InterfaceC65596Tnf interfaceC65596Tnf, byte[] bArr, int i, int i2, int i3) {
        TEU teu = (TEU) interfaceC65596Tnf;
        Object CsR = teu.CsR();
        int A0O = teu.A0O(c62906SWn, CsR, bArr, i, i2, i3);
        teu.Cmk(CsR);
        c62906SWn.A02 = CsR;
        return A0O;
    }

    public static int A02(C62906SWn c62906SWn, C63022Saq c63022Saq, byte[] bArr, int i, int i2, int i3) {
        Object A01;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 5) {
                                c63022Saq.A01(i, Integer.valueOf(AbstractC58321PtD.A0F(bArr, i2)));
                                return i2 + 4;
                            }
                        } else {
                            C63022Saq c63022Saq2 = new C63022Saq();
                            int i6 = (i & (-8)) | 4;
                            int i7 = 0;
                            while (i4 < i3) {
                                i4 = A05(c62906SWn, bArr, i4);
                                i7 = c62906SWn.A00;
                                if (i7 == i6) {
                                    break;
                                }
                                i4 = A02(c62906SWn, c63022Saq2, bArr, i7, i4, i3);
                            }
                            if (i4 <= i3 && i7 == i6) {
                                c63022Saq.A01(i, c63022Saq2);
                                return i4;
                            }
                            throw AbstractC58320PtC.A0e("Failed to parse the message.");
                        }
                    } else {
                        int A05 = A05(c62906SWn, bArr, i2);
                        int i8 = c62906SWn.A00;
                        if (i8 >= 0) {
                            if (i8 <= bArr.length - A05) {
                                if (i8 == 0) {
                                    A01 = AbstractC64538TIu.A01;
                                } else {
                                    A01 = AbstractC64538TIu.A01(bArr, A05, i8);
                                }
                                c63022Saq.A01(i, A01);
                                return A05 + i8;
                            }
                            throw C4L5.A02();
                        }
                        throw C4L5.A01();
                    }
                } else {
                    c63022Saq.A01(i, Long.valueOf(AbstractC58324PtG.A03(bArr, i2)));
                    return i2 + 8;
                }
            } else {
                int A06 = A06(c62906SWn, bArr, i2);
                c63022Saq.A01(i, Long.valueOf(c62906SWn.A01));
                return A06;
            }
        }
        throw AbstractC58320PtC.A0e("Protocol message contained an invalid tag (zero).");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r5 >= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(X.C62906SWn r6, X.InterfaceC65596Tnf r7, byte[] r8, int r9, int r10) {
        /*
            int r4 = r9 + 1
            r3 = r8
            r5 = r8[r9]
            r1 = r6
            if (r5 >= 0) goto L10
            int r4 = A07(r6, r8, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L22
        L10:
            int r10 = r10 - r4
            if (r5 > r10) goto L22
            r0 = r7
            java.lang.Object r2 = r7.CsR()
            int r5 = r5 + r4
            r0.CpQ(r1, r2, r3, r4, r5)
            r7.Cmk(r2)
            r6.A02 = r2
            return r5
        L22:
            X.4L5 r0 = X.C4L5.A02()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63383Six.A00(X.SWn, X.Tnf, byte[], int, int):int");
    }

    public static int A05(C62906SWn c62906SWn, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c62906SWn.A00 = b;
            return i2;
        }
        return A07(c62906SWn, bArr, b, i2);
    }

    public static int A06(C62906SWn c62906SWn, byte[] bArr, int i) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c62906SWn.A01 = j;
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
        c62906SWn.A01 = j2;
        return i3;
    }

    public static int A07(C62906SWn c62906SWn, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i & StringTreeSet.MAX_SYMBOL_COUNT;
        int i7 = i2 + 1;
        int i8 = bArr[i2];
        if (i8 >= 0) {
            i3 = i8 << 7;
        } else {
            int i9 = i6 | ((i8 & StringTreeSet.MAX_SYMBOL_COUNT) << 7);
            int i10 = i7 + 1;
            int i11 = bArr[i7];
            if (i11 >= 0) {
                i4 = i11 << 14;
            } else {
                i6 = i9 | ((i11 & StringTreeSet.MAX_SYMBOL_COUNT) << 14);
                i7 = i10 + 1;
                int i12 = bArr[i10];
                i3 = i12 << 21;
                if (i12 < 0) {
                    i9 = i6 | ((i12 & StringTreeSet.MAX_SYMBOL_COUNT) << 21);
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
                        c62906SWn.A00 = i5;
                        return i7;
                    }
                }
            }
            c62906SWn.A00 = i9 | i4;
            return i10;
        }
        i5 = i6 | i3;
        c62906SWn.A00 = i5;
        return i7;
    }

    public static int A08(C62906SWn c62906SWn, byte[] bArr, int i, int i2, int i3) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                        } else {
                            int i5 = (i & (-8)) | 4;
                            int i6 = 0;
                            while (i2 < i3) {
                                i2 = A05(c62906SWn, bArr, i2);
                                i6 = c62906SWn.A00;
                                if (i6 == i5) {
                                    break;
                                }
                                i2 = A08(c62906SWn, bArr, i6, i2, i3);
                            }
                            if (i2 <= i3 && i6 == i5) {
                                return i2;
                            }
                            throw AbstractC58320PtC.A0e("Failed to parse the message.");
                        }
                    } else {
                        return A05(c62906SWn, bArr, i2) + c62906SWn.A00;
                    }
                } else {
                    return i2 + 8;
                }
            } else {
                return A06(c62906SWn, bArr, i2);
            }
        }
        throw AbstractC58320PtC.A0e("Protocol message contained an invalid tag (zero).");
    }

    public static int A03(C62906SWn c62906SWn, byte[] bArr, int i) {
        int A05 = A05(c62906SWn, bArr, i);
        int i2 = c62906SWn.A00;
        if (i2 >= 0) {
            if (i2 <= bArr.length - A05) {
                if (i2 == 0) {
                    c62906SWn.A02 = AbstractC64538TIu.A01;
                    return A05;
                }
                c62906SWn.A02 = AbstractC64538TIu.A01(bArr, A05, i2);
                return A05 + i2;
            }
            throw C4L5.A02();
        }
        throw C4L5.A01();
    }

    public static int A04(C62906SWn c62906SWn, byte[] bArr, int i) {
        int A05 = A05(c62906SWn, bArr, i);
        int i2 = c62906SWn.A00;
        if (i2 >= 0) {
            if (i2 == 0) {
                c62906SWn.A02 = "";
                return A05;
            }
            c62906SWn.A02 = SU7.A00.A04(bArr, A05, i2);
            return A05 + i2;
        }
        throw C4L5.A01();
    }
}
