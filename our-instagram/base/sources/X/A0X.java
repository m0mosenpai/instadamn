package X;

/* loaded from: classes4.dex */
public abstract class A0X {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "TRANSLATED";
                break;
            case 2:
                str = "LOADING";
                break;
            case 3:
                str = "FAILED";
                break;
            default:
                str = "ORIGINAL";
                break;
        }
        return str.hashCode() + intValue;
    }
}
