package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.send.msys.sharesender.StoryXmaShareSender$sendShare$1;
import com.instagram.user.model.User;

/* renamed from: X.Lr0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49306Lr0 implements MQ4 {
    public final C41761wQ A00 = AbstractC31174DnI.A0S();
    public final UserSession A01;

    @Override // X.MQ4
    public final void EOO(L4I l4i) {
        C14360o3.A0B(l4i, 0);
        Object obj = l4i.A02;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectStoryShareMedia");
        C7QP c7qp = (C7QP) obj;
        C38321qM c38321qM = c7qp.A01;
        if (c38321qM != null) {
            int i = 1003;
            if (c38321qM.Cff()) {
                i = 1007;
            }
            UserSession userSession = this.A01;
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                String str = c7qp.A07;
                if (str == null) {
                    str = A2E.getId();
                }
                ImageUrl Bhu = A2E.Bhu();
                int A08 = LLU.A00.A08(userSession, c38321qM);
                AbstractC166987dD.A1Z(new StoryXmaShareSender$sendShare$1(Bhu, this, l4i, c38321qM, A2E, str, null, i, A08), AbstractC167017dG.A0w(C12L.A00, 47));
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.MQ4
    public final void EOH(C47669L3c c47669L3c) {
        throw AbstractC166987dD.A1D("sendReply for story share not supported");
    }

    public C49306Lr0(UserSession userSession) {
        this.A01 = userSession;
    }
}
