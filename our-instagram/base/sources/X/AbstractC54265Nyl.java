package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Nyl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54265Nyl {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "broadcast_join_attempt";
            case 1:
                return "broadcast_started";
            case 2:
                return "broadcast_aborted";
            case 3:
                return "broadcast_ended";
            case 4:
                return "broadcast_updated";
            case 5:
                return "broadcast_paused";
            case 6:
                return "broadcast_resumed";
            case 7:
                return "broadcast_debug";
            case 8:
                return "broadcast_error";
            case 9:
                return "broadcast_endscreen_dismissed";
            case 10:
                return "broadcast_got_audio_focus";
            case 11:
                return "broadcast_rejected_audio_focus";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "broadcast_lost_audio_focus";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "broadcast_summary";
            case 14:
                return "broadcast_camera_flip";
            case Process.SIGTERM /* 15 */:
                return "face_effect_button_impression";
            case 16:
                return "face_effect_updated";
            case 17:
                return "broadcast_stats";
            case 18:
                return "broadcast_viewer_count_button_tap";
            case Process.SIGSTOP /* 19 */:
                return "broadcast_viewers_list_impression";
            case 20:
                return "broadcast_user_joined_comment_tap";
            case 21:
                return "comments_expanded";
            case 22:
                return "comments_collapsed";
            default:
                return "tap_header";
        }
    }
}
