package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Ryo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62079Ryo {
    public static String A00(int i) {
        if (i == 5) {
            return "SCROLL_PERF_NEWSFEED_SCROLLING";
        }
        if (i == 6) {
            return "SCROLL_PERF_OTHER_SURFACE_SCROLLING";
        }
        if (i == 9) {
            return "SCROLL_PERF_OTHER_SURFACE_SCROLLING_DIAG";
        }
        if (i == 10) {
            return "SCROLL_PERF_NEWSFEED_SCROLLING_DIAG";
        }
        switch (i) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "SCROLL_PERF_IG_SCROLL_PERF";
            case 1014:
                return "SCROLL_PERF_NEWSFEED_STARTUP_SCROLLING";
            case 2756:
                return "OTHER_SURFACE_SCROLLING_PIVOT_WATCHFEEDORWARIONFRAGMENT_WARION_VDD_FEED";
            case 4939:
                return "NEWSFEED_SCROLLING_FEED_UNIT_STORY_SPONSORED_VIDEO";
            case 4974:
                return "NEWSFEED_SCROLLING_FEED_UNIT_STORY_SPONSORED_VIDEO_DIRECT_RESPONSE_AUTOPLAY";
            case 5417:
                return "NEWSFEED_SCROLLING_FEED_UNIT_STORY_SPONSORED_VIDEO_DIRECT_RESPONSE";
            case 6568:
                return "OTHER_SURFACE_SCROLLING_WATCHFEEDORWARIONFRAGMENT_UNIFIED_VIDEO_PLAYER";
            case 9158:
                return "SCROLL_PERF_NEWSFEED_SCROLLING_FEED_UNIT";
            case 9375:
                return "OTHER_SURFACE_SCROLLING_WATCHFEEDORWARIONFRAGMENT_WARION_VDD_FEED";
            case 10623:
                return "SCROLL_PERF_OTHER_SURFACE_SCROLLING_PIVOT";
            case 11822:
                return "NEWSFEED_SCROLLING_FEED_UNIT_STORY_SPONSORED_SHARE";
            case 13400:
                return "SCROLL_PERF_IG_SCROLL_PERF_AGGREGATED";
            case 15051:
                return "OTHER_SURFACE_SCROLLING_PIVOT_WATCHFEEDORWARIONFRAGMENT_UNIFIED_VIDEO_PLAYER";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
