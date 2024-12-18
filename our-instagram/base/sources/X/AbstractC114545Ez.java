package X;

/* renamed from: X.5Ez, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC114545Ez {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "TIMEOUT";
            case 1:
                return "SUCCESS";
            case 2:
                return "RETRY";
            case 3:
                return "REAL_TIME_PEAK_NOT_NOW";
            case 4:
                return "NOT_BACKGROUND";
            case 5:
                return "DISABLED";
            default:
                return "HEALTHCHECK_FAILURE";
        }
    }
}
