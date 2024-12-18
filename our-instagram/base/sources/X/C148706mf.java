package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148706mf {
    public final UserSession A00;

    public C148706mf(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(Integer num, Integer num2, String str, String str2, boolean z) {
        String str3;
        String str4;
        C18920wW A02 = AbstractC12220kQ.A02(this.A00);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, "avatar_upsell_action");
        if (A00.isSampled()) {
            C09530e4 c09530e4 = new C09530e4("surface", str);
            C09530e4 c09530e42 = new C09530e4("upsell_type", str2);
            if (num.intValue() != 0) {
                str3 = "auto_migration";
            } else {
                str3 = "manual_migration";
            }
            C09530e4 c09530e43 = new C09530e4("stage", str3);
            C09530e4 c09530e44 = new C09530e4("has_avatar", String.valueOf(z));
            if (num2.intValue() != 0) {
                str4 = "dismiss";
            } else {
                str4 = "open_editor";
            }
            A00.A9M("extra_client_data", AbstractC06930Yk.A06(c09530e4, c09530e42, c09530e43, c09530e44, new C09530e4("action_type", str4)));
            A00.Cht();
        }
    }

    public final void A01(Integer num, String str, String str2, boolean z) {
        String str3;
        C18920wW A02 = AbstractC12220kQ.A02(this.A00);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, "avatar_upsell_impression");
        if (A00.isSampled()) {
            C09530e4 c09530e4 = new C09530e4("surface", str);
            C09530e4 c09530e42 = new C09530e4("upsell_type", str2);
            if (num.intValue() != 0) {
                str3 = "auto_migration";
            } else {
                str3 = "manual_migration";
            }
            A00.A9M("extra_client_data", AbstractC06930Yk.A06(c09530e4, c09530e42, new C09530e4("stage", str3), new C09530e4("has_avatar", String.valueOf(z))));
            A00.Cht();
        }
    }
}
