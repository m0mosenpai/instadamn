package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import go.Seq;

/* renamed from: X.RzK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62111RzK {
    public static String A00(int i) {
        if (i == 3) {
            return "VIDEO_FULLSCREEN_TRANSITION";
        }
        if (i == 4) {
            return "VIDEO_PREFETCH_ITEM";
        }
        if (i == 9) {
            return "VIDEO_VIDEO_HOME_LOADING";
        }
        if (i == 10) {
            return "VIDEO_VIDEO_HOME_FUNNEL";
        }
        if (i == 17) {
            return "VIDEO_QUALITY_SUMMARY_EVENT";
        }
        if (i == 18) {
            return "VIDEO_VIDEO_PLAYBACK_STALL";
        }
        if (i == 38) {
            return "VIDEO_VIDEO_QUALITIES";
        }
        if (i == 39) {
            return "VIDEO_WATCH_TAB_SCROLL_PERF";
        }
        switch (i) {
            case 1:
                return "VIDEO_INITIALIZATION";
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return "VIDEO_PLAYER_INIT";
            case 43:
                return "VIDEO_BIND_PLAYER_SERVICE";
            case 44:
                return "VIDEO_PLAYER_ACTION";
            case 45:
                return "VIDEO_VIDEO_PLAYBACK_STALL_DATA";
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return "VIDEO_VIDEO_FETCH_REQUEST_EVENT";
            case 47:
                return "VIDEO_THUMBNAIL";
            case 48:
                return "VIDEO_HERO_MODULE_INIT";
            case 49:
                return "VIDEO_HERO_MODULE_DOWNLOAD";
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return "VIDEO_RVP_PLUGIN_LOAD";
            case 59:
                return "VIDEO_START_AD_BREAK_ANDROID";
            case 61:
                return "Enter in-stream ads responsiveness measuring";
            case 64:
                return "VIDEO_MOUNT_GROOT_VIDEO_COMPONENT";
            case 65:
                return "VIDEO_GROOT_VIDEO_TRANSITION";
            case 67:
                return "VIDEO_WARION_ARLTW_TTI";
            case 69:
                return "VIDEO_WATCH_ARLTW_RELATED_VIDEO_SCROLL_PERF";
            case 70:
                return "VIDEO_FULLSCREEN_LIVE_TRANSITION";
            case 71:
                return "VIDEO_LIVE_FULLSCREEN_ENTER_30S_RESPONSIVENESS";
            case 79:
                return "VIDEO_VIDEO_COMPONENT_STATE";
            case 80:
                return "VIDEO_HERO_PLAYER_STATE";
            case 81:
                return "VIDEO_FBGROOT_PLAYER_STATE";
            case 82:
                return "VIDEO_GROOT_FS_DECISION_EVENT";
            case 83:
                return "VIDEO_ANDROID_VIDEO_BLACKSCREEN_EVENT";
            case 1210:
                return "VIDEO_VIDEO_EGRESS";
            case 1651:
                return "VIDEO_STARTUP_WITH_VIDEO";
            case 2747:
                return "VIDEO_BACKGROUND_PLAYBACK_TRANSITION";
            case 4120:
                return "VIDEO_FBGROOT_PLAYER_WARNING";
            case 4382:
                return "VIDEO_VIDEO_PLAYBACK_START";
            case 4383:
                return "VIDEO_TURN_ON_CAPTIONS_FLOW";
            case 5786:
                return "VIDEO_VIDEO_HOME_DATA_CONTROLLER_DEBUG";
            case 5918:
                return "VIDEO_VIDEO_PREFETCH";
            case 8408:
                return "VIDEO_WARM_START_WITH_VIDEO";
            case 8460:
                return "VIDEO_MEDIA_CODEC_LIFECYCLE";
            case 8771:
                return "VIDEO_FBGROOT_PLAYER_ERROR";
            case 9693:
                return "VIDEO_MEDIA_CODEC_CAPABILITY";
            case 9878:
                return "VIDEO_RVP_PLAYBACK_REASON";
            case 10198:
                return "VIDEO_ANDROID_GROOT_COMPONENT_EVENT";
            case 10287:
                return "VIDEO_RVP_USAGE_LOGGING";
            case 10852:
                return "VIDEO_HOT_START_WITH_VIDEO";
            case 10919:
                return "VIDEO_PLAYER_PROFILE";
            case 11655:
                return "VIDEO_PLUGIN_CONTAINER_MOUNT";
            case 12709:
                return "VIDEO_MEDIA_PLAYLIST_CREATION_FLOW";
            case 14256:
                return "VIDEO_VIDEO_SOUND_BTN_STATE";
            case 16162:
                return "VIDEO_COLD_START_WITH_VIDEO";
            case 17171:
                return "VIDEO_WWW_TEST_EVENT_FOR_CONNOR";
            default:
                switch (i) {
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        return "VIDEO_VIDEO_PLAYBACK_EVENT";
                    case 14:
                        return "VIDEO_CHANNEL_TRANSITION";
                    case Process.SIGTERM /* 15 */:
                        return "VIDEO_VIDEO_UNUSED";
                    default:
                        switch (i) {
                            case 22:
                                return "VIDEO_SOCIAL_PLAYER_TRANSITION";
                            case 23:
                                return "VIDEO_DISMISS_VIDEO";
                            case 24:
                                return "VIDEO_PLAYER_BACK_BTN_PRESSED";
                            default:
                                switch (i) {
                                    case 26:
                                        return "VIDEO_RICH_VIDEO_PLAYER_EVENTS";
                                    case 27:
                                        return "VIDEO_JEWEL_NOTIFICATION_TO_PLAYBACK";
                                    case 28:
                                        return "VIDEO_PREPARE_FEED_VIDEO";
                                    default:
                                        switch (i) {
                                            case 32:
                                                return "VIDEO_HTTP_TRANSFER_EVENT";
                                            case 33:
                                                return "VIDEO_WATCH_TAB_E2E_TTI";
                                            case 34:
                                                return "VIDEO_VIDEO_PLAYBACK_STATE";
                                            case 35:
                                                return "VIDEO_MOUNT_FEED_VIDEO";
                                            case 36:
                                                return "VIDEO_ABR_DECISION";
                                            default:
                                                switch (i) {
                                                    case 52:
                                                        return "VIDEO_VIDEO_PROFILER_START";
                                                    case 53:
                                                        return "VIDEO_SCURBBER";
                                                    case 54:
                                                        return "VIDEO_STORY_VIDEO_PROFILER_START";
                                                    case 55:
                                                        return "VIDEO_PARSE_SEGMENT_TIMELINE_ANDROID";
                                                    case 56:
                                                        return "VIDEO_HERO_LIVE_MODULE_DOWNLOAD";
                                                    case 57:
                                                        return "VIDEO_CHANNEL_FEED_UP_NEXT_TTI_ANDROID_VIDEO";
                                                    default:
                                                        return "UNDEFINED_QPL_EVENT";
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
