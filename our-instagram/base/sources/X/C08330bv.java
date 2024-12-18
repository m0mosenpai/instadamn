package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0bv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08330bv {
    public final Map A00;
    public final C08370bz A01;
    public final C08340bw[] A02;

    public static C08330bv A00(JSONObject jSONObject) {
        String string;
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        C08340bw[] c08340bwArr = new C08340bw[0];
        try {
            Iterator<String> keys = jSONObject.keys();
            C08370bz c08370bz = null;
            while (keys.hasNext()) {
                String next = keys.next();
                if (!next.equals("selector_config")) {
                    if (next.equals("clip_data")) {
                        c08370bz = C08370bz.A00(jSONObject.getJSONObject("clip_data"));
                    } else if (jSONObject.has(next)) {
                        hashMap.put(next, C08360by.A00(jSONObject.get(next)));
                    }
                }
            }
            if (jSONObject.has("selector_config") && (string = jSONObject.getString("selector_config")) != null) {
                c08340bwArr = C08340bw.A00(string);
            }
            if (hashMap.isEmpty()) {
                return null;
            }
            if (c08340bwArr.length > 0) {
                return new C08330bv(c08370bz, hashMap, c08340bwArr);
            }
            return new C08330bv(c08370bz, hashMap, null);
        } catch (IllegalArgumentException | JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0137, code lost:
    
        if (r15.has("clip_data") == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0139, code lost:
    
        r6 = r15.getJSONArray("clip_data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x013d, code lost:
    
        if (r6 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x013f, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0144, code lost:
    
        if (r4 >= r6.length()) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0146, code lost:
    
        r3 = r6.getJSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x014a, code lost:
    
        r7 = r5.A00.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0158, code lost:
    
        if (r7.hasNext() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x015a, code lost:
    
        r0 = (java.util.Map.Entry) r7.next();
        r1 = (java.lang.String) r0.getKey();
        r2 = (X.C08360by) r0.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0170, code lost:
    
        if (r3.has(r1) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0183, code lost:
    
        if ((r2.A00.matcher(r3.getString(r1)).matches() ^ r2.A01) != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0188, code lost:
    
        r3 = r13.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x018a, code lost:
    
        if (r3 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018c, code lost:
    
        r2 = r3.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x018d, code lost:
    
        if (r2 <= 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x018f, code lost:
    
        if (r14 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0191, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0198, code lost:
    
        if (r3[r1].A01(r14) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x019a, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x019c, code lost:
    
        if (r1 >= r2) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a2, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x012f, code lost:
    
        r5 = r13.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0131, code lost:
    
        if (r5 == null) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(android.content.Intent r14, org.json.JSONObject r15) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08330bv.A01(android.content.Intent, org.json.JSONObject):boolean");
    }

    public C08330bv(C08370bz c08370bz, Map map, C08340bw[] c08340bwArr) {
        this.A00 = map;
        this.A02 = c08340bwArr;
        this.A01 = c08370bz;
    }
}
