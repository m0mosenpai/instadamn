package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4lf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC103634lf {
    public static JSONObject A00(C26701Qz c26701Qz) {
        JSONArray jSONArray = new JSONArray();
        for (C62723SNn c62723SNn : c26701Qz.A00) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", c62723SNn.A01);
            jSONObject.put("url", c62723SNn.A02);
            jSONObject.put("cooldown", c62723SNn.A00);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("pingConfigs", jSONArray);
        return jSONObject2;
    }
}
