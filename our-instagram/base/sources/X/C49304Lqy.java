package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaStoryMention$1;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* renamed from: X.Lqy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49304Lqy implements MQ4 {
    public final C41761wQ A00 = AbstractC31174DnI.A0S();
    public final UserSession A01;

    @Override // X.MQ4
    public final void EOO(L4I l4i) {
        C14360o3.A0B(l4i, 0);
        Object obj = l4i.A02;
        C14360o3.A0C(obj, AbstractC111324zv.A00(486));
        C7QR c7qr = (C7QR) obj;
        C38321qM c38321qM = c7qr.A02;
        C14360o3.A07(c38321qM);
        UserSession userSession = this.A01;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            DirectShareTarget directShareTarget = l4i.A00;
            String A0A = directShareTarget.A0A();
            if (A0A != null) {
                boolean z = !AbstractC166997dE.A1Z(c38321qM.A0C.BSN(), false);
                User BAR = c38321qM.A0C.BAR();
                String str = l4i.A04;
                int i = 1014;
                if (c38321qM.A5x()) {
                    i = 1004;
                }
                String str2 = c7qr.A08;
                if (str2 == null) {
                    str2 = A2E.getId();
                }
                String str3 = c7qr.A09;
                C14360o3.A07(str3);
                InterfaceC83713oG A01 = directShareTarget.A01();
                C41761wQ c41761wQ = this.A00;
                AbstractC25229BEm.A1M(str2, 4, c41761wQ);
                AbstractC166987dD.A1Z(new XmaShareSenderHelper$sendXmaStoryMention$1(c41761wQ, userSession, c38321qM, A01, A2E, BAR, "StoryMentionSender", A0A, str2, str3, str, null, i, 0, z), AbstractC43593JPy.A17(C12L.A00, 47, 3));
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.MQ4
    public final void EOH(C47669L3c c47669L3c) {
        throw AbstractC166987dD.A1D("send story mentions not supported");
    }

    public C49304Lqy(UserSession userSession) {
        this.A01 = userSession;
    }
}
