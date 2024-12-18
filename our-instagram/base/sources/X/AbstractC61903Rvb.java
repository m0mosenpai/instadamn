package X;

/* renamed from: X.Rvb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61903Rvb {
    public static String A00(int i) {
        if (i == 1) {
            return "FBLITE_CLIENT_PERF_FBLITE_SESSION_EVENT";
        }
        if (i == 2) {
            return "FBLITE_CLIENT_PERF_FBLITE_SCREEN_TTI";
        }
        if (i == 3) {
            return "FBLITE_CLIENT_PERF_SINGLE_SESSION_EVENT";
        }
        switch (i) {
            case 8:
                return "FBLITE_CLIENT_PERF_FBLITE_SCROLL_PERF_QPL";
            case 9:
                return "FBLITE_CLIENT_PERF_FBLITE_MEMORY_STATS";
            case 10:
                return "FBLITE_CLIENT_PERF_FBLITE_QPL_TEST";
            case 11:
                return "FBLITE_CLIENT_PERF_FBLITE_SCROLL_PERF_QPL_FULL";
            default:
                switch (i) {
                    case 20:
                        return "FBLITE_CLIENT_PERF_INITIATING_START_EVENT";
                    case 4064:
                        return "FBLITE_CLIENT_PERF_RUNNABLE_SCHEDULER_TASKS";
                    case 4443:
                        return "FBLITE_CLIENT_PERF_LITE_INIT";
                    case 4665:
                        return "FBLITE_CLIENT_PERF_WEBLITE_SINGLE_SESSION_EVENT";
                    case 5137:
                        return "FBLITE_CLIENT_PERF_SINGLE_SESSION_EVENT_RESOURCES";
                    case 5212:
                        return "FBLITE_CLIENT_PERF_SINGLE_SESSION_EVENT_SERVER";
                    case 6316:
                        return "FBLITE_CLIENT_PERF_SINGLE_SESSION_EVENT_LOGIN_MESSAGE";
                    case 9927:
                        return "FBLITE_CLIENT_PERF_WEBLITE_SRS_MESSAGES_PROFILING";
                    case 11548:
                        return "FBLITE_CLIENT_PERF_SINGLE_SESSION_EVENT_MID_SESSION_RELOGIN";
                    case 14412:
                        return "FBLITE_CLIENT_PERF_IG_CARBON_SINGLE_SESSION_EVENT";
                    case 14736:
                        return "FBLITE_CLIENT_PERF_FBLITE_BACKGROUND_START";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
