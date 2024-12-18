package X;

import java.util.Map;

/* renamed from: X.3Xt, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3Xt {
    public static final int A00(Map map, String str, int i) {
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Integer.parseInt(str2);
            }
            return i;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final Long A01(String str, Map map) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            return Long.valueOf(Long.parseLong(str2));
        }
        return null;
    }

    public static final void A02(String str, Map map) {
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                Long.parseLong(str2);
            }
        } catch (NumberFormatException unused) {
        }
    }
}
