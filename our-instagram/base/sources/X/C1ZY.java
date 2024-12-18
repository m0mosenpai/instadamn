package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.1ZY, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1ZY {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "AD_GAP_VILOATION";
            case 1:
                return "AD_INVALIDATION";
            case 2:
                return "AD_REQUEST_FAILED";
            case 3:
                return "AD_TRACKING_TOKEN_NULL";
            case 4:
                return "COMMENT_ACTIONS_MENU_ERROR";
            case 5:
                return "COMMENT_DUPLICATED_ROW_MODEL_ID";
            case 6:
                return "COMMENT_INVALID_COMMENT_DICT";
            case 7:
                return "DIRECT_INVALID_ITEM_TYPE";
            case 8:
                return "DIRECT_INVALID_VIEW_TYPE";
            case 9:
                return "DIRECT_INVALID_THREAD_METADATA";
            case 10:
                return "DIRECT_IRIS_MESSAGE_SYNC";
            case 11:
                return "DIRECT_IRIS_SUB_IRIS";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "DIRECT_SNAPSHOT_RESPONSE_MAPPING_ERROR";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "EXPIRED_STORY_DISPLAYED";
            case 14:
                return "EXPLORE_NOT_LOADING";
            case Process.SIGTERM /* 15 */:
                return "FEED_LITHO_NO_PREPAREABLE";
            case 16:
                return "FEED_NOT_LOADING";
            case 17:
                return "IGDS_BOTTOM_SHEET_ERROR_SHEET_IS_SHOWING";
            case 18:
                return "IGDS_BOTTOM_SHEET_ERROR_NAVIGATOR_IS_NULL";
            case Process.SIGSTOP /* 19 */:
                return "IGDS_BOTTOM_SHEET_BACK_STACK_SIZE_ASSERTION_FAILURE";
            case 20:
                return "IGDS_SNACKBAR_ERROR";
            case 21:
                return "IGDS_TOAST_ERROR";
            case 22:
                return "INCORRECT_STORY_SHOWN";
            case 23:
                return "INSTANT_PULL_TO_REFRSH";
            case 24:
                return "LITHO_PREPAREABLE_DOES_NOT_EXIST_IN_CACHE_ON_BIND";
            case 25:
                return "MANUAL_APP_RESTART";
            case 26:
                return "MANUAL_APP_TERMINATION";
            case 27:
                return "NETWORK_ERROR";
            case 28:
                return "PUBLISH_MEDIA";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "QP_ACTION_HANDLE_ERROR";
            case 30:
                return "RETRY_PULL_TO_REFRESH";
            case 31:
                return "RETRY_VIEW_CLICK";
            case 32:
                return "REPEATED_NAVIGATION";
            case 33:
                return "STORY_AD_STATUS_UNDEFINED";
            case 34:
                return "STORY_AD_CAPTION_KEYWORD_HIGHLIGHT_FAILED";
            case 35:
                return "STORY_AD_CAPTION_KEYWORD_HIGHLIGHT_UTIL_FAILED";
            case 36:
                return "STORY_NOT_LOADING";
            case 37:
                return "VIDEO_TRANSCODING_FAILED";
            case 38:
                return "VIEWED_CAROUSEL_MEDIA_IS_NULL";
            default:
                return "WEARABLES_IPC_ERROR";
        }
    }
}
