package X;

import java.util.Iterator;

/* renamed from: X.5r0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC128315r0 implements Iterator, InterfaceC15590qF {
    public int A00;
    public int A01;
    public Object[] A02 = C57O.A04.A02;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A01 >= this.A00) {
            return false;
        }
        return true;
    }
}
