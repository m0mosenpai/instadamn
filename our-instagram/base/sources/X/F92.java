package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes6.dex */
public abstract class F92 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ig_non_contact";
            case 2:
                return "ig_people_non_contact";
            case 3:
                return "ig_business_non_contact";
            case 4:
                return "fb_friend";
            case 5:
                return "fb_non_friend";
            case 6:
                return "ig_only_group";
            case 7:
                return "xac_group";
            case 8:
                return "reel";
            case 9:
                return "unjoined_social_channel";
            case 10:
                return "joined_social_channel";
            case 11:
                return "unjoined_broadcast_channel";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "joined_broadcast_channel";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "unjoined_subscriber_social_channel";
            case 14:
                return "joined_subscriber_social_channel";
            case Process.SIGTERM /* 15 */:
                return "unjoined_subscriber_broadcast_channel";
            case 16:
                return "joined_subscriber_broadcast_channel";
            case 17:
                return "channel_direct_invites_suggested";
            case 18:
                return "channel_direct_invites_categories";
            case Process.SIGSTOP /* 19 */:
                return "ai_agent";
            case 20:
                return "ugc_agent";
            case 21:
                return "invite_contact";
            default:
                return "ig_contact";
        }
    }
}
