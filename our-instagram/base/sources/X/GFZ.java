package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;
import java.util.Collection;

/* loaded from: classes6.dex */
public final class GFZ implements InterfaceC169467hM {
    public Boolean A00;
    public String A01;
    public final C65974TxR A02;
    public final InterfaceC19390xP A03;
    public final C05A A04;
    public final InterfaceC15070pN A05;
    public final C0UO A06;
    public final UserSession A07;
    public final FanClubApi A08;
    public final InterfaceC169497hP A09;
    public final InterfaceC06180Ui A0A;
    public final C05A A0B;

    public GFZ(UserSession userSession) {
        this.A07 = userSession;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A04 = A0o;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 0, 0);
        this.A0A = A00;
        C008002u A1H = AbstractC25225BEi.A1H(0);
        this.A0B = A1H;
        this.A06 = AbstractC208910l.A02(A0o);
        this.A05 = new C06160Ug(null, A00);
        this.A03 = new M9S(A1H, 9);
        this.A01 = "";
        C169487hO c169487hO = new C169487hO();
        this.A09 = c169487hO;
        this.A02 = AbstractC65980TxZ.A00(userSession, null, this, null, c169487hO, num, 0L, 200L, true, true);
        this.A08 = new FanClubApi(userSession);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C1ON AN6(UQE uqe, String str) {
        return A2K.A00(uqe, this, str);
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        C14360o3.A0B(str, 0);
        C25621Ms A0M = AbstractC31177DnL.A0M(this.A07);
        A0M.A0B("fan_club/members/");
        A0M.A0R(C32213EDm.class, FVG.class);
        if (str2 != null) {
            A0M.A9s("max_id", str2);
        }
        C1ON A0T = AbstractC31172DnG.A0T(A0M, "query", str);
        C14360o3.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubMembersResponse>, com.instagram.api.response.IgResponse>");
        C14360o3.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.fanclub.api.FanClubMembersResponse, com.instagram.api.response.IgResponse>");
        return A0T;
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ boolean Cdt() {
        return false;
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfn(UQE uqe) {
        C9QE.A02(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dfo(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfq(UQE uqe, AbstractC115105If abstractC115105If) {
        C9QE.A01(uqe, abstractC115105If, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dg0(UQE uqe) {
        C9QE.A03(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgG(UQE uqe) {
        C9QE.A04(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgO(UQE uqe, InterfaceC40821up interfaceC40821up) {
        C9QE.A00(uqe, interfaceC40821up, this);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ void DpU(boolean z) {
    }

    @Override // X.InterfaceC169457hL
    public final void Dft(AbstractC115105If abstractC115105If, String str) {
        this.A0A.F8m(C0eB.A00);
    }

    @Override // X.InterfaceC169457hL
    public final void Dg3(String str) {
        this.A0B.Egh(Integer.valueOf(AbstractC166987dD.A0H(r1.getValue()) - 1));
    }

    @Override // X.InterfaceC169457hL
    public final void DgJ(String str) {
        C05A c05a = this.A0B;
        c05a.Egh(Integer.valueOf(AbstractC166987dD.A0H(c05a.getValue()) + 1));
    }

    @Override // X.InterfaceC169457hL
    public final /* bridge */ /* synthetic */ void DgS(InterfaceC40821up interfaceC40821up, String str) {
        C32213EDm c32213EDm = (C32213EDm) interfaceC40821up;
        C14360o3.A0B(c32213EDm, 1);
        Iterable iterable = c32213EDm.A03;
        if (iterable == null) {
            iterable = C16930sl.A00;
        }
        C05A c05a = this.A04;
        c05a.Egh(AbstractC001800i.A0S(AbstractC001800i.A0e(iterable, AbstractC001800i.A0k(AbstractC31172DnG.A0w(c05a))), (Collection) c05a.getValue()));
        this.A00 = c32213EDm.A00;
    }

    @Override // X.InterfaceC169467hM
    public final C1GL BqZ() {
        return C1GJ.A01();
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }
}
