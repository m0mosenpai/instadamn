package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.0ly, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13120ly {
    public static final int[] A07;
    public int A00;
    public int A01;
    public int A02;
    public final int[] A03;
    public final int[] A04;
    public final int[] A05;
    public final int A06;

    static {
        int[] iArr = new int[256];
        A07 = iArr;
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            int i3 = 0;
            do {
                int i4 = i2 & 1;
                i2 >>>= 1;
                if (i4 != 0) {
                    i2 ^= -306674912;
                }
                i3++;
            } while (i3 < 8);
            iArr[i] = i2;
        }
    }

    public C13120ly() {
    }

    public final void A00(int i) {
        this.A03[this.A00] = i;
        this.A04[this.A01] = i;
        this.A05[this.A02] = i;
    }

    public final void A01(byte[] bArr, int i) {
        int[] iArr = A07;
        int i2 = iArr[bArr[i] & 255] ^ (bArr[i + 1] & 255);
        this.A00 = i2 & 1023;
        int i3 = i2 ^ ((bArr[i + 2] & 255) << 8);
        this.A01 = 65535 & i3;
        this.A02 = ((iArr[bArr[i + 3] & 255] << 5) ^ i3) & this.A06;
    }

    public C13120ly(int i) {
        this.A03 = new int[1024];
        this.A04 = new int[Constants.LOAD_RESULT_PGO_ATTEMPTED];
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = 0;
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = ((i5 | (i5 >>> 8)) >>> 1) | 65535;
        int i7 = (i6 > 16777216 ? i6 >>> 1 : i6) + 1;
        this.A05 = new int[i7];
        this.A06 = i7 - 1;
    }
}
