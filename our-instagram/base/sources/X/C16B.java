package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.16B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16B {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public boolean A07;
    public int[] A08;
    public String[] A09;
    public final int A0A;
    public final C16B A0B;
    public final AtomicReference A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final int A02(int[] iArr, int i) {
        if (i >= 4) {
            int i2 = iArr[0] ^ this.A0A;
            int i3 = i2 + (i2 >>> 9) + iArr[1];
            int i4 = ((i3 + (i3 >>> 15)) * 33) ^ iArr[2];
            int i5 = i4 + (i4 >>> 4);
            int i6 = 3;
            do {
                int i7 = iArr[i6];
                i5 += i7 ^ (i7 >> 21);
                i6++;
            } while (i6 < i);
            int i8 = i5 * 65599;
            int i9 = i8 + (i8 >>> 19);
            return (i9 << 5) ^ i9;
        }
        throw new IllegalArgumentException();
    }

    public final String A07(int[] iArr, int i) {
        if (i < 4) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return "";
                    }
                    return A05(iArr[0], iArr[1], iArr[2]);
                }
                return A04(iArr[0], iArr[1]);
            }
            return A03(iArr[0]);
        }
        int A02 = A02(iArr, i);
        int i2 = this.A01;
        int i3 = ((i2 - 1) & A02) << 2;
        int[] iArr2 = this.A08;
        int i4 = iArr2[i3 + 3];
        if (A02 == iArr2[i3] && i4 == i) {
            if (A01(iArr, i, iArr2[i3 + 1])) {
                return this.A09[i3 >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.A03 + ((i3 >> 3) << 2);
        int i6 = iArr2[i5 + 3];
        if (A02 == iArr2[i5] && i6 == i && A01(iArr, i, iArr2[i5 + 1])) {
            return this.A09[i5 >> 2];
        }
        int i7 = this.A06;
        int i8 = this.A05;
        int i9 = i7 + ((i3 >> (i8 + 2)) << i8);
        int i10 = (1 << i8) + i9;
        while (true) {
            if (i9 < i10) {
                int i11 = iArr2[i9 + 3];
                if (A02 == iArr2[i9] && i == i11) {
                    if (A01(iArr, i, iArr2[i9 + 1])) {
                        break;
                    }
                } else if (i11 == 0) {
                    return null;
                }
                i9 += 4;
            } else {
                i9 = (i2 << 3) - i2;
                while (i9 < this.A04) {
                    if (A02 != iArr2[i9] || i != iArr2[i9 + 3] || !A01(iArr, i, iArr2[i9 + 1])) {
                        i9 += 4;
                    }
                }
                return null;
            }
        }
        return this.A09[i9 >> 2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r14 <= (r15 * 0.8d)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00(int r18) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16B.A00(int):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A01(int[] r9, int r10, int r11) {
        /*
            r8 = this;
            int[] r5 = r8.A08
            r7 = 0
            r6 = 1
            switch(r10) {
                case 4: goto L4c;
                case 5: goto L3f;
                case 6: goto L32;
                case 7: goto L25;
                case 8: goto L1a;
                default: goto L7;
            }
        L7:
            r4 = 0
            r0 = 0
        L9:
            int r3 = r0 + 1
            r2 = r9[r0]
            int r1 = r11 + 1
            r0 = r5[r11]
            if (r2 != r0) goto L16
            if (r3 < r10) goto L17
            r4 = 1
        L16:
            return r4
        L17:
            r0 = r3
            r11 = r1
            goto L9
        L1a:
            r2 = r9[r7]
            int r1 = r11 + 1
            r0 = r5[r11]
            if (r2 != r0) goto L72
            r11 = r1
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            int r3 = r0 + 1
            r2 = r9[r0]
            int r1 = r11 + 1
            r0 = r5[r11]
            if (r2 != r0) goto L72
            r11 = r1
            goto L33
        L32:
            r3 = 0
        L33:
            int r4 = r3 + 1
            r2 = r9[r3]
            int r1 = r11 + 1
            r0 = r5[r11]
            if (r2 != r0) goto L72
            r11 = r1
            goto L40
        L3f:
            r4 = 0
        L40:
            int r3 = r4 + 1
            r2 = r9[r4]
            int r1 = r11 + 1
            r0 = r5[r11]
            if (r2 != r0) goto L72
            r11 = r1
            goto L4d
        L4c:
            r3 = 0
        L4d:
            int r4 = r3 + 1
            r1 = r9[r3]
            int r3 = r11 + 1
            r0 = r5[r11]
            if (r1 != r0) goto L72
            int r2 = r4 + 1
            r1 = r9[r4]
            int r4 = r3 + 1
            r0 = r5[r3]
            if (r1 != r0) goto L72
            int r3 = r2 + 1
            r1 = r9[r2]
            int r2 = r4 + 1
            r0 = r5[r4]
            if (r1 != r0) goto L72
            r1 = r9[r3]
            r0 = r5[r2]
            if (r1 != r0) goto L72
            return r6
        L72:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16B.A01(int[], int, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r6[r1] == r9) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r2 = r8.A09;
        r0 = r1 >> 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A03(int r9) {
        /*
            r8 = this;
            int r0 = r8.A0A
            r1 = r9 ^ r0
            int r0 = r1 >>> 16
            int r1 = r1 + r0
            int r0 = r1 << 3
            r1 = r1 ^ r0
            int r0 = r1 >>> 12
            int r1 = r1 + r0
            int r7 = r8.A01
            int r0 = r7 + (-1)
            r1 = r1 & r0
            int r4 = r1 << 2
            int[] r6 = r8.A08
            int r0 = r4 + 3
            r0 = r6[r0]
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L29
            r0 = r6[r4]
            if (r0 != r9) goto L2c
            java.lang.String[] r2 = r8.A09
            int r0 = r4 >> 2
        L26:
            r2 = r2[r0]
        L28:
            return r2
        L29:
            if (r0 != 0) goto L2c
            return r2
        L2c:
            int r1 = r8.A03
            int r0 = r4 >> 3
            int r0 = r0 << 2
            int r1 = r1 + r0
            int r0 = r1 + 3
            r0 = r6[r0]
            if (r0 != r3) goto L42
            r0 = r6[r1]
            if (r0 != r9) goto L45
        L3d:
            java.lang.String[] r2 = r8.A09
            int r0 = r1 >> 2
            goto L26
        L42:
            if (r0 != 0) goto L45
            return r2
        L45:
            int r1 = r8.A06
            int r3 = r8.A05
            int r0 = r3 + 2
            int r4 = r4 >> r0
            int r4 = r4 << r3
            int r1 = r1 + r4
            r5 = 1
            int r4 = r5 << r3
            int r4 = r4 + r1
        L52:
            if (r1 >= r4) goto L64
            int r0 = r1 + 3
            r3 = r6[r0]
            r0 = r6[r1]
            if (r9 != r0) goto L5f
            if (r5 != r3) goto L5f
            goto L3d
        L5f:
            if (r3 == 0) goto L28
            int r1 = r1 + 4
            goto L52
        L64:
            int r1 = r7 << 3
            int r1 = r1 - r7
        L67:
            int r0 = r8.A04
            if (r1 >= r0) goto L28
            r0 = r6[r1]
            if (r9 != r0) goto L76
            int r0 = r1 + 3
            r0 = r6[r0]
            if (r5 != r0) goto L76
            goto L3d
        L76:
            int r1 = r1 + 4
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16B.A03(int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r10 == r4[r1 + 1]) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r2 = r8.A09;
        r0 = r1 >> 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A04(int r9, int r10) {
        /*
            r8 = this;
            int r0 = r9 >>> 15
            int r1 = r9 + r0
            int r0 = r1 >>> 9
            r1 = r1 ^ r0
            int r0 = r10 * 33
            int r1 = r1 + r0
            int r0 = r8.A0A
            r1 = r1 ^ r0
            int r0 = r1 >>> 16
            int r1 = r1 + r0
            int r0 = r1 >>> 4
            r1 = r1 ^ r0
            int r0 = r1 << 3
            int r1 = r1 + r0
            int r7 = r8.A01
            int r0 = r7 + (-1)
            r1 = r1 & r0
            int r5 = r1 << 2
            int[] r4 = r8.A08
            int r0 = r5 + 3
            r0 = r4[r0]
            r2 = 0
            r3 = 2
            if (r0 != r3) goto L38
            r0 = r4[r5]
            if (r9 != r0) goto L3b
            int r0 = r5 + 1
            r0 = r4[r0]
            if (r10 != r0) goto L3b
            java.lang.String[] r2 = r8.A09
            int r0 = r5 >> 2
        L35:
            r2 = r2[r0]
        L37:
            return r2
        L38:
            if (r0 != 0) goto L3b
            return r2
        L3b:
            int r1 = r8.A03
            int r0 = r5 >> 3
            int r0 = r0 << r3
            int r1 = r1 + r0
            int r0 = r1 + 3
            r0 = r4[r0]
            if (r0 != r3) goto L56
            r0 = r4[r1]
            if (r9 != r0) goto L59
            int r0 = r1 + 1
            r0 = r4[r0]
            if (r10 != r0) goto L59
        L51:
            java.lang.String[] r2 = r8.A09
            int r0 = r1 >> 2
            goto L35
        L56:
            if (r0 != 0) goto L59
            return r2
        L59:
            int r1 = r8.A06
            int r3 = r8.A05
            int r0 = r3 + 2
            int r5 = r5 >> r0
            int r5 = r5 << r3
            int r1 = r1 + r5
            r6 = 1
            int r6 = r6 << r3
            int r6 = r6 + r1
        L65:
            r3 = 2
            if (r1 >= r6) goto L7e
            int r0 = r1 + 3
            r5 = r4[r0]
            r0 = r4[r1]
            if (r9 != r0) goto L79
            int r0 = r1 + 1
            r0 = r4[r0]
            if (r10 != r0) goto L79
            if (r3 != r5) goto L79
            goto L51
        L79:
            if (r5 == 0) goto L37
            int r1 = r1 + 4
            goto L65
        L7e:
            int r1 = r7 << 3
            int r1 = r1 - r7
        L81:
            int r0 = r8.A04
            if (r1 >= r0) goto L37
            r0 = r4[r1]
            if (r9 != r0) goto L96
            int r0 = r1 + 1
            r0 = r4[r0]
            if (r10 != r0) goto L96
            int r0 = r1 + 3
            r0 = r4[r0]
            if (r3 != r0) goto L96
            goto L51
        L96:
            int r1 = r1 + 4
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16B.A04(int, int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r4[r1 + 2] == r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        r2 = r8.A09;
        r0 = r1 >> 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A05(int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16B.A05(int, int, int):java.lang.String");
    }

    public final String A06(String str, int[] iArr, int i) {
        int A00;
        if (this.A07) {
            if (this.A0B == null) {
                if (this.A00 == 0) {
                    throw new IllegalStateException("Cannot add names to Root symbol table");
                }
                throw new IllegalStateException("Cannot add names to Placeholder symbol table");
            }
            int[] iArr2 = this.A08;
            this.A08 = Arrays.copyOf(iArr2, iArr2.length);
            String[] strArr = this.A09;
            this.A09 = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.A07 = false;
        }
        if (this.A0E) {
            str = C16U.A01.A00(str);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    int A02 = A02(iArr, i);
                    A00 = A00(A02);
                    int[] iArr3 = this.A08;
                    iArr3[A00] = A02;
                    int i2 = this.A02;
                    int i3 = i2 + i;
                    int length = iArr3.length;
                    if (i3 > length) {
                        iArr3 = Arrays.copyOf(iArr3, length + Math.max(i3 - length, Math.min(4096, this.A01)));
                        this.A08 = iArr3;
                    }
                    System.arraycopy(iArr, 0, iArr3, i2, i);
                    this.A02 += i;
                    int[] iArr4 = this.A08;
                    iArr4[A00 + 1] = i2;
                    iArr4[A00 + 3] = i;
                } else {
                    int i4 = iArr[0];
                    int i5 = iArr[1];
                    int i6 = iArr[2];
                    int i7 = i4 ^ this.A0A;
                    int i8 = (((i7 + (i7 >>> 9)) * 31) + i5) * 33;
                    int i9 = (i8 + (i8 >>> 15)) ^ i6;
                    int i10 = i9 + (i9 >>> 4);
                    int i11 = i10 + (i10 >>> 15);
                    A00 = A00(i11 ^ (i11 << 9));
                    int[] iArr5 = this.A08;
                    iArr5[A00] = iArr[0];
                    iArr5[A00 + 1] = iArr[1];
                    iArr5[A00 + 2] = iArr[2];
                    iArr5[A00 + 3] = 3;
                }
            } else {
                int i12 = iArr[0];
                int i13 = i12 + (i12 >>> 15);
                int i14 = ((i13 ^ (i13 >>> 9)) + (iArr[1] * 33)) ^ this.A0A;
                int i15 = i14 + (i14 >>> 16);
                int i16 = i15 ^ (i15 >>> 4);
                A00 = A00(i16 + (i16 << 3));
                int[] iArr6 = this.A08;
                iArr6[A00] = iArr[0];
                iArr6[A00 + 1] = iArr[1];
                iArr6[A00 + 3] = 2;
            }
        } else {
            int i17 = iArr[0] ^ this.A0A;
            int i18 = i17 + (i17 >>> 16);
            int i19 = i18 ^ (i18 << 3);
            A00 = A00(i19 + (i19 >>> 12));
            int[] iArr7 = this.A08;
            iArr7[A00] = iArr[0];
            iArr7[A00 + 3] = 1;
        }
        this.A09[A00 >> 2] = str;
        this.A00++;
        return str;
    }

    public final String toString() {
        int i = this.A03;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.A08[i3] != 0) {
                i2++;
            }
        }
        int i4 = this.A06;
        int i5 = 0;
        for (int i6 = i + 3; i6 < i4; i6 += 4) {
            if (this.A08[i6] != 0) {
                i5++;
            }
        }
        int i7 = i4 + 3;
        int i8 = this.A01;
        int i9 = i8 + i7;
        int i10 = 0;
        while (i7 < i9) {
            if (this.A08[i7] != 0) {
                i10++;
            }
            i7 += 4;
        }
        int i11 = (this.A04 - ((i8 << 3) - i8)) >> 2;
        int i12 = i8 << 3;
        int i13 = 0;
        for (int i14 = 3; i14 < i12; i14 += 4) {
            if (this.A08[i14] != 0) {
                i13++;
            }
        }
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", getClass().getName(), Integer.valueOf(this.A00), Integer.valueOf(i8), Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i2 + i5 + i10 + i11), Integer.valueOf(i13));
    }

    public C16B(int i) {
        this.A0B = null;
        this.A00 = 0;
        this.A07 = true;
        this.A0A = i;
        this.A0E = false;
        this.A0D = true;
        this.A0C = new AtomicReference(new C16C(new int[512], new String[128]));
    }

    public C16B(C16C c16c, C16B c16b, int i, boolean z, boolean z2) {
        this.A0B = c16b;
        this.A0A = i;
        this.A0E = z;
        this.A0D = z2;
        this.A0C = null;
        this.A00 = c16c.A00;
        int i2 = c16c.A02;
        this.A01 = i2;
        int i3 = i2 << 2;
        this.A03 = i3;
        this.A06 = i3 + (i3 >> 1);
        this.A05 = c16c.A04;
        this.A08 = c16c.A05;
        this.A09 = c16c.A06;
        this.A04 = c16c.A03;
        this.A02 = c16c.A01;
        this.A07 = true;
    }
}
