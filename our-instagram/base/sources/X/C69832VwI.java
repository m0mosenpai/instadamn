package X;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VwI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69832VwI {
    public static final void A00(C70129W5q c70129W5q, Map map) {
        map.put("resize_status", c70129W5q.toString());
        C70471WYc c70471WYc = c70129W5q.A0F;
        if (c70471WYc != null) {
            Map map2 = c70471WYc.A00;
            if (!map2.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator A16 = AbstractC166997dE.A16(map2);
                while (A16.hasNext()) {
                    VJN vjn = (VJN) A16.next();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_tag", vjn.A01);
                        jSONObject.put("renderer", vjn.A02);
                        jSONObject.put("error_count", vjn.A00);
                        jSONArray.put(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
                String obj = jSONArray.toString();
                if (obj != null) {
                    map.put("glrenderer_statistics", obj);
                }
            }
        }
    }
}
