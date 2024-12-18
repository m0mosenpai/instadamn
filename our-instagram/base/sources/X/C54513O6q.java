package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.O6q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54513O6q {
    public Map A00;
    public final C229419w A01;

    public C54513O6q(C229419w c229419w, String str) {
        this.A01 = c229419w;
        try {
            HashMap A1G = AbstractC166987dD.A1G();
            if (!str.isEmpty()) {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(keys);
                    MSX.A1N(A1B, A1G, jSONObject.getLong(A1B));
                }
            }
            this.A00 = A1G;
        } catch (JSONException e) {
            C0K8.A0F("MobileConfigFBTFactory", e.toString(), e);
            this.A00 = AbstractC166987dD.A1G();
        }
    }
}
