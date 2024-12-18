package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Bv3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26962Bv3 extends C1P1 {
    public final /* synthetic */ C692639m A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C75113Zb A02;

    public C26962Bv3(C692639m c692639m, C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A00 = c692639m;
        this.A01 = c38321qM;
        this.A02 = c75113Zb;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1111405215);
        UserSession userSession = this.A00.A02;
        User A2E = this.A01.A2E(userSession);
        if (A2E != null) {
            C25531Mh c25531Mh = new C25531Mh(AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "unfollow_failed"), 385);
            c25531Mh.A0R("target_id", A2E.getId());
            c25531Mh.A0m(C26771Rh.A00().A00);
            c25531Mh.Cht();
            C0f9.A0A(58973656, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(-1902660557, A03);
        throw A0g;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-165455304);
        int A032 = C0f9.A03(1536557037);
        C692639m c692639m = this.A00;
        InterfaceC690038m BDf = c692639m.A03.BDf();
        C38321qM c38321qM = this.A01;
        BDf.DKd(null, c38321qM, EnumC75193Zm.A0E, this.A02);
        UserSession userSession = c692639m.A02;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            C25531Mh c25531Mh = new C25531Mh(AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "unfollow_successful"), 386);
            c25531Mh.A0R("target_id", A2E.getId());
            c25531Mh.A0m(C26771Rh.A00().A00);
            c25531Mh.Cht();
            C0f9.A0A(1575623718, A032);
            C0f9.A0A(-1942162546, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(1230408063, A032);
        throw A0g;
    }
}
