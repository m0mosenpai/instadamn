package X;

import java.util.HashMap;

/* renamed from: X.1tS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40011tS {
    public final HashMap A00 = new HashMap();

    public final synchronized AbstractC40721uf A02(Object obj) {
        AbstractC40721uf abstractC40721uf;
        HashMap hashMap = this.A00;
        abstractC40721uf = (AbstractC40721uf) hashMap.get(obj);
        if (abstractC40721uf == null) {
            abstractC40721uf = A03(obj);
            hashMap.put(obj, abstractC40721uf);
        }
        abstractC40721uf.A00++;
        return abstractC40721uf;
    }

    public abstract AbstractC40721uf A03(Object obj);

    public static AbstractC40011tS A00(boolean z) {
        AbstractC40011tS abstractC40011tS;
        if (z) {
            synchronized (C58857QCs.class) {
                abstractC40011tS = C58857QCs.A00;
                if (abstractC40011tS == null) {
                    abstractC40011tS = new AbstractC40011tS();
                    C58857QCs.A00 = abstractC40011tS;
                }
            }
            return abstractC40011tS;
        }
        return C40021tT.A01();
    }
}
