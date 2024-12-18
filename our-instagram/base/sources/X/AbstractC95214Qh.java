package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.4Qh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC95214Qh {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "IG_FEED_PROVIDER";
            case 2:
                return "IG_STORY_PROVIDER";
            case 3:
                return "IG_REELS_CLIP_PROVIDER";
            case 4:
                return "IG_BROADCAST_PROVIDER";
            case 5:
                return "IG_IGTV_PROVIDER";
            case 6:
                return "IG_BK_PROVIDER";
            case 7:
                return "IG_DISCOVERY_PROVIDER";
            case 8:
                return "IG_CLIPS_MIDCARD_PROVIDER";
            case 9:
                return "IG_CLIPS_MULTIADS_PROVIDER";
            case 10:
                return AbstractC111324zv.A00(3661);
            case 11:
                return "FB_PROVIDER";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "IG_DIRECT_PRIVACY_AWARE_PROVIDER";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "IG_MEDIA_METADATA_PROVIDER";
            case 14:
                return "IG_MUSIC_PROVIDER";
            case Process.SIGTERM /* 15 */:
                return "IG_COWATCH";
            case 16:
                return AbstractC111324zv.A00(1859);
            case 17:
                return "OC_HERO_PROVIDER";
            default:
                return "NO_OP_PROVIDER";
        }
    }
}
