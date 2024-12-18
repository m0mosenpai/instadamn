package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9yG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225979yG {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PERMANENT_VIDEO_COVER";
            case 2:
                return "EPHEMERAL_IMAGE";
            case 3:
                return "EPHEMERAL_VIDEO_COVER";
            case 4:
                return "REEL_RESHARE";
            case 5:
                return "FEED_IMAGE_RESHARE";
            case 6:
                return "STORY_RESHARE";
            case 7:
                return "STORY_REPLY";
            case 8:
                return "STORY_MENTION";
            case 9:
                return "STORY_OTHER";
            case 10:
                return "STACKS_IMAGE";
            case 11:
                return "STACKS_VIDEO_COVER";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "LINK_PREVIEW";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "XMA_OTHER";
            case 14:
                return "OTHER";
            case Process.SIGTERM /* 15 */:
                return "AVATAR_STICKER";
            default:
                return "PERMANENT_IMAGE";
        }
    }
}
