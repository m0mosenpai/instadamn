package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class SAN {
    public final List A00;

    public SAN(JSONArray jSONArray) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    A1E.add(new C62600SIe(optJSONObject));
                }
            }
        }
        this.A00 = A1E;
    }
}
