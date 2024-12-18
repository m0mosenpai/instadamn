package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.4js, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102594js {
    public static JSONArray A01(List list) {
        JSONArray jSONArray = new JSONArray();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C26691Qy c26691Qy = (C26691Qy) list.get(i);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(c26691Qy.A00);
            jSONArray2.put(c26691Qy.A01);
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    public static ArrayList A00(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            try {
                arrayList.add(new C26691Qy(jSONArray2.getString(0), jSONArray2.getString(1)));
            } catch (C90143zv unused) {
                throw new JSONException("Invalid pattern");
            }
        }
        return arrayList;
    }
}
