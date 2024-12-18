package X;

/* renamed from: X.Itj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42626Itj implements JPZ {
    public final InterfaceC686136y A00;
    public final C81053ja A01;

    public C42626Itj(InterfaceC686136y interfaceC686136y, C81053ja c81053ja) {
        C14360o3.A0B(c81053ja, 2);
        this.A00 = interfaceC686136y;
        this.A01 = c81053ja;
    }

    @Override // X.JPZ
    public final void Dmi(C38321qM c38321qM, C37905Gm2 c37905Gm2, C41157IJw c41157IJw, C75113Zb c75113Zb, int i) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A01.A00(c41157IJw.A06, c38321qM, c37905Gm2, null, c75113Zb, null, i);
    }

    @Override // X.AnonymousClass370
    public final JG7 BQm() {
        return this.A00.BQm();
    }

    @Override // X.JPZ
    public final void DBX(C38321qM c38321qM, C37905Gm2 c37905Gm2, C41157IJw c41157IJw, C75113Zb c75113Zb, int i) {
        if (c41157IJw.A03.getIgImageView().A0G()) {
            this.A01.A01(c41157IJw.A06, c38321qM, c37905Gm2, c75113Zb, i);
        }
    }
}
