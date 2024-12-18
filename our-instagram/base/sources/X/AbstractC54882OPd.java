package X;

import java.util.Iterator;

/* renamed from: X.OPd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54882OPd {
    public static final java.util.Set A00(java.util.Set set) {
        C14360o3.A0B(set, 0);
        C01G c01g = new C01G();
        for (Object obj : set) {
            C14360o3.A0B(obj, 0);
            Object obj2 = EnumC223259tC.A01.get(obj);
            if (obj2 != null) {
                c01g.add(obj2);
            }
        }
        return AbstractC10090gM.A04(c01g);
    }

    public static final java.util.Set A01(java.util.Set set) {
        C01G c01g = new C01G();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1S(it.next(), c01g);
        }
        return AbstractC10090gM.A04(c01g);
    }
}
