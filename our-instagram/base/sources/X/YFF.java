package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes12.dex */
public final class YFF implements InterfaceC80653iu {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C41551w4 A02;
    public final /* synthetic */ C141596ac A03;
    public final /* synthetic */ InterfaceC144586fe A04;

    @Override // X.InterfaceC80653iu
    public final void DPX(C73083Pj c73083Pj) {
        C14360o3.A0B(c73083Pj, 0);
        C41181vS c41181vS = this.A01;
        if (c41181vS.A1c()) {
            String str = c73083Pj.A03;
            c41181vS.A0f(str);
            AbstractC140696Xx.A00(this.A00).A0E(this.A02, str);
        }
        AbstractC140696Xx.A00(this.A00).A0D(c41181vS, false);
        C141596ac c141596ac = this.A03;
        c141596ac.A0l = true;
        this.A04.E15(c41181vS, c141596ac, true);
    }

    public YFF(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, InterfaceC144586fe interfaceC144586fe) {
        this.A01 = c41181vS;
        this.A00 = userSession;
        this.A02 = c41551w4;
        this.A03 = c141596ac;
        this.A04 = interfaceC144586fe;
    }

    @Override // X.InterfaceC80653iu
    public final void DFp() {
        C140706Xy A00 = AbstractC140696Xx.A00(this.A00);
        C41181vS c41181vS = this.A01;
        A00.A08(c41181vS);
        C141596ac c141596ac = this.A03;
        c141596ac.A0l = false;
        this.A04.E15(c41181vS, c141596ac, false);
    }
}
