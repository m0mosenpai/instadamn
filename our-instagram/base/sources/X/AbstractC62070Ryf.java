package X;

import com.facebook.forker.Process;

/* renamed from: X.Ryf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62070Ryf {
    public static String A00(int i) {
        if (i == 1) {
            return "RELIABILITY_APPSTATELOGGER_WRITE";
        }
        if (i == 2) {
            return "RELIABILITY_TTRC_FAILURE_ANDROID";
        }
        if (i == 3) {
            return "RELIABILITY_TTRC_LONG_CANCEL_ANDROID";
        }
        if (i == 5) {
            return "RELIABILITY_LONG_STALL_TRACE_ANDROID";
        }
        if (i == 6) {
            return "RELIABILITY_UI_THREAD_LAG_ANDROID";
        }
        if (i == 7) {
            return "RELIABILITY_SOFT_ERROR";
        }
        if (i == 9) {
            return "RELIABILITY_PERIODIC_MEMORY_INFO";
        }
        if (i == 10) {
            return "RELIABILITY_MEMORY_TRIM";
        }
        if (i == 13) {
            return "RELIABILITY_TTRC_FAILURE";
        }
        if (i == 14) {
            return "RELIABILITY_TTRC_LONG_CANCEL";
        }
        switch (i) {
            case 17:
                return "RELIABILITY_EARLY_ACTIVITY_TRANSITION_LAUNCH";
            case 18:
                return "RELIABILITY_EARLY_ACTIVITY_TRANSITION_STOP";
            case Process.SIGSTOP /* 19 */:
                return "RELIABILITY_HOME_TASK_SWITCHER_PRESSED";
            default:
                switch (i) {
                    case 1821:
                        return "RELIABILITY_TEST_EVENT";
                    case 2255:
                        return "RELIABILITY_EXCEPTION_HANDLER_LOG_FAILURE";
                    case 2987:
                        return "RELIABILITY_NAVIGATION_SESSION_WITH_MEMORY___SKIP_LOOM__";
                    case 3469:
                        return "RELIABILITY_MEDIA_CODEC_LIFECYCLE";
                    case 5614:
                        return "RELIABILITY_HPROF_DUMPING";
                    case 6087:
                        return "RELIABILITY_SCOPED_MEMORY";
                    case 6333:
                        return "RELIABILITY_OMURA_ASYNC";
                    case 6563:
                        return "RELIABILITY_NAVIGATION_SESSION_WITH_MEMORY";
                    case 6581:
                        return "RELIABILITY_USER_PERCEPTIBLE";
                    case 6833:
                        return "RELIABILITY_MEMORY_RED_STATUS_CHANGE";
                    case 6880:
                        return "RELIABILITY_PARFAIT_TRACE_UPLOAD";
                    case 8256:
                        return "RELIABILITY_HPROF_DUMP_ON_THROW";
                    case 8548:
                        return "RELIABILITY_PERIODIC_MEMORY_INFO_COMPLETE_SESSION__SAMPLE";
                    case 8677:
                        return "RELIABILITY_MEMORY_DUMP_UNEXPECTED_EVENT";
                    case 8680:
                        return "RELIABILITY_HPROF_ADDITIONAL_DATA";
                    case 8711:
                        return "RELIABILITY_LACRIMA_INTERNAL_PERFORMANCE";
                    case 8831:
                        return "RELIABILITY_PARFAIT_TRACE_COLLECTION";
                    case 9514:
                        return "RELIABILITY_AUTHENTICATION_INFINITE_LOGIN_LOOP";
                    case 10187:
                        return "RELIABILITY_CONTEXT_STATE_MAP_TOO_MANY_IDS";
                    case 10528:
                        return "RELIABILITY_LACRIMA_INTERNAL_CHECKPOINT";
                    case 10613:
                        return "RELIABILITY_MEMORY_TELEMETRY_ERROR";
                    case 14093:
                        return "RELIABILITY_SCOPED_ATTRIBUTION_AGGREGATED";
                    case 14269:
                        return "RELIABILITY_LACRIMA_INTERNAL_EXCEPTION";
                    case 14698:
                        return "RELIABILITY_NAVIGATION_WITH_LIFECYCLE";
                    case 15628:
                        return "RELIABILITY_MEMORY_TRACE_END";
                    case 15680:
                        return "RELIABILITY_EXCEPTION_HANDLER_EXECUTION";
                    case 16069:
                        return "RELIABILITY_MEMORY_INFO";
                    case 20549:
                        return "RELIABILITY_TTRC_ABSTRACT";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
