package X;

/* renamed from: X.OPx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54901OPx {
    public static String A01(Integer num) {
        if (num != null) {
            if (1 - num.intValue() != 0) {
                return "THREADS_HANGOUT";
            }
            return "DEFAULT";
        }
        return "null";
    }

    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        if (1 != intValue) {
            str = "THREADS_HANGOUT";
        } else {
            str = "DEFAULT";
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
