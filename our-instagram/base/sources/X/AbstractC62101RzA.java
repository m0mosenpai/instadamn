package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.RzA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62101RzA {
    public static String A00(int i) {
        switch (i) {
            case 4:
                return "TALK_T4A_PERF_COLD_START";
            case 5:
                return "TALK_T4A_PERF_WARM_START";
            case 6:
                return "TALK_T4A_PERF_LUKEWARM_START";
            case 7:
                return "TALK_T4A_PERF_MSG_THEAD_LOAD";
            case 8:
                return "TALK_T4A_PERF_RTC_OUTGOING_CALL_START";
            case 9:
                return "TALK_T4A_PERF_RTC_INCOMING_CALL_START";
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            default:
                return "UNDEFINED_QPL_EVENT";
            case 11:
                return "TALK_T4A_PERF_PROFILE_LOAD";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "TALK_T4A_COLD_START";
            case 14:
                return "TALK_T4A_LUKEWARM_START";
            case Process.SIGTERM /* 15 */:
                return "TALK_T4A_WARM_START";
        }
    }
}
