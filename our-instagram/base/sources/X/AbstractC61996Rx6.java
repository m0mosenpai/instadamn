package X;

import com.facebook.forker.Process;

/* renamed from: X.Rx6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61996Rx6 {
    public static String A00(int i) {
        if (i == 3) {
            return "LoginToBeforeFeedFetch";
        }
        if (i == 4) {
            return "LOGIN_FETCH_LOGIN_DATA_TTI";
        }
        if (i == 13) {
            return "LOGIN_SILENT_LOGIN";
        }
        if (i == 14) {
            return "ColdStartNuxTTI";
        }
        switch (i) {
            case 1:
                return "NewLogin";
            case 10:
                return "LOGIN_FETCH_LOGIN_COMPONENTS";
            case 22:
                return "AppCreateToLoginActivityCreate";
            case 25:
                return "AndroidLoginTTI";
            case 28:
                return "LOGIN_LIAS_ANDROID";
            case 31:
                return "LOGIN_ACCOUNT_SWITCH";
            case 1173:
                return "LOGIN_ACCOUNT_SWITCHER_LOGGER";
            case 3113:
                return "LOGIN_SMARTLOCK_SAVE";
            case 4569:
                return "LOGIN_SMARTLOCK";
            case 4843:
                return "LOGIN_ADDITIONAL_ACCOUNT_SIGNAL_FETCH_TIME";
            case 8126:
                return "LOGIN_OPENID_TO_ACCOUNT_SWITCHER";
            case 9977:
                return "LOGIN_AR_ASSISTIVE_ID";
            case 12142:
                return "LOGIN_CONTACT_POINT_LOGIN";
            case 12659:
                return "LOGIN_HEADER_FALLBACK";
            case 14486:
                return "LOGIN_CROSS_SESSION";
            case 14524:
                return "LOGIN_ASSISTIVE_ID";
            case 14768:
                return "LOGIN_FB4A_POST_LOGOUT";
            default:
                switch (i) {
                    case 16:
                        return "LOGIN_LOAD_PERSISTENT_COMPONENTS";
                    case 17:
                        return "LOGIN_FETCH_PERSISTENT_COMPONENTS";
                    case 18:
                        return "LOGIN_LOGOUT";
                    case Process.SIGSTOP /* 19 */:
                        return "LoginToFeedStory";
                    case 20:
                        return "Authentication";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
