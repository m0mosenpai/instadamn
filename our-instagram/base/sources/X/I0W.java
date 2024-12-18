package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class I0W {
    public static final void A00(UserSession userSession, String str, String str2, int i) {
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("direct_v2/click_to_direct_ad_interaction_trigger/");
        AbstractC31173DnH.A1N(A0c);
        A0c.A9s("ad_id", str);
        A0c.A9s("should_enable_ctd_thread_landing", "true");
        A0c.A0D("thread_landing_experience_type", i);
        C1GJ.A03(AbstractC31172DnG.A0T(A0c, "encrypted_consumer_token", str2));
    }
}
