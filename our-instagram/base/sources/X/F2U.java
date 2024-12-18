package X;

/* loaded from: classes6.dex */
public abstract class F2U {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        if (1 != intValue) {
            str = "ONE_TAP_SEND";
        } else {
            str = "MULTI_SELECT";
        }
        return str.hashCode() + intValue;
    }
}
