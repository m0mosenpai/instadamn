package X;

/* renamed from: X.56U, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C56U {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "server_derived";
            case 2:
                return "server_derived_fallback";
            case 3:
                return "high_quality_static";
            case 4:
                return "high_quality_server_derived";
            case 5:
                return "high_quality_server_derived_fallback";
            case 6:
                return "unknown";
            default:
                return "static";
        }
    }
}
