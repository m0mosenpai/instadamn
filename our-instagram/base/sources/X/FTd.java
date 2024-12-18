package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FTd {
    public static final void A01(UserSession userSession, String str, String str2, String str3, boolean z) {
        String str4;
        C14360o3.A0B(userSession, 0);
        if (z) {
            str4 = "stories/private_stories/add_member/";
        } else {
            str4 = "stories/private_stories/remove_member/";
        }
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0E = str4;
        AbstractC31171DnF.A1J(A0c, str3);
        A0c.A9s("module", str);
        C1GJ.A03(AbstractC31178DnM.A0K(A0c, CacheBehaviorLogger.SOURCE, str2));
    }

    public static final C1ON A00(UserSession userSession, Integer num, String str, boolean z, boolean z2) {
        C25621Ms A0D = AbstractC31179DnN.A0D(userSession);
        A0D.A0B("stories/private_stories/members/");
        A0D.A0I("is_list_creation", z);
        A0D.A0H("suggested_users_max_id", str);
        A0D.A0A(num, "page_size");
        A0D.A0I("pagination_enabled", z2);
        return AbstractC25227BEk.A0e(A0D, C32204ECz.class, FTb.class);
    }
}
