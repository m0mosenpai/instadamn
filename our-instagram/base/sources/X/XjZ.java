package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import kotlin.Deprecated;

@Deprecated(message = "Do not use this class. Instead use modal fragment navigation: https://www.internalfb.com/intern/wiki/Igs2/Config/Destinations/")
/* loaded from: classes12.dex */
public abstract class XjZ {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ACCESSIBILITY_SETTINGS";
            case 2:
                return "ACCOUNTS_CENTER";
            case 3:
                return "ACCOUNT_PRIVACY";
            case 4:
                return "ACCOUNT_STATUS";
            case 5:
                return "ADD_ACCOUNT";
            case 6:
                return "ADD_NEW_PROFESSIONAL_ACCOUNT";
            case 7:
                return "AD_PAYMENTS";
            case 8:
                return "AD_PLACEMENTS";
            case 9:
                return "AVATAR_SETTINGS";
            case 10:
                return "BLOCKED_ACCOUNTS";
            case 11:
                return "BRANDED_CONTENT";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "BUSINESS";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "CALLING";
            case 14:
                return "CART";
            case Process.SIGTERM /* 15 */:
                return "CREATOR";
            case 16:
                return "DARK_MODE";
            case 17:
                return "DATA_SAVER_OPTIONS";
            case 18:
                return "FAVORITES";
            case Process.SIGSTOP /* 19 */:
                return "FOLLOW_AND_INVITE_FRIENDS";
            case 20:
                return "HIDDEN_WORDS";
            case 21:
                return "INSIGHTS";
            case 22:
                return "INTERNAL_SETTINGS";
            case 23:
                return "LANGUAGE_SETTINGS";
            case 24:
                return "LIMITED_INTERACTIONS";
            case 25:
                return "LOGIN_INFO";
            case 26:
                return "LOG_OUT";
            case 27:
                return "LOG_OUT_ALL_ACCOUNTS";
            case 28:
                return "MANAGED_TAGGED_MEDIA";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "MESSAGES";
            case 30:
                return "META_VERIFIED";
            case 31:
                return "NOTIFICATION_SETTINGS";
            case 32:
                return "PRIVACY_CENTER";
            case 33:
                return "QUIET_MODE";
            case 34:
                return "RESTRICTED_ACCOUNTS";
            case 35:
                return "SAVED";
            case 36:
                return "SCHEDULED_CONTENT";
            case 37:
                return "SHARE_WITH_OTHER_APPS";
            case 38:
                return "SMART_GLASSES_TOOLKIT";
            case 39:
                return "SWITCH_TO_PROFESSIONAL";
            default:
                return "ABOUT";
        }
    }
}
