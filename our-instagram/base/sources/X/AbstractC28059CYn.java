package X;

/* renamed from: X.CYn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28059CYn {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "invalid_gap_at_page_border";
            case 2:
                return "invalid_server_gap";
            case 3:
                return "server_dedup";
            case 4:
                return "load_from_http_cache";
            case 5:
                return "gre_wrong_reporting";
            case 6:
                return "flash_cache_tailload_insertion";
            case 7:
                return "flash_cache_headload_insertion";
            default:
                return "organic_dedup";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "INVALID_GAP_AT_PAGE_BORDER";
            case 2:
                return "INVALID_SERVER_GAP";
            case 3:
                return "SERVER_DEDUP";
            case 4:
                return "LOAD_FROM_HTTP_CACHE";
            case 5:
                return "GRE_WRONG_REPORTING";
            case 6:
                return "FLASH_CACHE_TAILLOAD_INSERTION";
            case 7:
                return "FLASH_CACHE_HEADLOAD_INSERTION";
            default:
                return "ORGANIC_DEDUP";
        }
    }
}
