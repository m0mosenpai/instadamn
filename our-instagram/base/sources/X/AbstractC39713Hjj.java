package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Hjj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39713Hjj {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "MAYBE_CANCEL";
            case 2:
                return "VIEW_MORE";
            case 3:
                return "RETRY";
            case 4:
                return "BACK_BUTTON";
            case 5:
                return "OPEN_WIFI_SETTINGS";
            case 6:
                return "RESTART_INSTALL_WITH_MOBILE_DATA";
            case 7:
                return "SCREEN_OPEN";
            case 8:
                return "SCREEN_CLOSED";
            case 9:
                return "FALLBACK";
            case 10:
                return "OPEN_APP";
            case 11:
                return "UI_UPDATE";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "PROMOTE_MOBILE_DATA_USAGE";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "PROMOTE_ENABLE_WIFI";
            default:
                return "INSTALL";
        }
    }
}
