package X;

/* renamed from: X.0fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09950fx {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "DISABLED";
            case 2:
                return "LOCAL";
            case 3:
                return "REMOTE";
            case 4:
                return "DOWNLOADING";
            default:
                return "UNKNOWN";
        }
    }
}
