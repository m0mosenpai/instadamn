package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Vgw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69055Vgw {
    public long A00;
    public final XC1 A01;
    public final Map A02;

    public C69055Vgw(XC1 xc1, Map map, long j) {
        HashMap hashMap = new HashMap();
        this.A02 = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
        if (j != -1) {
            String valueOf = String.valueOf(j);
            hashMap.put("file_size", valueOf);
            hashMap.put("total_bytes", valueOf);
        }
        this.A01 = xc1;
    }
}
