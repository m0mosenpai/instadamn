package X;

import java.util.Collection;

/* renamed from: X.3Zi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC75173Zi<E> extends Collection<E> {
    int AL0(Object element);

    java.util.Set ARM();

    int EEe(Object element, int occurrences);

    boolean ESE(Object element, int oldCount, int newCount);

    boolean add(Object element);

    boolean contains(Object element);

    @Override // java.util.Collection
    boolean containsAll(Collection elements);

    java.util.Set entrySet();

    boolean equals(Object object);

    int hashCode();

    boolean remove(Object element);

    @Override // java.util.Collection
    int size();
}
