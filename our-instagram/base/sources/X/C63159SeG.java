package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.SeG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63159SeG {
    public static final C63159SeG A00 = new Object();
    public static final String[] A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.SeG, java.lang.Object] */
    static {
        String[] strArr = new String[128];
        int i = 0;
        do {
            strArr[i] = StringFormatUtil.formatStrLocaleSafe("\\u%04x", Integer.valueOf(i));
            i++;
        } while (i < 32);
        AbstractC58321PtD.A1U(strArr);
        strArr[60] = "\\u003c";
        strArr[62] = "\\u003e";
        strArr[38] = "\\u0026";
        strArr[61] = "\\u003d";
        strArr[39] = "\\u0027";
        A01 = strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r5v2, types: [org.json.JSONObject] */
    public final Object A01(Object obj) {
        Object A0p;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            A0p = AbstractC31171DnF.A0q();
            Iterator<String> keys = jSONObject.keys();
            C14360o3.A07(keys);
            while (keys.hasNext()) {
                String A1B = AbstractC166987dD.A1B(keys);
                try {
                    C63159SeG c63159SeG = A00;
                    C14360o3.A0A(A1B);
                    String A002 = A00(A1B, true);
                    Object obj2 = jSONObject.get(A1B);
                    C14360o3.A07(obj2);
                    A0p.put(A002, c63159SeG.A01(obj2));
                } catch (JSONException unused) {
                }
            }
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            A0p = AbstractC31171DnF.A0p();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    Object obj3 = jSONArray.get(i);
                    C14360o3.A07(obj3);
                    A0p.put(A01(obj3));
                } catch (JSONException unused2) {
                }
            }
        } else {
            if (!(obj instanceof Integer) && !(obj instanceof Boolean)) {
                return A00(obj.toString(), true);
            }
            return obj;
        }
        return A0p;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(java.lang.String r4, boolean r5) {
        /*
            java.lang.StringBuilder r3 = X.AbstractC166987dD.A1C()
            r2 = 0
        L5:
            int r0 = r4.length()
            if (r2 >= r0) goto L3a
            char r1 = r4.charAt(r2)
            r0 = 92
            if (r1 != r0) goto L1d
            if (r5 == 0) goto L2f
            java.lang.String r0 = "\\\\\\\\"
        L17:
            r3.append(r0)
            int r2 = r2 + 1
            goto L5
        L1d:
            r0 = 128(0x80, float:1.8E-43)
            if (r1 < r0) goto L2f
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r1 != r0) goto L28
            java.lang.String r0 = "\\u2028"
            goto L17
        L28:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L35
            java.lang.String r0 = "\\u2029"
            goto L17
        L2f:
            java.lang.String[] r0 = X.C63159SeG.A01
            r0 = r0[r1]
            if (r0 != 0) goto L17
        L35:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            goto L17
        L3a:
            java.lang.String r0 = X.AbstractC166987dD.A19(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63159SeG.A00(java.lang.String, boolean):java.lang.String");
    }
}
