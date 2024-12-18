package X;

/* loaded from: classes5.dex */
public abstract class CJW {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "Selected";
                break;
            case 2:
                str = "Suggested";
                break;
            default:
                str = "Search";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
