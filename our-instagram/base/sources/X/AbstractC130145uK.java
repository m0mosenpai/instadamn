package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5uK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC130145uK {
    public static final void A02(UserSession userSession, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(userSession, 1);
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, "ig_fb_feed_xpost_audience");
        if (A00.isSampled()) {
            A00.AAP("action_name", str);
            A00.A7v("current_cross_posting_setting", Boolean.valueOf(z2));
            A00.AAP("default_audience_entry_point", str4);
            A00.AAP("default_audience", str3);
            A00.AAP("instagram_user_id", userSession.userId);
            A00.AAP("default_privacy_migration_phase", str2);
            A00.A7v("has_opt_in_default_audience_migration", Boolean.valueOf(z));
            A00.A7v("is_old_crossposter", Boolean.valueOf(z3));
            A00.AAP("audience_cohort", str5);
            A00.Cht();
        }
    }

    public static final void A00(UserSession userSession) {
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, "ig_fb_feed_xpost_audience");
        if (A00.isSampled()) {
            A00.AAP("action_name", "default_privacy_info_fetch_failure");
            A00.AAP("instagram_user_id", userSession.userId);
            A00.Cht();
        }
    }

    public static final void A01(UserSession userSession, Boolean bool, String str) {
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, "ig_fb_feed_xpost_audience");
        if (A00.isSampled()) {
            A00.AAP("action_name", "default_privacy_info_fetch_success");
            A00.AAP("instagram_user_id", userSession.userId);
            A00.A9K("audience_setting", null);
            A00.AAP("default_audience", str);
            A00.A7v("has_opt_in_default_audience_migration", bool);
            A00.Cht();
        }
    }
}
