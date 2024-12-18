package X;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1MW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1MW extends C1MX {
    public final SharedPreferences A00;
    public final String A01;

    @Override // X.C1MX
    public final Map A00() {
        JSONObject jSONObject;
        StringBuilder sb;
        String str;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.A00.getAll().entrySet()) {
            String key = entry.getKey();
            if (key != null && key.startsWith(this.A01)) {
                try {
                    jSONObject = new JSONObject((String) entry.getValue());
                } catch (JSONException unused) {
                    jSONObject = new JSONObject();
                }
                if (jSONObject.length() <= 0) {
                    sb = new StringBuilder();
                    str = "Found an invalid JSON for plugin=";
                } else {
                    String optString = jSONObject.optString("path", "");
                    if (optString.isEmpty()) {
                        sb = new StringBuilder();
                        str = "Found an JSON without path param for plugin=";
                    } else {
                        hashMap.put(optString, jSONObject);
                    }
                }
                sb.append(str);
                sb.append(super.A00);
                C0I2.A03("SharedPrefCaskMetadataStore", sb.toString());
            }
        }
        return hashMap;
    }

    @Override // X.C1MX
    public final void A01(String str) {
        this.A00.edit().remove(AnonymousClass001.A0O(this.A01, str.hashCode())).apply();
    }

    public C1MW(SharedPreferences sharedPreferences, String str) {
        super(str);
        this.A01 = AnonymousClass001.A0R(str, "/");
        this.A00 = sharedPreferences;
    }

    @Override // X.C1MX
    public final void A02(String str, JSONObject jSONObject) {
        try {
            jSONObject.put("path", str);
        } catch (JSONException unused) {
            C0I2.A03("SharedPrefCaskMetadataStore", AnonymousClass001.A0u("Failed to add path for plugin=", super.A00, "; path=", str));
        }
        this.A00.edit().putString(AnonymousClass001.A0O(this.A01, str.hashCode()), jSONObject.toString()).apply();
    }
}
