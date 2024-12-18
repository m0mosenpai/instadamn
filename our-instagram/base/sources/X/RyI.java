package X;

/* loaded from: classes10.dex */
public abstract class RyI {
    public static String A00(int i) {
        if (i == 1) {
            return "TEST1234";
        }
        if (i == 2) {
            return "PERF_TEST2";
        }
        if (i == 3) {
            return "PERF_QUICKLOG";
        }
        if (i == 19) {
            return "PERF_ELIGIBLE_FOR_INTERSTITIAL_TRIGGER";
        }
        if (i == 20) {
            return "PERF_RESTORE_INTERSTITIAL_TRIGGER_STATE";
        }
        if (i == 28) {
            return "PERF_TOUCH_EVENT_LATENCY";
        }
        if (i == 35) {
            return "PERF_FBLITE_CLIENT_TTI_SCREEN_DRAWN";
        }
        if (i == 43) {
            return "PERF_FBLITE_SESSION_EVENT";
        }
        if (i == 50) {
            return "PERF_FBLITE_CLIENT_EVENT_MANAGER";
        }
        if (i == 60) {
            return "PERF_SCROLLING_OTHER_SURFACE";
        }
        if (i == 70) {
            return "PERF_BENCHMARK";
        }
        if (i == 77) {
            return "PERF_DEFAULT_TTRC_ANDROID";
        }
        switch (i) {
            case 22:
                return "PERF_RESTORE_LAZY_TRIGGER_IDS";
            case 23:
                return "PERF_READ_TRIGGER_TOIDS";
            case 24:
                return "PERF_GET_FETCH_INTERSTITIAL_RESULT";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
