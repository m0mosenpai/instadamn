package X;

/* renamed from: X.I0l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40653I0l {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "UNLOCKED";
                break;
            case 2:
                str = "NOT_LOCKABLE";
                break;
            default:
                str = "LOCKED";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
