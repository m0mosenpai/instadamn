package X;

import java.util.ArrayList;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public abstract class F9J {
    public static ArrayList A00(String str) {
        ArrayList A1E = AbstractC166987dD.A1E();
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            A1E.add(jSONArray.getString(i));
        }
        return A1E;
    }
}
