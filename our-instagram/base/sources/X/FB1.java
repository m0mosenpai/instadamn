package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FB1 {
    public static final C1ON A00(UserSession userSession, Integer num, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        AbstractC167017dG.A1P(str, num);
        C14360o3.A0B(str2, 3);
        if (AbstractC001900j.A0a(str, " ", false)) {
            return null;
        }
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        AbstractC31173DnH.A1Q(A0M, "third_party_sharing/%s/get_profile_to_share_url/", new Object[]{str});
        A0M.A0C = "create_profile_share_url";
        FXG.A01(A0M, userSession, num, str2);
        A0M.A0H("qe_universe_name", AbstractC35242Fgb.A03(userSession));
        return AbstractC31172DnG.A0R(null, A0M, EC1.class, FXA.class, false);
    }
}
