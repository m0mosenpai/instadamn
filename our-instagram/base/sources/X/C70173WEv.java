package X;

/* renamed from: X.WEv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70173WEv {
    public int A00 = 0;
    public int A01;
    public int A02;
    public byte[] A03;

    public static int A00(C70173WEv c70173WEv) {
        int i = 0;
        while (!c70173WEv.A06()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? c70173WEv.A03(i) : 0);
    }

    private boolean A02(int i) {
        if (2 <= i && i < this.A01) {
            byte[] bArr = this.A03;
            return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
        }
        return false;
    }

    public static void A01(C70173WEv c70173WEv) {
        boolean z;
        int i;
        int i2 = c70173WEv.A02;
        if (i2 >= 0 && (i2 < (i = c70173WEv.A01) || (i2 == i && c70173WEv.A00 == 0))) {
            z = true;
        } else {
            z = false;
        }
        WDn.A02(z);
    }

    public final int A03(int i) {
        int i2;
        int i3 = this.A00 + i;
        this.A00 = i3;
        int i4 = 0;
        while (true) {
            i2 = 2;
            if (i3 <= 8) {
                break;
            }
            i3 -= 8;
            this.A00 = i3;
            byte[] bArr = this.A03;
            int i5 = this.A02;
            i4 |= (bArr[i5] & 255) << i3;
            if (!A02(i5 + 1)) {
                i2 = 1;
            }
            this.A02 = i5 + i2;
        }
        byte[] bArr2 = this.A03;
        int i6 = this.A02;
        int i7 = ((-1) >>> (32 - i)) & (i4 | ((bArr2[i6] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.A00 = 0;
            if (!A02(i6 + 1)) {
                i2 = 1;
            }
            this.A02 = i6 + i2;
        }
        A01(this);
        return i7;
    }

    public final void A04() {
        int i = 1;
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == 8) {
            this.A00 = 0;
            int i3 = this.A02;
            if (A02(i3 + 1)) {
                i = 2;
            }
            this.A02 = i3 + i;
        }
        A01(this);
    }

    public final void A05(int i) {
        int i2 = this.A02;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.A02 = i4;
        int i5 = this.A00 + (i - (i3 * 8));
        this.A00 = i5;
        if (i5 > 7) {
            i4++;
            this.A02 = i4;
            this.A00 = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= i4) {
                if (A02(i2)) {
                    i4++;
                    this.A02 = i4;
                    i2 += 2;
                }
            } else {
                A01(this);
                return;
            }
        }
    }

    public final boolean A06() {
        boolean A1M = AbstractC167007dF.A1M(this.A03[this.A02] & (128 >> this.A00));
        A04();
        return A1M;
    }

    public C70173WEv(byte[] bArr, int i, int i2) {
        this.A03 = bArr;
        this.A02 = i;
        this.A01 = i2;
        A01(this);
    }
}
