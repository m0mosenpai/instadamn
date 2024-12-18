package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;

/* renamed from: X.Rvi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61910Rvi {
    public static String A00(int i) {
        switch (i) {
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "FEED_COLD_START_DB_CACHE";
            case Process.SIGSTOP /* 19 */:
                return "FEED_WARM_TTI";
            case 22:
                return "NNFColdStartTTI";
            case 48:
                return "FEED_PERMALINK_NOTIFICATION_LOAD";
            case 49:
                return "FEED_NNF_PERMALINK_ANDROID_NOTIFICATION_WARM_LOAD";
            case 52:
                return "FEED_NNF_PERMALINK_ANDROID_NOTIFICATION_COLD_LOAD";
            case 150:
                return "FEED_FEED_SCROLLING";
            case 165:
                return "FEED_FRESH_FEED_RERANK";
            case 184:
                return "FEED_NETWORK_FETCH";
            case 185:
                return "FEED_CACHE_FETCH";
            case 186:
                return "FEED_LOAD";
            case 195:
                return "FEED_LOAD_STORY_PERMALINK_FROM_ANYWHERE";
            case 197:
                return "FEED_LOAD_ANY_DESTINATION_FROM_NOTIFICATIONS";
            case 198:
                return "FEED_LOAD_THREADED_PERMALINK_FROM_ANYWHERE";
            case 206:
                return "FEED_CONSUMPTION_RESTORATION_ANDROID";
            case 212:
                return "FEED_PHOTOS_FEED_TTI";
            case 221:
                return "FEED_CACHE_WRITE";
            case 245:
                return "FEED_IMAGE_REQUEST";
            case 277:
                return "FEED_FULL_CACHE_HANDLER";
            case 286:
                return "FEED_CLEAR";
            case 288:
                return "FEED_DB_TRIM_TO_MINIMUM";
            case 289:
                return "FEED_DB_TRIM_TO_NOTHING";
            case 291:
                return "FEED_DELETE_POST";
            case 293:
                return "FEED_FEED_BOTTOM_COLLISION";
            case 1107:
                return "FEED_NOTIFICATION_TO_FEED_FUNNEL";
            case 2562:
                return "FEED_HOME_BADGING_FUNNEL";
            case 2893:
                return "FEED_DUPLICATE_STORIES_LOGGER";
            case 2993:
                return "FEED_END_OF_FEED_EXPERIENCE";
            case 3293:
                return "FEED_PREFETCH";
            case 3850:
                return "FEED_DB_VALIDATION_STATE";
            case 4174:
                return "FEED_BACKGROUND_PREFETCH";
            case 4397:
                return "FEED_UFI_BUTTONS_FUNNEL";
            case 4496:
                return "FEED_FETCH_DELAYED_MENU_ACTIONS";
            case 4682:
                return "FEED_SIF_DEDUP";
            case 4904:
                return "FEED_SESSIONS_DISTRIBUTION";
            case 5514:
                return "FEED_ORGANIC_POOL_CONTAINER";
            case 5608:
                return "FEED_TOP_POS_CACHE_RERANK";
            case 5642:
                return "FEED_FEED_SEEN_STATE";
            case 6210:
                return "FEED_NEGATIVE_FEEDBACK_ACTION";
            case 8123:
                return "FEED_ADJACENT_ACTOR_VALIDATOR";
            case 8532:
                return "FEED_CACHE_TTL";
            case 9461:
                return "FEED_FEED_FILTERS_USER_FLOW_HOME";
            case 10877:
                return "FEED_CACHE_RELOCATE";
            case 11118:
                return "FEED_INLINE_RELATED_POSTS";
            case 11686:
                return "FEED_PRIVACY_INVALIDATION";
            case 12092:
                return "FEED_CACHE_PRUNING";
            case 12326:
                return "FEED_END_OF_FEED_CARDS";
            case 12904:
                return "FEED_FEED_FILTERS_USER_FLOW_FAVORITES";
            case 13661:
                return "FEED_PARTIAL_STORY_EVENTS";
            case 14319:
                return "FEED_LOAD_STORY_FROM_NOTIFICATIONS";
            case 14862:
                return "FEED_FEED_FILTERS_USER_FLOW_MOST_RECENT";
            case 14995:
                return "FEED_WARM_START_PERSONALIZATION";
            case 15148:
                return "FEED_FEED_FILTERS";
            case 15421:
                return "FEED_BLING_BAR_FUNNEL";
            case 15616:
                return "FEED_SEEN_OUTSIDE_FEED";
            case 16342:
                return "FEED_SMSL_TREATMENT_E2E";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
