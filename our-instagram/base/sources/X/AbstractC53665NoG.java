package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.NoG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53665NoG {
    public static final LinkedHashMap A00(JSONObject jSONObject) {
        C14360o3.A0B(jSONObject, 0);
        Iterator<String> keys = jSONObject.keys();
        C14360o3.A07(keys);
        C2Z2 A0A = AbstractC224717j.A0A(keys);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        Iterator it = A0A.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = jSONObject.get((String) next);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                C17u A0C = C17s.A0C(0, jSONArray.length());
                LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC50522MSa.A09(A0C));
                Iterator it2 = A0C.iterator();
                while (it2.hasNext()) {
                    int A00 = ((AbstractC16880sg) it2).A00();
                    A18.put(String.valueOf(A00), jSONArray.get(A00));
                }
                obj = AbstractC001800i.A0a(A00(new JSONObject(A18)).values());
            } else if (obj instanceof JSONObject) {
                obj = A00((JSONObject) obj);
            } else if (C14360o3.A0K(obj, JSONObject.NULL)) {
                obj = null;
            }
            A1I.put(next, obj);
        }
        return A1I;
    }
}
