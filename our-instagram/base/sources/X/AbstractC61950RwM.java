package X;

/* renamed from: X.RwM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61950RwM {
    public static String A00(int i) {
        if (i == 1) {
            return "IG_APP_START_COLD_TO_FEED";
        }
        if (i == 2) {
            return "IG_APP_START_BACKGROUND_COLDSTART";
        }
        if (i == 3) {
            return "IG_APP_START_BACKGROUND_COLDSTART_ATTEMPT";
        }
        if (i == 4) {
            return "IG_APP_START_SILENT_PUSH";
        }
        switch (i) {
            case 1059:
                return "IG_APP_START_COLD_TO_TOUCH";
            case 2420:
                return "IG_APP_START_APP_COMPONENT_FACTORY_COMPONENT";
            case 3806:
                return "IG_APP_START_COLD_START_INTENT";
            case 5442:
                return "IG_APP_START_FBNS_INIT_ERROR";
            case 5557:
                return "IG_APP_START_SLOW_APP_COMPONENT";
            case 7694:
                return "IG_APP_START_ASYNC_COLD_START_TIMEOUT";
            case 7899:
                return "IG_APP_START_KEEP_WARM_RECEIVER";
            case 11028:
                return "IG_APP_START_IG_APP_SERVICES_EVENTS";
            case 13228:
                return "IG_APP_START_APP_ENTRY";
            case 14305:
                return "IG_APP_START_IG_APP_SERVICES";
            case 15916:
                return "IG_APP_START_BROADCAST_RECEIVED_AFTER_REPLAY_COMPLETED";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
