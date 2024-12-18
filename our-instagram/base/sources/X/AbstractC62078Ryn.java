package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.Ryn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62078Ryn {
    public static String A00(int i) {
        if (i == 1) {
            return "RTC_PERF_RTC_OUTGOING_CALL_START";
        }
        if (i == 2) {
            return "RTC_PERF_RTC_INCOMING_CALL_START";
        }
        if (i == 6) {
            return "RTC_PERF_LAB_METRIC";
        }
        if (i == 7) {
            return "RTC_PERF_RTC_CREATE_CALL_ENT";
        }
        if (i == 19) {
            return "RTC_PERF_PLATFORM_P2P_START_CALL_CALLER_FLOW";
        }
        if (i == 20) {
            return "RTC_PERF_PLATFORM_P2P_START_CALL_CALLEE_FLOW";
        }
        if (i == 22) {
            return "RTC_PERF_PLATFORM_P2P_ACCEPT_CALL_CALLER_FLOW";
        }
        if (i == 23) {
            return "RTC_PERF_PLATFORM_P2P_ACCEPT_CALL_CALLEE_FLOW";
        }
        if (i == 35) {
            return "RTC_PERF_PLATFORM_SERVER_TRANSACTION";
        }
        if (i == 36) {
            return "RTC_PERF_RTC_CALL_ENDED";
        }
        switch (i) {
            case 4:
                return "RTC_PERF_RTC_FULLSCREEN_CREATE_TO_VISIBLE";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "RTC_PERF_PLATFORM_P2P_SET_REMOTE_DESCRIPTION";
            case Process.SIGTERM /* 15 */:
                return "RTC_PERF_PLATFORM_P2P_SET_LOCAL_DESCRIPTION";
            case Seq.NULL_REFNUM /* 41 */:
                return "RTC_PERF_PLATFORM_SDP_RENEGOTIATION";
            case 47:
                return "RTC_PERF_FB_APP_TIME_TO_REDIRECT";
            case 2271:
                return "RTC_PERF_RTC_CALL_TRACE";
            case 4562:
                return "RTC_PERF_RTC_CPU_SPIN";
            case 7464:
                return "RTC_PERF_PEER_VIDEO_SUBSCRIPTION_TO_FIRST_FRAME";
            case 8639:
                return "RTC_PERF_TOUCH_RESPONSIVENESS";
            case 9555:
                return "RTC_PERF_RTC_SESSION_DURATION_RESPONSIVENESS_TRACE_COLLECTION";
            case 10380:
                return "RTC_PERF_TRAFFIC_QUEUED";
            case 11725:
                return "RTC_PERF_RTC_CALL_EFFICIENCY_CRITICAL_EVENT";
            case 12744:
                return "RTC_PERF_RTC_CALL_EFFICIENCY";
            case 13177:
                return "RTC_PERF_RTC_THERMAL_TRACE";
            case 13601:
                return "RTC_PERF_RTC_CALL_SESSION";
            default:
                switch (i) {
                    case 26:
                        return "RTC_PERF_PLATFORM_MW_JOIN_CALL_FLOW";
                    case 27:
                        return "RTC_PERF_PLATFORM_MW_CONNECT_TO_PARTICIPANT_FLOW";
                    case 28:
                        return "RTC_PERF_PLATFORM_MW_INVITE_PARTICIPANT_INVITEE_FLOW";
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                        return "RTC_PERF_PLATFORM_MW_INVITE_PARTICIPANT_INVITER_FLOW";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
