package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;

/* renamed from: X.RxM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62012RxM {
    public static String A00(int i) {
        if (i == 1) {
            return "MESSENGER_SEND_MESSAGE";
        }
        if (i == 2) {
            return "MESSENGER_WARM_START";
        }
        if (i == 3) {
            return "MESSENGER_COLD_START";
        }
        if (i == 4) {
            return "MESSENGER_LUKE_WARM_START";
        }
        if (i == 10) {
            return "MESSENGER_EXTERNAL_TO_THREADVIEW";
        }
        if (i == 11) {
            return "MESSENGER_THREADLIST_DB_FETCH";
        }
        if (i == 70) {
            return "MESSENGER_CAMERA_EFFECT_PICKER_FEATURED_LOAD";
        }
        if (i == 71) {
            return "MESSENGER_CAMERA_EFFECT_PICKER_SECTION_LOAD";
        }
        if (i == 119) {
            return "MESSENGER_CRITICAL_PATH_GRAPHQL_DELAY";
        }
        if (i == 120) {
            return "MESSENGER_DELTA_APPLICATION_DONE";
        }
        if (i == 151) {
            return "MESSENGER_COLD_START_TO_THREADVIEW";
        }
        if (i == 152) {
            return "MESSENGER_ANDROID_GROUP_CREATE_FLOW";
        }
        switch (i) {
            case 8:
                return "MESSENGER_THREADLIST_TO_THREADVIEW";
            case 17:
                return "MESSENGER_THREAD_DATA_FETCH";
            case 21:
                return "MESSENGER_THREAD_LIST_FRAGMENT_CREATE";
            case 23:
                return "MESSENGER_THREAD_VIEW_FRAGMENT_CREATE";
            case 25:
                return "MESSENGER_THREAD_VIEW_MESSAGES_FRAGMENT_CREATE";
            case 26:
                return "MESSENGER_CANONICAL_PRESENCE_CHECKS";
            case 27:
                return "MESSENGER_DISPLAYED_PAGE_PRESENCE_ONLINE_VALUES";
            case 28:
                return "MESSENGER_CANONICAL_PRESENCE_DOUBLESTALE";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "MESSENGER_CANONICAL_PRESENCE_LASTREAD_STALE_MORETHANTHRESHOLD";
            case 30:
                return "MESSENGER_CANONICAL_PRESENCE_LASTREAD_STALE_LESSTHANTHRESHOLD";
            case 31:
                return "MESSENGER_CANONICAL_PRESENCE_LASTSENT_STALE_LESSTHANTHRESHOLD";
            case 32:
                return "MESSENGER_CANONICAL_PRESENCE_LASTSENT_STALE_MORETHANTHRESHOLD";
            case 34:
                return "MESSENGER_CANONICAL_NO_PRESENCE";
            case 36:
                return "MESSENGER_USER_TYPING";
            case 44:
                return "MESSENGER_MAIN_ACTIVITY_CREATE";
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return "MESSENGER_THREAD_LIST_LAYOUT_TO_DRAW";
            case 52:
                return "MESSENGER_MESSAGE_SEND_EXPERIENCE";
            case 57:
                return "MESSENGER_THREAD_LIST_SCROLL";
            case 68:
                return "MESSENGER_CAMERA_EFFECT_APPLY";
            case 81:
                return "MESSENGER_THREAD_MESSAGES_SCROLL";
            case 97:
                return "MESSENGER_ANDROID_TAB_NAVIGATION";
            case 106:
                return "MESSENGER_INBOX_DISPLAY";
            case 108:
                return "MESSENGER_THREAD_LIST_DISPLAY";
            case 112:
                return "MESSENGER_FETCH_MORE_THREADS";
            case 122:
                return "MESSENGER_CRITICAL_PATH_TASK_DELAY";
            case 129:
                return "MESSENGER_CAMERA_TIME_TO_CAPTURE_PHOTO";
            case 154:
                return "MESSENGER_MEDIA_PICKER_INIT";
            case 161:
                return "MESSENGER_POSTCAPTURE_FACE_DETECTION";
            case 162:
                return "MESSENGER_THREADVIEW_TO_THREADLIST_BACK_NAV";
            case 163:
                return "MESSENGER_THREAD_METADATA_FETCH";
            case 166:
                return "MESSENGER_COLD_START_IN_BACKGROUND";
            case 167:
                return "MESSENGER_CRITICAL_PATH_ACTIVE";
            case 168:
                return "MESSENGER_CAMERA_TIME_TO_DISPLAY_PHOTO";
            case 169:
                return "MESSENGER_MEDIA_TRAY_SCROLL";
            case AbstractC62862SUj.MAX_FACTORIAL /* 170 */:
                return "MESSENGER_MEDIA_PICKER_SCROLL";
            case 172:
                return "MESSENGER_CAMERA_TIME_TO_START_VIDEO_CAPTURE";
            case 173:
                return "MESSENGER_CAMERA_TIME_TO_STOP_VIDEO_CAPTURE";
            case 174:
                return "MESSENGER_MONTAGE_AND_ACTIVE_NOW_LOADING_ANDROID";
            case 179:
                return "MESSENGER_MQTT_COLD_START_INIT";
            case 182:
                return "MESSENGER_THREADS_DB_AUTO_MIGRATION_UPGRADE_TIME";
            case 183:
                return "MESSENGER_THREADS_DB_AUTO_MIGRATION_DATA_MIGRATION_TIME";
            case 187:
                return "MESSENGER_RTC_SNAPSHOT";
            case 190:
                return "MESSENGER_RTC_SELF_SNAPSHOT";
            case 192:
                return "MESSENGER_MONTAGE_PEOPLE_TRAY_LOAD";
            case 193:
                return "MESSENGER_MONTAGE_OMNI_DELTA_HANDLING";
            case 194:
                return "MESSENGER_MONTAGE_INBOX_LOAD_TTI";
            case 196:
                return "MESSENGER_INBOX_UNIT_DB_FETCH";
            case 197:
                return "MESSENGER_SCROLL_PERF";
            case 198:
                return "MESSENGER_MONTAGE_GIF_STICKER_TRANSCODING";
            case 199:
                return "MESSENGER_MONTAGE_PROCESS_MEDIA";
            case 204:
                return "MESSENGER_THREAD_SETTINGS_FRAGMENT_CREATE";
            case 209:
                return "MESSENGER_MONTAGE_VIEWER_USER_ACTION";
            case 210:
                return "MESSENGER_COMPOSER_LAUNCH";
            case 214:
                return "MESSENGER_TINCAN_THREAD_LIST_LOADING";
            case 217:
                return "MESSENGER_COMPOSER_UPDATE_THREAD";
            case 218:
                return "MESSENGER_COMPOSER_UPDATE_THREAD_NO_THREAD_SUMMARY";
            case 1696:
                return "MESSENGER_IAB_GRAPHQL";
            case 2399:
                return "MESSENGER_CREATE_GROUP";
            case 2455:
                return "MESSENGER_BUCKET_TRANSITION";
            case 2555:
                return "MESSENGER_THREAD_VIEW_DISPLAY_GREETING_TEXT";
            case 3748:
                return "MESSENGER_FOLDER_LIST_LOAD";
            case 4013:
                return "MESSENGER_COMPOSER_LAUNCH_V2";
            case 4066:
                return "MESSENGER_SLOW_APP_COMPONENT";
            case 4377:
                return "MESSENGER_MSYS_THREADLIST_LOAD";
            case 4445:
                return "MESSENGER_FOREGROUND_EFFICIENCY";
            case 5192:
                return "MESSENGER_RETRY_CLICK";
            case 5699:
                return "MESSENGER_AI_THREAD_NAVIGATION_TTRC";
            case 5758:
                return "MESSENGER_PEOPLE_TRAY_STORY_RENDER";
            case 5811:
                return "MESSENGER_THREAD_NAVIGATION";
            case 5840:
                return "MESSENGER_ACT_TLTV_TTRC";
            case 5954:
                return "MESSENGER_ACT_USER_TYPING";
            case 6590:
                return "MESSENGER_INITIAL_LOAD";
            case 6644:
                return "MESSENGER_CONTACTS_FRAGMENT";
            case 6670:
                return "MESSENGER_THREAD_VIEW_DISPLAY_SOCIAL_CONTEXT";
            case 6812:
                return "MESSENGER_MESSAGE_SEND_TO_SENT";
            case 6947:
                return "MESSENGER_QR_CODES_UNEXPECTED_ERRORS_ANDROID";
            case 7238:
                return "MESSENGER_COMPOSER_SEND_MEDIA_DURATION";
            case 7251:
                return "MESSENGER_LAUNCH_SAME_KEY_DEEP_LINK";
            case 7436:
                return "MESSENGER_FOS_IMAGE_RENDER";
            case 7650:
                return "MESSENGER_BACKGROUND_EFFICIENCY";
            case 7962:
                return "MESSENGER_THREAD_OPEN_USER_QUERY";
            case 8364:
                return "MESSENGER_MSYS_THREAD_LOAD";
            case 8623:
                return "MESSENGER_TAB_LOAD";
            case 8868:
                return "MESSENGER_THREAD_LIST_LAYOUT";
            case 8907:
                return "MESSENGER_MESSAGE_SEND_EXPERIENCE_MSYS";
            case 10095:
                return "MESSENGER_ACT_THREADLIST_TO_THREADVIEW";
            case 10312:
                return "MESSENGER_RTC_CALL_CONNECT_EFFICIENCY";
            case 10666:
                return "MESSENGER_ACT_MESSAGE_WITH_RENDER_SEND_EXPERIENCE";
            case 11410:
                return "MESSENGER_THREAD_TRANSITION";
            case 11531:
                return "MESSENGER_UNEXPECTED_EXTRAS_IN_INTENT";
            case 11776:
                return "MESSENGER_PEOPLE_TRAY_DATA_LOAD";
            case 13659:
                return "MESSENGER_CHANNEL_JOINING";
            case 14460:
                return "MESSENGER_THREAD_VIEW_DISPLAY_RATING_TRUST_SIGNAL";
            case 14985:
                return "MESSENGER_BACKGROUND_PUSH_EFFICIENCY";
            case 15123:
                return "MESSENGER_MSYS_ACCOUNT_SWITCH_START";
            case 15418:
                return "MESSENGER_THREAD_VIEW_DISPLAY_ICEBREAKERS";
            case 15545:
                return "MESSENGER_THREAD_LIST_ON_LOAD_MORE_THREADS";
            case 15783:
                return "MESSENGER_ACT_MESSAGE_SEND_EXPERIENCE";
            case 16004:
                return "MESSENGER_THREAD_VIEW_DISPLAY_PROFILE_IMAGE";
            case 32510:
                return "MESSENGER_COLD_START_BAREBONE";
            default:
                switch (i) {
                    case 61:
                        return "MESSENGER_LOCAL_MEDIA_LOAD";
                    case 62:
                        return "MESSENGER_CAMERA_PHOTO_PROCESSING";
                    case StringTreeSet.PAYLOAD_MASK /* 63 */:
                        return "MESSENGER_CAMERA_VIDEO_PROCESSING";
                    case 64:
                        return "MESSENGER_CAMERA_EFFECT_PICKER_LOAD";
                    case 65:
                        return "MESSENGER_CAMERA_EFFECT_SEARCH";
                    case 66:
                        return "MESSENGER_CAMERA_EFFECT_FETCH_CACHE";
                    default:
                        switch (i) {
                            case 132:
                                return "MESSENGER_CAMERA_TIME_TO_INTERACT";
                            case 133:
                                return "MESSENGER_CAMERA_TIME_BACK_FROM_PREVIEW";
                            case 134:
                                return "MESSENGER_CAMERA_TIME_TO_NATIVE_CAPTURE_PHOTO";
                            default:
                                switch (i) {
                                    case 147:
                                        return "MESSENGER_MEDIA_TRAY_INIT";
                                    case 148:
                                        return "MESSENGER_MEDIA_TRAY_PREPARE_ATTACHMENT";
                                    case 149:
                                        return "MESSENGER_DEEP_LINKING_THREAD_FETCH";
                                    default:
                                        switch (i) {
                                            case 157:
                                                return "MESSENGER_REACTION_PANEL_SHOW_UP";
                                            case 158:
                                                return "MESSENGER_ANDROID_OMNIPICKER";
                                            case 159:
                                                return "MESSENGER_ANDROID_GROUP_ADD_MEMBERS_FLOW";
                                            default:
                                                return "UNDEFINED_QPL_EVENT";
                                        }
                                }
                        }
                }
        }
    }
}
