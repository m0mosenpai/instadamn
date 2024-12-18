package X;

/* renamed from: X.3FJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FJ {
    public long A00 = 0;
    public C3FJ A01;

    private void A00() {
        if (this.A01 == null) {
            this.A01 = new C3FJ();
        }
    }

    public final int A01(int i) {
        long j;
        C3FJ c3fj = this.A01;
        if (c3fj == null) {
            if (i >= 64) {
                j = this.A00;
                return Long.bitCount(j);
            }
        } else if (i >= 64) {
            return c3fj.A01(i - 64) + Long.bitCount(this.A00);
        }
        j = this.A00 & ((1 << i) - 1);
        return Long.bitCount(j);
    }

    public final void A02() {
        this.A00 = 0L;
        C3FJ c3fj = this.A01;
        if (c3fj != null) {
            c3fj.A02();
        }
    }

    public final void A03(int i) {
        if (i >= 64) {
            C3FJ c3fj = this.A01;
            if (c3fj != null) {
                c3fj.A03(i - 64);
                return;
            }
            return;
        }
        this.A00 &= (1 << i) ^ (-1);
    }

    public final void A04(int i) {
        if (i >= 64) {
            A00();
            this.A01.A04(i - 64);
        } else {
            this.A00 |= 1 << i;
        }
    }

    public final void A05(int i, boolean z) {
        if (i >= 64) {
            A00();
            this.A01.A05(i - 64, z);
            return;
        }
        long j = this.A00;
        boolean z2 = false;
        if ((Long.MIN_VALUE & j) != 0) {
            z2 = true;
        }
        long j2 = (1 << i) - 1;
        this.A00 = ((j & (j2 ^ (-1))) << 1) | (j & j2);
        if (z) {
            A04(i);
        } else {
            A03(i);
        }
        if (!z2 && this.A01 == null) {
            return;
        }
        A00();
        this.A01.A05(0, z2);
    }

    public final boolean A06(int i) {
        if (i >= 64) {
            A00();
            return this.A01.A06(i - 64);
        }
        if ((this.A00 & (1 << i)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean A07(int i) {
        if (i >= 64) {
            A00();
            return this.A01.A07(i - 64);
        }
        long j = 1 << i;
        long j2 = this.A00;
        boolean z = false;
        if ((j2 & j) != 0) {
            z = true;
        }
        long j3 = j2 & (j ^ (-1));
        this.A00 = j3;
        long j4 = j - 1;
        this.A00 = (j3 & j4) | Long.rotateRight((j4 ^ (-1)) & j3, 1);
        C3FJ c3fj = this.A01;
        if (c3fj == null) {
            return z;
        }
        if (c3fj.A06(0)) {
            A04(63);
        }
        this.A01.A07(0);
        return z;
    }

    public final String toString() {
        C3FJ c3fj = this.A01;
        if (c3fj == null) {
            return Long.toBinaryString(this.A00);
        }
        return AnonymousClass001.A0g(c3fj.toString(), "xx", Long.toBinaryString(this.A00));
    }
}
