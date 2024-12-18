package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Kmf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46784Kmf {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FAILED";
            case 2:
                return "ACTIVE_VIDEO_CALL";
            case 3:
                return "UNSEEN_VISUAL";
            case 4:
                return "UNSEEN_THREAD";
            case 5:
                return "VISUAL_SENT";
            case 6:
                return "PRESENCE";
            case 7:
                return "TYPING_SEEN_THREAD";
            case 8:
                return "TYPING_UNSEEN_VISUAL";
            case 9:
                return "TYPING_UNSEEN_THREAD";
            case 10:
                return "RESTRICTED_ACCOUNT";
            case 11:
                return "SENDING_STATE";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "SEEN_STATE";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "SENT_STATE";
            case 14:
                return "RECEIVED";
            case Process.SIGTERM /* 15 */:
                return "UNSEEN_MISSED_CALL";
            case 16:
                return "DRAFT";
            case 17:
                return "TAP_TO_CHAT";
            case 18:
                return "WATCH_STATE";
            case Process.SIGSTOP /* 19 */:
                return "MUTED_WORDS_THREAD";
            case 20:
                return "UNSEEN_SELECTIVE_SYNC_BROADCAST_THREAD";
            case 21:
                return "AUTO_ENDED_THREAD";
            case 22:
                return "MANUAL_ENDED_THREAD";
            case 23:
                return "TAKEN_DOWN_CHANNEL";
            case 24:
                return "UNSEEN_MISSED_DISAPPEARING_MESSAGE";
            default:
                return "DEFAULT";
        }
    }
}
