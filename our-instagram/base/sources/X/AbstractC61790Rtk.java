package X;

/* renamed from: X.Rtk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61790Rtk {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "FAILURE";
            case 1:
                return "PRIMARY_DNS";
            case 2:
                return "PRIMARY_DNS_RETRY";
            case 3:
                return "SECONDARY_DNS";
            case 4:
                return "SECONDARY_DNS_RETRY";
            case 5:
                return "DNS_CACHE";
            default:
                return "PERSISTENT_CACHE";
        }
    }
}
