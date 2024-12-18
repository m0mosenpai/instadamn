package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Rtb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61781Rtb {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "SETTINGS_CLEAR_ERROR";
            case 1:
                return "SETTINGS_CLEAR_CANCEL_CLICKED";
            case 2:
                return "SETTINGS_CLEAR_CLICKED";
            case 3:
                return "SETTINGS_CLEAR_CONFIRM_CLICKED";
            case 4:
                return "SETTINGS_DATA_POLICY_CLICKED";
            case 5:
                return "SETTINGS_LINK_HISTORY_SWITCH_TOGGLED_OFF_CLICKED";
            case 6:
                return "SETTINGS_LINK_HISTORY_SWITCH_TOGGLED_ON_CLICKED";
            case 7:
                return "VIEW_LINK_HISTORY_OVERFLOW_ITEM_CLICKED";
            case 8:
                return "VIEW_LINK_HISTORY_FOOTER_ICON_CLICKED";
            case 9:
                return "OPT_IN_UI_SHOW";
            case 10:
                return "OPT_IN_NUX_UI_SKIP";
            case 11:
                return "TOOLTIP_SHOWN";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "TOOLTIP_DISMISSED";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "OPT_IN_UI_STATUS_READ_STARTED";
            case 14:
                return "OPT_IN_UI_STATUS_READ_FINISHED";
            case Process.SIGTERM /* 15 */:
                return "OPT_IN_UI_STATUS_READ_ERROR";
            case 16:
                return "HISTORY_WRITE_STARTED";
            case 17:
                return "HISTORY_WRITE_FINISHED";
            case 18:
                return "HISTORY_WRITE_ERROR";
            default:
                return "INCORRECT_TYPE";
        }
    }
}
