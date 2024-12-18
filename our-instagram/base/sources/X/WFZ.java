package X;

import androidx.media3.common.util.Util;

/* loaded from: classes11.dex */
public final class WFZ {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public WFZ(byte[] bArr) {
        int length = bArr.length;
        this.A03 = bArr;
        this.A01 = length;
    }

    public final int A04(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = this.A00 + i;
        this.A00 = i2;
        int i3 = 0;
        while (i2 > 8) {
            i2 -= 8;
            this.A00 = i2;
            byte[] bArr = this.A03;
            int i4 = this.A02;
            this.A02 = i4 + 1;
            i3 |= (bArr[i4] & 255) << i2;
        }
        byte[] bArr2 = this.A03;
        int i5 = this.A02;
        int i6 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i5] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.A00 = 0;
            this.A02 = i5 + 1;
        }
        A01(this);
        return i6;
    }

    public final void A0B(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.A03;
            int i4 = this.A02;
            int i5 = i4 + 1;
            this.A02 = i5;
            byte b = bArr2[i4];
            int i6 = this.A00;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 != 0) {
            byte b3 = (byte) (bArr[i2] & (255 >> i7));
            bArr[i2] = b3;
            int i8 = this.A00;
            if (i8 + i7 > 8) {
                byte[] bArr3 = this.A03;
                int i9 = this.A02;
                this.A02 = i9 + 1;
                b3 = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                bArr[i2] = b3;
                i8 -= 8;
                this.A00 = i8;
            }
            int i10 = i8 + i7;
            this.A00 = i10;
            byte[] bArr4 = this.A03;
            int i11 = this.A02;
            bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | b3);
            if (i10 == 8) {
                this.A00 = 0;
                this.A02 = i11 + 1;
            }
            A01(this);
        }
    }

    public static long A00(WFZ wfz, long j) {
        wfz.A08(1);
        long A04 = j | (wfz.A04(15) << 15) | wfz.A04(15);
        wfz.A08(1);
        return A04;
    }

    public static void A01(WFZ wfz) {
        boolean z;
        int i;
        int i2 = wfz.A02;
        if (i2 >= 0 && (i2 < (i = wfz.A01) || (i2 == i && wfz.A00 == 0))) {
            z = true;
        } else {
            z = false;
        }
        WDn.A02(z);
    }

    public final int A03() {
        return ((this.A01 - this.A02) * 8) - this.A00;
    }

    public final void A05() {
        if (this.A00 != 0) {
            this.A00 = 0;
            this.A02++;
            A01(this);
        }
    }

    public final void A06() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 8) {
            this.A00 = 0;
            this.A02++;
        }
        A01(this);
    }

    public final void A07(int i) {
        int i2 = i / 8;
        this.A02 = i2;
        this.A00 = i - (i2 * 8);
        A01(this);
    }

    public final void A08(int i) {
        int i2 = i / 8;
        int i3 = this.A02 + i2;
        this.A02 = i3;
        int i4 = this.A00 + (i - (i2 * 8));
        this.A00 = i4;
        if (i4 > 7) {
            this.A02 = i3 + 1;
            this.A00 = i4 - 8;
        }
        A01(this);
    }

    public final void A09(int i) {
        WDn.A02(AbstractC167007dF.A1N(this.A00));
        this.A02 += i;
        A01(this);
    }

    public final void A0A(WFa wFa) {
        byte[] bArr = wFa.A02;
        int i = wFa.A00;
        this.A03 = bArr;
        this.A02 = 0;
        this.A00 = 0;
        this.A01 = i;
        A07(wFa.A01 * 8);
    }

    public final boolean A0C() {
        boolean A1M = AbstractC167007dF.A1M(this.A03[this.A02] & (128 >> this.A00));
        A06();
        return A1M;
    }

    public static void A02(WFZ wfz, int i) {
        if (wfz.A0C()) {
            wfz.A08(i);
        }
    }

    public WFZ() {
        this.A03 = Util.A07;
    }
}
