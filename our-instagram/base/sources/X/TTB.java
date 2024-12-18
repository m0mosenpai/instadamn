package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TTB implements Iterator, InterfaceC15590qF {
    public int A00;
    public Object A01;
    public final Map A02;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1Q(this.A00, this.A02.size());
    }

    public TTB(Object obj, Map map) {
        this.A01 = obj;
        this.A02 = map;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object obj = this.A01;
            this.A00++;
            Object obj2 = this.A02.get(obj);
            if (obj2 != null) {
                this.A01 = ((C1127257c) obj2).A00;
                return obj;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Hash code of an element (");
            A1C.append(obj);
            throw new ConcurrentModificationException(AbstractC166997dE.A0x(") has changed after it was added to the persistent set.", A1C));
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC58321PtD.A10();
    }
}
