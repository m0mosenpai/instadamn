package X;

/* renamed from: X.NoH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53666NoH {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "Prompted";
                break;
            case 2:
                str = "Accepted";
                break;
            case 3:
                str = "Declined";
                break;
            default:
                str = "NotPrompted";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
