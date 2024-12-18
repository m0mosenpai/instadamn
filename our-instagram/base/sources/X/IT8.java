package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class IT8 {
    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num) {
        String str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(interfaceC11380iw, userSession, 1), "instagram_activity_center_bulk_action");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, "feature_click");
            A0f.AAP("screen", "not_an_ac_screen");
            A0f.AAP("interface", "");
            A0f.AAP("useragent", "");
            C16930sl c16930sl = C16930sl.A00;
            A0f.AAk("content_fbids", c16930sl);
            A0f.AAk("content_igids", c16930sl);
            A0f.AAP("action_target", "shared_activity");
            if (num.intValue() != 0) {
                str = "profile_see_more_menu";
            } else {
                str = "user_following_list";
            }
            A0f.AAP("entrypoint", str);
            A0f.Cht();
        }
    }

    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC114765Gh enumC114765Gh, Integer num, String str) {
        String str2;
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_activity_center_bulk_action");
        if (!A0f.isSampled()) {
            return;
        }
        switch (num.intValue()) {
            case 0:
                str2 = "unlike";
                break;
            case 1:
                str2 = "delete";
                break;
            default:
                str2 = "archive";
                break;
        }
        AbstractC31171DnF.A1C(A0f, str2);
        A0f.AAP("screen", enumC114765Gh.A00);
        A0f.AAP("interface", "");
        A0f.AAP("useragent", "");
        A0f.AAk("content_fbids", C16930sl.A00);
        A0f.AAk("content_igids", AbstractC166987dD.A1J(str));
        A0f.AAP("entrypoint", null);
        A0f.Cht();
    }
}
