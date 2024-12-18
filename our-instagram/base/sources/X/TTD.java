package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TTD implements Iterator, InterfaceC15590qF {
    public Object A00;
    public int A01;
    public final Map A02;

    public TTD(Object obj, Map map) {
        C14360o3.A0B(map, 2);
        this.A00 = obj;
        this.A02 = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1Q(this.A01, this.A02.size());
    }

    @Override // java.util.Iterator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C58477Pw3 next() {
        if (hasNext()) {
            Object obj = this.A02.get(this.A00);
            if (obj != null) {
                C58477Pw3 c58477Pw3 = (C58477Pw3) obj;
                this.A01++;
                this.A00 = c58477Pw3.A00;
                return c58477Pw3;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Hash code of a key (");
            A1C.append(this.A00);
            throw new ConcurrentModificationException(AbstractC166997dE.A0x(") has changed after it was added to the persistent map.", A1C));
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC58321PtD.A10();
    }
}
