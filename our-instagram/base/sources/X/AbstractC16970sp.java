package X;

import java.util.Iterator;

/* renamed from: X.0sp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16970sp implements Iterator, InterfaceC15590qF {
    public abstract char A00();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(A00());
    }
}
