package X;

/* renamed from: X.NzN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54303NzN {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "SUCCESS";
            case 2:
                return "ATTENTION";
            case 3:
                return "CRITICAL";
            case 4:
                return "NEUTRAL";
            default:
                return "INFO";
        }
    }
}
