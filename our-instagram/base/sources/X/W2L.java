package X;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W2L {
    public final XC1 A00;
    public final Map A01;
    public final Map A02;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.W62 r6, X.W2L r7, java.lang.Exception r8, java.lang.String r9, org.json.JSONObject r10, long r11) {
        /*
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Map r0 = r7.A02
            r5.putAll(r0)
            X.VDT r0 = r6.A04
            java.lang.String r0 = r0.name()
            java.lang.String r1 = X.AbstractC37303Gc4.A0X(r0)
            java.lang.String r0 = "segment_type"
            r5.put(r0, r1)
            int r0 = r6.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "segment_id"
            r5.put(r0, r1)
            long r1 = r6.A02
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L49
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "chunk_size"
        L32:
            r5.put(r0, r1)
        L35:
            if (r10 == 0) goto L40
            java.lang.String r1 = X.AbstractC166987dD.A19(r10)
            java.lang.String r0 = "debug"
            r5.put(r0, r1)
        L40:
            X.XC1 r2 = r7.A00
            r3 = r8
            r4 = r9
            r6 = r11
            X.AbstractC68335VMv.A00(r2, r3, r4, r5, r6)
            return
        L49:
            long r1 = r6.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L35
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "estimated_chunk_size"
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2L.A00(X.W62, X.W2L, java.lang.Exception, java.lang.String, org.json.JSONObject, long):void");
    }

    public W2L(XC1 xc1, Map map) {
        HashMap hashMap = new HashMap();
        this.A02 = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
        this.A00 = xc1;
        this.A01 = new HashMap();
    }
}
