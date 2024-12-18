package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public abstract class I6B {
    public static final void A00(UserSession userSession, InterfaceC58290Psi interfaceC58290Psi, IFE ife, JHN jhn, C39352HZr c39352HZr) {
        C14360o3.A0B(ife, 2);
        User A2E = c39352HZr.A00.A2E(userSession);
        if (A2E != null) {
            I69.A00(ViewOnClickListenerC38053Gog.A02(jhn, c39352HZr, 2), new ViewOnClickListenerC42029Ijy(28, jhn, c39352HZr, interfaceC58290Psi), ife, A2E.getUsername(), 2131965092);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
