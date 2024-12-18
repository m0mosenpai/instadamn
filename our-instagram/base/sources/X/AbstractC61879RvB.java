package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.react.modules.base.IgReactQEModule;

@Deprecated
/* renamed from: X.RvB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61879RvB {
    public static String A00(int i) {
        short s = (short) (i & 65535);
        switch ((short) (i >> 16)) {
            case 3:
                return RyI.A00(s);
            case 6:
                return AbstractC61888RvK.A00(s);
            case 7:
                return AbstractC62080Ryp.A00(s);
            case 8:
                if (s == 12) {
                    return "TEST_MODULE_ONE_TEST_EVENT_ONE";
                }
                switch (s) {
                    case 16:
                        return "TEST_MODULE_ONE_TEST_EVENT_TWO";
                    case 17:
                        return "TEST_MODULE_ONE_TEST_EVENT_THREE";
                    case 18:
                        return "TEST_MODULE_ONE_TEST_EVENT_FOUR";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 9:
                if (s == 19) {
                    return "TEST_MODULE_TWO_TEST_EVENT_ONE";
                }
                switch (s) {
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        return "TEST_MODULE_TWO_TEST_EVENT_TWO";
                    case 14:
                        return "TEST_MODULE_TWO_TEST_EVENT_THREE";
                    case Process.SIGTERM /* 15 */:
                        return "TEST_MODULE_TWO_TEST_EVENT_FOUR";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 10:
                return AbstractC61910Rvi.A00(s);
            case 14:
                return AbstractC61873Rv5.A00(s);
            case Process.SIGTERM /* 15 */:
                return s == 2 ? "DRAWABLEHIERARCHY_IMAGE_DISPLAY" : "UNDEFINED_QPL_EVENT";
            case Process.SIGSTOP /* 19 */:
                return RyC.A00(s);
            case 20:
                return RyJ.A00(s);
            case 21:
                return RyK.A00(s);
            case 24:
                return s != 4 ? s != 21 ? s == 22 ? "SAVED_SAVE_COLLECTION_VIEW_TTRC" : "UNDEFINED_QPL_EVENT" : "SAVED_SAVE_DASHBOARD_TTRC" : "Save Dashboard TTI (RN)";
            case 26:
                return AbstractC62105RzE.A00(s);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC62111RzK.A00(s);
            case 30:
                return AbstractC62068Ryd.A00(s);
            case 32:
                return AbstractC61931Rw3.A00(s);
            case 35:
                return AbstractC61996Rx6.A00(s);
            case 40:
                return s == 7 ? "BOOKMARK_BOOKMARKS_TTRC" : "UNDEFINED_QPL_EVENT";
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return s == 1 ? "PYMK_PAGINATED_PYMK_TTI" : "UNDEFINED_QPL_EVENT";
            case 47:
                return s != 6 ? s != 7 ? s != 8 ? s != 15 ? s != 22 ? s == 32 ? "FRIENDING_FRIENDS_TAB_TAIL_LOAD" : "UNDEFINED_QPL_EVENT" : "FRIENDING_TTRC_JEWEL_FB4A" : "FRIENDING_FRIENDS_TAB_WITH_ACTIVE_TTI_METRIC_NAME" : "FRIENDING_FRIENDS_TAB_TTI_METRIC_NAME" : "FRIENDING_NUX_ADD_FRIENDS_STEP_TTI" : "FRIENDING_FRIEND_REQUESTS_HARRISON_TAB_SWITCH_TTI";
            case 48:
                return s != 3 ? s != 4 ? s != 8 ? s == 15 ? "FRIENDS_NEARBY_NEARBY_FRIENDS_DASHBOARD_TTRC" : "UNDEFINED_QPL_EVENT" : "FRIENDS_NEARBY_DASHBOARD_TTI" : "FRIENDS_NEARBY_DASHBOARD_FETCH_DATA1" : "FRIENDS_NEARBY_DASHBOARD_FETCH_DATA";
            case 49:
                return AbstractC61929Rw1.A00(s);
            case 53:
                return AbstractC62051Rxz.A00(s);
            case 57:
                return AbstractC62108RzH.A00(s);
            case 61:
                return AbstractC61982Rws.A00(s);
            case 62:
                return AbstractC61920Rvs.A00(s);
            case 64:
                return s != 1 ? s != 3 ? s != 3619 ? s == 5918 ? "REGISTRATION_CONFIRMATION_PROD" : "UNDEFINED_QPL_EVENT" : "REGISTRATION_ACCOUNT_CREATION_PROD" : "REGISTRATION_PERF_LOGGING_REGISTRATION_LOGIN" : "REGISTRATION_PERF_LOGGING_ACCOUNT_CREATION";
            case 68:
                if (s == 3) {
                    return "RESOURCES_FB_RESOURCES_DOWNLOAD_FILE";
                }
                if (s == 4) {
                    return "RESOURCES_FB_RESOURCES_WAITING_ACTIVITY";
                }
                switch (s) {
                    case 7:
                        return "RESOURCES_FB_QT_RESOURCES_DOWNLOAD";
                    case 8:
                        return "RESOURCES_FB_QT_RESOURCES_LOADING";
                    case 9:
                        return "RESOURCES_FB_QT_RESOURCES_PROCESS_NEW";
                    case 10:
                        return "RESOURCES_FB_REACT_NATIVE_RESOURCES_DOWNLOAD_FILE";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 74:
                return AbstractC62050Rxy.A00(s);
            case 75:
                return s != 1 ? s != 11 ? s != 14 ? s == 15 ? "GOODWILL_MEMORIES_TAIL_LOAD_TTI" : "UNDEFINED_QPL_EVENT" : "GOODWILL_GPS_SCROLL_PERF" : "GOODWILL_MEMORIES_HOME_TTRC" : "GOODWILL_THROWBACK_FEED_TTI";
            case 78:
                return s == 3 ? "SignalAuthComponentsOnAuthComplete" : "UNDEFINED_QPL_EVENT";
            case 84:
                return AbstractC62012RxM.A00(s);
            case 85:
                return s == 1 ? "PRESENCE_NOW_NOW_PERF_STATUS_LIST_LOADED_FRESH" : "UNDEFINED_QPL_EVENT";
            case 86:
                return Ry0.A00(s);
            case 89:
                return s == 18 ? "MQTT_MQTT_HANDLE_PAYLOAD_FOR_GRAPHQL_SUBSCRIPTION" : "UNDEFINED_QPL_EVENT";
            case 90:
                return s == 1 ? "AD_INTERFACES_LOAD_AD_INTERFACE" : "UNDEFINED_QPL_EVENT";
            case 92:
                return s == 1 ? "INSTANT_ARTICLES_INSTANT_ARTICLE_LOAD" : "UNDEFINED_QPL_EVENT";
            case 94:
                return s == 1 ? "STACKS_CAPTURE_PHOTO_TTI" : "UNDEFINED_QPL_EVENT";
            case 99:
                if (s == 7) {
                    return "APP_TAB_PERF_LOAD_TAB_MESSAGE";
                }
                switch (s) {
                    case 10:
                        return "APP_TAB_PERF_LOAD_TAB_NOTIFICATIONS";
                    case 11:
                        return "APP_TAB_PERF_LOAD_TAB_NOTIFICATIONS_NOANIM";
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        return "APP_TAB_PERF_LOAD_TAB_BOOKMARK_NOANIM";
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        return "APP_TAB_PERF_LOAD_TAB_BOOKMARK";
                    case 14:
                        return "APP_TAB_PERF_NOP_MARKER";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 101:
                return s != 1 ? s == 2 ? "GRAPH_STORE_CACHE_GET" : "UNDEFINED_QPL_EVENT" : "GRAPH_STORE_CACHE_PUT";
            case 107:
                return s != 1 ? s == 2 ? "PAGINATOR_PREVCLICK" : "UNDEFINED_QPL_EVENT" : "PAGINATOR_NEXTCLICK";
            case 108:
                return s != 1 ? s != 2 ? s != 3 ? s != 4 ? s == 5 ? "COMMERCE_REVIEW_COMPOSER_TTI" : "UNDEFINED_QPL_EVENT" : "COMMERCE_B2C_TTI" : "COMMERCE_ANDROID_COMMERCE_VIEW_PRODUCT_DETAILS" : "COMMERCE_ANDROID_COMMERCE_VIEW_STOREFRONT" : "COMMERCE_ANDROID_COMMERCE_VIEW_STOREFRONT_COLLECTION";
            case 110:
                return AbstractC62053RyO.A00(s);
            case 112:
                return s == 21 ? "COLD_START_APPLICATION_CREATE" : "UNDEFINED_QPL_EVENT";
            case 115:
                return RyM.A00(s);
            case 118:
                return AbstractC61818RuC.A00(s);
            case 119:
                return AbstractC62064RyZ.A00(s);
            case HucClient.BODY_UPLOAD_TIMEOUT_SECONDS /* 120 */:
                return AbstractC61932Rw4.A00(s);
            case 122:
                return s != 3 ? s == 14179 ? "RELAY_FETCH_QUERY" : "UNDEFINED_QPL_EVENT" : "RELAY_PREFETCHER_FETCH_QUERY";
            case 123:
                return s != 5 ? s != 6 ? s == 7 ? "PLATFORM_COMPOSER_ACTIVITY_TTI" : "UNDEFINED_QPL_EVENT" : "PLATFORM_SHARE_INTENT_HANDLER_PHASE" : "PLATFORM_SHARE_TTI";
            case 124:
                return AbstractC61998Rx8.A00(s);
            case StringTreeSet.MAX_SYMBOL_COUNT /* 127 */:
                return s != 6358 ? s != 9329 ? s == 15409 ? "TEST_IOS_MODULE_TEST_EVENT_SHARDS" : "UNDEFINED_QPL_EVENT" : "TEST_IOS_MODULE_KLI302_TEST" : "TEST_IOS_MODULE_TEST_EVENT_22";
            case 129:
                return s == 1 ? "QUICKER_EXPERIMENT_SESSIONED_STORE_INITIALIZE" : "UNDEFINED_QPL_EVENT";
            case 130:
                return AbstractC62069Rye.A00(s);
            case 133:
                return AbstractC61930Rw2.A00(s);
            case 136:
                return s != 9 ? s == 1612 ? "DEXTRICKS_ADD_DEX_PATH" : "UNDEFINED_QPL_EVENT" : "DEXTRICKS_MDCL_INSTALL_FIRST";
            case 138:
                return AbstractC61872Rv4.A00(s);
            case 139:
                return s == 4 ? "OFFERS_OFFER_ADS_DETAILS_TTRC" : "UNDEFINED_QPL_EVENT";
            case 141:
                return AbstractC62056RyR.A00(s);
            case 148:
                return AbstractC61997Rx7.A00(s);
            case 149:
                return s != 1 ? s == 2 ? "GRAPHQL_ANROID_CONSISTENCY_CONFIRMED_OPERATION" : "UNDEFINED_QPL_EVENT" : "GRAPHQL_ANROID_CONSISTENCY_OPTIMISTIC_OPERATION";
            case 151:
                return RyD.A00(s);
            case 152:
                return RyL.A00(s);
            case 154:
                return s == 1 ? "PAGES_PLATFORM_TIME_TO_BOOTSTRAP" : "UNDEFINED_QPL_EVENT";
            case 156:
                return AbstractC62113RzM.A00(s);
            case 161:
                return s != 2 ? s != 3 ? s == 4 ? "INSPIRATIONS_CAMERAFRAGMENT_ONRESUME" : "UNDEFINED_QPL_EVENT" : "INSPIRATIONS_CAMERAFRAGMENT_ONCREATEVIEW" : "INSPIRATIONS_CAMERAFRAGMENT_ONCREATE";
            case 168:
                return s == 2 ? "SESSION_INITIALIZATION_PROF_ERR_STACK_OVERFLOWS" : "UNDEFINED_QPL_EVENT";
            case 169:
                return AbstractC62004RxE.A00(s);
            case 172:
                return AbstractC61864Ruw.A00(s);
            case 173:
                return AbstractC61831RuP.A00(s);
            case 178:
                return s != 5 ? s != 8 ? s == 14 ? "COMPONENT_SCRIPT_NATIVE_COMPONENT_LAYOUT" : "UNDEFINED_QPL_EVENT" : "COMPONENT_SCRIPT_CREATE_LAYOUT" : "COMPONENT_SCRIPT_COMPONENT_SCRIPT_INITIALIZER";
            case 179:
                return s != 5 ? s == 6 ? "PROFILE_DISCOVERY_CURATION_DISCOVERY_SCOPED_VIEW_INITIAL_LOAD" : "UNDEFINED_QPL_EVENT" : "PROFILE_DISCOVERY_CURATION_DISCOVERY_HOME_INITIAL_LOAD";
            case 181:
                return s != 2 ? s != 3 ? s == 4 ? "CLOUDSEEDER_TRACE_EXCEPTION" : "UNDEFINED_QPL_EVENT" : "CLOUDSEEDER_SOCKET_TRACE_LONG_VIDEO" : "CLOUDSEEDER_SOCKET_TRACE";
            case 182:
                return AbstractC62054RyP.A00(s);
            case 185:
                return AbstractC61867Ruz.A00(s);
            case 188:
                return s != 1 ? s != 5 ? s == 6 ? "SNACKS_DIRECT_INBOX_LOAD_TTI" : "UNDEFINED_QPL_EVENT" : "SNACKS_DIRECT_REPLY_THREAD_LOAD_TTI" : "SNACKS_SHARESHEET_LOADING_TIME";
            case 190:
                return S0B.A00(s);
            case 192:
                if (s == 8416) {
                    return "NEWSFEED_ALIGN_FEED_POST";
                }
                switch (s) {
                    case 8:
                        return "NEWSFEED_NEWSFEED_TTRC";
                    case 9:
                        return "NEWSFEED_NEWSFEED_FAVORITES_TTRC";
                    case 10:
                        return "NEWSFEED_NEWSFEED_MOST_RECENT_TTRC";
                    case 11:
                        return "NEWSFEED_NEWSFEED_SEEN_TTRC";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 195:
                return AbstractC61988Rwy.A00(s);
            case 196:
                return AbstractC62048Rxw.A00(s);
            case 200:
                return s != 2 ? s != 3 ? s != 10908 ? s != 11454 ? s == 11482 ? "CHARITABLE_GIVING_FUNDRAISER_DONATION_ECP_OPTIMIZATION_NT_TTRC" : "UNDEFINED_QPL_EVENT" : "CHARITABLE_GIVING_FUNDRAISER_HUB_NT_TTI" : "CHARITABLE_GIVING_FUNDRAISER_DONATION_ECP_NT_TTRC" : "CHARITABLE_GIVING_FUNDRAISER_HUB_CREATE_RN_TTI" : "CHARITABLE_GIVING_FUNDRAISER_HUB_RN_TTI";
            case 202:
                return AbstractC62098Rz7.A00(s);
            case 203:
                return s == 8 ? "DIRECT_MEDIA_PICKER_PHOTOS_TTL" : "UNDEFINED_QPL_EVENT";
            case 204:
                return AbstractC62081Ryq.A00(s);
            case 206:
                return s == 1 ? "TEST_ANDROID_TESTYTEST" : "UNDEFINED_QPL_EVENT";
            case 208:
                return AbstractC62032Rxg.A00(s);
            case 211:
                return AbstractC62066Ryb.A00(s);
            case 212:
                return s != 2 ? s != 7761 ? s != 12325 ? s == 12731 ? "LIVEWITH_JOIN_AUDIO_CALL" : "UNDEFINED_QPL_EVENT" : "LIVEWITH_GUEST_INCOMING_RING" : "LIVEWITH_JOIN_CALL" : "LIVEWITH_LIVE_SWAP_TO_RTC";
            case 214:
                return s == 1 ? "TOPIC_FOLLOWING_TOPIC_STORIES_TTI" : "UNDEFINED_QPL_EVENT";
            case 216:
                return s == 3383 ? "MESSENGER_INBOX_ADS_POSTCLICK_INTERACTION" : "UNDEFINED_QPL_EVENT";
            case 217:
                return s == 3 ? "MESSENGER_DISCOVER_DISCOVER_TAB_FETCH_UNITS" : "UNDEFINED_QPL_EVENT";
            case 222:
                return AbstractC61994Rx4.A00(s);
            case 223:
                return s == 5 ? "BUSINESS_INTEGRITY_AD_ACTIVITY_FB4A" : "UNDEFINED_QPL_EVENT";
            case 227:
                return AbstractC61889RvL.A00(s);
            case 229:
                return s != 2 ? s == 3 ? "KEYFRAMES_DECODE" : "UNDEFINED_QPL_EVENT" : "Play Duration";
            case 230:
                return s == 1 ? "ANDROID_TRANSLITERATION_KEYBOARD_TRANSLITERATION_SUGGESTIONS_RETRIEVED" : "UNDEFINED_QPL_EVENT";
            case 231:
                return s == 1 ? "CAFFE_TWO_NET_DELAY" : "UNDEFINED_QPL_EVENT";
            case 233:
                return AbstractC62017RxR.A00(s);
            case 234:
                return AbstractC61954RwQ.A00(s);
            case 236:
                return s == 1 ? "MOBILE_JS_DEV_RELOAD_RELOAD" : "UNDEFINED_QPL_EVENT";
            case 238:
                return s != 7 ? s == 8 ? "PROFILE_ABOUT_RN_PROFILE_ABOUT_INITIAL_LOAD_TTRC_ANDROID" : "UNDEFINED_QPL_EVENT" : "PROFILE_ABOUT_RN_PROFILE_ABOUT_INITIAL_LOAD_TTRC";
            case 242:
                return s != 1 ? s != 2 ? s == 3 ? "CORE_HEALTH_JAVA_CRASH" : "UNDEFINED_QPL_EVENT" : "CORE_HEALTH_ANR_DETECT_DATA_CAPTURE" : "CORE_HEALTH_ANR_DETECT";
            case 243:
                return s != 5298 ? s != 8648 ? s != 11346 ? s != 11352 ? s == 11359 ? "AR_ENGINE_CAG_LATENCY" : "UNDEFINED_QPL_EVENT" : "AR_ENGINE_FC_EFFECT_RENDER_TEST_LINK" : "AR_ENGINE_MR_VIDEO_FRAME_UPDATE" : "AR_ENGINE_FC_EFFECT_RENDER" : "AR_ENGINE_INPUT_LATENCY";
            case 244:
                return AbstractC62079Ryo.A00(s);
            case 248:
                return AbstractC62078Ryn.A00(s);
            case 249:
                return AbstractC61863Ruv.A00(s);
            case 251:
                return s != 1 ? s != 2 ? s == 3 ? "IG_EXPLORE_IG_EXPLORE_TAIL_LOAD" : "UNDEFINED_QPL_EVENT" : "IG_EXPLORE_IG_EXPLORE_PTR_LOAD" : "IG_EXPLORE_IG_EXPLORE_TAB_LOAD";
            case 254:
                return s != 1 ? s != 13138 ? s == 14856 ? "IG_COMMENTS_CREATE_COMMENT" : "UNDEFINED_QPL_EVENT" : "IG_COMMENTS_IG_COMMENTS_FETCH" : "IG_COMMENTS_IG_COMMENTS_LOAD";
            case 258:
                return AbstractC61960RwW.A00(s);
            case 260:
                return s == 1 ? "HERMES_GC_BENCH" : "UNDEFINED_QPL_EVENT";
            case 263:
                return s != 1 ? s != 2 ? s != 3 ? s == 5 ? "LOCAL_SURFACE_ANDROID_PERF_SEARCH_RESULTS_TTI" : "UNDEFINED_QPL_EVENT" : "LOCAL_SURFACE_ANDROID_PERF_MAP_TTI" : "LOCAL_SURFACE_ANDROID_PERF_HEADER_TTI" : "LOCAL_SURFACE_ANDROID_PERF_CONTENT_TTI";
            case 264:
                return AbstractC61975Rwl.A00(s);
            case 265:
                return s != 1 ? s != 2 ? s == 3 ? "JSC_MOBILE_LAB_METRICS_MEASURE_MEMORY_DESTROYED" : "UNDEFINED_QPL_EVENT" : "JSC_MOBILE_LAB_METRICS_MEASURE_MEMORY_UNLOADED" : "JSC_MOBILE_LAB_METRICS_MEASURE_MEMORY";
            case 266:
                return s != 11 ? s == 12 ? "ANDROID_GRAPH_SERVICES_FEED_TREE_SERIALIZE" : "UNDEFINED_QPL_EVENT" : "ANDROID_GRAPH_SERVICES_FEED_TREE_DESERIALIZE";
            case 268:
                return s == 1 ? "STALL_TRACKER_STALL_TRACKER_SESSION" : "UNDEFINED_QPL_EVENT";
            case 269:
                return AbstractC61953RwP.A00(s);
            case 271:
                return AbstractC62029Rxd.A00(s);
            case 272:
                return s != 5 ? s != 6 ? s != 5915 ? s != 11380 ? s == 12983 ? "WATCH_WATCH_MANAGED_MOBILE_ERRORS" : "UNDEFINED_QPL_EVENT" : "WATCH_VIDEO_SHARE_FLOW" : "WATCH_CREATION_ON_WATCH_FLOW" : "WATCH_WATCH_DATA_FRESHNESS_EVENT" : "WATCH_WATCH_SPINNER_VPVD";
            case 273:
                return AbstractC62101RzA.A00(s);
            case 274:
                return s != 5 ? s != 1964 ? s != 4438 ? s != 9220 ? s == 14176 ? "TIGON_INIT" : "UNDEFINED_QPL_EVENT" : "TIGON_REQUEST_EXECUTION_CLIENT_SAMPLED" : "TIGON_REQUEST_EXECUTION_AGGREGATED" : "TIGON_CONNECTIVITY_CHECK" : "TIGON_REQUEST_EXECUTION";
            case 276:
                return s == 1 ? "BUNDLE_SPLITTING_FETCH_JS_SEGMENT" : "UNDEFINED_QPL_EVENT";
            case 279:
                return AbstractC61957RwT.A00(s);
            case 284:
                return s == 12264 ? "PROFILE_SET_AVATAR_PROFILE_PICTURE_FLOW" : "UNDEFINED_QPL_EVENT";
            case 286:
                return s == 2 ? "IG_VIDEO_ABR_DECISION" : "UNDEFINED_QPL_EVENT";
            case 289:
                return AbstractC61973Rwj.A00(s);
            case 291:
                return s != 2423 ? s != 3134 ? s != 6195 ? s == 13808 ? "IG_FEED_MINI_PREVIEW_PAYLOAD_INCORRECT_PADDING" : "UNDEFINED_QPL_EVENT" : "IG_FEED_THREADS_IN_IG" : "IG_FEED_TIFU_ERROR" : "IG_FEED_IG_OPEN_CAROUSEL_UNEXPECTED_EVENT";
            case 292:
                return AbstractC62003RxD.A00(s);
            case 293:
                return s != 1 ? s != 2 ? s != 3 ? s == 4 ? "PAGES_INSIGHTS_HOME_TTI" : "UNDEFINED_QPL_EVENT" : "PAGES_INSIGHTS_SINGLE_POST_TTI" : "PAGES_INSIGHTS_POST_LIST_TTI" : "PAGES_INSIGHTS_AUDIENCE_LIST_TTI";
            case 296:
                return s != 1 ? s == 2 ? "JSI_PERFTEST_MEMORY_UNLOADED" : "UNDEFINED_QPL_EVENT" : "JSI_PERFTEST_MEMORY";
            case 297:
                return s == 20 ? "FNF_FB4A_VIDEO_PLAYER_EVENT_DISPATCH" : "UNDEFINED_QPL_EVENT";
            case 299:
                return s != 1 ? s != 2 ? s == 3 ? "FBLITE_NETWORK_MESSAGES_FBLITE_NETWORK_PROFILING" : "UNDEFINED_QPL_EVENT" : "FBLITE_NETWORK_MESSAGES_RECEIVE_SERVER_MESSAGE" : "FBLITE_NETWORK_MESSAGES_SEND_CLIENT_MESSAGE";
            case DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD /* 300 */:
                return AbstractC61825RuJ.A00(s);
            case 302:
                return AbstractC61981Rwr.A00(s);
            case 305:
                return s == 1 ? "FBLITE_CONNECTION_STATE_FIZZ_MODULE" : "UNDEFINED_QPL_EVENT";
            case 307:
                return AbstractC61955RwR.A00(s);
            case 310:
                return s != 1 ? s == 2 ? "NATIVE_TEMPLATE_JS_INIT_JS_VM" : "UNDEFINED_QPL_EVENT" : "NATIVE_TEMPLATE_JS_EVAL_JS";
            case 314:
                return s != 1 ? s != 2 ? s != 15 ? s != 17 ? s == 7325 ? "GROUPS_ADMIN_GROUPS_ADMIN_MODULE" : "UNDEFINED_QPL_EVENT" : "GROUPS_ADMIN_PRIVACY_CHANGE" : "GROUPS_ADMIN_MEMBER_REQUESTS_TAIL_LOAD" : "GROUPS_ADMIN_TOOLS_TTI" : "GROUPS_ADMIN_MEMBER_SCREENING_INITIAL_TTI";
            case 315:
                return s != 1 ? s != 2 ? s != 3 ? s == 6 ? "IG_HASHTAG_PAGE_IG_HASHTAG_HEADER_LOAD" : "UNDEFINED_QPL_EVENT" : "IG_HASHTAG_PAGE_IG_HASHTAG_FEED_TAIL_LOAD" : "IG_HASHTAG_PAGE_IG_HASHTAG_FEED_PTR_LOAD" : "IG_HASHTAG_PAGE_IG_HASHTAG_FEED_TAB_LOAD";
            case 317:
                return s == 1 ? "SURVEY_ENG_PLATFORM_REMIX_SURVEY_LOAD_TIME_ANDROID" : "UNDEFINED_QPL_EVENT";
            case 318:
                return s != 1 ? s != 3 ? s != 9106 ? s == 10516 ? "PROFILE_INITIAL_LOAD_PROFILE_INNER_TAB_LOAD_ANDROID" : "UNDEFINED_QPL_EVENT" : "PROFILE_INITIAL_LOAD_USER_TIMELINE_GRAPHQL" : "PROFILE_INITIAL_LOAD_PROFILE_INITIAL_LOAD_TTRC_ANDROID" : "PROFILE_INITIAL_LOAD_PROFILE_INITIAL_LOAD";
            case 324:
                return s == 1 ? "CREATOR_APP_ANDROID_PERF_COLD_START" : "UNDEFINED_QPL_EVENT";
            case 325:
                return AbstractC61903Rvb.A00(s);
            case 326:
                return AbstractC62070Ryf.A00(s);
            case 327:
                return s != 1 ? s == 2 ? "MESSENGER_BROADCAST_FLOW_SHARE_TO_FACEBOOK_LOAD" : "UNDEFINED_QPL_EVENT" : "MESSENGER_BROADCAST_FLOW_STARTUP_LOAD";
            case 332:
                return s != 1 ? s != 3 ? s == 2816 ? "THREESIXTY_PHOTOS_SPHERICAL_PHOTO_METADATA_PARSING" : "UNDEFINED_QPL_EVENT" : "THREESIXTY_PHOTOS_EQUIRECT_TTI" : "THREESIXTY_PHOTOS_TILED_CUBEMAP_TTI";
            case 333:
                return s != 1 ? s != 2 ? s == 3 ? "PRIVATE_GALLERY_PAGINATION_TTI" : "UNDEFINED_QPL_EVENT" : "PRIVATE_GALLERY_THUMBNAIL_TTI" : "PRIVATE_GALLERY_GALLERY_TAB_TTI";
            case 336:
                return s != 2 ? s != 3 ? s != 4 ? s == 8 ? "MOBILELAB_MICROBENCHMARK_RESULT" : "UNDEFINED_QPL_EVENT" : "MOBILELAB_TRIMARK_FRAME" : "MOBILELAB_TRIMARK_RUN" : "MOBILELAB_TRIMARK_LOAD";
            case 338:
                return AbstractC61924Rvw.A00(s);
            case 341:
                return s != 3 ? s != 4 ? s != 5 ? s == 7 ? "STORIES_ARCHIVE_SCROLL_PERF" : "UNDEFINED_QPL_EVENT" : "STORIES_ARCHIVE_ARCHIVE_GRID_TTI" : "STORIES_ARCHIVE_THUMBNAIL_TTI" : "STORIES_ARCHIVE_PAGINATION_TTI";
            case 342:
                return AbstractC61833RuR.A00(s);
            case 346:
                return s != 1 ? s != 3 ? s == 5 ? "PRIVACY_ACTIVITY_LOG_TTI_LOAD_CATEGORY_STORIES_RN" : "UNDEFINED_QPL_EVENT" : "PRIVACY_ACTIVITY_LOG_TTI_PRIVACY_ACTIVITY_LOG_TTI" : "PRIVACY_ACTIVITY_LOG_TTI_ACTIVITY_LOG_SUCCESS";
            case 347:
                return s != 6092 ? s == 8039 ? "MESSENGER_LOGIN_MESSENGER_INSTALL_REFERRER_FETCH" : "UNDEFINED_QPL_EVENT" : "MESSENGER_LOGIN_MESSENGER_ANDROID_ACCESS_FLOW_FUNNEL_EVENT";
            case 349:
                return s != 1 ? s != 2 ? s != 3 ? s == 5 ? "MLKIT_MLKIT_FEATURE_EXTRACTION" : "UNDEFINED_QPL_EVENT" : "MLKIT_MLKIT_CLIENT_EVALUATOR_INIT" : "MLKIT_MLKIT_OPERATIONS_QUEUE_RUN" : "MLKIT_MLKIT_PREDICTION";
            case 350:
                return s == 1 ? "INSTANT_RENDER_CREATE_LAYOUT" : "UNDEFINED_QPL_EVENT";
            case 355:
                return AbstractC61866Ruy.A00(s);
            case 357:
                return s != 1 ? s != 3 ? s != 2849 ? s == 13861 ? "IG_IMAGE_PIPELINE_IMAGE_RENDER_LATENCY" : "UNDEFINED_QPL_EVENT" : "IG_IMAGE_PIPELINE_IMAGE_RENDER_LATENCY_EXTENDED" : "IG_IMAGE_PIPELINE_ON_SCREEN_IMAGE_LOAD_TIME" : "IG_IMAGE_PIPELINE_IMAGE_DOWNLOAD";
            case 358:
                return AbstractC62110RzJ.A00(s);
            case 360:
                return AbstractC61970Rwg.A00(s);
            case 363:
                return s != 5 ? s != 6 ? s == 12155 ? "STORIES_FEEDBACK_REPLY_TO_STORY_FLOW" : "UNDEFINED_QPL_EVENT" : "STORIES_FEEDBACK_VIEWER_SHEET_PAGINATION_PERFORMANCE" : "STORIES_FEEDBACK_VIEWER_SHEET_FETCH_TTI";
            case 373:
                return AbstractC62107RzG.A00(s);
            case 378:
                return AbstractC62118RzR.A00(s);
            case 382:
                return s == 13893 ? "IG_APP_PERF_MEMORY_TRIM" : "UNDEFINED_QPL_EVENT";
            case 383:
                return AbstractC61950RwM.A00(s);
            case 384:
                return s != 3 ? s == 7 ? "STORIES_FEED_UNIT_TRAY_VISIBILITY_CHANGE" : "UNDEFINED_QPL_EVENT" : "STORIES_FEED_UNIT_TRAY_LOAD_TTI";
            case 385:
                return s == 2 ? "KOTOTORO_KOTOTORO_COLD_START" : "UNDEFINED_QPL_EVENT";
            case 391:
                return AbstractC61966Rwc.A00(s);
            case 394:
                return s != 2 ? s != 10425 ? s != 4 ? s == 5 ? "SURFACES_PAGINABLE_LIST_TAIL_LOAD" : "UNDEFINED_QPL_EVENT" : "SURFACES_PAGINATION_TAIL_LOAD" : "SURFACES_PERFORMANCE_OPTIMIZED_DESTINATION_WRAPPER_EVENT" : "SURFACES_DATA_NAVIGATION_PARALLEL_FETCH";
            case 395:
                return s == 7286 ? "APP_JOBS_APP_JOB_COMPLETE" : "UNDEFINED_QPL_EVENT";
            case 396:
                return s != 1 ? s != 5699 ? s != 6 ? s == 7 ? "NAVIGATION_TAB_CLICK_POST_CONTENT_INIT_SETUP" : "UNDEFINED_QPL_EVENT" : "NAVIGATION_TAB_CLICK_PRE_CONTENT_INIT_SETUP" : "NAVIGATION_FEED_SUBNAV_VIDEO_E2E_TTI" : "NAVIGATION_SESSION";
            case 397:
                return s != 1 ? s == 2 ? "GEMSTONE_MATCHING_HOME_GEMSTONE_MATCHING_HOME_INITIAL_LOAD_ANDROID" : "UNDEFINED_QPL_EVENT" : "GEMSTONE_MATCHING_HOME_GEMSTONE_MATCHING_HOME_INITIAL_LOAD_IOS";
            case 401:
                return s != 1 ? s != 2 ? s != 3 ? s != 4 ? s != 6 ? s == 7 ? "GAMES_APP_ANDROID_COLD_START" : "UNDEFINED_QPL_EVENT" : "GAMES_APP_ANDROID_GAMES_APP_FEED_TTI" : "GAMES_APP_ANDROID_INITIAL_FEED_LOAD_TIME" : "GAMES_APP_ANDROID_COLD_START_DEX_LOAD" : "GAMES_APP_ANDROID_COLD_START_LOGIN" : "GAMES_APP_ANDROID_COLD_START_MAIN";
            case 403:
                return s != 14566 ? s == 16209 ? "MESSENGER_OMNIPICKER_OMNISTORE_CONTACTS_SYNC_UPDATED" : "UNDEFINED_QPL_EVENT" : "MESSENGER_OMNIPICKER_OMNIPICKER_FETCH_SUGGESTIONS_EVENT";
            case 404:
                return s != 2431 ? s != 2673 ? s != 10293 ? s == 15348 ? "WWW_PROFILE_USER_TIMELINE_QUERY" : "UNDEFINED_QPL_EVENT" : "WWW_PROFILE_FB_TIMELINE_FEED_UNITS_CONNECTION_QUERY" : "WWW_PROFILE_FB_PROFILE_DATA_FETCH_QUERY" : "WWW_PROFILE_TIMELINE_PROFILE_FEED_UNITS_PAGINATING_QUERY";
            case 406:
                return s == 9613 ? "IG_MOBILE_FRAMEWORK_IG_ANDROID_STATUS_BAR_UNEXPECTED_EVENT" : "UNDEFINED_QPL_EVENT";
            case 409:
                return s != 2 ? s != 8 ? s != 12 ? s != 2178 ? s == 13875 ? "WIKTORK_TEST_TEST_EVENT" : "UNDEFINED_QPL_EVENT" : "WIKTORK_TEST_NUBSI_TEST" : "WIKTORK_TEST_HELLO_DARKNESS_MY_OLD_FRIEND" : "WIKTORK_TEST_TEST123" : "hehe";
            case 411:
                return s == 11674 ? "WIKTORK_TEST_TWO_ELENA_TEST_234" : "UNDEFINED_QPL_EVENT";
            case 414:
                return S0W.A00(s);
            case 415:
                return s != 1 ? s == 2 ? "FEEDS_ADS_RERANK_SPONSORED_STORY_RERANK" : "UNDEFINED_QPL_EVENT" : "FEEDS_ADS_RERANK_ORGANIC_STORY_RERANK";
            case 417:
                return AbstractC62028Rxc.A00(s);
            case 418:
                return s != 1 ? s != 2 ? s != 4 ? s == 5 ? "GEMSTONE_PROFILE_GEMSTONE_SELF_PROFILE_INITIAL_LOAD_TTRC_ANDROID" : "UNDEFINED_QPL_EVENT" : "GEMSTONE_PROFILE_GEMSTONE_SELF_PROFILE_INITIAL_LOAD_TTRC_IOS" : "GEMSTONE_PROFILE_GEMSTONE_PROFILE_INITIAL_LOAD_TTRC_ANDROID" : "GEMSTONE_PROFILE_GEMSTONE_PROFILE_INITIAL_LOAD_TTRC_IOS";
            case 422:
                return AbstractC61848Rug.A00(s);
            case 423:
                return s == 1 ? "FOREGROUND_SERVICE_START_FOREGROUND_SERVICE" : "UNDEFINED_QPL_EVENT";
            case 424:
                return AbstractC62059RyU.A00(s);
            case 430:
                return s != 1 ? s != 2 ? s != 3 ? s != 4 ? s == 15751 ? "VIDEO_PROFILER_MEDIA_CODEC_LIFECYCLE" : "UNDEFINED_QPL_EVENT" : "VIDEO_PROFILER_VIDEO_QUALITIES" : "VIDEO_PROFILER_VIDEO_PLAYBACK_STATE" : "VIDEO_PROFILER_HTTP_TRANSFER_EVENT" : "VIDEO_PROFILER_ABR_DECISION";
            case 431:
                return s != 1 ? s != 2 ? s == 3 ? "FURY_FBLITE_FURY_INSTRUMENT_THREAD_STATS" : "UNDEFINED_QPL_EVENT" : "FURY_FBLITE_FURY_INSTRUMENT_RUNNABLE" : "FURY_FBLITE_FURY_INSTRUMENT_REJECT_RUNNABLE";
            case 434:
                return s != 1 ? s != 2 ? s == 5219 ? "DOWNLOAD_ON_DEMAND_GET_RESOURCE_FROM_NETWORK" : "UNDEFINED_QPL_EVENT" : "DOWNLOAD_ON_DEMAND_PREFETCH_METADATA_DOWNLOADED" : "DOWNLOAD_ON_DEMAND_RESOURCE_USED";
            case 435:
                return AbstractC61883RvF.A00(s);
            case 443:
                return s != 1 ? s != 2 ? s == 14828 ? "INSTANT_EXPERIENCE_ADS_DOCUMENT_GEN_ELEMENTS_TIME" : "UNDEFINED_QPL_EVENT" : "INSTANT_EXPERIENCE_ADS_OPEN_IX_DOCUMENT_TTRC" : "INSTANT_EXPERIENCE_ADS_DOCUMENT_LOAD_TIME";
            case 446:
                return AbstractC61969Rwf.A00(s);
            case 452:
                return s == 1 ? "IG_DIRECTAPP_PERF_APP_START" : "UNDEFINED_QPL_EVENT";
            case 454:
                return s == 1 ? "ATHENS_SURFACE_TTRC" : "UNDEFINED_QPL_EVENT";
            case 455:
                return s == 15327 ? "COMET_STARTUP_PDP_NAVIGATION" : "UNDEFINED_QPL_EVENT";
            case 456:
                return s != 1 ? s != 2 ? s != 3 ? s == 11340 ? "NPX_PROFILE_NUX_WIZARD" : "UNDEFINED_QPL_EVENT" : "NPX_PROFILE_PICTURE_NUX_TTI_FB4A" : "NPX_QUICK_FRIENDING_TTRC_FB4A" : "NPX_QUICK_FRIENDING_TTI_FB4A";
            case 460:
                return s == 1 ? "THREADVIEW_ROW_GENERATION_THREADVIEW_ANDROID" : "UNDEFINED_QPL_EVENT";
            case 461:
                return s != 1 ? s == 2 ? "PR_CAMERA_LITE_PR_CAMERA_LITE_BURN" : "UNDEFINED_QPL_EVENT" : "PR_CAMERA_LITE_PR_CAMERA_LITE_UEG_OPEN";
            case 462:
                return AbstractC62016RxQ.A00(s);
            case 465:
                return AbstractC61987Rwx.A00(s);
            case 466:
                return AbstractC61858Ruq.A00(s);
            case 472:
                return s != 1 ? s == 2 ? "GEMSTONE_INTERESTED_TAB_GEMSTONE_INTERESTED_TAB_TTRC_IOS" : "UNDEFINED_QPL_EVENT" : "GEMSTONE_INTERESTED_TAB_GEMSTONE_INTERESTED_TAB_TTRC_ANDROID";
            case 473:
                return s == 2 ? "GEMSTONE_CONVERSATION_STARTER_GEMSTONE_CONVERSATION_STARTER_DRAFT_TTRC_ANDROID" : "UNDEFINED_QPL_EVENT";
            case 479:
                return s == 1 ? "MESSENGER_SEARCH_NULL_STATE_RENDER" : "UNDEFINED_QPL_EVENT";
            case 480:
                return s != 1 ? s != 2 ? s != 3 ? s == 5 ? "EXTENSIONS_COMPONENT_LAYOUT" : "UNDEFINED_QPL_EVENT" : "EXTENSIONS_HOST_GET_EXTENSIONS" : "EXTENSIONS_ON_GET_EXTENSION" : "EXTENSIONS_IS_NEEDED";
            case 483:
                return s != 5 ? s != 6 ? s != 8 ? s != 10 ? s != 30 ? s == 7333 ? "FEED_DELIVERY_HEALTH_FEED_UNIT_LIFECYCLE" : "UNDEFINED_QPL_EVENT" : "FEED_DELIVERY_HEALTH_FEED_FORMATTED_FBLITE" : "FEED_DELIVERY_HEALTH_RECEIVED_EDGES_FBLITE" : "FEED_DELIVERY_HEALTH_RESPONSE_FAILURE_FBLITE" : "FEED_DELIVERY_HEALTH_DB_CLEAR_ANDROID" : "FEED_DELIVERY_HEALTH_DB_EMPTY_ANDROID";
            case 485:
                return AbstractC61965Rwb.A00(s);
            case 490:
                return Ry7.A00(s);
            case 491:
                return s != 3 ? s == 4 ? "GEMSTONE_MESSAGING_GEMSTONE_MESSAGING_THREAD_TTRC_ANDROID" : "UNDEFINED_QPL_EVENT" : "GEMSTONE_MESSAGING_GEMSTONE_MESSAGING_INBOX_TTRC_ANDROID";
            case 493:
                return s != 2 ? s != 3 ? s != 2908 ? s != 9232 ? s == 16279 ? "IG_SEARCH_TYPEAHEAD_TOUCH_DOWN" : "UNDEFINED_QPL_EVENT" : "IG_SEARCH_IG_SERP_LOAD" : "IG_SEARCH_IG_SEARCH_RESULTS_CLICKED_FUNNEL" : "IG_SEARCH_IGTV_SEARCH_QUERY_FETCH" : "IG_SEARCH_IG_SEARCH_QUERY_FETCH";
            case 502:
                return s != 1 ? s == 6752 ? "REACT_OTA_UPDATE_CHECK_OTA_UPDATE" : "UNDEFINED_QPL_EVENT" : "REACT_OTA_UPDATE_OTA_DOWNLOAD_PROCESS";
            case 503:
                return AbstractC61869Rv1.A00(s);
            case 504:
                return s != 2 ? s == 3 ? "FBLITE_STORIES_TRAY_LOAD_TTI_CLIENT_PTR" : "UNDEFINED_QPL_EVENT" : "FBLITE_STORIES_TRAY_LOAD_TTI_SERVER";
            case 507:
                return AbstractC62112RzL.A00(s);
            case 508:
                return s != 1 ? s != 2 ? s == 3 ? "TRANSIENT_ANALYSIS_HOT_START" : "UNDEFINED_QPL_EVENT" : "TRANSIENT_ANALYSIS_WARM_START" : "TRANSIENT_ANALYSIS_COLD_START";
            case 509:
                return s == 1 ? "IMAGEPIPELINE_BOOST_IMAGEPIPELINE_PRODUCER_ANDROID" : "UNDEFINED_QPL_EVENT";
            case 510:
                return s != 2 ? s != 3 ? s != 4 ? s != 5 ? s != 6 ? s == 13683 ? "PROFILE_RELIABILITY_LITHO_PROFILE_UNEXPECTED_EVENT" : "UNDEFINED_QPL_EVENT" : "PROFILE_RELIABILITY_PROFILE_TAIL_LOAD_RELIABILITY" : "PROFILE_RELIABILITY_PROFILE_PICTURE_UPLOAD_RELIABILITY_ANDROID" : "PROFILE_RELIABILITY_PROFILE_LOAD_RELIABILITY" : "PROFILE_RELIABILITY_PROFILE_PROFILE_PICTURE_RELIABILITY_ANDROID" : "PROFILE_RELIABILITY_PROFILE_COVER_PHOTO_RELIABILITY_ANDROID";
            case 515:
                return s != 1 ? s == 4938 ? "APPROVALS_BETA_VERSION_FEEDBACK" : "UNDEFINED_QPL_EVENT" : "APPROVALS_APPROVE_REJECT";
            case 517:
                return s != 2 ? s != 6754 ? s == 15509 ? "SMART_CAPTURE_ID_AND_CC" : "UNDEFINED_QPL_EVENT" : "SMART_CAPTURE_FACE_TRACKER" : "SMART_CAPTURE_SCP_UPLOAD";
            case 518:
                return s != 1 ? s != 3940 ? s != 6309 ? s != 9748 ? s == 14680 ? "JOBS_JOB_ATS_TTRC" : "UNDEFINED_QPL_EVENT" : "JOBS_JOB_DETAIL_VIEW_TTRC" : "JOBS_JOB_BROWSER_NON_TAB_TTRC" : "JOBS_JOB_COMPOSER_TTRC" : "JOBS_JOB_BROWSER_TTRC";
            case 522:
                return AbstractC62085Ryu.A00(s);
            case 523:
                if (s == 13048) {
                    return "FBLITE_PAGING_PROVIDER_FBLITE_CHANNELS_PAGING_PROVIDER_FETCH_WAIT";
                }
                switch (s) {
                    case 1:
                        return "FBLITE_PAGING_PROVIDER_FBLITE_TIMELINE_PAGING_PROVIDER_FETCH_WAIT";
                    case 2:
                        return "FBLITE_PAGING_PROVIDER_FBLITE_WATCH_PAGING_PROVIDER_FETCH_WAIT";
                    case 3:
                        return "FBLITE_PAGING_PROVIDER_FBLITE_STORIES_TOP_TRAY_PAGING_PROVIDER_FETCH_WAIT";
                    case 4:
                        return "FBLITE_PAGING_PROVIDER_FBLITE_SEARCH_RESULT_PAGE_PAGING_PROVIDER_FETCH_WAIT";
                    case 5:
                        return "FBLITE_PAGING_PROVIDER_FBLITE_WATCHLIST_PAGING_PROVIDER_FETCH_WAIT";
                    case 6:
                        return "FBLITE_PAGING_PROVIDER_PAGE_LOAD";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 525:
                return s != 1 ? s == 14079 ? "IG_NAVIGATION_NAVIGATION_EVENT" : "UNDEFINED_QPL_EVENT" : "IG_NAVIGATION_IG_NAVIGATION_ANIMATION";
            case 527:
                return s != 4226 ? s == 9620 ? "CAMERA_ROLL_INDEX_ASSET_LIBRARY" : "UNDEFINED_QPL_EVENT" : "CAMERA_ROLL_MEDIA_STORE_PERF";
            case 528:
                return AbstractC62100Rz9.A00(s);
            case 529:
                return s == 2 ? "DOWNLOADABLE_MODULES_DOWNLOAD_AND_UNPACK" : "UNDEFINED_QPL_EVENT";
            case 531:
                return s != 1 ? s == 5 ? "STORY_SURFACE_STORY_SURFACE_V1_TTRC" : "UNDEFINED_QPL_EVENT" : "STORY_SURFACE_STORY_SURFACE_TTI";
            case 533:
                return s == 1 ? "CAMERA_ROLL_TTRC_CAMERA_ROLL_TTRC_ANDROID" : "UNDEFINED_QPL_EVENT";
            case 535:
                return s == 2 ? "IG_QUICK_PROMOTIONS_IG_QP_RESOLUTION_DURATION" : "UNDEFINED_QPL_EVENT";
            case 537:
                return s == 1 ? "SPECTRUM_INITIALIZATION_ANDROID" : "UNDEFINED_QPL_EVENT";
            case 539:
                return s != 1 ? s == 2 ? "YOGA_STYLE_PROPS" : "UNDEFINED_QPL_EVENT" : "YOGA_LAYOUT_CALCULATION";
            case 541:
                return s == 2 ? "PRELOAD_FB_PRELOADER" : "UNDEFINED_QPL_EVENT";
            case 542:
                return s != 1 ? s != 2 ? s != 3 ? s != 1717 ? s == 14002 ? "NEWS_COMPASS_TOYS_NT_BACKGROUND_PARSING" : "UNDEFINED_QPL_EVENT" : "NEWS_COMPASS_FEED_NT_BACKGROUND_PARSING" : "NEWS_COMPASS_COMPASS_PAGING_TTRC" : "NEWS_COMPASS_COMPASS_TTRC" : "NEWS_COMPASS_COMPASS_FETCH";
            case 548:
                return AbstractC61894RvQ.A00(s);
            case 549:
                return AbstractC61906Rve.A00(s);
            case 551:
                return s != 3368 ? s != 11330 ? s == 13270 ? "TESTINFRA_JEST_E2E_LOCAL_MC_OVERRIDES_OCCURRED_SESSIONLESS" : "UNDEFINED_QPL_EVENT" : "TESTINFRA_JEST_E2E_LOCAL_MC_OVERRIDES_OCCURRED" : "TESTINFRA_JEST_E2E_LOCAL_MC_OVERRIDES_OCCURRED_SESSIONBASED";
            case 552:
                return s != 1 ? s != 2 ? s == 3 ? "ALOHA_APPS_INIT_HOT_START" : "UNDEFINED_QPL_EVENT" : "ALOHA_APPS_INIT_WARM_START" : "ALOHA_APPS_INIT_COLD_START";
            case 553:
                return AbstractC62109RzI.A00(s);
            case 554:
                return AbstractC62060RyV.A00(s);
            case 557:
                return s != 1 ? s == 2 ? "BUSINESS_CRM_BUSINESS_CRM_CONTACT_LOAD" : "UNDEFINED_QPL_EVENT" : "BUSINESS_CRM_BUSINESS_CRM_CONTACT_LIST_LOAD";
            case 560:
                return AbstractC61856Ruo.A00(s);
            case 563:
                return AbstractC61877Rv9.A00(s);
            case 565:
                return s != 1 ? s == 3 ? "PROFILE_EDIT_PROFILE_EDIT_INITIAL_LOAD_TTRC" : "UNDEFINED_QPL_EVENT" : "PROFILE_EDIT_PROFILE_EDIT_INITIAL_LOAD_TTRC_ANDROID";
            case 570:
                return AbstractC61986Rww.A00(s);
            case 572:
                return s == 1 ? "FBLITE_RELIABILITY_FBLITE_ERROR_SCREENS" : "UNDEFINED_QPL_EVENT";
            case 574:
                return AbstractC62104RzD.A00(s);
            case 576:
                return s != 1 ? s == 2 ? "FBLITE_ASYNC_ACTIONS_IG_CARBON_ASYNC_ACTION" : "UNDEFINED_QPL_EVENT" : "FBLITE_ASYNC_ACTIONS_ASYNC_SUBMIT";
            case 579:
                return s != 1 ? s == 2 ? "CONTEXTUALCONFIG_CC_RESOLVE" : "UNDEFINED_QPL_EVENT" : "CONTEXTUALCONFIG_CC_INIT";
            case 581:
                return s != 1 ? s == 2 ? "FBLITE_CLIENT_INSTRUMENTATION_FBLITE_FIZZ_SOCKET" : "UNDEFINED_QPL_EVENT" : "FBLITE_CLIENT_INSTRUMENTATION_FBLITE_SOCKET_CREATE";
            case 582:
                return s != 1 ? s == 6214 ? "ANIMATION_PERF_ANIMATION_HITCH" : "UNDEFINED_QPL_EVENT" : "ANIMATION_PERF_ANIMATION_PLAYING";
            case 583:
                return s != 3 ? s != 4 ? s != 8085 ? s != 12434 ? s != 12792 ? s == 13345 ? "MESSENGER_COWATCH_BLOKS_AMD_TTRC" : "UNDEFINED_QPL_EVENT" : "MESSENGER_COWATCH_AVD_TAB_CONTENT_LOAD_TO_RENDER_ANDROID" : "MESSENGER_COWATCH_BLOKS_AMD_DETAIL_PAGE_TTRC" : "MESSENGER_COWATCH_PLAYER_PLAY_TTI_ANDROID" : "MESSENGER_COWATCH_AVD_TAB_CONTENT_ANDROID" : "MESSENGER_COWATCH_AVD_TABS_TTI_ANDROID";
            case 584:
                switch (s) {
                    case 1:
                        return "VIDEO_CHAT_LINKS_CREATE_LINK_MOBILE";
                    case 2:
                        return "VIDEO_CHAT_LINKS_REVOKE_LINK_MOBILE";
                    case 3:
                        return "VIDEO_CHAT_LINKS_RESOLVE_LINK_MOBILE";
                    case 4:
                        return "VIDEO_CHAT_LINKS_ENTER_ROOM_MOBILE";
                    case 5:
                        return "VIDEO_CHAT_LINKS_GET_HOST_MOBILE";
                    case 6:
                        return "VIDEO_CHAT_LINKS_UPDATE_ROOM_RINGABILITY_MOBILE";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 587:
                return RyG.A00(s);
            case 592:
                return s != 1 ? s != 2 ? s != 4 ? s == 9 ? "IG_ASSET_USAGE_FETCH" : "UNDEFINED_QPL_EVENT" : "IG_ASSET_USAGE_DOWNLOAD_TIME" : "IG_ASSET_USAGE_FONT_ACCESSED" : "IG_ASSET_USAGE_ANIMATION_ACCESSED";
            case 596:
                return s == 1 ? "IG_PAYMENT_MODULES_HAS_PAYMENT_SETTINGS_ANDROID" : "UNDEFINED_QPL_EVENT";
            case 597:
                return AbstractC61963RwZ.A00(s);
            case 599:
                return s != 1 ? s != 3 ? s == 4 ? "SUBSAMPLED_EXTENSIONS_HOST_GET_EXTENSIONS" : "UNDEFINED_QPL_EVENT" : "SUBSAMPLED_EXTENSIONS_ON_GET_EXTENSION" : "SUBSAMPLED_EXTENSIONS_IS_NEEDED";
            case 600:
                return s == 7940 ? "FBLITE_MESSAGING_PERF_FBLITE_MESSAGING_ONTYPING_DURATION" : "UNDEFINED_QPL_EVENT";
            case 603:
                return s == 9783 ? "REACT_NATIVE_FABRIC_TTRC_DIFF_NATIVE" : "UNDEFINED_QPL_EVENT";
            case 604:
                return AbstractC61908Rvg.A00(s);
            case 605:
                return s != 1 ? s == 3 ? "GLTF_SCENE_GLTF_PREFETCH" : "UNDEFINED_QPL_EVENT" : "GLTF_SCENE_GLTF_RENDER_ANDROID";
            case 608:
                return s != 1 ? s != 2 ? s != 3 ? s == 9523 ? "STORIES_VIEWER_PERFORMANCE_ANDROID_INITIAL_LOAD_TTRC_OTHER" : "UNDEFINED_QPL_EVENT" : "STORIES_VIEWER_PERFORMANCE_ANDROID_THREAD_TRANSITION_TTRC" : "STORIES_VIEWER_PERFORMANCE_ANDROID_BUCKET_TRANSITION_TTRC" : "STORIES_VIEWER_PERFORMANCE_ANDROID_INITIAL_LOAD_TTRC";
            case 613:
                return s != 1 ? s != 2 ? s != 3 ? s != 7 ? s != 5234 ? s == 5811 ? "FBLITE_MEDIA_PERF_IMAGE_LOAD_FOR_FIRE" : "UNDEFINED_QPL_EVENT" : "FBLITE_MEDIA_PERF_IMAGE_LOAD_EB" : "FBLITE_MEDIA_PERF_IMAGE_LOAD_WEB" : "FBLITE_MEDIA_PERF_MEDIA_UPLOAD" : "Image Load" : "FBLITE_MEDIA_PERF_IMAGE_FETCH";
            case 619:
                return s != 2 ? s != 4 ? s == 5 ? "CONTEXTUAL_PROFILE_INITIAL_LOAD_IM_CONTEXTUAL_PROFILE_INITIAL_LOAD_ANDROID" : "UNDEFINED_QPL_EVENT" : "CONTEXTUAL_PROFILE_INITIAL_LOAD_IM_CONTEXTUAL_PROFILE_INITIAL_LOAD" : "CONTEXTUAL_PROFILE_INITIAL_LOAD_CONTEXTUAL_PROFILE_INITIAL_LOAD_TTRC_ANDROID";
            case 626:
                return s == 1 ? "RTC_X_PERF_START_OUTGOING_CONNECTION" : "UNDEFINED_QPL_EVENT";
            case 627:
                return s != 2 ? s != 3 ? s != 4 ? s == 3982 ? "XR_PERSISTENCE_SERVICES_XR_ANCHORS" : "UNDEFINED_QPL_EVENT" : "XR_PERSISTENCE_SERVICES_REMOTE_POSE_PUBLISH" : "XR_PERSISTENCE_SERVICES_CONTENT_FETCH" : "XR_PERSISTENCE_SERVICES_RELOCALIZATION";
            case 628:
                return s != 1 ? s != 2 ? s == 3 ? "RTC_PLATFORM_CLIENT_PERF_START_GROUP_ESCALATION" : "UNDEFINED_QPL_EVENT" : "RTC_PLATFORM_CLIENT_PERF_ACCEPT_INCOMING_CONNECTION_FLOW" : "RTC_PLATFORM_CLIENT_PERF_START_OUTGOING_CONNECTION";
            case 629:
                return s != 1 ? s == 6488 ? "FRESCO_INSTRUMENTATION_FRESCO_IMAGE_PERF_ADHOC" : "UNDEFINED_QPL_EVENT" : "FRESCO_INSTRUMENTATION_FRESCO_IMAGE_PERF";
            case 639:
                return s != 1 ? s == 2 ? "GEMSTONE_ONBOARDING_GEMSTONE_ONBOARDING_TTRC_ANDROID" : "UNDEFINED_QPL_EVENT" : "GEMSTONE_ONBOARDING_GEMSTONE_ONBOARDING_TTRC_IOS";
            case 643:
                return AbstractC61964Rwa.A00(s);
            case 644:
                return AbstractC62089Ryy.A00(s);
            case 647:
                return s == 16086 ? "OFF_FACEBOOK_ACTIVITY_OFA_FBLITE_APP" : "UNDEFINED_QPL_EVENT";
            case 651:
                return AbstractC61827RuL.A00(s);
            case 653:
                return s == 1 ? "USABILITY_USER_TASK" : "UNDEFINED_QPL_EVENT";
            case 656:
                return AbstractC62093Rz2.A00(s);
            case 658:
                return s != 2 ? s != 3 ? s != 1262 ? s == 9157 ? "BIZAPP_STARTUP_PERF_ANDROID_PUSH_LANDING_SUCCESS" : "UNDEFINED_QPL_EVENT" : "BIZAPP_STARTUP_PERF_ANDROID_HOT_START" : "BIZAPP_STARTUP_PERF_ANDROID_WARM_START" : "BIZAPP_STARTUP_PERF_ANDROID_COLD_START";
            case 659:
                return s == 1 ? "FBLITE_SCROLL_PERF_SCROLL_PERF" : "UNDEFINED_QPL_EVENT";
            case 660:
                return AbstractC62031Rxf.A00(s);
            case 662:
                return s == 4773 ? "IG_CACHE_CDN_CACHE_KEY_GENERATOR" : "UNDEFINED_QPL_EVENT";
            case 663:
                return s != 1229 ? s != 1325 ? s != 7839 ? s == 15649 ? "ALOHA_SUPERFRAME_INCALL_PHOTO_CAPTURE" : "UNDEFINED_QPL_EVENT" : "ALOHA_SUPERFRAME_AMBIENT_PHOTOS_PRELOAD_MEDIA" : "ALOHA_SUPERFRAME_INCALL_PHOTO_UPLOAD" : "ALOHA_SUPERFRAME_AMBIENT_PHOTOS_FETCH_FRAMES";
            case 666:
                return s != 1 ? s != 7125 ? s == 13658 ? "FBLITE_UNITY_SESSION_FBLITE_MEDIA_UPLOAD_FILEPICKER_WORKFLOW" : "UNDEFINED_QPL_EVENT" : "FBLITE_UNITY_SESSION_FBLITE_MEDIA_UPLOAD" : "FBLITE_UNITY_SESSION_FBLITE_UNITY_STARTUP";
            case 667:
                return s != 1 ? s != 2 ? s == 3 ? "JOB_ORCHESTRATION_FBINTENTSERVICE_RUN" : "UNDEFINED_QPL_EVENT" : "JOB_ORCHESTRATION_FBSERVICE_RUN" : "JOB_ORCHESTRATION_FBJOBINTENTSERVICE_RUN";
            case 669:
                return s == 2 ? "GEMSTONE_COMMUNITY_MATCHES_GEMSTONE_COMMUNITY_MATCHES_TTRC_ANDROID" : "UNDEFINED_QPL_EVENT";
            case 670:
                return s != 1 ? s != 2 ? s != 3 ? s == 4 ? "FBLITE_CREATION_FBLITE_MEDIA_PICKER_SCROLL_PERF" : "UNDEFINED_QPL_EVENT" : "FBLITE_CREATION_FBLITE_STORIES_BURN_TIME" : "FBLITE_CREATION_FBLITE_MEDIA_PICKER_TTRC" : "FBLITE_CREATION_FBLITE_STORIES_EDITOR_CREATIVE_TOOLS_TTRC";
            case 674:
                return s == 1 ? "FBLITE_SCREEN_DIFF_SCREEN_DIFF" : "UNDEFINED_QPL_EVENT";
            case 675:
                return s != 1 ? s != 2 ? s != 3 ? s == 4 ? "BIGFOOT_MEASURE" : "UNDEFINED_QPL_EVENT" : "BIGFOOT_REQUEST_MEASUREMENT" : "BIGFOOT_REPORT_DATA" : "BIGFOOT_INIT_PROVIDERS";
            case 677:
                return AbstractC62000RxA.A00(s);
            case 680:
                return S0J.A00(s);
            case 684:
                return AbstractC61830RuO.A00(s);
            case 686:
                return s == 1003 ? "LIVE_COMPOSER_GO_LIVE_FLOW" : "UNDEFINED_QPL_EVENT";
            case 687:
                return s != 1 ? s != 2 ? s != 3 ? s == 4 ? "FEED_HEALTH_LIKE_REACT_FAILURE" : "UNDEFINED_QPL_EVENT" : "FEED_HEALTH_LOAD_PHOTOS_FEED_FAILURE" : "FEED_HEALTH_LOAD_COMMENTS_FAILURE" : "FEED_HEALTH_SEND_COMMENT_FAILURE";
            case 690:
                return s != 1 ? s == 4933 ? "REDBLOCK_NATIVE_UIQR_DEBUG_LOGGING" : "UNDEFINED_QPL_EVENT" : "REDBLOCK_NATIVE_EVALUATIONS";
            case 699:
                return AbstractC61852Ruk.A00(s);
            case 701:
                return s == 4473 ? "MUSIC_STORY_MUSIC_EDITING" : "UNDEFINED_QPL_EVENT";
            case 702:
                return s != 1 ? s != 2 ? s == 10260 ? "PYTORCH_MOBILE_MODULE_LOAD_STATS" : "UNDEFINED_QPL_EVENT" : "PYTORCH_MOBILE_MODULE_STATS" : "PYTORCH_MOBILE_OPERATOR_STATS";
            case 707:
                return s != 1 ? s == 8807 ? "LOCAL_AGGREGATOR_STARTUP_COMPLETED" : "UNDEFINED_QPL_EVENT" : "LOCAL_AGGREGATOR_END_AGGREGATION";
            case 708:
                return s != 1 ? s != 2 ? s != 3 ? s == 11718 ? "ANDROID_EFFICIENCY_MODULE_ANDROID_CACHE_EFFICIENCY" : "UNDEFINED_QPL_EVENT" : "ANDROID_EFFICIENCY_MODULE_ANDROID_IMAGE_EFFICIENCY_EVENT" : "ANDROID_EFFICIENCY_MODULE_ANDROID_REFETCH_EFFICIENCY_EVENT" : "ANDROID_EFFICIENCY_MODULE_ANDROID_FETCH_EFFICIENCY_EVENT";
            case 710:
                return s == 9624 ? "BISHOP_START_UP" : "UNDEFINED_QPL_EVENT";
            case 712:
                return s != 1 ? s == 2 ? "DIAGNOSTICS_RELIABILITY_PATTERNS" : "UNDEFINED_QPL_EVENT" : "DIAGNOSTICS_SESSION_DIAGNOSTICS";
            case 719:
                return s != 2 ? s != 3 ? s != 4 ? s != 5 ? s != 6 ? s == 6559 ? "WELLBEING_BALANCING_YOUR_TIME_ONLINE_TTRC" : "UNDEFINED_QPL_EVENT" : "WELLBEING_YTOF2_NOTIFICATIONS_TTRC" : "WELLBEING_YTOF2_MORE_TTRC" : "WELLBEING_YTOF2_MANAGE_TTRC" : "WELLBEING_YTOF2_USAGE_TTRC" : "WELLBEING_YTOF2_TTRC";
            case 720:
                return s == 1 ? "ALOHA_EFFECTS_EFFECTS_TRAY_LOAD" : "UNDEFINED_QPL_EVENT";
            case 721:
                return AbstractC62049Rxx.A00(s);
            case 724:
                return s != 1 ? s != 2 ? s != 3 ? s != 9141 ? s == 15879 ? "ANDROID_DITTO_PATCH_VOLTRON" : "UNDEFINED_QPL_EVENT" : "ANDROID_DITTO_BACKGROUND_PATCHED" : "ANDROID_DITTO_INIT" : "ANDROID_DITTO_PATCH" : "ANDROID_DITTO_GET_PATCH";
            case 725:
                return AbstractC62099Rz8.A00(s);
            case 727:
                return AbstractC61933Rw5.A00(s);
            case 745:
                return AbstractC61905Rvd.A00(s);
            case 746:
                return s != 1 ? s == 9252 ? "CLOAKING_DETECTION_IAB_MODELS_GRAPHQL_SAMPLING" : "UNDEFINED_QPL_EVENT" : "CLOAKING_DETECTION_IAB_MODELS_MODELS_RUN";
            case 747:
                return s == 1203 ? "FBLITE_TESTING_INTERNAL_ONLY_JEST_WAIT" : "UNDEFINED_QPL_EVENT";
            case 760:
                return s == 1 ? "IMAGE_UPLOAD_ANDROID_IMAGE_UPLOAD" : "UNDEFINED_QPL_EVENT";
            case 764:
                return s != 1 ? s != 2210 ? s == 12871 ? "ZOPT_BACKGROUND_JOB_RUN" : "UNDEFINED_QPL_EVENT" : "ZOPT_BACKGROUND_JOB_SCHEDULED" : "ZOPT_OPTIMIZE";
            case 768:
                return s != 3148 ? s == 4504 ? "MOBILE_MEMORY_MOBILE_MEMORY_LEAK_METRICS" : "UNDEFINED_QPL_EVENT" : "MOBILE_MEMORY_MOBILE_MEMORY_USAGE_METRICS";
            case 770:
                return s != 1 ? s == 2 ? "INSTANT_GAMES_ARCADE_TTRC" : "UNDEFINED_QPL_EVENT" : "INSTANT_GAMES_ARCADE_INITIAL_QUERY_FETCH";
            case 771:
                return s == 1 ? "OCULUS_HOME_INIT" : "UNDEFINED_QPL_EVENT";
            case 775:
                return AbstractC61839RuX.A00(s);
            case 776:
                return s != 4 ? s != 5 ? s != 14349 ? s != 14420 ? s == 14736 ? "GEMSTONE_SETTINGS_GEMSTONE_DELETION_RESET_RUN" : "UNDEFINED_QPL_EVENT" : "GEMSTONE_SETTINGS_GEMSTONE_ROM_COM_CENTER_TTRC_IOS" : "GEMSTONE_SETTINGS_GEMSTONE_ROM_COM_CENTER_TTRC_ANDROID" : "GEMSTONE_SETTINGS_GEMSTONE_SETTING_TTRC_IOS" : "GEMSTONE_SETTINGS_GEMSTONE_SETTING_TTRC_ANDROID";
            case 777:
                return s != 4 ? s == 5 ? "GEMSTONE_SECRET_CRUSH_GEMSTONE_SC_TTRC_IOS" : "UNDEFINED_QPL_EVENT" : "GEMSTONE_SECRET_CRUSH_GEMSTONE_SC_TTRC_ANDROID";
            case 779:
                return s != 1 ? s != 3 ? s == 4 ? "IG_ANDROID_INGESTION_RENDER" : "UNDEFINED_QPL_EVENT" : "IG_ANDROID_INGESTION_CONFIGURE" : "IG_ANDROID_INGESTION_PUBLISH";
            case 782:
                return s == 1 ? "IG_RAVEN_USER_DWELL_DWELL" : "UNDEFINED_QPL_EVENT";
            case 783:
                return s == 1 ? "FBLITE_CDN_OKHTTP" : "UNDEFINED_QPL_EVENT";
            case 784:
                return s != 1 ? s != 10709 ? s != 11078 ? s == 11410 ? "FBLITE_MODULARITY_FAILOVER_TO_OXYGEN" : "UNDEFINED_QPL_EVENT" : "FBLITE_MODULARITY_FBLITE_GOOGLE_DOWNLOADER" : "FBLITE_MODULARITY_SIDELOAD" : "FBLITE_MODULARITY_FBLITE_API_EXECUTE_BATCH";
            case 785:
                return s != 1 ? s == 6557 ? "PLATFORM_SHARING_PLATFORM_SHARE_DIALOG" : "UNDEFINED_QPL_EVENT" : "PLATFORM_SHARING_PLATFORM_COMPOSER_LAUNCH_PERF";
            case 786:
                return s != 2 ? s != 3 ? s != 5512 ? s != 6081 ? s == 16260 ? "SHOWREEL_NATIVE_INSTANCE_ERRORS" : "UNDEFINED_QPL_EVENT" : "SHOWREEL_NATIVE_FB_FEED_SN_COMPONENT_USER_FLOW" : "SHOWREEL_NATIVE_FB_SN_ANIM_PLAYER_PLAYBACK" : "SHOWREEL_NATIVE_INSTANCE_PLAYBACK" : "SHOWREEL_NATIVE_INSTANCE_TTR";
            case 787:
                return AbstractC62076Ryl.A00(s);
            case 788:
                return s != 1 ? s == 3 ? "ONEVC_ONEVC_RAISE_HAND" : "UNDEFINED_QPL_EVENT" : "ONEVC_ANDROID_PRECALL_JOINABLELINK";
            case 789:
                return Ry2.A00(s);
            case 792:
                return AbstractC62067Ryc.A00(s);
            case 793:
                switch (s) {
                    case 1:
                        return "RTC_COEX_USER_INTERACTION_EFFECT_BUTTON_TO_EFFECT_TRAY";
                    case 2:
                        return "RTC_COEX_USER_INTERACTION_EFFECT_SELECTION_TO_EFFECT_UI_UPDATE";
                    case 3:
                        return "RTC_COEX_USER_INTERACTION_EFFECT_TRAY_TO_CALL_CONTROLS";
                    case 4:
                        return "RTC_COEX_USER_INTERACTION_EFFECT_DESELECTION_TO_EFFECT_UI_UPDATE";
                    case 5:
                        return "RTC_COEX_USER_INTERACTION_EFFECT_DESELECTION_TO_EFFECT_REMOVED";
                    case 6:
                        return "RTC_COEX_USER_INTERACTION_EFFECT_SELECTION_TO_EFFECT_APPLIED_DOWNLOADED";
                    case 7:
                        return "RTC_COEX_USER_INTERACTION_EFFECT_SELECTION_TO_EFFECT_APPLIED_NOT_DOWNLOADED";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 799:
                if (s == 11487) {
                    return "CREATOR_STUDIO_ANDROID_SCREEN_TTRC";
                }
                switch (s) {
                    case 1:
                        return "CREATOR_STUDIO_ANDROID_COLD_START";
                    case 2:
                        return "CREATOR_STUDIO_ANDROID_FACEWEB_CREATE";
                    case 3:
                        return "CREATOR_STUDIO_ANDROID_PUBLISH_WAIT_TIME";
                    case 4:
                        return "CREATOR_STUDIO_ANDROID_COMPOSER_EDIT_THUMBNAIL_GENERATION";
                    case 5:
                        return "CREATOR_STUDIO_ANDROID_COMPOSER_EDIT_THUMBNAIL_UPLOAD";
                    case 6:
                        return "CREATOR_STUDIO_ANDROID_MEDIA_PICKER_VIDEO_SELECTION_WAIT_TIME";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 801:
                return s != 1 ? s != 3224 ? s == 14297 ? "FBLITE_WATCH_FBLITE_REELS" : "UNDEFINED_QPL_EVENT" : "FBLITE_WATCH_FBLITE_LIVE_BROADCASTING" : "Fblite Channels Incoming Stories";
            case 806:
                return s != 1760 ? s != 8666 ? s != 10450 ? s == 11288 ? "MESSENGER_MSYS_DB_FILE_ENCRYPTION" : "UNDEFINED_QPL_EVENT" : "MESSENGER_MSYS_MAILBOXCORE_CALLBACK_STATS" : "MESSENGER_MSYS_DB_FILE_DECRYPTION" : "MESSENGER_MSYS_MSYS_MAILBOX_LOG_OUT";
            case 807:
                return S0P.A00(s);
            case 810:
                return s != 1 ? s == 2156 ? "MSYS_BOOTSTRAP_ANDROID_MSYS_SHUTDOWN" : "UNDEFINED_QPL_EVENT" : "MSYS_BOOTSTRAP_ANDROID_MSYS_BOOTSTRAP";
            case 812:
                return s != 1363 ? s == 11174 ? "CONNECTED_COMMERCE_MORE_FROM_OTHER_SHOPS_PIVOT_PERF" : "UNDEFINED_QPL_EVENT" : "CONNECTED_COMMERCE_RECONSIDERATION_PIVOT_PERF";
            case 814:
                return S0D.A00(s);
            case 815:
                return s == 1 ? "REACT_NATIVE_ENTRYPOINTS_LOAD" : "UNDEFINED_QPL_EVENT";
            case 819:
                return s == 1 ? "FB_STORIES_PTV_PTV_TTI" : "UNDEFINED_QPL_EVENT";
            case 823:
                return s != 1 ? s == 2 ? "ANDROID_NOTIFICATIONS_OPEN_NOTIFICATION_SETTINGS" : "UNDEFINED_QPL_EVENT" : "ANDROID_NOTIFICATIONS_FILTER_NOTIFICATIONS";
            case 827:
                return S0N.A00(s);
            case 828:
                return S0E.A00(s);
            case 831:
                return s == 1 ? "IG_ANDROID_INGESTION_ENCODER_SELECTION_ENCODER_SELECTION" : "UNDEFINED_QPL_EVENT";
            case 835:
                return s == 1 ? "FEED_CAMERA_USAGE_STITCH" : "UNDEFINED_QPL_EVENT";
            case 839:
                return s != 1 ? s == 24655 ? "BUSINESS_CM_BIZAPP_POST_TAB_TTRC" : "UNDEFINED_QPL_EVENT" : "BUSINESS_CM_BIZAPP_POST_DETAIL_TTRC";
            case 841:
                return AbstractC62094Rz3.A00(s);
            case 842:
                return S0C.A00(s);
            case 845:
                return S0K.A00(s);
            case 850:
                return s != 1 ? s != 2 ? s != 3 ? s == 4 ? "WP_MOBILE_ADMIN_REPORTED_CONTENT_REVIEW_SCREEN" : "UNDEFINED_QPL_EVENT" : "WP_MOBILE_ADMIN_OPEN_REPORTED_CONTENT_LIST" : "WP_MOBILE_ADMIN_DEACTIVATE_USER_SINGLE" : "WP_MOBILE_ADMIN_ACTIVATE_USER_SINGLE";
            case 851:
                return AbstractC61824RuI.A00(s);
            case 857:
                return s != 1 ? s != 2 ? s != 11779 ? s != 13245 ? s == 25563 ? "ZERO_BALANCE_MEASUREMENT_FBLITE_ZERO_TIMEOUT_DETECTION" : "UNDEFINED_QPL_EVENT" : "ZERO_BALANCE_MEASUREMENT_FBLITE_ZERO_BALANCE_REDIRECT_V2" : "ZERO_BALANCE_MEASUREMENT_FBLITE_ZERO_TIMEOUT_RETRY_DETECTION" : "ZERO_BALANCE_MEASUREMENT_FBLITE_ZERO_BALANCE_DETECTION" : "ZERO_BALANCE_MEASUREMENT_FBLITE_ZERO_BALANCE_FIX";
            case 858:
                return s == 1 ? "MOOD_BASE_MOOD_BASE_ENTER" : "UNDEFINED_QPL_EVENT";
            case 859:
                return S0M.A00(s);
            case 862:
                return s == 1 ? "LOCAL_COMMUNITIES_LOCO_HOME_TTRC" : "UNDEFINED_QPL_EVENT";
            case 863:
                return s == 1 ? "BIRDS_EYE_VIEW_MEMORY" : "UNDEFINED_QPL_EVENT";
            case 864:
                return s != 1 ? s == 2 ? "LASSO_BLUE_CONSUMPTION_USER_INTERACTION" : "UNDEFINED_QPL_EVENT" : "LASSO_BLUE_CONSUMPTION_POSITION_0_SCROLL";
            case 871:
                return AbstractC61999Rx9.A00(s);
            case 872:
                return s != 1 ? s != 2 ? s != 3 ? s != 4 ? s == 4585 ? "MESSENGER_CHAT_CONTROL_BLOCK_ON_FACEBOOK" : "UNDEFINED_QPL_EVENT" : "MESSENGER_CHAT_CONTROL_BLOCK_PARTICIPANT" : "MESSENGER_CHAT_CONTROL_HIDE_PERMANENTLY" : "MESSENGER_CHAT_CONTROL_DELETE_PARTICIPANT" : "MESSENGER_CHAT_CONTROL_DELETE_MESSAGE";
            case 877:
                return s == 1 ? "IG_RESPONSIVENESS_TOUCH_STALL" : "UNDEFINED_QPL_EVENT";
            case 878:
                return s != 2376 ? s == 3469 ? "INSTANT_GAMES_CUSTOM_SHARE_DIALOG" : "UNDEFINED_QPL_EVENT" : "INSTANT_GAMES_TOURNAMENT_SHARE_DIALOG";
            case 880:
                return S0R.A00(s);
            case 881:
                return s == 6 ? "IG_THREADS_APP_KARAOKE_CAPTION_EXTRACT_AUDIO" : "UNDEFINED_QPL_EVENT";
            case 882:
                return s != 1 ? s != 3999 ? s != 5505 ? s != 7909 ? s == 15705 ? "ROOMS_ROOMS_TRAY_START_UP" : "UNDEFINED_QPL_EVENT" : "ROOMS_FB4A_RTC_RTC_ACTIVITY_CALL" : "ROOMS_ROOMS_JOINER_LOBBY" : "ROOMS_ROOMS_SELF_LOBBY" : "ROOMS_FB_TOFU_CREATE_ROOM";
            case 883:
                return s == 1 ? "ANDROID_TEMP_MEDIA_DISK_FOOTAGE_SNAPSHOT" : "UNDEFINED_QPL_EVENT";
            case 886:
                return s == 1 ? "RTC_STATE_SYNC_UPDATE_REQUEST" : "UNDEFINED_QPL_EVENT";
            case 887:
                return s != 1 ? s == 2 ? "WP_FRONTLINE_WORKING_HOURS_WP_FRONTLINE_WORKING_HOURS_ALERT_QUERY" : "UNDEFINED_QPL_EVENT" : "WP_FRONTLINE_WORKING_HOURS_WP_FRONTLINE_WORKING_HOURS_ALERT";
            case 889:
                return s != 1 ? s == 15479 ? "GAMING_SERVICES_GAMING_LOGIN_CLOUD_TTRC" : "UNDEFINED_QPL_EVENT" : "GAMING_SERVICES_GAMING_LOGIN_TTRC";
            case 890:
                return s == 1 ? "BIZCOMPOSER_MEDIAPICKER_MEDIAPICKER_LAUNCH_TIME" : "UNDEFINED_QPL_EVENT";
            case 891:
                return s == 1 ? "WP_ACCESS_CODE_GENERATION_SHARING" : "UNDEFINED_QPL_EVENT";
            case 892:
                return AbstractC62116RzP.A00(s);
            case 893:
                return s == 1 ? "REALTIME_NT_SUBSCRIPTION_ACTIVE" : "UNDEFINED_QPL_EVENT";
            case 895:
                return s == 13072 ? "WORKPLACE_FRONTLINE_TIME_INTERSTITIAL_TIME_INTERSTITIAL" : "UNDEFINED_QPL_EVENT";
            case 897:
                return s == 1 ? "FBLITE_CLIENT_LOGS_METADATA_CLIENT_LOG_RECEIVED" : "UNDEFINED_QPL_EVENT";
            case 898:
                return s != 4867 ? s != 5890 ? s != 7431 ? s != 7842 ? s != 10055 ? s == 14802 ? "CASK_METASTORE_GETALL_METHOD" : "UNDEFINED_QPL_EVENT" : "CASK_GET_METASTORE" : "CASK_METASTORE_GET_METHOD" : "CASK_METASTORE_PUT_METHOD" : "CASK_CASK_MIGRATE_STORE" : "CASK_METASTORE_REMOVE_METHOD";
            case 900:
                return s == 1 ? "FRESCO_CACHE_FRESCO_CACHE_OBSERVER" : "UNDEFINED_QPL_EVENT";
            case 904:
                return s == 2 ? "WP_WWW_USER_INTEGRATIONS_DESKTOP_OAUTH_LOGIN" : "UNDEFINED_QPL_EVENT";
            case 910:
                return s != 1 ? s != 9376 ? s == 9968 ? "FBLITE_RTC_RTC_CALL_RING" : "UNDEFINED_QPL_EVENT" : "FBLITE_RTC_RTC_MSG_QUEUES_SIZE" : "FBLITE_RTC_RTC_ACTIVITY_CALL";
            case 911:
                return s != 3858 ? s != 5056 ? s == 11315 ? "MESSENGER_ROOMS_PRE_MESSENGER_ROOMS_TO_LIVE_GUEST_ACCEPT_OPT_IN_EVENT" : "UNDEFINED_QPL_EVENT" : "MESSENGER_ROOMS_PRE_MESSENGER_ROOMS_TO_LIVE_HOST_END_BROADCAST_EVENT" : "MESSENGER_ROOMS_PRE_MESSENGER_ROOMS_TO_LIVE_HOST_EVENT";
            case 912:
                return s != 1 ? s != 1640 ? s != 2169 ? s == 13816 ? "GROUP_MALL_RELIABILITY_GROUP_MALL_INITIAL_LOAD_RELIABILITY" : "UNDEFINED_QPL_EVENT" : "GROUP_MALL_RELIABILITY_GROUP_MALL_POST_RELIABILITY" : "GROUP_MALL_RELIABILITY_GROUP_INLINE_COMPOSER_RELIABILITY" : "GROUP_MALL_RELIABILITY_GROUP_MALL_TAIL_LOAD_RELIABILITY";
            case 915:
                return s != 6843 ? s != 7160 ? s != 8091 ? s != 8160 ? s == 14419 ? "BUSINESS_INBOX_NOTIFICATION_LOCAL_NOTIFICATION_PRESENTATION_ANDROID" : "UNDEFINED_QPL_EVENT" : "BUSINESS_INBOX_NOTIFICATION_LOCAL_NOTIFICATION_PRESENTATION" : "BUSINESS_INBOX_NOTIFICATION_NOTIF_SEND_FOR_BIIM" : "BUSINESS_INBOX_NOTIFICATION_PAGE_NOTIF_RENDER_ANDROID" : "BUSINESS_INBOX_NOTIFICATION_PAGE_NOTIF_RENDER_IOS";
            case 920:
                return s == 1 ? "NEKO_PLAYABLE_ADS_CLOUD_LOAD" : "UNDEFINED_QPL_EVENT";
            case 923:
                return AbstractC62019RxT.A00(s);
            case 924:
                return s == 1 ? "SHARED_PHONE_ACCOUNT_RECOVERY_CODE_VERIFICATION" : "UNDEFINED_QPL_EVENT";
            case 926:
                return s != 4849 ? s == 9983 ? "COMPPHOTO_ALGO_HOLLYWOOD_DETECTOR_LATENCY" : "UNDEFINED_QPL_EVENT" : "COMPPHOTO_ALGO_COMPPHOTO_TIME_TO_FIRST_FRAME";
            case 927:
                switch (s) {
                    case 1:
                        return "ON_DEVICE_TTS_SPEAK";
                    case 2:
                        return "ON_DEVICE_TTS_LOAD_MODEL";
                    case 3:
                        return "ON_DEVICE_TTS_CREATE";
                    case 4:
                        return "ON_DEVICE_TTS_RELEASE";
                    case 5:
                        return "ON_DEVICE_TTS_LOAD_MODEL_CLIENT";
                    case 6:
                        return "ON_DEVICE_TTS_SPEAK_CLIENT";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 930:
                return s == 8296 ? "ALOHA_MOBILECONFIG_END_TO_END_TESTING" : "UNDEFINED_QPL_EVENT";
            case 931:
                return s != 1 ? s == 12753 ? "ANDROID_IMAGE_LOAD_RELIABILITY_ATTACHMENTS_RENDERING" : "UNDEFINED_QPL_EVENT" : "ANDROID_IMAGE_LOAD_RELIABILITY_IMAGE_LOAD_RELIABILITY";
            case 936:
                return s == 1 ? "VIDEO_ADS_WATCH_AND_BROWSE_FULLSCREEN_WATCH_AND_BROWSE_FULLSCREEN_TRANSITION" : "UNDEFINED_QPL_EVENT";
            case 941:
                return AbstractC61978Rwo.A00(s);
            case 942:
                return s == 1 ? "WORK_POST_PRIVACY_PRIVACY_CHANGE" : "UNDEFINED_QPL_EVENT";
            case 948:
                if (s == 9240) {
                    return "CASTING_TV_APPS_CASTING_FLOW";
                }
                switch (s) {
                    case 2:
                        return "CASTING_CAST_FIRST_DEVICE_CONNECTION";
                    case 3:
                        return "CASTING_CAST_RECEIVER_APP_LOAD";
                    case 4:
                        return "CASTING_CAST_NEXT_VIDEO_REQUEST";
                    case 5:
                        return "CASTING_CAST_VIDEO_METADATA_REQUEST";
                    case 6:
                        return "CASTING_CAST_PLAYBACK_STARTED";
                    case 7:
                        return "CASTING_CAST_STARTUP";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 956:
                return s != 1 ? s == 2 ? "IG_MEDIA_UPLOAD_POST_LIVE_IGTV" : "UNDEFINED_QPL_EVENT" : "IG_MEDIA_UPLOAD_IGTV";
            case 957:
                return s != 1 ? s == 2 ? "NATIVE_TEMPLATES_ASYNC_ACTIONS_ASYNC_ACTION_ROOMS" : "UNDEFINED_QPL_EVENT" : "NATIVE_TEMPLATES_ASYNC_ACTIONS_ASYNC_ACTION";
            case 963:
                return AbstractC61911Rvj.A00(s);
            case 980:
                return s == 3678 ? "RTC_WWW_WEB_RTC_OPEN_CHAT" : "UNDEFINED_QPL_EVENT";
            case 1002:
                return s != 7912 ? s != 7926 ? s != 11644 ? s == 12896 ? "MAILBOX_HEALTH_LOGS_SDK_IMAGE_MESSAGE_SEND_BINDER_MULTIPLE_ATTACHMENT_AFTER_FIX" : "UNDEFINED_QPL_EVENT" : "MAILBOX_HEALTH_LOGS_SDK_IMAGE_MESSAGE_SEND_BINDER_MULTIPLE_ATTACHMENT_BEFORE_FIX" : "MAILBOX_HEALTH_LOGS_MAILBOX_SDK_API" : "MAILBOX_HEALTH_LOGS_MAILBOX_API";
            case 1016:
                return s == 1981 ? "PLATYPUS_BUSINESS_THREAD_CHECK_FAILED" : "UNDEFINED_QPL_EVENT";
            case 1031:
                return AbstractC61822RuG.A00(s);
            case 1032:
                return s == 12206 ? "GENAI_TRANSPARENCY_READ_API_IG_FETCH_PREDICTED_TIER_BY_AD" : "UNDEFINED_QPL_EVENT";
            case 1041:
                return s != 3447 ? s == 6126 ? "OCULUS_VIDEO_PROFILER_HTTP_TRANSFER_EVENT" : "UNDEFINED_QPL_EVENT" : "OCULUS_VIDEO_PROFILER_VIDEO_PLAYBACK_STATE";
            case 1059:
                return s != 1 ? s == 2 ? "ANDROID_IPC_LOGGING_BG_THREAD_IPC" : "UNDEFINED_QPL_EVENT" : "ANDROID_IPC_LOGGING_MAIN_THREAD_IPC";
            case 1065:
                return s == 15880 ? "THREAD_PRE_MANAGED_MOBILE_ERRORS_PLAY_BACK_BUTTON_CLICK_FOR_SENDING_STATUS" : "UNDEFINED_QPL_EVENT";
            case 1070:
                return s != 1761 ? s != 5245 ? s == 7123 ? "WEARABLE_ML_SERVICE_LOAD_MODEL" : "UNDEFINED_QPL_EVENT" : "WEARABLE_ML_SERVICE_UNLOAD_MODEL" : "WEARABLE_ML_SERVICE_INFERENCE";
            case 1073:
                return s == 3728 ? "FLOATING_NOTIFICATIONS_CHAT_HEAD_OPEN_RELIABILITY" : "UNDEFINED_QPL_EVENT";
            case 1080:
                return s != 2891 ? s != 6927 ? s != 9657 ? s == 15064 ? "MWB_UNKNOWN_CONTACTS_ACCEPT_MESSAGE_REQUEST" : "UNDEFINED_QPL_EVENT" : "MWB_UNKNOWN_CONTACTS_RESTRICT_UNRESTRICT_USER" : "MWB_UNKNOWN_CONTACTS_FIND_MESSAGE_REQUEST" : "MWB_UNKNOWN_CONTACTS_FETCH_MESSAGE_REQUEST";
            case 1103:
                return s == 12012 ? "TOFU_ENTITY_API_FETCH" : "UNDEFINED_QPL_EVENT";
            case 1104:
                return s == 8191 ? "MARKETPLACE_LOCAL_EVENTS_EVENTS_QUERY_FETCH" : "UNDEFINED_QPL_EVENT";
            case 1115:
                return s == 5414 ? "FB_NOTES_FB_NOTES_QUERY" : "UNDEFINED_QPL_EVENT";
            case 1116:
                return s == 1796 ? "WEARABLE_ACCESSIBILITY_TALKBACK_APP_START" : "UNDEFINED_QPL_EVENT";
            case 1123:
                return s != 2011 ? s != 5399 ? s == 12723 ? "REACT_NATIVE_RESPONSIVENESS_RN_EVENT_TIMING_FB_ANDROID" : "UNDEFINED_QPL_EVENT" : "REACT_NATIVE_RESPONSIVENESS_RN_EVENT_TIMING_VR" : "REACT_NATIVE_RESPONSIVENESS_RN_EVENT_TIMING_FB_IOS";
            case 1158:
                return s == 7280 ? "MESSENGER_SMS_SMS_THREAD_LIST_FETCH" : "UNDEFINED_QPL_EVENT";
            case 1163:
                return AbstractC61885RvH.A00(s);
            case 1175:
                return s != 1 ? s != 4031 ? s != 9226 ? s == 12347 ? "INSTAGRAM_DIRECT_SEARCH_RANKING_RENDER_RANKED_ENTITIES_FOR_VIEW" : "UNDEFINED_QPL_EVENT" : "INSTAGRAM_DIRECT_SEARCH_RANKING_LOAD_RANKED_ENTITIES_FOR_VIEW" : "INSTAGRAM_DIRECT_SEARCH_RANKING_BANYAN_NETWORK_FETCH" : "INSTAGRAM_DIRECT_SEARCH_RANKING_SEARCH_NULL_STATE_CHANNEL_RANKING";
            case 1185:
                return s != 6016 ? s != 6146 ? s != 9087 ? s != 9234 ? s != 9438 ? s == 15777 ? "IG_ANDROID_MAIN_FEED_INITIAL_LOAD" : "UNDEFINED_QPL_EVENT" : "IG_ANDROID_MAIN_FEED_MAIN_FEED_FRAGMENT" : "IG_ANDROID_MAIN_FEED_ITEM" : "IG_ANDROID_MAIN_FEED_TAIL_LOAD" : "IG_ANDROID_MAIN_FEED_PTR_RELOAD" : "IG_ANDROID_MAIN_FEED_ASYN_LOADING";
            case 1194:
                return s == 16173 ? "IG_DIRECT_CACHE_CACHE_RESPONSE_TIME" : "UNDEFINED_QPL_EVENT";
            case 1195:
                return s != 1 ? s != 2 ? s == 3449 ? "WHATSAPP_TTRC_LOGGER_UI_ACTION" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_TTRC_LOGGER_TTRC_FAILURE" : "WHATSAPP_TTRC_LOGGER_TTRC_LONG_CANCEL";
            case 1196:
                return AbstractC61884RvG.A00(s);
            case 1199:
                return AbstractC62131Rze.A00(s);
            case 1207:
                return s != 4076 ? s != 9214 ? s == 12386 ? "TOP_OF_HOME_MOBILE_TRAY_FETCH" : "UNDEFINED_QPL_EVENT" : "TOP_OF_HOME_MOBILE_TRAY_AUTOPLAY" : "TOP_OF_HOME_MOBILE_TRAY_EXIT";
            case 1213:
                return s != 1156 ? s != 4254 ? s == 6096 ? "PROXY_SERVICE_CONNECTIVITY_PROBE" : "UNDEFINED_QPL_EVENT" : "PROXY_SERVICE_INIT" : "PROXY_SERVICE_CONNECT";
            case 1239:
                return s != 2187 ? s != 8405 ? s != 10176 ? s == 15545 ? "AR_COMMERCE_CAMERAS_EVENT_IG_DYNAMIC_ADS_FLOW" : "UNDEFINED_QPL_EVENT" : "AR_COMMERCE_CAMERAS_EVENT_IG_MIX_AND_MATCH_FLOW" : "AR_COMMERCE_CAMERAS_EVENT_IG_AR_ADS_FLOW" : "AR_COMMERCE_CAMERAS_EVENT_FB_DYNAMIC_ADS_FLOW";
            case 1241:
                return s != 2042 ? s != 7005 ? s != 10388 ? s == 10580 ? "LIVE_COMMENTS_COMMENT_SUBSCRIBE" : "UNDEFINED_QPL_EVENT" : "LIVE_COMMENTS_COMMENT_RENDER" : "LIVE_COMMENTS_COMMENT_CREATE" : "LIVE_COMMENTS_COMMENT_CREATE_SUBSCRIPTION";
            case 1242:
                return s != 3887 ? s != 9056 ? s != 9461 ? s != 9996 ? s != 12533 ? s == 15113 ? "FPM_PLATFORM_MOBILE_ONBOARDING_REELS_ADS_FLOW" : "UNDEFINED_QPL_EVENT" : "FPM_PLATFORM_MOBILE_ONBOARDING_CIP_REELS_FLOW" : "FPM_PLATFORM_MOBILE_ONBOARDING_CIP_YA_FLOW" : "FPM_PLATFORM_MOBILE_ONBOARDING_VOD_AD_BREAKS_FLOW" : "FPM_PLATFORM_MOBILE_ONBOARDING_LIVE_AD_BREAKS_FLOW" : "FPM_PLATFORM_MOBILE_ONBOARDING_STARS_FLOW";
            case 1254:
                return s != 6786 ? s == 6850 ? "CREATOR_TOOLS_SMART_CROP" : "UNDEFINED_QPL_EVENT" : "CREATOR_TOOLS_FACE_MODEL_DOWNLOAD";
            case 1256:
                return s != 3106 ? s == 12625 ? "UCR_ACRO_CREATION" : "UNDEFINED_QPL_EVENT" : "UCR_ACRO_USAGE";
            case 1257:
                return s != 4453 ? s != 6788 ? s != 7465 ? s != 12244 ? s != 13236 ? s == 14390 ? "MMAI_LIVE_MEDIA_STREAM_GLASSES_SESSION_END" : "UNDEFINED_QPL_EVENT" : "MMAI_LIVE_MEDIA_STREAM_APP_SESSION_ERROR" : "MMAI_LIVE_MEDIA_STREAM_GLASSES_SESSION_IN_PROGRESS" : "MMAI_LIVE_MEDIA_STREAM_APP_SESSION_END" : "MMAI_LIVE_MEDIA_STREAM_PHONE_TO_GLASSES_WARM_START" : "MMAI_LIVE_MEDIA_STREAM_PHONE_TO_GLASSES_COLD_START";
            case 1263:
                return s == 6208 ? "WORKPLACE_NATIVE_APP_COWORKER_INVITES_INVITE_MUTATION_REQUEST" : "UNDEFINED_QPL_EVENT";
            case 1272:
                return s == 3889 ? "BIZ_BADGE_CLIENT_FUNNEL_EVENT" : "UNDEFINED_QPL_EVENT";
            case 1281:
                return s != 1700 ? s != 2736 ? s == 8351 ? "ANDROID_BLUE_SERVICE_MANAGED_MOBILE_ERRORS_FB_USER_SESSION_USER_ID_INCORRECT" : "UNDEFINED_QPL_EVENT" : "ANDROID_BLUE_SERVICE_MANAGED_MOBILE_ERRORS_USING_OVERRIDDEN_VC" : "ANDROID_BLUE_SERVICE_MANAGED_MOBILE_ERRORS_DEAD_CODE";
            case 1305:
                return AbstractC62084Ryt.A00(s);
            case 1317:
                return s == 9679 ? "UNIFIED_SP_TOS_ACCEPTANCE_FLOW" : "UNDEFINED_QPL_EVENT";
            case 1360:
                return s != 11470 ? s == 12384 ? "IG_NOTIFICATIONS_NOTIFICATION_JOURNEY" : "UNDEFINED_QPL_EVENT" : "IG_NOTIFICATIONS_IG_NOTIFICATION_LANDING_FNC";
            case 1364:
                return s != 1 ? s == 2 ? "LAND_TO_CACHE_PERSONALIZATION_LABEL_TIME" : "UNDEFINED_QPL_EVENT" : "LAND_TO_CACHE_PERSONALIZATION_DECISION_TIME";
            case 1394:
                return AbstractC62020RxU.A00(s);
            case 1408:
                return s == 0 ? "TEST_TEST_GINANDI_TEST_GINANDI_EVENT" : "UNDEFINED_QPL_EVENT";
            case 1413:
                return AbstractC62114RzN.A00(s);
            case 1415:
                return s == 1261 ? "RTC_DEVX_AGENT_RTC_ASSERTION" : "UNDEFINED_QPL_EVENT";
            case 1429:
                return s == 5046 ? "WATCH_ADS_LAYOUT_CACHING_DEBUG" : "UNDEFINED_QPL_EVENT";
            case 1437:
                return s != 1 ? s != 2 ? s != 3 ? s != 4 ? s != 6170 ? s == 14538 ? "RELAY_RUNTIME_STORE_LOOKUP" : "UNDEFINED_QPL_EVENT" : "RELAY_RUNTIME_DATACHECKER" : "RELAY_RUNTIME_EXECUTE" : "RELAY_RUNTIME_LIVE_RESOLVER_BATCH" : "RELAY_RUNTIME_STORE_NOTIFY" : "RELAY_RUNTIME_STORE_GC";
            case 1440:
                return s != 2972 ? s == 7192 ? "WHATSAPP_TEST_WHATSAPP_USER_EVENT" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_TEST_WHATSAPP_TEST_EVENT";
            case 1450:
                return s != 3651 ? s != 8629 ? s == 9622 ? "GROUPS_CHAT_CHAT_JOIN" : "UNDEFINED_QPL_EVENT" : "GROUPS_CHAT_CHAT_CREATE" : "GROUPS_CHAT_CHATS_DIRECT_INVITES_SCREEN_OPEN_BLOKS";
            case 1453:
                return s != 1617 ? s != 11748 ? s != 12441 ? s != 13087 ? s != 13577 ? s == 14918 ? "OCULUS_Q4B_KIOSK_HOME_OPEN_DEFAULT_IN_KIOSK_HOME" : "UNDEFINED_QPL_EVENT" : "OCULUS_Q4B_KIOSK_HOME_BRANDED_HOME_LOGO_URL_UPDATED" : "OCULUS_Q4B_KIOSK_HOME_SUBSCRIBE_DEVICE_CONFIG" : "OCULUS_Q4B_KIOSK_HOME_BRANDED_HOME_EVENT" : "OCULUS_Q4B_KIOSK_HOME_MODIFY_QUICK_SETTINGS" : "OCULUS_Q4B_KIOSK_HOME_LOAD_APPS_FROM_OCMS_IN_LIBRARY";
            case 1468:
                return s != 2275 ? s != 7121 ? s == 12943 ? "SUPPORT_BOT_GENAI_ASYNC_JOB" : "UNDEFINED_QPL_EVENT" : "SUPPORT_BOT_SEND_ADMIN_MESSAGE" : "SUPPORT_BOT_IG_SUPPORT_CHAT_SEND_MESSAGE_GRAPHQL_EXECUTION";
            case 1471:
                return s == 8829 ? "FBLITE_NAVIGATION_EDUCATION_FBLITE_NAVIGATION_EDUCATION" : "UNDEFINED_QPL_EVENT";
            case 1486:
                return s == 3616 ? "FB_FEED_ADS_FOOTER_CTA_COLORED_CTA_ON_DWELL" : "UNDEFINED_QPL_EVENT";
            case 1503:
                return s != 1891 ? s == 16361 ? "HSDP_IG_HSDP_CSL_OPEN_FLOW" : "UNDEFINED_QPL_EVENT" : "HSDP_IG_HSDP_OPEN_FLOW";
            case 1509:
                return s != 1 ? s != 2 ? s == 12301 ? "ARMADILLO_NOTIFICATION_RELIABILITY_PUSH_TO_SYNC" : "UNDEFINED_QPL_EVENT" : "ARMADILLO_NOTIFICATION_RELIABILITY_ARMADILLO_NOTIFICATION_RELIABILITY_MESSAGE_LEVEL" : "ARMADILLO_NOTIFICATION_RELIABILITY_ARMADILLO_NOTIFICATION_RELIABILITY_NOTIFICATION_LEVEL";
            case 1517:
                return s == 1 ? "VR_QPL_JOIN_APP_INSTALL" : "UNDEFINED_QPL_EVENT";
            case 1564:
                return s == 10905 ? "IAW_LOADING_SCREEN_IAW_LOADING_SCREEN_BOTTOM_SHEET_DISPLAY" : "UNDEFINED_QPL_EVENT";
            case 1609:
                return s == 15710 ? "SURVEY_PLATFORM_BLOKS_SURVEY_PAGE_SUBMIT_ASYNC" : "UNDEFINED_QPL_EVENT";
            case 1618:
                return s != 2924 ? s == 15237 ? "OCULUS_INLINE_CHECKOUT_OCULUS_INLINE_CHECKOUT_FUNNEL_V2" : "UNDEFINED_QPL_EVENT" : "OCULUS_INLINE_CHECKOUT_OCULUS_INLINE_CHECKOUT_TTRC";
            case 1637:
                return s != 1116 ? s != 5763 ? s != 9811 ? s == 14606 ? "FB_SHORTS_VDD_ANDROID_VDD_NETWORK_HEALTH" : "UNDEFINED_QPL_EVENT" : "FB_SHORTS_VDD_ANDROID_BLUEREELS_VIEWER_INITIAL_LOAD" : "FB_SHORTS_VDD_ANDROID_FB4A_BLUEREELS_VIEWER_REEL_TRANSITION" : "FB_SHORTS_VDD_ANDROID_BLUEREELS_VIEWER_FRAGMENT_ONRESUME";
            case ReactTextInputManager.IME_ACTION_ID /* 1648 */:
                return s != 1 ? s == 2 ? "WEARABLE_PHONE_DATA_SYNC_DESTINATION_APPLY_CHANGE" : "UNDEFINED_QPL_EVENT" : "WEARABLE_PHONE_DATA_SYNC_SOURCE_CHANGE_DETECTION";
            case 1665:
                return s == 2881 ? "SMARTGLASSES_PERF_SPEECH_TRANSLATION_LATENCY" : "UNDEFINED_QPL_EVENT";
            case 1669:
                return s == 8243 ? "WP_ANDROID_WORKCHAT_CHANGE_VIEWER_STATUS" : "UNDEFINED_QPL_EVENT";
            case 1672:
                return s != 3843 ? s != 4466 ? s != 8418 ? s != 8921 ? s != 10502 ? s == 15923 ? "WEARABLE_BREATHE_EXERCISE_HAPTICS" : "UNDEFINED_QPL_EVENT" : "WEARABLE_BREATHE_EXERCISE_ANIMATION_END" : "WEARABLE_BREATHE_EXERCISE_END" : "WEARABLE_BREATHE_EXERCISE_ANIMATION_START" : "WEARABLE_BREATHE_EXERCISE_START" : "WEARABLE_BREATHE_APP_START";
            case 1676:
                return s == 1 ? "IG_ANDROID_SMARTFETCH_IG_ANDROID_APPLY_SMARTFETCH" : "UNDEFINED_QPL_EVENT";
            case 1681:
                return s != 7276 ? s != 9959 ? s != 10262 ? s != 11821 ? s != 11872 ? s == 12541 ? "FACEBOOK_PAY_FBPAY_UNIFIED_RECEIPT" : "UNDEFINED_QPL_EVENT" : "FACEBOOK_PAY_FBPAY_ACTIVITY_LIST" : "FACEBOOK_PAY_FBPAY_HUB_PAYMENT_SETTINGS_TTI" : "FACEBOOK_PAY_FBPAY_HUB_TTI" : "FACEBOOK_PAY_FBPAY_HUB_EDIT_PAYMENT_METHOD_INFO_SCREEN_TTI" : "FACEBOOK_PAY_FBPAY_HUB_ADD_NEW_PAYMENT_METHOD_SCREEN_TTI";
            case 1687:
                return s == 11559 ? "ADS_CONSENT_GROWTH_CONSENT_FLOW_JOURNEY" : "UNDEFINED_QPL_EVENT";
            case 1701:
                return s == 6151 ? "IG_AD_REELS_SN_PLAYING_IG_AD_REELS_SN_PLAYING_EVENT" : "UNDEFINED_QPL_EVENT";
            case 1709:
                return s != 1 ? s != 2 ? s == 3 ? "AR_FOA_AUTH_FETCH_ACCOUNT_DATA" : "UNDEFINED_QPL_EVENT" : "AR_FOA_AUTH_FETCH_ACCOUNTS" : "AR_FOA_AUTH_CHECK_ACCOUNT";
            case 1711:
                return s != 1948 ? s != 5975 ? s != 6679 ? s == 7594 ? "M4MR_PERF_NAVIGATION" : "UNDEFINED_QPL_EVENT" : "M4MR_PERF_CALL_DROP" : "M4MR_PERF_COLD_START" : "M4MR_PERF_VIDEO_STREAM_TTRC";
            case 1718:
                return s != 2314 ? s == 10776 ? "AVATAR_RTC_IG_AVATAR_EFFECT_SELECT" : "UNDEFINED_QPL_EVENT" : "AVATAR_RTC_IG_AVATAR_EFFECT_METADATA_DOWNLOAD";
            case 1721:
                return s == 5925 ? "WHATSAPP_DYNAMIC_TEMPLATE_MESSAGE_BLOKS_LOADING" : "UNDEFINED_QPL_EVENT";
            case 1738:
                return AbstractC61902Rva.A00(s);
            case 1746:
                return S0A.A00(s);
            case 1747:
                return AbstractC62106RzF.A00(s);
            case 1756:
                return s != 1977 ? s != 8486 ? s != 12741 ? s == 16199 ? "WATCH_EXPLORE_REELS_EXPLORE_SURFACE_OVERALL_LOAD" : "UNDEFINED_QPL_EVENT" : "WATCH_EXPLORE_EXPLORE_SURFACE_OVERALL_LOAD" : "WATCH_EXPLORE_EXPLORE_SURFACE_SCROLL" : "WATCH_EXPLORE_EXPLORE_SURFACE_OVERALL_LOAD_WWW";
            case 1760:
                return s == 15584 ? "IG_ANDROID_SCREEN_HDR_SCREEN_HDR_INFO" : "UNDEFINED_QPL_EVENT";
            case 1774:
                return s != 2549 ? s == 13041 ? "TOFU_META_GEN_LABELING" : "UNDEFINED_QPL_EVENT" : "TOFU_META_GEN_FETCH";
            case 1784:
                return s != 3537 ? s != 6729 ? s == 12285 ? "IG_AVATAR_HOME_IG_AVATARS_IMMERSIVE_HOME_LOAD" : "UNDEFINED_QPL_EVENT" : "IG_AVATAR_HOME_IG_AVATARS_IMMERSIVE_HOME_EFFECT_LOAD" : "IG_AVATAR_HOME_IG_AVATARS_IMMERSIVE_HOME_AVATAR_LOAD";
            case 1798:
                return s != 10333 ? s == 12513 ? "DAP_PERFORMANCE_NAVIGATION" : "UNDEFINED_QPL_EVENT" : "DAP_PERFORMANCE_INITIAL_LOAD";
            case 1820:
                return s != 5703 ? s != 5812 ? s == 8650 ? "LOCAL_HUB_HOME_TTI" : "UNDEFINED_QPL_EVENT" : "LOCAL_HUB_HOME_TTRC" : "LOCAL_HUB_HOME_PAGINATION_FCRT";
            case 1824:
                return s != 4792 ? s == 14142 ? "PORTAL_APP_INSTALL_POST_OTA" : "UNDEFINED_QPL_EVENT" : "PORTAL_APP_INSTALL_APP_INSTALL";
            case 1876:
                return s != 9224 ? s != 10143 ? s == 10314 ? "ODIN_INTEGRITY_INITIALIZE" : "UNDEFINED_QPL_EVENT" : "ODIN_INTEGRITY_BLOCKLIST" : "ODIN_INTEGRITY_PREDICT";
            case 1888:
                return AbstractC61927Rvz.A00(s);
            case 1889:
                return AbstractC61896RvS.A00(s);
            case 1891:
                return s == 14386 ? "WEARABLE_DEVICESTATEREPORTER_APP_START" : "UNDEFINED_QPL_EVENT";
            case 1919:
                return s == 1 ? "IG_AVATAR_REACTIONS_REACTIONS_PREFETCHING_TIME" : "UNDEFINED_QPL_EVENT";
            case 1921:
                return s != 3701 ? s != 8385 ? s == 14009 ? "WHATSAPP_CONNECTIVITY_CONNECTION_HEALTH_LOG" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_CONNECTIVITY_CHATD_CONNECTION" : "WHATSAPP_CONNECTIVITY_CHATD_CONNECT";
            case 1944:
                return s != 1152 ? s != 4721 ? s != 5482 ? s == 12405 ? "MESSENGER_ROLL_CALL_ROLL_CALL_SEND" : "UNDEFINED_QPL_EVENT" : "MESSENGER_ROLL_CALL_ROLL_CALL_CAPTURE_CREATION" : "MESSENGER_ROLL_CALL_ROLL_CALL_XMA_CTA_CLICK" : "MESSENGER_ROLL_CALL_ROLL_CALL_VIEWER";
            case 1958:
                return s != 2668 ? s == 11965 ? "ALOHA_USER_MANAGEMENT_EXTERNAL_SERVICE_API" : "UNDEFINED_QPL_EVENT" : "ALOHA_USER_MANAGEMENT_SERVICE_API";
            case 1962:
                return s != 2924 ? s == 12722 ? "FB_REELS_VIDEO_TOOLS_AUTO_CROP" : "UNDEFINED_QPL_EVENT" : "FB_REELS_VIDEO_TOOLS_AUTO_TRIM";
            case 1963:
                return s == 4234 ? "OCULUS_VRSHELL_SHELL_START" : "UNDEFINED_QPL_EVENT";
            case 1982:
                return s != 6589 ? s != 8294 ? s != 14120 ? s == 15845 ? "IG_AVATAR_STICKERS_IG_AVATARS_STICKER_TRAY_ENTER" : "UNDEFINED_QPL_EVENT" : "IG_AVATAR_STICKERS_IG_AVATAR_E2E_STICKERS_RENDERING_LATENCY" : "IG_AVATAR_STICKERS_IG_AVATAR_STICKER_RENDER_LATENCY" : "IG_AVATAR_STICKERS_IG_AVATAR_STICKERS_TTRC";
            case 1984:
                return s == 7122 ? "PLAYABLE_ADS_PLAYABLE_ADS_FUNNEL_TEST" : "UNDEFINED_QPL_EVENT";
            case 1988:
                return s != 5874 ? s != 9333 ? s != 9684 ? s != 12090 ? s != 14823 ? s == 15681 ? "AR_GUIDEBOOK_METRIC_MEASUREMENT_WRISTBAND" : "UNDEFINED_QPL_EVENT" : "AR_GUIDEBOOK_OOBE_FLOW" : "AR_GUIDEBOOK_METRIC_MEASUREMENT" : "AR_GUIDEBOOK_XREYES_QUALITY" : "AR_GUIDEBOOK_METRIC_MEASUREMENT_SCROLL" : "AR_GUIDEBOOK_CALIBRATION_ASSIGNED_MODALITY";
            case 1997:
                return s != 7942 ? s == 9982 ? "META_AI_FAB_FAB_LAUNCH" : "UNDEFINED_QPL_EVENT" : "META_AI_FAB_FAB_TTRC";
            case 2003:
                return s == 12454 ? "META_AI_INTENTS_IMAGINE_CREATION_IMAGINE_IMAGE_CREATION" : "UNDEFINED_QPL_EVENT";
            case 2010:
                return RyA.A00(s);
            case 2017:
                return s != 2287 ? s == 5208 ? "MESSAGING_RELIABILITY_MSYS_BOOTSTRAP" : "UNDEFINED_QPL_EVENT" : "MESSAGING_RELIABILITY_COMMUNITY_MESSAGING_USER_FLOW";
            case 2019:
                return s == 9108 ? "WP_ANDROID_FDID_FDID_MIGRATION" : "UNDEFINED_QPL_EVENT";
            case 2030:
                return s != 5908 ? s == 13441 ? "IXT_IXT_FLOW" : "UNDEFINED_QPL_EVENT" : "IXT_IXT_FLOW_INIT";
            case C3OO.FLAG_MOVED /* 2048 */:
                return s == 6217 ? "NAVIGATION_ANALYTICS_NAVCHAIN_UNEXPECTED_EVENT" : "UNDEFINED_QPL_EVENT";
            case 2053:
                return s == 4774 ? "CAROUSEL_INFORMATION_CARD_INFORMATION_OVERLAY_RENDERING" : "UNDEFINED_QPL_EVENT";
            case 2072:
                return s != 15740 ? s == 16353 ? "IG_RANKING_DIRECT_DELIVERY" : "UNDEFINED_QPL_EVENT" : "IG_RANKING_DIRECT_DELIVERY_ACCURACY";
            case 2085:
                return s != 1160 ? s != 9261 ? s != 10053 ? s == 13939 ? "WEARABLE_CALENDAR_CALENDAR_SYNC" : "UNDEFINED_QPL_EVENT" : "WEARABLE_CALENDAR_APP_START" : "WEARABLE_CALENDAR_CALENDAR_RSVP_EVENT" : "WEARABLE_CALENDAR_CALENDAR_LOAD_EVENT_DETAIL";
            case 2090:
                return s != 12965 ? s != 13758 ? s == 14361 ? "MESSAGING_SEARCH_SHARING_MESSAGING_SEARCH_ISSUE_SERVER_QUERY" : "UNDEFINED_QPL_EVENT" : "MESSAGING_SEARCH_SHARING_MESSAGING_SEARCH_NULL_STATE" : "MESSAGING_SEARCH_SHARING_MESSAGING_SEARCH_QUERY_STATE";
            case 2091:
                return s == 7826 ? "SMARTGLASSES_GPU_COMPUTING_HN_GPU_SESSION" : "UNDEFINED_QPL_EVENT";
            case 2094:
                return s == 3464 ? "WHATSAPP_DIRECT_MIGRATION_DIRECT_MIGRATION_BACKGROUND_TASK" : "UNDEFINED_QPL_EVENT";
            case 2131:
                return AbstractC62135Rzi.A00(s);
            case 2153:
                return s != 1 ? s != 8834 ? s == 9808 ? "FBLITE_PERIODIC_TASKS_FBLITE_JOB_SERVICE_TASK_EXECUTER" : "UNDEFINED_QPL_EVENT" : "FBLITE_PERIODIC_TASKS_FBLITE_JOB_INTENT_SERVICE_TASK_EXECUTER" : "FBLITE_PERIODIC_TASKS_FBLITE_EXECUTE_TASK";
            case 2200:
                return s != 11881 ? s == 13764 ? "RTC_RELIABILITY_RTC_CALL_RELIABILITY" : "UNDEFINED_QPL_EVENT" : "RTC_RELIABILITY_CALL_SUMMARY_COLD_START_UPLOAD";
            case 2204:
                return s != 6718 ? s == 7811 ? "FBLITE_ADS_FBLITE_ADS_WATCH_AND_BROWSE" : "UNDEFINED_QPL_EVENT" : "FBLITE_ADS_FBLITE_ADS_WATCH_AND_INSTALL";
            case 2224:
                return s != 1950 ? s != 2486 ? s != 3733 ? s != 14661 ? s == 14834 ? "IG_SHARESHEET_NAVIGATE_CREATE_GROUP" : "UNDEFINED_QPL_EVENT" : "IG_SHARESHEET_SHARE_MEDIA_TO_STORY" : "IG_SHARESHEET_OPEN_SHARESHEET" : "IG_SHARESHEET_DIRECT_SEND" : "IG_SHARESHEET_OPEN_SHARESHEET_HSCROLL";
            case 2241:
                return s != 6988 ? s != 10518 ? s != 13201 ? s == 15339 ? "IN_PRODUCT_SUPPORT_USER_CLICK_CLOSE_CHAT_BUTTON" : "UNDEFINED_QPL_EVENT" : "IN_PRODUCT_SUPPORT_USER_CLICK_CHAT_BUTTON" : "IN_PRODUCT_SUPPORT_USER_RENDER_CHAT_THREAD" : "IN_PRODUCT_SUPPORT_USER_RENDER_ATTACHMENT";
            case 2243:
                return s == 2862 ? "MOBILE_PROBER_SEND_PROBE" : "UNDEFINED_QPL_EVENT";
            case 2246:
                return AbstractC62071Ryg.A00(s);
            case 2254:
                return s == 8020 ? "PARACOSMA_CLIENT_TELMETRY_ALL" : "UNDEFINED_QPL_EVENT";
            case 2261:
                return s == 14490 ? "AR_AUDIO_OS_AR_AUDIO_XRA_HEALTH_METRICS" : "UNDEFINED_QPL_EVENT";
            case 2265:
                return s == 6272 ? "WA_CONTACTS_CONTACTS_LOADING" : "UNDEFINED_QPL_EVENT";
            case 2287:
                return s != 8155 ? s == 12253 ? "REACT_NATIVE_INFRA_CORE_BRIDGELESS" : "UNDEFINED_QPL_EVENT" : "REACT_NATIVE_INFRA_RUN_JS_BUNDLE_BRIDGELESS";
            case 2289:
                return s == 11441 ? "WEARABLE_PERCEIVED_BOOT_DEVICE_TTI" : "UNDEFINED_QPL_EVENT";
            case 2294:
                return s == 10716 ? "SHARED_PHONE_LOGIN_SHARED_PHONE_ACCOUNT_RECOVERY" : "UNDEFINED_QPL_EVENT";
            case 2322:
                return AbstractC61840RuY.A00(s);
            case 2326:
                return s != 12591 ? s == 14678 ? "HORIZON_EDIT_MODE_EDIT_MODE_MUTATION" : "UNDEFINED_QPL_EVENT" : "HORIZON_EDIT_MODE_EDIT_MODE_2_AUTOSAVE";
            case 2333:
                return s == 6735 ? "FEED_UI_FEED_COMPONENT_LIFECYCLE_LISTENER_STATE_ERROR" : "UNDEFINED_QPL_EVENT";
            case 2357:
                return s != 6342 ? s != 6955 ? s != 8332 ? s == 10429 ? "WHATSAPP_MESSAGE_SEND_PERF_MESSAGE_INFO" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_MESSAGE_SEND_PERF_GROUP_INFO" : "WHATSAPP_MESSAGE_SEND_PERF_IQ_SEND_PERF" : "WHATSAPP_MESSAGE_SEND_PERF_MESSAGE_SEND_PERF";
            case 2394:
                return s != 9036 ? s != 10875 ? s == 15796 ? "LIVECHAT_PREMIUM_RELIABILITY_EMAIL_FALLBACK_SUBMIT_FORM_BUTTON_CLICK" : "UNDEFINED_QPL_EVENT" : "LIVECHAT_PREMIUM_RELIABILITY_EMAIL_FALLBACK_CONCLUDE_FLOW_BUTTON_CLICK" : "LIVECHAT_PREMIUM_RELIABILITY_EMAIL_FALLBACK_START_BUTTON_CLICK";
            case 2396:
                return s != 2329 ? s != 2589 ? s != 7739 ? s != 14825 ? s == 14982 ? "MEDIA_STREAMING_SDK_PAUSE" : "UNDEFINED_QPL_EVENT" : "MEDIA_STREAMING_SDK_PRE_BROADCAST" : "MEDIA_STREAMING_SDK_BROADCAST" : "MEDIA_STREAMING_SDK_RESUME" : "MEDIA_STREAMING_SDK_POST_BROADCAST";
            case 2407:
                return S0V.A00(s);
            case 2408:
                return s != 1328 ? s != 5114 ? s != 7687 ? s != 8004 ? s != 13690 ? s == 14324 ? "FIXIE_FIXIE_INIT" : "UNDEFINED_QPL_EVENT" : "FIXIE_FIXIE_WEBVIEW_INIT_ERROR_HANDING" : "FIXIE_DATA_CONTEXT_MME" : "FIXIE_OBJECT_COUNT" : "FIXIE_FIXIE_WEBVIEW_PRE_INIT" : "FIXIE_WATCHDOG";
            case 2415:
                return s == 3782 ? "FBLITE_IMAGE_EFFICIENCY_EFFICIENCY" : "UNDEFINED_QPL_EVENT";
            case 2424:
                return AbstractC61820RuE.A00(s);
            case 2428:
                return s != 7644 ? s == 12841 ? "PRIVACY_MOBILE_COMPOSER_FIXED_PILL_UNEXPECTED_LABEL" : "UNDEFINED_QPL_EVENT" : "PRIVACY_MOBILE_THREADED_POST_STANDALONE_EDIT";
            case 2430:
                return s != 3222 ? s == 13575 ? "NATIVE_TEMPLATES_ANDROID_FB4A_STYLE_MAP" : "UNDEFINED_QPL_EVENT" : "NATIVE_TEMPLATES_ANDROID_CONTEXT";
            case 2438:
                return AbstractC62065Rya.A00(s);
            case 2473:
                return AbstractC61921Rvt.A00(s);
            case 2474:
                return s == 7814 ? "DEVELOPERTELEMETRYQPLTESTS_DEVELOPER_TELEMETRY_ANDROID_QPL_TEST" : "UNDEFINED_QPL_EVENT";
            case 2488:
                return Ry8.A00(s);
            case 2503:
                return s == 5143 ? "MESSENGER_PRE_SAPIENZ_WA_MSYS_CONNECTED" : "UNDEFINED_QPL_EVENT";
            case 2514:
                return s == 6011 ? "COMET_TASK_FRAMEWORK_EXECUTE_TASK" : "UNDEFINED_QPL_EVENT";
            case 2515:
                return s != 1 ? s == 9662 ? "MEMU_ONBOARDING_UNEXPECTED_EVENT" : "UNDEFINED_QPL_EVENT" : "MEMU_ONBOARDING_CREATE_PROFILE";
            case 2523:
                return s != 1644 ? s == 14211 ? "WEARABLE_STICKER_SET_LOAD_TIME_SELF_CARE_STICKER_TRAY_LOADING" : "UNDEFINED_QPL_EVENT" : "WEARABLE_STICKER_SET_LOAD_TIME_SELF_CARE_INDIVIDUAL_STICKER_LOADING";
            case 2566:
                return s != 2138 ? s == 4841 ? "DISCO_CONNECTIVITY_PAIRING_READY" : "UNDEFINED_QPL_EVENT" : "DISCO_CONNECTIVITY_DISCOVERY_READY";
            case 2611:
                return AbstractC62146Rzt.A00(s);
            case 2618:
                return s == 13362 ? "GROUP_ROOMS_CREATE_ROOM_FLOW" : "UNDEFINED_QPL_EVENT";
            case 2636:
                return s == 2535 ? "FBLITE_MEDIA_PERF_CANARY_IMAGE_LOAD" : "UNDEFINED_QPL_EVENT";
            case 2654:
                return s == 8768 ? "FB_FEED_ADS_CONTEXT_HEADER_FACEPILE_RENDERING_FLOW" : "UNDEFINED_QPL_EVENT";
            case 2655:
                return s == 1 ? "UNIFIED_UPLOAD_MOS_CLIENT_SIDE_CALCULATE_MOS" : "UNDEFINED_QPL_EVENT";
            case 2670:
                return s != 9626 ? s == 9800 ? "APS_APC_ID_TRANSLATION" : "UNDEFINED_QPL_EVENT" : "APS_APC_APS_INTERFACE";
            case 2675:
                return s != 6483 ? s == 14856 ? "OCULUS_TELEMETRY_DEBUG_USAGE_FAKE_EVENT" : "UNDEFINED_QPL_EVENT" : "OCULUS_TELEMETRY_DEBUG_USAGE_DEBUG_HANDLER_USAGE";
            case 2701:
                return s != 2474 ? s != 7791 ? s != 8179 ? s != 13365 ? s != 13704 ? s == 14686 ? "RP_WAITING_ROOM_INSTRUCTOR_TOGGLE_JOIN_PERMISSION_VALUE" : "UNDEFINED_QPL_EVENT" : "RP_WAITING_ROOM_JOIN_PERMISSION_STATUS_NOTIFICATION_SHOWN" : "RP_WAITING_ROOM_JOIN_REQUESTS_PARTICIPANT_DIALOG" : "RP_WAITING_ROOM_INSTRUCTOR_VIEW_FOOTER_CLICK" : "RP_WAITING_ROOM_INSTRUCTOR_VIEW_ADMIT_ALL_CLICK" : "RP_WAITING_ROOM_OPEN_SETTING_NOTIFICATION_SHOWN";
            case 2705:
                return s != 5488 ? s == 7992 ? "CONTEXTUAL_RECON_TAIL_LOAD" : "UNDEFINED_QPL_EVENT" : "CONTEXTUAL_RECON_HEAD_LOAD";
            case 2719:
                return s == 8299 ? "GROUPS_TAB_SYSTEM_FUNNEL_CROSS_GROUP_FEED_LOAD" : "UNDEFINED_QPL_EVENT";
            case 2731:
                return s != 3596 ? s != 7246 ? s != 10118 ? s == 12982 ? "SECURE_AUTH_PLATFORM_SAP_VESTA_LOGIN" : "UNDEFINED_QPL_EVENT" : "SECURE_AUTH_PLATFORM_CREATE_AUTH_TOKEN" : "SECURE_AUTH_PLATFORM_SAP_VESTA_REGISTER" : "SECURE_AUTH_PLATFORM_SAP_AUTHENTICATE";
            case 2748:
                return s != 6176 ? s == 6385 ? "FEED_PLUGIN_LOGGING_PLUGIN_IS_NEEDED" : "UNDEFINED_QPL_EVENT" : "FEED_PLUGIN_LOGGING_PLUGIN_GET";
            case 2749:
                return S0S.A00(s);
            case 2767:
                return s == 4151 ? "WHATSAPP_BACKUP_WHATSAPP_BACKUP_EVENT" : "UNDEFINED_QPL_EVENT";
            case 2770:
                return s == 6190 ? "IG_REELS_GREENSCREEN_GS_CAMERA_LOAD" : "UNDEFINED_QPL_EVENT";
            case 2777:
                return s == 1 ? "ANDROID_IMAGES_INFRA_MEDIA_GALLERY_MEDIA_GALLERY_FLOW" : "UNDEFINED_QPL_EVENT";
            case 2800:
                return s != 3259 ? s == 15322 ? "FOS_HEADERS_CLIENT_FLOW" : "UNDEFINED_QPL_EVENT" : "FOS_HEADERS_CLIENT_PRODUCT_FLOW";
            case 2802:
                return s == 8294 ? "MOBILE_NETWORK_STACK_FILTERED_HTTP_REQUEST" : "UNDEFINED_QPL_EVENT";
            case 2807:
                return s == 12990 ? "WEARABLE_BUGREPORT_BUGREPORT_SUBMIT" : "UNDEFINED_QPL_EVENT";
            case 2823:
                return s == 9840 ? "IG_COWATCH_IG_COWATCH_BROWSE_SURFACE_TTRC" : "UNDEFINED_QPL_EVENT";
            case 2830:
                return S00.A00(s);
            case 2840:
                return s != 6680 ? s == 10671 ? "AR_PONG_TIME_TO_INTERACT" : "UNDEFINED_QPL_EVENT" : "AR_PONG_NETWORK_PACKET_DELAY_ON_BALL_HIT";
            case 2854:
                return s == 11660 ? "GROUPS_MEMBER_REPORTED_CONTENT_REVIEW_MEMBER_REPORTED_CONTENT_FLOW" : "UNDEFINED_QPL_EVENT";
            case 2872:
                return s != 5605 ? s == 6872 ? "PAPAYA_SUBMISSION" : "UNDEFINED_QPL_EVENT" : "PAPAYA_EXECUTION";
            case 2890:
                return s != 13656 ? s == 16271 ? "MROS_AUTH_TELEMETRY_GET_TOKEN_API_CALL" : "UNDEFINED_QPL_EVENT" : "MROS_AUTH_TELEMETRY_INVALIDATE_TOKEN_API_CALL";
            case 2906:
                return AbstractC62022RxW.A00(s);
            case 2907:
                return s != 2223 ? s == 8606 ? "SI_LEARNING_UNIT_DETAILS_PAGING_TTRC_NT" : "UNDEFINED_QPL_EVENT" : "SI_LEARNING_UNITS_LIST_PAGING_TTRC_NT";
            case 2908:
                return s != 4881 ? s != 6841 ? s != 9398 ? s == 13742 ? "SMART_TARGETING_PREDICT_APP_JOB" : "UNDEFINED_QPL_EVENT" : "SMART_TARGETING_CLIENT_QP_FILTER" : "SMART_TARGETING_FILTER_INITIALIZE" : "SMART_TARGETING_FILTER_APPLY";
            case 2917:
                return s == 14930 ? "WEBLITE_PERF_WEBLITE_STARTUP_CLIENT_NON_BUNDLE" : "UNDEFINED_QPL_EVENT";
            case 2924:
                return s == 9081 ? "IG_YIS_IG_TIME_ENFORCEMENT" : "UNDEFINED_QPL_EVENT";
            case 2927:
                return s != 2412 ? s == 12720 ? "WEARABLE_PHONE_CALL_START" : "UNDEFINED_QPL_EVENT" : "WEARABLE_PHONE_APP_START";
            case 2929:
                return Ry9.A00(s);
            case 2931:
                return s == 6434 ? "EMG_QPL_LAUNCHER_GESTURE" : "UNDEFINED_QPL_EVENT";
            case 2937:
                return AbstractC62096Rz5.A00(s);
            case 2941:
                return s != 9573 ? s == 15115 ? "CONSENT_UI_FRAMEWORK_INSTAGRAM_ALASKA_OPEN_FLOW" : "UNDEFINED_QPL_EVENT" : "CONSENT_UI_FRAMEWORK_FB4A_OPEN_FLOW";
            case 2954:
                return s != 2718 ? s != 10399 ? s == 10845 ? "GENERAL_CREATION_MME_GENERAL_UNEXPECTED_EVENT" : "UNDEFINED_QPL_EVENT" : "GENERAL_CREATION_MME_DRAFT_MEDIA_FILE_CLEANUP_FAIL" : "GENERAL_CREATION_MME_CRITICAL_UNEXPECTED_EVENT";
            case 2984:
                return s != 2852 ? s == 9152 ? "PLATFORM_LOGIN_MOBILE_SDK_OAUTH_LOGIN" : "UNDEFINED_QPL_EVENT" : "PLATFORM_LOGIN_WEB_OAUTH_DIALOG_LOGIN";
            case 3006:
                return s != 3389 ? s == 9889 ? "HORIZON_NPC_CREATION_NAVMESH_AGENT_SERVER_INSTANTIATION" : "UNDEFINED_QPL_EVENT" : "HORIZON_NPC_CREATION_NAVMESH_AGENT_CLIENT_INSTANTIATION";
            case 3036:
                return s != 2795 ? s == 4849 ? "FB_BLOKS_SEARCH_COMPONENTS_CALCULATE_LAYOUT_STATE" : "UNDEFINED_QPL_EVENT" : "FB_BLOKS_SEARCH_COMPONENTS_MOUNT";
            case 3057:
                return s == 14570 ? "IG_ANDROID_SCROLL_LISTENER_SCROLL_LISTENER" : "UNDEFINED_QPL_EVENT";
            case 3063:
                return s != 2318 ? s != 3629 ? s != 6582 ? s == 13913 ? "WHATSAPP_EXTENSIONS_WAE_SCREEN_NAVIGATION" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_EXTENSIONS_WAE_METADATA" : "WHATSAPP_EXTENSIONS_WAE_PSL_PREFETCH" : "WHATSAPP_EXTENSIONS_WAE_INIT_PHOENIX_FLOW";
            case 3100:
                return s == 6032 ? "IG_WELLBEING_IDENTITY_SAFETY_TWO_FACTOR_LOGIN" : "UNDEFINED_QPL_EVENT";
            case 3105:
                return s != 1 ? s == 15984 ? "VIPRE_SIGNALS_SIGNALS_DEVICE_HEALTH" : "UNDEFINED_QPL_EVENT" : "VIPRE_SIGNALS_SIGNALS_RAW_EVENT";
            case 3106:
                return s != 1 ? s != 3438 ? s == 7349 ? "IG_CREATOR_INSPIRATION_INSPIRATION_HUB_LOAD" : "UNDEFINED_QPL_EVENT" : "IG_CREATOR_INSPIRATION_INSPIRATION_HUB_REELS_SCROLL_PERF" : "IG_CREATOR_INSPIRATION_INSPIRATION_HUB_SCROLL_PERF";
            case 3130:
                return s != 6596 ? s != 6708 ? s != 10786 ? s == 11117 ? "MESSENGER_DESKTOP_MEDIA_QUALITY_RSYS_CAMERA_CONTROLLER_REFRESH_CAMERA_LIST" : "UNDEFINED_QPL_EVENT" : "MESSENGER_DESKTOP_MEDIA_QUALITY_AUDIO_SESSION_CONTROLLER_REFRESH_AUDIO_DEVICES" : "MESSENGER_DESKTOP_MEDIA_QUALITY_RSYS_CAMERA_CONTROLLER_TURN_CAMERA_ON" : "MESSENGER_DESKTOP_MEDIA_QUALITY_RSYS_CAMERA_CONTROLLER_APPLY_TARGET_CAPTURE_SETTINGS";
            case 3135:
                return s != 3908 ? s != 12221 ? s != 12880 ? s == 12932 ? "FB_STORY_ADS_FB_STORY_ADS_PUBLISH_AD_BUCKET" : "UNDEFINED_QPL_EVENT" : "FB_STORY_ADS_FB_STORY_ADS_CONVERSION_FUNNEL" : "FB_STORY_ADS_FB_STORY_ADS_UNEXPECTED_EVENT" : "FB_STORY_ADS_FB_STORY_ADS_BUCKET_FLOW";
            case 3164:
                return s == 12881 ? "WHATSAPP_BUSINESS_SEARCH_ANDROID_WA_BUSINESS_SEARCH_GPS_LOCATION" : "UNDEFINED_QPL_EVENT";
            case 3174:
                return s != 5639 ? s == 9716 ? "XROS_WIFI_XROS_WIFI_SCAN" : "UNDEFINED_QPL_EVENT" : "XROS_WIFI_XROS_WIFI_DRIVER_BOOT";
            case 3180:
                return s != 4591 ? s == 10063 ? "IG_SMB_PROMOTE_MESSAGING_APP_SELECTION_IG_BOOST_MESSAGING_APP_SELECTION_RENDERED" : "UNDEFINED_QPL_EVENT" : "IG_SMB_PROMOTE_MESSAGING_APP_SELECTION_IG_BOOST_CTWA_RENDERED";
            case 3197:
                return s != 1250 ? s == 7105 ? "MESSENGER_DMA_INTEROP_INTEROP_OPT_IN" : "UNDEFINED_QPL_EVENT" : "MESSENGER_DMA_INTEROP_SHADOW_TEST_INTEROP_OPT_IN";
            case 3204:
                return s != 2292 ? s == 12391 ? "SCREENSHARE_FLOOR_CONTROL_VIEWER" : "UNDEFINED_QPL_EVENT" : "SCREENSHARE_FLOOR_CONTROL_PRESENTER";
            case 3227:
                return s != 8327 ? s != 9357 ? s == 11731 ? "OCULUS_FALCO_TO_QPL_JOIN_OCULUS_TIME_TO_FUN_QPL_JOIN" : "UNDEFINED_QPL_EVENT" : "OCULUS_FALCO_TO_QPL_JOIN_OCULUS_TIME_TO_FUN_QPL_JOIN_V2" : "OCULUS_FALCO_TO_QPL_JOIN_OCULUS_TIME_TO_FUN_QPL_JOIN_HW_SERIAL";
            case 3252:
                return s != 5987 ? s != 7008 ? s != 8400 ? s == 11967 ? "WP_WHITEBOARD_UI_OPENED" : "UNDEFINED_QPL_EVENT" : "WP_WHITEBOARD_UI_CLOSED" : "WP_WHITEBOARD_NOTIFICATION_SHOWN" : "WP_WHITEBOARD_SESSION_RECEIVED";
            case 3255:
                return s == 4494 ? "ANDROID_BATTERY_ANIMATOR_LEAK" : "UNDEFINED_QPL_EVENT";
            case 3262:
                return s == 5682 ? "PERMALINK_BODYTEXT_HIGHLIGHTING_PERMALINK_BODYTEXT_FUNNEL" : "UNDEFINED_QPL_EVENT";
            case 3267:
                return s == 5292 ? "ALOHA_IDENTITY_FUNNELS_ALOHA_ADD_ACCOUNT_FUNNEL_EVENT" : "UNDEFINED_QPL_EVENT";
            case 3286:
                return s != 2618 ? s != 5857 ? s != 8630 ? s == 9569 ? "WHATSAPP_SMBA_NATIVE_COMMERCE_WHATSAPP_LOAD_COLLECTION_MANAGEMENT_HOME" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_SMBA_NATIVE_COMMERCE_WHATSAPP_NATIVE_COMMERCE_CATALOG" : "WHATSAPP_SMBA_NATIVE_COMMERCE_WHATSAPP_LOAD_CATALOG" : "WHATSAPP_SMBA_NATIVE_COMMERCE_WHATSAPP_LOAD_COLLECTION_PRODUCTS";
            case 3297:
                return s == 1 ? "IG_NOTIFICATION_ERRORS_IG_NOTIFICATION_UNEXPECTED_EVENT" : "UNDEFINED_QPL_EVENT";
            case 3315:
                return s == 5816 ? "WHATSAPP_BUSINESS_AI_SMB_WA_BIZ_AI_CTWA_TEXT_CONTENT_GEN_ANDROID" : "UNDEFINED_QPL_EVENT";
            case 3316:
                return s != 1 ? s != 2 ? s != 8021 ? s != 8568 ? s == 11629 ? "IG_END_TO_END_TEST_PASS_EMPLOYEE_AND_DOGFOODER_CHECK" : "UNDEFINED_QPL_EVENT" : "IG_END_TO_END_TEST_MC_OVERRIDE" : "IG_END_TO_END_TEST_PASS_LAUNCHED_GK" : "IG_END_TO_END_TEST_QE_OVERRIDE" : "IG_END_TO_END_TEST_GK_OVERRIDE";
            case 3317:
                return Ry3.A00(s);
            case 3327:
                return s == 13014 ? "ROOMS_DISCOVERY_JOIN_END_TO_END_ROOMS_DISCOVERY_JOIN_END_TO_END_EVENT" : "UNDEFINED_QPL_EVENT";
            case 3330:
                return s != 6353 ? s == 10428 ? "IG_SAVE_COLLECTIONS_SAVE_COLLECTION_LIST_VIEW_TTRC" : "UNDEFINED_QPL_EVENT" : "IG_SAVE_COLLECTIONS_SAVE_COLLECTION_DETAIL_VIEW_TTRC";
            case 3334:
                return s != 1 ? s == 2 ? "BACKGROUND_PREFETCH_PERSONALIZATION_LABEL_TIME" : "UNDEFINED_QPL_EVENT" : "BACKGROUND_PREFETCH_PERSONALIZATION_DECISION_TIME";
            case 3359:
                return AbstractC72556Xgc.A00(s);
            case 3387:
                return s != 1232 ? s != 1307 ? s == 9794 ? "COMPPHOTO_SHOWROOM_APP_SESSION" : "UNDEFINED_QPL_EVENT" : "COMPPHOTO_SHOWROOM_HOLLYWOOD_PREVIEW" : "COMPPHOTO_SHOWROOM_HOLLYWOOD_TRANSCODE";
            case 3400:
                return AbstractC61993Rx3.A00(s);
            case 3416:
                return AbstractC62025RxZ.A00(s);
            case 3417:
                return s == 4491 ? "OCULUS_TWILIGHT_TTRC_TWILIGHT_TTRC" : "UNDEFINED_QPL_EVENT";
            case 3423:
                return AbstractC61948RwK.A00(s);
            case 3433:
                return s == 2310 ? "FBLITE_COMPOSER_BLOCK_FBLITE_COMPOSER_BLOCK_LOADED_THREAD_SCREEN" : "UNDEFINED_QPL_EVENT";
            case 3437:
                return s != 7608 ? s == 10188 ? "STACKING_MEDIA_STACKING_MEDIA_FETCHING_TIME" : "UNDEFINED_QPL_EVENT" : "STACKING_MEDIA_STACKING_MEDIA_GROUPING_TIME";
            case 3467:
                return s == 14016 ? "IFU_DELIVERY_IFU_LOAD_TTRC" : "UNDEFINED_QPL_EVENT";
            case 3479:
                return AbstractC62103RzC.A00(s);
            case 3502:
                return s == 15296 ? "EMERGING_BUSINESS_STARS_SEND_N_COMMENT_CREATED_STARS_SEND_N_COMMENT_CREATED" : "UNDEFINED_QPL_EVENT";
            case 3528:
                return s != 10936 ? s == 15796 ? "FB_TO_IG_CROSSPOST_FEED_SHARE_LATER" : "UNDEFINED_QPL_EVENT" : "FB_TO_IG_CROSSPOST_STORY_SHARE_LATER";
            case 3529:
                return AbstractC61871Rv3.A00(s);
            case 3530:
                return AbstractC61990Rx0.A00(s);
            case 3538:
                return s == 7985 ? "RP_GROUP_EXPANSION_ARMADILLO_GROUP_EXPANSION" : "UNDEFINED_QPL_EVENT";
            case 3539:
                return AbstractC61843Rub.A00(s);
            case 3551:
                return s == 7742 ? "WORK_REPORTING_SUBMIT_REPORT" : "UNDEFINED_QPL_EVENT";
            case 3563:
                return s == 1 ? "EXAMPLE_EVENT_NAME" : "UNDEFINED_QPL_EVENT";
            case 3584:
                return s == 5636 ? "APP_LOCK_AUTH_FLOW" : "UNDEFINED_QPL_EVENT";
            case 3593:
                return s != 1272 ? s != 6566 ? s != 7559 ? s != 13348 ? s == 15188 ? "AUGMENT_GRAPH_GET_AUGMENT_GROUP" : "UNDEFINED_QPL_EVENT" : "AUGMENT_GRAPH_GET_AUGMENT_GROUPS" : "AUGMENT_GRAPH_REMOVE_AUGMENT_FROM_GROUP" : "AUGMENT_GRAPH_UPDATE_AUGMENT_GROUP_AUGMENT_PLACEMENT" : "AUGMENT_GRAPH_GET_OR_CREATE_AUGMENT_GROUP_WITH_DOOR_ID";
            case 3599:
                return s != 1390 ? s == 10794 ? "PRIVACY_INFRA_END_TO_END_ENCRYPTION_VESTA_BACKUP_KEY_RESTORE" : "UNDEFINED_QPL_EVENT" : "PRIVACY_INFRA_END_TO_END_ENCRYPTION_VESTA_BACKUP_KEY_REGISTRATION";
            case 3628:
                return s != 1170 ? s != 2451 ? s != 9599 ? s != 10125 ? s == 15646 ? "AR_COMPOSITOR_IMU_WLR_STAGE_LOOP_LATENCY" : "UNDEFINED_QPL_EVENT" : "AR_COMPOSITOR_COMPOSITOR_FRAME_TIME" : "AR_COMPOSITOR_AR_COMPOSITOR_ERROR" : "AR_COMPOSITOR_WAITFRAME_TO_MERCURY_SUBMIT" : "AR_COMPOSITOR_MERCURY_SUBMIT_TO_DELPHI_PRESENT";
            case 3643:
                return s == 6966 ? "IG_PREVIEWABLE_VIDEO_AD_IG_ME_PREVIEWABLE_VIDEO_ADS_USER_FLOW" : "UNDEFINED_QPL_EVENT";
            case 3645:
                return s != 4280 ? s == 11502 ? "WHATSAPP_PAID_MESSAGING_EXPERIENCES_CAROUSEL_MESSAGE_RENDER" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_PAID_MESSAGING_EXPERIENCES_CAROUSEL_MESSAGE_RECEIVE";
            case 3646:
                return S0X.A00(s);
            case 3654:
                return s == 2486 ? "WA_MEX_EXAMPLE_MEX_OPERATION_EXAMPLE" : "UNDEFINED_QPL_EVENT";
            case 3664:
                return s != 3962 ? s != 7355 ? s == 11807 ? "ACCOUNT_RECOVERY_LARA_ENDPOINT" : "UNDEFINED_QPL_EVENT" : "ACCOUNT_RECOVERY_FLASH_CALL" : "ACCOUNT_RECOVERY_AUTO_CONF";
            case 3670:
                return s != 2272 ? s == 2592 ? "WWW_GRAPHQL_WWW_REELS_AGGREGATION" : "UNDEFINED_QPL_EVENT" : "WWW_GRAPHQL_WWW_GRAPHQL_EXECUTION";
            case 3686:
                return s != 3288 ? s != 3444 ? s != 10219 ? s == 16377 ? "COMPOSER_MEDIA_TEMPLATE_PREVIEW_CLIENT_TTI" : "UNDEFINED_QPL_EVENT" : "COMPOSER_MEDIA_TEMPLATE_PREVIEW_PREVIEW_RESULT_CALLBACK" : "COMPOSER_MEDIA_TEMPLATE_PREVIEW_REMOTE_PRECREATION_STORIES_PERFORMANCE_LOGGER" : "COMPOSER_MEDIA_TEMPLATE_PREVIEW_PREVIEW_SET_CREATION";
            case 3720:
                return s == 9496 ? "FB_REELS_MULTI_MEDIA_ADS_NATIVE_SLIDESHOW" : "UNDEFINED_QPL_EVENT";
            case 3721:
                return s == 10436 ? "WWW_LEAD_GEN_MSITE_AD_UNIT_FUNNEL_WWW_LEAD_GEN_MSITE_AD_UNIT_FUNNEL_TEST" : "UNDEFINED_QPL_EVENT";
            case 3733:
                return s == 10310 ? "VIDEO_AGGREGATION_VIDEO_PLAYBACK_LOCAGG_ANDROID" : "UNDEFINED_QPL_EVENT";
            case 3734:
                return s != 1243 ? s != 4954 ? s == 5336 ? "DEVICE_CONFIG_MCS_REINIT" : "UNDEFINED_QPL_EVENT" : "DEVICE_CONFIG_MCS_INIT" : "DEVICE_CONFIG_CLIENT_INIT";
            case 3736:
                return s != 3176 ? s == 12433 ? "OHAI_SEND_REQUEST" : "UNDEFINED_QPL_EVENT" : "OHAI_IOS_STICKER";
            case 3749:
                return s == 6549 ? "IG_MOBILE_IG_SOFT_ERROR" : "UNDEFINED_QPL_EVENT";
            case 3751:
                return s != 6602 ? s == 14832 ? "PAYMENT_PROFILER_PAYMENT_PROFILER_DEFAULT_V3" : "UNDEFINED_QPL_EVENT" : "PAYMENT_PROFILER_PAYMENT_PROFILER_DEFAULT_V2";
            case 3762:
                return AbstractC61984Rwu.A00(s);
            case 3763:
                return s != 2704 ? s != 3556 ? s != 11014 ? s != 12026 ? s == 15482 ? "IG_REELS_AUTO_CREATED_REEL_CREATION_ACR_BROWSER_CAMERA_ROLL_ITEMS_FETCH" : "UNDEFINED_QPL_EVENT" : "IG_REELS_AUTO_CREATED_REEL_CREATION_IG_AUTO_CREATED_FEED_POST_CREATION_FLOW" : "IG_REELS_AUTO_CREATED_REEL_CREATION_ACR_BROWSER_TTRC" : "IG_REELS_AUTO_CREATED_REEL_CREATION_ACR_BROWSER_ITEMS_ENDPOINT_FETCH" : "IG_REELS_AUTO_CREATED_REEL_CREATION_IG_REELS_AUTO_CREATED_REEL_CREATION_FLOW";
            case 3766:
                return s != 4837 ? s != 9949 ? s == 10684 ? "VRHF_INTERACTION_TRACING_NAVIGATION" : "UNDEFINED_QPL_EVENT" : "VRHF_INTERACTION_TRACING_INITIAL_PEEKSHEET_LOAD" : "VRHF_INTERACTION_TRACING_INITIAL_LOAD";
            case 3770:
                return s != 11507 ? s == 11933 ? "QPLTESTMODULE_TEST3" : "UNDEFINED_QPL_EVENT" : "QPLTESTMODULE_KLI302_TEST";
            case 3785:
                return s == 1 ? "HCS_MODULE_A_HCS_EVENT_A" : "UNDEFINED_QPL_EVENT";
            case 3788:
                return s != 1 ? s == 3955 ? "FBLITE_MOBILE_CONFIG_TEST_FBLITE_TOOLTIP_TEST" : "UNDEFINED_QPL_EVENT" : "FBLITE_MOBILE_CONFIG_TEST_MOBILE_CONFIG_TEST";
            case 3791:
                return s != 1638 ? s == 5015 ? "IG_ANDROID_RECYCLERVIEW_PERF_BIND_VIEW" : "UNDEFINED_QPL_EVENT" : "IG_ANDROID_RECYCLERVIEW_PERF_CREATE_VIEW";
            case 3797:
                return s != 3948 ? s != 11240 ? s == 11254 ? "MSYS_TOPLINE_METRICS_OPEN_MESSAGE_SEND_TO_SENT" : "UNDEFINED_QPL_EVENT" : "MSYS_TOPLINE_METRICS_E2EE_MESSAGE_SEND_TO_SENT" : "MSYS_TOPLINE_METRICS_MESSAGE_SEND_TO_SENT_AGGREGATED";
            case 3806:
                return AbstractC62130Rzd.A00(s);
            case 3815:
                return s == 15434 ? "INLINE_COMMENT_ADVERTISER_REPLY_ADVERTISER_REPLY_RENDERING" : "UNDEFINED_QPL_EVENT";
            case 3833:
                return AbstractC61943RwF.A00(s);
            case 3851:
                return AbstractC62095Rz4.A00(s);
            case 3855:
                return s != 4216 ? s == 12931 ? "IG_AVATAR_ODR_PERCEIVED_LATENCY_PDQ_HASH" : "UNDEFINED_QPL_EVENT" : "IG_AVATAR_ODR_PERCEIVED_LATENCY_IG_AVATAR_ODR_PERCEIVED_LATENCY";
            case 3858:
                return s != 2765 ? s == 14701 ? "OCULUS_PRIVACY_INDICATOR_AUI_PRIVACY_INDICATOR" : "UNDEFINED_QPL_EVENT" : "OCULUS_PRIVACY_INDICATOR_QUICK_SETTINGS_PRIVACY_INDICATOR_PANEL";
            case 3864:
                return s == 12379 ? "FACEBOOK_IN_APP_REVIEW_SHOW_APP_REVIEW_PROMPT" : "UNDEFINED_QPL_EVENT";
            case 3872:
                return s == 12672 ? "IG_MEDIA_INFRA_SEV_DETECTOR_EVENTS_PUBLISH_MEDIA" : "UNDEFINED_QPL_EVENT";
            case 3897:
                return s == 12583 ? "SECURITY_UBSAN_LOGGING_UBSAN_DIAGNOSTIC_CRASH" : "UNDEFINED_QPL_EVENT";
            case 3902:
                return s == 5389 ? "WEARABLE_JOURNAL_APP_START" : "UNDEFINED_QPL_EVENT";
            case 3921:
                return s == 1611 ? "MESSENGER_ACCOUNT_SWITCH_ACCOUNT_SWITCH" : "UNDEFINED_QPL_EVENT";
            case 3925:
                return AbstractC62036Rxk.A00(s);
            case 3932:
                return s != 3667 ? s != 8480 ? s == 15698 ? "FB_REELS_ADS_REELS_ADS_HSCROLL_USER_FLOW" : "UNDEFINED_QPL_EVENT" : "FB_REELS_ADS_REELS_LIVE_ADS_USER_FLOW" : "FB_REELS_ADS_REELS_INTERSTITIAL_ADS_USER_FLOW";
            case 3933:
                return s == 1 ? "VR_ONE_TRACE_INP" : "UNDEFINED_QPL_EVENT";
            case 3948:
                return s == 7347 ? "REELS_DM_ADS_BANNER_ADS" : "UNDEFINED_QPL_EVENT";
            case 3951:
                return s == 13816 ? "PERMALINK_COMMENTS_SUMMARY_SUMMARY_ABOVE_COMMENTS_FUNNEL" : "UNDEFINED_QPL_EVENT";
            case 3952:
                return s == 1 ? "THREADS_RELIABILITY_DEEPLINK_HANDLING_ERROR" : "UNDEFINED_QPL_EVENT";
            case 3957:
                return s != 1 ? s != 4240 ? s == 10161 ? "ASSISTANT_WHATSAPP_WHATSAPP_INCOMING_MESSAGE_ANNOUNCEMENT" : "UNDEFINED_QPL_EVENT" : "ASSISTANT_WHATSAPP_WHATSAPP_READ_VOICE_MESSAGE" : "ASSISTANT_WHATSAPP_WHATSAPP_INTERACTION_LATENCY";
            case 3979:
                return s == 14880 ? "PERSONALIZED_MUSIC_BASE_PERSONALIZED_MUSIC_DOWNLOAD_TTI" : "UNDEFINED_QPL_EVENT";
            case 3995:
                return s != 1017 ? s != 7873 ? s != 9068 ? s == 14682 ? "WEBLITE_INTERACTION_WEBLITE_LOGIN_OPERATION_LATENCY" : "UNDEFINED_QPL_EVENT" : "WEBLITE_INTERACTION_WEBLITE_SEO_GKS_FETCH_REQUEST" : "WEBLITE_INTERACTION_NAVIGATION" : "WEBLITE_INTERACTION_INITIAL_LOAD";
            case 3996:
                return s == 1 ? "WHATSAPP_AI_WA_FS_BOT_INTERACTION" : "UNDEFINED_QPL_EVENT";
            case 3999:
                return s == 9432 ? "RP_CORE_NETWORKING_NETWORKING_CALL_STATS" : "UNDEFINED_QPL_EVENT";
            case 4015:
                return s != 6166 ? s == 8830 ? "WEARABLE_SCREENTIME_SCREEN_TIME_ACTIVITY" : "UNDEFINED_QPL_EVENT" : "WEARABLE_SCREENTIME_SCREEN_TIME_FRAGMENT";
            case 4031:
                return s != 3721 ? s == 13848 ? "BIZAPP_SCOPE_SELECTOR_EFFICIENCY_MBS_IOS_SCOPE_SELECTOR_SELECTION" : "UNDEFINED_QPL_EVENT" : "BIZAPP_SCOPE_SELECTOR_EFFICIENCY_MBS_ANDROID_SCOPE_SELECTOR_SELECTION";
            case 4037:
                return s == 14863 ? "IG_ANDROID_VIEW_PREINFLATE_GET_VIEW" : "UNDEFINED_QPL_EVENT";
            case 4044:
                return s != 4035 ? s != 8712 ? s == 11876 ? "MG_AGENT_FRAMEWORKS_META_ASSISTANT_REQUEST" : "UNDEFINED_QPL_EVENT" : "MG_AGENT_FRAMEWORKS_OPERATOR_START" : "MG_AGENT_FRAMEWORKS_OPERATOR_END";
            case 4076:
                return s != 5252 ? s == 13184 ? "WEARABLE_NOTIFICATIONS_NOTIFICATION_MCU_REACHABILITY" : "UNDEFINED_QPL_EVENT" : "WEARABLE_NOTIFICATIONS_CLIENT_NOTIFICATION_PARSING";
            case 4077:
                return s != 3265 ? s != 9159 ? s == 13857 ? "CPG_FNRL_USER_FLOW_TAP_GROUP_INLINE_COMPOSER" : "UNDEFINED_QPL_EVENT" : "CPG_FNRL_USER_FLOW_PUBLISH_POST" : "CPG_FNRL_USER_FLOW_UPLOAD_CONTENT";
            case 4101:
                return s == 4024 ? "FB_NETWORK_XMA_CLICK_ANDROID_OPEN_XMA_LINK" : "UNDEFINED_QPL_EVENT";
            case 4108:
                return AbstractC62015RxP.A00(s);
            case 4110:
                return s != 3709 ? s != 10665 ? s != 13120 ? s == 13518 ? "IG_MLKIT_MODULE_INIT" : "UNDEFINED_QPL_EVENT" : "IG_MLKIT_INIT" : "IG_MLKIT_SDK_INIT" : "IG_MLKIT_ERROR";
            case 4113:
                return AbstractC62141Rzo.A00(s);
            case 4114:
                return s != 1 ? s == 3 ? "WHATSAPP_INBOX_FILTERS_EVENT_LOAD_CHAT_RESULTS_AFTER_FILTER_TAP_ANDROID" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_INBOX_FILTERS_EVENT_LOAD_AND_RENDER_FILTERS_ROW_ANDROID";
            case 4127:
                return s == 7482 ? "FB_ANDROID_LOGOUT_LOGOUT_DIALOG_EVENT" : "UNDEFINED_QPL_EVENT";
            case 4132:
                return s == 10484 ? "AN_IMPRESSION_LOG_IMPRESSION" : "UNDEFINED_QPL_EVENT";
            case 4142:
                return RyF.A00(s);
            case 4154:
                return s != 2288 ? s == 5669 ? "IG_SECURITY_BLOKS_WRITE_PROTECTION_2024_UNMIGRATED_ASYNC_ACTION_DISTILLERY_ANDROID" : "UNDEFINED_QPL_EVENT" : "IG_SECURITY_BLOKS_WRITE_PROTECTION_2024_UNMIGRATED_ASYNC_ACTION_GRAPHQL_ANDROID";
            case 4166:
                return s != 1 ? s == 2 ? "SHOWREEL_QUERIES_GENERATE_PREVIEW_RENDER_PAYLOAD" : "UNDEFINED_QPL_EVENT" : "SHOWREEL_QUERIES_GENERATE_AD_RENDER_PAYLOAD";
            case 4168:
                return s != 1208 ? s != 4678 ? s == 9844 ? "EP_RULES_ENGINE_RULESET_EVALUATION" : "UNDEFINED_QPL_EVENT" : "EP_RULES_ENGINE_RULE_EVALUATION" : "EP_RULES_ENGINE_RULE_GEN_INPUT";
            case 4173:
                return s != 1 ? s == 2295 ? "GAMING_PLAY_PLATFORM_GENERIC_DIALOG_TTRC" : "UNDEFINED_QPL_EVENT" : "GAMING_PLAY_PLATFORM_GAMES_QUICKSILVER_FUNNEL";
            case 4185:
                return s == 10059 ? "AI_CAPTIONS_AI_CAPTIONS_UPLOAD_IMAGE" : "UNDEFINED_QPL_EVENT";
            case 4187:
                return s != 2928 ? s == 6444 ? "FB_SHORTS_AGGR_PAGE_ANDROID_PROFILE_ACTION" : "UNDEFINED_QPL_EVENT" : "FB_SHORTS_AGGR_PAGE_ANDROID_AGGR_PAGE_CONTENT_TTRC";
            case 4210:
                return s != 5402 ? s != 8616 ? s != 9211 ? s != 10462 ? s != 11317 ? s == 13422 ? "IG_NOTES_UNEXPECTED_CACHE_ERROR" : "UNDEFINED_QPL_EVENT" : "IG_NOTES_MUSIC_NOTES_SHEET_CONSUMPTION" : "IG_NOTES_NOTES_GATING_APP_LAUNCH" : "IG_NOTES_NOTES_CONSUMPTION" : "IG_NOTES_NOTES_COMPOSER_LOAD" : "IG_NOTES_NOTES_GATING_CHECK";
            case 4216:
                return s != 9035 ? s == 12668 ? "SMARTGLASSES_FEDERATED_COMPUTING_SG_PAPAYA_JOB_EXECUTION" : "UNDEFINED_QPL_EVENT" : "SMARTGLASSES_FEDERATED_COMPUTING_SG_PAPAYA_JOB_SUBMISSION";
            case 4217:
                return AbstractC61947RwJ.A00(s);
            case 4225:
                return s != 3016 ? s == 8464 ? "MESSENGER_SHARING_BCF_TTCL_LOGGING" : "UNDEFINED_QPL_EVENT" : "MESSENGER_SHARING_LATENCY_LOGGING";
            case 4251:
                return s == 14368 ? "SLOW_APP_COMPONENT_SLOW_APP_COMPONENT" : "UNDEFINED_QPL_EVENT";
            case 4252:
                return s == 7634 ? "FEED_CACHE_QUALITY_FIRST_VEND_AVAILABLE_CACHE" : "UNDEFINED_QPL_EVENT";
            case 4266:
                return s != 3122 ? s != 7547 ? s == 9006 ? "APP_INSTALL_SHEET_CTA_CLICK_USER_FLOW" : "UNDEFINED_QPL_EVENT" : "app_install_sheet_performance_funnel" : "APP_INSTALL_SHEET_INSTALLATION_USER_FLOW";
            case 4273:
                return s != 1974 ? s != 13379 ? s == 14548 ? "XR_RELOCALIZATION_XR_RELOCALIZATION_CLIENT_TTF" : "UNDEFINED_QPL_EVENT" : "XR_RELOCALIZATION_RELOCALIZATION" : "XR_RELOCALIZATION_VPS_B2B";
            case 4305:
                return s != 6675 ? s == 15265 ? "MESSENGER_UNIVERSAL_SEARCH_UNIVERSAL_SEARCH" : "UNDEFINED_QPL_EVENT" : "MESSENGER_UNIVERSAL_SEARCH_ANDROID_MESSENGER_UNIVERSAL_SEARCH_QUERY_STATE_LATENCY";
            case 4307:
                return s != 4622 ? s != 7150 ? s != 7455 ? s == 10594 ? "WHATSAPP_META_BILLING_WHATSAPP_META_BILLING_SEND_CODE" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_META_BILLING_WHATSAPP_META_BILLING_REQUEST_CODE" : "WHATSAPP_META_BILLING_WHATSAPP_META_BILLING_SILENT_NOTIFICATION" : "WHATSAPP_META_BILLING_WHATSAPP_META_BILLING_SEND_RECOVERY_CODE";
            case 4328:
                return s != 7555 ? s == 12242 ? "MESSENGER_IA_ANDROID_INBOX_FOLDER_NAVIGATION" : "UNDEFINED_QPL_EVENT" : "MESSENGER_IA_ANDROID_INBOX_FOLDER_NAVIGATION_TTRC";
            case 4330:
                return AbstractC62040Rxo.A00(s);
            case 4348:
                return s != 1462 ? s != 3089 ? s != 5712 ? s != 13187 ? s == 15802 ? "FB_STATUS_CREATION_FLOW_TTRC" : "UNDEFINED_QPL_EVENT" : "FB_STATUS_CREATION_OR_SELF_VIEW_TTRC" : "FB_STATUS_STATUS_INVENTORY_TTRC" : "FB_STATUS_STATUS_TOF_TRAY_TTRC" : "FB_STATUS_IN_FEED_UNIT_TTRC";
            case 4357:
                return s != 3040 ? s != 14918 ? s == 15783 ? "ULE_LAND_DIALOG_NEW_SHIP_IT_BUTTON_LAND_DIALOG" : "UNDEFINED_QPL_EVENT" : "ULE_LAND_DIALOG_NEW_LAND_DIALOG_LOAD" : "ULE_LAND_DIALOG_LAND_ATTEMPT_CONFIRMATION_TIME";
            case 4368:
                return s != 10138 ? s != 10699 ? s == 16265 ? "FBLITE_TOUCH_RESPONSIVENESS_FBLITE_TOUCH_RESPONSIVENESS" : "UNDEFINED_QPL_EVENT" : "FBLITE_TOUCH_RESPONSIVENESS_LITE_TOUCH_RESPONSIVENESS_TRACE_COLLECTION" : "FBLITE_TOUCH_RESPONSIVENESS_FBLITE_TOUCH_RESPONSIVENESS_AGGREGATED";
            case 4372:
                return s == 15644 ? "ALOHA_WORKVC_PERFORMANCE_DEBUG_HANGUP_RESPONSIVENESS" : "UNDEFINED_QPL_EVENT";
            case 4379:
                return s != 6529 ? s == 11737 ? "GROUPS_CONTENT_CHAINING_CONTENT_CHAINING_PAGING_PROVIDER_GEN_NEXT_PAGE" : "UNDEFINED_QPL_EVENT" : "GROUPS_CONTENT_CHAINING_GEN_GROUPS_CONTENT_CHAINING_PAGE";
            case 4382:
                return s == 8942 ? "TNTS_BACKGROUND_WORK" : "UNDEFINED_QPL_EVENT";
            case 4391:
                return s != 5413 ? s == 12193 ? "TEST_MESSAGING_CLIENT_PLATFORM_PE_TEST_MCIEXECUTION_QUEUE_INFORMATION_CRITICAL_DB_JOBS_JUANLUIS" : "UNDEFINED_QPL_EVENT" : "TEST_MESSAGING_CLIENT_PLATFORM_PE_TEST_MCIEXECUTION_QUEUE_INFORMATION_CRITICAL_DB_JOBS_ANTONIOMARTIN";
            case 4398:
                return s != 2238 ? s != 6674 ? s != 7636 ? s == 9819 ? "RP_CLASS_CATCHUP_CLASS_CATCHUP_JOINER_BROADCAST_STARTED" : "UNDEFINED_QPL_EVENT" : "RP_CLASS_CATCHUP_CLASS_CATCHUP_JOINER_BROADCAST_CONSENT" : "RP_CLASS_CATCHUP_CLASS_CATCHUP_HOST_BROADCAST_CANCEL" : "RP_CLASS_CATCHUP_CLASS_CATCHUP_HOST_BROADCAST_CREATE";
            case 4401:
                return AbstractC61956RwS.A00(s);
            case 4403:
                return s == 12112 ? "HWXS_TESTING_APP_STATE_CHANGE" : "UNDEFINED_QPL_EVENT";
            case 4404:
                return s == 1441 ? "BUSINESS_ACCOUNTS_IDENTITIES_UNIFIED_PERMISSION_CHECKER" : "UNDEFINED_QPL_EVENT";
            case 4415:
                return s == 6363 ? "MIB_PRESENCE_MIB_ANDROID_ACTIVE_NOW_TRAY_LOADING" : "UNDEFINED_QPL_EVENT";
            case 4423:
                return s != 8755 ? s != 10175 ? s != 10726 ? s != 12605 ? s == 14587 ? "BILLING_WIZARD_NATIVE_WRAPPER_PRELOADING_LATENCY_INSTAGRAM" : "UNDEFINED_QPL_EVENT" : "BILLING_WIZARD_NATIVE_WRAPPER_REACT_NATIVE_INTERSCREEN_LATENCY_INSTAGRAM" : "BILLING_WIZARD_NATIVE_WRAPPER_WIZARD_LOADING_LATENCY_INSTAGRAM" : "BILLING_WIZARD_NATIVE_WRAPPER_WIZARD_INTERSCREEN_LATENCY_INSTAGRAM" : "BILLING_WIZARD_NATIVE_WRAPPER_REACT_NATIVE_LOADING_LATENCY_INSTAGRAM";
            case 4432:
                return s != 4370 ? s != 5216 ? s == 12856 ? "IG_ANDROID_CONTEXTUAL_FEED_TAIL_LOAD" : "UNDEFINED_QPL_EVENT" : "IG_ANDROID_CONTEXTUAL_FEED_ITEM" : "IG_ANDROID_CONTEXTUAL_FEED_INITIAL_LOAD";
            case 4443:
                return s == 15004 ? "INSTAGRAM_GEOGATING_VIEWER_EXPERIENCE_GEOGATING_EXTERNAL_LINK_V2" : "UNDEFINED_QPL_EVENT";
            case 4446:
                return s == 7493 ? "BIZAPP_FEATURE_RELIABILITY_ANDROID_HOME_CARD_LOADING" : "UNDEFINED_QPL_EVENT";
            case 4459:
                return s != 2693 ? s == 13444 ? "KOTLIN_COMPILATION_TRACER" : "UNDEFINED_QPL_EVENT" : "KOTLIN_ANNOTATION_TRACER";
            case 4465:
                return s != 7159 ? s != 11340 ? s == 16280 ? "RP_SCREENSHARING_PRESENTER_START_SCREEN_SHARE_EXP_RSYS" : "UNDEFINED_QPL_EVENT" : "RP_SCREENSHARING_START_SCREENSHARING" : "RP_SCREENSHARING_RSYS_PEER_START_SCREEN_SHARE";
            case 4467:
                return s != 1388 ? s == 11890 ? "RP_FLOOR_CONTROLS_FLOOR_CONTROL_OUT" : "UNDEFINED_QPL_EVENT" : "RP_FLOOR_CONTROLS_FLOOR_CONTROL_IN";
            case 4486:
                return s != 3254 ? s == 15549 ? "CREATE_STICKER_CREATE_STICKER_QUERY_TTI" : "UNDEFINED_QPL_EVENT" : "CREATE_STICKER_CREATE_STICKER_IMAGE_TTI";
            case 4511:
                return s == 5765 ? "RCP_CONNECTIVITY_TEST_RCP_CONNECTIVITY_TEST_DURATION" : "UNDEFINED_QPL_EVENT";
            case 4572:
                return s != 2625 ? s == 12894 ? "MESSAGING_AUDIO_ANDROID_VOICE_RECORDING_RELIABILITY" : "UNDEFINED_QPL_EVENT" : "MESSAGING_AUDIO_ANDROID_VOICE_PLAYBACK_RELIABILITY";
            case 4584:
                return s == 12648 ? "EXPRESSIVE_RESHARES_MOOD_FILTER_CONSUMPTION" : "UNDEFINED_QPL_EVENT";
            case 4622:
                return s == 1 ? "MESSENGER_TRANSLATION_TRANSLATE_MESSAGE_TTRC" : "UNDEFINED_QPL_EVENT";
            case 4626:
                return s != 6029 ? s == 15192 ? "IG4A_SHARED_PREFS_PERF_EDITOR" : "UNDEFINED_QPL_EVENT" : "IG4A_SHARED_PREFS_PERF_GET";
            case 4635:
                return s != 6440 ? s != 10651 ? s != 11629 ? s == 15092 ? "AR_DICTATION_DICTATION_STATUS_WA_TEST" : "UNDEFINED_QPL_EVENT" : "AR_DICTATION_DICTATION_STATUS" : "AR_DICTATION_DICTATION_STATUS_TEST" : "AR_DICTATION_DICTATION_STATUS_WA";
            case 4638:
                return s != 4209 ? s != 9109 ? s != 11410 ? s == 14981 ? "INSTAGRAM_REPORTING_OPEN_REPORT_FLOW" : "UNDEFINED_QPL_EVENT" : "INSTAGRAM_REPORTING_IG_REPORTING_ERROR" : "INSTAGRAM_REPORTING_PAGE_LOADED" : "INSTAGRAM_REPORTING_REPORT_FUNNEL";
            case 4658:
                return s != 1644 ? s != 2444 ? s != 7839 ? s != 8084 ? s == 12770 ? "IDENTITY_SWITCHER_PERF_IDENTITY_SWITCHING_TTRC_V2" : "UNDEFINED_QPL_EVENT" : "IDENTITY_SWITCHER_PERF_SWITCHER_BOTTOMSHEET_TTRC_V2" : "IDENTITY_SWITCHER_PERF_SWITCHER_BOTTOMSHEET_TTRC" : "IDENTITY_SWITCHER_PERF_ANDROID_PROFILE_SWITCHING_TTI" : "IDENTITY_SWITCHER_PERF_ANDROID_PROFILE_SWITCHING_TTRC";
            case 4674:
                return AbstractC61895RvR.A00(s);
            case 4692:
                return s == 1621 ? "IGX_ANDROID_CHAINING_MANAGED_MOBILE_ERRORS_EMPTY_ZOOMABLE_CONTAINER" : "UNDEFINED_QPL_EVENT";
            case 4710:
                return s == 10670 ? "PRECALL_LOBBY_APP_PRECALL_LOBBY_INIT" : "UNDEFINED_QPL_EVENT";
            case 4713:
                return AbstractC61940RwC.A00(s);
            case 4722:
                return s == 15262 ? "IG_BULLYING_BATCHING_COMMENT_ACTIONS_ANDROID_BATCHING_COMMENT_ACTIONS" : "UNDEFINED_QPL_EVENT";
            case 4733:
                return s == 1 ? "MCI_NOTIFICATION_EXECUTION_CONTEXT_MISMATCH" : "UNDEFINED_QPL_EVENT";
            case 4740:
                return s == 3646 ? "ODIN_AGE_U13_UPLOAD" : "UNDEFINED_QPL_EVENT";
            case 4763:
                return s == 1 ? "VO_PLATFORM_VO_PLATFORM_HEALTH" : "UNDEFINED_QPL_EVENT";
            case 4765:
                return s == 13862 ? "EMERGING_BUSINESS_STARS_SEEDING_STARS_SEEDING" : "UNDEFINED_QPL_EVENT";
            case 4774:
                return s == 13956 ? "EMERGING_BUSINESS_STARS_SIMPLIFIED_BUY_N_SEND_STARS_SIMPLIFIED_BUY_N_SEND" : "UNDEFINED_QPL_EVENT";
            case 4789:
                return s != 4521 ? s == 9250 ? "INTERACTION_LATENCY_FB4A_TTRC_AGGREGATION" : "UNDEFINED_QPL_EVENT" : "INTERACTION_LATENCY_SPINNER_VISIBILITY";
            case 4796:
                return s != 4807 ? s != 9686 ? s == 11343 ? "HORIZON_LLM_LLM_SPEAK" : "UNDEFINED_QPL_EVENT" : "HORIZON_LLM_LLM_SEND_TRANSCRIPTION" : "HORIZON_LLM_LLM_SET_DIRECTION";
            case 4799:
                return s != 3049 ? s != 7510 ? s != 8685 ? s == 13018 ? "WHATSAPP_FMESSAGE_PLATFORM_SMP_MSG_REGISTRY_INIT" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_FMESSAGE_PLATFORM_FMP_MSG_REGISTRY_INIT" : "WHATSAPP_FMESSAGE_PLATFORM_FMP_SUBSYS_REGISTRY_INIT" : "WHATSAPP_FMESSAGE_PLATFORM_SMP_SUBSYS_REGISTRY_INIT";
            case 4810:
                return s != 6265 ? s != 12411 ? s != 14118 ? s != 15560 ? s == 15629 ? "WEARABLE_CHALLENGES_FITNESS_DATA_FULL_PROCESSING" : "UNDEFINED_QPL_EVENT" : "WEARABLE_CHALLENGES_APP_START" : "WEARABLE_CHALLENGES_REQUIRED_FITNTESS_DATA_FETCH" : "WEARABLE_CHALLENGES_CHALLENGE_LEADERBOARD_DATA_FETCH" : "WEARABLE_CHALLENGES_FITNESS_DATA_UPSERT";
            case 4823:
                return s != 3673 ? s != 6840 ? s == 14791 ? "IG_CAMERA_PLATFORM_IG_QCC_LIFECYCLE_ONRESUME" : "UNDEFINED_QPL_EVENT" : "IG_CAMERA_PLATFORM_IG_STICKER_BROWSER_RENDERED" : "IG_CAMERA_PLATFORM_IG_STICKER_RENDERED";
            case 4830:
                return s == 15665 ? "PROFILE_PLUS_CREATE_AP_PLUS" : "UNDEFINED_QPL_EVENT";
            case 4834:
                return S0Q.A00(s);
            case 4874:
                return s != 1 ? s == 2406 ? "MESSENGER_PEER_TO_PEER_P2P_NUX" : "UNDEFINED_QPL_EVENT" : "MESSENGER_PEER_TO_PEER_COMPOSER_LOAD";
            case 4880:
                return s == 16317 ? "WORK_HOME_UUI_PROTOTYPE_INIT" : "UNDEFINED_QPL_EVENT";
            case 4892:
                return s == 3094 ? "TRIM_TEST_COLLECTION_CONSTRAINTS_TEST_EVENT" : "UNDEFINED_QPL_EVENT";
            case 4898:
                return s != 2135 ? s == 8480 ? "PROACTIVE_WARNING_NOTICE_LOAD_PERF" : "UNDEFINED_QPL_EVENT" : "PROACTIVE_WARNING_ADDITIONAL_ACTIONS_LOAD_PERF";
            case 4899:
                return s == 1 ? "WA_PEOPLE_NEARBY_SHARE_PEOPLE_NEARBY_SHARE_FUNNEL" : "UNDEFINED_QPL_EVENT";
            case 4903:
                return s != 1 ? s == 2 ? "DISTRIBGW_CONNECTIVITY_STREAM_GROUP_CONNECTIVITY_AWARE" : "UNDEFINED_QPL_EVENT" : "DISTRIBGW_CONNECTIVITY_CONNECTIVITY_MANAGER";
            case 4921:
                return s != 4270 ? s != 7632 ? s != 9389 ? s != 14271 ? s == 15853 ? "DATA_LOSS_NO_COMPLETE_DATA_LOSS" : "UNDEFINED_QPL_EVENT" : "DATA_LOSS_PARTIAL_DATA_LOSS" : "DATA_LOSS_COMPLETE_DATA_LOSS" : "DATA_LOSS_DATABASE_ERROR" : "DATA_LOSS_LOCAL_STORE_ERROR";
            case 4965:
                return s != 1227 ? s != 4209 ? s != 10815 ? s != 11826 ? s == 15757 ? "SGX_VC_PHONE_TO_GLASSES_WARM_START" : "UNDEFINED_QPL_EVENT" : "SGX_VC_GLASSES_LINK_SWITCH" : "SGX_VC_PHONE_TO_GLASSES_COLD_START" : "SGX_VC_STREAM_CLIENT_SESSION" : "SGX_VC_GLASSES_WIDGET_INITIALIZATION";
            case 4970:
                return AbstractC62023RxX.A00(s);
            case 4973:
                return s == 3703 ? "CONTACTPOINT_ACQUISITION_GMAIL_ACQUISITION_QP" : "UNDEFINED_QPL_EVENT";
            case 4976:
                return s != 4419 ? s == 10127 ? "QUERY_HEALTH_QUERY_LATENCY" : "UNDEFINED_QPL_EVENT" : "QUERY_HEALTH_QUERY_LATENCY_FLOWID";
            case 4977:
                return s == 11870 ? "IG_IOS_CAMERA_LOGGING_RELIABILITY_MEDIA_QUALITY_ASYNC_LOG" : "UNDEFINED_QPL_EVENT";
            case 4984:
                return s == 10653 ? "BSP_MOBILE_SURFACES_UNIFIED_SUPPORT_CONTACT_FORM_TTRC" : "UNDEFINED_QPL_EVENT";
            case 4985:
                return s == 4002 ? "DECISION_PAGE_PUBLIC_SITE_DECISION_HOME_PAGE_LOADING_TIME" : "UNDEFINED_QPL_EVENT";
            case 4988:
                return s == 14499 ? "MSGR_ENF_NOTICE_MSGR_PRIVATE_ENF_NOTICE" : "UNDEFINED_QPL_EVENT";
            case 5003:
                return s != 5717 ? s == 14176 ? "OCULUS_SHELL_ENV_COPRESENCE_HOME_SESSION" : "UNDEFINED_QPL_EVENT" : "OCULUS_SHELL_ENV_AVATAR_CALLING_HOME";
            case 5006:
                return s != 6978 ? s == 10710 ? "WEARABLE_SMART_REPLY_SERVICE_SMART_REPLY_LATENCY" : "UNDEFINED_QPL_EVENT" : "WEARABLE_SMART_REPLY_SERVICE_APP_START";
            case 5007:
                return AbstractC61849Ruh.A00(s);
            case 5024:
                return AbstractC62088Ryx.A00(s);
            case 5042:
                return AbstractC61939RwB.A00(s);
            case 5047:
                return s == 13692 ? "SMARTGLASSES_AUTOCAPTURE_TIMED_CAPTURE_SESSION" : "UNDEFINED_QPL_EVENT";
            case 5053:
                return s != 6693 ? s == 6921 ? "TEST_KAI_TWO_TEST_3" : "UNDEFINED_QPL_EVENT" : "TEST_KAI_TWO_TEST_EVENT_TWO";
            case 5058:
                return s == 9760 ? "STORIES_TRAY_SCROLL_SCROLL" : "UNDEFINED_QPL_EVENT";
            case 5063:
                return s != 3949 ? s != 7020 ? s == 9923 ? "IGD_TRANSCRIPTIONS_IGD_TRANSCRIPTION_MODEL_LOAD" : "UNDEFINED_QPL_EVENT" : "IGD_TRANSCRIPTIONS_IGD_TRANSCRIPTION_REQUEST" : "IGD_TRANSCRIPTIONS_IGD_TRANSCRIPTION_SETUP";
            case 5066:
                return AbstractC61952RwO.A00(s);
            case 5071:
                return s != 9164 ? s == 10048 ? "OCULUS_JOURNEY_HELP_N_TIPS_INIT" : "UNDEFINED_QPL_EVENT" : "OCULUS_JOURNEY_HELP_N_TIPS_HELP_N_TIPS_INIT";
            case 5110:
                return s == 1 ? "FBLITE_POWER_METRICS_FBLITE_SAMSUNG_BATTERY_WARNING" : "UNDEFINED_QPL_EVENT";
            case 5113:
                return AbstractC61983Rwt.A00(s);
            case 5165:
                return s == 5458 ? "Mini Apps 1p Overlay" : "UNDEFINED_QPL_EVENT";
            case 5166:
                return AbstractC61900RvY.A00(s);
            case 5170:
                return s == 10549 ? "BUSINESS_INBOX_IN_MESSENGER_ANDROID_STOP_COMMUNICATION_CLICK" : "UNDEFINED_QPL_EVENT";
            case 5222:
                return s == 11961 ? "IG_GROUP_CHAT_COMMERCE_COLLECT_ORDER_FORM_SEND_BUTTON" : "UNDEFINED_QPL_EVENT";
            case 5232:
                return s != 1828 ? s == 16246 ? "CMON_EXTERNAL_BALANCE_DETECTION_EXTERNAL_PING" : "UNDEFINED_QPL_EVENT" : "CMON_EXTERNAL_BALANCE_DETECTION_BALANCE_DETECTION";
            case 5250:
                return s != 11179 ? s != 11671 ? s == 12658 ? "STAX_MESSAGE_SEND_EXPERIENCE" : "UNDEFINED_QPL_EVENT" : "STAX_USER_TYPING" : "STAX_THREADLIST_TO_THREADVIEW";
            case 5251:
                return s != 1 ? s != 11669 ? s != 11763 ? s == 15633 ? "FBLITE_VIDEO_VIDEO_LIFECYCLE" : "UNDEFINED_QPL_EVENT" : "FBLITE_VIDEO_VIDEO_QUALITIES" : "FBLITE_VIDEO_VIDEO_PLAYBACK_START" : "FBLITE_VIDEO_ABR_DECISION";
            case 5261:
                return s != 6538 ? s != 7900 ? s != 13340 ? s == 14046 ? "SGX_FALCO_STREAM_SESSION_END" : "UNDEFINED_QPL_EVENT" : "SGX_FALCO_STREAM_SESSION_IN_PROGRESS" : "SGX_FALCO_APP_SESSION_ERROR" : "SGX_FALCO_APP_SESSION_END";
            case 5266:
                return s != 3304 ? s != 4948 ? s != 5024 ? s != 6571 ? s != 7664 ? s == 11812 ? "WP_EVENTS_EVENT_SEND_INVITATIONS" : "UNDEFINED_QPL_EVENT" : "WP_EVENTS_EVENTS_INVITE_COHOST" : "WP_EVENTS_EVENTS_REPONSE_INVITATION" : "WP_EVENTS_EVENT_VIEW_PERMALINK_PAGE" : "WP_EVENTS_EVENTS_CTA_LAND_ON_LP" : "WP_EVENTS_EVENT_CREATE_EDIT";
            case 5273:
                return s == 3711 ? "RTSS_CLIENT_PERF_SESSION_SUMMARY" : "UNDEFINED_QPL_EVENT";
            case 5290:
                return AbstractC61937Rw9.A00(s);
            case 5312:
                return s == 4785 ? "PRIVACY_ACCESS_HUB_ACCESS_HUB_UI_ACTIONS" : "UNDEFINED_QPL_EVENT";
            case 5320:
                return S0G.A00(s);
            case 5323:
                return s == 2421 ? "AVATAR_SAVE_EXPRESSIONS_STICKER_TRAY" : "UNDEFINED_QPL_EVENT";
            case 5338:
                return s == 16017 ? "IG_CREATIVE_TOOL_PLATFORM_CREATIVE_TOOL_LAUNCH" : "UNDEFINED_QPL_EVENT";
            case 5353:
                return s == 1 ? "PHOTOS_HUB_CLIENT_UPLOAD" : "UNDEFINED_QPL_EVENT";
            case 5354:
                return AbstractC61891RvN.A00(s);
            case 5364:
                return s == 8007 ? "WORKPLACE_MEETINGS_RSVP" : "UNDEFINED_QPL_EVENT";
            case 5365:
                return s != 3189 ? s == 5547 ? "AGENT_CONNECT_CUSTOMER_EMAIL_RESPONSE" : "UNDEFINED_QPL_EVENT" : "AGENT_CONNECT_CUSTOMER_INTERNAL_RESPONSE";
            case 5368:
                return s != 1117 ? s != 10429 ? s == 10624 ? "MAGIC_MONTAGE_MAGIC_MONTAGE_ERROR" : "UNDEFINED_QPL_EVENT" : "MAGIC_MONTAGE_MAGIC_MONTAGE_USER_WAIT_TIME" : "MAGIC_MONTAGE_MAGIC_MONTAGE_GENERATION_TTRC";
            case 5371:
                return s != 1245 ? s == 6766 ? "SPATIAL_PERSISTENCE_SERVICE_EVENTS_SPATIAL_PERSISTENCE_SERVICE_EVENT" : "UNDEFINED_QPL_EVENT" : "Upload Anchor";
            case 5382:
                return s != 7763 ? s == 11852 ? "RP_SIGNALING_RELIABILITY_SEND_MESSAGE" : "UNDEFINED_QPL_EVENT" : "RP_SIGNALING_RELIABILITY_RECEIVE_MESSAGE";
            case 5390:
                return s == 12292 ? "IG_ANDROID_CONSUMPTION_DEEPLINK" : "UNDEFINED_QPL_EVENT";
            case 5404:
                return s == 13524 ? "WHATSAPP_AVATAR_WHATSAPP_AVATAR_ANDROID" : "UNDEFINED_QPL_EVENT";
            case 5447:
                return s != 6452 ? s == 10343 ? "IG_ANDROID_TRANSCODE_UPLOAD_LOGGER_REELS_STITCHING" : "UNDEFINED_QPL_EVENT" : "IG_ANDROID_TRANSCODE_UPLOAD_LOGGER_INGESTION";
            case 5457:
                return s != 5138 ? s != 9597 ? s != 10998 ? s != 12247 ? s == 15051 ? "IG_TEMPLATES_IG_TEMPLATE_BROWSER_AUTO_PLAY" : "UNDEFINED_QPL_EVENT" : "IG_TEMPLATES_IG_TEMPLATE_BROWSER_LOAD" : "IG_TEMPLATES_SMART_EFFECT_RENDER" : "IG_TEMPLATES_IG_TEMPLATE_EDITOR_LOAD" : "IG_TEMPLATES_IG_TEMPLATE_BROWSER_SECTION_FETCH";
            case 5472:
                return s == 8428 ? "RTC_AR_EFFECT_SCENE_COMP_EFFECT" : "UNDEFINED_QPL_EVENT";
            case 5478:
                return s != 1724 ? s != 9782 ? s != 12254 ? s != 12824 ? s == 14251 ? "WP_MCG_MIGRATION_MCG_LEARN_MORE_WILL_BE_ABLE_TO_MIGRATE" : "UNDEFINED_QPL_EVENT" : "WP_MCG_MIGRATION_REVIEW_GUEST_SETTINGS" : "WP_MCG_MIGRATION_MCG_LEARN_MORE" : "WP_MCG_MIGRATION_MCG_UPGRADE_INSTANCE" : "WP_MCG_MIGRATION_MCG_LEARN_MORE_MOBILE";
            case 5479:
                return s == 16189 ? "REELS_REMIX_ASSET_PERFORMANCE_PRECAPTURE_VIDEO_LOAD" : "UNDEFINED_QPL_EVENT";
            case 5484:
                return s == 8945 ? "WHATSAPP_SMB_COEX_SMBA_COEX_ONBOARDING" : "UNDEFINED_QPL_EVENT";
            case 5503:
                return s != 10481 ? s != 12957 ? s != 15148 ? s == 15926 ? "QUEST_HARD_LINK_WARM_START" : "UNDEFINED_QPL_EVENT" : "QUEST_HARD_LINK_HOT_START" : "QUEST_HARD_LINK_COLD_START" : "QUEST_HARD_LINK_STREAMING";
            case 5559:
                return AbstractC61915Rvn.A00(s);
            case 5586:
                return s == 16020 ? "TOFU_ENTITY_LIST_API_FETCH" : "UNDEFINED_QPL_EVENT";
            case 5594:
                return s != 6387 ? s == 10694 ? "IG_REELS_REMIX_CREATION_SCREEN" : "UNDEFINED_QPL_EVENT" : "IG_REELS_REMIX_REMIX_CREATION";
            case 5610:
                return s != 6151 ? s != 7802 ? s != 11246 ? s != 13443 ? s == 13578 ? "HORIZON_INTEGRITY_INTEGRITY_BAN_SERVICE_MARK_AS_SEEN" : "UNDEFINED_QPL_EVENT" : "HORIZON_INTEGRITY_REC2VIDEO_VOICE_INDICATOR_TRACKER" : "HORIZON_INTEGRITY_HORIZON_INTEGRITY_WORLD_EXPLORATION" : "HORIZON_INTEGRITY_HORIZON_INTEGRITY_THUMBNAIL_LAUNCH" : "HORIZON_INTEGRITY_INTEGRITY_BAN_SERVICE_FETCH_AND_HANDLE_NEW_BAN";
            case 5631:
                return s != 1703 ? s != 5178 ? s != 14155 ? s == 15279 ? "ALOHA_APP_CALENDAR_DAY_CHANGE" : "UNDEFINED_QPL_EVENT" : "ALOHA_APP_CALENDAR_JOIN_MEETING_CALENDAR" : "ALOHA_APP_CALENDAR_SEE_DAY_VIEW" : "ALOHA_APP_CALENDAR_OWNER_CHANGE";
            case 5636:
                return s == 6911 ? "FBLITE_GQL_WWW_WWW_GRAPHQL_EXECUTION" : "UNDEFINED_QPL_EVENT";
            case 5659:
                return s == 8097 ? "MESSENGER_TLTV_TTRC_ANDROID_ACT_TLTV_TTRC" : "UNDEFINED_QPL_EVENT";
            case 5664:
                return s != 5962 ? s != 6230 ? s == 6692 ? "FB_PROFESSIONAL_HOME_INSIGHTS_POST_INSIGHTS_TTRC" : "UNDEFINED_QPL_EVENT" : "FB_PROFESSIONAL_HOME_INSIGHTS_INSIGHTS_HOME_TAB_LOAD" : "FB_PROFESSIONAL_HOME_INSIGHTS_INSIGHTS_INITIAL_TTRC";
            case 5681:
                return s == 6667 ? "WEARABLE_SELFCARE_SHAREABLE_STATIC_SHAREABLE_VIEWER_LOADING" : "UNDEFINED_QPL_EVENT";
            case 5690:
                return AbstractC62014RxO.A00(s);
            case 5696:
                return s != 5248 ? s != 9683 ? s == 11292 ? "IG_RETAIL_ECOMMERCE_GRAPH_VALIDATING" : "UNDEFINED_QPL_EVENT" : "IG_RETAIL_ECOMMERCE_NATIVE_IX_DOCUMENT_LOAD" : "IG_RETAIL_ECOMMERCE_DA_PT_RENDERING";
            case 5718:
                return s == 15074 ? "META_WWW_COMET_AC_INITIAL_LOAD" : "UNDEFINED_QPL_EVENT";
            case 5740:
                return s == 13976 ? "MESSENGER_PPML_RANKER_STATS" : "UNDEFINED_QPL_EVENT";
            case 5749:
                return s != 10644 ? s == 11076 ? "WHATSAPP_INAPP_SUPPORT_OPEN_HELP_CENTER" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_INAPP_SUPPORT_OPEN_CONTEXTUAL_HELP";
            case 5770:
                return s == 14506 ? "FBLITE_SNAPTU_MESSAGES_TRANSPORT_UNITY_TO_CLIENT_RTT" : "UNDEFINED_QPL_EVENT";
            case 5782:
                return s != 1656 ? s != 5550 ? s == 15866 ? "MEMORY_IDLE_TIME_MEASUREMENT_REPORT_ALLOCATION" : "UNDEFINED_QPL_EVENT" : "MEMORY_IDLE_TIME_MEASUREMENT_REPORT_IDLE_TIME" : "MEMORY_IDLE_TIME_MEASUREMENT_MEASURE_MEMORY_IDLE_TIME";
            case 5784:
                return s != 4478 ? s != 6484 ? s != 8354 ? s == 15155 ? "USER_PAY_SUBS_GIFTING_SUBS_GIFTING_CLIENT" : "UNDEFINED_QPL_EVENT" : "USER_PAY_SUBS_GIFTING_SUBS_GIFTING_SERVER" : "USER_PAY_SUBS_GIFTING_SUBS_GIFTING_ACCEPT_SERVER" : "USER_PAY_SUBS_GIFTING_SUBS_GIFTING_ACCEPT_CLIENT";
            case 5799:
                return s != 1687 ? s == 15501 ? "INSTAMADILLO_EB_INFRA_INBOX_SNAPSHOT" : "UNDEFINED_QPL_EVENT" : "INSTAMADILLO_EB_INFRA_THREAD_PAGING";
            case 5806:
                return s != 1847 ? s != 1908 ? s != 10109 ? s != 10773 ? s == 13415 ? "WEARABLE_BAREBONE_MAIN_ACTIVITY_READY" : "UNDEFINED_QPL_EVENT" : "WEARABLE_BAREBONE_START_SERVICE_CLICK" : "WEARABLE_BAREBONE_BIND_SERVICE_CLICK" : "WEARABLE_BAREBONE_SECOND_ACTIVITY_READY" : "WEARABLE_BAREBONE_APP_START";
            case 5842:
                return s != 11221 ? s == 13475 ? "LOCKBOX_UNDERLYING_ERROR" : "UNDEFINED_QPL_EVENT" : "LOCKBOX_LOCKBOX_WRITE";
            case 5844:
                return s != 1939 ? s == 8533 ? "PHOTO_COLLAGE_PHOTO_COLLAGE_RENDER_TTI" : "UNDEFINED_QPL_EVENT" : "PHOTO_COLLAGE_RMS_COLLAGE_GENERATION";
            case 5854:
                return s != 1620 ? s != 9127 ? s == 9360 ? "IG_XME_CONTENT_ELIGIBILITY_CHECK" : "UNDEFINED_QPL_EVENT" : "IG_XME_CONTENT_COMPAT_CONFIG_FETCH" : "IG_XME_NUX_ATTEMPT";
            case 5859:
                return AbstractC62082Ryr.A00(s);
            case 5874:
                return s != 7990 ? s == 13449 ? "WEARABLE_ML_MODEL_UPDATER_MODEL_UPDATE" : "UNDEFINED_QPL_EVENT" : "WEARABLE_ML_MODEL_UPDATER_MODEL_DELIVERY";
            case 5884:
                return s != 1139 ? s != 1976 ? s == 2367 ? "MESSENGER_SECOND_SCREEN_XMA_YOUTUBE_XMA_THUMBNAIL" : "UNDEFINED_QPL_EVENT" : "MESSENGER_SECOND_SCREEN_XMA_SPOTIFY_XMA_PLAYER" : "MESSENGER_SECOND_SCREEN_XMA_YOUTUBE_XMA_PLAYER";
            case 5885:
                return s == 15052 ? "HORIZON_RUNTIME_ASSET_PROCESSING_HUR_ASSETBUNDLE_LOAD" : "UNDEFINED_QPL_EVENT";
            case 5892:
                return s != 1 ? s != 8207 ? s == 10937 ? "WHATSAPP_GRAPHQL_WHATSAPP_FB_USER_ENTITY_MANAGEMENT" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_GRAPHQL_WHATSAPP_SMB_USER_ENTITY_OPERATION" : "WHATSAPP_GRAPHQL_WHATSAPP_AUTHENTICATED_GRAPHQL";
            case 5897:
                return s == 4779 ? "IG_LIPSYNC_LIPSYNC_FACE_DETECTION" : "UNDEFINED_QPL_EVENT";
            case 5901:
                return s == 15076 ? "CX_FEED_OF_ADS_TAIL_LOAD" : "UNDEFINED_QPL_EVENT";
            case 5918:
                return s != 7585 ? s == 8498 ? "INSTAGRAM_ACCOUNT_STATUS_NUDGE_FUNNEL" : "UNDEFINED_QPL_EVENT" : "INSTAGRAM_ACCOUNT_STATUS_ACCOUNT_STATUS_FUNNEL";
            case 5938:
                return s != 7728 ? s == 9290 ? "TOFU_PERSONALIZATION_FETCH_VIEW" : "UNDEFINED_QPL_EVENT" : "TOFU_PERSONALIZATION_UPDATE_VIEW";
            case 5964:
                return s == 1268 ? "IG_HIDDEN_WORDS_FILTER_THREADS_GROUP" : "UNDEFINED_QPL_EVENT";
            case 5970:
                return AbstractC61962RwY.A00(s);
            case 5983:
                return s != 6540 ? s == 14246 ? "SOCIAL_IMPACT_LEARNING_UNIT_DETAILS_TTRC" : "UNDEFINED_QPL_EVENT" : "SOCIAL_IMPACT_LEARNING_UNITS_LIST_TTRC";
            case 5986:
                return s != 5779 ? s != 12050 ? s == 16327 ? "DESK_RESERVATION_AUTO_ASSIGN_CREATED_RESERVATION" : "UNDEFINED_QPL_EVENT" : "DESK_RESERVATION_DESK_RESERVATION_CREATE_RESERVATION" : "DESK_RESERVATION_AUTO_ASSIGN_SERVICE_CALL";
            case 5988:
                return s != 2239 ? s != 2921 ? s == 16243 ? "MWB_ENFORCEMENT_FAIRNESS_GROUP_THREAD_METADATA_RESTRICTED_ACCESS" : "UNDEFINED_QPL_EVENT" : "MWB_ENFORCEMENT_FAIRNESS_FEATURE_LIMIT_SYNC" : "MWB_ENFORCEMENT_FAIRNESS_THREAD_LIMIT_SYNC";
            case 6019:
                return s == 1 ? "FBLITE_CBLOKS_BIND" : "UNDEFINED_QPL_EVENT";
            case 6031:
                return s == 10939 ? "FB_CREATION_QUALITY_MEDIA_PREVIEW_RERENDER" : "UNDEFINED_QPL_EVENT";
            case 6044:
                return s != 1923 ? s != 2825 ? s != 7280 ? s == 13503 ? "FB_X_AND_BROWSE_ANDROID_REELS_IMAGE_ADS_OVERLAY_BROWSE" : "UNDEFINED_QPL_EVENT" : "FB_X_AND_BROWSE_ANDROID_REELS_CAPTION_AND_BROWSE" : "FB_X_AND_BROWSE_FB_X_AND_BROWSE_UNEXPECTED_EVENT" : "FB_X_AND_BROWSE_ANDROID_REELS_LONG_PRESS_AND_BROWSE";
            case 6048:
                return AbstractC61958RwU.A00(s);
            case 6054:
                return s == 9667 ? "RECON_NOTIF_LANDING_NOTIF_LANDING_TTRC" : "UNDEFINED_QPL_EVENT";
            case 6057:
                return s != 2428 ? s != 6459 ? s != 13144 ? s == 14310 ? "SECURITY_DISTRACT_HOOKS_ERROR" : "UNDEFINED_QPL_EVENT" : "SECURITY_DISTRACT_HOOKS_BLOCK_LIBRARY_LOAD" : "SECURITY_DISTRACT_HOOKS_MEMORY_ALLOCATORS" : "SECURITY_DISTRACT_HOOKS_ALLOW_LIBRARY_LOAD_V2";
            case 6065:
                return AbstractC61936Rw8.A00(s);
            case 6078:
                return AbstractC62006RxG.A00(s);
            case 6080:
                return s == 11670 ? "GENAI_AI_STUDIO_ENGAGEMENT_IG_PROFILE_IG_AI_PROFILE_BANNER_FETCH_MOBILE" : "UNDEFINED_QPL_EVENT";
            case 6085:
                return s != 3011 ? s != 4895 ? s != 7119 ? s != 10052 ? s != 12365 ? s == 15912 ? "THREADS_MAIN_FEED_FEED_FLASH_CACHE_STORING" : "UNDEFINED_QPL_EVENT" : "THREADS_MAIN_FEED_FEED_FLASH_CACHE_REMOVAL" : "THREADS_MAIN_FEED_FEED_FLASH_CACHE_RETRIEVAL" : "THREADS_MAIN_FEED_FEED_LOADING_INDICATOR_VISIBILITY" : "THREADS_MAIN_FEED_FEED_REFRESH_ATTEMPT" : "THREADS_MAIN_FEED_FEED_REQUEST";
            case 6086:
                return s != 10187 ? s != 10403 ? s != 11790 ? s != 15896 ? s == 16115 ? "AR_GAMES_PERF_TIME_TO_INTERACT" : "UNDEFINED_QPL_EVENT" : "AR_GAMES_PERF_LEVEL_START" : "AR_GAMES_PERF_ENEMY_SPAWN" : "AR_GAMES_PERF_LEADERBOARD_OPEN" : "AR_GAMES_PERF_ENEMY_DIE";
            case 6087:
                return s != 2214 ? s != 3590 ? s != 5234 ? s == 14810 ? "WEARABLE_APPMANAGER_UNREGISTER_PROGRESS_OBSERVER" : "UNDEFINED_QPL_EVENT" : "WEARABLE_APPMANAGER_COLD_START" : "WEARABLE_APPMANAGER_REGISTER_PROGRESS_OBSERVER" : "WEARABLE_APPMANAGER_APP_UPDATE_USER_FLOW";
            case 6096:
                return AbstractC61976Rwm.A00(s);
            case 6128:
                return S03.A00(s);
            case 6147:
                return s != 1275 ? s != 8889 ? s != 11543 ? s != 11911 ? s == 15401 ? "CRM_ALERTS_ALERT_REGISTRATION" : "UNDEFINED_QPL_EVENT" : "CRM_ALERTS_ALERTS_UI_TABLE_LOAD_TIME" : "CRM_ALERTS_ALERTS_QUERY_PER_USER" : "CRM_ALERTS_ALERTS_UI_TABLE_QUERY_PREP_TIME" : "CRM_ALERTS_ALERT_RESOLUTION";
            case 6154:
                return AbstractC62143Rzq.A00(s);
            case 6155:
                return s == 10233 ? "WEARABLE_OOBE_RELIABILITY_JOURNEY_OOBE_JOURNEY_DEBUG" : "UNDEFINED_QPL_EVENT";
            case 6161:
                return s != 1503 ? s != 6605 ? s == 8421 ? "FDID_PERF_FDID_OE" : "UNDEFINED_QPL_EVENT" : "FDID_PERF_FDID_AA_LATENCY" : "FDID_PERF_FDID_USECASE_ANDROID";
            case 6170:
                return s != 2237 ? s != 6396 ? s != 9633 ? s != 12976 ? s == 13412 ? "SPARK_CAPABILITIES_AR_MODEL_RENDER_LOAD" : "UNDEFINED_QPL_EVENT" : "SPARK_CAPABILITIES_AR_MODEL_DOWNLOAD" : "SPARK_CAPABILITIES_AR_EFFECT_FIRST_FRAME" : "SPARK_CAPABILITIES_AR_EFFECT_E2E_SESSION" : "SPARK_CAPABILITIES_AR_EFFECT_DOWNLOAD";
            case 6174:
                return s != 3040 ? s != 7257 ? s != 7445 ? s != 11575 ? s != 12561 ? s == 13366 ? "WP_WEBHOOKS_IDP_WEBHOOK_RESUBSCRIBE" : "UNDEFINED_QPL_EVENT" : "WP_WEBHOOKS_IDP_WEBHOOK_CREATE_USER" : "WP_WEBHOOKS_IDP_WEBHOOK_REQUEST" : "WP_WEBHOOKS_IDP_WEBHOOK_DELETE_USER" : "WP_WEBHOOKS_IDP_WEBHOOK_EDIT_USER" : "WP_WEBHOOKS_IDP_WEBHOOK_RESUBSCRIBE_COMPANY";
            case 6183:
                return s == 15788 ? "FB_REELS_PUBLISH_PAGE_REELS_COVER_PHOTO_SELECTOR_INITIALIZED" : "UNDEFINED_QPL_EVENT";
            case 6226:
                return s != 7473 ? s == 9963 ? "MCP_ECHO_DEPRECATION_ECHO_PROTO_BATCH_MIGRATION_EB_OFF" : "UNDEFINED_QPL_EVENT" : "MCP_ECHO_DEPRECATION_ECHO_PROTO_CONVERSION_EB_ON";
            case 6228:
                return s != 2039 ? s != 4094 ? s != 8262 ? s != 9108 ? s != 10687 ? s == 13376 ? "MTV_MANAGED_MOBILE_ERRORS_LAUNCH_AS_FRAGMENT_UNEXPECTED_EVENT" : "UNDEFINED_QPL_EVENT" : "MTV_MANAGED_MOBILE_ERRORS_RENDER_UNSUPPORTED_THREAD_TYPE" : "MTV_MANAGED_MOBILE_ERRORS_CONTACT_TYPE_EXACT_MISSING_MAPPING_EVENT" : "MTV_MANAGED_MOBILE_ERRORS_GENAI_TYPING_INDICATOR_ERROR" : "MTV_MANAGED_MOBILE_ERRORS_EARLY_EXIT" : "MTV_MANAGED_MOBILE_ERRORS_RENDER_DIFFERENT_THREAD_KEY_UNEXPECTED_EVENT";
            case 6233:
                return s == 2625 ? "LOOM_TRACE_FUNNEL_STARTED_TRACING" : "UNDEFINED_QPL_EVENT";
            case 6248:
                return s == 7474 ? "PLAYBACK_BLACKBOX_VIDEO_PLAYBACK_STATE" : "UNDEFINED_QPL_EVENT";
            case 6251:
                return s != 13610 ? s != 14999 ? s == 15007 ? "IG_PROMOTE_POST_UPDATE_PROMOTE_AD_ACCOUNT_LINK_PREFERENCE" : "UNDEFINED_QPL_EVENT" : "IG_PROMOTE_POST_IG_PROMOTE_PREVALIDATION_CHECKS" : "IG_PROMOTE_POST_IG_PROFESSIONAL_IDENTITY_BOOST_ONBOARDING";
            case 6261:
                return s == 16378 ? "MSGR_ENF_FL_MSGR_MSG_SEND_FL" : "UNDEFINED_QPL_EVENT";
            case 6266:
                return s != 2259 ? s == 5300 ? "FB_BLOKS_FEED_COMPONENTS_MOUNT" : "UNDEFINED_QPL_EVENT" : "FB_BLOKS_FEED_COMPONENTS_CALCULATE_LAYOUT_STATE";
            case 6280:
                return s != 3418 ? s != 5651 ? s != 7024 ? s != 8124 ? s != 11250 ? s == 16164 ? "THREED_CAMERA_GLB_RENDERING" : "UNDEFINED_QPL_EVENT" : "THREED_CAMERA_VIEWER_CAMERA_SESSION" : "THREED_CAMERA_EFFECT_FETCH_RENDERING" : "THREED_CAMERA_VIEWER_CREATION" : "THREED_CAMERA_VIEWER_E2E" : "THREED_CAMERA_VIEWER_LIFECYCLE";
            case 6288:
                return s == 15550 ? "LINK_USER_CONNECTION_FLOW_XRSTREAMINGCLIENT_INITI" : "UNDEFINED_QPL_EVENT";
            case 6289:
                return s == 12302 ? "PLATFORM_TTRC_PLATFORM_TTRC_LOGGER" : "UNDEFINED_QPL_EVENT";
            case 6299:
                return s == 10557 ? "RP_WWW_EMOJI_REACTIONS_EMOJI_SELECT" : "UNDEFINED_QPL_EVENT";
            case 6308:
                return s == 2398 ? "MSGR_AVATAR_STICKER_AVATAR_STICKER_TRAY_SESSION" : "UNDEFINED_QPL_EVENT";
            case 6321:
                return s != 1018 ? s == 9685 ? "SPACECRAFT_WIDGET_TREE_RENDER" : "UNDEFINED_QPL_EVENT" : "SPACECRAFT_RUNTIME_AUGMENT_RENDER";
            case 6333:
                return s == 1 ? "WHATSAPP_SMARTGLASSES_MEDIA_ATTRIBUTION_MEDIA_SHARED" : "UNDEFINED_QPL_EVENT";
            case 6358:
                return s != 1567 ? s != 4272 ? s == 12558 ? "MSGR_AI_THEMES_GENERATE_IMAGE_FROM_PROMPT" : "UNDEFINED_QPL_EVENT" : "MSGR_AI_THEMES_GENERATE_THEME_FROM_PROMPT" : "MSGR_AI_THEMES_POST_PROCESS_GENERATED_IMAGE";
            case 6359:
                return AbstractC62124RzX.A00(s);
            case 6373:
                return s == 8392 ? "MESSENGER_NOTIFICATION_ENGINE_ARMADILLO_INTEGRATOR_CREATION" : "UNDEFINED_QPL_EVENT";
            case 6388:
                return s != 3912 ? s == 10143 ? "MSYS_HEALTH_FLOWID_SHADOW_FBLITE_TLTV" : "UNDEFINED_QPL_EVENT" : "MSYS_HEALTH_FLOWID_SHADOW_ORCA_THREADLIST_TTRC";
            case 6392:
                return s == 15582 ? "STORIES_IN_FEED_NUX_USER_FLOW" : "UNDEFINED_QPL_EVENT";
            case 6393:
                return s != 1335 ? s != 4790 ? s == 8427 ? "GEOANCHOR_TRACKER_GEOANCHOR_TRACKER_GEO_AR" : "UNDEFINED_QPL_EVENT" : "GEOANCHOR_TRACKER_GEOANCHOR_TRACKER_TRANSFORM" : "GEOANCHOR_TRACKER_GEOANCHOR_TRACKER_STATE_UPDATE";
            case 6419:
                return s != 2 ? s != 8652 ? s == 11641 ? "HORIZON_WORLD_CHAT_VR_PANEL_OPEN" : "UNDEFINED_QPL_EVENT" : "HORIZON_WORLD_CHAT_USER_MSG_SEND" : "HORIZON_WORLD_CHAT_WORLD_CHAT_LOAD";
            case 6445:
                return s == 12462 ? "IG_CELLAR_IG_CELLAR_GRAPHQL_REPORTING" : "UNDEFINED_QPL_EVENT";
            case 6446:
                return s == 6828 ? "VR_MULTIPLAYER_VR_TRAVEL" : "UNDEFINED_QPL_EVENT";
            case 6455:
                return s != 9586 ? s == 15567 ? "VIDEO_END_SCENE_FB_FEED_VIDEO_END_SCENE_FLOW" : "UNDEFINED_QPL_EVENT" : "VIDEO_END_SCENE_ANDROID_VIDEO_END_CARD_APPEAR";
            case 6468:
                return s == 14785 ? "MSYS_REVERB_RESTORE_FBN_REVERB_RESTORE" : "UNDEFINED_QPL_EVENT";
            case 6471:
                return AbstractC61946RwI.A00(s);
            case 6473:
                return s == 13840 ? "NETWORK_CALLBACK_PROXY_METRIC_NETWORK_CALLBACK_EVENT" : "UNDEFINED_QPL_EVENT";
            case 6475:
                return s == 2445 ? "ADD_YOURS_TEMPLATE_STICKER_ADD_YOURS_TEMPLATE_DISCOVERY_SURFACE_QUERY" : "UNDEFINED_QPL_EVENT";
            case 6503:
                return s != 1150 ? s != 11036 ? s == 14982 ? "MANTLE_PLATFORM_SMART_REPLIES" : "UNDEFINED_QPL_EVENT" : "MANTLE_PLATFORM_MANTLE_STATS" : "MANTLE_PLATFORM_MANTLE_CLIENT_STATS";
            case 6539:
                return s != 1455 ? s != 5549 ? s != 7949 ? s != 10778 ? s == 12948 ? "AEL_PERF_AEL_LLM_SUBMISSIONS" : "UNDEFINED_QPL_EVENT" : "AEL_PERF_AEL_VOICE_EVENT" : "AEL_PERF_TTS_SERVICE_REQUEST" : "AEL_PERF_AEL_AGENT_SPAWNED" : "AEL_PERF_AEL_LLM_CAPACITY";
            case 6540:
                return s != 1 ? s == 2 ? "WEARABLE_SELFCARE_DEBUG_DEBUG_SENSOR_COLLECTION_END" : "UNDEFINED_QPL_EVENT" : "WEARABLE_SELFCARE_DEBUG_DEBUG_SENSOR_COLLECTION_START";
            case 6549:
                return AbstractC62102RzB.A00(s);
            case 6551:
                return s != 3400 ? s == 6783 ? "MOBILE_NETWORK_STACK_APP_START_REQUESTS_TIMELINE" : "UNDEFINED_QPL_EVENT" : "MOBILE_NETWORK_STACK_APP_START_REQUESTS_HTTP_REQUEST";
            case 6561:
                return s == 1014 ? "FBLITE_CLIENT_HTTP_2_VIDEO_HTTP_REQUEST" : "UNDEFINED_QPL_EVENT";
            case 6577:
                return s != 1622 ? s != 3276 ? s == 15285 ? "WEARABLE_RECAP_VIDEO_RECAP_VIDEO_PREVIEW_LOADING" : "UNDEFINED_QPL_EVENT" : "WEARABLE_RECAP_VIDEO_RECAP_VIDEO_PLAY" : "WEARABLE_RECAP_VIDEO_RECAP_VIDEO_REPLAY";
            case 6586:
                return s != 7364 ? s != 11915 ? s == 12197 ? "GROUPS_WWW_GROUP_MALL_FEED" : "UNDEFINED_QPL_EVENT" : "GROUPS_WWW_GROUP_MALL_COMPOSER" : "GROUPS_WWW_GROUP_MALL_HEADER";
            case 6587:
                return s != 2001 ? s != 5000 ? s != 5403 ? s != 7787 ? s != 8390 ? s == 15089 ? "MESSAGING_GRAPH_PEOPLE_TAB_TO_CONTACT_MANAGER" : "UNDEFINED_QPL_EVENT" : "MESSAGING_GRAPH_INTERACT_WITH_A_CONTACT_CARD" : "MESSAGING_GRAPH_CONTACT_MANAGER_TO_THREAD" : "MESSAGING_GRAPH_VIEW_THREAD_CONTEXT_LINES_TTRC" : "MESSAGING_GRAPH_CREATE_A_CONTACT_ON_RTC" : "MESSAGING_GRAPH_VIEW_THREAD_CONTEXT_LINES";
            case 6593:
                return s == 1 ? "VIDEO_INFRA_MME_PLAYBACK_API_ERROR" : "UNDEFINED_QPL_EVENT";
            case 6605:
                return AbstractC61819RuD.A00(s);
            case 6621:
                return s == 8086 ? "SECURITY_SETTINGS_PASSWORD_CHANGE" : "UNDEFINED_QPL_EVENT";
            case 6633:
                return s == 4585 ? "OCULUS_Q4B_NUX_ZERO_TOUCH_GQL" : "UNDEFINED_QPL_EVENT";
            case 6649:
                return AbstractC62123RzW.A00(s);
            case 6678:
                return s != 1440 ? s != 2312 ? s != 4369 ? s == 9113 ? "SHOPS_UGC_CLICK_PRODUCER_REQUEST_ACTION" : "UNDEFINED_QPL_EVENT" : "SHOPS_UGC_SEE_ALL_MEDIAS" : "SHOPS_UGC_SCREEN_TTRC" : "SHOPS_UGC_LOAD_CPDP_MEDIA";
            case 6692:
                return s != 4790 ? s == 15072 ? "COMMERCE_PRODUCT_SYSTEM_NAVIGATION_MENU_GEN" : "UNDEFINED_QPL_EVENT" : "COMMERCE_PRODUCT_SYSTEM_PRODUCT_TILE_GEN";
            case 6716:
                return AbstractC61826RuK.A00(s);
            case 6718:
                return s != 12678 ? s == 13388 ? "SEVMANAGER_ADD_SEV_COMMENT" : "UNDEFINED_QPL_EVENT" : "SEVMANAGER_EDIT_SEV";
            case 6756:
                return s == 7898 ? "FB_TEXT_TO_SPEECH_TEXT_TO_SPEECH_TTI" : "UNDEFINED_QPL_EVENT";
            case 6765:
                return s == 11969 ? "GYSJ_SNAPSHOT_PREVIEW_FLOW" : "UNDEFINED_QPL_EVENT";
            case 6781:
                return s == 5096 ? "IG_SHARING_IG_PIVOT_PAGE_LOAD" : "UNDEFINED_QPL_EVENT";
            case 6787:
                return AbstractC61923Rvv.A00(s);
            case 6789:
                return s == 9345 ? "BUDGETING_PORTAL_SHOW_CREATE_PLAN_MODAL" : "UNDEFINED_QPL_EVENT";
            case 6794:
                return s != 12809 ? s == 13363 ? "LIGER_TCP_XMPP_STREAM" : "UNDEFINED_QPL_EVENT" : "LIGER_TCP_LIGER_TCP_TO_CHATD";
            case 6829:
                return s == 4140 ? "WEARABLE_TOUCH_PERF_TOUCH_RESPONSIVENESS" : "UNDEFINED_QPL_EVENT";
            case 6830:
                return s != 4116 ? s != 5857 ? s != 6124 ? s != 7762 ? s == 12043 ? "REMOTE_DESKTOP_SERVER_CLIENT_DISCONNECTION_FLOW" : "UNDEFINED_QPL_EVENT" : "REMOTE_DESKTOP_SERVER_CREATE_VIRTUAL_DISPLAY" : "REMOTE_DESKTOP_SERVER_CONNECTION_REQUEST" : "REMOTE_DESKTOP_SERVER_SERVER_START" : "REMOTE_DESKTOP_SERVER_CLIENT_CONNECTION_FLOW";
            case 6831:
                return s != 1795 ? s == 3671 ? "MEZZANINE_MEZZANINE_QUERY_EXECUTION" : "UNDEFINED_QPL_EVENT" : "MEZZANINE_MEZZANINE_QUERY_EXECUTOR";
            case 6838:
                return AbstractC61853Rul.A00(s);
            case 6857:
                return s != 11971 ? s == 13188 ? "VIDEO_REMOTE_TRIMMER_REMOTE_TRIMMER_FLOW" : "UNDEFINED_QPL_EVENT" : "VIDEO_REMOTE_TRIMMER_BACKCATALOG_VOD_TO_REEL_FLOW";
            case 6858:
                return s == 11267 ? "MESSENGER_COMMERCE_BUYER_FUNNEL_BMOP_BUYER_IN_THREAD_ACTIVITIES" : "UNDEFINED_QPL_EVENT";
            case 6862:
                return s != 3230 ? s != 3684 ? s != 11602 ? s == 14746 ? "UNITY_CTRL_SDK_CTRL_STREAM_EVENT" : "UNDEFINED_QPL_EVENT" : "UNITY_CTRL_SDK_CTRL_CLIENT_START" : "UNITY_CTRL_SDK_CTRL_CLIENT_UPDATE" : "UNITY_CTRL_SDK_CTRL_CLIENT_LATENCY";
            case 6879:
                return s != 5361 ? s != 10046 ? s != 12796 ? s == 14121 ? "RICHMEDIACOLLECTION_ANDROID_TILE_CREATION" : "UNDEFINED_QPL_EVENT" : "RICHMEDIACOLLECTION_ANDROID_SUBATTAMENTS_CREATION" : "RICHMEDIACOLLECTION_ANDROID_FOOTER_CREATION" : "RICHMEDIACOLLECTION_ANDROID_HSCROLL_TILE_CLICK";
            case 6905:
                return s != 1 ? s == 3273 ? "QPL_DEMO_MODULE_INSIGHTS_REPORT" : "UNDEFINED_QPL_EVENT" : "QPL_DEMO_MODULE_DEMO_EVENT";
            case 6906:
                return AbstractC61886RvI.A00(s);
            case 6914:
                return S05.A00(s);
            case 6919:
                return s != 1 ? s == 2555 ? "FBLITE_NETWORK_HEALTH_FBLITE_UNITY_CHANNEL_HEALTH_INTERACTION" : "UNDEFINED_QPL_EVENT" : "FBLITE_NETWORK_HEALTH_FBLITE_UNITY_CHANNEL_HEALTH";
            case 6932:
                return s != 7423 ? s == 12869 ? "RP_VOICEMAIL_RP_VOICEMAIL_ERROR" : "UNDEFINED_QPL_EVENT" : "RP_VOICEMAIL_RP_VOICEMAIL_PERF";
            case 6939:
                return s == 12652 ? "ANDROID_UNIFIED_UPLOAD_MOS_CLIENT_SIDE_CALCULATE_MOS" : "UNDEFINED_QPL_EVENT";
            case 6950:
                return s != 11542 ? s == 13144 ? "MUSIC_PICKER_ERRORS_MUSIC_PLAYBACK_FAILED_ERROR" : "UNDEFINED_QPL_EVENT" : "MUSIC_PICKER_ERRORS_SONG_MODEL_BUILD_ERROR";
            case 6964:
                return s == 5625 ? "AR_ADS_CAMERA_FUNNEL_ANDROID" : "UNDEFINED_QPL_EVENT";
            case 6967:
                return AbstractC61926Rvy.A00(s);
            case 6969:
                return s != 3178 ? s != 7046 ? s != 11371 ? s != 11507 ? s == 12167 ? "WEARABLE_STORIES_HUB_STORIES_VIEWER_TTRC" : "UNDEFINED_QPL_EVENT" : "WEARABLE_STORIES_HUB_APP_START_AND_STORIES_LOAD" : "WEARABLE_STORIES_HUB_STORY_DELETION" : "WEARABLE_STORIES_HUB_STORIES_VIEWER_TRANSITION_TTRC" : "WEARABLE_STORIES_HUB_APP_START";
            case 6971:
                return s != 6248 ? s == 7119 ? "ONE_RECOGNIZER_FC_ONE_RECOGNIZER_COORDINATOR" : "UNDEFINED_QPL_EVENT" : "ONE_RECOGNIZER_FC_ONE_RECOGNIZER_DETERMINATOR";
            case 6977:
                return s != 12079 ? s == 14969 ? "MESSENGER_AI_CREATION_MAGICMOD_IMAGE_REQUEST" : "UNDEFINED_QPL_EVENT" : "MESSENGER_AI_CREATION_CUTOUT_STYLES_REQUEST";
            case 7018:
                return s == 1 ? "APP_NAV_TAB_USER_OPTIONS_SHEET" : "UNDEFINED_QPL_EVENT";
            case 7021:
                return s != 5008 ? s == 12937 ? "MESSENGER_COREUSERFLOW_INBOX_LOAD_TILL_UI_DISPLAY" : "UNDEFINED_QPL_EVENT" : "MESSENGER_COREUSERFLOW_CREATE_NEW_CHAT";
            case 7023:
                return s == 2476 ? "FB_FEED_ADS_BLOKS_FOOTER_AND_CTA_BLOKS_COLORED_CTA_ON_DWELL" : "UNDEFINED_QPL_EVENT";
            case 7024:
                return s == 10008 ? "AR_CROSS_DEVICE_EXPERIENCES_CONSTELLATION_STEP_PRE" : "UNDEFINED_QPL_EVENT";
            case 7044:
                return RvU.A00(s);
            case 7051:
                return s != 4614 ? s != 7056 ? s != 9310 ? s == 11339 ? "CLOUD_PROFILES_INSTALL" : "UNDEFINED_QPL_EVENT" : "CLOUD_PROFILES_DOWNLOAD" : "CLOUD_PROFILES_TOTAL_PROFILE_UPLOAD" : "CLOUD_PROFILES_PROFILE_UPLOAD";
            case 7054:
                return s != 5847 ? s == 6366 ? "WP_LIVE_STUDIO_START_BROADCAST" : "UNDEFINED_QPL_EVENT" : "WP_LIVE_STUDIO_END_BROADCAST";
            case 7070:
                return s != 1987 ? s == 5964 ? "VR_CAMERA_PANEL_VR_CAMERA_ROLL_PERF_PROFILING" : "UNDEFINED_QPL_EVENT" : "VR_CAMERA_PANEL_VR_CAMERA_ROLL_PERF_RETRIEVE_FILE_LIST_INIT";
            case 7089:
                return s != 9333 ? s == 13458 ? "FAM_PROD_INFRA_SHOP_ADS_RELIABILITY" : "UNDEFINED_QPL_EVENT" : "FAM_PROD_INFRA_LOAD_ANYWHERE_FROM_AD_TTRC";
            case 7091:
                return s == 16318 ? "EMERGING_BUSINESS_STARS_SIMPLIFIED_CLAIM_N_SEND_STARS_SIMPLIFIED_CLAIM_N_SEND" : "UNDEFINED_QPL_EVENT";
            case 7106:
                return s == 3093 ? "IG_CREATOR_MONETIZATION_STABILITY_METRICS_ONBOARDING_STEP" : "UNDEFINED_QPL_EVENT";
            case 7107:
                return s != 1624 ? s != 5164 ? s != 6767 ? s == 8585 ? "BLOKS_COLLECTION_VIDEO_LOADING_SHIMMER" : "UNDEFINED_QPL_EVENT" : "BLOKS_COLLECTION_SIMILAR_PRODUCTS_LOADING_SHIMMER" : "BLOKS_COLLECTION_SCREEN_TTRC" : "BLOKS_COLLECTION_PAGINATION_LOADING_SHIMMER";
            case 7117:
                return s != 10970 ? s == 15054 ? "CAPTIONS_ASR_MODEL_LOAD" : "UNDEFINED_QPL_EVENT" : "CAPTIONS_ASR_CAPTION_SESSION";
            case 7120:
                return s == 3245 ? "HOLOGRAM_GENERATE_HOLOGRAM" : "UNDEFINED_QPL_EVENT";
            case 7136:
                return s == 12746 ? "XR_AUDIO_SDK_AUDIO_SDK_CONTEXT_CREATED" : "UNDEFINED_QPL_EVENT";
            case 7146:
                return s != 8004 ? s != 11086 ? s != 11418 ? s == 14641 ? "IG_ADS_MANAGER_PROMOTION_MANAGER_COLD_START_TIME" : "UNDEFINED_QPL_EVENT" : "IG_ADS_MANAGER_ADS_MANAGER_RENDERED" : "IG_ADS_MANAGER_BOOST_GOAL_RENDERED" : "IG_ADS_MANAGER_BOOST_AUDIENCE_RENDERED";
            case 7152:
                return s != 7792 ? s != 8594 ? s == 11293 ? "AR_SPARK_LINES_START_GAME" : "UNDEFINED_QPL_EVENT" : "AR_SPARK_LINES_TIME_TO_INTERACT" : "AR_SPARK_LINES_COLUMN_SELECTION";
            case 7174:
                return s == 13293 ? "DSP_IMPRESSION_LOSS" : "UNDEFINED_QPL_EVENT";
            case 7213:
                return s == 1 ? "OCULUS_IMS_SALSA_WORKER" : "UNDEFINED_QPL_EVENT";
            case 7215:
                return S09.A00(s);
            case 7227:
                return s != 4765 ? s != 6577 ? s != 11269 ? s != 12546 ? s == 13134 ? "AI_BACKDROP_AI_BACKDROP_IMAGE_QUERY_TTI" : "UNDEFINED_QPL_EVENT" : "AI_BACKDROP_AI_BACKDROP_SEGMENT_QUERY_TTI" : "AI_BACKDROP_AI_BACKDROP_UPLOAD_DOWNSAMPLED_IMAGE" : "AI_BACKDROP_AI_BACKDROP_SEGMENT_GENERATION" : "AI_BACKDROP_AI_BACKDROP_COMPRESS_AND_DOWNSIZE";
            case 7229:
                return s == 11543 ? "WP_ANDROID_SECURITY_SECURITY_LOGGING_UNEXPECTED_ERROR" : "UNDEFINED_QPL_EVENT";
            case 7242:
                return s != 1 ? s == 2 ? "OCULUS_STORE_INTERACTION_TRACING_NAVIGATION" : "UNDEFINED_QPL_EVENT" : "OCULUS_STORE_INTERACTION_TRACING_INITIAL_LOAD";
            case 7272:
                return s == 6971 ? "FB_SHOP_TAB_OCF_FEED_TTRC" : "UNDEFINED_QPL_EVENT";
            case 7274:
                return s != 7032 ? s == 8010 ? "WHATSAPP_INTERNAL_BUG_REPORTING_UPLOAD_MEDIA" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_INTERNAL_BUG_REPORTING_SUBMIT_BUG";
            case 7293:
                return s != 4380 ? s != 6614 ? s == 10787 ? "PORTAL_FRAME_PERF_PORTAL_TRANSITION_PERF" : "UNDEFINED_QPL_EVENT" : "PORTAL_FRAME_PERF_PORTAL_ANIMATION_PERF" : "PORTAL_FRAME_PERF_PORTAL_SCROLL_PERF";
            case 7297:
                return s == 13418 ? "IGD_INSTAMADILLO_OPTIONAL_THREAD_CREATION" : "UNDEFINED_QPL_EVENT";
            case 7299:
                return s == 2 ? "HCS_MODULE_BB_HCS_EVENT_DD" : "UNDEFINED_QPL_EVENT";
            case 7311:
                return s == 5788 ? "FB_MOBILE_REELS_SHOWREEL_NATIVE_FB_REELS_SN_COMPONENT_USER_FLOW" : "UNDEFINED_QPL_EVENT";
            case 7317:
                return s != 12226 ? s == 15516 ? "WP_SHIFTS_SHIFT_DETAILS_SHIFT_DETAILS_FLOW_SHARE_SHIFT" : "UNDEFINED_QPL_EVENT" : "WP_SHIFTS_SHIFT_DETAILS_SHIFT_DETAILS_FLOW_OPEN_SHIFT_DETAILS";
            case 7322:
                return s != 2155 ? s != 2773 ? s != 7608 ? s == 8703 ? "IG_CXP_NOTICE_SYNC_CXP_NOTICE_BACKFILLING" : "UNDEFINED_QPL_EVENT" : "IG_CXP_NOTICE_SYNC_CXP_NOTICE_USER_INTERACTION_STATE" : "IG_CXP_NOTICE_FETCH_CXP_NOTICE" : "IG_CXP_NOTICE_SYNC_CXP_NOTICE_SEEN_STATE";
            case 7329:
                return s != 8296 ? s == 8537 ? "IG_NONPERSONALIZED_EXPLORE_CHAIN_LOAD" : "UNDEFINED_QPL_EVENT" : "IG_NONPERSONALIZED_EXPLORE_GRID_LOAD";
            case 7335:
                return AbstractC61874Rv6.A00(s);
            case 7343:
                return s != 6189 ? s == 7122 ? "MESSENGER_STORIES_COMPOSER_MONTAGE_COMPOSER_LAUNCH_PERF" : "UNDEFINED_QPL_EVENT" : "MESSENGER_STORIES_COMPOSER_MONTAGE_COMPOSER_ART_PERF";
            case 7364:
                return s != 2661 ? s == 14661 ? "LOGIN_ONE_TAP_ONE_TAP_CREDENTIAL_USAGE" : "UNDEFINED_QPL_EVENT" : "LOGIN_ONE_TAP_ONE_TAP_CREDENTIAL_RETRIEVAL";
            case 7375:
                return s != 4562 ? s == 10476 ? "IG_ONELINK_IG_ONELINK_MIDDLEWARE_DATA_ACCESS" : "UNDEFINED_QPL_EVENT" : "IG_ONELINK_IG_ONELINK_MOBILE_DATA_ACCESS";
            case 7395:
                return s != 10267 ? s != 15082 ? s == 15213 ? "CTRL_R_PIPELINE_PERFORMANCE" : "UNDEFINED_QPL_EVENT" : "CTRL_R_STARTUP_LATENCY" : "CTRL_R_CTRLR_CRASH";
            case 7404:
                return s != 1306 ? s == 7091 ? "IG_ANDROID_SURFACE_ORCHESTRATOR_GET_PREINFLATED_VIEW" : "UNDEFINED_QPL_EVENT" : "IG_ANDROID_SURFACE_ORCHESTRATOR_CACHE_SIZE";
            case 7454:
                return s == 1 ? "IG_AWARE_LOGGING_INTERACTION" : "UNDEFINED_QPL_EVENT";
            case 7464:
                return s != 5194 ? s != 7107 ? s == 13941 ? "IG_EVENTS_IAB_SESSION" : "UNDEFINED_QPL_EVENT" : "IG_EVENTS_UNSET_REMINDER" : "IG_EVENTS_SET_REMINDER";
            case 7466:
                return s != 3994 ? s != 8574 ? s == 12161 ? "HORIZON_CREATION_SET_ENTITY_PROPERTY_VALUE" : "UNDEFINED_QPL_EVENT" : "HORIZON_CREATION_UNDO_ACTION" : "HORIZON_CREATION_MODIFY_SELECTION";
            case 7468:
                return s == 14110 ? "WATCH_BADGING_STORE_NEW_INVENTORY_FROM_ASYNC_TIER" : "UNDEFINED_QPL_EVENT";
            case 7515:
                return s == 4500 ? "GPS_ODP_CAPACITY_TEST" : "UNDEFINED_QPL_EVENT";
            case 7528:
                return s != 11394 ? s == 16351 ? "IG_DELIVERY_PROFILE_FOLLOWING_LIST_PREFETCH" : "UNDEFINED_QPL_EVENT" : "IG_DELIVERY_PROFILE_FOLLOWER_LIST_PREFETCH";
            case 7543:
                return S01.A00(s);
            case 7548:
                return s != 5285 ? s == 15313 ? "DEEPLINKING_PRE_URI_MAP" : "UNDEFINED_QPL_EVENT" : "DEEPLINKING_FUNNEL";
            case 7549:
                return s == 1461 ? "FB4A_STORIES_MIDCARD_RMS_COMBINED_MIDCARD_SUGGESTIONS" : "UNDEFINED_QPL_EVENT";
            case 7566:
                return s == 5628 ? "RCP_CONNECTIVITY_WINDOWS_TEST_RCP_CONNECTIVITY_WINDOWS_TEST_DURATION" : "UNDEFINED_QPL_EVENT";
            case 7568:
                return AbstractC61898RvW.A00(s);
            case 7569:
                return AbstractC62145Rzs.A00(s);
            case 7574:
                return s != 6963 ? s != 8329 ? s == 9564 ? "SELLER_OFFERS_CANCEL_OFFER" : "UNDEFINED_QPL_EVENT" : "SELLER_OFFERS_EDIT_OFFER" : "SELLER_OFFERS_CREATE_OFFER";
            case 7578:
                return s == 12554 ? "FBLEARNER_FLOW_PRE_TRAINER_INIT" : "UNDEFINED_QPL_EVENT";
            case 7598:
                return s == 2657 ? "WEARABLE_EQ_APP_START" : "UNDEFINED_QPL_EVENT";
            case 7614:
                return AbstractC61977Rwn.A00(s);
            case 7615:
                return s == 1 ? "COMMUNITY_MESSAGING_HIGHLIGHTS_ANDROID_COMMUNITY_HIGHLIGHTS_LOAD" : "UNDEFINED_QPL_EVENT";
            case 7657:
                return AbstractC62152Rzz.A00(s);
            case 7663:
                return AbstractC61938RwA.A00(s);
            case 7666:
                return s == 9870 ? "WA_PRELINK_TTRC_BLOKS_TTRC" : "UNDEFINED_QPL_EVENT";
            case 7674:
                return s == 11732 ? "MOBILE_NETWORK_STACK_CONNECT_CALLS_CONNECT_CALL" : "UNDEFINED_QPL_EVENT";
            case 7675:
                return s != 4367 ? s == 5197 ? "CONTENT_INJECTION_MPL_VIDEO_UPLOAD" : "UNDEFINED_QPL_EVENT" : "CONTENT_INJECTION_MPL_MEDIA_LIBRARY_LOAD";
            case 7711:
                return s != 12046 ? s == 15787 ? "RP_POLLS_POLL_TEMPLATE_SHARE" : "UNDEFINED_QPL_EVENT" : "RP_POLLS_INCALL_POLLS_CLOSE";
            case 7715:
                return s != 1077 ? s == 14768 ? "OCULUS_TAIL_LOAD_TAIL_LOAD_FCRT" : "UNDEFINED_QPL_EVENT" : "OCULUS_TAIL_LOAD_TAIL_LOAD_ALL";
            case 7719:
                return s != 2631 ? s == 3179 ? "IG_DIRECT_IRIS_IRIS_SUBSCRIPTION_FLOW" : "UNDEFINED_QPL_EVENT" : "IG_DIRECT_IRIS_IRIS_SUBSCRIPTION_ATTEMPT";
            case 7720:
                return AbstractC61904Rvc.A00(s);
            case 7725:
                return s == 15755 ? "REACT_NATIVE_TOUCH_RESPONSIVENESS_TOUCH_RESPONSIVENESS_REACT_NATIVE" : "UNDEFINED_QPL_EVENT";
            case 7732:
                return s == 15280 ? "COMMERCE_EXPLORE_FEED_EXPLORE_FEED_TTRC" : "UNDEFINED_QPL_EVENT";
            case 7742:
                return AbstractC62083Rys.A00(s);
            case 7744:
                return s == 7889 ? "TOFU_API_TIME_SINCE_SINGLE_POINT_TIME_SINCE" : "UNDEFINED_QPL_EVENT";
            case 7761:
                return AbstractC61829RuN.A00(s);
            case 7777:
                return s != 1680 ? s != 2080 ? s == 11898 ? "SGX_STORIES_PHONE_TO_GLASSES_WARM_START" : "UNDEFINED_QPL_EVENT" : "SGX_STORIES_PHONE_TO_GLASSES_COLD_START" : "SGX_STORIES_VIDEO_CAPTURE_SESSION";
            case 7794:
                return S0H.A00(s);
            case 7811:
                return s != 7085 ? s == 12821 ? "MAPS_DRAWER_MAPS_DRAWER_TTRC" : "UNDEFINED_QPL_EVENT" : "MAPS_DRAWER_MAPS_DRAWER";
            case 7816:
                return s != 2903 ? s == 4108 ? "FBLITE_VIDEO_CACHE_VIDEO_CACHE_EVICTION" : "UNDEFINED_QPL_EVENT" : "FBLITE_VIDEO_CACHE_CACHE_OPERATION";
            case 7817:
                return s != 3864 ? s == 3930 ? "COSMO_PLAYER_TARGET_PLATFORM_START" : "UNDEFINED_QPL_EVENT" : "COSMO_PLAYER_APP_START";
            case 7820:
                return AbstractC61855Run.A00(s);
            case 7828:
                return s != 6817 ? s != 10986 ? s == 13182 ? "WEARABLE_MCU_POWER_POWER_SOC_OFF_EVENT" : "UNDEFINED_QPL_EVENT" : "WEARABLE_MCU_POWER_POWER_AOD_VIEW_CHANGE_EVENT" : "WEARABLE_MCU_POWER_POWER_SOC_ON_EVENT";
            case 7833:
                return s != 8812 ? s == 11587 ? "MEMORIES_AI_BACKDROP_MIDCARD_DOWNLOAD_MEDIA" : "UNDEFINED_QPL_EVENT" : "MEMORIES_AI_BACKDROP_MIDCARD_LAUNCH_EDITOR_ACTION";
            case 7842:
                return s == 11900 ? "RTC_BATTERY_RTC_BATTERY_IN_CALL_PERF" : "UNDEFINED_QPL_EVENT";
            case 7860:
                return AbstractC62042Rxq.A00(s);
            case 7864:
                return s == 16078 ? "IG_ANDROID_MEDIA_CODEC_CAPABILITY_MEDIA_CODEC_CAPABILITY" : "UNDEFINED_QPL_EVENT";
            case 7865:
                return s == 12553 ? "BUSINESS_COMMUNITY_IG_COMMENT_DETAIL_VIEW_TTRC" : "UNDEFINED_QPL_EVENT";
            case 7885:
                return AbstractC61862Ruu.A00(s);
            case 7886:
                return s == 1 ? "FORCED_FLOWS_PERF_FORCED_FLOW_PERF_STARTUP" : "UNDEFINED_QPL_EVENT";
            case 7895:
                return s != 1014 ? s == 13184 ? "ACTIONABLE_INSIGHTS_PORTAL_PERF_TEST_INITIAL_LOAD" : "UNDEFINED_QPL_EVENT" : "ACTIONABLE_INSIGHTS_PORTAL_PERF_TEST_AI_PORTAL_INITIAL_LOAD_CPP";
            case 7904:
                return s == 3233 ? "TOFU_AD_ACCOUNTS_API_FETCH" : "UNDEFINED_QPL_EVENT";
            case 7907:
                return s == 15200 ? "WEARABLE_SPEECHTOTEXT_APP_START" : "UNDEFINED_QPL_EVENT";
            case 7918:
                return AbstractC61974Rwk.A00(s);
            case 7957:
                return s == 12811 ? "LABYRINTH_WEB_RESTORE" : "UNDEFINED_QPL_EVENT";
            case 7973:
                return AbstractC62063RyY.A00(s);
            case 7988:
                return s != 5466 ? s == 11342 ? "MSYS_DB_TRUNCATION_CONTACT_TRUNCATION" : "UNDEFINED_QPL_EVENT" : "MSYS_DB_TRUNCATION_MESSAGE_TRUNCATION";
            case 7993:
                return s == 9476 ? "MESSENGER_INBOX_ADS_TTRC_MESSENGER_ANDROID_INBOX_ADS_TTRC" : "UNDEFINED_QPL_EVENT";
            case 7999:
                return s == 1 ? "CLOUD_GAMING_SERVICES_NEGOTIATE_SDP" : "UNDEFINED_QPL_EVENT";
            case 8002:
                return s == 6185 ? "ACT_MEDIA_DOWNLOAD_PRE_ACT_MEDIA_SEND" : "UNDEFINED_QPL_EVENT";
            case 8039:
                return AbstractC62144Rzr.A00(s);
            case 8053:
                return s == 3893 ? "WP_WWW_ADMIN_PLUGINS_PERMISSION_PEOPLE" : "UNDEFINED_QPL_EVENT";
            case 8057:
                return s == 15893 ? "GENAI_IMAGINE_EMU_FLASH_EMU_FLASH_PREVIEW_IMAGE_FETCH" : "UNDEFINED_QPL_EVENT";
            case 8061:
                return s == 9328 ? "SHOPPING_RECONSIDERATION_SHOPPING_RECON_DESTINATION_TTI" : "UNDEFINED_QPL_EVENT";
            case 8063:
                return AbstractC62024RxY.A00(s);
            case 8065:
                return s != 13105 ? s == 15290 ? "MIW_USER_FLOW_THREAD_VIEW_LOADING" : "UNDEFINED_QPL_EVENT" : "MIW_USER_FLOW_MIW_INBOX_LOAD_TILL_UI_DISPLAY";
            case 8103:
                return AbstractC61859Rur.A00(s);
            case 8139:
                return s == 3298 ? "QUICK_PROMOTION_MOBILE_ERRORS_QP_GENERAL_MOBILE_ERROR" : "UNDEFINED_QPL_EVENT";
            case 8144:
                return s != 6646 ? s != 11515 ? s != 12253 ? s != 15326 ? s == 15579 ? "IG_ANDROID_ATTESTATION_PLAY_INTEGRITY_API_USAGE_SUCCESS" : "UNDEFINED_QPL_EVENT" : "IG_ANDROID_ATTESTATION_PLAY_INTEGRITY_API_USAGE_FAIL" : "IG_ANDROID_ATTESTATION_PLAY_INTEGRITY_CLIENT_CONTINUOUS" : "IG_ANDROID_ATTESTATION_PLAY_INTEGRITY_REQUEST_TOKEN" : "IG_ANDROID_ATTESTATION_KEYSTORE_CLIENT_CONTINUOUS";
            case 8146:
                return s != 1 ? s != 3563 ? s != 4021 ? s == 13870 ? "BIZAPP_ANDROID_INFRASTRUCTURE_ERROR_REMEDIATION" : "UNDEFINED_QPL_EVENT" : "BIZAPP_ANDROID_INFRASTRUCTURE_BACKGROUND_CACHE_WRITE" : "BIZAPP_ANDROID_INFRASTRUCTURE_CACHE_OPERATION" : "BIZAPP_ANDROID_INFRASTRUCTURE_MEMCACHE_UPDATE";
            case 8163:
                return S0U.A00(s);
            case 8184:
                return s != 8780 ? s != 11743 ? s == 12514 ? "RP_AUDIO_RESILIENCE_AUDIO_DUPLICATION_ACTIVE" : "UNDEFINED_QPL_EVENT" : "RP_AUDIO_RESILIENCE_AUDIO_INBAND_FEC" : "RP_AUDIO_RESILIENCE_AUDIO_DUPLICATION";
            case 8203:
                return S07.A00(s);
            case 8205:
                return s != 6177 ? s != 7579 ? s != 11332 ? s != 12242 ? s == 15204 ? "CAA_NATIVE_INFRA_FX_OPEN_SYNC_SCREEN" : "UNDEFINED_QPL_EVENT" : "CAA_NATIVE_INFRA_LOGIN_KEYSTORE_ATTESTATION" : "CAA_NATIVE_INFRA_KEYSTORE_KEY_GENERATION" : "CAA_NATIVE_INFRA_LOGIN_SCREEN_LOAD" : "CAA_NATIVE_INFRA_FX_PUSH_SYNC_SCREEN";
            case 8219:
                return s != 14238 ? s == 15167 ? "RTC_SIGNALING_INCOMING" : "UNDEFINED_QPL_EVENT" : "RTC_SIGNALING_OUTGOING";
            case 8234:
                return s != 1499 ? s == 14088 ? "IG_ANDROID_VIEWPAGER_PERF_BIND_VIEW" : "UNDEFINED_QPL_EVENT" : "IG_ANDROID_VIEWPAGER_PERF_CREATE_VIEW";
            case 8243:
                return s == 1 ? "EXPLORE_EXPLORE_SURFACE_TTRC" : "UNDEFINED_QPL_EVENT";
            case 8255:
                return s == 9407 ? "PLAYBACK_MANAGED_MOBILE_ERRORS_PLAYER_CONFIG_ERRORS" : "UNDEFINED_QPL_EVENT";
            case 8269:
                return s != 11011 ? s == 14792 ? "IG_APPRECIATION_ANDROID_QUERY_GIFTS" : "UNDEFINED_QPL_EVENT" : "IG_APPRECIATION_ANDROID_GIFTING_UPDATE_BALANCE";
            case 8287:
                return s == 16243 ? "FEED_INLINE_MESSENGER_SUGGESTIONS_INLINE_SUGGESTIONS_FETCH_FUNNEL" : "UNDEFINED_QPL_EVENT";
            case 8295:
                return AbstractC62007RxH.A00(s);
            case 8307:
                return AbstractC62018RxS.A00(s);
            case 8381:
                return s != 2981 ? s != 6549 ? s != 8500 ? s == 10999 ? "PLATFORM_PROMISE_METRICS_PLATFORM_METRICS_SEND_DUMMY" : "UNDEFINED_QPL_EVENT" : "PLATFORM_PROMISE_METRICS_SEND_TO_SENT" : "PLATFORM_PROMISE_METRICS_TIME_TO_ONLINE" : "PLATFORM_PROMISE_METRICS_TIME_TO_CONTENT";
            case 8399:
                return s != 10381 ? s == 14426 ? "NOTIFICATION_RELIABILITY_OM_NOTIFICATION_RELIABILITY" : "UNDEFINED_QPL_EVENT" : "NOTIFICATION_RELIABILITY_OM_NOTIFICATION_RELIABILITY_SYNC_PATH";
            case 8411:
                return s == 14936 ? "SINGLE_ACTIVITY_NAVIGATION_STACK_SANS_UNEXPECTED_EVENT" : "UNDEFINED_QPL_EVENT";
            case 8415:
                return AbstractC62119RzS.A00(s);
            case 8423:
                return s != 4794 ? s != 5767 ? s != 6513 ? s != 8663 ? s == 8947 ? "WEARABLE_STATIC_CONTENT_WEARABLE_STATIC_CONTENT_MEDIA_CACHING_WRITE" : "UNDEFINED_QPL_EVENT" : "WEARABLE_STATIC_CONTENT_WEARABLE_STATIC_CONTENT_MEDIA_CACHING_CLEAR" : "WEARABLE_STATIC_CONTENT_WEARABLE_STATIC_CONTENT_MEDIA_CACHING_SCHEDULED_CLEANUP" : "WEARABLE_STATIC_CONTENT_WEARABLE_STATIC_CONTENT_MEDIA_CACHING_READ" : "WEARABLE_STATIC_CONTENT_WEARABLE_STATIC_CONTENT_MEDIA_CACHING_LOAD";
            case 8427:
                return s != 1 ? s == 2 ? "WARM_START_PERSONALIZATION_LABEL_TIME" : "UNDEFINED_QPL_EVENT" : "WARM_START_PERSONALIZATION_DECISION_TIME";
            case 8431:
                return AbstractC62140Rzn.A00(s);
            case 8451:
                return s != 5674 ? s != 13253 ? s == 15974 ? "PYTORCH_MODEL_DELIVERY_MODEL_METADATA_LOAD_STATS_MSYS" : "UNDEFINED_QPL_EVENT" : "PYTORCH_MODEL_DELIVERY_MODEL_LOAD_STATS" : "PYTORCH_MODEL_DELIVERY_MODEL_ASSET_DOWNLOAD_STATS_MSYS";
            case 8457:
                return s != 2414 ? s != 11195 ? s != 12896 ? s == 13695 ? "WHATSAPP_CAMERA_INIT_CAMERA" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_CAMERA_SWITCH_CAMERA" : "WHATSAPP_CAMERA_CAPTURE_VIDEO" : "WHATSAPP_CAMERA_CAPTURE_PHOTO";
            case 8492:
                return s == 1814 ? "IG_REELS_ANDROID_ADS_RENDERING_PERF_IG_REELS_ANDROID_ADS_CTA_TRANSITION_STATE" : "UNDEFINED_QPL_EVENT";
            case 8524:
                return AbstractC61832RuQ.A00(s);
            case 8531:
                return s == 1348 ? "WP_WWW_KNOWLEDGE_LIBRARY_TEST_V" : "UNDEFINED_QPL_EVENT";
            case 8564:
                return s == 1 ? "DISTRIBGW_LOAD_SHEDDING_STREAM_GROUP_LOAD_SHEDDING" : "UNDEFINED_QPL_EVENT";
            case 8575:
                return s == 7083 ? "NOTIFICATION_MOBILE_ERRORS_E2E_LOGGING_ERROR" : "UNDEFINED_QPL_EVENT";
            case 8606:
                return AbstractC62033Rxh.A00(s);
            case 8611:
                return AbstractC62026Rxa.A00(s);
            case 8612:
                return s == 5726 ? "FB_LOTTIE_CREATE" : "UNDEFINED_QPL_EVENT";
            case 8634:
                return s == 14563 ? "MSYS_SDK_PERF_MAILBOX_API_STATS" : "UNDEFINED_QPL_EVENT";
            case 8648:
                return s != 6843 ? s != 13618 ? s == 15640 ? "IG_TOUCH_RESPONSIVENESS_TOUCH_RESPONSIVENESS_TRACE_COLLECTION" : "UNDEFINED_QPL_EVENT" : "IG_TOUCH_RESPONSIVENESS_THREAD_BASED_TOUCH_RESPONSIVENESS_ANDROID" : "IG_TOUCH_RESPONSIVENESS_TOUCH_RESPONSIVENESS_ANDROID";
            case 8678:
                return s != 5593 ? s == 9721 ? "ACTION_BAR_CONFIGURE_ACTION_BAR" : "UNDEFINED_QPL_EVENT" : "ACTION_BAR_BASE_CONFIGURE_FRAGMENT";
            case 8701:
                return s == 1 ? "WHATSAPP_VOICENOTE_RECORD_WHATSAPP_VOICENOTE_RECORD" : "UNDEFINED_QPL_EVENT";
            case 8717:
                return s == 8976 ? "VIDEOML_ML_WORKFLOW" : "UNDEFINED_QPL_EVENT";
            case 8720:
                return AbstractC62002RxC.A00(s);
            case 8741:
                return s != 6280 ? s != 10002 ? s == 15361 ? "RP_COPRESENCE_THREAD_HEADER_FUNNEL" : "UNDEFINED_QPL_EVENT" : "RP_COPRESENCE_CO_PRESENCE_PILL" : "RP_COPRESENCE_IG_THREAD_CO_PRESENCE";
            case 8744:
                return s != 5118 ? s == 7783 ? "FOA_KEYSTORE_ATTESTATION_PLAY_INTEGRITY_ATTESTATION" : "UNDEFINED_QPL_EVENT" : "FOA_KEYSTORE_ATTESTATION_KEYSTORE_ATTESTATION";
            case 8754:
                return s != 2557 ? s != 4922 ? s != 6855 ? s != 8163 ? s == 14873 ? "FB_MOBILE_FEED_CAROUSEL_ADS_CAROUSEL_MULTISHARE_ITEM_IMP_EVENT_SUCCESS" : "UNDEFINED_QPL_EVENT" : "FB_MOBILE_FEED_CAROUSEL_ADS_FB_MOBILE_FEED_CAROUSEL_ADS_NATIVE_CARD_RENDER" : "FB_MOBILE_FEED_CAROUSEL_ADS_FB_MOBILE_FEED_CAROUSEL_ADS_BLOKS_CARD_RENDER" : "FB_MOBILE_FEED_CAROUSEL_ADS_FB_MOBILE_FEED_CAROUSEL_ADS_MULTISHARE_ITEM_IMP_SWIPE_EVENT_SUCCESS" : "FB_MOBILE_FEED_CAROUSEL_ADS_FB_MOBILE_FEED_CAROUSEL_ADS_MULTISHARE_ITEM_IMP_SWIPE_EVENT";
            case 8761:
                return s != 8967 ? s != 9599 ? s != 13198 ? s == 14252 ? "MWB_SUPPORT_INCLUSION_HW_BADGE_TIME_TO_SCAN_PENDING_INBOX" : "UNDEFINED_QPL_EVENT" : "MWB_SUPPORT_INCLUSION_HW_BADGE_OVERALL_TIME_TO_LOAD_AND_SCAN_PENDING_INBOX" : "MWB_SUPPORT_INCLUSION_HW_BADGE_TIME_TO_LOAD_PENDING_INBOX" : "MWB_SUPPORT_INCLUSION_RENDER_SAFETY_NOTICE";
            case 8827:
                return s != 4543 ? s != 7055 ? s != 9396 ? s != 10774 ? s == 12868 ? "WHATSAPP_PHOENIX_PHOENIX_FDS_IQ_EXECUTION" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_PHOENIX_WHATSAPP_BLOKS" : "WHATSAPP_PHOENIX_INIT_STATE_MACHINE" : "WHATSAPP_PHOENIX_STATE_EXECUTION" : "WHATSAPP_PHOENIX_BLOKS_PREFETCH";
            case 8843:
                return s != 5138 ? s != 10073 ? s == 10820 ? "WHATSAPP_COMMUNITY_WHATSAPP_COMMUNITY_MEMBER_LOADING" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_COMMUNITY_WHATSAPP_COMMUNITY_HOME_OPEN_TIME" : "WHATSAPP_COMMUNITY_WHATSAPP_COMMUNITY_CAG_OPEN_TIME";
            case 8845:
                return s != 3832 ? s != 5600 ? s != 12427 ? s == 15791 ? "AVATAR_RTC_AVATAR_PRESET_EFFECTS_DELIVERED" : "UNDEFINED_QPL_EVENT" : "AVATAR_RTC_PREFETCH_EFFECT_METADATA" : "AVATAR_RTC_AVATAR_RECORDING_COMPLETED" : "AVATAR_RTC_APPLY_AVATAR_EFFECT";
            case 8871:
                return s == 15833 ? "FBLITE_CLIENT_DNS_DNS_RESOLUTION" : "UNDEFINED_QPL_EVENT";
            case 8881:
                return s != 1 ? s == 2 ? "OCULUS_WEB_NAVIGATION" : "UNDEFINED_QPL_EVENT" : "OCULUS_WEB_INITIAL_LOAD";
            case 8887:
                return S0L.A00(s);
            case 8891:
                return s == 13908 ? "FB_REELS_VIDEO_TOOLS_CLIP_LIBRARY_CLIP_IMPORT_TTI" : "UNDEFINED_QPL_EVENT";
            case 8896:
                return s == 10256 ? "PRIVACY_CONTENT_CONTROL_PERFORMANCE_ACTIVITY_LOG_PAGE_LOAD_TTRC" : "UNDEFINED_QPL_EVENT";
            case 8913:
                return AbstractC62055RyQ.A00(s);
            case 8916:
                return s != 7110 ? s == 7164 ? "WHATSAPP_COMPANION_LINKING" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_COMPANION_REGISTRATION";
            case 8921:
                return s != 2075 ? s == 6997 ? "IGD_VISUAL_MEDIA_CONSUMPTION_LATENCY" : "UNDEFINED_QPL_EVENT" : "IGD_VISUAL_MEDIA_GALLERY";
            case 8929:
                return s != 6542 ? s != 6851 ? s != 8876 ? s == 14796 ? "IG_CAMERA_CRITICAL_POST_CAP_LOAD" : "UNDEFINED_QPL_EVENT" : "IG_CAMERA_CRITICAL_SHARE_SHEET_LOAD" : "IG_CAMERA_CRITICAL_GALLERY_LOAD" : "IG_CAMERA_CRITICAL_CTTO";
            case 8942:
                return AbstractC62041Rxp.A00(s);
            case 8944:
                return s != 1622 ? s != 5711 ? s != 6567 ? s != 9635 ? s == 13218 ? "BIZSUITE_SERVER_WALL_TIME_WWW_GRAPHQL" : "UNDEFINED_QPL_EVENT" : "BIZSUITE_SERVER_WALL_TIME_INVITER_MUTATION" : "BIZSUITE_SERVER_WALL_TIME_TOFU" : "BIZSUITE_SERVER_WALL_TIME_ADS" : "BIZSUITE_SERVER_WALL_TIME_POST_CREATION";
            case 8958:
                return s == 4119 ? "IG_BULLYING_COMMENT_FUNNEL_COMMENT_FUNNEL" : "UNDEFINED_QPL_EVENT";
            case 8988:
                return s != 2446 ? s != 10313 ? s == 13572 ? "DEVICE_STORAGE_SETTINGS_UX_THREAD_MANAGER" : "UNDEFINED_QPL_EVENT" : "DEVICE_STORAGE_SETTINGS_UX_DEVICE_STORAGE_SETTINGS" : "DEVICE_STORAGE_SETTINGS_UX_MEDIA_GALLERY";
            case 9005:
                return s == 8270 ? "XR_ANCHORS_XR_ANCHORS_SHARING" : "UNDEFINED_QPL_EVENT";
            case 9025:
                return s != 2033 ? s != 12649 ? s == 16349 ? "FB_AUDIO_SHARING_FB_AUDIO_SHARING_FULL_PROCESS" : "UNDEFINED_QPL_EVENT" : "FB_AUDIO_SHARING_FB_AUDIO_SHARING_TRANSCRIPTION_REQUEST" : "FB_AUDIO_SHARING_FB_AUDIO_SHARING_AUDIO_EXTRACTION";
            case 9034:
                return AbstractC62139Rzm.A00(s);
            case 9053:
                return AbstractC61934Rw6.A00(s);
            case 9059:
                return AbstractC72557Xgd.A00(s);
            case 9065:
                return RvV.A00(s);
            case 9076:
                return s == 9886 ? "WORK_SUITE_PAE_GRAPHQL_PAE_WWW" : "UNDEFINED_QPL_EVENT";
            case 9099:
                return AbstractC62142Rzp.A00(s);
            case 9106:
                return s == 2557 ? "WHATSAPP_BUSINESS_CORE_WHATSAPP_VERIFIED_NAME" : "UNDEFINED_QPL_EVENT";
            case 9137:
                return s != 4991 ? s == 14637 ? "WEARABLE_UPDATER_OTA_UPDATE" : "UNDEFINED_QPL_EVENT" : "WEARABLE_UPDATER_COLD_START";
            case 9144:
                return s != 6142 ? s != 6654 ? s != 7234 ? s == 7448 ? "MSYS_NETWORK_UPLOAD" : "UNDEFINED_QPL_EVENT" : "MSYS_NETWORK_DOWNLOAD" : "MSYS_NETWORK_STREAMING_UPLOAD" : "MSYS_NETWORK_DATA_TASK";
            case 9166:
                return AbstractC61992Rx2.A00(s);
            case 9167:
                return AbstractC61918Rvq.A00(s);
            case 9174:
                return s != 6199 ? s != 8841 ? s != 9798 ? s == 14812 ? "IGD_EPHEMERAL_ERRORS_UNEXPECTED_EXPIRATION_CONDITION" : "UNDEFINED_QPL_EVENT" : "IGD_EPHEMERAL_ERRORS_DISAPPEARING_MESSAGE_INVALID_DELETION_SCHEDULE" : "IGD_EPHEMERAL_ERRORS_DISAPPEARING_MESSAGE_INVALID_EXPIRY_SCHEDULE" : "IGD_EPHEMERAL_ERRORS_INVALID_EXPIRATION_SCHEDULE_ANDROID";
            case 9192:
                return s != 9283 ? s == 12438 ? "FBLITE_RP_OPEN_CALL_SCREEN_FOR_OUTGOING_CALL" : "UNDEFINED_QPL_EVENT" : "FBLITE_RP_TIME_TO_RING";
            case 9203:
                return s != 2743 ? s != 2918 ? s != 5440 ? s != 10000 ? s == 11342 ? "WORKPLACE_VC_DESKTOP_GRID_COMBINED_RESIZE" : "UNDEFINED_QPL_EVENT" : "WORKPLACE_VC_DESKTOP_GRID_COMBINED_CHANGE_LAYOUT" : "WORKPLACE_VC_DESKTOP_SELF_VIEW_MOVE_TO_GRID" : "WORKPLACE_VC_DESKTOP_MINI_VIEW_INTERACTIONS" : "WORKPLACE_VC_DESKTOP_SELF_VIEW_FLOAT";
            case 9216:
                return s != 2630 ? s == 15685 ? "IG_AVATAR_ODR_SNAPSHOT_IG_AVATAR_ODR_SNAPSHOT" : "UNDEFINED_QPL_EVENT" : "IG_AVATAR_ODR_SNAPSHOT_CACHE_UNEXPECTED_EVENT";
            case 9253:
                return s == 12893 ? "MNS_QUIC_QUIC_TO_CHATD" : "UNDEFINED_QPL_EVENT";
            case 9265:
                return AbstractC62091Rz0.A00(s);
            case 9280:
                return s != 3745 ? s != 8179 ? s != 10841 ? s != 14200 ? s == 15850 ? "REPLY_TO_AUTHOR_NOTIFICATION_TO_PERMALINK_TTRC" : "UNDEFINED_QPL_EVENT" : "REPLY_TO_AUTHOR_REPLY_TO_AUTHOR_NOTIF_FUNNEL" : "REPLY_TO_AUTHOR_COMPOSER_FLOW_TTRC" : "REPLY_TO_AUTHOR_POST_PRIVATE_REPLIES_AUTHOR_FUNNEL" : "REPLY_TO_AUTHOR_REPLY_TO_AUTHOR_SENDER_FUNNEL";
            case 9284:
                return s == 11992 ? "FBLITE_SWIPE_TO_BOOKMARKS_SWIPE" : "UNDEFINED_QPL_EVENT";
            case 9286:
                return s == 7000 ? "BUSINESS_ACCOUNTS_PERMISSIONS_INVITE_USERS_TO_BUSINESS_PORTFOLIO" : "UNDEFINED_QPL_EVENT";
            case 9306:
                return AbstractC61897RvT.A00(s);
            case 9311:
                return s != 4004 ? s == 6098 ? "MSGR_MEMORIES_MEMORY_VIEWER_LAUNCH" : "UNDEFINED_QPL_EVENT" : "MSGR_MEMORIES_MEMORY_POG";
            case 9319:
                return AbstractC61893RvP.A00(s);
            case 9339:
                return s == 11740 ? "UNIFIED_TAX_CACHE_SERVICE_HANDLE_REQUEST" : "UNDEFINED_QPL_EVENT";
            case 9358:
                return s != 8065 ? s != 11050 ? s == 11882 ? "IG_STACKED_TIMELINE_IG_ANDROID_STACKED_TIMELINE_VOICEOVER" : "UNDEFINED_QPL_EVENT" : "IG_STACKED_TIMELINE_LOAD_STACKED_TIMELINE" : "IG_STACKED_TIMELINE_TRIM_SEGMENT";
            case 9373:
                return s != 6345 ? s != 7150 ? s == 15207 ? "ADDRESS_BOOK_XCCU" : "UNDEFINED_QPL_EVENT" : "ADDRESS_BOOK_CCU_LEGACY" : "ADDRESS_BOOK_CCU";
            case 9394:
                return AbstractC61907Rvf.A00(s);
            case 9423:
                return s == 15862 ? "COMMUNITY_AWARDS_GIVER_SHEET_USER_FLOW" : "UNDEFINED_QPL_EVENT";
            case 9446:
                return AbstractC61868Rv0.A00(s);
            case 9448:
                return s == 12085 ? "NME_BLOKS_SCREENS_NME_BLOKS_SCREEN_TTI" : "UNDEFINED_QPL_EVENT";
            case 9456:
                return s != 6535 ? s == 11358 ? "IMAGINE_CREATE_GENERATE_FLASH_IMAGE" : "UNDEFINED_QPL_EVENT" : "IMAGINE_CREATE_BLOKS_SCREEN_OPEN";
            case 9470:
                return s == 16166 ? "IG_ANDROID_SSIM_VIDEO_SSIM" : "UNDEFINED_QPL_EVENT";
            case 9528:
                return s == 5017 ? "HORIZON_MR_INVITE_PANEL_PANEL_OPEN" : "UNDEFINED_QPL_EVENT";
            case 9539:
                return s != 11094 ? s == 13985 ? "MSGR_CREATE_STICKER_MSGR_CREATE_STICKER_QUERY_TTI" : "UNDEFINED_QPL_EVENT" : "MSGR_CREATE_STICKER_MSGR_IMAGE_DOWNLOAD_TTI";
            case 9557:
                return s == 12431 ? "TOFU_ASYNC_ENGINE_RUN" : "UNDEFINED_QPL_EVENT";
            case 9584:
                return s == 7773 ? "COMMERCE_PIVOTS_PIVOT_LATENCY" : "UNDEFINED_QPL_EVENT";
            case 9588:
                return s != 5111 ? s != 5483 ? s == 14883 ? "MESSENGER_SEARCH_ANDROID_SEARCH_DATA_FETCHER_LATENCY" : "UNDEFINED_QPL_EVENT" : "MESSENGER_SEARCH_ANDROID_TIME_TO_INTERACTION" : "MESSENGER_SEARCH_ANDROID_THREAD_PERF";
            case 9589:
                return s != 9119 ? s == 15752 ? "VIDEO_TEMPLATE_SYSTEM_FB4A_VTS_GENERATION_TTRC" : "UNDEFINED_QPL_EVENT" : "VIDEO_TEMPLATE_SYSTEM_FB4A_VTS_RESYNCING_TTRC";
            case 9590:
                return s == 6953 ? "IG_ANDROID_EXECUTOR_IG_BACKGROUND_TASKS" : "UNDEFINED_QPL_EVENT";
            case 9606:
                return s == 13203 ? "IG_SUNDIAL_SAPIENZ_IG_SUNDIAL_SAPIENZ_CORE" : "UNDEFINED_QPL_EVENT";
            case 9616:
                return s != 5569 ? s != 9627 ? s != 10798 ? s == 13646 ? "IG_REELS_ADS_TIMELINE_LIFECYCLE" : "UNDEFINED_QPL_EVENT" : "IG_REELS_ADS_TIMELINE_NON_TIMELINE_VIEWPOINT_ACTION_USAGE_ERROR_DEBUG" : "IG_REELS_ADS_TIMELINE_IG_REELS_ADS_TIMELINE_ERROR" : "IG_REELS_ADS_TIMELINE_START_TIMELINE";
            case 9623:
                return s == 4378 ? "OCULUS_STORE_DISCOVERY_LANDING" : "UNDEFINED_QPL_EVENT";
            case 9630:
                return Ry6.A00(s);
            case 9645:
                return s != 3402 ? s != 5242 ? s == 12294 ? "RP_VIDEO_RRR_P2P_MESSAGE_SEND" : "UNDEFINED_QPL_EVENT" : "RP_VIDEO_RRR_P2P_MESSAGE_RECEIVE" : "RP_VIDEO_VIDEO_RENDER_FRAMES_DROPPED";
            case 9653:
                return s == 7640 ? "FB_PROD_PERF_IMAGE_CONTENT_VISIBILITY_UPDATE_ANDROID" : "UNDEFINED_QPL_EVENT";
            case 9664:
                return s == 7999 ? "VIDEO_CSR_CSR_LOAD_END_TO_END_IOS_REELS" : "UNDEFINED_QPL_EVENT";
            case 9668:
                return s == 1 ? "PORTAL_MULTITAP_LOGGING_MULTIPLE_TAP" : "UNDEFINED_QPL_EVENT";
            case 9685:
                return s == 1 ? "FBLITE_MSYS_MAILBOX_LIFECYCLE_MSYS_MAILBOX_CREATED" : "UNDEFINED_QPL_EVENT";
            case 9698:
                return AbstractC61912Rvk.A00(s);
            case 9701:
                return s != 1 ? s == 2 ? "GPS_ARA_VIEW_REGISTRATION" : "UNDEFINED_QPL_EVENT" : "GPS_ARA_CLICK_REGISTRATION";
            case 9715:
                return s == 15010 ? "TOFU_METRICS_QUERY_API_UNSAMPLED_FETCH" : "UNDEFINED_QPL_EVENT";
            case 9725:
                return s != 6607 ? s == 10393 ? "EXTERNAL_LINK_SHARE_URL_PARSER_FLOW_PARSE_URL" : "UNDEFINED_QPL_EVENT" : "EXTERNAL_LINK_SHARE_URL_PARSER_FLOW_FETCH_FIRST_URL";
            case 9731:
                return s == 4272 ? "ENCRYPTED_BACKUPS_WRITE_MESSAGE_PERSIST" : "UNDEFINED_QPL_EVENT";
            case 9732:
                return s != 6247 ? s == 14643 ? "FX_LINKING_MERGE_FLOW_LINKING_ADD_PROFILES_DISCLOSURE_SCREEN_LOAD" : "UNDEFINED_QPL_EVENT" : "FX_LINKING_MERGE_FLOW_LINKING_ADD_PROFILE_CONFIRMATION_SCREEN_LOAD";
            case 9754:
                return s != 1 ? s == 2 ? "IGD_ACTIVE_NOW_TRAY_VIEW_ACTIVE_NOW_TRAY_SHUFFLE" : "UNDEFINED_QPL_EVENT" : "IGD_ACTIVE_NOW_TRAY_VIEW_ACTIVE_NOW_TRAY_TTRC";
            case 9762:
                return s == 1136 ? "IG_ANDROID_INGEST_BANDWIDTH_BANDWIDTH" : "UNDEFINED_QPL_EVENT";
            case 9763:
                return s != 11032 ? s == 16202 ? "NEWSFEED_ATTACHMENT_CRASH_RESILIENCY_MOUNT_UNMOUNT" : "UNDEFINED_QPL_EVENT" : "NEWSFEED_ATTACHMENT_CRASH_RESILIENCY_IMPRESSION";
            case 9765:
                return AbstractC61828RuM.A00(s);
            case 9773:
                return s != 7323 ? s == 13067 ? "GAMING_COPLAY_COPLAY_FUNNEL" : "UNDEFINED_QPL_EVENT" : "GAMING_COPLAY_COPLAY_EFFICIENCY_LOGGER";
            case 9778:
                return s == 13363 ? "INSTAGRAM_FACT_CHECKED_CONTENT_CONTROL_TPFC_SETTING_FUNNEL" : "UNDEFINED_QPL_EVENT";
            case 9832:
                return s == 4288 ? "IG_ANDROID_SSIM_WEBP_SSIM_IMAGE_METRICS" : "UNDEFINED_QPL_EVENT";
            case 9841:
                return s == 7095 ? "TEST_KAI_LI_TEST_NEW_EVENT_2" : "UNDEFINED_QPL_EVENT";
            case 9842:
                return s != 15886 ? s == 31123 ? "MOBILECONFIG_SERVICE_GET_API" : "UNDEFINED_QPL_EVENT" : "MOBILECONFIG_SERVICE_SUBSCRIBE_API";
            case 9846:
                return s == 4406 ? "UI_TOOLBOX_INIT" : "UNDEFINED_QPL_EVENT";
            case 9850:
                return s != 4718 ? s != 7489 ? s != 7788 ? s == 8069 ? "ALOHA_USER_MANAGEMENT_FUNNEL_ALOHA_OOBE_IDENTITY_FUNNEL_EVENT2" : "UNDEFINED_QPL_EVENT" : "ALOHA_USER_MANAGEMENT_FUNNEL_ALOHA_ADD_OWNER_FUNNEL_EVENT" : "ALOHA_USER_MANAGEMENT_FUNNEL_ALOHA_ADD_ACCOUNT_FUNNEL_EVENT" : "ALOHA_USER_MANAGEMENT_FUNNEL_ALOHA_ACCOUNTS_REMOVAL_FUNNEL_EVENT";
            case 9864:
                return AbstractC61942RwE.A00(s);
            case 9869:
                return s == 12413 ? "MSYS_SCALING_METRICS_BURNER_LOAD_TESTING" : "UNDEFINED_QPL_EVENT";
            case 9892:
                return AbstractC62072Ryh.A00(s);
            case 9894:
                return s != 11060 ? s == 11864 ? "WEARABLE_AVATAR_AVATAR_ASSET_FETCH_JOB_SERVICE_RUN" : "UNDEFINED_QPL_EVENT" : "WEARABLE_AVATAR_WEARABLE_AVATAR_ASSET_DOWNLOAD";
            case 9905:
                return s == 13321 ? "MAILBOX_SDK_API_HEALTH_METRICS_MESSAGING_BLOBS" : "UNDEFINED_QPL_EVENT";
            case 9916:
                return s == 13061 ? "WEARABLE_MCU_TRANSFER_SENDRAMFS" : "UNDEFINED_QPL_EVENT";
            case 9926:
                return s != 13599 ? s == 14422 ? "UX_UNIFICATION_PLAYER_UX_UNIFICATION_PLAYER_TOP_POSITION_FUNNEL" : "UNDEFINED_QPL_EVENT" : "UX_UNIFICATION_PLAYER_REELS_TOP_POSITION_FUNNEL";
            case 9947:
                return AbstractC62035Rxj.A00(s);
            case 9952:
                return AbstractC62125RzY.A00(s);
            case 9955:
                return s != 10909 ? s == 15178 ? "IG_BRANDED_CONTENT_IG_AD_ELIGIBILITY_VALIDATION_GRAPHQL_ERROR" : "UNDEFINED_QPL_EVENT" : "IG_BRANDED_CONTENT_IG_BRANDED_CONTENT_UNEXPECTED_CLIENT_EVENT";
            case 9973:
                return AbstractC61838RuW.A00(s);
            case 9981:
                return s == 1 ? "SOLOADER_LOAD_LIBRARY" : "UNDEFINED_QPL_EVENT";
            case 10000:
                return s == 26400 ? "ANDROID_ACCOUNT_SETTINGS_OPEN_ACCOUNT_SETTINGS" : "UNDEFINED_QPL_EVENT";
            case 10018:
                return AbstractC62133Rzg.A00(s);
            case 10019:
                return s != 5349 ? s == 11295 ? "UNIFIED_PRESENCE_INFRA_IG_PRESENCE_REAL_TIME_UPDATE" : "UNDEFINED_QPL_EVENT" : "UNIFIED_PRESENCE_INFRA_IG_PRESENCE_REPORTING";
            case 10041:
                return AbstractC61967Rwd.A00(s);
            case 10045:
                return s != 2533 ? s != 5634 ? s != 11412 ? s == 16074 ? "WORKPLACE_SHIFT_COVER_SHIFT_COVER_REVIEW_REQUEST_FLOW" : "UNDEFINED_QPL_EVENT" : "WORKPLACE_SHIFT_COVER_SHIFT_COVER_CANCEL_OFFER_COVER_FLOW" : "WORKPLACE_SHIFT_COVER_SHIFT_COVER_ATTACHMENT_DELETION" : "WORKPLACE_SHIFT_COVER_SHIFT_COVER_ATTACHMENT_CREATION";
            case 10054:
                return AbstractC62077Rym.A00(s);
            case 10056:
                return s != 5129 ? s != 11238 ? s == 14079 ? "RTC_MANAGED_MOBILE_ERRORS_GENERIC_ERROR" : "UNDEFINED_QPL_EVENT" : "RTC_MANAGED_MOBILE_ERRORS_SIGNALING_ERROR" : "RTC_MANAGED_MOBILE_ERRORS_NOTIFICATION_ERROR";
            case 10080:
                return s == 1183 ? "IG_AVATAR_CAMERA_IG_AVATARS_CAMERA_EFFECT_LOAD" : "UNDEFINED_QPL_EVENT";
            case 10083:
                return AbstractC62058RyT.A00(s);
            case 10085:
                return s == 9874 ? "NAZARE_APP_LAUNCH" : "UNDEFINED_QPL_EVENT";
            case 10087:
                return s != 1151 ? s == 11794 ? "XMP_GRAPH_GRAPH_IO_COUNTER" : "UNDEFINED_QPL_EVENT" : "XMP_GRAPH_NODE_IO_COUNTER";
            case 10130:
                return s != 3251 ? s != 8097 ? s != 15172 ? s == 15251 ? "DALMORE_CONNECT_TO_FIRST_FRAME" : "UNDEFINED_QPL_EVENT" : "DALMORE_RUNTIME_FIRST_FRAME_LATENCY" : "DALMORE_CODEC_AVATAR_DECRYPT" : "DALMORE_CODEC_AVATAR_DOWNLOAD";
            case 10173:
                return s == 2473 ? "FB_STORIES_LOGGING_CONSOLIDATION_ANDROID_STORY_CARD_TIMESPENT" : "UNDEFINED_QPL_EVENT";
            case 10189:
                return RyH.A00(s);
            case 10193:
                return s == 2238 ? "CREATION_DISTRIBUTION_PLATFORM_PLATFORM_ONLINE_VALIDATION" : "UNDEFINED_QPL_EVENT";
            case 10203:
                return AbstractC61919Rvr.A00(s);
            case 10231:
                return s != 3995 ? s != 5860 ? s == 6028 ? "MMA_MIXED_PERMISSIONS_VALIDATION_INFRA_VALIDATE_PAGE_ASSET_CLAIMING" : "UNDEFINED_QPL_EVENT" : "MMA_MIXED_PERMISSIONS_VALIDATION_INFRA_VALIDATE_ADD_DIRECT_USER_PERMITTED_USER" : "MMA_MIXED_PERMISSIONS_VALIDATION_INFRA_VALIDATE_ADD_DIRECT_USER_ADMIN_USER";
            case 10243:
                return s == 13272 ? "UNITY_SERVER_REQUESTS_UNITY_REQUEST" : "UNDEFINED_QPL_EVENT";
            case 10245:
                return s == 2121 ? "OCULUS_VOICE_SDK_VOICE_SDK_CLIENT_INTERACTION" : "UNDEFINED_QPL_EVENT";
            case 10269:
                return s != 1 ? s != 2 ? s != 2870 ? s != 4296 ? s == 13504 ? "MWB_PREVENTION_CARE_COLLECT_TAM_REPORTED_MESSAGE" : "UNDEFINED_QPL_EVENT" : "MWB_PREVENTION_CARE_SEND_TAM_REPORT" : "MWB_PREVENTION_CARE_PLATFORM_SEND_REPORT" : "MWB_PREVENTION_CARE_ACT_FRANKING_RECEIVE" : "MWB_PREVENTION_CARE_ACT_FRANKING_SEND";
            case 10270:
                return s != 3374 ? s != 4381 ? s != 10579 ? s != 10932 ? s == 12703 ? "AI_STUDIO_CREATION_MOBILE_QUICK_CREATION" : "UNDEFINED_QPL_EVENT" : "AI_STUDIO_CREATION_MOBILE_FIELD_REGENERATION" : "AI_STUDIO_CREATION_MOBILE_CREATION_TEMPLATE" : "AI_STUDIO_CREATION_MOBILE_COMPLETE_AI_CREATION" : "AI_STUDIO_CREATION_MOBILE_AVATAR_GENERATION";
            case 10281:
                return s != 6584 ? s == 12568 ? "WHATSAPP_COMMERCE_CATALOG_HOME_TTI" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_COMMERCE_CATALOG_PDP_TTI";
            case 10287:
                return s != 3581 ? s != 4929 ? s == 14448 ? "AVATAR_SDK_LOAD_LOAD_URI" : "UNDEFINED_QPL_EVENT" : "AVATAR_SDK_LOAD_LOAD_MEMORY" : "AVATAR_SDK_LOAD_LOAD_USER";
            case 10295:
                return s == 4289 ? "MESSENGER_SEARCH_MEM_CACHE_CACHE_PERF" : "UNDEFINED_QPL_EVENT";
            case 10302:
                return s != 1086 ? s != 9430 ? s == 12717 ? "BLOKS_SHELL_PLAYGROUND_INTERACT" : "UNDEFINED_QPL_EVENT" : "BLOKS_SHELL_SEARCH" : "BLOKS_SHELL_EXAMPLE_SEARCH_USER_FLOW";
            case 10314:
                return s == 8154 ? "FB_FEED_ADS_GRID_FORMAT_FEED_ADS_GRID_FORMAT_PERFORMANCE" : "UNDEFINED_QPL_EVENT";
            case 10315:
                return s != 3950 ? s != 5478 ? s != 5995 ? s != 6866 ? s == 7320 ? "RP_MEDIA_TRANSPORT_BETTER_PATH_SELECTION" : "UNDEFINED_QPL_EVENT" : "RP_MEDIA_TRANSPORT_MEDIA_TRANSPORT_CONNECT_FUNNEL" : "RP_MEDIA_TRANSPORT_RELAY_DISCOVERY" : "RP_MEDIA_TRANSPORT_MULTI_PATH" : "RP_MEDIA_TRANSPORT_PORT_ALLOCATOR";
            case 10335:
                return s == 5090 ? "MOBILE_NETWORK_STACK_HIGH_SAMPLE_RATE_HTTP_REQUEST" : "UNDEFINED_QPL_EVENT";
            case 10340:
                return s == 13589 ? "IG_ANDROID_ASYNC_LAYOUT_INFLATE_INFLATE_VIEW" : "UNDEFINED_QPL_EVENT";
            case 10362:
                return AbstractC61844Ruc.A00(s);
            case 10367:
                return s == 12090 ? "LABYRINTH_UX_ENCRYPTED_BACKUP_TOGGLE_LOADING_TIME" : "UNDEFINED_QPL_EVENT";
            case 10371:
                return s == 11199 ? "ENCRYPTED_BACKUPS_RESTORE_ISSUE_RESTORE_TASK" : "UNDEFINED_QPL_EVENT";
            case 10374:
                return AbstractC61892RvO.A00(s);
            case 10384:
                return AbstractC61875Rv7.A00(s);
            case 10395:
                return s != 5486 ? s == 10380 ? "IG_ANDROID_HIGH_QUALITY_UPLOAD_OPTION_TURN_OFF" : "UNDEFINED_QPL_EVENT" : "IG_ANDROID_HIGH_QUALITY_UPLOAD_OPTION_TURN_ON";
            case 10396:
                return s == 15109 ? "MESSENGER_LOCATION_SHARING_MAP_LOAD" : "UNDEFINED_QPL_EVENT";
            case 10401:
                return s == 8337 ? "IG_ANDROID_NETWORK_CALLBACK_CALLBACK" : "UNDEFINED_QPL_EVENT";
            case 10407:
                return s == 2683 ? "APP_MESSAGE_APP_MESSAGE" : "UNDEFINED_QPL_EVENT";
            case 10414:
                return s == 8383 ? "DISTRIBGW_CHATD_REQUEST_LIFECYCLE" : "UNDEFINED_QPL_EVENT";
            case 10417:
                return S0Y.A00(s);
            case 10425:
                return s == 1047 ? "ANDROID_MESSAGING_DATA_LAYER_OP_FETCH_USER_BY_KEY" : "UNDEFINED_QPL_EVENT";
            case 10429:
                return s == 12670 ? "OPENID_LOGIN_IDENTIFY_FLOW" : "UNDEFINED_QPL_EVENT";
            case 10444:
                return s == 12395 ? "IG_ANDROID_LAYOUT_INFLATION_INFLATE" : "UNDEFINED_QPL_EVENT";
            case 10454:
                return s == 10066 ? "FB_COWATCH_START_COWATCH_CALL" : "UNDEFINED_QPL_EVENT";
            case 10455:
                return s == 8972 ? "MESSENGER_SECONDARY_SEARCH_SECONDARY_SEARCH" : "UNDEFINED_QPL_EVENT";
            case 10487:
                return AbstractC62132Rzf.A00(s);
            case 10496:
                return s == 5571 ? "IG_PROTOPRO_PROTOPRO_FRAMEWORK" : "UNDEFINED_QPL_EVENT";
            case 10498:
                return s == 12547 ? "VOODOO_REQUEST" : "UNDEFINED_QPL_EVENT";
            case 10507:
                return s != 12837 ? s != 15936 ? s == 16216 ? "IG_USER_INTERACTION_UX_SESSION" : "UNDEFINED_QPL_EVENT" : "IG_USER_INTERACTION_PULL_TO_REFRESH" : "IG_USER_INTERACTION_VIEW_ON_CLICK";
            case 10523:
                return s == 4466 ? "WHATSAPP_SCROLL_PERF_WHATSAPP_SCROLL_PERF" : "UNDEFINED_QPL_EVENT";
            case 10535:
                return AbstractC62009RxJ.A00(s);
            case 10557:
                return s != 1086 ? s == 3192 ? "WEARABLES_AUDIO_WEARABLES_AUDIO_SESSION_START" : "UNDEFINED_QPL_EVENT" : "WEARABLES_AUDIO_WEARABLES_AUDIO_SESSION_INFO";
            case 10579:
                return AbstractC62122RzV.A00(s);
            case 10587:
                return s == 3522 ? "VROS_TRACKING_SERVICE_READY_TO_TRACK_HMD" : "UNDEFINED_QPL_EVENT";
            case 10598:
                return AbstractC61944RwG.A00(s);
            case 10603:
                return s == 6426 ? "WHATSAPP_EXPRESSIONS_TRAY_WHATSAPP_EXPRESSIONS_TRAY_ANDROID" : "UNDEFINED_QPL_EVENT";
            case 10617:
                return s == 3704 ? "PAGE_TO_WHATSAPP_LINKING_CTWA_NT_CHECK_PHONE_NUMBER" : "UNDEFINED_QPL_EVENT";
            case 10665:
                return s != 1 ? s == 2 ? "PANDO_HASH_COLLISIONS_FIELD_KEY_COLLISION" : "UNDEFINED_QPL_EVENT" : "PANDO_HASH_COLLISIONS_NODE_KEY_COLLISION";
            case 10670:
                return s != 2634 ? s != 5552 ? s == 9250 ? "GROUPS_NEXT_GEN_NAV_ANDROID_COMMUNITY_PANEL_TTRC" : "UNDEFINED_QPL_EVENT" : "GROUPS_NEXT_GEN_NAV_NAV_MENU_WWW" : "GROUPS_NEXT_GEN_NAV_NAV_MENU_TTRC";
            case 10672:
                return s != 1 ? s == 2 ? "HCS_N_MODULE_A_HCS_EVENT_E_B" : "UNDEFINED_QPL_EVENT" : "HCS_N_MODULE_A_HCS_EVENT_E_A";
            case 10685:
                return s == 13908 ? "WEARABLE_DELAYED_PROCESSING_IMAGE_EXECUTION" : "UNDEFINED_QPL_EVENT";
            case 10689:
                return AbstractC61922Rvu.A00(s);
            case 10699:
                return S04.A00(s);
            case 10711:
                return AbstractC61850Rui.A00(s);
            case 10741:
                return S06.A00(s);
            case 10748:
                return AbstractC62138Rzl.A00(s);
            case 10749:
                return s == 15348 ? "DISTRIBGW_MSYS_TASK_STRATEGY_REQUEST" : "UNDEFINED_QPL_EVENT";
            case 10753:
                return s == 2698 ? "SG_WEARABLE_NOTIFICATION_SYNC_TIME" : "UNDEFINED_QPL_EVENT";
            case 10788:
                return s == 4622 ? "OCULUS_SCROLL_PERF_SCROLL_PERF" : "UNDEFINED_QPL_EVENT";
            case 10799:
                return s != 1 ? s == 2 ? "SHARED_MESSAGE_CONTENT_LOAD_LIST_LOAD" : "UNDEFINED_QPL_EVENT" : "SHARED_MESSAGE_CONTENT_LOAD_INITIAL_LOAD";
            case 10804:
                return s != 2041 ? s != 3586 ? s == 4883 ? "INBOX_FOLLOWUP_FOLLOW_UP_TAG_ADD_ATTEMPT" : "UNDEFINED_QPL_EVENT" : "INBOX_FOLLOWUP_FETCH_CLOSE_CONNECTIONS" : "INBOX_FOLLOWUP_NO_CLOSE_CONNECTIONS";
            case 10810:
                return s != 8213 ? s != 13515 ? s == 13830 ? "FB_PROFESSIONAL_HOME_HOME_TTRC" : "UNDEFINED_QPL_EVENT" : "FB_PROFESSIONAL_HOME_WORKFLOW_TAB_ASYNC_LOAD" : "FB_PROFESSIONAL_HOME_INITIAL_LOAD_TTRC";
            case 10818:
                return s != 15311 ? s == 15529 ? "MARKETPLACE_RATINGS_REVIEWS_C2C_RATINGS_REVIEWS_COMPOSER" : "UNDEFINED_QPL_EVENT" : "MARKETPLACE_RATINGS_REVIEWS_BUYER_RATINGS_RESET_NOTICE";
            case 10832:
                return s == 2319 ? "MSGR_WRITE_WITH_AI_REQUEST_REPHRASE" : "UNDEFINED_QPL_EVENT";
            case 10839:
                return s == 4069 ? "AR_BROWSER_TIME_TO_INTERACT" : "UNDEFINED_QPL_EVENT";
            case 10843:
                return s != 3460 ? s != 6861 ? s == 11996 ? "ANDROID_OFFSITE_NOTIFICATION_TIMESPENT_ON_LX" : "UNDEFINED_QPL_EVENT" : "ANDROID_OFFSITE_NOTIFICATION_LOGGED_OUT_PUSH_NOTIFICATION_FUNNEL" : "ANDROID_OFFSITE_NOTIFICATION_PUSH_NOTIFICATION_DELIVERY_FUNNEL";
            case 10851:
                return s != 3009 ? s == 15041 ? "MNS_TCP_TCP_TO_CHATD" : "UNDEFINED_QPL_EVENT" : "MNS_TCP_SECURETCP_CONNECTED";
            case 10855:
                return s == 16124 ? "WORK_SUITE_EAR_WRITE_ENCRYPTED_FIELD" : "UNDEFINED_QPL_EVENT";
            case 10890:
                return s == 11253 ? "FB_SHORTS_TAB_REELS_TAB_TOP_POSITION_FUNNEL" : "UNDEFINED_QPL_EVENT";
            case 10898:
                return s == 11945 ? "MERLIN_MERLIN_COMPONENT" : "UNDEFINED_QPL_EVENT";
            case 10917:
                return s == 1 ? "RP_ENCRYPTION_PACKET_DROP_SRTP_DECRYPT_V2" : "UNDEFINED_QPL_EVENT";
            case 10937:
                return AbstractC62061RyW.A00(s);
            case 10940:
                return s == 15793 ? "INVESTIGATIONS_EDIT_PROFILE" : "UNDEFINED_QPL_EVENT";
            case 10951:
                return AbstractC62047Rxv.A00(s);
            case 10957:
                return s == 8248 ? "QUEST_WEB_APP_STORE_TIME_TO_SEARCH_EMPTY_RESULTS" : "UNDEFINED_QPL_EVENT";
            case 10961:
                return s != 1 ? s != 2 ? s != 4513 ? s == 5237 ? "UNIFIED_TOFU_TAB_SWITCH_TTRC" : "UNDEFINED_QPL_EVENT" : "UNIFIED_TOFU_TAB_VPV" : "UNIFIED_TOFU_TRAY_TAB_SWITCH" : "UNIFIED_TOFU_TRAY_IMPRESSION";
            case 10962:
                return s != 2455 ? s == 4472 ? "IFU_DELIVERY_RELIABILITY_IFU_CSR" : "UNDEFINED_QPL_EVENT" : "IFU_DELIVERY_RELIABILITY_NEWS_FEED_IFU_DELIVERY_FUNNEL";
            case 10963:
                return s == 3458 ? "OCCAMADILLO_SHIM_VERIFY_THREAD_EXISTS" : "UNDEFINED_QPL_EVENT";
            case 10969:
                return s == 1 ? "FBLITE_FRESHNESS_FBLITE_UNITY_FRESHNESS_SUBSCRIBERS" : "UNDEFINED_QPL_EVENT";
            case 10982:
                return AbstractC61878RvA.A00(s);
            case 10986:
                return s != 4704 ? s != 9915 ? s != 15253 ? s == 21767 ? "BLOKS_SCREENS_BLOKS_SCREEN_TTRC" : "UNDEFINED_QPL_EVENT" : "BLOKS_SCREENS_EXCEPTION" : "BLOKS_SCREENS_BLOKS_EXAMPLE_TTI" : "BLOKS_SCREENS_BLOKS_SCREEN_TTI";
            case 10995:
                return AbstractC61914Rvm.A00(s);
            case 11003:
                return AbstractC61951RwN.A00(s);
            case 11009:
                return s == 9918 ? "PIXEL_BUFFER_REQUESTS_PIXEL_REQUEST" : "UNDEFINED_QPL_EVENT";
            case 11011:
                return s != 8453 ? s == 11836 ? "WWW_GRAPHQL_QUICKPROMOTION_WWW_GRAPHQL_EXECUTION_GRAPHQLFETCHNUXES" : "UNDEFINED_QPL_EVENT" : "WWW_GRAPHQL_QUICKPROMOTION_WWW_GRAPHQL_EXECUTION_FETCHINTERSTITIALS";
            case 11012:
                return AbstractC62117RzQ.A00(s);
            case 11018:
                return s == 6114 ? "GEMSTONE_REVEALED_CRUSH_GEMSTONE_REVEALED_CRUSH_SUGGESTIONS_TTRC" : "UNDEFINED_QPL_EVENT";
            case 11038:
                return s != 1698 ? s != 2831 ? s == 15587 ? "VOICESDK_CLIENT_LATENCY" : "UNDEFINED_QPL_EVENT" : "VOICESDK_XPLAT_CLIENT_LATENCY" : "VOICESDK_VOICESDK_OPERATION_LATENCY";
            case 11041:
                return AbstractC62038Rxm.A00(s);
            case 11050:
                return s != 1687 ? s == 11657 ? "IG_DIRECT_MESSAGE_SYNC_OPEN_REALTIME_SYNC" : "UNDEFINED_QPL_EVENT" : "IG_DIRECT_MESSAGE_SYNC_INSTAMADILLO_SYNC";
            case 11059:
                return AbstractC61991Rx1.A00(s);
            case 11064:
                return AbstractC61860Rus.A00(s);
            case 11072:
                return s != 1 ? s == 7414 ? "FOS_MONETIZATION_EXTERNAL_ZERO_BALANCE_DETECTION" : "UNDEFINED_QPL_EVENT" : "FOS_MONETIZATION_FOS_MON_PURCHASE_FLOW_FUNNEL";
            case 11073:
                return s != 1 ? s == 3754 ? "IG_ANDROID_FRAME_RENDER_SCROLL_LARGE_FRAME_DROP" : "UNDEFINED_QPL_EVENT" : "IG_ANDROID_FRAME_RENDER_SCROLL_FRAME_AVG";
            case 11081:
                return s != 6249 ? s != 6357 ? s == 9697 ? "WHATSAPP_VOIP_WHATSAPP_AI_RTC_CONNECTION_SETUP" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_VOIP_WHATSAPP_OUTGOING_CALL_SETUP" : "WHATSAPP_VOIP_WHATSAPP_INCOMING_CALL_SETUP";
            case 11082:
                return s == 1 ? "SHOPS_INTERNAL_TOOLING_TIME_TO_SURFACE" : "UNDEFINED_QPL_EVENT";
            case 11087:
                return s == 1 ? "COMMUNITY_CHATS_COMMUNITY_CHATS_PANEL_TTRC" : "UNDEFINED_QPL_EVENT";
            case 11111:
                return s != 7453 ? s != 8979 ? s == 16296 ? "WEARABLE_WA_RTC_INCOMING_NOTIF" : "UNDEFINED_QPL_EVENT" : "WEARABLE_WA_RTC_CALL_START" : "WEARABLE_WA_RTC_CALL_END";
            case 11115:
                return s != 1335 ? s != 2225 ? s != 4738 ? s == 7995 ? "IG_APP_ENTRY_ACTION" : "UNDEFINED_QPL_EVENT" : "IG_APP_ENTRY_AFTER_APP_RESET" : "IG_APP_ENTRY_HOT_START" : "IG_APP_ENTRY_LATE_POST_RESUME";
            case 11129:
                return AbstractC62011RxL.A00(s);
            case 11145:
                return s != 4003 ? s != 5162 ? s == 8400 ? "WEARABLE_MEDIA_CONTROLLER_APP_START" : "UNDEFINED_QPL_EVENT" : "WEARABLE_MEDIA_CONTROLLER_SEND_REMOTE_COMMAND" : "WEARABLE_MEDIA_CONTROLLER_INIT_REMOTE_SERVICE";
            case 11179:
                return s != 6037 ? s != 11152 ? s != 12859 ? s == 16174 ? "VIOLATION_FRICTION_COMMUNITY_STANDARDS_SCREEN_MARKER" : "UNDEFINED_QPL_EVENT" : "VIOLATION_FRICTION_FRICTION_DIALOG_RENDER" : "VIOLATION_FRICTION_SEE_WHY_SCREEN_MARKER" : "VIOLATION_FRICTION_HOME_SCREEN_RENDER";
            case 11187:
                return s == 9424 ? "LABYRINTH_MSGR_ENDGAME_SECURITY_QUESTION_REGISTER" : "UNDEFINED_QPL_EVENT";
            case 11193:
                return s == 4851 ? "LEADERBOARD_TAB_LOAD" : "UNDEFINED_QPL_EVENT";
            case 11199:
                return s != 8235 ? s == 9582 ? "MSYS_CRYPTO_TASK_HEALTH_CRYPTO_TASK_RETRYABLE_FAILURE" : "UNDEFINED_QPL_EVENT" : "MSYS_CRYPTO_TASK_HEALTH_CRYPTO_TASK_PERMANENT_FAILURE";
            case 11205:
                return s != 3522 ? s != 8759 ? s == 11447 ? "IOS_MEMORY_APP_USED" : "UNDEFINED_QPL_EVENT" : "IOS_MEMORY_APP_REMAINING" : "IOS_MEMORY_APP_LIMIT";
            case 11211:
                return AbstractC62044Rxs.A00(s);
            case 11218:
                return AbstractC61876Rv8.A00(s);
            case 11250:
                return s == 1 ? "WEBLITE_ONE_TRACE_SCROLL" : "UNDEFINED_QPL_EVENT";
            case 11251:
                return s != 1561 ? s != 9719 ? s == 16152 ? "HR_HOME_FETCH_WORKPLACE_POST_KEY_UPDATES" : "UNDEFINED_QPL_EVENT" : "HR_HOME_FETCH_CARE_PLATFORM_CASES" : "HR_HOME_FETCH_KEY_UPDATES";
            case 11291:
                return s == 1 ? "LITE_PUSH_NOTIFICATIONS_PUSH_RENDERING" : "UNDEFINED_QPL_EVENT";
            case 11301:
                return RyE.A00(s);
            case 11302:
                return s != 1326 ? s == 3382 ? "PANDO_CONSISTENCY_UPDATE" : "UNDEFINED_QPL_EVENT" : "PANDO_CONSISTENCY_OPERATION";
            case 11308:
                return s != 4367 ? s == 6206 ? "DEAD_QPL_EVENT_PROXY_MODULE_PROXY_DELETED_EVENT" : "UNDEFINED_QPL_EVENT" : "DEAD_QPL_EVENT_PROXY_MODULE_PROXY_DELETED_EVENT_NOT_EXPIRED";
            case 11314:
                return s != 4078 ? s != 6329 ? s != 7514 ? s == 13878 ? "DIRECTORY_LITE_CONSUMER_WHATSAPP_BUSINESSAPI_HOME" : "UNDEFINED_QPL_EVENT" : "DIRECTORY_LITE_CONSUMER_WHATSAPP_BUSINESSAPI_SEARCH_QUERY" : "DIRECTORY_LITE_CONSUMER_WHATSAPP_BUSINESSAPI_BUSINESSES_BY_CATEGORY" : "DIRECTORY_LITE_CONSUMER_WHATSAPP_BUSINESSAPI_POPULAR_BUSINESSES";
            case 11315:
                return s != 1935 ? s != 3287 ? s != 13683 ? s == 15823 ? "FB_REAL_TIME_INTENT_ADS_REELS_REAL_TIME_INTENT_ADS_USER_FLOW" : "UNDEFINED_QPL_EVENT" : "FB_REAL_TIME_INTENT_ADS_STORY_REAL_TIME_INTENT_ADS_USER_FLOW" : "FB_REAL_TIME_INTENT_ADS_REELS_SMA_USER_FLOW" : "FB_REAL_TIME_INTENT_ADS_REELS_REAL_TIME_INTENT_ADS_USER_BEHAVIOR_FLOW";
            case 11325:
                return s != 6964 ? s != 8521 ? s != 10439 ? s == 13063 ? "EYS_EYS_BUYER_INSIGHT_PLATFORM_CUBS" : "UNDEFINED_QPL_EVENT" : "EYS_MTIA_ACC_PERF_DEBUGGING" : "EYS_EYS_BIDDING_ML_DEVELOPMENT_AUTOMATION" : "EYS_EYS_FIX_CAFFE2_DPER_CONVEYOR_NODE";
            case 11352:
                return s == 5775 ? "MONETIZATION_HUB_MONETIZATION_HUB" : "UNDEFINED_QPL_EVENT";
            case 11364:
                return s == 6983 ? "WATCH_PLATFORM_UNIFIED_MINIPLAYER_MP_FLOW" : "UNDEFINED_QPL_EVENT";
            case 11365:
                return AbstractC61846Rue.A00(s);
            case 11368:
                return s != 4820 ? s == 8854 ? "RP_MINIVIEW_EXIT_MINIVIEW" : "UNDEFINED_QPL_EVENT" : "RP_MINIVIEW_ENTER_MINIVIEW";
            case 11373:
                return s == 10617 ? "WORKROOMS_VR_VC_BRIDGE_BRIDGE_CLIENT_JOIN" : "UNDEFINED_QPL_EVENT";
            case 11386:
                return s != 2242 ? s != 3476 ? s == 11238 ? "EXPLORE_SUBTAB_EXPLORE_SUBTAB_SCROLL" : "UNDEFINED_QPL_EVENT" : "EXPLORE_SUBTAB_EXPLORE_SUBTAB_PAGINATION_LOAD" : "EXPLORE_SUBTAB_EXPLORE_SUBTAB_LOAD";
            case 11390:
                return s == 12474 ? "FB_TAGGING_ADD_LOCATION_TAG" : "UNDEFINED_QPL_EVENT";
            case 11392:
                return AbstractC62074Ryj.A00(s);
            case 11420:
                return s != 6707 ? s != 8503 ? s == 13146 ? "STANDALONE_TESTING_TRAVEL" : "UNDEFINED_QPL_EVENT" : "STANDALONE_TESTING_HSR_VIDEO_INSTRUMENTATION" : "STANDALONE_TESTING_APP_INIT";
            case 11423:
                return s == 8749 ? "VIDEO_EXPERIANCE_COMPONENT_PLATFORM_SPLIT_SCREEN" : "UNDEFINED_QPL_EVENT";
            case 11428:
                return s == 2096 ? "CPDP_ANALYTICS_FB_ANDROID_DEEPLINK_SOURCE_MODULE" : "UNDEFINED_QPL_EVENT";
            case 11433:
                return s != 8402 ? s != 9475 ? s == 10711 ? "WEARABLE_RTC_CALL_START" : "UNDEFINED_QPL_EVENT" : "WEARABLE_RTC_CALL_END" : "WEARABLE_RTC_INCOMING_NOTIF";
            case 11437:
                return s == 5324 ? "BLP_BEST_LANGUAGE_API_LATENCY" : "UNDEFINED_QPL_EVENT";
            case 11441:
                return AbstractC61949RwL.A00(s);
            case 11456:
                return s != 6730 ? s == 12152 ? "FBLITE_CLIENT_EFFICIENCY_FBLITE_PERF_THREAD_LOCK_AGGREGATED_EVENT" : "UNDEFINED_QPL_EVENT" : "FBLITE_CLIENT_EFFICIENCY_FBLITE_PERF_THREAD_LOCK_EVENTS";
            case 11459:
                return s == 7612 ? "MNS_DGW_SEND_REQUEST" : "UNDEFINED_QPL_EVENT";
            case 11500:
                return s == 3347 ? "HERMES_SERVICE_HAAS_EXECJS_REQUEST" : "UNDEFINED_QPL_EVENT";
            case 11501:
                return s != 2325 ? s != 4480 ? s != 6629 ? s != 13424 ? s != 13686 ? s == 15321 ? "RP_BREAKOUT_ROOM_BREAKOUT_ROOM_SWITCH_CREATOR" : "UNDEFINED_QPL_EVENT" : "RP_BREAKOUT_ROOM_BREAKOUT_SESSION_START" : "RP_BREAKOUT_ROOM_BREAKOUT_SESSION_START_PARTICIPANT" : "RP_BREAKOUT_ROOM_BREAKOUT_SESSION_END" : "RP_BREAKOUT_ROOM_BREAKOUT_ROOM_USER_ACTIONS" : "RP_BREAKOUT_ROOM_BREAKOUT_SESSION_END_PARTICIPANT";
            case 11507:
                return s != 2831 ? s != 4273 ? s != 8846 ? s != 14317 ? s == 14867 ? "BARCELONA_SEARCH_SERP_RECENT_HEAD_LOAD" : "UNDEFINED_QPL_EVENT" : "BARCELONA_SEARCH_SERP_TOP_HEAD_LOAD" : "BARCELONA_SEARCH_SERP_TOP_TAIL_LOAD" : "BARCELONA_SEARCH_TRENDS_LOAD" : "BARCELONA_SEARCH_SERP_RECENT_TAIL_LOAD";
            case 11509:
                return AbstractC62136Rzj.A00(s);
            case 11523:
                return s != 6663 ? s == 8663 ? "MSYS_MULTI_ACCOUNT_APP_START_TO_ROUND_ROBIN_SYNC" : "UNDEFINED_QPL_EVENT" : "MSYS_MULTI_ACCOUNT_BACKGROUND_ACCOUNT_SYNC";
            case 11526:
                return s != 5858 ? s != 11039 ? s != 11794 ? s != 13631 ? s == 14950 ? "STORIES_IN_FEED_ANDROID_THREAD_TRANSITION_TTRC" : "UNDEFINED_QPL_EVENT" : "STORIES_IN_FEED_ANDROID_STORIES_IN_FEED_UNIT_INIT" : "STORIES_IN_FEED_ANDROID_STORY_PLAYBACK_INIT" : "STORIES_IN_FEED_ANDROID_STORIES_IN_FEED_UNIT_TTRC" : "STORIES_IN_FEED_ANDROID_STORY_MEDIA_LOADED";
            case 11552:
                return s != 1256 ? s != 9430 ? s == 15343 ? "ACT_ECHO_ECHO" : "UNDEFINED_QPL_EVENT" : "ACT_ECHO_ECHO_MESSAGE_SERIALIZATION" : "ACT_ECHO_ECHO_MESSAGE_DESERIALIZATION";
            case 11563:
                return s == 6878 ? "IG_REELS_AUTOMATED_VIDEO_CAPTIONS_AUTOMATED_VIDEO_CAPTION_VISIBLE" : "UNDEFINED_QPL_EVENT";
            case 11568:
                return s == 5921 ? "WEARABLE_COMMS_USER_FLOW_COMMS_HUB_NUX_USER_FLOW" : "UNDEFINED_QPL_EVENT";
            case 11569:
                return s != 5661 ? s != 6504 ? s != 6714 ? s != 10449 ? s != 12081 ? s == 15245 ? "PROFESSIONAL_MODE_PROMODE_LOAD_BUNDLED_PRIVACY_SETTING_SELECTION_SCREEN_UI" : "UNDEFINED_QPL_EVENT" : "PROFESSIONAL_MODE_PROMODE_LOAD_MONETIZATION_UI" : "PROFESSIONAL_MODE_TURN_ON_PROFESSIONAL_MODE" : "PROFESSIONAL_MODE_PROMODE_LOAD_PROFILE_FRAME_UI" : "PROFESSIONAL_MODE_GET_RENDER_AS_PROFILE_ON_BIZ_TOOLS" : "PROFESSIONAL_MODE_TURN_ON_PROFILE_PLUS";
            case 11587:
                return s == 1987 ? "COMMUNITY_PRESENCE_PRESENCE_GROUP_URL_REDIRECTED_VIA_CONTROLLER" : "UNDEFINED_QPL_EVENT";
            case 11588:
                return s == 4939 ? "MWB_SELF_REMEDIATION_BLOCK_UNBLOCK_USER" : "UNDEFINED_QPL_EVENT";
            case 11598:
                return s != 13740 ? s == 15388 ? "SHOPS_WISHLIST_SCREEN_TTRC" : "UNDEFINED_QPL_EVENT" : "SHOPS_WISHLIST_WISHLIST_PRODUCTS_QUERY_NO_PARAM";
            case 11603:
                return s == 1451 ? "ANDROID_IG_DIRECT_BACKGROUND_PREFETCH_XMA_CLIPS" : "UNDEFINED_QPL_EVENT";
            case 11636:
                return s == 7227 ? "IG_SETTINGS_SETTINGS_RENDERED" : "UNDEFINED_QPL_EVENT";
            case 11651:
                return s != 3472 ? s != 3745 ? s != 4973 ? s == 6723 ? "OCULUS_TWILIGHT_AVATAR_STATIC_RENDER_COMPLETE" : "UNDEFINED_QPL_EVENT" : "OCULUS_TWILIGHT_AVATAR_AVATAR_VIEWER_LOADING_COMPLETE" : "OCULUS_TWILIGHT_AVATAR_ANIMATED_RENDER_COMPLETE" : "OCULUS_TWILIGHT_AVATAR_STATUS_REPLY_PARSE";
            case 11653:
                return s != 7845 ? s == 9553 ? "FBLITE_MEDIA_PERF_MESSAGING_TAM_ATTACHMENTS_IMAGE_LOAD" : "UNDEFINED_QPL_EVENT" : "FBLITE_MEDIA_PERF_MESSAGING_TAM_ATTACHMENTS_IMAGE_FETCH";
            case 11664:
                return s != 13199 ? s == 13290 ? "STORY_VIEWER_FEEDBACK_ANDROID_COMPOSER_OPEN_TTI" : "UNDEFINED_QPL_EVENT" : "STORY_VIEWER_FEEDBACK_ANDROID_CONTEXTUAL_REPLIES_TTI";
            case 11690:
                return AbstractC61995Rx5.A00(s);
            case 11701:
                return s != 5584 ? s != 11120 ? s == 14223 ? "IG_BUSINESS_MESSAGING_CTA_CLICK_TO_RENDER" : "UNDEFINED_QPL_EVENT" : "IG_BUSINESS_MESSAGING_AD_IMPRESSION_TO_CLICK" : "IG_BUSINESS_MESSAGING_AD_IMPRESSION_TO_MESSAGE_SENT";
            case 11716:
                return s != 13835 ? s == 16204 ? "FBLITE_PREPUSH_PREPUSH_WORKFLOW" : "UNDEFINED_QPL_EVENT" : "FBLITE_PREPUSH_NAVIGATION_OPPORTUNITIES";
            case 11725:
                return s == 8009 ? "IG_MEDIA_CREATION_SHARE_PRESS" : "UNDEFINED_QPL_EVENT";
            case 11727:
                return s == 14265 ? "OC_PARTIES_WWW_PARTY_NOTIFICATION_OBSERVER" : "UNDEFINED_QPL_EVENT";
            case 11752:
                return AbstractC61916Rvo.A00(s);
            case 11768:
                return AbstractC61909Rvh.A00(s);
            case 11792:
                return AbstractC61941RwD.A00(s);
            case 11822:
                return S02.A00(s);
            case 11824:
                return s != 6160 ? s != 7493 ? s != 11341 ? s != 11629 ? s != 12065 ? s == 14948 ? "SHAREABLE_PAYMENTS_LIBRARY_COUNTRY_PICKER_TTI" : "UNDEFINED_QPL_EVENT" : "SHAREABLE_PAYMENTS_LIBRARY_ADD_OR_EDIT_CREDIT_OR_DEBIT_CARD_SCREEN_TTI" : "SHAREABLE_PAYMENTS_LIBRARY_EDIT_PAYMENT_METHODS_BOTTOM_SHEET_TTI" : "SHAREABLE_PAYMENTS_LIBRARY_PAYMENT_NAVBAR_TTI" : "SHAREABLE_PAYMENTS_LIBRARY_PAYPAL_LOGIN_WEBVIEW_SCREEN_TTI" : "SHAREABLE_PAYMENTS_LIBRARY_THIRD_PARTY_PAYMENT_EDIT_SCREEN_TTI";
            case 11830:
                return s != 6276 ? s == 12379 ? "IG_HANGOUTS_CANVAS_CAF_CONNECTION" : "UNDEFINED_QPL_EVENT" : "IG_HANGOUTS_CANVAS_CAF_SESSION";
            case 11833:
                return AbstractC62090Ryz.A00(s);
            case 11836:
                return s != 6476 ? s == 16060 ? "CONTACT_IMPORTER_FBLITEC_CONTACT_IMPORTER" : "UNDEFINED_QPL_EVENT" : "CONTACT_IMPORTER_CONTACT_IMPORTER_FUNNEL";
            case 11838:
                return s == 13024 ? "STORIES_MIDCARD_MUSIC_FALLBACK_CARD_MUSIC_FETCH_LATENCY" : "UNDEFINED_QPL_EVENT";
            case 11840:
                return AbstractC62134Rzh.A00(s);
            case 11851:
                return s != 2679 ? s != 6860 ? s == 10017 ? "IG_ANDROID_CHAINING_FEED_TAIL_LOAD" : "UNDEFINED_QPL_EVENT" : "IG_ANDROID_CHAINING_FEED_ITEM" : "IG_ANDROID_CHAINING_FEED_INITIAL_LOAD";
            case 11853:
                return s != 1 ? s != 3902 ? s != 8662 ? s != 12740 ? s != 12839 ? s == 16280 ? "LOGDB_DELETE" : "UNDEFINED_QPL_EVENT" : "LOGDB_DB_ERROR" : "LOGDB_LOGDB_MODE" : "LOGDB_TRIM_WHEN_NEEDED" : "LOGDB_ON_ADD_SUBSCRIPTION" : "LOGDB_TRIM";
            case 11857:
                return AbstractC61857Rup.A00(s);
            case 11872:
                return s == 2653 ? "MG_PLAYGROUND_FLASH_SPEECH_FLASH_SPEECH_CONVERSATION" : "UNDEFINED_QPL_EVENT";
            case 11873:
                return s == 4804 ? "RP_SHARED_CONTENT_OPEN_SHARED_CONTENT" : "UNDEFINED_QPL_EVENT";
            case 11879:
                return s == 9351 ? "RTC_CONNECTION_QUALITY_CONNECTION_QUALITY_UPDATE" : "UNDEFINED_QPL_EVENT";
            case 11887:
                return s == 1 ? "CODEHUB_GLEAN_GLASS_SYMBOL_INDEX" : "UNDEFINED_QPL_EVENT";
            case 11888:
                return AbstractC61880RvC.A00(s);
            case 11919:
                return s == 14045 ? "BUSINESS_MESSAGING_OUTCOMES_TAS_BIIM_TTRC" : "UNDEFINED_QPL_EVENT";
            case 11949:
                return s != 13804 ? s == 14382 ? "ACT_LOCK_BOX_METRICS_IDENTITY_KEY_LOCKBOX_STORE" : "UNDEFINED_QPL_EVENT" : "ACT_LOCK_BOX_METRICS_IDENTITY_KEY_LOCKBOX_RETRIEVE";
            case 11950:
                return s == 9356 ? "PHILLIP_TEST_MODULE_PHILLIP_TEST_7" : "UNDEFINED_QPL_EVENT";
            case 11972:
                return s != 3020 ? s == 4187 ? "TAIL_FETCH_PERSONALIZATION_DECISION_TIME" : "UNDEFINED_QPL_EVENT" : "TAIL_FETCH_PERSONALIZATION_LABEL_TIME";
            case 11985:
                return s != 1705 ? s != 10152 ? s != 11749 ? s != 13164 ? s == 15140 ? "WEARABLE_HEART_TRACK_RHR" : "UNDEFINED_QPL_EVENT" : "WEARABLE_HEART_APP_START" : "WEARABLE_HEART_VIEW_RHR_DETAILS" : "WEARABLE_HEART_TRACK_HR" : "WEARABLE_HEART_VIEW_HR_DETAILS";
            case 11986:
                return s != 1 ? s == 2 ? "FB_AI_IMAGINE_GENERATE_AND_LOAD_IMAGES" : "UNDEFINED_QPL_EVENT" : "FB_AI_IMAGINE_GENERATE_IMAGES";
            case 12003:
                return s != 5085 ? s == 12352 ? "FB_COMMERCE_CAMERA_EVENT_AD_CAMERA_FUNNEL" : "UNDEFINED_QPL_EVENT" : "FB_COMMERCE_CAMERA_EVENT_IAW_AR_BOTTOM_SHEET_FUNNEL";
            case 12007:
                return s != 1633 ? s != 4199 ? s != 13642 ? s == 15773 ? "FRL_BLOKS_DELTA_CHECKPOINT_PICK_CONTACT_POINT" : "UNDEFINED_QPL_EVENT" : "FRL_BLOKS_DELTA_CHECKPOINT_FETCH_CONTACT_POINTS" : "FRL_BLOKS_DELTA_CHECKPOINT_FILTER_CONTACT_POINTS" : "FRL_BLOKS_DELTA_CHECKPOINT_RESEND_CONFIRMATION_CODE";
            case 12017:
                return s == 14668 ? "MWB_REPORTING_ENFORCEMENT_SEND_REPORT" : "UNDEFINED_QPL_EVENT";
            case 12023:
                return AbstractC61835RuT.A00(s);
            case 12067:
                return s == 4005 ? "INSTAGRAM_SENSITIVE_CONTENT_CONTROL_SCC_SETTINGS_FUNNEL" : "UNDEFINED_QPL_EVENT";
            case 12082:
                return s != 3120 ? s != 7948 ? s == 9238 ? "EDTS_EDTS_TEST_QPL_EVENT_2" : "UNDEFINED_QPL_EVENT" : "EDTS_EDTS_TEST_QPL_EVENT_3" : "EDTS_EDTS_TEST_QPL_EVENT_1";
            case 12083:
                return s != 2076 ? s != 6066 ? s != 6207 ? s != 10202 ? s == 13106 ? "MCI_SDK_AIPROCESS" : "UNDEFINED_QPL_EVENT" : "MCI_SDK_UPLOAD" : "MCI_SDK_TRANSCODE" : "MCI_SDK_PREVIEW" : "MCI_SDK_INGEST_SESSION";
            case 12090:
                return s == 1 ? "IG_MAGIC_MOD_BACKDROP_TTI" : "UNDEFINED_QPL_EVENT";
            case 12091:
                return s == 15075 ? "HSR_TRAVEL_HSR_TRAVEL" : "UNDEFINED_QPL_EVENT";
            case 12099:
                return AbstractC61913Rvl.A00(s);
            case 12103:
                return s != 1 ? s != 4748 ? s == 8089 ? "ZERO_FBLITE_ZERO_INITIALIZATION" : "UNDEFINED_QPL_EVENT" : "ZERO_FBLITE_ZERO_FBLITE_OPTIN_FLOW" : "ZERO_FBLITE_ZERO_FBLITE_EVENT";
            case 12108:
                return s != 1007 ? s != 4652 ? s == 11120 ? "LEADS_CENTER_LEAD_TOS_LOAD_MOBILE" : "UNDEFINED_QPL_EVENT" : "LEADS_CENTER_LEAD_CARD_LOAD_MOBILE" : "LEADS_CENTER_LEAD_LIST_LOAD_MOBILE";
            case 12122:
                return AbstractC61882RvE.A00(s);
            case 12123:
                return AbstractC62013RxN.A00(s);
            case 12126:
                return s != 9034 ? s == 13551 ? "GENAI_ANSWERSHEET_ANSWERSHEET_LAUNCH" : "UNDEFINED_QPL_EVENT" : "GENAI_ANSWERSHEET_ANSWERSHEET_FUNNEL";
            case 12198:
                return s != 12407 ? s == 14289 ? "WHATSAPP_CLASSLOADER_DETAILS" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_CLASSLOADER_CLASS_LOAD_STATS";
            case 12199:
                return AbstractC62045Rxt.A00(s);
            case 12205:
                return s == 6226 ? "OMNI_USER_INFLUENCE_OMNI_PROMO_BOTTOM_SHEET_TTRC" : "UNDEFINED_QPL_EVENT";
            case 12249:
                return s == 4721 ? "MESSAGING_ODML_SUMMARIZE" : "UNDEFINED_QPL_EVENT";
            case 12258:
                return AbstractC61917Rvp.A00(s);
            case 12259:
                return s != 1 ? s == 2 ? "RP_CAMERA_CAMERA_OFF" : "UNDEFINED_QPL_EVENT" : "RP_CAMERA_CAMERA_ON";
            case 12270:
                return s != 12016 ? s == 13052 ? "MAGIC_ISLAND_TIME_TO_CONNECT" : "UNDEFINED_QPL_EVENT" : "MAGIC_ISLAND_VIDEO_FRAME_RENDERS";
            case 12272:
                return s == 12482 ? "MESSENGER_MESSAGE_SEARCH_MESSAGE_SEARCH" : "UNDEFINED_QPL_EVENT";
            case 12285:
                return s != 12297 ? s == 13422 ? "WORKPLACE_ANDROID_DIRECTORY_DIRECTORY_FLOW" : "UNDEFINED_QPL_EVENT" : "WORKPLACE_ANDROID_DIRECTORY_DIRECTORY_INITIAL_LOAD_TTRC";
            case 12286:
                return s != 10215 ? s != 11701 ? s != 12680 ? s != 14786 ? s == 14787 ? "RP_RELIABILITY_RP_EFFECT_RELIABILITY" : "UNDEFINED_QPL_EVENT" : "RP_RELIABILITY_RTC_IG_INCOMING_CALL_START" : "RP_RELIABILITY_TOUCH_RESPONSIVENESS" : "RP_RELIABILITY_UNJANK_M4A_RTC_REPORTING" : "RP_RELIABILITY_RP_SIGNALLING_SOUND_RELIABILITY";
            case 12302:
                return s != 6724 ? s == 15048 ? "WHATSAPP_ONBOARDING_PLATFORM_WHATSAPP_ONBOARDING_PLATFORM_LOG_EVENT" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_ONBOARDING_PLATFORM_WHATSAPP_EMBEDDED_SIGNUP";
            case 12322:
                return s == 1 ? "HORIZON_COORDINATED_TRAVEL_COORDINATED_TRAVEL_PORTAL_CREATION" : "UNDEFINED_QPL_EVENT";
            case 12350:
                return s != 1 ? s != 2138 ? s != 7627 ? s == 10525 ? "OXYGEN_PRELOADS_MOBILE_CONSENT_PUSH_SETTINGS_FAILED" : "UNDEFINED_QPL_EVENT" : "OXYGEN_PRELOADS_MOBILE_CONSENT_SETTINGS_ACTIVITY_NOT_FOUND" : "OXYGEN_PRELOADS_MOBILE_CONSENT_AUTO_APPROVE_SCREEN" : "OXYGEN_PRELOADS_MOBILE_CONSENT_SETTINGS_SCREEN";
            case 12354:
                return s == 7763 ? "GROUP_CHALLENGE_HOME_TTRC_GROUP_CHALLENGE_HOME_TTRC" : "UNDEFINED_QPL_EVENT";
            case 12382:
                return AbstractC62147Rzu.A00(s);
            case 12397:
                return s == 9935 ? "WORLDS_HSR_UI_INITIAL_LOAD" : "UNDEFINED_QPL_EVENT";
            case 12403:
                return s == 5894 ? "IN_APP_BROWSER_TABS_TABS_STACK_WARMUP_APP_JOB" : "UNDEFINED_QPL_EVENT";
            case 12405:
                return s == 1 ? "WHATSAPP_BLOKS_ANDROID_WHATSAPP_BLOKS_ANDROID" : "UNDEFINED_QPL_EVENT";
            case 12407:
                return s == 5060 ? "ELENA_TEST_TEST_CORNEL2" : "UNDEFINED_QPL_EVENT";
            case 12409:
                return s == 9508 ? "GROUPS_ADMIN_HOME_MAIN_SURFACE" : "UNDEFINED_QPL_EVENT";
            case 12414:
                return s == 12242 ? "IGNS_PUSH_NOTIFICATION_CATEGORY_CONTROLLER_ENSURE_INIT" : "UNDEFINED_QPL_EVENT";
            case 12417:
                return s != 4830 ? s != 7742 ? s != 14800 ? s == 16119 ? "IG_LOCAL_NOTIFICATIONS_BACKGROUND_TOKEN_JOB_ANDROID" : "UNDEFINED_QPL_EVENT" : "IG_LOCAL_NOTIFICATIONS_BACKGROUND_TOKEN_EXPOSE_ANDROID" : "IG_LOCAL_NOTIFICATIONS_BACKGROUND_TOKEN_SCHEDULING_ANDROID" : "IG_LOCAL_NOTIFICATIONS_LOCAL_NOTIFICATIONS_JOB_EXECUTION";
            case 12420:
                return s != 3325 ? s != 7668 ? s != 10795 ? s != 12690 ? s == 15754 ? "ARMADILLO_CLIENT_STORAGE_INFRA_MEDIA_BANK_TRUNCATION" : "UNDEFINED_QPL_EVENT" : "ARMADILLO_CLIENT_STORAGE_INFRA_MESSAGE_EXPIRATION_INFRA" : "ARMADILLO_CLIENT_STORAGE_INFRA_DISK_MANAGER_AUTHORITATIVE_DELETE_MEDIA" : "ARMADILLO_CLIENT_STORAGE_INFRA_MEDIA_BANK_TRUNCATION_MEDIA_PLATFORM" : "ARMADILLO_CLIENT_STORAGE_INFRA_MESSAGE_EXPIRATION_MEDIA_PLATFORM";
            case 12425:
                return s != 1540 ? s != 3892 ? s != 8378 ? s == 14725 ? "MESSENGER_AI_AGENTS_AI_AGENTS_MESSAGE" : "UNDEFINED_QPL_EVENT" : "MESSENGER_AI_AGENTS_AI_SEARCH_SNIPPET" : "MESSENGER_AI_AGENTS_AI_AGENTS_WAITLIST_REQUEST" : "MESSENGER_AI_AGENTS_EMBODIMENT_TTRC";
            case 12434:
                return s == 10870 ? "ANDROID_MSYS_FUTURES_MANAGED_MOBILE_ERRORS_MAILBOX_CALLBACK_UNCAUGHT_EXCEPTION" : "UNDEFINED_QPL_EVENT";
            case 12452:
                return s != 2084 ? s != 7032 ? s != 12340 ? s == 15096 ? "ROOMS_PERF_REMOTE_MUTE" : "UNDEFINED_QPL_EVENT" : "ROOMS_PERF_CALL_OUTGOING" : "ROOMS_PERF_CALL_INCOMING" : "ROOMS_PERF_LOCAL_MUTE";
            case 12455:
                return s == 1980 ? "MWA_HN_MWA_HN_SNAPSHOTS_MEDIA_PROCESSING_BG_JOB" : "UNDEFINED_QPL_EVENT";
            case 12480:
                return AbstractC62001RxB.A00(s);
            case 12488:
                return s != 4859 ? s != 14429 ? s == 15259 ? "FDS_PATTERNS_FDS_PATTERNS_MULTI_SELECT_FUNNEL" : "UNDEFINED_QPL_EVENT" : "FDS_PATTERNS_FDS_PATTERNS_CONTROLS_MENU_FUNNEL" : "FDS_PATTERNS_FDS_PATTERNS_PEOPLE_PICKER_FUNNEL";
            case 12519:
                return AbstractC62027Rxb.A00(s);
            case 12540:
                return s != 11163 ? s == 13486 ? "HELP_CENTER_HOME_PAGE_LOAD" : "UNDEFINED_QPL_EVENT" : "HELP_CENTER_ARTICLE_LOAD";
            case 12542:
                return s == 8130 ? "AR_CORE_SYSTEMS_AR_SESSION" : "UNDEFINED_QPL_EVENT";
            case 12545:
                return s != 1 ? s == 2 ? "WHATSAPP_MEDIA_TRANSFER_MEDIA_DOWNLOAD" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_MEDIA_TRANSFER_MEDIA_UPLOAD";
            case 12561:
                return s != 9078 ? s == 14020 ? "MESSENGER_GROWTH_MESSENGER_CONTACT_POINT_LOGIN_EVENT" : "UNDEFINED_QPL_EVENT" : "MESSENGER_GROWTH_MESSENGER_NUX_FUNNEL_EVENT";
            case 12563:
                return s == 4886 ? "IG_AD_QUANTUM_SIGNAL_FUNNEL_IG_AD_QUANTUM_SIGNAL_FUNNEL" : "UNDEFINED_QPL_EVENT";
            case 12576:
                return s != 4876 ? s != 5464 ? s == 8414 ? "IN_APP_BROWSER_IPA_EXPERIMENT_CONVERSION" : "UNDEFINED_QPL_EVENT" : "IN_APP_BROWSER_IPA_EXPERIMENT_IMPRESSION" : "IN_APP_BROWSER_IPA_EXPERIMENT_INITIALIZE";
            case 12578:
                return s != 4734 ? s == 13125 ? "APP_INIT_BIZ4A_APP_INIT" : "UNDEFINED_QPL_EVENT" : "APP_INIT_MESSENGER_APP_INIT";
            case 12591:
                return AbstractC62126RzZ.A00(s);
            case 12592:
                return s == 1 ? "IGDS_MISSING_COLOR_THEME_IN_CONTEXT" : "UNDEFINED_QPL_EVENT";
            case 12612:
                return s == 14947 ? "FELIOS_STABILITY_TURBOMODULE_USAGE" : "UNDEFINED_QPL_EVENT";
            case 12620:
                return s != 1 ? s != 2 ? s == 3 ? "IG_SETTINGS2_SETTINGS_CHANGE" : "UNDEFINED_QPL_EVENT" : "IG_SETTINGS2_SETTINGS_LOAD" : "IG_SETTINGS2_SCREEN_LOAD";
            case 12623:
                return s == 3387 ? "WORKROOMS_WWW_ACCESS_LIST_INVITED_MEMBERS" : "UNDEFINED_QPL_EVENT";
            case 12632:
                return s == 11725 ? "PORTAL_SCREEN_PORTAL_SCREEN_TTRC" : "UNDEFINED_QPL_EVENT";
            case 12662:
                return s != 4040 ? s == 16127 ? "MIXED_PERMISSIONS_ASSET_CLAIMING_FORWARD_FIX_NOTIFY_DIRECT_USERS_REMOVED_WHEN_PAGE_CLAIMING_TO_BIZ_SUCCESS" : "UNDEFINED_QPL_EVENT" : "MIXED_PERMISSIONS_ASSET_CLAIMING_FORWARD_FIX_NOTIFY_DIRECT_USERS_REMOVED_WHEN_PAGE_CLAIMING_TO_BIZ_FAIL";
            case 12669:
                return s != 9524 ? s == 10609 ? "RP_COPRESENCE_PRE_PRESENCE_RECEIVE_LATENCY" : "UNDEFINED_QPL_EVENT" : "RP_COPRESENCE_PRE_PRESENCE_SEND_LATENCY";
            case 12673:
                return s == 4996 ? "IG_LEAD_GEN_CONSUMER_FUNNEL_IG_LEAD_GEN_CONSUMER_EVENT" : "UNDEFINED_QPL_EVENT";
            case 12698:
                return s == 9979 ? "REACT_NATIVE_CENTRALIZED_TTRC_RN_GLOBAL_TTRC" : "UNDEFINED_QPL_EVENT";
            case 12705:
                return s == 8299 ? "WEARABLE_CALLING_PERFORMANCE_CALL_UI_TRACE" : "UNDEFINED_QPL_EVENT";
            case 12711:
                return s != 3589 ? s != 4194 ? s != 8141 ? s == 9327 ? "MESSENGER_SEARCH_CM_DIRECT_INVITES_PRESET_LIST_LOAD" : "UNDEFINED_QPL_EVENT" : "MESSENGER_SEARCH_CM_DIRECT_INVITES_SEE_MORE_LOAD" : "MESSENGER_SEARCH_CM_DIRECT_INVITES_QUERY_SEARCH" : "MESSENGER_SEARCH_CM_DIRECT_INVITES_INITIAL_MEMBER_LOAD";
            case 12727:
                return AbstractC62010RxK.A00(s);
            case 12737:
                return s != 3227 ? s != 10425 ? s != 13075 ? s == 15360 ? "FEED_ADS_SESSION_E2E" : "UNDEFINED_QPL_EVENT" : "FEED_ADS_CACHE_INVALIDATION_FROM_SERVER" : "FEED_ADS_FIRST_AD_VENDING" : "FEED_ADS_REQUEST_E2E";
            case 12739:
                return AbstractC61980Rwq.A00(s);
            case 12749:
                return s != 7418 ? s != 11774 ? s == 14544 ? "IG_AWARE_RELIABILITY_SAVE_INTERACTION" : "UNDEFINED_QPL_EVENT" : "IG_AWARE_RELIABILITY_SETUP_ON_DISK_STORE" : "IG_AWARE_RELIABILITY_LOAD_SAVED_INTERACTIONS";
            case 12751:
                return s != 1687 ? s != 7147 ? s != 7244 ? s == 7639 ? "ALOHA_ASSISTANT_CLIENT_PREPARE_FROM_SEARCH_AND_PLAY" : "UNDEFINED_QPL_EVENT" : "ALOHA_ASSISTANT_CLIENT_CREATE_CALL" : "ALOHA_ASSISTANT_CLIENT_ANSWER_CALL" : "ALOHA_ASSISTANT_CLIENT_END_CALL";
            case 12759:
                return s != 7005 ? s != 8590 ? s != 12844 ? s != 14253 ? s == 15902 ? "MWB_UNKNOWN_CONTACTS_ARMADILLO_GROUP_INVITE_JOIN" : "UNDEFINED_QPL_EVENT" : "MWB_UNKNOWN_CONTACTS_ARMADILLO_FETCH_SPAMD_MESSAGE_REQUESTS" : "MWB_UNKNOWN_CONTACTS_ARMADILLO_ARMADILLO_GROUP_ADDITION_PRIVACY_CHECK" : "MWB_UNKNOWN_CONTACTS_ARMADILLO_ARMADILLO_MESSAGE_SEND_PRIVACY_CHECK" : "MWB_UNKNOWN_CONTACTS_ARMADILLO_ACCEPT_ARMADILLO_MESSAGE_REQUEST";
            case 12766:
                return AbstractC62129Rzc.A00(s);
            case 12788:
                return s != 1424 ? s != 4841 ? s != 7438 ? s == 9993 ? "WEARABLE_KEYBOARD_TYPING" : "UNDEFINED_QPL_EVENT" : "WEARABLE_KEYBOARD_LAUNCH" : "WEARABLE_KEYBOARD_SUGGESTION_LATENCY" : "WEARABLE_KEYBOARD_SWIPE";
            case 12790:
                return s != 2997 ? s == 13689 ? "FB_REELS_DRAFT_FB_REELS_SAVE_DRAFT" : "UNDEFINED_QPL_EVENT" : "FB_REELS_DRAFT_FB_REELS_RESTORE_DRAFT_TO_EDITOR";
            case 12796:
                return AbstractC61968Rwe.A00(s);
            case 12797:
                return s != 2046 ? s != 2477 ? s != 13965 ? s != 14008 ? s == 14633 ? "FB_REELS_COMPOSER_REELS_COMPOSER_GALLERY_INITIAL_LOAD" : "UNDEFINED_QPL_EVENT" : "FB_REELS_COMPOSER_REELS_COMPOSER_LANDING_TTRC" : "FB_REELS_COMPOSER_REELS_COMPOSER_LANDING_TTRC_V3" : "FB_REELS_COMPOSER_REELS_COMPOSER_LANDING_CONTENT" : "FB_REELS_COMPOSER_REELS_COMPOSER_LANDING_PAGE_TTI";
            case 12807:
                return s == 1 ? "VIDEO_PLAYBACK_FETCH_LIFECYCLE" : "UNDEFINED_QPL_EVENT";
            case 12815:
                return s == 1984 ? "FBLITE_RETRIES_FBLITE_APP_RESTART" : "UNDEFINED_QPL_EVENT";
            case 12824:
                return s == 13668 ? "FBLITE_VIDEO_STALL_STALL" : "UNDEFINED_QPL_EVENT";
            case 12831:
                return s == 10435 ? "REACTIONS_V2_REACT_TO_MESSAGE" : "UNDEFINED_QPL_EVENT";
            case 12837:
                return s == 9288 ? "ACT_ECHO_MEDIA_BANK_SHARING_ARMADILLO_ACT_MEDIA_BANK_SHARING_DOWNLOAD" : "UNDEFINED_QPL_EVENT";
            case 12842:
                return s == 14300 ? "PLACE_PICKER_PLACE_PICKER_QPL_FUNNEL" : "UNDEFINED_QPL_EVENT";
            case 12855:
                return s != 1 ? s != 2 ? s != 8604 ? s != 13092 ? s == 13268 ? "VR_INTERACTION_TRACING_VDO_TEST" : "UNDEFINED_QPL_EVENT" : "VR_INTERACTION_TRACING_PEEKSHEET_LOAD" : "VR_INTERACTION_TRACING_OFFLINE_CACHE_JOB" : "VR_INTERACTION_TRACING_NAVIGATION" : "VR_INTERACTION_TRACING_INITIAL_LOAD";
            case 12877:
                return s == 12740 ? "PAGES_MOBILECONFIG_INITIALIZATION_PERFORMANCE" : "UNDEFINED_QPL_EVENT";
            case 12886:
                return s != 5168 ? s != 11627 ? s != 13340 ? s == 14991 ? "LABYRINTH_MOBILE_BEAGLE_FETCH_TPID" : "UNDEFINED_QPL_EVENT" : "LABYRINTH_MOBILE_BEAGLE_FETCH_BACKUP_STATUS" : "LABYRINTH_MOBILE_BEAGLE_ADD_DEVICE" : "LABYRINTH_MOBILE_BEAGLE_CREATE_VIRTUAL_DEVICE";
            case 12895:
                return s == 13454 ? "TOFU_METRICS_QUERY_API_FETCH" : "UNDEFINED_QPL_EVENT";
            case 12899:
                return s == 14147 ? "VIDEO_PLAYER_EXPERIMENT_SWITCHER_TTI" : "UNDEFINED_QPL_EVENT";
            case 12925:
                return s != 8629 ? s != 9128 ? s != 10034 ? s != 12984 ? s == 13910 ? "WEARABLE_MOTIONALGS_SESSION_UPLOAD_EVENT" : "UNDEFINED_QPL_EVENT" : "WU_RISOTTO_TOTAL" : "WU_RISOTTO_RESPONSES" : "WEARABLE_MOTIONALGS_GESTURE_EVENT_SDK_CLIENT_E2E_LATENCY" : "WEARABLE_MOTIONALGS_MILANDA_SERVER_MANAGED_MOBILE_ERRORS";
            case 12930:
                return s == 10766 ? "FB_SHOP_TAB_SERP_SERP_FEED_TTRC" : "UNDEFINED_QPL_EVENT";
            case 12975:
                return s != 3871 ? s == 6414 ? "PRODUCT_ARCHITECTURE_CP_GROUP_VISITS" : "UNDEFINED_QPL_EVENT" : "PRODUCT_ARCHITECTURE_CP_EDIT_GROUPS_FLOW";
            case 12985:
                return AbstractC61971Rwh.A00(s);
            case 13037:
                return AbstractC61841RuZ.A00(s);
            case 13056:
                return s == 7166 ? "PORTAL_TOUCH_PERF_TOUCH_RESPONSIVENESS" : "UNDEFINED_QPL_EVENT";
            case 13070:
                return s == 2843 ? "DOWNLOAD_YOUR_INFORMATION_DOWNLOAD_YOUR_INFORMATION_UI_ACTIONS" : "UNDEFINED_QPL_EVENT";
            case 13079:
                return s == 8394 ? "PRIVACY_FLOW_TRIGGER_PRIVACY_FLOW_TRIGGER_LAUNCH" : "UNDEFINED_QPL_EVENT";
            case 13083:
                return s != 9774 ? s == 10249 ? "RP_HEALTH_IG_START_CALL_OK_ANDROID" : "UNDEFINED_QPL_EVENT" : "RP_HEALTH_IG_SHARE_SCREEN_OK_ANDROID";
            case 13084:
                return s != 1 ? s == 14205 ? "ARTIFACTO_CLIENT_ERROR" : "UNDEFINED_QPL_EVENT" : "ARTIFACTO_CLIENT_OPERATION";
            case 13089:
                return AbstractC61890RvM.A00(s);
            case 13101:
                return s == 10723 ? "FB_CREATION_FOR_YOU_TRAY_FOR_YOU_TRAY_TTRC" : "UNDEFINED_QPL_EVENT";
            case 13133:
                return AbstractC62097Rz6.A00(s);
            case 13135:
                return s == 2503 ? "VPG_REMOTE_TRIMMER_SAVE_ACTION" : "UNDEFINED_QPL_EVENT";
            case 13150:
                return AbstractC61817RuB.A00(s);
            case 13166:
                return AbstractC62115RzO.A00(s);
            case 13205:
                return Ry4.A00(s);
            case 13218:
                return s != 3332 ? s != 11541 ? s != 12746 ? s == 15996 ? "WRIST_SOCIAL_WELLNESS_API_PERIODIC_UPLOAD_JOB" : "UNDEFINED_QPL_EVENT" : "WRIST_SOCIAL_WELLNESS_API_WELLNESS_DATA_UPSERT" : "WRIST_SOCIAL_WELLNESS_API_REQUIRED_WELLNESS_DATA_FETCH" : "WRIST_SOCIAL_WELLNESS_API_WELLNESS_DATA_FULL_PROCESSING";
            case 13229:
                return s != 8517 ? s == 10910 ? "FOS_ZERO_SDK_DEFAULT_SDK_FLOW" : "UNDEFINED_QPL_EVENT" : "FOS_ZERO_SDK_ZERO_BALANCE_DETECTION";
            case 13235:
                return AbstractC62073Ryi.A00(s);
            case 13243:
                return s == 4862 ? "PARFAIT_TRACE_COLLECTION" : "UNDEFINED_QPL_EVENT";
            case 13248:
                return AbstractC61935Rw7.A00(s);
            case 13252:
                return AbstractC62121RzU.A00(s);
            case 13256:
                return s == 1 ? "WHATSAPP_MWA_INFRA_FOA_PRESENCE" : "UNDEFINED_QPL_EVENT";
            case 13258:
                return s != 1 ? s != 2 ? s == 4012 ? "IGD_GENAI_GENAI_EVAL" : "UNDEFINED_QPL_EVENT" : "IGD_GENAI_GENAI_EVAL_END" : "IGD_GENAI_GENAI_EVAL_START";
            case 13271:
                return s == 4814 ? "FB_SHOPS_UCI_TTRC" : "UNDEFINED_QPL_EVENT";
            case 13290:
                return s == 15860 ? "ATTACHMENT_SECURITY_E2EE_ATTACHMENT_VALIDATION" : "UNDEFINED_QPL_EVENT";
            case 13303:
                return s != 1203 ? s != 2008 ? s != 4996 ? s != 7062 ? s != 8594 ? s == 14315 ? "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_GPS_LOCATION" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_CACHED_DATA_REQUEST" : "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_MAP_VIEW" : "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_TYPEAHEAD_SEARCH" : "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_DEFAULT_LOCATION" : "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_SERP_REQUEST";
            case 13314:
                return s != 1 ? s == 2 ? "URR_FRESHNESS_SCORE_PERSONALIZATION_LABEL_TIME" : "UNDEFINED_QPL_EVENT" : "URR_FRESHNESS_SCORE_PERSONALIZATION_DECISION_TIME";
            case 13320:
                return s == 14142 ? "MEDIA_VIEWER_ANDROID_MEDIA_VIEWER_STARTUP_TIME" : "UNDEFINED_QPL_EVENT";
            case 13327:
                return s != 1 ? s != 1011 ? s == 14370 ? "IG_SIGNALS_PREDICTION" : "UNDEFINED_QPL_EVENT" : "IG_SIGNALS_CASPER_PREDICTION" : "IG_SIGNALS_PYTORCH_LOAD";
            case 13336:
                return s != 2290 ? s == 6961 ? "IG_RELEVANCE_ODIN_PREDICT" : "UNDEFINED_QPL_EVENT" : "IG_RELEVANCE_ODIN_PREDICT_SCROLL";
            case 13337:
                return s != 23183 ? s == 29943 ? "NEWS_COMPASS_SNAX_SNAX_BOTTOM_SHEET_BOTTOM_LOAD" : "UNDEFINED_QPL_EVENT" : "NEWS_COMPASS_SNAX_SNAX_BOTTOM_SHEET_TOP_LOAD";
            case 13353:
                return s != 1152 ? s == 2065 ? "WORKROOMS_DESKTOP_CALENDAR_CREATE_MEETING" : "UNDEFINED_QPL_EVENT" : "WORKROOMS_DESKTOP_COMPANION_JOIN_VIA_WWW";
            case 13356:
                return AbstractC62057RyS.A00(s);
            case 13376:
                return s == 8102 ? "IG_ANDROID_LOCAL_GALLERY_SAVE_LOCAL_GALLERY_SAVE_IMAGE_METRICS" : "UNDEFINED_QPL_EVENT";
            case 13382:
                return s == 6510 ? "APP_PUSH_APP_PUSH" : "UNDEFINED_QPL_EVENT";
            case 13386:
                return s == 12314 ? "COMPLEX_BLOKS_STICKER_TOOLTIP_ACTION" : "UNDEFINED_QPL_EVENT";
            case 13415:
                return AbstractC61837RuV.A00(s);
            case 13418:
                return s == 1002 ? "LIGER_MANAGED_MOBILE_ERRORS_INVALID_SETTING" : "UNDEFINED_QPL_EVENT";
            case 13439:
                return s != 1069 ? s != 4629 ? s != 6991 ? s != 8939 ? s == 9355 ? "IG_ANDROID_CLIPS_RELIABILITY_CLIPS_FAILED_RESPONSE" : "UNDEFINED_QPL_EVENT" : "IG_ANDROID_CLIPS_RELIABILITY_CLIPS_EMPTY_RESPONSE" : "IG_ANDROID_CLIPS_RELIABILITY_CLIPS_RETRY" : "IG_ANDROID_CLIPS_RELIABILITY_CLIPS_SUCCESS_RESPONSE" : "IG_ANDROID_CLIPS_RELIABILITY_CLIPS_FETCH_FINISHED";
            case 13442:
                return s == 12896 ? "RP_WEB_PRODUCT_TOGGLE_LOCAL_VIDEO" : "UNDEFINED_QPL_EVENT";
            case 13450:
                return s != 1003 ? s == 15075 ? "WHATSAPP_WDS_INSTANCE_TTL_TEST" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_WDS_INSTANCE_TTL";
            case 13485:
                return s != 11735 ? s == 12925 ? "IG4A_BATTERY_BACKGROUND_COLDSTART" : "UNDEFINED_QPL_EVENT" : "IG4A_BATTERY_JOB_SERVICE";
            case 13502:
                return AbstractC62086Ryv.A00(s);
            case 13521:
                return s == 15054 ? "MARKETPLACE_FUNNEL_COMPOSER_QPL_FUNNEL" : "UNDEFINED_QPL_EVENT";
            case 13525:
                return s != 7903 ? s != 9218 ? s != 10836 ? s == 13077 ? "FEED_LITE_SESSION_END_FLD_FOREGROUND_SESSION_END" : "UNDEFINED_QPL_EVENT" : "FEED_LITE_SESSION_END_FLD_UNITY_SESSION_END" : "FEED_LITE_SESSION_END_FLD_APP_SESSION_END" : "FEED_LITE_SESSION_END_FLD_FEED_SESSION_END";
            case 13543:
                return s != 4749 ? s != 6803 ? s != 13946 ? s != 14146 ? s == 16349 ? "CORE_CALLING_ENTER_PIP" : "UNDEFINED_QPL_EVENT" : "CORE_CALLING_TOGGLE_VIDEO" : "CORE_CALLING_AUDIO_ROUTE" : "CORE_CALLING_END_CALL" : "CORE_CALLING_TOGGLE_MUTE";
            case 13544:
                return s != 7301 ? s == 14730 ? "HORIZON_ASSET_LIBRARY_HORIZON_ASSET_INGESTION_WITH_TYPE" : "UNDEFINED_QPL_EVENT" : "HORIZON_ASSET_LIBRARY_HORIZON_ASSET_SPAWNING_WITH_TYPE";
            case 13548:
                return s != 6261 ? s == 9989 ? "MSYS_TRACE_NEW_LOCAL_DEBUG" : "UNDEFINED_QPL_EVENT" : "MSYS_TRACE_NEW_MCI_MCD_TRACE_TYPE_CHECK";
            case 13550:
                return AbstractC61847Ruf.A00(s);
            case 13556:
                return s != 11178 ? s == 15684 ? "WHATSAPP_FUNNEL_LOGGING_TEXT_MESSAGE" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_FUNNEL_LOGGING_PTT_MESSAGE";
            case 13575:
                return s != 13561 ? s == 13860 ? "LITE_MESSAGING_USER_ACTIONS_LITE_MESSAGING_USER_ACTION" : "UNDEFINED_QPL_EVENT" : "LITE_MESSAGING_USER_ACTION_STORY_REPLY_TO_E2EE_THREAD";
            case 13606:
                return s == 3414 ? "COMMUNITY_REPUTATION_VOTE_SHEET_TTRC" : "UNDEFINED_QPL_EVENT";
            case 13610:
                return s == 15532 ? "WA_PRELINK_FUNNEL_AC_FLOW" : "UNDEFINED_QPL_EVENT";
            case 13621:
                return s == 7820 ? "FBLITE_CLIENT_VIDEO_VIDEO_LIFECYCLE" : "UNDEFINED_QPL_EVENT";
            case 13636:
                return s != 1083 ? s != 1503 ? s != 8667 ? s != 11803 ? s != 12307 ? s == 15926 ? "IG_CONTENT_FILTER_ENGINE_FIND_PATTERN_SINGLE_ON_ALL_DICT" : "UNDEFINED_QPL_EVENT" : "IG_CONTENT_FILTER_ENGINE_SPIN_UP_ENGINE" : "IG_CONTENT_FILTER_ENGINE_FIND_PATTERN_SINGLE" : "IG_CONTENT_FILTER_ENGINE_FIND_PATTERN_ALL_ON_ALL_DICT" : "IG_CONTENT_FILTER_ENGINE_ADD_REMOVE_PATTERN" : "IG_CONTENT_FILTER_ENGINE_FIND_PATTERN_ALL";
            case 13647:
                return s != 10211 ? s == 13705 ? "MESSENGER_HIGHLIGHTS_TAB_IMMERSIVE_SCROLLING" : "UNDEFINED_QPL_EVENT" : "MESSENGER_HIGHLIGHTS_TAB_IMMERSIVE_BIRTHDAY_REPLY_SUGGESTION_LOADING";
            case 13649:
                return s == 11424 ? "IGD_META_AI_VOICE_INITIAL_CONNECT" : "UNDEFINED_QPL_EVENT";
            case 13667:
                return AbstractC61821RuF.A00(s);
            case 13668:
                return AbstractC62039Rxn.A00(s);
            case 13678:
                return s == 8530 ? "SPARK_CROSS_TOOLS_MIRRORING" : "UNDEFINED_QPL_EVENT";
            case 13681:
                return AbstractC61861Rut.A00(s);
            case 13685:
                return s == 4913 ? "OCUI_PERF_JS_HEAP_MEMORY" : "UNDEFINED_QPL_EVENT";
            case 13694:
                return AbstractC62149Rzw.A00(s);
            case 13698:
                return s == 1293 ? "OCULUS_DEVELOPER_DATA_USE_DATA_USE_CHECKUP_FLOW" : "UNDEFINED_QPL_EVENT";
            case 13719:
                return s == 1 ? "HCS_M_ABCD_HCS_E_ABCD" : "UNDEFINED_QPL_EVENT";
            case 13737:
                return s != 3617 ? s == 8235 ? "INTERACTIVE_MEDIA_FEED_UNIT_USER_FLOW" : "UNDEFINED_QPL_EVENT" : "INTERACTIVE_MEDIA_IMAGE_DOWNLOAD_EVENT";
            case 13747:
                return AbstractC61823RuH.A00(s);
            case 13813:
                return s == 14027 ? "S393114_AD_IMPRESSION_DEBUG_REELS_AD_IN_HP1" : "UNDEFINED_QPL_EVENT";
            case 13825:
                return s != 2631 ? s == 5638 ? "SHOWREEL_COMPOSITION_INSTANCE_RENDERING_INFO" : "UNDEFINED_QPL_EVENT" : "SHOWREEL_COMPOSITION_INSTANCE_TTR";
            case 13826:
                return s == 3399 ? "SGX_FLOW_STREAM_CLIENT_SESSION" : "UNDEFINED_QPL_EVENT";
            case 13859:
                return s == 1 ? "LACRIMA_CRITICAL_PING" : "UNDEFINED_QPL_EVENT";
            case 13870:
                return s == 16026 ? "WEBI_NEWSFEED_WWW_GRAPHQL_EXECUTION" : "UNDEFINED_QPL_EVENT";
            case 13891:
                return s != 5052 ? s != 5174 ? s != 7238 ? s == 10209 ? "ANALYTICS_LOGGER_CELLAR_CLIENT_EVENTS_LIST" : "UNDEFINED_QPL_EVENT" : "ANALYTICS_LOGGER_CELLAR_DISCOVERY_READ_PATH" : "ANALYTICS_LOGGER_LSP_ANALYTICS" : "ANALYTICS_LOGGER_IG_ANALYTICS_LOGGER";
            case 13901:
                return s != 3863 ? s == 9565 ? "VR_DEVICE_CAPTURE_OCULUS_CAPTURE_SCREENSHOT" : "UNDEFINED_QPL_EVENT" : "VR_DEVICE_CAPTURE_OCULUS_CAPTURE_RECORDING";
            case 13904:
                return Ry5.A00(s);
            case 13907:
                return AbstractC61901RvZ.A00(s);
            case 13912:
                return s == 11743 ? "LEADGEN_UNIFIED_CLIENT_SIDE_LEADGEN_UNIFIED_CLIENT_SIDE" : "UNDEFINED_QPL_EVENT";
            case 13937:
                return s != 1 ? s == 9231 ? "MESSENGER_NOTES_MSGR_NOTES_MUSIC_SEARCH" : "UNDEFINED_QPL_EVENT" : "MESSENGER_NOTES_MSGR_NOTES_CREATION_LATENCY";
            case 13944:
                return s == 13823 ? "FB_CELLAR_FB_CELLAR_GRAPHQL_REPORTING" : "UNDEFINED_QPL_EVENT";
            case 13946:
                return s != 7762 ? s == 9839 ? "RANKING_SYNC_SERVER_SYNC_STATS" : "UNDEFINED_QPL_EVENT" : "RANKING_SYNC_CLIENT_SYNC_STATS";
            case 13949:
                return AbstractC61845Rud.A00(s);
            case 13952:
                return AbstractC61851Ruj.A00(s);
            case 13962:
                return AbstractC61834RuS.A00(s);
            case 13965:
                return AbstractC62034Rxi.A00(s);
            case 13970:
                return s != 3085 ? s != 3518 ? s != 9026 ? s != 9402 ? s == 11443 ? "IG_PROFILE_RELIABILITY_EDIT_PROFILE_INDIVIDUAL_ENDPOINT" : "UNDEFINED_QPL_EVENT" : "IG_PROFILE_RELIABILITY_EDIT_PROFILE_PICTURE" : "IG_PROFILE_RELIABILITY_EDIT_PROFILE" : "IG_PROFILE_RELIABILITY_EDIT_PROFILE_LINK" : "IG_PROFILE_RELIABILITY_EDIT_PROFILE_MUSIC";
            case 13989:
                return s == 1 ? "WHATSAPP_QPL_LISTENERS_WHATSAPP_QPL_LISTENERS" : "UNDEFINED_QPL_EVENT";
            case 14020:
                return AbstractC61899RvX.A00(s);
            case 14035:
                return AbstractC62008RxI.A00(s);
            case 14043:
                return s == 10275 ? "MESSENGER_SHOPS_PDP_TTI" : "UNDEFINED_QPL_EVENT";
            case 14070:
                return AbstractC62137Rzk.A00(s);
            case 14071:
                return s != 2342 ? s != 2615 ? s != 4157 ? s == 15176 ? "MESSENGER_END_TO_END_PRE_ARMADILLO_RENDER" : "UNDEFINED_QPL_EVENT" : "MESSENGER_END_TO_END_PRE_MESSAGE_SEND_SUCCESS" : "MESSENGER_END_TO_END_PRE_E2EE_MAILBOX_SYNC" : "LEGACY_ORCA_MESSAGE_SEND";
            case 14084:
                return s == 3177 ? "MEDIA_INFRA_REELS_HIPO_UPLOAD_RENDERING_ERROR" : "UNDEFINED_QPL_EVENT";
            case 14102:
                return s == 1 ? "INSTAGRAM_SMB_INSIGHTS_STORY_INSIGHTS_TTRC" : "UNDEFINED_QPL_EVENT";
            case 14109:
                return s == 16198 ? "WA_WFL_AL_AC_FLOW" : "UNDEFINED_QPL_EVENT";
            case 14137:
                return s != 1385 ? s == 1395 ? "MOBILE_NETWORK_STACK_HTTP_CONNECTION" : "UNDEFINED_QPL_EVENT" : "MOBILE_NETWORK_STACK_HTTP_REQUEST";
            case 14143:
                return s == 1 ? "WHATSAPP_SEARCH_WHATSAPP_GLOBAL_SEARCH" : "UNDEFINED_QPL_EVENT";
            case 14154:
                return s != 2955 ? s != 5217 ? s != 7566 ? s != 9353 ? s != 12020 ? s == 14007 ? "WHATSAPP_WAFFLE_CONTEXTUAL_CTA" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_WAFFLE_CONTEXTUAL_UPSELL" : "WHATSAPP_WAFFLE_AUDIENCE_SELECTOR" : "WHATSAPP_WAFFLE_LINKING" : "WHATSAPP_WAFFLE_STATUS_PRIVACY_SETTINGS_DETAIL" : "WHATSAPP_WAFFLE_CROSSPOST";
            case 14161:
                return s != 1337 ? s != 1402 ? s != 2054 ? s != 13426 ? s == 14533 ? "ALOHA_AMBIENT_USER_SWITCH_FEED_LOAD" : "UNDEFINED_QPL_EVENT" : "ALOHA_AMBIENT_INITIAL_FEED_LOAD" : "ALOHA_AMBIENT_CONTENT_PROVIDER_OPERATION" : "ALOHA_AMBIENT_UPDATE_FEED" : "ALOHA_AMBIENT_MODULE_PUBLISH_TIME";
            case 14175:
                return s == 10148 ? "BIZ_INSIGHTS_USERS_LOGGING_ROOT_LOGGING" : "UNDEFINED_QPL_EVENT";
            case 14187:
                return s != 2682 ? s != 5632 ? s == 10562 ? "FX_GROWTH_FX_NATIVE_AUTH_TOKEN_VERIFIER_PROFILING" : "UNDEFINED_QPL_EVENT" : "FX_GROWTH_FX_BLOKS_LAUNCHER_PROFILING" : "FX_GROWTH_XE_GROWTH_UPSELL_LAUNCH";
            case 14194:
                return s != 2869 ? s == 15625 ? "FB_SUBSCRIPTIONS_USER_FB_SUBSCRIPTION_FLOW" : "UNDEFINED_QPL_EVENT" : "FB_SUBSCRIPTIONS_FUBS_PURCHASE_FUNNEL";
            case 14203:
                return s != 2417 ? s != 8619 ? s != 10197 ? s != 12464 ? s != 14064 ? s == 14213 ? "HYPERSPACE_PERF_HYPERSPACE_LATENCY" : "UNDEFINED_QPL_EVENT" : "HYPERSPACE_PERF_HYPERSPACE_ERROR" : "HYPERSPACE_PERF_UNIT_TESTING" : "HYPERSPACE_PERF_ACCOUNT_UPDATE_FLOW" : "HYPERSPACE_PERF_START_OUTGOING_CONNECTION_FLOW" : "HYPERSPACE_PERF_ACCEPT_INCOMING_CONNECTION_FLOW";
            case 14206:
                return s == 7092 ? "OCULUS_SYSTEM_UPDATER_TRAIN_DOWNLOAD_INSTALL" : "UNDEFINED_QPL_EVENT";
            case 14211:
                return s == 1442 ? "ACHIEVEMENTS_ACHIEVEMENTS_HUB_TTRC" : "UNDEFINED_QPL_EVENT";
            case 14221:
                return s == 15067 ? "GEMSTONE_SHARED_INTERESTS_GEMSTONE_SHARED_INTERESTS_INITIAL_LOAD_TTRC_ANDROID" : "UNDEFINED_QPL_EVENT";
            case 14235:
                return S0O.A00(s);
            case 14266:
                return s == 4705 ? "PORTAL_SCROLL_PERF_PORTAL_SCROLL_PERF" : "UNDEFINED_QPL_EVENT";
            case 14267:
                return s != 3978 ? s != 11411 ? s == 12681 ? "REALTIME_GRAPH_SERVICES_REALTIME_GRAPH_SERVICE_QUERY_EXECUTION" : "UNDEFINED_QPL_EVENT" : "REALTIME_GRAPH_SERVICES_REALTIME_GRAPH_SERVICE_QUERY_RESPONSE" : "REALTIME_GRAPH_SERVICES_REALTIME_GRAPH_SERVICE_QUERY_SUBSCRIBE";
            case 14289:
                return AbstractC62046Rxu.A00(s);
            case 14300:
                return AbstractC62021RxV.A00(s);
            case 14315:
                return s == 9589 ? "VR_PRIVACY_CHECKUP_VR_PRIVACY_CHECKUP_INIT_LOADING_TIME" : "UNDEFINED_QPL_EVENT";
            case 14317:
                return s == 1 ? "USF_SETTINGS_CONTROLLER_LOAD" : "UNDEFINED_QPL_EVENT";
            case 14323:
                return s == 8096 ? "HUBBLE_HUBBLE_UNEXPECTED_EVENT" : "UNDEFINED_QPL_EVENT";
            case 14347:
                return s == 1 ? "SMARTFETCH_PREFETCH" : "UNDEFINED_QPL_EVENT";
            case 14361:
                return s == 4651 ? "IG_PLAYBACK_MANAGED_MOBILE_ERRORS_ANDROID_VIDEO_PLAYBACK_UNEXPECTED_EVENT" : "UNDEFINED_QPL_EVENT";
            case 14371:
                return s != 4444 ? s != 11126 ? s != 13205 ? s == 15682 ? "IG_CLIPS_FUNCTIONAL_RELIABILITY_LIKE_TAPPED" : "UNDEFINED_QPL_EVENT" : "IG_CLIPS_FUNCTIONAL_RELIABILITY_SAVE_TAPPED" : "IG_CLIPS_FUNCTIONAL_RELIABILITY_SHARE_TAPPED" : "IG_CLIPS_FUNCTIONAL_RELIABILITY_COMMENT_TAPPED";
            case 14372:
                return S0T.A00(s);
            case 14378:
                return s != 7606 ? s != 10554 ? s != 10632 ? s != 10666 ? s != 11596 ? s == 12075 ? "WEARABLE_AUTOSHARING_AUTOSHARING_FETCH_THREAD_SETTINGS" : "UNDEFINED_QPL_EVENT" : "WEARABLE_AUTOSHARING_AUTOSHARING_SUBMIT_THREAD_SETTING" : "WEARABLE_AUTOSHARING_AUTOSHARING_UPLOAD_JOB" : "WEARABLE_AUTOSHARING_AUTOSHARING_SETTINGS_FRAGMENT_LOAD" : "WEARABLE_AUTOSHARING_AUTOSHARING_DELETE_THREAD_SETTING" : "WEARABLE_AUTOSHARING_AUTOSHARING_FRIENDS_FRAGMENT_LOAD";
            case 14406:
                return s != 5506 ? s == 12634 ? "RIB_RELIABILITY_ERROR" : "UNDEFINED_QPL_EVENT" : "RIB_RELIABILITY_INFO";
            case 14412:
                return s != 6597 ? s == 15815 ? "IG_DIRECT_GEN_AI_CREATE_AI_STICKER_REQUEST" : "UNDEFINED_QPL_EVENT" : "IG_DIRECT_GEN_AI_DOWNLOAD_AI_STICKER_EVENT";
            case 14417:
                return s == 6327 ? "CF_MEDIA_E2EE_MEDIA_S2S" : "UNDEFINED_QPL_EVENT";
            case 14445:
                return s != 13956 ? s != 14523 ? s == 15942 ? "TIGON_MANAGED_MOBILE_ERRORS_BOGUS_SAMPLE_WEIGHT" : "UNDEFINED_QPL_EVENT" : "TIGON_MANAGED_MOBILE_ERRORS_MHR_LOGGING_DISABLED" : "TIGON_MANAGED_MOBILE_ERRORS_UNINITIALIZED_LOGGERS";
            case 14447:
                return AbstractC62151Rzy.A00(s);
            case 14450:
                return s != 1309 ? s != 4319 ? s != 11892 ? s != 13742 ? s == 14782 ? "CHANNELS_CHANNEL_JOIN_SHEET_LOAD" : "UNDEFINED_QPL_EVENT" : "CHANNELS_CHANNEL_JOIN_FUNNEL" : "CHANNELS_CHANNEL_OPEN" : "CHANNELS_CHANNEL_CREATE" : "CHANNELS_CHANNEL_JOIN";
            case 14464:
                return S08.A00(s);
            case 14472:
                return s != 7313 ? s != 7596 ? s == 14206 ? "MWB_REPORT_REVIEW_EFFICIENCY_LAUNCH_FRX_FLOW" : "UNDEFINED_QPL_EVENT" : "MWB_REPORT_REVIEW_EFFICIENCY_VIEW_SUPPORT_INBOX" : "MWB_REPORT_REVIEW_EFFICIENCY_SUBMIT_REPORT";
            case 14486:
                return s == 9890 ? "MR_TRAVEL_APPLICATION_INVITES_VIEW" : "UNDEFINED_QPL_EVENT";
            case 14503:
                return s == 16012 ? "CHECKOUT_WITH_META_PURCHASE_FUNNEL" : "UNDEFINED_QPL_EVENT";
            case 14506:
                return s == 15214 ? "MUSIC_STICKER_PERF" : "UNDEFINED_QPL_EVENT";
            case 14517:
                return AbstractC62052RyN.A00(s);
            case 14541:
                return s != 1365 ? s != 3164 ? s == 10745 ? "FBLITE_TAM_DATA_SAVER_REMINDER" : "UNDEFINED_QPL_EVENT" : "FBLITE_TAM_FBLITE_DATA_USAGE" : "FBLITE_TAM_NO_CONNECTION_DIALOG";
            case 14547:
                return s == 1 ? "FBLITE_SECURITY_FBLITE_SIGNATURE" : "UNDEFINED_QPL_EVENT";
            case 14627:
                return s != 1006 ? s != 4256 ? s != 4269 ? s == 13555 ? "INSTREAM_ADS_IMPRESSION" : "UNDEFINED_QPL_EVENT" : "INSTREAM_ADS_SCRUBBERDOT_FETCH" : "INSTREAM_ADS_AD_CLICK" : "INSTREAM_ADS_AD_PLAY";
            case 14632:
                return s == 1 ? "NUBBEL_TEST_ONE_OF_MY_EVENTS" : "UNDEFINED_QPL_EVENT";
            case 14639:
                return s != 1 ? s != 12769 ? s == 15509 ? "IGD_PRIVACY_EXPERIENCES_SECURITY_ALERT_SYNC" : "UNDEFINED_QPL_EVENT" : "IGD_PRIVACY_EXPERIENCES_SECURITY_ALERT_INIT" : "IGD_PRIVACY_EXPERIENCES_SECURITY_ALERT_TRIGGER";
            case 14646:
                return s != 1 ? s == 5668 ? "MEM_CONNECTION_SERVER_DISCONNECT" : "UNDEFINED_QPL_EVENT" : "MEM_CONNECTION_DISCONNECT";
            case 14648:
                return AbstractC62005RxF.A00(s);
            case 14657:
                return s != 8250 ? s == 15518 ? "META_MEDIA_COMPOSITION_KIT_MMCK_LOAD_ASSET" : "UNDEFINED_QPL_EVENT" : "META_MEDIA_COMPOSITION_KIT_FRAME_RENDER";
            case 14685:
                return s != 5746 ? s == 7593 ? "VR_HORIZON_COMMUNICATOR_DEEPLINK_THREAD_VIEW" : "UNDEFINED_QPL_EVENT" : "VR_HORIZON_AVATAR_EDITOR_OPEN_FROM_PUI";
            case 14687:
                return s != 6900 ? s != 8057 ? s != 10482 ? s != 13854 ? s == 13975 ? "IG_PROFESSIONAL_HOME_IG_PRO_DASH_FUNNEL" : "UNDEFINED_QPL_EVENT" : "IG_PROFESSIONAL_HOME_IG_PROFESSIONAL_HOME_ADDITIONAL_RESOURCES_SURFACE_TTI" : "IG_PROFESSIONAL_HOME_IG_PROFESSIONAL_HOME_TTI" : "IG_PROFESSIONAL_HOME_IG_PROFESSIONAL_HOME_ALL_TOOLS_TTI" : "IG_PROFESSIONAL_HOME_IG_PRO_DASH_ENTRYPOINT_TTI";
            case 14705:
                return s == 7739 ? "AOI_SWITCH_FROM_BETA_TO_CURRENT_VERSION" : "UNDEFINED_QPL_EVENT";
            case 14720:
                return AbstractC62087Ryw.A00(s);
            case 14755:
                return s != 5150 ? s == 13672 ? "NPR_IDENTIFY_LANGUAGE" : "UNDEFINED_QPL_EVENT" : "NPR_FBLITE_IDENTIFY_LANGUAGE";
            case 14767:
                return s == 9547 ? "IG_ANDROID_WEBP_UPLOAD_WEBP_UPLOAD_IMAGE_METRICS" : "UNDEFINED_QPL_EVENT";
            case 14790:
                return s != 9646 ? s == 15702 ? "ALOHA_MESSENGER_OUTGOING_CALL_LATENCY" : "UNDEFINED_QPL_EVENT" : "ALOHA_MESSENGER_INCOMING_CALL_LATENCY";
            case 14795:
                return AbstractC61985Rwv.A00(s);
            case 14809:
                return AbstractC61865Rux.A00(s);
            case 14812:
                return s != 1655 ? s != 6786 ? s == 6812 ? "PORTAL_WORKPLACE_LIVE_HOME_SCREEN_LOAD" : "UNDEFINED_QPL_EVENT" : "PORTAL_WORKPLACE_LIVE_PERF_APP_HOT_START" : "PORTAL_WORKPLACE_LIVE_PERF_APP_WARM_START";
            case 14825:
                return s != 6915 ? s != 7328 ? s != 10797 ? s == 15005 ? "HN_CAPTURE_MODE_SWITCH" : "UNDEFINED_QPL_EVENT" : "HN_CAPTURE_APP_START" : "HN_CAPTURE_HN_CAPTURE_QPL_EVENT" : "HN_CAPTURE_HN_MEDIA_DISPLAY_LATENCY_QPL_EVENT";
            case 14831:
                return s == 2035 ? "IG_STORIES_TO_REELS_IG_STORIES_TO_REELS_CREATION" : "UNDEFINED_QPL_EVENT";
            case 14837:
                return s == 12281 ? "ASSISTANT_SIMMY_INTERACTION_ASSISTANT_INTERACTION" : "UNDEFINED_QPL_EVENT";
            case 14859:
                return s != 1 ? s == 2 ? "FB_NETWORK_XMA_FBN_HUMMINGBIRD_XMA_RENDER" : "UNDEFINED_QPL_EVENT" : "FB_NETWORK_XMA_FBN_HUMMINGBIRD_REQUEST";
            case 14865:
                return s != 1230 ? s != 13297 ? s == 16193 ? "FBRPC_DEEPLINK_FBRPC_UNEXPECTED_INTERNAL_URL" : "UNDEFINED_QPL_EVENT" : "FBRPC_DEEPLINK_IS_INTENT_INTERNAL" : "FBRPC_DEEPLINK_FBRPC_PROCESSING_FUNNEL";
            case 14869:
                return AbstractC61961RwX.A00(s);
            case 14886:
                return s == 11596 ? "MWB_EF_CEI_GROUP_EXPERIMENTS_GROUP_THREAD_RESTRICTED_ACCESS" : "UNDEFINED_QPL_EVENT";
            case 14893:
                return AbstractC61945RwH.A00(s);
            case 14895:
                return AbstractC61972Rwi.A00(s);
            case 14906:
                return s == 13047 ? "MESSENGER_KEY_TRANSPARENCY_VERIFY_DEVICE_IDENTITY_KEYS" : "UNDEFINED_QPL_EVENT";
            case 14951:
                return AbstractC61842Rua.A00(s);
            case 14959:
                return s != 1244 ? s == 10898 ? "ASSISTANT_SHARE_AI_HIGHLIGHTS_GALLERY_TAB_LOAD" : "UNDEFINED_QPL_EVENT" : "ASSISTANT_SHARE_AI_HIGHLIGHTS_GALLERY_E2E";
            case 14960:
                return s == 1565 ? "IG_REELS_PLATFORM_SDK_SHARE_THIRD_PARTY_VIDEO" : "UNDEFINED_QPL_EVENT";
            case 14991:
                return AbstractC62037Rxl.A00(s);
            case 15012:
                return s != 1 ? s == 2 ? "FRESHNESS_SCORE_PERSONALIZATION_LABEL_TIME" : "UNDEFINED_QPL_EVENT" : "FRESHNESS_SCORE_PERSONALIZATION_DECISION_TIME";
            case 15023:
                return s == 13875 ? "EMERGING_BUSINESS_STARS_PURCHASE_N_FUND_WALLET_STARS_PURCHASE_N_FUND_WALLET" : "UNDEFINED_QPL_EVENT";
            case 15029:
                return s != 1 ? s != 1697 ? s != 7039 ? s != 12188 ? s == 14664 ? "SHOPS_ADS_THIRD_PARTY_MARKETING_TAGS_SUPPORT_ADD_MERCHANT_MARKETING_TAGS_ON_ADD_TO_CART" : "UNDEFINED_QPL_EVENT" : "SHOPS_ADS_THIRD_PARTY_MARKETING_TAGS_SUPPORT_ADD_MERCHANT_MARKETING_TAGS_ON_OPEN_STOREFRONT" : "SHOPS_ADS_THIRD_PARTY_MARKETING_TAGS_SUPPORT_ADD_MERCHANT_MARKETING_TAGS_ON_OPEN_COLLECTIONS" : "SHOPS_ADS_THIRD_PARTY_MARKETING_TAGS_SUPPORT_COMMERCE_THIRD_PARTY_MARKETING_TAGS_CHECKOUT" : "SHOPS_ADS_THIRD_PARTY_MARKETING_TAGS_SUPPORT_ADD_MERCHANT_MARKETING_TAGS_ON_OPEN_PDP";
            case 15030:
                return s == 2577 ? "FB4A_COMPOSER_FOUNDATION_MME_EMPTY_AUDIENCE_LIST" : "UNDEFINED_QPL_EVENT";
            case 15043:
                return s != 9986 ? s == 10944 ? "IMAGINED_FOR_YOU_ASYNC_ACTION" : "UNDEFINED_QPL_EVENT" : "IMAGINED_FOR_YOU_MIFU_MUSTACHE_TEXT_UNEXPECTED_EVENT";
            case 15049:
                return s == 8150 ? "WEARABLE_STICKER_BUNDLE_DB_WORKER_STICKER_BUNDLE_DB_WORK" : "UNDEFINED_QPL_EVENT";
            case 15061:
                return s == 14085 ? "FEED_NETWORK_PREDICTION_FB4A_FEED_NETWORK_PREDICTION" : "UNDEFINED_QPL_EVENT";
            case 15062:
                return s != 4627 ? s == 12059 ? "LOGIN_OAUTH_FAIL_OTHER" : "UNDEFINED_QPL_EVENT" : "LOGIN_OAUTH_SUCCESS";
            case 15098:
                return AbstractC62075Ryk.A00(s);
            case 15102:
                return s != 6345 ? s != 6561 ? s != 10508 ? s == 13431 ? "XR_MEMORY_FRAMES_FRAME_LOAD" : "UNDEFINED_QPL_EVENT" : "XR_MEMORY_FRAMES_LOAD_ALBUM" : "XR_MEMORY_FRAMES_AUTH_ACCOUNT_CHECK" : "XR_MEMORY_FRAMES_LOAD_ALBUMS";
            case 15111:
                return s == 4985 ? "FBLITE_UNITY_IMAGE_PERF_IMAGE_FETCH" : "UNDEFINED_QPL_EVENT";
            case 15113:
                return s != 7145 ? s == 12603 ? "WHATSAPP_MEDIA_IMAGE_VIDEO_USER_JOURNEY" : "UNDEFINED_QPL_EVENT" : "WHATSAPP_MEDIA_EXPRESSION_TRAY_USER_JOURNEY";
            case 15114:
                return s == 10235 ? "IGD_NAVIGATION_LATENCY_DIRECT_INBOX" : "UNDEFINED_QPL_EVENT";
            case 15116:
                return s != 6696 ? s != 8833 ? s == 13335 ? "OCULUS_SEARCH_TYPEAHEAD" : "UNDEFINED_QPL_EVENT" : "OCULUS_SEARCH_TIME_TO_RESULTS" : "OCULUS_SEARCH_TIME_TO_FLOW";
            case 15123:
                return s == 2878 ? "IGD_CHANNELS_OCTANE_HOLE_DETECTION" : "UNDEFINED_QPL_EVENT";
            case 15125:
                return s == 11640 ? "IG_ANDROID_RAGESHAKE_IG_ANDROID_RAGESHAKE_USER_FLOW" : "UNDEFINED_QPL_EVENT";
            case 15142:
                return s != 6912 ? s != 7956 ? s != 7985 ? s == 15828 ? "SGX_LS_PHONE_TO_GLASSES_WARM_START" : "UNDEFINED_QPL_EVENT" : "SGX_LS_GLASSES_WIDGET_INITIALIZATION" : "SGX_LS_GLASSES_LINK_SWITCH" : "SGX_LS_PHONE_TO_GLASSES_COLD_START";
            case 15147:
                return s != 13937 ? s == 13996 ? "FBAI_EXPERIENCES_PRODUCT_UC_APPEAL_VIDEO_UPLOAD" : "UNDEFINED_QPL_EVENT" : "FBAI_EXPERIENCES_PRODUCT_UC_APPEAL_SUBMIT";
            case 15148:
                return s == 7945 ? "MESSENGER_ROOMS_CONNECTION_CREATE_ROOM" : "UNDEFINED_QPL_EVENT";
            case 15149:
                return s != 2947 ? s != 9086 ? s != 11557 ? s != 13327 ? s == 16354 ? "MESSAGING_PAYMENTS_BLOKS_FORM_PAGE" : "UNDEFINED_QPL_EVENT" : "MESSAGING_PAYMENTS_IG_P2M_CHAT_PAYMENT" : "MESSAGING_PAYMENTS_IG_P2M_ORDER_DETAILS" : "MESSAGING_PAYMENTS_IG_P2M_ORDER_CREATION" : "MESSAGING_PAYMENTS_IG_P2M_PAYOUT_SETTINGS";
            case 15169:
                return s == 1 ? "IG_LITHO_COMPONENT_RENDER" : "UNDEFINED_QPL_EVENT";
            case 15188:
                return s == 8998 ? "FRL_REGISTRATION_CHECK_CONTACT_POINT_AVAILABILITY" : "UNDEFINED_QPL_EVENT";
            case 15190:
                return s != 2435 ? s != 9960 ? s == 14276 ? "OCULUS_PRIVACY_PERMISSIONS_HISTORY_PERMISSION_HISTORY_HOME_LOAD" : "UNDEFINED_QPL_EVENT" : "OCULUS_PRIVACY_PERMISSIONS_HISTORY_PERMISSION_HISTORY_APP_LOAD" : "OCULUS_PRIVACY_PERMISSIONS_HISTORY_PERMISSION_HISTORY_USAGE_LOAD";
            case 15213:
                return s != 6357 ? s != 7285 ? s != 7723 ? s == 12703 ? "IG_ANDROID_EXPLORE_GRID_ITEM_LOAD" : "UNDEFINED_QPL_EVENT" : "IG_ANDROID_EXPLORE_GRID_TAIL_LOAD" : "IG_ANDROID_EXPLORE_GRID_HEAD_LOAD" : "IG_ANDROID_EXPLORE_GRID_RELOAD";
            case 15235:
                return AbstractC62120RzT.A00(s);
            case 15237:
                return s == 6606 ? "IG_ANDROID_VIEWPOINT_ACTION_VIEWPOINT_ACTION" : "UNDEFINED_QPL_EVENT";
            case 15238:
                return s == 10290 ? "WEARABLE_COMMS_POWER_MAILBOX_HIGH_POWER" : "UNDEFINED_QPL_EVENT";
            case 15274:
                return s == 7198 ? "SYSTEM_UX_FILE_VIEWER_INIT" : "UNDEFINED_QPL_EVENT";
            case 15276:
                return AbstractC61959RwV.A00(s);
            case 15281:
                return s == 1 ? "IG_ANDROID_PARSING_PARSE_NETWORK_RESPONSE" : "UNDEFINED_QPL_EVENT";
            case 15288:
                return s != 1487 ? s != 2517 ? s != 5975 ? s != 9977 ? s != 11379 ? s == 13172 ? "BUSINESS_SETTINGS_BUSINESS_SETUP_FLOW" : "UNDEFINED_QPL_EVENT" : "BUSINESS_SETTINGS_BUSINESS_PORTFOLIO_REQUEST_TO_SHARE_PAGE" : "BUSINESS_SETTINGS_MOBILE_BP_CREATION_FLOW" : "BUSINESS_SETTINGS_BUSINESS_PORTFOLIO_EXPLICIT_CREATION_FLOW" : "BUSINESS_SETTINGS_BUSINESS_PORTFOLIO_CLAIM_EXISTING_PAGE" : "BUSINESS_SETTINGS_BUSINESS_PORTFOLIO_CLAIM_INSTAGRAM";
            case 15290:
                return s == 13318 ? "CLOUD_GAMING_MOBILE_STREAM_LOAD" : "UNDEFINED_QPL_EVENT";
            case 15295:
                return s != 1 ? s == 2 ? "RESET_TO_FEED_PERSONALIZATION_LABEL_TIME" : "UNDEFINED_QPL_EVENT" : "RESET_TO_FEED_PERSONALIZATION_DECISION_TIME";
            case 15300:
                return s == 5476 ? "IGD_BUSINESS_ORDERS_SUGGESTION_RENDER" : "UNDEFINED_QPL_EVENT";
            case 15325:
                return s == 3378 ? "WHATSAPP_X_FAMILY_EVENT_LINKING" : "UNDEFINED_QPL_EVENT";
            case 15343:
                return S0I.A00(s);
            case 15347:
                return s != 3213 ? s == 12540 ? "CLIENT_FORMAT_RANKING_INLINE_COMMENT" : "UNDEFINED_QPL_EVENT" : "CLIENT_FORMAT_RANKING_PRIMARY_TEXT_LINES";
            case 15361:
                return s != 1517 ? s != 4926 ? s != 7030 ? s != 9352 ? s == 13680 ? "IG_ACTIVITY_FEED_LOCAL_NOTIFICATION_DATA_UPDATE" : "UNDEFINED_QPL_EVENT" : "IG_ACTIVITY_FEED_LOCAL_NOTIFICATION_LOCAL_DATA_LOAD" : "IG_ACTIVITY_FEED_LOCAL_NOTIFICATION_REMOTE_DATA_LOAD" : "IG_ACTIVITY_FEED_LOCAL_NOTIFICATION_PAGE_LOAD" : "IG_ACTIVITY_FEED_LOCAL_NOTIFICATION_DATA_LOAD";
            case 15374:
                return s == 13188 ? "GAMING_VIDEO_ENGAGE_WITH_LIVE_GAMING_VIDEO_FLOW" : "UNDEFINED_QPL_EVENT";
            case 15386:
                return s != 11047 ? s == 15078 ? "IAB_SEARCH_IAB_SEARCH" : "UNDEFINED_QPL_EVENT" : "IAB_SEARCH_IAB_SEARCH_PAGE_NAVIGATION";
            case 15395:
                return s == 13422 ? "AR_EFFECT_CUSTOM_BG_INTEGRITY_UPLOAD_MESSENGER_RTC" : "UNDEFINED_QPL_EVENT";
            case 15411:
                return s == 8452 ? "QPL_TEST_FIVE_TEST_VINNIE_3" : "UNDEFINED_QPL_EVENT";
            case 15432:
                return s != 1 ? s == 2 ? "STARTUP_FRESHNESS_SCORE_PERSONALIZATION_LABEL_TIME" : "UNDEFINED_QPL_EVENT" : "STARTUP_FRESHNESS_SCORE_PERSONALIZATION_DECISION_TIME";
            case 15434:
                return AbstractC61881RvD.A00(s);
            case 15436:
                return s == 2156 ? "IG_SURFACE_NOT_LOADING_GRID_REQUEST" : "UNDEFINED_QPL_EVENT";
            case 15443:
                return s == 9154 ? "MESSENGER_ANDROID_FNRL_INBOX_NOT_LOADING" : "UNDEFINED_QPL_EVENT";
            case 15447:
                return s != 3328 ? s == 8719 ? "TAIL_LOAD_DEFAULT_TAIL_LOAD_ANDROID" : "UNDEFINED_QPL_EVENT" : "TAIL_LOAD_SIMPLE_TAIL_LOAD_ANDROID";
            case 15453:
                return s != 2084 ? s != 2255 ? s == 8242 ? "FB_SHOP_TAB_FEED_PAGINATION_TTI" : "UNDEFINED_QPL_EVENT" : "FB_SHOP_TAB_NOTIF_UPDATE_TTRC" : "FB_SHOP_TAB_HOME_FEED_TTRC";
            case 15456:
                return s != 1577 ? s != 5955 ? s != 14604 ? s == 14883 ? "HORIZON_WORKROOMS_PORTAL_REACTIONS" : "UNDEFINED_QPL_EVENT" : "HORIZON_WORKROOMS_PORTAL_JOIN_AND_LEAVE_ROOM" : "HORIZON_WORKROOMS_PORTAL_RAISE_HANDS" : "HORIZON_WORKROOMS_PORTAL_QUICK_JOIN";
            case 15468:
                return Ry1.A00(s);
            case 15477:
                return s != 5453 ? s == 13167 ? "IG_APPRECIATION_GIFTS_BOTTOM_SHEET_LOAD" : "UNDEFINED_QPL_EVENT" : "IG_APPRECIATION_SEND_GIFT";
            case 15486:
                return s != 1707 ? s != 10413 ? s == 15741 ? "AR_SHELL_IPC_RENDER" : "UNDEFINED_QPL_EVENT" : "AR_SHELL_COAPP_RENDER_FRAME_LOOP" : "AR_SHELL_FRAME_LOOP";
            case 15535:
                return AbstractC61836RuU.A00(s);
            case 15562:
                return s == 1067 ? "AD_EXTENSIONS_USER_FUNNEL_LOGGING" : "UNDEFINED_QPL_EVENT";
            case 15567:
                return s == 1 ? "WEBLITE_CRAWLERS_PERF_WEBLITE_CRAWLER_SINGLE_SESSION_EVENT" : "UNDEFINED_QPL_EVENT";
            case 15572:
                return s != 2185 ? s != 6165 ? s != 8112 ? s != 11066 ? s != 13602 ? s == 15245 ? "VROS_TELEMETRY_TTF_CLICK_FOR_START" : "UNDEFINED_QPL_EVENT" : "VROS_TELEMETRY_TTF_UNMOUNT" : "VROS_TELEMETRY_TTF_START" : "VROS_TELEMETRY_TTF_READY" : "VROS_TELEMETRY_TTF_MOUNT" : "VROS_TELEMETRY_TTF_FIRST_FRAME_RENDERED";
            case 15584:
                return AbstractC62043Rxr.A00(s);
            case 15589:
                return AbstractC61989Rwz.A00(s);
            case 15594:
                return s == 15113 ? "HYPERREAL_XR_APP_APP_LAUNCH" : "UNDEFINED_QPL_EVENT";
            case 15605:
                return s != 1 ? s != 2839 ? s != 3777 ? s == 4504 ? "IG_ANDROID_MESSAGE_QUEUE_MESSAGES_DURING_CAMERA_OPEN" : "UNDEFINED_QPL_EVENT" : "IG_ANDROID_MESSAGE_QUEUE_MESSAGES_DURING_SCROLL" : "IG_ANDROID_MESSAGE_QUEUE_CAMERA_LARGE_FRAME_DROP" : "IG_ANDROID_MESSAGE_QUEUE_LARGE_FRAME_DROP";
            case 15638:
                return s == 6429 ? "INSTAGRAM_COMMUNITY_ACTOR_FEEDBACK_BLOKS_FEEDBACK_FUNNEL" : "UNDEFINED_QPL_EVENT";
            case 15662:
                return s != 2223 ? s != 13107 ? s == 15713 ? "WEARABLE_STORIES_HUB_WA_APP_START_AND_STORIES_LOAD" : "UNDEFINED_QPL_EVENT" : "WEARABLE_STORIES_HUB_WA_STORIES_VIEWER_TRANSITION_TTRC" : "WEARABLE_STORIES_HUB_WA_STORIES_VIEWER_TTRC";
            case 15670:
                return AbstractC62150Rzx.A00(s);
            case 15688:
                return s != 5943 ? s == 13276 ? "META_AI_INTENT_CLASSIFIER_INITIALIZE" : "UNDEFINED_QPL_EVENT" : "META_AI_INTENT_CLASSIFIER_PREDICT";
            case 15704:
                return s == 4911 ? "AUDIO_HOME_SCREEN_PAGING_TTRC" : "UNDEFINED_QPL_EVENT";
            case 15707:
                return AbstractC62148Rzv.A00(s);
            case 15736:
                return s == 9121 ? "REMINDER_ADS_FLOW_MODULE_REMINDER_ADS_FLOW_EVENT" : "UNDEFINED_QPL_EVENT";
            case 15742:
                return s != 6350 ? s != 6777 ? s != 6839 ? s == 13294 ? "ADVERTISER_SUPPORT_CHAT_EXPERIENCE_CHAT_SUPPORT_EFFECTIVENESS_OPEN_CHAT_CLICK" : "UNDEFINED_QPL_EVENT" : "ADVERTISER_SUPPORT_CHAT_EXPERIENCE_CHAT_SUPPORT_EFFECTIVENESS_M1_OPEN_CHAT_IMPRESSION" : "ADVERTISER_SUPPORT_CHAT_EXPERIENCE_CHAT_SUPPORT_EFFECTIVENESS_OPEN_CHAT_IMPRESSION" : "ADVERTISER_SUPPORT_CHAT_EXPERIENCE_CHAT_SUPPORT_EFFECTIVENESS_M1_OPEN_CHAT_CLICK";
            case 15755:
                return AbstractC61928Rw0.A00(s);
            case 15776:
                return s != 1064 ? s == 4484 ? "IGD_LITE_MESSAGE_POINT_QUERY" : "UNDEFINED_QPL_EVENT" : "IGD_LITE_THREAD_SNAPSHOT";
            case 15792:
                return s != 2522 ? s != 3683 ? s != 9946 ? s == 10954 ? "MESSENGER_ANDROID_APP_START_LUKEWARM_START_TTRC" : "UNDEFINED_QPL_EVENT" : "MESSENGER_ANDROID_APP_START_COLD_START_TTRC" : "MESSENGER_ANDROID_APP_START_BG_COLD_START_TO_PUSH_NOTIFICATION" : "MESSENGER_ANDROID_APP_START_WARM_START_TTRC";
            case 15796:
                return s == 13353 ? "FB_MOBILE_FEED_SHOWREEL_NATIVE_FB_FEED_SN_COMPONENT_USER_FLOW_V2" : "UNDEFINED_QPL_EVENT";
            case 15815:
                return s != 5647 ? s == 14745 ? "FBLITE_MEDIA_PERF_MESSAGING_IMAGE_LOAD" : "UNDEFINED_QPL_EVENT" : "FBLITE_MEDIA_PERF_MESSAGING_IMAGE_FETCH";
            case 15817:
                return S0F.A00(s);
            case 15834:
                return AbstractC62092Rz1.A00(s);
            case 15846:
                return s == 12268 ? "IG_PRO_DIRECT_IG_PRO_DIRECT_INBOX_FOLDERS_FETCH_TTI" : "UNDEFINED_QPL_EVENT";
            case 15848:
                return AbstractC61979Rwp.A00(s);
            case 15859:
                return s != 2670 ? s != 4819 ? s == 15635 ? "FB_VIDEO_TEMPLATES_VIDEO_TEMPLATE_SYSTEM_ERROR" : "UNDEFINED_QPL_EVENT" : "FB_VIDEO_TEMPLATES_INVALID_TEMPLATE_SOURCE" : "FB_VIDEO_TEMPLATES_OBJECT_FAILED_TO_CONVERT";
            case 15860:
                return s == 5016 ? "NT_GROUPS_SNAPSHOT_PREVIEW_NT_GROUPS_SNAPSHOT_PREVIEW_SCREEN_TTRC" : "UNDEFINED_QPL_EVENT";
            case 15863:
                return s != 2045 ? s != 2723 ? s != 3585 ? s != 4335 ? s != 7433 ? s == 16085 ? "LVM_PREML_ONE_EXPRESS_EVAL" : "UNDEFINED_QPL_EVENT" : "LVM_UNIFIED_TOFU_ML_CADENCE_ENFORCEMENT" : "LVM_UNIFIED_TOFU_CLIENTML" : "LVM_TOFU_TAB_CONFIG" : "LVM_UNIFIED_TOFU_ML_INFER_APP_START" : "LVM_SIGNALS_STORE_STARTUP_LOAD";
            case 15877:
                return s != 1617 ? s != 2375 ? s != 8979 ? s != 9202 ? s != 9570 ? s == 12801 ? "FB_MUSIC_IN_ADS_FB_WATCH_CHANNEL_NATIVE_USER_FLOW" : "UNDEFINED_QPL_EVENT" : "FB_MUSIC_IN_ADS_FB_REELS_NATIVE_USER_FLOW" : "FB_MUSIC_IN_ADS_FB_REELS_SHOWREEL_USER_FLOW" : "FB_MUSIC_IN_ADS_FB_FEED_NATIVE_USER_FLOW" : "FB_MUSIC_IN_ADS_FB_FEED_SHOWREEL_USER_FLOW" : "FB_MUSIC_IN_ADS_FB_WATCH_CHANNEL_SHOWREEL_USER_FLOW";
            case 15878:
                return s == 16237 ? "MESSENGER_SEARCH_EDIT_HISTORY_EDIT_HISTORY" : "UNDEFINED_QPL_EVENT";
            case 15899:
                return AbstractC62128Rzb.A00(s);
            case 15903:
                return s != 6622 ? s == 12962 ? "MEDIA_MANAGER_INSTRUMENTATION_MEDIA_MANAGER_IMAGE_PERF" : "UNDEFINED_QPL_EVENT" : "MEDIA_MANAGER_INSTRUMENTATION_MEDIA_MANAGER_OLD_DOWNLOAD";
            case 15905:
                return s == 7450 ? "FANTASY_GAMES_FBLITE_FG_FBLITE_BOOKMARK_TTRC" : "UNDEFINED_QPL_EVENT";
            case 15912:
                return s != 6135 ? s != 9538 ? s == 15024 ? "AR_DESKTOP_SIMULATOR_STARTUP" : "UNDEFINED_QPL_EVENT" : "AR_DESKTOP_SIMULATOR_INSERT_FLOW" : "AR_DESKTOP_SIMULATOR_RESTART_FLOW";
            case 15913:
                return s == 6389 ? "FBLITE_VIDEO_TRANSFER_TRANSFER" : "UNDEFINED_QPL_EVENT";
            case 15955:
                return s != 1810 ? s == 10268 ? "OCULUS_HORIZON_OC_CAST_SERVER_SESSION_FUNNEL" : "UNDEFINED_QPL_EVENT" : "OCULUS_HORIZON_OC_CAST_TO_BROWSER_SERVER_SESSION_FUNNEL";
            case 15956:
                return RyB.A00(s);
            case 15992:
                return s == 3335 ? "IG_FOS_HEADERS_CLIENT_FLOW" : "UNDEFINED_QPL_EVENT";
            case 16017:
                return s == 5240 ? "AVATAR_IG_AVATAR_PROFILE_PIC_EDITOR_TTRC" : "UNDEFINED_QPL_EVENT";
            case 16020:
                return s != 1 ? s == 3336 ? "MESSENGER_COMMERCE_CONSIDERATION_TAP_THREAD_NULL_STATE_COMMERCE_CONSIDERATION_ELEMENTS" : "UNDEFINED_QPL_EVENT" : "MESSENGER_COMMERCE_CONSIDERATION_VIEW_P2M_THREAD";
            case 16028:
                return s == 10288 ? "IG_ANDROID_INTERPROCESS_COMMUNICATION_IG_IPC_CALLS_DURING_SCROLL" : "UNDEFINED_QPL_EVENT";
            case 16031:
                return s != 2582 ? s != 3305 ? s != 3488 ? s != 7213 ? s == 14056 ? "MSYS_TASK_HEALTH_TASK_SCHEDULED_RETRY" : "UNDEFINED_QPL_EVENT" : "MSYS_TASK_HEALTH_TOO_MANY_PENDING_QUEUE" : "MSYS_TASK_HEALTH_TASK_PERMANENT_ERROR" : "MSYS_TASK_HEALTH_TOO_MANY_PENDING_TASK" : "MSYS_TASK_HEALTH_TASK_EXPIRED";
            case 16045:
                return AbstractC62127Rza.A00(s);
            case 16077:
                return s != 1320 ? s == 14909 ? "FB4A_CREATION_GENAI_MME_GEN_AI_WATERMARK_ERROR" : "UNDEFINED_QPL_EVENT" : "FB4A_CREATION_GENAI_MME_GEN_AI_MEDIA_UPLOAD_ERROR";
            case 16084:
                return s == 15065 ? "ACT_PROTOBUF_RESTORE_TAM_UNIFIED_INSERT" : "UNDEFINED_QPL_EVENT";
            case 16090:
                return s != 6904 ? s == 12871 ? "WEARABLE_DEVOPTIONS_COLD_START" : "UNDEFINED_QPL_EVENT" : "WEARABLE_DEVOPTIONS_SIMILE_QPL_TEST";
            case 16091:
                return s != 7563 ? s != 15187 ? s != 15563 ? s == 19163 ? "NATIVE_TEMPLATES_PAGING_NT_SCREEN_PAGING_PROVIDER_TTRC" : "UNDEFINED_QPL_EVENT" : "NATIVE_TEMPLATES_PAGING_NT_SCREEN_CORONAVIRUS_HUB_PAGING" : "NATIVE_TEMPLATES_PAGING_SOCIAL_LEARNING_UNIT_DETAILS_PAGE_TTRC" : "NATIVE_TEMPLATES_PAGING_SOCIAL_LEARNING_UNITS_LIST_PAGE_TTRC";
            case 16118:
                return s == 4273 ? "FEED_LITHO_MIGRATION_CTA_CLICK" : "UNDEFINED_QPL_EVENT";
            case 16122:
                return s != 9035 ? s != 11620 ? s == 15753 ? "WEARABLE_DRIVE_WRITE_SYNC" : "UNDEFINED_QPL_EVENT" : "WEARABLE_DRIVE_WRITE_SYNC_INDIVIDUAL_ITEM" : "WEARABLE_DRIVE_LOCAL_ORM_ACCESS";
            case 16132:
                return s == 15019 ? "CARBON_CBLOKS_IG_CARBON_CBLOKS_STORY_NAVIGATION" : "UNDEFINED_QPL_EVENT";
            case 16136:
                return s != 4779 ? s != 6092 ? s != 9608 ? s != 15085 ? s == 15691 ? "FB_AUDIENCES_BPS_RENDER" : "UNDEFINED_QPL_EVENT" : "FB_AUDIENCES_PRIVACY_SELECTOR_UNEXPECTED_TARGET" : "FB_AUDIENCES_ADMIN_XPOST_DISPLAYED_HARDCODED_AUDIENCE" : "FB_AUDIENCES_CORRUPT_CACHE_SELECTABLE_PRIVACY_DATA" : "FB_AUDIENCES_BPS_FETCH";
            case 16147:
                return AbstractC61887RvJ.A00(s);
            case 16150:
                return s != 3178 ? s == 8057 ? "UNIFIED_PLAYER_SCRUBBER_PREVIEW" : "UNDEFINED_QPL_EVENT" : "UNIFIED_PLAYER_UP_BACKWARD_PAGINATION_PERF";
            case 16153:
                return s == 13878 ? "ARFX_ARFX_SORT_ABORT_EVENT" : "UNDEFINED_QPL_EVENT";
            case 16172:
                return s != 8170 ? s == 14244 ? "PREPACKAGED_BLOKS_OTA_UPDATE_FLOW" : "UNDEFINED_QPL_EVENT" : "PREPACKAGED_BLOKS_MANIFEST_INIT";
            case 16179:
                return s == 14119 ? "IG_DRAFTS_DRAFT_LOAD" : "UNDEFINED_QPL_EVENT";
            case 16186:
                return s != 4100 ? s == 4142 ? "IGD_INBOX_PRE_FEED_TO_INBOX_TTRC" : "UNDEFINED_QPL_EVENT" : "IGD_INBOX_PRE_OPEN_THREAD_LIST_QUERY";
            case 16192:
                return s == 4437 ? "IG_AD_CLIENT_PLATFORM_DELIVERY_FUNNEL_IG_AD_DELIVERY" : "UNDEFINED_QPL_EVENT";
            case 16201:
                return s != 13242 ? s == 15474 ? "MARKETPLACE_VIDEO_AUTOPLAY_TRIGGERED" : "UNDEFINED_QPL_EVENT" : "MARKETPLACE_VIDEO_BUYER_PDP_NON_VIDEO_RENDER";
            case 16207:
                return s == 5570 ? "MESSENGER_MEDIA_PICKER_MEDIA_PICKER" : "UNDEFINED_QPL_EVENT";
            case 16211:
                return s != 1387 ? s != 4128 ? s != 6544 ? s == 6972 ? "MESSAGING_CLIENT_CONNECTION_MESSAGING_CONNECTIVITY_ACT" : "UNDEFINED_QPL_EVENT" : "MESSAGING_CLIENT_CONNECTION_MESSAGING_CONNECTIVITY_MQTT" : "MESSAGING_CLIENT_CONNECTION_MESSAGING_CONNECTIVITY_DGW" : "MESSAGING_CLIENT_CONNECTION_MESSAGING_CONNECTIVITY";
            case 16212:
                return s == 13700 ? "PERSONAL_SHOPPER_PERSONAL_SHOPPER_AGENT" : "UNDEFINED_QPL_EVENT";
            case 16215:
                return s == 14543 ? "FB_SHORTS_PROFILE_REELS_TAB_JUST_WATCHED" : "UNDEFINED_QPL_EVENT";
            case 16218:
                return s != 1020 ? s != 1716 ? s != 3952 ? s == 13467 ? "IG_SUBSCRIPTIONS_IG_ANDROID_FAN_CLUB_UNEXPECTED_EVENT" : "UNDEFINED_QPL_EVENT" : "IG_SUBSCRIPTIONS_IG_FAN_CLUB_CONSIDERATION_PURCHASE_FLOW" : "IG_SUBSCRIPTIONS_IG_FAN_CLUB_CONSIDERATION_PAGE_LOAD" : "IG_SUBSCRIPTIONS_IG_FAN_CLUB_CONSIDERATION_USER_ACTIONS";
            case 16230:
                return s != 3616 ? s == 4646 ? "NET_PROBE_NET_PROBE_QUERY_FBPIGEON" : "UNDEFINED_QPL_EVENT" : "NET_PROBE_NET_PROBE_QUERY_FACEBOOK";
            case 16231:
                return s != 8901 ? s != 10068 ? s == 11716 ? "HALFNOSIS_DOPPEL_MODULE_LOADS" : "UNDEFINED_QPL_EVENT" : "HALFNOSIS_EAGER_UNPACKING" : "HALFNOSIS_LONGTAIL_LOAD";
            case 16232:
                return AbstractC61925Rvx.A00(s);
            case 16240:
                return s != 10202 ? s == 15458 ? "LINK_TEST_XRSPD" : "UNDEFINED_QPL_EVENT" : "LINK_XRSPD_START_UP";
            case 16250:
                return s == 5959 ? "IG_AVATAR_POWERUP_IG_AVATAR_POWERUP_COMPOSER_TTRC" : "UNDEFINED_QPL_EVENT";
            case 16259:
                return s != 4185 ? s == 14767 ? "HORIZON_USS_USS_OPEN" : "UNDEFINED_QPL_EVENT" : "HORIZON_USS_USS_SHARE_HZ_LINK_TO_MOBILE";
            case 16278:
                return AbstractC62062RyX.A00(s);
            case 16289:
                return s != 6739 ? s == 11815 ? "MARKETPLACE_LOCAL_RATINGS_REVIEW_LOADING_BUYER_RATING_PAGE" : "UNDEFINED_QPL_EVENT" : "MARKETPLACE_LOCAL_RATINGS_REVIEW_LOADING_SELLER_RATING_PAGE";
            case 16300:
                return s != 13462 ? s == 15110 ? "AR_COPRESENCE_TIME_TO_PEER_AVATAR_INITIAL_MOVEMENT_SYNCED" : "UNDEFINED_QPL_EVENT" : "AR_COPRESENCE_COPRESENCE_CALL_CONNECTED_TO_ACTIVE";
            case 16304:
                return AbstractC61854Rum.A00(s);
            case 16310:
                return AbstractC62030Rxe.A00(s);
            case 16348:
                return s == 5845 ? "GROWTH_PUSH_DELIVERY_PUSH_NOTIFICATION_DELIVERY_FUNNEL_TEST" : "UNDEFINED_QPL_EVENT";
            case 16351:
                return s != 3803 ? s == 9519 ? "VR_DEVICE_CASTING_CAST_TIME_SPENT_HMD" : "UNDEFINED_QPL_EVENT" : "VR_DEVICE_CASTING_CASTING_SIGNALING_ONLY";
            case 16368:
                return s == 2356 ? "MESSENGER_FYP_BLOKS_FYP_TTRC" : "UNDEFINED_QPL_EVENT";
            case 16370:
                return AbstractC61870Rv2.A00(s);
            default:
                return "UNDEFINED_QPL_MODULE";
        }
    }
}
