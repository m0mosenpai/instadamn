package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FY5 {
    public static final C1ON A00(UserSession userSession, String str, String str2) {
        C25621Ms A0C = AbstractC31179DnN.A0C(userSession);
        A0C.A0B("discover/chaining_dismiss/");
        A0C.A9s("target_id", str);
        return AbstractC31178DnM.A0K(A0C, "chaining_user_id", str2);
    }

    public static final C1ON A01(UserSession userSession, String str, String str2, String str3) {
        C25621Ms A0C = AbstractC31179DnN.A0C(userSession);
        A0C.A0B("discover/aysf_dismiss/");
        A0C.A9s("target_id", str);
        A0C.A9s("uuid", str2);
        AbstractC31173DnH.A1N(A0C);
        if (str3 != null) {
            A0C.A9s("algorithm", str3);
        }
        return A0C.A0N();
    }
}
