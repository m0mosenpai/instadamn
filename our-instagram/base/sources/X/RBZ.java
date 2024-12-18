package X;

import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RBZ extends C60585RBa {
    public static final BitSet A02 = new BitSet(0);
    public final Map A00;
    public final Map A01;

    public RBZ(InterfaceC65620ToB interfaceC65620ToB, RBZ rbz) {
        super(interfaceC65620ToB, rbz);
        this.A00 = rbz.A00;
        this.A01 = rbz.A01;
    }

    public RBZ(C912845h c912845h, AbstractC910944l abstractC910944l, AbstractC910944l abstractC910944l2, InterfaceC65565Tmr interfaceC65565Tmr, Collection collection) {
        super(null, abstractC910944l, abstractC910944l2, interfaceC65565Tmr, null, false);
        this.A00 = AbstractC166987dD.A1G();
        boolean A08 = c912845h.A08(C45Y.A04);
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            TI3 ti3 = (TI3) it.next();
            AnonymousClass451 anonymousClass451 = ((C45T) c912845h).A01;
            C910844k c910844k = anonymousClass451.A07;
            Class cls = ti3.A01;
            List A03 = anonymousClass451.A03.A01(c912845h, c910844k.A09(cls), c912845h).A03();
            BitSet bitSet = new BitSet(A03.size() + i);
            Iterator it2 = A03.iterator();
            while (it2.hasNext()) {
                String A0L = ((AbstractC63037SbC) it2.next()).A0L();
                A0L = A08 ? A0L.toLowerCase() : A0L;
                Map map = this.A00;
                Number A0Q = AbstractC37300Gc1.A0Q(A0L, map);
                if (A0Q == null) {
                    A0Q = Integer.valueOf(i);
                    i++;
                    map.put(A0L, A0Q);
                }
                bitSet.set(A0Q.intValue());
            }
            String name = cls.getName();
            Object put = A1G.put(bitSet, name);
            if (put != null) {
                throw AbstractC58319PtB.A0l("Subtypes %s and %s have the same signature and cannot be uniquely deduced.", new Object[]{put, name});
            }
        }
        this.A01 = A1G;
    }
}
