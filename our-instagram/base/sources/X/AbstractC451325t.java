package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.25t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC451325t<E> extends AbstractC451425u implements Collection<E> {
    public abstract Collection A01();

    @Override // java.util.Collection
    public boolean add(Object element) {
        return A01().add(element);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        return A01().addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        A01().clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object object) {
        return A01().contains(object);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return A01().containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return A01().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return A01().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object object) {
        return A01().remove(object);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        return A01().removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return A01().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return A01().size();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        return A01().toArray(array);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return A01().toArray();
    }
}
