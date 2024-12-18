package X;

/* renamed from: X.5SF, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5SF {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "prefetch";
            case 2:
                return "cross_session";
            case 3:
                return "pool_refresh";
            case 4:
                return "invalid";
            default:
                return "server";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PREFETCH";
            case 2:
                return "CROSS_SESSION";
            case 3:
                return "POOL_REFRESH";
            case 4:
                return "INVALID";
            default:
                return "SURFACE_FETCH";
        }
    }
}
