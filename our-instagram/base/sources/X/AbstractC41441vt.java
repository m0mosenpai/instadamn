package X;

/* renamed from: X.1vt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41441vt {
    public static Integer A00(String str) {
        if (str.equals("UNSET")) {
            return C05F.A00;
        }
        if (str.equals("GRAPHQL")) {
            return C05F.A01;
        }
        if (str.equals("GRAPHQL_FROM_DISK")) {
            return C05F.A0C;
        }
        if (str.equals("MSYS")) {
            return C05F.A0N;
        }
        if (str.equals("MSYS_FROM_DISK")) {
            return C05F.A0Y;
        }
        if (str.equals("SWITCHER_GRAPHQL")) {
            return C05F.A0j;
        }
        if (str.equals("SWITCHER_GRAPHQL_FROM_DISK")) {
            return C05F.A0u;
        }
        if (str.equals("BLOKS_ACTION")) {
            return C05F.A15;
        }
        if (str.equals("NATIVE_TEMPLATE_ACTION")) {
            return C05F.A1F;
        }
        if (str.equals("GRAPHQL_SERVICE_CACHE")) {
            return C05F.A1I;
        }
        if (str.equals("GRAPHQL_SERVICE_CACHE_FROM_DISK")) {
            return C05F.A02;
        }
        throw new IllegalArgumentException(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "GRAPHQL";
            case 2:
                return "GRAPHQL_FROM_DISK";
            case 3:
                return "MSYS";
            case 4:
                return "MSYS_FROM_DISK";
            case 5:
                return "SWITCHER_GRAPHQL";
            case 6:
                return "SWITCHER_GRAPHQL_FROM_DISK";
            case 7:
                return "BLOKS_ACTION";
            case 8:
                return "NATIVE_TEMPLATE_ACTION";
            case 9:
                return "GRAPHQL_SERVICE_CACHE";
            case 10:
                return "GRAPHQL_SERVICE_CACHE_FROM_DISK";
            default:
                return "UNSET";
        }
    }
}
