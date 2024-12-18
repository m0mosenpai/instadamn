package X;

/* renamed from: X.CDj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27539CDj {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "Loading";
                break;
            case 2:
                str = "Success";
                break;
            case 3:
                str = "Idle";
                break;
            default:
                str = "Error";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
