package X;

/* renamed from: X.Nyv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54275Nyv {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "NOT_INITIALIZED";
            case 1:
                return "DEFAULT";
            case 2:
                return "HIDDEN";
            case 3:
                return "BUY_ANOTHER";
            case 4:
                return "VERIFICATION_FAILED";
            default:
                return "IN_PROGRESS";
        }
    }
}
