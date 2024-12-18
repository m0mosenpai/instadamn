package X;

/* loaded from: classes12.dex */
public final class Y1U {
    public C73313Y3l A00;
    public Y7W A01;
    public boolean A02;
    public final TIX A03;

    public static int A00(Y1U y1u, int i, int i2, int i3) {
        boolean A03;
        boolean z = y1u.A02;
        TIX tix = y1u.A03;
        if (z) {
            A03 = tix.A03(i2, i);
        } else {
            A03 = tix.A03(i, i2);
        }
        int i4 = i3 << 1;
        if (A03) {
            return i4 | 1;
        }
        return i4;
    }

    public final C73313Y3l A01() {
        C73313Y3l c73313Y3l = this.A00;
        if (c73313Y3l == null) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 6; i3++) {
                i2 = A00(this, i3, 8, i2);
            }
            int A00 = A00(this, 8, 7, A00(this, 8, 8, A00(this, 7, 8, i2)));
            int i4 = 5;
            do {
                A00 = A00(this, 8, i4, A00);
                i4--;
            } while (i4 >= 0);
            int i5 = this.A03.A00;
            int i6 = i5 - 7;
            for (int i7 = i5 - 1; i7 >= i6; i7--) {
                i = A00(this, 8, i7, i);
            }
            for (int i8 = i5 - 8; i8 < i5; i8++) {
                i = A00(this, i8, 8, i);
            }
            c73313Y3l = C73313Y3l.A00(A00, i);
            if (c73313Y3l == null) {
                c73313Y3l = C73313Y3l.A00(A00 ^ 21522, i ^ 21522);
            }
            this.A00 = c73313Y3l;
            if (c73313Y3l == null) {
                throw C60881RaS.A00();
            }
        }
        return c73313Y3l;
    }

    public final Y7W A02() {
        int i;
        Y7W y7w = this.A01;
        if (y7w == null) {
            int i2 = this.A03.A00;
            int i3 = (i2 - 17) / 4;
            if (i3 <= 6) {
                return Y7W.A0B(i3);
            }
            int i4 = i2 - 11;
            int i5 = 5;
            int i6 = 0;
            int i7 = 5;
            int i8 = 0;
            do {
                i = i2 - 9;
                while (i >= i4) {
                    i8 = A00(this, i, i7, i8);
                    i--;
                }
                i7--;
            } while (i7 >= 0);
            Y7W A0A = Y7W.A0A(i8);
            if (A0A == null || (A0A.A01 * 4) + 17 != i2) {
                do {
                    for (int i9 = i; i9 >= i4; i9--) {
                        i6 = A00(this, i5, i9, i6);
                    }
                    i5--;
                } while (i5 >= 0);
                A0A = Y7W.A0A(i6);
                if (A0A == null || (A0A.A01 * 4) + 17 != i2) {
                    throw C60881RaS.A00();
                }
            }
            this.A01 = A0A;
            return A0A;
        }
        return y7w;
    }

    public Y1U(TIX tix) {
        int i = tix.A00;
        if (i >= 21 && (i & 3) == 1) {
            this.A03 = tix;
            return;
        }
        throw C60881RaS.A00();
    }
}
