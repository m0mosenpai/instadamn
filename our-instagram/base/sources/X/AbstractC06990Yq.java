package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.0Yq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC06990Yq<E> extends AbstractC17040sw<E> implements List<E>, InterfaceC15590qF {
    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract Object get(int i);

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                Collection collection = (Collection) obj;
                C14360o3.A0B(collection, 1);
                if (size() == collection.size()) {
                    Iterator<E> it = collection.iterator();
                    Iterator it2 = iterator();
                    while (it2.hasNext()) {
                        if (!C14360o3.A0K(it2.next(), it.next())) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C17020su(this);
    }

    public ListIterator listIterator(int i) {
        return new C07000Yr(this, i);
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return new C024909x(this, i, i2);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        Iterator it = iterator();
        int i2 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 * 31;
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!C14360o3.A0K(it.next(), obj)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C14360o3.A0K(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C07000Yr(this, 0);
    }
}
