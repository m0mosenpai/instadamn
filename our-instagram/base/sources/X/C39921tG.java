package X;

/* renamed from: X.1tG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39921tG {
    public C42131x3 A00;
    public C42131x3 A01;
    public C42131x3 A02;
    public C42131x3 A03;
    public C42131x3 A04;
    public C42131x3 A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final InterfaceC39191rv A09;
    public final InterfaceC39191rv A0A;
    public final InterfaceC38191q6 A0B;

    public final C42131x3 A01(long j) {
        if (j != -3) {
            if (j == -2) {
                if (C218914p.A08()) {
                    C42131x3 c42131x3 = this.A01;
                    if (c42131x3 == null) {
                        C39111rk Af2 = this.A09.Af2();
                        C42131x3 c42131x32 = new C42131x3(Af2.A03, Af2.A01);
                        this.A01 = c42131x32;
                        return c42131x32;
                    }
                    return c42131x3;
                }
                C42131x3 c42131x33 = this.A02;
                if (c42131x33 != null) {
                    return c42131x33;
                }
                C39111rk B7t = this.A09.B7t();
                C42131x3 c42131x34 = new C42131x3(B7t.A03, B7t.A01);
                this.A02 = c42131x34;
                return c42131x34;
            }
            if (j == -1) {
                return A00(this);
            }
            if (j == -4) {
                C42131x3 c42131x35 = this.A05;
                if (c42131x35 != null) {
                    return c42131x35;
                }
                long j2 = this.A08;
                C42131x3 c42131x36 = new C42131x3(j2, this.A07 * j2);
                this.A05 = c42131x36;
                return c42131x36;
            }
            if (j == -5) {
                C42131x3 c42131x37 = this.A00;
                if (c42131x37 != null) {
                    return c42131x37;
                }
                long j3 = this.A06;
                C42131x3 c42131x38 = new C42131x3(j3, this.A07 * j3);
                this.A00 = c42131x38;
                return c42131x38;
            }
            return new C42131x3(j, this.A07 * j);
        }
        throw new IllegalArgumentException("got unset latency for event when scheduling upload!");
    }

    public C39921tG(InterfaceC38191q6 interfaceC38191q6, InterfaceC39191rv interfaceC39191rv, InterfaceC39191rv interfaceC39191rv2, long j, long j2, long j3) {
        this.A0B = interfaceC38191q6;
        this.A0A = interfaceC39191rv;
        this.A09 = interfaceC39191rv2;
        this.A08 = j;
        this.A06 = j2;
        this.A07 = j3;
    }

    public static C42131x3 A00(C39921tG c39921tG) {
        if (C218914p.A08()) {
            C42131x3 c42131x3 = c39921tG.A03;
            if (c42131x3 == null) {
                C39111rk Af2 = c39921tG.A0A.Af2();
                C42131x3 c42131x32 = new C42131x3(Af2.A03, Af2.A01);
                c39921tG.A03 = c42131x32;
                return c42131x32;
            }
            return c42131x3;
        }
        C42131x3 c42131x33 = c39921tG.A04;
        if (c42131x33 != null) {
            return c42131x33;
        }
        C39111rk B7t = c39921tG.A0A.B7t();
        C42131x3 c42131x34 = new C42131x3(B7t.A03, B7t.A01);
        c39921tG.A04 = c42131x34;
        return c42131x34;
    }
}
