package com.google.common.collect;

import X.C1LC;
import X.InterfaceC75173Zi;
import X.S37;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes10.dex */
public final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    public static final RegularImmutableSortedSet A00 = new RegularImmutableSortedSet(ImmutableList.of(), NaturalOrdering.A00);
    public final transient ImmutableList elements;

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object o) {
        if (o == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.elements, o, this.A01) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object object) {
        if (object != this) {
            if (!(object instanceof Set)) {
                return false;
            }
            Set set = (Set) object;
            if (size() != set.size()) {
                return false;
            }
            if (!isEmpty()) {
                Comparator comparator = this.A01;
                if (S37.A00(set, comparator)) {
                    Iterator<E> it = set.iterator();
                    try {
                        C1LC it2 = this.elements.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            E next2 = it.next();
                            if (next2 == null || comparator.compare(next, next2) != 0) {
                                return false;
                            }
                        }
                    } catch (ClassCastException | NoSuchElementException unused) {
                        return false;
                    }
                } else {
                    return containsAll(set);
                }
            }
        }
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int A08() {
        return this.elements.A08();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int A09() {
        return this.elements.A09();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] A0A() {
        return this.elements.A0A();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean A0B() {
        return this.elements.A0B();
    }

    public final int A0F(Object toElement, boolean inclusive) {
        ImmutableList immutableList = this.elements;
        toElement.getClass();
        int binarySearch = Collections.binarySearch(immutableList, toElement, comparator());
        if (binarySearch >= 0) {
            if (inclusive) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return binarySearch ^ (-1);
    }

    public final int A0G(Object fromElement, boolean inclusive) {
        ImmutableList immutableList = this.elements;
        fromElement.getClass();
        int binarySearch = Collections.binarySearch(immutableList, fromElement, comparator());
        if (binarySearch >= 0) {
            if (!inclusive) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return binarySearch ^ (-1);
    }

    public final RegularImmutableSortedSet A0H(int newFromIndex, int newToIndex) {
        if (newFromIndex == 0 && newToIndex == size()) {
            return this;
        }
        if (newFromIndex < newToIndex) {
            return new RegularImmutableSortedSet(this.elements.subList(newFromIndex, newToIndex), this.A01);
        }
        return ImmutableSortedSet.A06(this.A01);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList asList() {
        return this.elements;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection targets) {
        if (targets instanceof InterfaceC75173Zi) {
            targets = ((InterfaceC75173Zi) targets).ARM();
        }
        if (S37.A00(targets, comparator()) && targets.size() > 1) {
            C1LC it = this.elements.iterator();
            Iterator<E> it2 = targets.iterator();
            if (!it.hasNext()) {
                return false;
            }
            E next = it2.next();
            Object next2 = it.next();
            while (true) {
                try {
                    int compare = this.A01.compare(next2, next);
                    if (compare < 0) {
                        if (!it.hasNext()) {
                            return false;
                        }
                        next2 = it.next();
                    } else {
                        if (compare != 0) {
                            break;
                        }
                        if (!it2.hasNext()) {
                            return true;
                        }
                        next = it2.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        } else {
            return super.containsAll(targets);
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(Object[] dst, int offset) {
        return this.elements.copyIntoArray(dst, offset);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final C1LC iterator() {
        return this.elements.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.elements.size();
    }

    public RegularImmutableSortedSet(ImmutableList elements, Comparator comparator) {
        super(comparator);
        this.elements = elements;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return this.elements.iterator();
    }
}
