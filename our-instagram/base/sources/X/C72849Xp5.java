package X;

/* renamed from: X.Xp5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72849Xp5 {
    public int A00;
    public int A01;
    public final byte[] A02;

    public final int A01(int i) {
        if (i >= 1 && i <= 32 && i <= A00()) {
            int i2 = this.A00;
            int i3 = 0;
            if (i2 > 0) {
                int i4 = 8 - i2;
                int min = Math.min(i, i4);
                int i5 = i4 - min;
                byte[] bArr = this.A02;
                int i6 = this.A01;
                int i7 = (((255 >> (8 - min)) << i5) & bArr[i6]) >> i5;
                i -= min;
                i2 += min;
                this.A00 = i2;
                if (i2 == 8) {
                    this.A00 = 0;
                    i2 = 0;
                    this.A01 = i6 + 1;
                }
                i3 = i7;
                if (i <= 0) {
                    return i3;
                }
            }
            while (i >= 8) {
                byte[] bArr2 = this.A02;
                int i8 = this.A01;
                i3 = (bArr2[i8] & 255) | (i3 << 8);
                this.A01 = i8 + 1;
                i -= 8;
            }
            if (i > 0) {
                int i9 = 8 - i;
                int i10 = (i3 << i) | ((((255 >> i9) << i9) & this.A02[this.A01]) >> i9);
                this.A00 = i2 + i;
                return i10;
            }
            return i3;
        }
        throw AbstractC166987dD.A12(String.valueOf(i));
    }

    public final int A00() {
        return ((this.A02.length - this.A01) * 8) - this.A00;
    }

    public C72849Xp5(byte[] bArr) {
        this.A02 = bArr;
    }
}
