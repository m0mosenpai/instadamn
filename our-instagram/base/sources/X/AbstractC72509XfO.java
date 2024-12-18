package X;

/* renamed from: X.XfO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72509XfO {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "Horizontal";
                break;
            case 2:
                str = "Both";
                break;
            default:
                str = "Vertical";
                break;
        }
        return str.hashCode() + intValue;
    }
}
