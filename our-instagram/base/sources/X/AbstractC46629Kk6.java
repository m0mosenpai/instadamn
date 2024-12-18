package X;

/* renamed from: X.Kk6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46629Kk6 {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "UNSUBSCRIBED";
                break;
            case 2:
                str = "SUBSCRIBED";
                break;
            default:
                str = "UNAVAILABLE";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
