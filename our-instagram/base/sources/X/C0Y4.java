package X;

import org.json.JSONArray;

/* renamed from: X.0Y4, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0Y4 {
    public static JSONArray A00(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    public static String[] A01(JSONArray jSONArray) {
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return strArr;
    }
}
