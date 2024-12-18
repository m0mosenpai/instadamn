package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OH9 {
    public final UserSession A00;

    public final C1ON A00(String str, String str2) {
        C14360o3.A0B(str, 0);
        C25621Ms c25621Ms = new C25621Ms(this.A00, 729);
        c25621Ms.A05();
        c25621Ms.A0B("creators/partner_program/set_igtv_account_level_toggle/");
        c25621Ms.A9s(AbstractC111324zv.A00(1344), str);
        c25621Ms.A0R(C38879HAb.class, IRX.class);
        if (str2 != null) {
            c25621Ms.A9s("product_type", str2);
        }
        return c25621Ms.A0N();
    }

    public OH9(UserSession userSession) {
        this.A00 = userSession;
    }
}
