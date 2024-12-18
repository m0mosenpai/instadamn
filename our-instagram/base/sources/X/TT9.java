package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TT9 implements Iterator, InterfaceC15590qF {
    public final TTD A00;

    public TT9(C6LT c6lt) {
        C14360o3.A0B(c6lt, 1);
        this.A00 = new TTD(c6lt.A00, c6lt.A02);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        TTD ttd = this.A00;
        Object obj = ttd.A00;
        ttd.next();
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC58321PtD.A10();
    }
}
