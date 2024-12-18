package X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6qA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150576qA {
    public static final C19260xA A00(C150576qA c150576qA, JSONObject jSONObject) {
        Object A00;
        C19260xA c19260xA = new C19260xA();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (!(obj instanceof String) && !(obj instanceof Integer) && !(obj instanceof Double) && !(obj instanceof Long) && !(obj instanceof Boolean)) {
                if (obj instanceof JSONObject) {
                    A00 = A00(c150576qA, (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    A00 = c150576qA.A01((JSONArray) obj);
                }
                C19260xA.A00(c19260xA, A00, next);
            } else {
                C19260xA.A00(c19260xA, obj, next);
            }
        }
        return c19260xA;
    }

    private final C0x9 A01(JSONArray jSONArray) {
        InterfaceC11310in A01;
        C0x9 c0x9 = new C0x9();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof String) {
                c0x9.A04((String) obj);
            } else if (obj instanceof Integer) {
                c0x9.A01(((Number) obj).intValue());
            } else if (obj instanceof Double) {
                c0x9.A00(((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                c0x9.A02(((Number) obj).longValue());
            } else if (obj instanceof Boolean) {
                c0x9.A05(((Boolean) obj).booleanValue());
            } else {
                if (obj instanceof JSONObject) {
                    A01 = A00(this, (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    A01 = A01((JSONArray) obj);
                }
                c0x9.A00.add(A01);
            }
        }
        return c0x9;
    }
}
