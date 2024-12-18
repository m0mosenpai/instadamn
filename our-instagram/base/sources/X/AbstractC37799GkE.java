package X;

/* renamed from: X.GkE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37799GkE {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FLASH_CACHE";
            case 2:
                return "PREFETCH";
            case 3:
                return "NETWORK";
            case 4:
                return "CACHE";
            case 5:
                return "UNKNOWN";
            default:
                return "SOURCE_ITEM";
        }
    }
}
