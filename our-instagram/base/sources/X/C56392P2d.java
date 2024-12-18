package X;

/* renamed from: X.P2d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56392P2d implements InterfaceC80653iu {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C141596ac A01;
    public final /* synthetic */ InterfaceC145476h6 A02;

    public C56392P2d(C41181vS c41181vS, C141596ac c141596ac, InterfaceC145476h6 interfaceC145476h6) {
        this.A01 = c141596ac;
        this.A02 = interfaceC145476h6;
        this.A00 = c41181vS;
    }

    @Override // X.InterfaceC80653iu
    public final void DFp() {
        C141596ac c141596ac = this.A01;
        c141596ac.A0l = false;
        this.A02.E15(this.A00, c141596ac, false);
    }

    @Override // X.InterfaceC80653iu
    public final void DPX(C73083Pj c73083Pj) {
        C141596ac c141596ac = this.A01;
        c141596ac.A0l = true;
        this.A02.E15(this.A00, c141596ac, true);
    }
}
