package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8eY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC191768eY {
    public static AbstractC911344p A00(Object obj) {
        double doubleValue;
        C55B c55b = null;
        C54s c54s = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                AbstractC911344p A00 = A00(entry.getValue());
                if (A00 != null) {
                    if (c54s == null) {
                        c54s = new C54s(C913045j.A00);
                    }
                    c54s.A0C(A00, valueOf);
                }
            }
            return c54s;
        }
        if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                AbstractC911344p A002 = A00(obj2);
                if (obj2 != null) {
                    if (c55b == null) {
                        c55b = new C55B(C913045j.A00);
                    }
                    c55b.A0C(A002);
                }
            }
            return c55b;
        }
        if (!(obj instanceof Integer)) {
            if (obj instanceof Float) {
                doubleValue = Double.parseDouble(String.valueOf(obj));
            } else {
                if (obj instanceof Double) {
                    Number number = (Number) obj;
                    if (number != null) {
                        doubleValue = number.doubleValue();
                    }
                } else if (!(obj instanceof Byte)) {
                    if (obj instanceof Short) {
                        Number number2 = (Number) obj;
                        if (number2 != null) {
                            return new C60599RBq(number2.shortValue());
                        }
                    } else if (obj instanceof Long) {
                        Number number3 = (Number) obj;
                        if (number3 != null) {
                            return new C1122654z(number3.longValue());
                        }
                    } else {
                        if (obj instanceof Boolean) {
                            if (((Boolean) obj).booleanValue()) {
                                return AnonymousClass550.A02;
                            }
                            return AnonymousClass550.A01;
                        }
                        return C1122354v.A00(String.valueOf(obj));
                    }
                }
                return C60603RBu.A00;
            }
            return new C60597RBo(doubleValue);
        }
        Number number4 = (Number) obj;
        if (number4 != null) {
            return C1122554x.A00(number4.intValue());
        }
        return C60603RBu.A00;
    }

    public static HashMap A01(Map map) {
        AbstractC911344p A00;
        HashMap hashMap = new HashMap();
        if (!map.isEmpty()) {
            hashMap.put("server_params", map);
        }
        HashMap hashMap2 = new HashMap();
        String str = "{}";
        if (!hashMap.isEmpty() && (A00 = A00(hashMap)) != null) {
            str = A00.toString();
        }
        hashMap2.put("params", str);
        return hashMap2;
    }
}
