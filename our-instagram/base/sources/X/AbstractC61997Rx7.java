package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Rx7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61997Rx7 {
    public static String A00(int i) {
        if (i == 1) {
            return "LOGOUT_HANDLE_LOGOUT";
        }
        if (i == 2) {
            return "LOGOUT_BEFORE_LOGOUT";
        }
        if (i == 3) {
            return "LOGOUT_BEFORE_LOGOUT_COMPONENT";
        }
        if (i == 4) {
            return "LOGOUT_UNREGISTER_PUSH_TOKEN";
        }
        switch (i) {
            case 6:
                return "LOGOUT_EXPIRE_SESSION";
            case 7:
                return "LOGOUT_LOGOUT_HELPER";
            case 8:
                return "LOGOUT_AFTER_LOGOUT";
            case 9:
                return "LOGOUT_AFTER_LOGOUT_COMPONENT";
            case 10:
                return "LOGOUT_LOGOUT_COMPLETE";
            case 11:
                return "LOGOUT_LOGOUT_COMPLETE_COMPONENT";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "LOGOUT_CLEAR_PRIVACY_CRITICAL_KEYS";
            default:
                switch (i) {
                    case 14:
                        return "LOGOUT_CLEAR_USER_DATA";
                    case Process.SIGTERM /* 15 */:
                        return "LOGOUT_CLEAR_USER_DATA_COMPONENT";
                    case 16:
                        return "LOGOUT_CLEAR_USER_AUTH_DATA";
                    default:
                        switch (i) {
                            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                                return "LOGOUT_APP_SESSION_CLEAR_USER_DATA";
                            case 30:
                                return "LOGOUT_PRELOAD_COMPONENT";
                            case 31:
                                return "LOGOUT_LOGOUT_E2E";
                            default:
                                return "UNDEFINED_QPL_EVENT";
                        }
                }
        }
    }
}
