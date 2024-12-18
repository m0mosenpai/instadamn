package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4q7, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4q7 {
    public static C64092vU A00;
    public static final Map A01 = new LinkedHashMap();
    public static final Map A02 = new LinkedHashMap();

    public static final Integer A00(String str) {
        Map map = A02;
        for (Object obj : map.keySet()) {
            if (AbstractC001900j.A0a((String) obj, str, false)) {
                if (obj == null) {
                    return null;
                }
                return (Integer) map.get(obj);
            }
        }
        return null;
    }

    public static final Long A01(String str) {
        C14360o3.A0B(str, 0);
        Map map = A01;
        for (Object obj : map.keySet()) {
            if (AbstractC001900j.A0a((String) obj, str, false)) {
                if (obj == null) {
                    return null;
                }
                return (Long) map.get(obj);
            }
        }
        return null;
    }
}
