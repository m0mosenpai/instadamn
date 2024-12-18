package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9wa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225119wa {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ACCESSIBILITY_ROLE";
            case 2:
                return "ACCESSIBILITY_ROLE_DESCRIPTION";
            case 3:
                return "CONTENT_DESCRIPTION";
            case 4:
                return "FOCUS_ORDER";
            case 5:
                return "IMPORTANT_FOR_ACCESSIBILITY";
            case 6:
                return "ON_INITIALIZE_ACCESSIBILITY_EVENT";
            case 7:
                return "ON_INITIALIZE_ACCESSIBILITY_NODE_INFO";
            case 8:
                return "ON_POPULATE_ACCESSIBILITY_EVENT";
            case 9:
                return "ON_POPULATE_ACCESSIBILITY_NODE";
            case 10:
                return "ON_REQUEST_SEND_ACCESSIBILITY_EVENT";
            case 11:
                return "PERFORM_ACCESSIBILITY_ACTION";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "SEND_ACCESSIBILITY_EVENT";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "SEND_ACCESSIBILITY_EVENT_UNCHECKED";
            case 14:
                return "ON_PERFORM_ACTION_FOR_VIRTUAL_VIEW";
            case Process.SIGTERM /* 15 */:
                return "ON_VIRTUAL_VIEW_KEYBOARD_FOCUS_CHANGED";
            default:
                return "ACCESSIBILITY_HEADING";
        }
    }
}
