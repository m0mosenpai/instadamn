package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FVE {
    public static final void A00(UserSession userSession, Integer num, Integer num2, Integer num3) {
        String str;
        String str2;
        String str3;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(userSession), "direct_hidden_words_adoption_click");
        if (A0f.isSampled()) {
            C54s c54s = new C54s(C913045j.A00);
            switch (num2.intValue()) {
                case 1:
                    str = "bottomsheet";
                    break;
                case 2:
                    str = "toast";
                    break;
                case 3:
                    str = "ack_toast";
                    break;
                default:
                    str = "nux";
                    break;
            }
            c54s.A0F("upsell_type", str);
            switch (num.intValue()) {
                case 0:
                    str2 = "help";
                    break;
                case 1:
                    str2 = "turn_on";
                    break;
                case 2:
                    str2 = "dismiss";
                    break;
                default:
                    str2 = "see_how";
                    break;
            }
            AbstractC31171DnF.A1C(A0f, str2);
            if (num3 != null) {
                if (1 - num3.intValue() != 0) {
                    str3 = "hw_upsell_on_request_folder";
                } else {
                    str3 = "spam-re-consent";
                }
            } else {
                str3 = null;
            }
            A0f.AAP(CacheBehaviorLogger.SOURCE, str3);
            A0f.AAP("extra_client_data", c54s.toString());
            A0f.Cht();
        }
    }

    public static final void A01(UserSession userSession, Integer num, Integer num2, String str) {
        String str2;
        String str3;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "direct_hidden_words_adoption_impression");
        if (!A0f.isSampled()) {
            return;
        }
        switch (num.intValue()) {
            case 1:
                str2 = "bottomsheet";
                break;
            case 2:
                str2 = "toast";
                break;
            case 3:
                str2 = "ack_toast";
                break;
            default:
                str2 = "nux";
                break;
        }
        A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
        if (num2 != null) {
            if (1 - num2.intValue() != 0) {
                str3 = "hw_upsell_on_request_folder";
            } else {
                str3 = "spam-re-consent";
            }
        } else {
            str3 = null;
        }
        A0f.AAP(CacheBehaviorLogger.SOURCE, str3);
        A0f.AAP("extra_client_data", str);
        A0f.Cht();
    }
}
