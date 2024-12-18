package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.HKn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39134HKn extends HGS {
    @Override // X.HGS, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1863685568);
        AbstractC53862Nrq.A00(this.A00, abstractC115105If, 2131971625);
        C0f9.A0A(-1080325180, A03);
    }

    @Override // X.HGS, X.C1P1
    public final void onSuccess(Object obj) {
        int A03 = C0f9.A03(-118001082);
        C38321qM c38321qM = this.A02;
        c38321qM.A00 = 0;
        c38321qM.A4L(C05F.A01);
        UserSession userSession = this.A01;
        c38321qM.AEH(userSession);
        User A2E = c38321qM.A2E(userSession);
        A2E.getClass();
        A2E.A0X();
        A2E.A0c(userSession);
        C0f9.A0A(-1407534451, A03);
    }
}
