package X;

/* renamed from: X.Oyd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56268Oyd implements InterfaceC58033PoJ {
    public final /* synthetic */ C128175qm A00;
    public final /* synthetic */ InterfaceC50452MPg A01;
    public final /* synthetic */ OVo A02;

    @Override // X.InterfaceC58033PoJ
    public final void DUI(String str) {
        C14360o3.A0B(str, 0);
        OVo oVo = this.A02;
        C128175qm c128175qm = this.A00;
        InterfaceC50452MPg interfaceC50452MPg = this.A01;
        oVo.A01 = true;
        oVo.A00 = str;
        OVo.A00(c128175qm, interfaceC50452MPg, oVo);
    }

    public C56268Oyd(C128175qm c128175qm, InterfaceC50452MPg interfaceC50452MPg, OVo oVo) {
        this.A02 = oVo;
        this.A00 = c128175qm;
        this.A01 = interfaceC50452MPg;
    }

    @Override // X.InterfaceC58033PoJ
    public final void DUJ() {
        OVo.A00(this.A00, this.A01, this.A02);
    }
}
