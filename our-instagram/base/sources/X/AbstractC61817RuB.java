package X;

/* renamed from: X.RuB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61817RuB {
    public static String A00(int i) {
        if (i == 1) {
            return "ACT_PRE_ACT_MESSAGE_SEND";
        }
        if (i == 2) {
            return "ACT_PRE_ACT_MESSAGE_SEND_MEDIA";
        }
        if (i == 3) {
            return "ACT_PRE_ACT_MESSAGE_RECEIVE";
        }
        if (i == 4) {
            return "ACT_PRE_ARMADILLO_CONNECTION";
        }
        switch (i) {
            case 1642:
                return "ACT_PRE_ACT_OFFLINE_SYNC_NON_EMPTY";
            case 2577:
                return "ACT_PRE_ACT_LOCAL_MESSAGE_RECEIVE";
            case 3310:
                return "ACT_PRE_ACT_QPL_DEBUG";
            case 3403:
                return "ACT_PRE_ACT_MESSAGE_SEND_V2";
            case 4467:
                return "ACT_PRE_NULL_AUXILIARY_DB";
            case 7339:
                return "ACT_PRE_THREAD_MEDIA_LOAD_SUMMARY";
            case 8921:
                return "ACT_PRE_ACT_MESSAGE_SEND_MEDIA_V2";
            case 9364:
                return "ACT_PRE_ACT_OFFLINE_SYNC";
            case 9778:
                return "ACT_PRE_ARMADILLO_ACT_MEDIA_DOWNLOAD";
            case 10310:
                return "ACT_PRE_TAM_THREAD_MEDIA_LOAD_SUMMARY";
            case 12153:
                return "ACT_PRE_ACT_SANITIZER_XMA_CTA_VALIDATION_FAILURE";
            case 14496:
                return "ACT_PRE_ADVANCED_CRYPTO_THREAD_VIEW";
            case 15272:
                return "ACT_PRE_ACT_OFFLINE_SYNC_USER_FLOW";
            case 16011:
                return "ACT_PRE_ARMADILLO_REGISTRATION";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
