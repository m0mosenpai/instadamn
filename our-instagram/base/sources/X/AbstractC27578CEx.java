package X;

/* renamed from: X.CEx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27578CEx {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "LOADING";
                break;
            case 2:
                str = "LOADED";
                break;
            default:
                str = "ERROR";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
