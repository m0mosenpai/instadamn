package X;

/* loaded from: classes11.dex */
public final class W6Q {
    public static int A00(String str) {
        if (str == null || "undefined".equals(str)) {
            return -1;
        }
        if ("rtl".equals(str)) {
            return 1;
        }
        if ("ltr".equals(str)) {
            return 0;
        }
        AbstractC65702TsY.A1U("Invalid layoutDirection: ", str);
        return -1;
    }

    public static int A01(String str) {
        if (str == null) {
            return 1;
        }
        if (str.equals("balanced")) {
            return 2;
        }
        return str.equals("simple") ? 0 : 1;
    }
}
