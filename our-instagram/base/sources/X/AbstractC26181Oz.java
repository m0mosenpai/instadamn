package X;

/* renamed from: X.1Oz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC26181Oz {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "skip_cache";
            case 2:
                return "use_cache";
            case 3:
                return "use_cache_with_fallback";
            case 4:
                return "use_cache_if_timeout";
            case 5:
                return "avoid_cache_writing_use_cache_if_timeout";
            case 6:
                return "cross_app_fetch_cache";
            default:
                return "undefined";
        }
    }
}
