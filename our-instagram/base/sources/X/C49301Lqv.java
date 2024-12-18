package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.Lqv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49301Lqv implements MQ4 {
    public final C41761wQ A00 = AbstractC31174DnI.A0S();
    public final UserSession A01;

    @Override // X.MQ4
    public final void EOO(L4I l4i) {
        C14360o3.A0B(l4i, 0);
        Object obj = l4i.A02;
        C14360o3.A0C(obj, AbstractC111324zv.A00(49));
        C38321qM c38321qM = (C38321qM) obj;
        UserSession userSession = this.A01;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            ImageUrl Bhu = A2E.Bhu();
            InterfaceC83713oG A01 = l4i.A00.A01();
            String str = l4i.A03;
            int A08 = LLU.A00.A08(userSession, c38321qM);
            String str2 = l4i.A04;
            C41761wQ c41761wQ = this.A00;
            C14360o3.A0B(c41761wQ, 10);
            AbstractC166987dD.A1Z(new MBD(c41761wQ, userSession, Bhu, c38321qM, A01, A2E, "IgtvXmaShareSender", str, str2, null, 1009, A08, 1), AbstractC167017dG.A0w(C12L.A00, 47));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.MQ4
    public final void EOH(C47669L3c c47669L3c) {
        throw AbstractC166987dD.A1D("sendReply for reels share not supported");
    }

    public C49301Lqv(UserSession userSession) {
        this.A01 = userSession;
    }
}
