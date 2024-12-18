package X;

import java.util.Iterator;

/* renamed from: X.0sh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16890sh implements Iterator, InterfaceC15590qF {
    public int A00;
    public final Iterator A01;

    public C16890sh(Iterator it) {
        C14360o3.A0B(it, 1);
        this.A01 = it;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        this.A00 = i + 1;
        if (i < 0) {
            AbstractC16960so.A1U();
            throw C00O.createAndThrow();
        }
        return new C0eP(i, this.A01.next());
    }
}
