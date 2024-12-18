package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class FWZ {
    public static final void A00(UserSession userSession, Integer num) {
        C14360o3.A0B(userSession, 1);
        A01(userSession, num, C05F.A00, null);
    }

    public static final void A01(UserSession userSession, Integer num, Integer num2, String str) {
        String str2;
        String str3;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_profile_data_transparency");
        if (!A0f.isSampled()) {
            return;
        }
        switch (num2.intValue()) {
            case 0:
                str2 = "CLICK_LEARN_MORE";
                break;
            case 1:
                str2 = "OPEN_BOTTOM_SHEET";
                break;
            case 2:
                str2 = "SURVEY_ENABLED";
                break;
            default:
                str2 = "TRY_SHOW_SURVEY";
                break;
        }
        Locale locale = Locale.ROOT;
        AbstractC31171DnF.A1B(A0f, AbstractC31172DnG.A16(locale, str2));
        switch (num.intValue()) {
            case 0:
                str3 = "EDIT_BIO";
                break;
            case 1:
                str3 = "EDIT_LINKS";
                break;
            case 2:
                str3 = "EDIT_NAME";
                break;
            case 3:
                str3 = "EDIT_PICTURE";
                break;
            case 4:
                str3 = "EDIT_PROFILE";
                break;
            case 5:
                str3 = "EDIT_USERNAME";
                break;
            default:
                str3 = "PROFILE";
                break;
        }
        A0f.AAP(CacheBehaviorLogger.SOURCE, AbstractC31172DnG.A16(locale, str3));
        A0f.AAP(DevServerEntity.COLUMN_DESCRIPTION, str);
        A0f.Cht();
    }
}
