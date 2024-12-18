package X;

/* renamed from: X.NtW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53959NtW {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "LOADED";
                break;
            case 2:
                str = "ERROR";
                break;
            case 3:
                str = "UNINITIALIZED";
                break;
            default:
                str = "LOADING";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
