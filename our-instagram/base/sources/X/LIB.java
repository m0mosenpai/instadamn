package X;

import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class LIB {
    public List A00;
    public List A01;
    public List A02;
    public JSONObject A03;
    public boolean A04;
    public boolean A05;
    public final String A06;
    public final Random A07;

    public LIB(String str) {
        C14360o3.A0B(str, 1);
        this.A06 = str;
        this.A07 = new Random();
        this.A04 = AbstractC002300n.A0h(AbstractC25228BEl.A1A(str), "{", false);
    }

    public static final Double A00(LIB lib, List list, Map map, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        double d = 0.0d;
        int i = 0;
        int length = jSONArray.length() - 1;
        if (length >= 0) {
            while (true) {
                Double A01 = A01(lib, list, map, jSONArray.optJSONObject(i));
                if (A01 == null) {
                    return null;
                }
                d += A01.doubleValue();
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return Double.valueOf(d);
    }

    public static final Double A01(LIB lib, List list, Map map, JSONObject jSONObject) {
        char c;
        String str;
        if (jSONObject == null) {
            c = 'N';
        } else {
            if (jSONObject.has("estimate")) {
                list.add(',');
                String optString = jSONObject.optString("estimate");
                C14360o3.A07(optString);
                return Double.valueOf(Double.parseDouble(optString));
            }
            if (jSONObject.has("split_var") && jSONObject.has("split_value")) {
                Number A0Q = AbstractC37300Gc1.A0Q(jSONObject.optString("split_var"), map);
                String optString2 = jSONObject.optString("split_value");
                C14360o3.A07(optString2);
                double parseDouble = Double.parseDouble(optString2);
                if (A0Q == null) {
                    c = 'I';
                } else {
                    if (A0Q.doubleValue() <= parseDouble) {
                        list.add('L');
                        str = "left";
                    } else {
                        list.add('R');
                        str = "right";
                    }
                    return A01(lib, list, map, jSONObject.optJSONObject(str));
                }
            } else {
                c = 'S';
            }
        }
        list.add(Character.valueOf(c));
        return null;
    }
}
