package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AJv {
    public static final AJv A00 = new Object();

    public static final void A00(UserSession userSession, String str, String str2) {
        String str3;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_pro_dash_error");
        A0f.AAP("component", "self_profile_pro_home_hypercard_entrypoint");
        A0f.AAP("error_name", str);
        String str4 = userSession.userId;
        C14360o3.A0B(str4, 0);
        A0f.A9K("instagram_user_id", Long.valueOf(AbstractC167027dH.A03(str4)));
        EnumC222416a A0I = AbstractC166997dE.A0Y(userSession).A0I();
        if (A0I == null || (str3 = A0I.A01) == null) {
            str3 = "business";
        }
        A0f.AAP("interest_account_type", str3);
        A0f.AAP("error_details", str2);
        A0f.AAP("origin", "self_profile");
        A0f.Cht();
    }
}
