package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VuU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C69734VuU {
    public final EnumC53327Ni6 A00;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r2.length() == 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map A00(X.W63 r5, X.C68232VIs r6, X.W62 r7) {
        /*
            r4 = this;
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r2 = r6.A00     // Catch: org.json.JSONException -> L3f
            if (r2 == 0) goto L10
            int r1 = r2.length()     // Catch: org.json.JSONException -> L3f
            r0 = 0
            if (r1 != 0) goto L11
        L10:
            r0 = 1
        L11:
            if (r0 != 0) goto L26
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3f
            r1.<init>(r2)     // Catch: org.json.JSONException -> L3f
            java.lang.String r0 = "stream_id"
            java.lang.String r1 = r1.getString(r0)     // Catch: org.json.JSONException -> L3f
            X.C14360o3.A07(r1)     // Catch: org.json.JSONException -> L3f
            java.lang.String r0 = "Stream-Id"
            r3.put(r0, r1)     // Catch: org.json.JSONException -> L3f
        L26:
            java.lang.String r1 = "Segment-Type"
            X.VDT r0 = r7.A04     // Catch: org.json.JSONException -> L3f
            int r0 = r0.A00     // Catch: org.json.JSONException -> L3f
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: org.json.JSONException -> L3f
            r3.put(r1, r0)     // Catch: org.json.JSONException -> L3f
            java.lang.String r2 = "Segment-Start-Offset"
            long r0 = r7.A03     // Catch: org.json.JSONException -> L3f
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: org.json.JSONException -> L3f
            r3.put(r2, r0)     // Catch: org.json.JSONException -> L3f
            return r3
        L3f:
            r2 = move-exception
            java.lang.String r1 = "Invalid start response"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69734VuU.A00(X.W63, X.VIs, X.W62):java.util.Map");
    }

    public Map A02(C68232VIs c68232VIs) {
        HashMap hashMap = new HashMap();
        try {
            String string = new JSONObject(c68232VIs.A00).getString("stream_id");
            C14360o3.A07(string);
            hashMap.put("Stream-Id", string);
            return hashMap;
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid start Response", e);
        }
    }

    public C69734VuU(EnumC53327Ni6 enumC53327Ni6) {
        this.A00 = enumC53327Ni6;
    }

    public Map A01(MYB myb) {
        return AbstractC06930Yk.A0E();
    }
}
