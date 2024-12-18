package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2CT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CT {
    public static final void A00(C19260xA c19260xA, C2CT c2ct, Object obj, String str) {
        if (!(obj instanceof String) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (obj instanceof Map) {
                C19260xA c19260xA2 = new C19260xA();
                Iterator it = ((Map) obj).entrySet().iterator();
                while (it.hasNext()) {
                    A00(c19260xA2, c2ct, ((Map.Entry) it.next()).getValue(), str);
                }
                return;
            }
            return;
        }
        C19260xA.A00(c19260xA, obj, str);
    }
}
