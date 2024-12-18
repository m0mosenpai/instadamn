package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.D2p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29614D2p implements Iterator, InterfaceC15590qF {
    public int A00;
    public final List A01;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException(AbstractC111324zv.A00(30));
    }

    @Override // java.util.Iterator
    public final Object next() {
        List list = this.A01;
        Object obj = list.get(this.A00);
        this.A00 = (this.A00 + 1) % list.size();
        return obj;
    }

    public C29614D2p(List list) {
        this.A01 = list;
    }
}
