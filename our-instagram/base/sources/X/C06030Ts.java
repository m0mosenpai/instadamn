package X;

import org.tukaani.xz.lz.LZEncoder;
import org.tukaani.xz.lzma.LZMAEncoder;

/* renamed from: X.0Ts, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06030Ts extends LZMAEncoder {
    public C20520zT A00;

    @Override // org.tukaani.xz.lzma.LZMAEncoder
    public final int A02() {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = ((LZMAEncoder) this).A03;
        if (i5 == -1) {
            ((LZMAEncoder) this).A03 = 0;
            i5 = 0;
            this.A00 = ((LZMAEncoder) this).A07.A05();
        }
        ((LZMAEncoder) this).A01 = -1;
        LZEncoder lZEncoder = ((LZMAEncoder) this).A07;
        int min = Math.min(lZEncoder.A03 - lZEncoder.A02, 273);
        if (min >= 2) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            do {
                iArr = ((AbstractC20480zP) this).A02;
                int A04 = lZEncoder.A04(iArr[i7], min);
                if (A04 >= 2) {
                    if (A04 >= ((LZMAEncoder) this).A06) {
                        ((LZMAEncoder) this).A01 = i7;
                        A06(A04 - 1);
                        return A04;
                    }
                    if (A04 > i8) {
                        i9 = i7;
                        i8 = A04;
                    }
                }
                i7++;
            } while (i7 < 4);
            C20520zT c20520zT = this.A00;
            int i10 = c20520zT.A00;
            if (i10 > 0) {
                int[] iArr2 = c20520zT.A02;
                int i11 = i10 - 1;
                i = iArr2[i11];
                int[] iArr3 = c20520zT.A01;
                i2 = iArr3[i11];
                if (i >= ((LZMAEncoder) this).A06) {
                    ((LZMAEncoder) this).A01 = i2 + 4;
                    i3 = i - 1;
                    A06(i3);
                    return i;
                }
                while (i10 > 1) {
                    int i12 = i10 - 2;
                    if (i != iArr2[i12] + 1 || iArr3[i12] >= (i2 >>> 7)) {
                        break;
                    }
                    i10--;
                    c20520zT.A00 = i10;
                    int i13 = i10 - 1;
                    i = iArr2[i13];
                    i2 = iArr3[i13];
                }
                if (i == 2 && i2 >= 128) {
                    i = 1;
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (i8 >= 2 && (i8 + 1 >= i || ((i8 + 2 >= i && i2 >= 512) || (i8 + 3 >= i && i2 >= 32768)))) {
                ((LZMAEncoder) this).A01 = i9;
                A06(i8 - 1);
                return i8;
            }
            if (i >= 2 && min > 2) {
                ((LZMAEncoder) this).A03 = i5 + 1;
                C20520zT A05 = lZEncoder.A05();
                this.A00 = A05;
                int i14 = A05.A00;
                if (i14 > 0) {
                    int i15 = i14 - 1;
                    int i16 = A05.A02[i15];
                    int i17 = A05.A01[i15];
                    if ((i16 >= i && i17 < i2) || ((i16 == (i4 = i + 1) && i2 >= (i17 >>> 7)) || i16 > i4 || (i16 + 1 >= i && i >= 3 && i17 < (i2 >>> 7)))) {
                        return 1;
                    }
                }
                int max = Math.max(i - 1, 2);
                while (lZEncoder.A04(iArr[i6], max) != max) {
                    i6++;
                    if (i6 >= 4) {
                        ((LZMAEncoder) this).A01 = i2 + 4;
                        i3 = i - 2;
                        A06(i3);
                        return i;
                    }
                }
            }
        }
        return 1;
    }
}
