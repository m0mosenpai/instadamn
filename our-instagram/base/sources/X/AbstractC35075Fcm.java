package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fcm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35075Fcm {
    public static final void A00(UserSession userSession, Integer num) {
        String str;
        C14360o3.A0B(userSession, 0);
        if (num == C05F.A02 || num == C05F.A03) {
            C34918Fa4.A00 = AbstractC166997dE.A0n();
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(C34918Fa4.A01, userSession), "instagram_two_fac_setup_action");
        switch (num.intValue()) {
            case 0:
                str = "change_phone_number";
                break;
            case 1:
                str = "copy_key";
                break;
            case 2:
                str = "copy_recovery_code";
                break;
            case 3:
                str = "enter_recovery_code";
                break;
            case 4:
                str = "get_new_recovery_code";
                break;
            case 5:
                str = "link";
                break;
            case 6:
                str = "next";
                break;
            case 7:
                str = "resend_code";
                break;
            case 8:
                str = "screenshot";
                break;
            case 9:
                str = "setup_manually";
                break;
            default:
                str = "turn_on_sms";
                break;
        }
        AbstractC31171DnF.A1C(A0f, str);
        A0f.AAP("view", "");
        AbstractC31181DnP.A0c(A0f);
        A0f.Cht();
    }

    public static final void A01(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(C34918Fa4.A01, userSession), "instagram_two_fac_setup_code_resend_failure");
        A0f.AAP("reason", str);
        A0f.AAP("view", "enter_code");
        AbstractC31181DnP.A0c(A0f);
        A0f.Cht();
    }

    public static final void A02(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(C34918Fa4.A01, userSession), "instagram_two_fac_setup_view");
        AbstractC31181DnP.A0c(A0f);
        A0f.AAP("view", str);
        A0f.Cht();
    }
}
