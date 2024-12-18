package X;

import java.util.List;

/* renamed from: X.OzR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56306OzR implements InterfaceC58037PoN {
    public final /* synthetic */ C128175qm A00;
    public final /* synthetic */ InterfaceC50452MPg A01;
    public final /* synthetic */ OVo A02;

    public C56306OzR(C128175qm c128175qm, InterfaceC50452MPg interfaceC50452MPg, OVo oVo) {
        this.A02 = oVo;
        this.A00 = c128175qm;
        this.A01 = interfaceC50452MPg;
    }

    @Override // X.InterfaceC58037PoN
    public final void DBn(List list) {
        OVo.A00(this.A00, this.A01, this.A02);
    }

    @Override // X.InterfaceC58037PoN
    public final void DBo() {
        OVo oVo = this.A02;
        C128175qm c128175qm = this.A00;
        InterfaceC50452MPg interfaceC50452MPg = this.A01;
        oVo.A01 = true;
        oVo.A00 = "";
        OVo.A00(c128175qm, interfaceC50452MPg, oVo);
    }
}
