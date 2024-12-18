package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VVu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68567VVu {
    public static final String A00(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                JSONArray jSONArray = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put(str, jSONArray);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            C0K8.A0F("MobileConfigValueLogger", "Unable to create log", e);
            return "{}";
        }
    }
}
