package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.6OZ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6OZ {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "tap_back";
            case 2:
                return "swipe_forward";
            case 3:
                return "swipe_back";
            case 4:
                return "automatic_forward";
            case 5:
                return AbstractC43591JPw.A00(215);
            case 6:
                return "swipe_up";
            case 7:
                return "tap_exit";
            case 8:
                return "tap_dashboard";
            case 9:
                return "hide_ad";
            case 10:
                return "hide";
            case 11:
                return "delete_lastitem";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "delete_lastpendingitem";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "type_selector_tap";
            case 14:
                return "reel_viewer_tray_tap";
            case Process.SIGTERM /* 15 */:
                return "mid_card_create_story_tap";
            case 16:
            case 17:
                return "mid_card_profile_picture_tap";
            case 18:
                return "unknown";
            default:
                return "tap_forward";
        }
    }
}
