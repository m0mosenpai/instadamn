package X;

/* renamed from: X.Xfl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72532Xfl {
    public static String A00(Integer num) {
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    return "PREPARED";
                case 2:
                    return "STARTED";
                default:
                    return "STOPPED";
            }
        }
        return "null";
    }
}
