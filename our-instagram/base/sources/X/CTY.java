package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class CTY {
    public final JSONObject A00;

    public final void A00(String str, String str2) {
        try {
            if (str2 == null) {
                this.A00.put(str, JSONObject.NULL);
            } else {
                this.A00.put(str, str2);
            }
        } catch (JSONException unused) {
        }
    }

    public CTY(JSONObject jSONObject) {
        this.A00 = jSONObject;
    }
}
