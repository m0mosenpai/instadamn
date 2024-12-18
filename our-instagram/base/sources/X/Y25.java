package X;

/* loaded from: classes12.dex */
public final class Y25 {
    public static final Y25 A08;
    public static final Y25 A09;
    public static final Y25 A0A;
    public static final Y25 A0B;
    public static final Y25 A0C;
    public static final Y25 A0D;
    public final int A00;
    public final C72871Xpt A01;
    public final C72871Xpt A02;
    public final int[] A03;
    public final int[] A04;
    public final int A05;
    public static final Y25 A07 = new Y25(4201, 4096);
    public static final Y25 A06 = new Y25(1033, 1024);

    static {
        Y25 y25 = new Y25(67, 64);
        A08 = y25;
        A0A = new Y25(19, 16);
        A0D = new Y25(285, 256);
        Y25 y252 = new Y25(301, 256);
        A0B = y252;
        A09 = y252;
        A0C = y25;
    }

    public final int A00(int i) {
        if (i != 0) {
            return this.A03[(this.A00 - this.A04[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public final int A01(int i, int i2) {
        if (i != 0 && i2 != 0) {
            int[] iArr = this.A03;
            int[] iArr2 = this.A04;
            return iArr[(iArr2[i] + iArr2[i2]) % (this.A00 - 1)];
        }
        return 0;
    }

    public final C72871Xpt A02(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.A02;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new C72871Xpt(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    public Y25(int i, int i2) {
        this.A05 = i;
        this.A00 = i2;
        int[] iArr = new int[i2];
        this.A03 = iArr;
        int[] iArr2 = new int[i2];
        this.A04 = iArr2;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3;
            i3 *= 2;
            if (i3 >= i2) {
                i3 = (i3 ^ i) & (i2 - 1);
            }
        }
        for (int i5 = 0; i5 < i2 - 1; i5++) {
            iArr2[iArr[i5]] = i5;
        }
        this.A02 = new C72871Xpt(this, new int[]{0});
        this.A01 = new C72871Xpt(this, new int[]{1});
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GF(0x");
        A1C.append(Integer.toHexString(this.A05));
        A1C.append(',');
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
