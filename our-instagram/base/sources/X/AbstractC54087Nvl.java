package X;

/* renamed from: X.Nvl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54087Nvl {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "SUCCEEDED";
            case 2:
                return "FAILED";
            case 3:
                return "SKIPPED";
            default:
                return "STARTED";
        }
    }
}
