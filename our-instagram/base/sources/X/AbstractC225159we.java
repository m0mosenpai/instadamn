package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9we, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225159we {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CLICKABLE";
            case 2:
                return "CLIP_CHILDREN";
            case 3:
                return "CLIP_TO_OUTLINE";
            case 4:
                return "DUPLICATE_CHILDREN_STATES";
            case 5:
                return "DUPLICATE_PARENT_STATE";
            case 6:
                return "FOCUSABLE";
            case 7:
                return MSV.A00(75);
            case 8:
                return "ON_CLICK";
            case 9:
                return "ON_FOCUS_CHANGED";
            case 10:
                return "ON_INTERCEPT_TOUCH";
            case 11:
                return "ON_LONG_CLICK";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "ON_TOUCH";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "OUTLINE_PROVIDER";
            case 14:
                return "SELECTED";
            case Process.SIGTERM /* 15 */:
                return "STATE_LIST_ANIMATOR";
            case 16:
                return "TEST_KEY";
            case 17:
                return "TRANSITION_NAME";
            case 18:
                return "WRAP_IN_VIEW";
            case Process.SIGSTOP /* 19 */:
                return "VIEW_ID";
            case 20:
                return "VIEW_TAG";
            case 21:
                return "VIEW_TAGS";
            case 22:
                return "ENABLED";
            case 23:
                return "KEYBOARD_NAVIGATION_CLUSTER";
            case 24:
                return "ADD_TOUCH_EXCLUSION_ZONE";
            case 25:
                return "TOOLTIP_TEXT";
            case 26:
                return "LAYER_TYPE";
            default:
                return "BACKGROUND";
        }
    }
}
