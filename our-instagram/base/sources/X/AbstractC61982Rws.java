package X;

/* renamed from: X.Rws, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61982Rws {
    public static String A00(int i) {
        if (i == 11) {
            return "INIT_POST_CHROME_ANDROID";
        }
        if (i == 26) {
            return "INIT_POST_CHROME_ANDROID_STALL_FOREGROUND_SESSION";
        }
        if (i == 3213) {
            return "INIT_SCHEDULED_WORK";
        }
        if (i == 4948) {
            return "INIT_DELEGATE_FAILED_INIT";
        }
        if (i == 6292) {
            return "INIT_APP_INIT";
        }
        switch (i) {
            case 5:
                return "INIT_NON_CRITICAL_AFTER_UI_LOADED";
            case 6:
                return "INIT_NON_CRITICAL_AFTER_COLD_START";
            case 7:
                return "INIT_COLD_START";
            case 8:
                return "INIT_WARM_START";
            case 9:
                return "INIT_HOT_START";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
