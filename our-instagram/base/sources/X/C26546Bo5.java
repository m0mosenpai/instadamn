package X;

/* renamed from: X.Bo5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26546Bo5 extends AbstractC51572Yf {
    public final long A00;
    public final long A01;
    public final boolean A02;

    public static final InterfaceC30790DgR A03(C2Z1 c2z1, C26546Bo5 c26546Bo5) {
        if (c26546Bo5.A02) {
            long j = c26546Bo5.A01;
            return new C26105Bgp(CXD.A00(AbstractC25228BEl.A0A(c2z1, j) / 2.0f, AbstractC25228BEl.A0A(c2z1, c26546Bo5.A00) / 2.0f), AbstractC25228BEl.A0A(c2z1, j) / 2.0f);
        }
        return new C26106Bgq(AbstractC13880nE.A00(AbstractC25229BEm.A0M(c2z1), 14.0f), CXD.A00(0.0f, 0.0f), CCR.A00(AbstractC25228BEl.A0A(c2z1, c26546Bo5.A01), AbstractC25228BEl.A0A(c2z1, c26546Bo5.A00)));
    }

    public C26546Bo5(long j, long j2, boolean z) {
        this.A01 = j;
        this.A00 = j2;
        this.A02 = z;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        C51722Yv A15 = AbstractC25232BEp.A15(C9CU.A00(C9CU.A00(null, C05F.A00, A1Z ? 1 : 0, this.A01), C05F.A01, A1Z ? 1 : 0, this.A00), C05F.A0Y, EnumC77933eL.ABSOLUTE);
        long A0D = AbstractC25229BEm.A0D();
        return new C26607Bp4(C9CU.A00(C9CU.A00(A15, C05F.A0C, 1, A0D), C05F.A0N, 1, A0D), new BAO(9, c76223bS, this));
    }
}
