package X;

/* loaded from: classes7.dex */
public abstract class I00 {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "ORGANIC";
                break;
            case 2:
                str = "AD";
                break;
            case 3:
                str = "NETEGO";
                break;
            case 4:
                str = "STATIC_MODEL";
                break;
            default:
                str = "UNDEFINED";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
