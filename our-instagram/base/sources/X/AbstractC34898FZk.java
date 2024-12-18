package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.FZk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34898FZk {
    public static final C1GL A00 = C1GJ.A01();

    public static void A00(UserSession userSession, C5GM c5gm, Integer num, Integer num2) {
        String str;
        String str2;
        C1GL c1gl = A00;
        Integer num3 = c5gm.A06;
        if (num3 == C05F.A0j) {
            str = ((V80) c5gm.A00).A0F;
        } else {
            switch (num3.intValue()) {
                case 1:
                    str = "fb_connect_upsell";
                    break;
                case 2:
                    str = "vk_connect_upsell";
                    break;
                case 3:
                    str = "ci_connect_upsell";
                    break;
                case 4:
                    str = "rux";
                    break;
                case 5:
                    str = "generic_megaphone";
                    break;
                case 6:
                    str = AbstractC111324zv.A00(2175);
                    break;
                case 7:
                    str = "confirm_phone";
                    break;
                default:
                    str = "follow_destination";
                    break;
            }
        }
        String str3 = c5gm.A00.A00;
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("megaphone/log/");
        A0M.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        AbstractC31176DnK.A1P(A0M, "action", AbstractC34243F8p.A00(num));
        switch (num2.intValue()) {
            case 3:
                str2 = "main_feed";
                break;
            case 4:
                str2 = "news_feed";
                break;
            case 5:
                str2 = "profile_page";
                break;
            case 6:
                str2 = "recap_page";
                break;
            default:
                str2 = "bc_policy_violation";
                break;
        }
        A0M.A9s("display_medium", str2);
        if (str3 != null) {
            A0M.A9s("uuid", str3);
        }
        c1gl.schedule(A0M.A0N());
    }
}
