package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes9.dex */
public abstract class OQV {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "user_initiated";
            case 2:
                return "user_initiated_broadcast_rights_management_checkpoint_finish_button";
            case 3:
                return "user_initiated_broadcast_rights_management_initial_warning_finish_button";
            case 4:
                return "live_swap";
            case 5:
                return "broadcast_time_limit";
            case 6:
                return "broadcast_failure";
            case 7:
                return "broadcast_failure_feature_block";
            case 8:
                return "speed_test_failure";
            case 9:
                return "server_initiated";
            case 10:
                return "app_inactive";
            case 11:
                return "audio_focus";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "video_mute_toggle";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "connection";
            case 14:
                return "user_initiated_broadcast_content_monetization_violation_end_live_button";
            default:
                return "unknown";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "USER_INITIATED";
            case 2:
                return "RM_CHECKPOINT_FINISH_TAP";
            case 3:
                return "RM_INITIAL_WARNING_FINISH_TAP";
            case 4:
                return "LIVE_SWAP";
            case 5:
                return "BROADCAST_TIME_LIMIT";
            case 6:
                return "BROADCAST_FAILURE";
            case 7:
                return "BROADCAST_FAILURE_FEATURE_BLOCK";
            case 8:
                return "BROADCAST_SPEED_TEST_FAILURE";
            case 9:
                return "SERVER_INITIATED";
            case 10:
                return "APP_INACTIVE";
            case 11:
                return "AUDIO_FOCUS";
            default:
                return "VIDEO_MUTE_TOGGLE";
        }
    }
}
