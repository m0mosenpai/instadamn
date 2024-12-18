package X;

import java.util.Iterator;

/* renamed from: X.17q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C225417q implements Iterator, InterfaceC15590qF {
    public final Iterator A00;
    public final /* synthetic */ C225017m A01;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C225417q(C225017m c225017m) {
        this.A01 = c225017m;
        this.A00 = c225017m.A01.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.A01.A00.invoke(this.A00.next());
    }
}
