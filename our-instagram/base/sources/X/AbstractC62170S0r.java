package X;

/* renamed from: X.S0r, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62170S0r {
    public static String A00(Integer num) {
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    return "END";
                case 2:
                    return "MOVE";
                case 3:
                    return "CANCEL";
                default:
                    return "START";
            }
        }
        return "null";
    }
}
