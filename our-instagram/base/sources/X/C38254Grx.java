package X;

/* renamed from: X.Grx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38254Grx implements InterfaceC31041Dkf {
    public final /* synthetic */ C38253Grw A00;

    @Override // X.InterfaceC31041Dkf
    public final void DPV() {
        C38253Grw c38253Grw = this.A00;
        C37644Ghd c37644Ghd = ((AbstractC38244Grn) c38253Grw).A01;
        C120985dq c120985dq = ((AbstractC38244Grn) c38253Grw).A00;
        if (c37644Ghd != null && c120985dq != null) {
            AbstractC37677GiE.A00(c120985dq, c37644Ghd, ((AbstractC38244Grn) c38253Grw).A03);
        }
        JIL jil = ((AbstractC38244Grn) c38253Grw).A02;
        if (jil != null && !jil.isPlaying() && c38253Grw.A00 == C3Q0.PREPARING) {
            c38253Grw.EKg("resume", false);
        }
    }

    public C38254Grx(C38253Grw c38253Grw) {
        this.A00 = c38253Grw;
    }

    @Override // X.InterfaceC31041Dkf
    public final void Cwd() {
        C38253Grw.A00(this.A00);
    }

    @Override // X.InterfaceC31041Dkf
    public final void Cwe() {
        C38253Grw.A00(this.A00);
    }
}
