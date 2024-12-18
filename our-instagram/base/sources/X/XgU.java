package X;

/* loaded from: classes12.dex */
public abstract class XgU {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "STARTED";
            case 2:
                return "STOP_IN_PROGRESS";
            case 3:
                return "STOPPED";
            default:
                return "PREPARED";
        }
    }
}
