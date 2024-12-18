package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class SSP {
    public static Object A00(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return AbstractC58320PtC.A0u(list);
            }
            throw AbstractC58318PtA.A13();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static String A01(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                AbstractC58318PtA.A1S(A1C);
            }
            z = false;
            A1C.append(it.next());
        }
        return AbstractC58320PtC.A14(A1C);
    }
}
