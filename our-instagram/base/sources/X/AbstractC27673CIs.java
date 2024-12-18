package X;

/* renamed from: X.CIs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27673CIs {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "User";
                break;
            case 2:
                str = "Foursquare";
                break;
            default:
                str = MSV.A00(366);
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
