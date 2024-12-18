package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import go.Seq;

/* renamed from: X.Rx8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61998Rx8 {
    public static String A00(int i) {
        if (i == 1) {
            return "LOOM_TRACE_CREATED";
        }
        if (i == 2) {
            return "LOOM_TRACE_ABORTED";
        }
        if (i == 5) {
            return "LOOM_TRACE_UPLOAD";
        }
        if (i == 6) {
            return "loom_config";
        }
        if (i == 7) {
            return "LOOM_TRACE_FILEMAN_ERRORS";
        }
        if (i == 25) {
            return "LOOM_PERF_TEST_INFO";
        }
        if (i == 26) {
            return "LOOM_KERNEL_PERF_EVENTS";
        }
        if (i == 30) {
            return "LOOM_VERIFIER";
        }
        if (i == 31) {
            return "CPU Sampling Interval (ms)";
        }
        if (i == 33) {
            return "LOOM_FREE_DISK_PERCENT";
        }
        if (i == 34) {
            return "LOOM_SKIPPED_FRAMES";
        }
        if (i == 38) {
            return "LOOM_DEVICE_TOTAL_MEMORY";
        }
        if (i == 39) {
            return "LOOM_DEVICE_MAX_CPU_FREQUENCY";
        }
        if (i == 63) {
            return "LOOM_KERNEL_VERSION";
        }
        if (i == 64) {
            return "LOOM_BLACKBOX_TRACE_REQUESTED";
        }
        switch (i) {
            case 8:
                return "LOOM_TRACE_FILEMAN_TRIMMED_COUNT";
            case 9:
                return "LOOM_TRACE_FILEMAN_TRIMMED_AGE";
            case 10:
                return "LOOM_TRACE_FILEMAN_ADDED_UPLOAD";
            case 11:
                return "LOOM_DEXOPT";
            case 36:
                return "LOOM_NUM_CONNECTED_PROCESSES";
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return "LOOM_UI_THREAD_RESPONSIVENESS";
            case 48:
                return "LOOM_TRACE_STARTED";
            case 59:
                return "LOOM_BLACKBOX_TRACE_STARTED";
            case 67:
                return "LOOM_MANUAL_TRACE";
            case 68:
                return "LOOM_VSYNC_TIME_NS";
            case 69:
                return "LOOM_TOTAL_SKIPPED_FRAMES_UNCAPPED";
            case 70:
                return "LOOM_TOTAL_FRAME_TIME_SPENT_UNCAPPED";
            case 71:
                return "LOOM_LARGE_FRAME_DROP_UNCAPPED";
            case 72:
                return "LOOM_NOOP";
            case 73:
                return "LOOM_OS_SDK";
            case 79:
                return "LOOM_BLACKBOX_TRACE_REQUEST_PROCESSING_FAILED";
            case 80:
                return "LOOM_BLACKBOX_TRACE_REQUEST_PROCESSING_STARTED";
            case 81:
                return "LOOM_BLACKBOX_TRACE_REQUEST_PROCESSING_FINISHED";
            case 83:
                return "LOOM_MMAP_TRACE_PROCESSING";
            case 2855:
                return "LOOM_JEST_MOCK_CONFIG_APPLIED";
            case 7660:
                return "LOOM_ASL_SESSION_ID";
            case 9600:
                return "Build Id";
            case 9745:
                return "LOOM_APP_STATE_CHANGE";
            case 10653:
                return "LOOM_MMAP_BB_STOP_TRIGGER";
            case 11436:
                return "LOOM_SYSTEM_AND_MONOTONIC_TIME_DIFF_MICROS";
            default:
                switch (i) {
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        return "LOOM_TRACE_FILEMAN_TRIMMED_LOGOUT";
                    case 14:
                        return "LOOM_DEVICE_TYPE";
                    case Process.SIGTERM /* 15 */:
                        return "LOOM_DEVICE_BRAND";
                    case 16:
                        return "LOOM_MANUFACTURER";
                    case 17:
                        return "LOOM_YEAR_CLASS";
                    default:
                        switch (i) {
                            case Process.SIGSTOP /* 19 */:
                                return "LOOM_OS_VER";
                            case 20:
                                return "LOOM_CONNECTION_CLASS";
                            case 21:
                                return "LOOM_NETWORK_TYPE";
                            case 22:
                                return "LOOM_NETWORK_SUBTYPE";
                            default:
                                switch (i) {
                                    case 51:
                                        return "LOOM_FRAME_DURATION";
                                    case 52:
                                        return "LOOM_TRACE_STOPPED";
                                    case 53:
                                        return "LOOM_REACT_BUNDLE_VERSION";
                                    case 54:
                                        return "App version code";
                                    case 55:
                                        return "App version";
                                    default:
                                        return "UNDEFINED_QPL_EVENT";
                                }
                        }
                }
        }
    }
}
