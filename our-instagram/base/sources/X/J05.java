package X;

/* loaded from: classes7.dex */
public final class J05 implements InterfaceC31041Dkf {
    public final /* synthetic */ C39489HcH A00;

    @Override // X.InterfaceC31041Dkf
    public final void Cwd() {
    }

    @Override // X.InterfaceC31041Dkf
    public final void Cwe() {
    }

    public J05(C39489HcH c39489HcH) {
        this.A00 = c39489HcH;
    }

    @Override // X.InterfaceC31041Dkf
    public final void DPV() {
        C37644Ghd c37644Ghd;
        C39489HcH c39489HcH = this.A00;
        C120985dq c120985dq = ((AbstractC38244Grn) c39489HcH).A00;
        if (c120985dq != null && (c37644Ghd = ((AbstractC38244Grn) c39489HcH).A01) != null) {
            AbstractC37677GiE.A00(c120985dq, c37644Ghd, ((AbstractC38244Grn) c39489HcH).A03);
        }
        JIL jil = ((AbstractC38244Grn) c39489HcH).A02;
        if (jil != null && !jil.isPlaying()) {
            c39489HcH.EKg("resume", false);
        }
    }
}
