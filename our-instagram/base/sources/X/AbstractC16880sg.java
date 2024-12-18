package X;

import java.util.Iterator;

/* renamed from: X.0sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16880sg implements Iterator, InterfaceC15590qF {
    public abstract int A00();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(A00());
    }
}
