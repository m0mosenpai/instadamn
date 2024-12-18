package X;

import com.google.protobuf.UnsafeUtil;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public abstract class SOG {
    public static final String A01(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (b < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            while (true) {
                int i5 = i4;
                if (i < i3) {
                    int i6 = i + 1;
                    byte b2 = byteBuffer.get(i);
                    if (b2 >= 0) {
                        i4++;
                        cArr[i5] = (char) b2;
                        while (i6 < i3) {
                            byte b3 = byteBuffer.get(i6);
                            if (b3 < 0) {
                                break;
                            }
                            i6++;
                            cArr[i4] = (char) b3;
                            i4++;
                        }
                        i = i6;
                    } else if (b2 < -32) {
                        if (i6 >= i3) {
                            break;
                        }
                        i = i6 + 1;
                        i4++;
                        AbstractC63076Sby.A02(cArr, b2, byteBuffer.get(i6), i5);
                    } else if (b2 < -16) {
                        if (i6 >= i3 - 1) {
                            break;
                        }
                        int i7 = i6 + 1;
                        i = i7 + 1;
                        i4++;
                        AbstractC63076Sby.A01(cArr, b2, byteBuffer.get(i6), byteBuffer.get(i7), i5);
                    } else {
                        if (i6 >= i3 - 2) {
                            break;
                        }
                        int i8 = i6 + 1;
                        int i9 = i8 + 1;
                        i = i9 + 1;
                        AbstractC63076Sby.A00(cArr, b2, byteBuffer.get(i6), byteBuffer.get(i8), byteBuffer.get(i9), i4);
                        i4 = i4 + 1 + 1;
                    }
                } else {
                    return new String(cArr, 0, i4);
                }
            }
            throw AbstractC58320PtC.A0e("Protocol message had invalid UTF-8.");
        }
        throw AbstractC58319PtB.A0f("buffer limit=%d, index=%d, limit=%d", AbstractC58320PtC.A1a(Integer.valueOf(byteBuffer.limit()), i, i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0173, code lost:
    
        if (r3 < 2048) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0056, code lost:
    
        if (r12 < 2048) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A02(java.lang.CharSequence r21, byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SOG.A02(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        r3 = r6 - 1;
        r5 = 65471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        if (r7 >= (-32)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
    
        if (r3 == 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        r6 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (r7 < (-62)) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        r10 = 1 + r0;
        r0 = com.google.protobuf.UnsafeUtil.A00(r13, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
    
        if (r0 > (-65)) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (r7 >= (-16)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (r3 < 2) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        r6 = r3 - 2;
        r2 = r0 + 1;
        r4 = com.google.protobuf.UnsafeUtil.A00(r13, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r4 > (-65)) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if (r7 != (-32)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        if (r4 < (-96)) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
    
        r10 = 1 + r2;
        r0 = com.google.protobuf.UnsafeUtil.A00(r13, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        if (r7 != (-19)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        if (r4 >= (-96)) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00b6, code lost:
    
        if (r3 < 3) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00b8, code lost:
    
        r6 = r3 - 3;
        r2 = r0 + 1;
        r0 = com.google.protobuf.UnsafeUtil.A00(r13, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00c0, code lost:
    
        if (r0 > (-65)) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00c6, code lost:
    
        if (X.AbstractC58322PtE.A04(r7, r0) != 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00c8, code lost:
    
        r0 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ce, code lost:
    
        if (com.google.protobuf.UnsafeUtil.A00(r13, r2) > (-65)) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0124 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A03(byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SOG.A03(byte[], int, int):int");
    }

    public final String A04(byte[] bArr, int i, int i2) {
        int i3;
        char[] cArr;
        int i4;
        int i5 = i;
        if (this instanceof RYw) {
            int length = bArr.length;
            i3 = 0;
            if ((i | i2 | ((length - i) - i2)) >= 0) {
                int A00 = RYw.A00(bArr, i2, i5) + i;
                int i6 = i + i2;
                while (A00 < i6 && UnsafeUtil.A00(bArr, A00) >= 0) {
                    A00++;
                }
                if (A00 == i6) {
                    return AbstractC58318PtA.A0n(SVB.A03, bArr, i5, i2);
                }
                cArr = new char[i2];
                i4 = 0;
                while (i5 < A00) {
                    cArr[i4] = (char) UnsafeUtil.A00(bArr, i5);
                    i5++;
                    i4++;
                }
                loop2: while (true) {
                    int i7 = i4;
                    while (A00 < i6) {
                        int i8 = A00 + 1;
                        byte A002 = UnsafeUtil.A00(bArr, A00);
                        if (A002 >= 0) {
                            i4++;
                            cArr[i7] = (char) A002;
                            while (i8 < i6) {
                                byte A003 = UnsafeUtil.A00(bArr, i8);
                                if (A003 >= 0) {
                                    i8++;
                                    cArr[i4] = (char) A003;
                                    i4++;
                                }
                            }
                            i7 = i4;
                            A00 = i8;
                        } else if (A002 < -32) {
                            if (i8 >= i6) {
                                break;
                            }
                            A00 = i8 + 1;
                            i4++;
                            AbstractC63076Sby.A02(cArr, A002, UnsafeUtil.A00(bArr, i8), i7);
                        } else if (A002 < -16) {
                            if (i8 >= i6 - 1) {
                                break;
                            }
                            int i9 = i8 + 1;
                            A00 = i9 + 1;
                            i4++;
                            AbstractC63076Sby.A01(cArr, A002, UnsafeUtil.A00(bArr, i8), UnsafeUtil.A00(bArr, i9), i7);
                        } else {
                            if (i8 >= i6 - 2) {
                                break;
                            }
                            int i10 = i8 + 1;
                            byte A004 = UnsafeUtil.A00(bArr, i8);
                            int i11 = i10 + 1;
                            byte A005 = UnsafeUtil.A00(bArr, i10);
                            A00 = i11 + 1;
                            AbstractC63076Sby.A00(cArr, A002, A004, A005, UnsafeUtil.A00(bArr, i11), i4);
                            i4 = i4 + 1 + 1;
                        }
                    }
                    break loop2;
                }
                throw AbstractC58320PtC.A0e("Protocol message had invalid UTF-8.");
            }
            throw AbstractC58323PtF.A0e(length, i5, i2);
        }
        int length2 = bArr.length;
        i3 = 0;
        if ((i | i2 | ((length2 - i) - i2)) >= 0) {
            int i12 = i + i2;
            cArr = new char[i2];
            i4 = 0;
            while (i5 < i12) {
                byte b = bArr[i5];
                if (b < 0) {
                    break;
                }
                i5++;
                cArr[i4] = (char) b;
                i4++;
            }
            while (true) {
                int i13 = i4;
                if (i5 >= i12) {
                    break;
                }
                int i14 = i5 + 1;
                byte b2 = bArr[i5];
                if (b2 >= 0) {
                    i4++;
                    cArr[i13] = (char) b2;
                    while (i14 < i12) {
                        byte b3 = bArr[i14];
                        if (b3 < 0) {
                            break;
                        }
                        i14++;
                        cArr[i4] = (char) b3;
                        i4++;
                    }
                    i5 = i14;
                } else if (b2 < -32) {
                    if (i14 >= i12) {
                        break;
                    }
                    i5 = i14 + 1;
                    i4++;
                    AbstractC63076Sby.A02(cArr, b2, bArr[i14], i13);
                } else if (b2 < -16) {
                    if (i14 >= i12 - 1) {
                        break;
                    }
                    int i15 = i14 + 1;
                    i5 = i15 + 1;
                    i4++;
                    AbstractC63076Sby.A01(cArr, b2, bArr[i14], bArr[i15], i13);
                } else {
                    if (i14 >= i12 - 2) {
                        break;
                    }
                    int i16 = i14 + 1;
                    int i17 = i16 + 1;
                    i5 = i17 + 1;
                    AbstractC63076Sby.A00(cArr, b2, bArr[i14], bArr[i16], bArr[i17], i4);
                    i4 = i4 + 1 + 1;
                }
            }
            throw AbstractC58320PtC.A0e("Protocol message had invalid UTF-8.");
        }
        throw AbstractC58323PtF.A0e(length2, i5, i2);
        return new String(cArr, i3, i4);
    }
}
