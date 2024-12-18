package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.5mw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC126045mw {
    public static C19260xA A01(Map map) {
        String str;
        Object A01;
        C19260xA c19260xA = new C19260xA();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof Map) {
                    A01 = A01((Map) value);
                } else if (value instanceof List) {
                    A01 = A02((List) value);
                } else {
                    if (!(value instanceof Boolean) && !(value instanceof Integer) && !(value instanceof Long) && !(value instanceof Float) && !(value instanceof Double) && !(value instanceof String)) {
                        throw new IllegalArgumentException("Unexpected value type.");
                    }
                    str = (String) entry.getKey();
                }
                C19260xA.A00(c19260xA, A01, (String) entry.getKey());
            } else {
                str = (String) entry.getKey();
                value = null;
            }
            C19260xA.A00(c19260xA, value, str);
        }
        return c19260xA;
    }

    public static C0x9 A02(List list) {
        String str;
        C0x9 c0x9 = new C0x9();
        for (Object obj : list) {
            if (obj != null) {
                if (obj instanceof Boolean) {
                    c0x9.A05(((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    c0x9.A01(((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    c0x9.A02(((Number) obj).longValue());
                } else {
                    if (!(obj instanceof Float)) {
                        if (obj instanceof Double) {
                            c0x9.A00(((Number) obj).doubleValue());
                        } else if (obj instanceof String) {
                            str = (String) obj;
                        } else if (obj instanceof List) {
                            obj = A02((List) obj);
                        } else if (obj instanceof Map) {
                            obj = A01((Map) obj);
                        } else {
                            throw new IllegalArgumentException("Unexpected value type.");
                        }
                    }
                    c0x9.A00.add(obj);
                }
            } else {
                str = null;
            }
            c0x9.A04(str);
        }
        return c0x9;
    }

    public static C19280xC A00(String str, String str2, List list, Map map, Map map2, int i, int i2, long j, boolean z) {
        String str3;
        C19280xC A01 = C19280xC.A01(String.valueOf(i), "client_event");
        A01.A08(Integer.valueOf(i2), "event_type");
        A01.A0C("category", str);
        A01.A0C("feature", str2);
        A01.A09("realtime", Boolean.valueOf(z));
        A01.A0B("event_instance_id", Long.valueOf(j));
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    str3 = value.toString();
                } else {
                    str3 = null;
                }
                A01.A0C(str4, str3);
            }
        }
        if (map2 != null) {
            A01.A05(A01(map2), "event_annotations");
        }
        if (list != null) {
            A01.A06(A02(list), "eav");
        }
        return A01;
    }
}
