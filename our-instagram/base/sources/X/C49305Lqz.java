package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaStoryReply$1;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.Lqz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49305Lqz implements MQ4 {
    public final UserSession A00;
    public final C41761wQ A01 = AbstractC31174DnI.A0S();

    @Override // X.MQ4
    public final void EOH(C47669L3c c47669L3c) {
        int i;
        C14360o3.A0B(c47669L3c, 0);
        Object obj = c47669L3c.A02;
        C14360o3.A0C(obj, AbstractC111324zv.A00(486));
        C7QR c7qr = (C7QR) obj;
        C38321qM c38321qM = c7qr.A02;
        if (c38321qM != null) {
            UserSession userSession = this.A00;
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                int A00 = LLU.A00(c38321qM.BRN());
                C45001Jvr c45001Jvr = c47669L3c.A00;
                String str = c45001Jvr.A0H;
                C7O9 c7o9 = c7qr.A01;
                C7O9 c7o92 = C7O9.EMOJI_REACTION;
                if ((c7o9 == c7o92 || c7o9 == C7O9.AVATAR_REACTION) && c38321qM.A0C.B3E() == null) {
                    i = 1016;
                } else {
                    C7O9 c7o93 = c7qr.A01;
                    if (c7o93 != c7o92 && c7o93 != C7O9.AVATAR_REACTION) {
                        i = 1002;
                        if (c38321qM.A0C.B3E() == null) {
                            i = 1015;
                        }
                    } else {
                        i = 1008;
                    }
                }
                InterfaceC83713oG A01 = c45001Jvr.A01.A01();
                Object obj2 = c47669L3c.A03;
                AbstractC25225BEi.A1S(obj2);
                String str2 = (String) obj2;
                String str3 = c45001Jvr.A07;
                ExtendedImageUrl extendedImageUrl = c45001Jvr.A03;
                Long l = c45001Jvr.A06;
                if (l != null) {
                    long longValue = l.longValue();
                    String str4 = c47669L3c.A04;
                    C41761wQ c41761wQ = this.A01;
                    C49309Lr3 c49309Lr3 = new C49309Lr3(this, c45001Jvr);
                    AbstractC167007dF.A1I(str2, 2, str);
                    C14360o3.A0B(c41761wQ, 13);
                    AbstractC166987dD.A1Z(new XmaShareSenderHelper$sendXmaStoryReply$1(c41761wQ, userSession, c49309Lr3, c38321qM, A01, extendedImageUrl, A2E, "StoryReplySender", str3, str, str4, str2, null, i, A00, longValue), AbstractC167017dG.A0w(C12L.A00, 47));
                    return;
                }
                throw AbstractC166987dD.A14("Failed to get sender EIMU");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.MQ4
    public final void EOO(L4I l4i) {
        throw AbstractC166987dD.A1D("send share for story reply with text not supported");
    }

    public C49305Lqz(UserSession userSession) {
        this.A00 = userSession;
    }
}
