package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.RtS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61772RtS {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "API_ERROR";
            case 2:
                return "HTTP_400_AUTHENTICATION";
            case 3:
                return "HTTP_400_OTHER";
            case 4:
                return "HTTP_500_CLASS";
            case 5:
                return "CONNECTION_FAILURE";
            case 6:
                return "ORCA_SERVICE_UNKNOWN_OPERATION";
            case 7:
                return "ORCA_SERVICE_IPC_FAILURE";
            case 8:
                return "OUT_OF_MEMORY";
            case 9:
                return "OTHER";
            case 10:
                return "CANCELLED";
            case 11:
                return "CACHE_DISK_ERROR";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "MQTT_SEND_FAILURE";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "WORK_AUTH_FAILED";
            case 14:
                return "WORK_AUTH_COMMUNITY_ID_REQUIRED";
            case Process.SIGTERM /* 15 */:
                return "DATE_ERROR";
            case 16:
                return "SEGMENTED_TRANSCODE_ERROR";
            case 17:
                return "STREAMING_UPLOAD_ERROR";
            case 18:
                return "PHASE_ONE_TRANSCODING_ERROR";
            case Process.SIGSTOP /* 19 */:
                return "UNREACHABLE_STATEMENT_ERROR";
            case 20:
                return "TAGGING_ERROR";
            case 21:
                return "ORCA_STALE_WEB_DATA";
            case 22:
                return "LASSO_LOGIN_UNAVAILABLE_IN_COUNTRY";
            case 23:
                return "LASSO_SHARE_SHEET__MESSAGE_LIMIT_EXCEEDED";
            case 24:
                return "API_EC_USER_CHECKPOINT";
            default:
                return "NO_ERROR";
        }
    }
}
