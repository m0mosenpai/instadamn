package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes6.dex */
public abstract class F7L {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "profile";
            case 1:
                return AbstractC111324zv.A00(2168);
            case 2:
                return AbstractC111324zv.A00(211);
            case 3:
                return "fan_management_consideration";
            case 4:
                return "creator_management_consideration";
            case 5:
                return "fan_club_custom_benefits_selection";
            case 6:
                return "subscription_manager";
            case 7:
                return AbstractC111324zv.A00(1922);
            case 8:
                return "story_viewer";
            case 9:
                return AbstractC111324zv.A00(5412);
            case 10:
                return "edit_story";
            case 11:
                return "camera";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "creator_management_settings";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "subscriber_list";
            case 14:
                return AbstractC43591JPw.A00(1277);
            case Process.SIGTERM /* 15 */:
                return "feed";
            case 16:
                return "reels_feed";
            case 17:
                return AbstractC111324zv.A00(515);
            case 18:
                return "direct_message";
            case Process.SIGSTOP /* 19 */:
                return "live_audience_selector";
            case 20:
                return "creator_settings_fan_club_guided_activation";
            default:
                return "fan_club_guided_activation";
        }
    }
}
