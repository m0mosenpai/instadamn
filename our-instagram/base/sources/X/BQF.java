package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BQF extends AbstractC51572Yf {
    public final int A00;
    public final ClipsViewerConfig A01;
    public final C120985dq A02;
    public final C25437BNc A03;
    public final C37644Ghd A04;
    public final UserSession A05;
    public final C38321qM A06;
    public final C75113Zb A07;
    public final InterfaceC31137Dmc A08;
    public final String A09;
    public final String A0A;

    public BQF(ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C25437BNc c25437BNc, C37644Ghd c37644Ghd, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, InterfaceC31137Dmc interfaceC31137Dmc, String str, String str2, int i) {
        C14360o3.A0B(c25437BNc, 1);
        AbstractC25234BEr.A1R(c38321qM, c75113Zb, userSession, str, clipsViewerConfig);
        AbstractC25233BEq.A0y(7, c120985dq, c37644Ghd, interfaceC31137Dmc);
        C14360o3.A0B(str2, 11);
        this.A03 = c25437BNc;
        this.A06 = c38321qM;
        this.A07 = c75113Zb;
        this.A05 = userSession;
        this.A09 = str;
        this.A01 = clipsViewerConfig;
        this.A02 = c120985dq;
        this.A04 = c37644Ghd;
        this.A08 = interfaceC31137Dmc;
        this.A00 = i;
        this.A0A = str2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C75933ay c75933ay = C51722Yv.A02;
        C2XE c2xe = c76223bS.A05;
        C51722Yv A0a = AbstractC25233BEq.A0a(AbstractC171007jr.A00(AbstractC25225BEi.A0h(null, new C76933cf(c2xe, EnumC76913cd.GLOBAL, this.A0A)), 1.0f), C05F.A0C, 0.0f);
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        C2XE c2xe2 = A0P.A00;
        C38321qM c38321qM = this.A06;
        C75113Zb c75113Zb = this.A07;
        UserSession userSession = this.A05;
        C25437BNc c25437BNc = this.A03;
        String str = this.A09;
        return AbstractC25227BEk.A0V(BQH.A00(c2xe2, this.A01, this.A02, c25437BNc, this.A04, userSession, c38321qM, c75113Zb, C57332k8.A0m.A00(AbstractC77363dM.A00(A0P), userSession), this.A08, str, this.A00), A0P, c76223bS, A0a);
    }
}
