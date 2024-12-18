package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FA5 {
    public static final C1ON A00(UserSession userSession, FHT fht) {
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("accounts/get_presence_disabled/");
        C1ON A0J = AbstractC31178DnM.A0J(A0M, ECZ.class, FWT.class);
        A0J.A00 = new EE9(userSession, fht, 9);
        return A0J;
    }
}
