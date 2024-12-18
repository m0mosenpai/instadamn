package X;

/* renamed from: X.KoP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46882KoP {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "N/A";
            case 1:
                return "UNKNOWN";
            case 2:
                return "FROM_ACCOUNT_SWITCH";
            default:
                return "FROM_COLD_START";
        }
    }
}
