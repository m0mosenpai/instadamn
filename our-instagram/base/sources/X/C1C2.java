package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1C2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1C2 {
    public static C1C2 A03;
    public C74753Xj A00;
    public C74753Xj A01;
    public Map A02 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r1v3, types: [X.3Xj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.3Xj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.3Xj, java.lang.Object] */
    public final void A00(C1Ef c1Ef, EnumC23341Bw enumC23341Bw, int i, long j) {
        C74753Xj c74753Xj;
        boolean A0D = AbstractC15820qc.A0D();
        if (i == 0) {
            if (enumC23341Bw.equals(EnumC23341Bw.Image)) {
                C74753Xj c74753Xj2 = this.A00;
                c74753Xj = c74753Xj2;
                if (c74753Xj2 == null) {
                    ?? obj = new Object();
                    obj.A00 = 0.0f;
                    obj.A01 = 0;
                    this.A00 = obj;
                    c74753Xj = obj;
                }
            } else if (enumC23341Bw.equals(EnumC23341Bw.Video)) {
                C74753Xj c74753Xj3 = this.A01;
                c74753Xj = c74753Xj3;
                if (c74753Xj3 == null) {
                    ?? obj2 = new Object();
                    obj2.A00 = 0.0f;
                    obj2.A01 = 0;
                    this.A01 = obj2;
                    c74753Xj = obj2;
                }
            }
            c74753Xj.A00(j);
            return;
        }
        int ordinal = (enumC23341Bw.ordinal() * 10) + c1Ef.ordinal();
        if (A0D) {
            ordinal *= 10;
        }
        Integer valueOf = Integer.valueOf(ordinal);
        synchronized (this) {
            Map map = this.A02;
            if (!map.containsKey(valueOf)) {
                ?? obj3 = new Object();
                obj3.A00 = 0.0f;
                obj3.A01 = 0;
                map.put(valueOf, obj3);
            }
            C74753Xj c74753Xj4 = (C74753Xj) map.get(valueOf);
            c74753Xj4.getClass();
            c74753Xj4.A00(j);
        }
    }
}
