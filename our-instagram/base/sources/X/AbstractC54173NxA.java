package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.NxA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54173NxA {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ADD_FAILURE";
            case 2:
                return "OTHER_PARTICIPANT_ADDED_USER";
            case 3:
                return "OTHER_PARTICIPANT_TOOK_SNAPSHOT";
            case 4:
                return "INTEROP_UPGRADE_FAILURE";
            case 5:
                return "LOADING_AVATAR";
            case 6:
                return "GENERATING_AVATAR";
            case 7:
                return "MULTIPEER_EFFECT_STARTED_BY_PEER";
            case 8:
                return "MULTIPEER_EFFECT_REMOVED";
            case 9:
                return "MULTIPEER_EFFECT_MAX_PARTICIPANTS_EXCEEDED";
            case 10:
                return "AVATAR_LOAD_FAILURE";
            case 11:
                return "AR_EFFECT_LOAD_FAILURE";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "USE_FRONT_CAMERA_FOR_AVATAR";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "TOUCH_UP_AUTO_APPLY_ENABLED";
            case 14:
                return "IN_CALL_INTEROP_UPSELL";
            case Process.SIGTERM /* 15 */:
                return "IN_ROOM_SOFT_MUTED_BY_CREATOR_MESSAGE";
            case 16:
                return "PARTICIPANT_JOINED";
            case 17:
                return "PARTICIPANT_LEFT";
            case 18:
                return "SCREEN_READER_ANNOUNCEMENT_ONLY";
            case Process.SIGSTOP /* 19 */:
                return "GENERIC_TEXT_SNACKBAR";
            case 20:
                return "GENERIC";
            case 21:
                return "E2EE_NEW_DEVICE";
            case 22:
                return "MUTE_DETECTION_MESSAGE";
            case 23:
                return "BLUETOOTH_DEVICE_CONNECTED";
            case 24:
                return "JOIN_REQUESTS_FIRST_JOINER_MESSAGE";
            case 25:
                return "AUDIO_RECORD_START_ERROR_MESSAGE";
            case 26:
                return "AUDIO_RECORD_ZERO_LOUDNESS_MESSAGE";
            case 27:
                return "AUDIO_RECORD_LONG_STALL_MESSAGE";
            case 28:
                return "AVATAR_USED_BY_PEER_SELF_HAS_AVATAR";
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return "AVATAR_USED_BY_PEER_SELF_NO_AVATAR";
            case 30:
                return "AVATAR_ELIGIBLE_CALL_CONNECTED";
            case 31:
                return "LOW_BATTERY_WARNING";
            case 32:
                return "FLM_CONSENT_DECLINED_BY_USER";
            case 33:
                return "SCREEN_SHARE_START_ERROR";
            case 34:
                return "SCREEN_SHARE_STOPPED_REMOTE_USER_STARTED";
            case 35:
                return "SCREEN_SHARE_UNAVAILABLE_CAMERA_OFF";
            case 36:
                return "SCREEN_SHARE_PEER_STARTED_SHARING";
            case 37:
                return "SCREEN_SHARE_PEER_STOPPED_SHARING";
            default:
                return "ADD_FAILURE_MAX_PARTICIPANTS";
        }
    }
}
