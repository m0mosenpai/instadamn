package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes12.dex */
public final class YFG implements InterfaceC80653iu {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C41181vS A03;
    public final /* synthetic */ C141596ac A04;
    public final /* synthetic */ C38080Gp9 A05;
    public final /* synthetic */ InterfaceC144936gD A06;

    @Override // X.InterfaceC80653iu
    public final void DPX(C73083Pj c73083Pj) {
        C41551w4 c41551w4;
        C14360o3.A0B(c73083Pj, 0);
        C41181vS c41181vS = this.A03;
        if (c41181vS.A1c() && (c41551w4 = this.A05.A07) != null) {
            AbstractC140696Xx.A00(this.A01).A0E(c41551w4, c73083Pj.A03);
        }
        UserSession userSession = this.A01;
        AbstractC140696Xx.A00(userSession).A0D(c41181vS, false);
        AbstractC141686al.A02(this.A00, userSession, this.A02);
        C141596ac c141596ac = this.A04;
        c141596ac.A0l = true;
        this.A06.E15(c41181vS, c141596ac, true);
    }

    public YFG(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, C41181vS c41181vS, C141596ac c141596ac, C38080Gp9 c38080Gp9, InterfaceC144936gD interfaceC144936gD) {
        this.A03 = c41181vS;
        this.A05 = c38080Gp9;
        this.A01 = userSession;
        this.A02 = c38321qM;
        this.A00 = interfaceC11380iw;
        this.A04 = c141596ac;
        this.A06 = interfaceC144936gD;
    }

    @Override // X.InterfaceC80653iu
    public final void DFp() {
        C141596ac c141596ac = this.A04;
        c141596ac.A0l = false;
        InterfaceC144936gD interfaceC144936gD = this.A06;
        C41181vS c41181vS = this.A03;
        interfaceC144936gD.E15(c41181vS, c141596ac, false);
        UserSession userSession = this.A01;
        AbstractC140696Xx.A00(userSession).A08(c41181vS);
        AbstractC141686al.A01(this.A00, userSession, this.A02);
    }
}
