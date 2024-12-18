package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaPostShare$1;
import com.instagram.user.model.User;

/* renamed from: X.Lqw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49302Lqw implements MQ4 {
    public final C41761wQ A00 = AbstractC31174DnI.A0S();
    public final UserSession A01;

    @Override // X.MQ4
    public final void EOO(L4I l4i) {
        C38321qM c38321qM;
        int i;
        String str;
        C84923qg A1V;
        C14360o3.A0B(l4i, 0);
        Object obj = l4i.A02;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectMediaShare");
        C9CL c9cl = (C9CL) obj;
        C38321qM c38321qM2 = (C38321qM) c9cl.A00;
        String str2 = c9cl.A02;
        if (!c38321qM2.A5M() || str2 == null || ((c38321qM = c38321qM2.A1h(str2)) == null && (c38321qM = c38321qM2.A1e(0)) == null)) {
            c38321qM = c38321qM2;
        }
        UserSession userSession = this.A01;
        User A2E = c38321qM2.A2E(userSession);
        if (A2E != null) {
            ImageUrl Bhu = A2E.Bhu();
            int A08 = LLU.A00.A08(userSession, c38321qM2);
            if (c38321qM2.A5M()) {
                i = 1001;
            } else if (c38321qM2.A5x()) {
                i = 1000;
            } else if (c38321qM2.Cff()) {
                i = 1006;
            } else {
                throw AbstractC166987dD.A14("Unknown media type");
            }
            InterfaceC83713oG A01 = l4i.A00.A01();
            String str3 = l4i.A03;
            String str4 = l4i.A04;
            C41761wQ c41761wQ = this.A00;
            C14360o3.A0B(c41761wQ, 12);
            C19K A0w = AbstractC167017dG.A0w(C12L.A00, 47);
            if (A08 != 1 && (A1V = c38321qM2.A1V()) != null) {
                str = A1V.A0e;
            } else {
                str = null;
            }
            AbstractC166987dD.A1Z(new XmaShareSenderHelper$sendXmaPostShare$1(c41761wQ, userSession, Bhu, c38321qM, c38321qM2, A01, A2E, "MediaXmaShareSender", str3, str2, str, str4, null, i, A08), A0w);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.MQ4
    public final void EOH(C47669L3c c47669L3c) {
        throw AbstractC166987dD.A1D("sendReply for media share not supported");
    }

    public C49302Lqw(UserSession userSession) {
        this.A01 = userSession;
    }
}
