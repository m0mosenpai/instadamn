package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FAy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34304FAy {
    public static final C1ON A00(UserSession userSession, Integer num, String str, String str2) {
        AbstractC167027dH.A12(userSession, str, num);
        C14360o3.A0B(str2, 3);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        AbstractC31173DnH.A1Q(A0M, "third_party_sharing/%s/get_location_to_share_url/", new Object[]{str});
        A0M.A0C = "create_location_share_url";
        FXG.A01(A0M, userSession, num, str2);
        A0M.A0H("qe_universe_name", AbstractC35242Fgb.A03(userSession));
        return AbstractC25227BEk.A0e(A0M, C32178EBz.class, FX7.class);
    }
}
