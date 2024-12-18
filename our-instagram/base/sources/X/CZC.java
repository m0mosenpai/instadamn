package X;

/* loaded from: classes5.dex */
public abstract class CZC {
    public static String A01(Integer num) {
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    return "CENTER";
                case 2:
                    return "END";
                default:
                    return "START";
            }
        }
        return "null";
    }

    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "CENTER";
                break;
            case 2:
                str = "END";
                break;
            default:
                str = "START";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
