package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class VRS {
    public static final C1ON A00(UserSession userSession, String str, String str2, int i, int i2) {
        C14360o3.A0B(userSession, 0);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("ads/ads_manager/fetch_promotions_v2/");
        A0c.A9s("ads_manager_section", str);
        A0c.A0D("count", i);
        A0c.A0D("cursor", i2);
        A0c.A0D("include_split_tests", 1);
        A0c.A0H("fb_auth_token", str2);
        A0c.A0R(C67839UzC.class, C69897VxO.class);
        return A0c.A0N();
    }
}
