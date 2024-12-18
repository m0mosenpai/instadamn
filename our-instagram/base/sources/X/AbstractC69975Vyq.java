package X;

import android.os.Build;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vyq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69975Vyq {
    public static final void A01(UserSession userSession, Integer num, String str) {
        String str2;
        C14360o3.A0B(userSession, 0);
        C1QE A01 = C1QE.A01("profile_wizard");
        switch (num.intValue()) {
            case 0:
                str2 = "profile_wizard_launched";
                break;
            case 1:
                str2 = "profile_wizard_next_pressed";
                break;
            case 2:
                str2 = "profile_wizard_skip_pressed";
                break;
            case 3:
                str2 = "profile_wizard_soft_back_pressed";
                break;
            case 4:
                str2 = "profile_wizard_back_pressed";
                break;
            case 5:
                str2 = "profile_wizard_done_pressed";
                break;
            case 6:
                str2 = "profile_wizard_user_saved";
                break;
            case 7:
                str2 = "profile_wizard_user_save_failed";
                break;
            case 8:
                str2 = "profile_wizard_picture_saved";
                break;
            case 9:
                str2 = "profile_wizard_picture_save_failed";
                break;
            case 10:
                str2 = "profile_wizard_has_pending_changes";
                break;
            case 11:
                str2 = "profile_wizard_pending_changes_saved";
                break;
            default:
                str2 = "profile_wizard_pending_changes_discarded";
                break;
        }
        C19280xC A04 = A01.A04(str2);
        A04.A08(Integer.valueOf(Build.VERSION.SDK_INT), "os_version");
        A04.A0C(AbstractC111324zv.A00(4436), C11830jh.A04.A01(userSession).A02(C19T.A2C));
        A04.A0C("guid", C16030qx.A02.A04(AbstractC12290kX.A00));
        A04.A0C(AbstractC31188DnX.A00(), userSession.userId);
        if (str != null) {
            A04.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        }
        AbstractC31173DnH.A1S(A04, userSession);
    }

    public static final void A00(UserSession userSession, X8X x8x, Integer num) {
        AbstractC167017dG.A1N(userSession, x8x);
        A01(userSession, num, x8x.toString());
    }
}
