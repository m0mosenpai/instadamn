package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0Jc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03870Jc {
    public static final Map A00 = new ConcurrentHashMap();

    public static String A00(Class cls) {
        String name;
        try {
            name = (String) cls.getDeclaredField("__redex_internal_original_name").get(cls);
        } catch (NoSuchFieldException unused) {
            name = cls.getName();
        } catch (Exception e) {
            throw new Error(e);
        }
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            if (lastIndexOf != name.length()) {
                try {
                    return name.substring(lastIndexOf + 1);
                } catch (Exception e2) {
                    throw new Error(e2);
                }
            }
            throw new Error(AnonymousClass001.A0g("Unexpected string ", name, " in __redex_internal_original_name"));
        }
        return name;
    }
}
