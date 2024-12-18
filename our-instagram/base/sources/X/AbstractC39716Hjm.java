package X;

/* renamed from: X.Hjm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39716Hjm {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ZERO_SIZE";
            case 1:
                return "CACHED";
            case 2:
                return "PARTIALLY_CACHED";
            case 3:
                return "NOT_CACHED";
            default:
                return "UNKNOWN";
        }
    }
}
