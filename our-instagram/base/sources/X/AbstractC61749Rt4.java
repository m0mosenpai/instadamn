package X;

import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.Rt4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61749Rt4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    public static void A00(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String A1B = AbstractC166987dD.A1B(keys);
            JSONObject optJSONObject = jSONObject2.optJSONObject(A1B);
            Object optJSONObject2 = jSONObject.optJSONObject(A1B);
            if (optJSONObject != null && optJSONObject2 != 0) {
                A00(optJSONObject2, optJSONObject);
            } else {
                optJSONObject2 = jSONObject2.get(A1B);
            }
            jSONObject.put(A1B, optJSONObject2);
        }
    }
}
