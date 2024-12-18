package X;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W8z {
    public static final C69832VwI A04 = new Object();
    public final long A00;
    public final XC1 A01;
    public final Map A02;
    public final Map A03;

    public static final void A00(W8z w8z, C69687VtX c69687VtX, Exception exc, String str, Map map, long j) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(w8z.A03);
        hashMap.putAll(map);
        if (c69687VtX != null) {
            hashMap.put("segment_type", AbstractC167007dF.A0h(c69687VtX.A01));
            hashMap.put("segment_id", String.valueOf(c69687VtX.A00));
        }
        AbstractC68335VMv.A00(w8z.A01, exc, str, hashMap, j);
    }

    public W8z(XC1 xc1, Map map) {
        HashMap hashMap = new HashMap();
        this.A03 = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
        this.A01 = xc1;
        this.A00 = xc1.now();
        this.A02 = new HashMap();
    }
}
