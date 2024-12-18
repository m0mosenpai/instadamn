package X;

/* renamed from: X.OIv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54781OIv {
    public InterfaceC16620sF A00;
    public final N82 A01;
    public final C63702ur A02;
    public final InterfaceC09390do A03;

    public C54781OIv(N82 n82, C63702ur c63702ur) {
        C14360o3.A0B(c63702ur, 2);
        this.A01 = n82;
        this.A02 = c63702ur;
        this.A03 = C1XM.A00(C57388Pdm.A00);
    }

    public final void A00(C47P c47p, int i) {
        C14360o3.A0B(c47p, 0);
        String id = c47p.getId();
        C63702ur c63702ur = this.A02;
        C6PG c6pg = new C6PG("fullscreen", id, c63702ur.A02);
        c6pg.A00 = i;
        c6pg.A04 = c47p.getAlgorithm();
        String CEI = c47p.CEI();
        if (CEI != null) {
            c6pg.A07 = CEI;
        }
        c6pg.A0B = c47p.ByJ();
        c6pg.A0C = c47p.C9e();
        c63702ur.A07(new C6PH(c6pg));
        N82 n82 = this.A01;
        C1GJ.A03(FY5.A01(n82.A00, c47p.CDj().getId(), c47p.CEI(), c47p.getAlgorithm()));
        AbstractC166987dD.A1Z(new PZU(n82, c47p, (InterfaceC23621Ds) null, 1), n82.A03());
    }
}
