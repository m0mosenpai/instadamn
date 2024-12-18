package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dsx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31513Dsx implements CallerContextable {
    public static final String __redex_internal_original_name = "RecommendedUserApi";

    public static final C1ON A00(UserSession userSession, Integer num, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        String str7;
        C14360o3.A0B(userSession, 0);
        if (C14360o3.A0K(C1XV.A0n.toString(), str5)) {
            str7 = "discover/suggested_businesses/";
        } else {
            str7 = "discover/ayml/";
        }
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0E = str7;
        AbstractC31175DnJ.A1F(C19T.A2F, A0c, AbstractC31172DnG.A0P(userSession));
        A0c.A02 = new C25581Mo(new C07510aQ(userSession), C31527DtC.class);
        if (num != null) {
            A0c.A9s("max_number_to_display", num.toString());
        }
        A0c.A9s("module", str);
        if (z) {
            A0c.A9s("paginate", "true");
        }
        if (z2) {
            A0c.A9s("profile_chaining_check", "true");
        }
        if (str2 != null && str2.length() != 0) {
            A0c.A9s("max_id", str2);
        }
        if (str3 != null && str3.length() != 0) {
            A0c.A9s("forced_user_ids", str3);
        }
        if (str4 != null && str4.length() != 0) {
            A0c.A9s("ndid", str4);
        }
        if (str5 != null && str5.length() != 0) {
            A0c.A9s("entry_feed_item_type", str5);
        }
        if (str6 != null && str6.length() != 0) {
            A0c.A9s("surface", str6);
        }
        long j = 700;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36329260046172388L)) {
            j = C18U.A01(c06090Tz, userSession, 36610735022807240L);
        }
        A0c.A0A = AnonymousClass001.A0i(str7, str, str2, '_');
        A0c.A04();
        ((AbstractC23721Ec) A0c).A00 = j;
        return A0c.A0N();
    }

    public static final C1ON A01(UserSession userSession, String str, String str2, String str3, boolean z, boolean z2) {
        C25621Ms A0D = AbstractC31179DnN.A0D(userSession);
        A0D.A0B("discover/sectioned_ayml/");
        A0D.A0I("request_from_nux", z);
        A0D.A0I("show_mutual_contacts_section", z2);
        A0D.A0H("request_from_notif_type", str);
        A0D.A0H("forced_user_ids", str2);
        A0D.A0H("surface", str3);
        return AbstractC25227BEk.A0e(A0D, C32151EAy.class, C34745FSk.class);
    }
}
