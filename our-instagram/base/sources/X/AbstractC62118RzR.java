package X;

/* renamed from: X.RzR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62118RzR {
    public static String A00(int i) {
        if (i == 1861) {
            return "WA_PERF_IMAGE_OPEN";
        }
        if (i == 2385) {
            return "WA_PERF_FIRST_FTS_RESULT";
        }
        if (i == 7038) {
            return "WA_PERF_CONTACT_OPEN";
        }
        if (i == 9129) {
            return "WA_PERF_CHAT_LIST_SCROLL";
        }
        if (i == 13240) {
            return "WA_PERF_CHAT_KEYBOARD_OPEN";
        }
        switch (i) {
            case 1:
                return "WA_PERF_COLD_START_ANDROID";
            case 2:
                return "WA_PERF_WARM_START_ANDROID";
            case 3:
                return "WA_PERF_HOT_START_ANDROID";
            case 4:
                return "WA_PERF_CAMERA_OPEN";
            case 5:
                return "WA_PERF_CHAT_OPEN";
            case 6:
                return "WA_PERF_SCROLL_PERF";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
