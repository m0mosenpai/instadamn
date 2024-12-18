package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55372gc {
    public QuickPromotionSurface A00;
    public final Map A01 = new LinkedHashMap();

    public final String toString() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : this.A01.entrySet()) {
            QuickPromotionSurface quickPromotionSurface = (QuickPromotionSurface) entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("s", quickPromotionSurface.name());
                jSONObject.put("t", longValue);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        String obj = jSONArray.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public C55372gc(String str) {
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("s");
                    C14360o3.A07(string);
                    QuickPromotionSurface valueOf = QuickPromotionSurface.valueOf(string);
                    this.A01.put(valueOf, Long.valueOf(jSONObject.getLong("t")));
                    this.A00 = valueOf;
                }
            } catch (JSONException unused) {
            }
        }
    }

    public C55372gc() {
    }
}
