package X;

/* renamed from: X.3lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82353lx {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "suggested_reply";
            case 2:
                return "emoji_quick_reply";
            case 3:
                return "order_upsell";
            case 4:
                return "order_upsell_v2";
            case 5:
                return "appointment_upsell";
            case 6:
                return "thread_ctd_upsell";
            default:
                return "unknown";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static String A01(Integer num) {
        int i;
        switch (num.intValue()) {
            case 1:
                i = 1790;
                return AbstractC111324zv.A00(i);
            case 2:
                i = 1600;
                return AbstractC111324zv.A00(i);
            case 3:
                i = 1703;
                return AbstractC111324zv.A00(i);
            case 4:
                i = 1704;
                return AbstractC111324zv.A00(i);
            case 5:
                i = 1482;
                return AbstractC111324zv.A00(i);
            case 6:
                i = 1810;
                return AbstractC111324zv.A00(i);
            default:
                return "UNKNOWN";
        }
    }
}
