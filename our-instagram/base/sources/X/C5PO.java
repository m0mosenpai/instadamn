package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5PO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5PO {
    public Map A00 = new HashMap();

    public C5PO(String str) {
        try {
            if (!str.isEmpty()) {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("Position");
                    this.A00.put(Integer.valueOf(i2), new C72781Xn1(this, jSONObject.getInt("BaseLatency"), jSONObject.getInt("Jitter"), jSONObject.getInt("SamplingRate")));
                }
            }
        } catch (Exception unused) {
        }
    }
}
