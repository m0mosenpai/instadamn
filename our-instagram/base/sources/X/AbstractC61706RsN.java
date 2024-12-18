package X;

/* renamed from: X.RsN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61706RsN {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "UNKNOWN";
            case 1:
                return "BWI_AD";
            case 2:
                return "CACHE";
            default:
                return "NETWORK";
        }
    }
}
