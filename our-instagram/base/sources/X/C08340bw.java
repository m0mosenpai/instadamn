package X;

import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0bw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08340bw {
    public static final C08340bw[] A04 = new C08340bw[0];
    public final C08330bv A00;
    public final C08330bv A01;
    public final C08370bz A02;
    public final Pattern A03;

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0045. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081 A[Catch: JSONException -> 0x00ac, TryCatch #0 {JSONException -> 0x00ac, blocks: (B:6:0x0003, B:9:0x000f, B:11:0x0015, B:12:0x0019, B:14:0x001f, B:15:0x002f, B:17:0x0035, B:18:0x0045, B:19:0x0049, B:21:0x0052, B:23:0x0081, B:32:0x0057, B:34:0x0060, B:36:0x0065, B:38:0x006e, B:40:0x0073, B:42:0x007b, B:49:0x0097, B:52:0x00a3), top: B:5:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(android.content.Intent r10) {
        /*
            r9 = this;
            r8 = 0
            if (r10 == 0) goto Lad
            X.0bQ r5 = X.AbstractC08050bR.A00(r10)     // Catch: org.json.JSONException -> Lac
            java.util.List r1 = r5.A00     // Catch: org.json.JSONException -> Lac
            X.0bz r4 = r9.A02     // Catch: org.json.JSONException -> Lac
            if (r4 == 0) goto L97
            if (r1 == 0) goto Lad
            boolean r0 = r1.isEmpty()     // Catch: org.json.JSONException -> Lac
            if (r0 != 0) goto Lad
            java.util.Iterator r7 = r1.iterator()     // Catch: org.json.JSONException -> Lac
        L19:
            boolean r0 = r7.hasNext()     // Catch: org.json.JSONException -> Lac
            if (r0 == 0) goto Lad
            java.lang.Object r3 = r7.next()     // Catch: org.json.JSONException -> Lac
            android.net.Uri r3 = (android.net.Uri) r3     // Catch: org.json.JSONException -> Lac
            java.util.Map r0 = r4.A00     // Catch: org.json.JSONException -> Lac
            java.util.Set r0 = r0.entrySet()     // Catch: org.json.JSONException -> Lac
            java.util.Iterator r6 = r0.iterator()     // Catch: org.json.JSONException -> Lac
        L2f:
            boolean r0 = r6.hasNext()     // Catch: org.json.JSONException -> Lac
            if (r0 == 0) goto L97
            java.lang.Object r2 = r6.next()     // Catch: org.json.JSONException -> Lac
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: org.json.JSONException -> Lac
            java.lang.Object r1 = r2.getKey()     // Catch: org.json.JSONException -> Lac
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> Lac
            int r0 = r1.hashCode()     // Catch: org.json.JSONException -> Lac
            switch(r0) {
                case -907987547: goto L49;
                case 3433509: goto L57;
                case 107944136: goto L65;
                case 1475610435: goto L73;
                default: goto L48;
            }     // Catch: org.json.JSONException -> Lac
        L48:
            goto L19
        L49:
            java.lang.String r0 = "scheme"
            boolean r0 = r1.equals(r0)     // Catch: org.json.JSONException -> Lac
            if (r0 == 0) goto L19
            java.lang.String r1 = r3.getScheme()     // Catch: org.json.JSONException -> Lac
            goto L7f
        L57:
            java.lang.String r0 = "path"
            boolean r0 = r1.equals(r0)     // Catch: org.json.JSONException -> Lac
            if (r0 == 0) goto L19
            java.lang.String r1 = r3.getPath()     // Catch: org.json.JSONException -> Lac
            goto L7f
        L65:
            java.lang.String r0 = "query"
            boolean r0 = r1.equals(r0)     // Catch: org.json.JSONException -> Lac
            if (r0 == 0) goto L19
            java.lang.String r1 = r3.getQuery()     // Catch: org.json.JSONException -> Lac
            goto L7f
        L73:
            java.lang.String r0 = "authority"
            boolean r0 = r1.equals(r0)     // Catch: org.json.JSONException -> Lac
            if (r0 == 0) goto L19
            java.lang.String r1 = r3.getAuthority()     // Catch: org.json.JSONException -> Lac
        L7f:
            if (r1 == 0) goto L19
            java.lang.Object r2 = r2.getValue()     // Catch: org.json.JSONException -> Lac
            X.0by r2 = (X.C08360by) r2     // Catch: org.json.JSONException -> Lac
            java.util.regex.Pattern r0 = r2.A00     // Catch: org.json.JSONException -> Lac
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch: org.json.JSONException -> Lac
            boolean r1 = r0.matches()     // Catch: org.json.JSONException -> Lac
            boolean r0 = r2.A01     // Catch: org.json.JSONException -> Lac
            r1 = r1 ^ r0
            if (r1 != 0) goto L2f
            goto L19
        L97:
            org.json.JSONObject r2 = r5.A01     // Catch: org.json.JSONException -> Lac
            android.content.Intent r1 = r10.getSelector()     // Catch: org.json.JSONException -> Lac
            X.0bv r0 = r9.A01     // Catch: org.json.JSONException -> Lac
            if (r0 == 0) goto Laa
            if (r2 == 0) goto Lad
            boolean r0 = r0.A01(r1, r2)     // Catch: org.json.JSONException -> Lac
            if (r0 != 0) goto Laa
            return r8
        Laa:
            r8 = 1
            return r8
        Lac:
            return r8
        Lad:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08340bw.A01(android.content.Intent):boolean");
    }

    public C08340bw(C08330bv c08330bv, C08330bv c08330bv2, C08370bz c08370bz, String str) {
        Pattern compile;
        if (str == null) {
            compile = null;
        } else {
            compile = Pattern.compile(str, 32);
        }
        this.A03 = compile;
        this.A01 = c08330bv2;
        this.A00 = c08330bv;
        this.A02 = c08370bz;
    }

    public static C08340bw[] A00(String str) {
        String str2;
        C08330bv c08330bv;
        C08370bz c08370bz;
        if (str == null) {
            return A04;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                C08340bw[] c08340bwArr = new C08340bw[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    C08330bv c08330bv2 = null;
                    if (jSONObject.has("endpoint_name")) {
                        str2 = jSONObject.getString("endpoint_name");
                    } else {
                        str2 = null;
                    }
                    if (jSONObject.has("caller_info")) {
                        c08330bv = C08330bv.A00(jSONObject.getJSONObject("caller_info"));
                    } else {
                        c08330bv = null;
                    }
                    if (jSONObject.has("uri_component")) {
                        c08370bz = C08370bz.A00(jSONObject.getJSONObject("uri_component"));
                    } else {
                        c08370bz = null;
                    }
                    if (jSONObject.has("intent_field")) {
                        c08330bv2 = C08330bv.A00(jSONObject.getJSONObject("intent_field"));
                    }
                    c08340bwArr[i] = new C08340bw(c08330bv, c08330bv2, c08370bz, str2);
                }
                return c08340bwArr;
            }
        } catch (JSONException unused) {
        }
        return A04;
    }
}
