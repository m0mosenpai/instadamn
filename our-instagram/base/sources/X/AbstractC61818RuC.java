package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;

/* renamed from: X.RuC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61818RuC {
    public static String A00(int i) {
        if (i == 3) {
            return "ADS_MANAGER_COLD_START_MAIN";
        }
        if (i == 4) {
            return "ADS_MANAGER_COLD_START_LOGIN";
        }
        if (i == 13672) {
            return "ADS_MANAGER_AMA_TRANSITION";
        }
        if (i == 13673) {
            return "ADS_MANAGER_AMA_GUIDANCE_AMA_HOME_MFR";
        }
        switch (i) {
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "ADS_MANAGER_ENTER_CREATION_POST_ENGAGEMENT_TTI";
            case 24:
                return "ADS_MANAGER_AMA_SHELL_TTI";
            case 26:
                return "ADS_MANAGER_PRODUCT_START";
            case 2166:
                return "ADS_MANAGER_AMA_TRANSITIONS_LIMITED_COUNT";
            case 2197:
                return "ADS_MANAGER_AMA_NOTIFICATION_LANDING";
            case 2571:
                return "ADS_MANAGER_AMA_UPTIME_BUDGET_INTRO";
            case 3211:
                return "ADS_MANAGER_AMA_UPTIME_CREATIVE_INTRO";
            case 3914:
                return "ADS_MANAGER_AMA_DUPLICATE_EDIT_SPECIAL_AD_CATEGORY";
            case 4606:
                return "ADS_MANAGER_CREATION_WIZARD_MODAL";
            case 4779:
                return "ADS_MANAGER_AMA_ANDROID_MAIN_TTRC";
            case 4818:
                return "ADS_MANAGER_AMA_UPTIME_NAME_INTRO";
            case 5504:
                return "ADS_MANAGER_AMA_DUPLICATION_ADS_FLOW";
            case 7468:
                return "ADS_MANAGER_AMA_ODAX_DUPLICATE_FLOW";
            case 7950:
                return "ADS_MANAGER_AMA_UPTIME_PLACEMENT_INTRO";
            case 10569:
                return "ADS_MANAGER_DUPLICATE_AD";
            case 11756:
                return "ADS_MANAGER_AMA_HELP_AND_SUPPORT";
            case 11938:
                return "ADS_MANAGER_AMA_UPTIME_EXIT";
            case 12458:
                return "ADS_MANAGER_AMA_UPTIME_AUDIENCE_INTRO";
            case 12670:
                return "ADS_MANAGER_AMA_TASK";
            case 12829:
                return "ADS_MANAGER_AMA_ODAX_CREATION_FLOW";
            case 14103:
                return "ADS_MANAGER_AMA_UPTIME_SETTINGS_INTRO";
            case 14255:
                return "ADS_MANAGER_AMA_HOME_SCREEN";
            case 15376:
                return "ADS_MANAGER_AMA_PLACEHOLDER";
            case 15479:
                return "ADS_MANAGER_AMA_EDITING_FLOW";
            case 16286:
                return "ADS_MANAGER_AMA_ODAX_CREATION_FLOW_START";
            default:
                switch (i) {
                    case Process.SIGTERM /* 15 */:
                        return "ADS_MANAGER_ENTER_CREATION_WEBSITE_CLICKS_TTI";
                    case 16:
                        return "ADS_MANAGER_ENTER_CREATION_PAGE_LIKES_TTI";
                    case 17:
                        return "ADS_MANAGER_ENTER_CREATION_VIDEO_VIEWS_TTI";
                    case 18:
                        return "ADS_MANAGER_ENTER_CREATION_EVENT_RESPONSES_TTI";
                    case Process.SIGSTOP /* 19 */:
                        return "ADS_MANAGER_ENTER_CREATION_MESSAGES_TTI";
                    case 20:
                        return "ADS_MANAGER_ENTER_CREATION_REACH_TTI";
                    case 21:
                        return "ADS_MANAGER_ENTER_CREATION_CONVERSIONS_TTI";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
