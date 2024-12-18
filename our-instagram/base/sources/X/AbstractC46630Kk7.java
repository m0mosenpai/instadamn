package X;

/* renamed from: X.Kk7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46630Kk7 {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "LOADING";
                break;
            case 2:
                str = "SUCCESS";
                break;
            case 3:
                str = "ERROR";
                break;
            default:
                str = "UNINITIALIZED";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
