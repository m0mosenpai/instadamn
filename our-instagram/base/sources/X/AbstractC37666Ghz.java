package X;

/* renamed from: X.Ghz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37666Ghz {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "flash_media";
            case 1:
                return "head_media";
            case 2:
                return "source_media";
            case 3:
                return "source_grid";
            case 4:
                return "cached_items_request";
            default:
                return "network_request";
        }
    }
}
