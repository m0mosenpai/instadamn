package X;

/* loaded from: classes4.dex */
public abstract class A3C {
    public static String A00(Integer num) {
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    return "DROP_OLDEST";
                case 2:
                    return "DROP_LATEST";
                default:
                    return "SUSPEND";
            }
        }
        return "null";
    }
}
