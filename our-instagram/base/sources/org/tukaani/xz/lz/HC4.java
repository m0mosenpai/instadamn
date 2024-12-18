package org.tukaani.xz.lz;

import X.C13120ly;
import X.C20520zT;

/* loaded from: classes.dex */
public final class HC4 extends LZEncoder {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C13120ly A04;
    public final C20520zT A05;
    public final int[] A06;

    public HC4(int i, int i2, int i3, int i4, int i5) {
        super(i, i2, i3, i4);
        this.A00 = -1;
        this.A04 = new C13120ly(i);
        int i6 = i + 1;
        this.A02 = i6;
        this.A06 = new int[i6];
        this.A01 = i6;
        this.A05 = new C20520zT(i4 - 1);
        this.A03 = i5 <= 0 ? (i4 / 4) + 4 : i5;
    }

    private int A00() {
        int i = super.A02 + 1;
        super.A02 = i;
        int i2 = super.A03 - i;
        if (i2 < 4) {
            super.A00++;
            return 0;
        }
        int i3 = this.A01 + 1;
        this.A01 = i3;
        if (i3 == Integer.MAX_VALUE) {
            int i4 = Integer.MAX_VALUE - this.A02;
            C13120ly c13120ly = this.A04;
            LZEncoder.A03(c13120ly.A03, i4);
            LZEncoder.A03(c13120ly.A04, i4);
            LZEncoder.A03(c13120ly.A05, i4);
            LZEncoder.A03(this.A06, i4);
            this.A01 = i3 - i4;
        }
        int i5 = this.A00 + 1;
        this.A00 = i5;
        if (i5 != this.A02) {
            return i2;
        }
        this.A00 = 0;
        return i2;
    }

    @Override // org.tukaani.xz.lz.LZEncoder
    public final C20520zT A05() {
        int i;
        C20520zT c20520zT = this.A05;
        c20520zT.A00 = 0;
        int i2 = 0;
        char c = 0;
        int i3 = 273;
        int i4 = this.A07;
        int A00 = A00();
        if (A00 < 273) {
            if (A00 != 0) {
                i3 = A00;
                if (i4 > A00) {
                    i4 = A00;
                }
            }
            return c20520zT;
        }
        C13120ly c13120ly = this.A04;
        byte[] bArr = this.A08;
        int i5 = super.A02;
        c13120ly.A01(bArr, i5);
        int i6 = this.A01;
        int i7 = i6 - c13120ly.A03[c13120ly.A00];
        int i8 = i6 - c13120ly.A04[c13120ly.A01];
        int i9 = c13120ly.A05[c13120ly.A02];
        c13120ly.A00(i6);
        int[] iArr = this.A06;
        int i10 = this.A00;
        iArr[i10] = i9;
        int i11 = this.A02;
        int i12 = 2;
        if (i7 < i11 && bArr[i5 - i7] == bArr[i5]) {
            c20520zT.A02[0] = 2;
            c20520zT.A01[0] = i7 - 1;
            c20520zT.A00 = 1;
            i2 = 1;
            c = 1;
        } else {
            i12 = 0;
        }
        int i13 = 3;
        if (i7 != i8 && i8 < i11 && bArr[i5 - i8] == bArr[i5]) {
            int[] iArr2 = c20520zT.A01;
            i2++;
            c20520zT.A00 = i2;
            iArr2[c] = i8 - 1;
            i7 = i8;
            i12 = 3;
        }
        if (i2 > 0) {
            while (i12 < i3) {
                int i14 = i5 + i12;
                if (bArr[i14 - i7] != bArr[i14]) {
                    break;
                }
                i12++;
            }
            c20520zT.A02[i2 - 1] = i12;
            if (i12 >= i4) {
                return c20520zT;
            }
        }
        if (i12 >= 3) {
            i13 = i12;
        }
        int i15 = this.A03;
        while (true) {
            int i16 = i6 - i9;
            int i17 = i15 - 1;
            if (i15 == 0) {
                break;
            }
            int i18 = i11;
            if (i16 >= i11) {
                break;
            }
            int i19 = i10 - i16;
            if (i16 <= i10) {
                i18 = 0;
            }
            i9 = iArr[i19 + i18];
            int i20 = i5 + i13;
            if (bArr[i20 - i16] == bArr[i20] && bArr[i5 - i16] == bArr[i5]) {
                int i21 = 0;
                do {
                    i21++;
                    if (i21 >= i3) {
                        break;
                    }
                    i = i5 + i21;
                } while (bArr[i - i16] == bArr[i]);
                if (i21 > i13) {
                    c20520zT.A02[i2] = i21;
                    c20520zT.A01[i2] = i16 - 1;
                    i2++;
                    c20520zT.A00 = i2;
                    if (i21 >= i4) {
                        break;
                    }
                    i13 = i21;
                } else {
                    continue;
                }
            }
            i15 = i17;
        }
        return c20520zT;
    }

    @Override // org.tukaani.xz.lz.LZEncoder
    public final void A06(int i) {
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                if (A00() != 0) {
                    C13120ly c13120ly = this.A04;
                    c13120ly.A01(this.A08, super.A02);
                    this.A06[this.A00] = c13120ly.A05[c13120ly.A02];
                    c13120ly.A00(this.A01);
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    static {
        try {
            Class.forName("org.tukaani.xz.lz.HC4");
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }
}
