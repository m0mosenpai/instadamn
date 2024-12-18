package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;

/* renamed from: X.RuJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61825RuJ {
    public static String A00(int i) {
        if (i == 6) {
            return "ALOHA_TTI_DOWNLOAD_OTA_TOUR_PACKAGE";
        }
        if (i == 8) {
            return "ALOHA_TTI_ASSISTANT_RESPONSE_LATENCY";
        }
        if (i == 19) {
            return "ALOHA_TTI_EFFECT_SELECT_TO_RENDER_DELAY";
        }
        if (i == 37) {
            return "ALOHA_TTI_AFTER_2FA_ENTERED_LOADING";
        }
        if (i == 5154) {
            return "ALOHA_TTI_LOAD_OA_ENROLLMENT";
        }
        if (i == 7265) {
            return "ALOHA_TTI_STORYTELLING_TRAY_LOAD";
        }
        if (i == 25) {
            return "ALOHA_TTI_EFFECT_SET_TO_LOAD_DELAY";
        }
        if (i == 26) {
            return "ALOHA_TTI_EFFECT_LOAD_TO_RENDER_DELAY";
        }
        if (i == 28) {
            return "ALOHA_TTI_INITIAL_WIFI_SCAN_LOADING";
        }
        if (i == 29) {
            return "ALOHA_TTI_SAVE_NAME_LOADING";
        }
        if (i == 51) {
            return "ALOHA_TTI_APP_STORE_OPEN";
        }
        if (i == 52) {
            return "Biometric System Response Time";
        }
        switch (i) {
            case Process.SIGTERM /* 15 */:
                return "ALOHA_TTI_STORYTELLING_INITIAL_LOAD";
            case 16:
                return "ALOHA_TTI_STORYTELLING_PAGE_TO_PAGE";
            case 17:
                return "ALOHA_TTI_STORYTELLING_PRELOADING_DELAY";
            default:
                switch (i) {
                    case 32:
                        return "ALOHA_TTI_OTA_CHECK_LOADING";
                    case 33:
                        return "ALOHA_TTI_AFTER_CONFIRMATION_CODE_ENTERED_LOADING";
                    case 34:
                        return "ALOHA_TTI_WIFI_CONNECTION_LOADING";
                    case 35:
                        return "ALOHA_TTI_AFTER_FB_CREDENTIALS_ENTERED_LOADING";
                    default:
                        switch (i) {
                            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                                return "ALOHA_TTI_REMOTE_CONNECTION_OVERALL";
                            case 47:
                                return "ALOHA_TTI_REMOTE_FALLBACK_CONNECTION_OVERALL";
                            case 48:
                                return "ALOHA_TTI_REMOTE_FOUND";
                            case 49:
                                return "ALOHA_TTI_REMOTE_CONNECTING";
                            default:
                                switch (i) {
                                    case 54:
                                        return "ALOHA_TTI_WHATSAPP_LOGIN_SETUP";
                                    case 55:
                                        return "ALOHA_TTI_FACEBOOK_LOGIN_SETUP";
                                    case 56:
                                        return "ALOHA_TTI_WORKPLACE_LOGIN_SETUP";
                                    case 57:
                                        return "ALOHA_TTI_FACEBOOK_ADD_ACCOUNT_SETUP";
                                    case 58:
                                        return "ALOHA_TTI_WHATSAPP_ADD_ACCOUNT_SETUP";
                                    default:
                                        return "UNDEFINED_QPL_EVENT";
                                }
                        }
                }
        }
    }
}
