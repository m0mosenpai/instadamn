package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class OKY {
    public final C18920wW A00;
    public final String A01;

    public OKY(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A01 = str;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A00(Integer num) {
        String str;
        HashMap A02 = AbstractC06930Yk.A02(AbstractC167007dF.A1b("nav_chain", AbstractC25225BEi.A14(), AbstractC166987dD.A1L("se_event_type", "impression"), AbstractC166987dD.A1L("se_product", "Limits")));
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "instagram_wellbeing_limited_interactions_impression");
        switch (num.intValue()) {
            case 0:
                str = "limited_comments";
                break;
            case 1:
                str = "limited_comments_tooltip";
                break;
            case 2:
                str = "reminder";
                break;
            default:
                str = "igbc_limited_comments";
                break;
        }
        A0f.AAP("surface", str);
        MSX.A1H(A0f, this.A01);
        A0f.A9M("extra_values", A02);
        A0f.AAP("entrypoint", null);
        A0f.Cht();
    }

    public final void A01(Integer num, Integer num2, java.util.Set set) {
        String str;
        String str2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, AbstractC111324zv.A00(4704));
        switch (num.intValue()) {
            case 0:
                str = "approve_comments_action";
                break;
            case 1:
                str = "approve_comments_cancel";
                break;
            case 2:
                str = "delete_comments_action";
                break;
            default:
                str = "delete_comments_cancel";
                break;
        }
        AbstractC31171DnF.A1A(A0f, str);
        MSX.A1H(A0f, this.A01);
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str2 = "limited_comments_tooltip";
                    break;
                case 2:
                    str2 = "reminder";
                    break;
                case 3:
                    str2 = "igbc_limited_comments";
                    break;
                case 4:
                    str2 = "what_to_limit_sheet";
                    break;
                case 5:
                    str2 = "who_to_limit_sheet";
                    break;
                case 6:
                    str2 = "set_duration_sheet";
                    break;
                case 7:
                    str2 = "reminder_toast";
                    break;
                case 8:
                    str2 = "main_setting";
                    break;
                default:
                    str2 = "limited_comments";
                    break;
            }
        } else {
            str2 = null;
        }
        A0f.AAP("surface", str2);
        A0f.AAP(AbstractC111324zv.A00(5272), AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, set, C57735PjO.A00));
        A0f.Cht();
    }
}
