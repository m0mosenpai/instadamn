package X;

/* renamed from: X.NtI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53945NtI {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CCP_UNLINKED";
            case 2:
                return "CCP_PAGE_CREATION_PENDING";
            case 3:
                return "CCP_MIGRATION_PAGE_UPSELL";
            case 4:
                return "XAR";
            default:
                return "CCP";
        }
    }
}
