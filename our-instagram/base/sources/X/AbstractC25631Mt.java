package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.1Mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC25631Mt {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "warm_start_with_feed";
            case 2:
                return "background_prefetch";
            case 3:
                return "pull_to_refresh";
            case 4:
                return "fragment_refresh";
            case 5:
                return "auto_refresh";
            case 6:
                return "pagination";
            case 7:
                return "profile_stories";
            case 8:
                return "following_feed";
            case 9:
                return "realtime_push";
            case 10:
                return "realtime_push_pending";
            case 11:
                return "reconnection_refresh";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "group_stories_filter";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "group_stories_full";
            case 14:
                return "digital_reset";
            default:
                return "cold_start";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "COLD_START";
            case 1:
                return "WARM_START_WITH_FEED";
            case 2:
                return "BACKGROUND_PREFETCH";
            case 3:
                return "PULL_TO_REFRESH";
            case 4:
                return "FRAGMENT_REFRESH";
            case 5:
                return "AUTO_REFRESH";
            case 6:
                return "PAGINATION";
            case 7:
                return "PROFILE_STORIES";
            case 8:
                return "FOLLOWING_FEED";
            case 9:
                return "REALTIME_PUSH";
            case 10:
                return "REALTIME_PUSH_PENDING";
            case 11:
                return "RECONNECTION_REFRESH";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "GROUP_STORIES_FILTER";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "GROUP_STORIES_FULL";
            default:
                return "DIGITAL_RESET";
        }
    }
}
