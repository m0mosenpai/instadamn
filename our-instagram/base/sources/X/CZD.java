package X;

/* loaded from: classes5.dex */
public abstract class CZD {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "Center";
                break;
            case 2:
                str = "End";
                break;
            default:
                str = "Start";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "Center";
            case 2:
                return "End";
            default:
                return "Start";
        }
    }
}
