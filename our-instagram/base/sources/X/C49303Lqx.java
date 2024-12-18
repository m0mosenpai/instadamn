package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaProfileShare$1;
import com.instagram.user.model.User;

/* renamed from: X.Lqx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49303Lqx implements MQ4 {
    public final C41761wQ A00 = AbstractC31174DnI.A0S();
    public final UserSession A01;

    @Override // X.MQ4
    public final void EOO(L4I l4i) {
        C14360o3.A0B(l4i, 0);
        Object obj = l4i.A02;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.user.model.User");
        User user = (User) obj;
        ImageUrl Bhu = user.Bhu();
        String str = l4i.A04;
        UserSession userSession = this.A01;
        InterfaceC83713oG A01 = l4i.A00.A01();
        C41761wQ c41761wQ = this.A00;
        C14360o3.A0B(c41761wQ, 5);
        AbstractC166987dD.A1Z(new XmaShareSenderHelper$sendXmaProfileShare$1(c41761wQ, userSession, Bhu, A01, user, "ProfileXmaShareSender", str, null), AbstractC43593JPy.A17(C12L.A00, 47, 3));
    }

    @Override // X.MQ4
    public final void EOH(C47669L3c c47669L3c) {
        throw AbstractC166987dD.A1D("sendReply for profile share not supported");
    }

    public C49303Lqx(UserSession userSession) {
        this.A01 = userSession;
    }
}
