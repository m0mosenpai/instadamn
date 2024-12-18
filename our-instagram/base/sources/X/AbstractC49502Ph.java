package X;

import java.util.Iterator;

/* renamed from: X.2Ph, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC49502Ph extends AbstractC29601bb {
    public abstract void A01(InterfaceC37561ot interfaceC37561ot, Object obj);

    public final void A02(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        InterfaceC37561ot acquire = acquire();
        try {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                A01(acquire, it.next());
                acquire.ATb();
            }
        } finally {
            release(acquire);
        }
    }

    public final int A00(Object obj) {
        InterfaceC37561ot acquire = acquire();
        try {
            A01(acquire, obj);
            return acquire.ATb();
        } finally {
            release(acquire);
        }
    }
}
