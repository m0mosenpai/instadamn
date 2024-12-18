package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.PyI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58591PyI {
    public final void A01(AnonymousClass182 anonymousClass182, Map map) {
        C14360o3.A0B(map, 1);
        anonymousClass182.A0d();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            anonymousClass182.A0r((String) key);
            A00(anonymousClass182, value);
        }
        anonymousClass182.A0a();
    }

    private final void A00(AnonymousClass182 anonymousClass182, Object obj) {
        if (obj instanceof String) {
            anonymousClass182.A0u((String) obj);
            return;
        }
        if (obj instanceof Map) {
            A01(anonymousClass182, (Map) obj);
            return;
        }
        if (obj instanceof List) {
            anonymousClass182.A0c();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                A00(anonymousClass182, it.next());
            }
            anonymousClass182.A0Z();
            return;
        }
        if (obj instanceof Boolean) {
            anonymousClass182.A0y(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Double) {
            anonymousClass182.A0f(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            anonymousClass182.A0i(((Number) obj).longValue());
        } else {
            if (obj == null) {
                anonymousClass182.A0b();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unknown value type");
            sb.append(obj);
            throw new IllegalStateException(sb.toString());
        }
    }
}
