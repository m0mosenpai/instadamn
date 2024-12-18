package X;

/* renamed from: X.Kii, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46543Kii {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "NO_DECISION_MADE";
            case 2:
                return "BACKUP_CREATED";
            case 3:
                return "LOCAL_DEVICE_ONLY";
            default:
                return "FAILURE";
        }
    }
}
