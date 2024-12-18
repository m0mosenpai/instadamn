package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0sw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17040sw<E> implements Collection<E>, InterfaceC15590qF {
    public abstract int A08();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        C14360o3.A0B(collection, 0);
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public abstract Iterator iterator();

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        return AbstractC13370mN.A01(this, objArr);
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (!(this instanceof Collection) || !isEmpty()) {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(it.next(), obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        return AbstractC001800i.A0P(", ", "[", "]", this, new AnonymousClass074(this, 0));
    }

    @Override // java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (size() != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return A08();
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC13370mN.A00(this);
    }
}
