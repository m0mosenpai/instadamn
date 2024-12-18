package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class ILN {
    public final C18920wW A00;
    public final UserSession A01;

    public ILN(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A01 = userSession;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A00(EnumC33341Eoa enumC33341Eoa, Integer num, String str, List list) {
        String str2;
        String str3;
        boolean A1R = AbstractC167007dF.A1R(0, enumC33341Eoa, num);
        C14360o3.A0B(list, 2);
        if (C18U.A06(C06090Tz.A06, this.A01, 36321198392485070L)) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_activity_center_bulk_action");
            switch (num.intValue()) {
                case 0:
                    str2 = "load_screen";
                    break;
                case 1:
                    str2 = "feature_click";
                    break;
                case 2:
                    str2 = "media_click";
                    break;
                case 3:
                    str2 = "remove_tag";
                    break;
                case 4:
                    str2 = "remove_all_tags";
                    break;
                case 5:
                    str2 = AbstractC111324zv.A00(1224);
                    break;
                case 6:
                    str2 = "remove_all_tags_failed";
                    break;
                case 7:
                    str2 = "hide_tag";
                    break;
                case 8:
                    str2 = "hide_tag_failed";
                    break;
                case 9:
                    str2 = "restore_tag";
                    break;
                case 10:
                    str2 = "restore_tag_failed";
                    break;
                default:
                    str2 = "nux_shown";
                    break;
            }
            AbstractC31171DnF.A1C(A0f, str2);
            int ordinal = enumC33341Eoa.ordinal();
            if (ordinal != A1R) {
                if (ordinal != 2) {
                    if (ordinal != 0) {
                        str3 = "";
                    } else {
                        str3 = "tagged_posts";
                    }
                } else {
                    str3 = "spam_tags";
                }
            } else {
                str3 = "pending_tags";
            }
            A0f.AAP("screen", str3);
            A0f.AAP("interface", "");
            A0f.AAP("useragent", "");
            A0f.AAk("content_fbids", C16930sl.A00);
            A0f.AAk("content_igids", list);
            A0f.AAP("action_target", str);
            A0f.Cht();
        }
    }
}
