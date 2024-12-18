package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hjp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39719Hjp {
    public static final C1ON A00(UserSession userSession, String str) {
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        A0q.A05();
        A0q.A0B("ads/ads_history/");
        A0q.A9s("ig_user_id", userSession.userId);
        A0q.A9s("page_type", "94");
        A0q.A0H("next_max_id", str);
        C14360o3.A0B("last_item_timestamp", 0);
        A0q.A02 = new C25591Mp(new C07510aQ(userSession), new C25611Mr(null), INW.class, false);
        return A0q.A0N();
    }
}
