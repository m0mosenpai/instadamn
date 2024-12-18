package X;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class RSH<E> extends TZR<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    public final InterfaceC75173Zi A00() {
        if (this instanceof RS4) {
            return ((RS4) this).A00;
        }
        return ((RS3) this).A00;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        A00().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object o) {
        return A00().contains(o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection c) {
        return A00().containsAll(c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return A00().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        return AbstractC167007dF.A1O(A00().EEe(o, Integer.MAX_VALUE));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return A00().entrySet().size();
    }
}
