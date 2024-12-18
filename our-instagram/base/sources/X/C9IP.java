package X;

/* renamed from: X.9IP, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9IP {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "SEARCH_FOR_PREFETCH_CACHE_CONTENT";
            case 1:
                return "PREFETCH_CACHE_CONTENT";
            case 2:
                return "ON_RESPONSE_POINT";
            case 3:
                return "LOAD_FLASH_CACHE_CONTENT";
            case 4:
                return "LOAD_FLASH_CACHE_CONTENT_FROM_MEDIA_CACHE";
            default:
                return "LOAD_FLASH_CACHE_CONTENT_FROM_REPO";
        }
    }
}
