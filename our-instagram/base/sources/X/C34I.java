package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.34I, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C34I {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "reels_tab_clicked";
            case 2:
                return "reels_ad_impressed";
            case 3:
                return "reels_ad_pod_impressed";
            case 4:
                return "feed_impressed";
            case 5:
                return "feed_ad_hp1_impressed";
            case 6:
                return "feed_ad_hp1_eligible";
            case 7:
                return "feed_eof_hp1_impressed";
            case 8:
                return "feed_eof_impressed";
            case 9:
                return "feed_ifr_hp1_impressed";
            case 10:
                return "feed_ifr_impressed";
            case 11:
                return "reels_overlay_ad_impressed";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "reels_ready_to_show_overlay_ad";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "feed_ad_gap0_impressed";
            case 14:
                return "feed_ad_pos8_impressed";
            case Process.SIGTERM /* 15 */:
                return "last_navigation_surface";
            case 16:
                return "explore_search_clicked";
            case 17:
                return "feed_afi_responded";
            case 18:
                return "feed_afi_responded_less";
            default:
                return "feed_afi_responded_more";
        }
    }
}
