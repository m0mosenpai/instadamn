package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import go.Seq;

/* renamed from: X.RxR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62017RxR {
    public static String A00(int i) {
        if (i == 2) {
            return "MESSENGER_LITE_COMPONENT_TTI";
        }
        if (i == 9) {
            return "MESSENGER_LITE_MEDIA_UPLOAD_ANDROID";
        }
        if (i == 15) {
            return "MESSENGER_LITE_MESSENGER_LITE_VIDEO_TRANSCODE_TIME";
        }
        if (i == 23) {
            return "MESSENGER_LITE_UI_COLD_START_TTI";
        }
        if (i == 46) {
            return "MESSENGER_LITE_MLITE_STORY_VIEWER_INITIAL_LOAD";
        }
        if (i == 5) {
            return "MESSENGER_LITE_SQLITE_TIME_TO_UPGRADE_DB";
        }
        if (i == 6) {
            return "MESSENGER_LITE_NETWORK_REQUEST";
        }
        if (i == 7) {
            return "MESSENGER_LITE_MEDIA_DOWNLOAD";
        }
        if (i == 12) {
            return "MESSENGER_LITE_MLITE_TIME_TO_LOAD_THREAD_LIST";
        }
        if (i == 13) {
            return "MESSENGER_LITE_SQLITE_TIME_TO_MIGRATE_DATA";
        }
        if (i == 18) {
            return "MESSENGER_LITE_API_EXECUTE";
        }
        if (i == 19) {
            return "MESSENGER_LITE_SQLITE_TIME_TO_CREATE_DB";
        }
        if (i == 34) {
            return "MESSENGER_LITE_STORY_VIEWER_TRANSITION";
        }
        if (i == 35) {
            return "MESSENGER_LITE_SEND_MESSAGE";
        }
        switch (i) {
            case 27:
                return "MESSENGER_LITE_COLD_START_TO_UI";
            case 28:
                return "MESSENGER_LITE_COLD_START_TO_THREAD_VIEW";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "MESSENGER_LITE_ANY_THREAD_LIST";
            case 30:
                return "MESSENGER_LITE_FAST_LUKEWARM_START_TO_THREAD_LIST";
            case 31:
                return "MESSENGER_LITE_SLOW_LUKEWARM_START_TO_THREAD_LIST";
            case 32:
                return "MESSENGER_LITE_THREAD_LIST_TO_THREAD_VIEW";
            default:
                switch (i) {
                    case 37:
                        return "MESSENGER_LITE_CAMERA_TIME_TO_INTERACT";
                    case 38:
                        return "MESSENGER_LITE_CAMERA_TIME_BACK_FROM_PREVIEW";
                    case 39:
                        return "MESSENGER_LITE_CAMERA_TIME_TO_CAPTURE_PHOTO";
                    case 40:
                        return "MESSENGER_LITE_CAMERA_TIME_TO_START_VIDEO_CAPTURE";
                    case Seq.NULL_REFNUM /* 41 */:
                        return "MESSENGER_LITE_CAMERA_TIME_TO_STOP_VIDEO_CAPTURE";
                    case Seq.RefTracker.REF_OFFSET /* 42 */:
                        return "MESSENGER_LITE_MEDIA_PICKER_LOAD_TIME";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
