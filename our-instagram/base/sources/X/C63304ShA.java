package X;

/* renamed from: X.ShA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63304ShA {
    public int A00;
    public int A01;
    public C63304ShA A02;
    public C63304ShA A03;
    public boolean A04;
    public boolean A05;
    public final byte[] A06;

    public final C63304ShA A03() {
        this.A05 = true;
        return new C63304ShA(this.A06, this.A01, this.A00, true, false);
    }

    public static long A00(C63304ShA c63304ShA) {
        return c63304ShA.A00 - c63304ShA.A01;
    }

    public final C63304ShA A02() {
        C63304ShA c63304ShA = this.A02;
        C63304ShA c63304ShA2 = null;
        if (c63304ShA != this) {
            c63304ShA2 = c63304ShA;
        }
        C63304ShA c63304ShA3 = this.A03;
        c63304ShA3.A02 = c63304ShA;
        this.A02.A03 = c63304ShA3;
        this.A02 = null;
        this.A03 = null;
        return c63304ShA2;
    }

    public final C63304ShA A04() {
        return new C63304ShA((byte[]) this.A06.clone(), this.A01, this.A00, false, true);
    }

    public final void A05(C63304ShA c63304ShA) {
        c63304ShA.A03 = this;
        c63304ShA.A02 = this.A02;
        this.A02.A03 = c63304ShA;
        this.A02 = c63304ShA;
    }

    public final void A06(C63304ShA c63304ShA, int i) {
        if (c63304ShA.A04) {
            int i2 = c63304ShA.A00;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!c63304ShA.A05) {
                    int i4 = c63304ShA.A01;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = c63304ShA.A06;
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        i2 = c63304ShA.A00 - c63304ShA.A01;
                        c63304ShA.A00 = i2;
                        c63304ShA.A01 = 0;
                    } else {
                        throw AbstractC58318PtA.A0Y();
                    }
                } else {
                    throw AbstractC58318PtA.A0Y();
                }
            }
            System.arraycopy(this.A06, this.A01, c63304ShA.A06, i2, i);
            c63304ShA.A00 += i;
            this.A01 += i;
            return;
        }
        throw AbstractC58318PtA.A0Y();
    }

    public C63304ShA() {
        this.A06 = new byte[8192];
        this.A04 = true;
        this.A05 = false;
    }

    public static void A01(TWX twx, C63304ShA c63304ShA) {
        twx.A01 = c63304ShA.A02();
        C63109SdD.A01(c63304ShA);
    }

    public C63304ShA(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.A06 = bArr;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A04 = z2;
    }
}
