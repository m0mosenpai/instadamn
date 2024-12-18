package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OLi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54824OLi {
    public final InterfaceC02550Ad A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public C54824OLi(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A00(Boolean bool, Integer num, String str, String str2, String str3, String str4) {
        String str5;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0H = MSY.A0H(this.A00, "ig_settings_impression");
        if (A0H.isSampled()) {
            A0H.AAP("event_name", str);
            switch (num.intValue()) {
                case 0:
                    str5 = "screen_impression";
                    break;
                case 1:
                    str5 = "setting_impression";
                    break;
                case 2:
                    str5 = "navigation_row_impression";
                    break;
                case 3:
                    str5 = "click";
                    break;
                case 4:
                    str5 = "search";
                    break;
                case 5:
                    str5 = "change_attempt";
                    break;
                default:
                    str5 = "modal_impression";
                    break;
            }
            A0H.AAP("event_type", str5);
            A0H.AAP("control_name", str2);
            A0H.AAP("current_value", str3);
            A0H.A7v("is_enabled", bool);
            AbstractC25232BEp.A1L(A0H, "entrypoint", str4);
        }
    }

    public final void A01(String str, Integer num, String str2) {
        String str3;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0H = MSY.A0H(this.A00, "ig_settings_click");
        if (A0H.isSampled()) {
            A0H.AAP("event_name", str);
            switch (num.intValue()) {
                case 3:
                    str3 = "click";
                    break;
                case 4:
                    str3 = "search";
                    break;
                case 5:
                    str3 = "change_attempt";
                    break;
                case 6:
                    str3 = "modal_impression";
                    break;
                default:
                    str3 = "modal_click";
                    break;
            }
            A0H.AAP("event_type", str3);
            A0H.AAP("control_name", null);
            A0H.AAP("current_value", null);
            A0H.A7v("is_enabled", null);
            AbstractC25232BEp.A1L(A0H, "entrypoint", str2);
        }
    }

    public final void A02(String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1O(str, str3);
        InterfaceC02590Ai A0H = MSY.A0H(this.A00, "ig_settings_change");
        if (A0H.isSampled()) {
            A0H.AAP("event_name", str);
            A0H.AAP("event_type", "change_attempt");
            A0H.AAP("control_name", str2);
            A0H.AAP("current_value", str3);
            AbstractC25232BEp.A1L(A0H, "entrypoint", str4);
        }
    }
}
