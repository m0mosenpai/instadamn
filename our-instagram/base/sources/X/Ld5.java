package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.comments.DirectMessageComments;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Map;

/* loaded from: classes8.dex */
public final class Ld5 implements InterfaceC13000lm {
    public DirectThreadKey A00;
    public final Map A01;
    public final UserSession A02;
    public final C2DS A03;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00 = null;
        this.A01.clear();
        this.A02.A03(Ld5.class);
    }

    public Ld5(UserSession userSession, C2DS c2ds) {
        AbstractC167017dG.A1P(userSession, c2ds);
        this.A01 = AbstractC166987dD.A1I();
        this.A02 = userSession;
        this.A03 = c2ds;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.instagram.direct.model.comments.DirectMessageComments] */
    public final void A00(MessageIdentifier messageIdentifier, String str, int i) {
        C2DS c2ds;
        C83403nh BSh;
        AbstractC167017dG.A1O(messageIdentifier, str);
        DirectThreadKey directThreadKey = this.A00;
        if (directThreadKey != null && (BSh = (c2ds = this.A03).BSh(directThreadKey, messageIdentifier.A01)) != null) {
            C83693oE c83693oE = null;
            C83403nh c83403nh = new C83403nh();
            UserSession userSession = this.A02;
            C83693oE A00 = AbstractC83823oR.A00(directThreadKey);
            if (A00 != null) {
                c83693oE = AbstractC1345466e.A02(A00);
            }
            c83403nh.A11(userSession, BSh, c83693oE);
            ?? obj = new Object();
            obj.A00 = i;
            obj.A01 = str;
            c83403nh.A0q = obj;
            DirectMessageComments directMessageComments = BSh.A0q;
            if (directMessageComments != null && i == directMessageComments.A00) {
                return;
            }
            C2DU c2du = (C2DU) c2ds;
            synchronized (c2du) {
                c2du.A9l(c83403nh, directThreadKey, true);
            }
        }
    }
}
