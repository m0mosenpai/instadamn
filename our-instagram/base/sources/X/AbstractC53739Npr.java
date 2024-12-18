package X;

/* renamed from: X.Npr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53739Npr {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "INSTAGRAM";
                break;
            case 2:
                str = "FACEBOOK_VIDEO";
                break;
            case 3:
                str = "MESSAGING";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
