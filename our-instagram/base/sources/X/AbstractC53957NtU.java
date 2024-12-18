package X;

/* renamed from: X.NtU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53957NtU {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "FAILED";
                break;
            case 2:
                str = "FAILED_PERMANENT";
                break;
            case 3:
                str = "UPLOADED";
                break;
            default:
                str = "PENDING";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}
