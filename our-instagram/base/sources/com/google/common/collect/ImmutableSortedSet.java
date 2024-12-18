package com.google.common.collect;

import X.AbstractC166987dD;
import X.AbstractC31175DnJ;
import X.AbstractC43592JPx;
import X.AbstractC58318PtA;
import X.C18C;
import X.C1LH;
import X.InterfaceC65681TrB;
import X.RRP;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes10.dex */
public abstract class ImmutableSortedSet<E> extends ImmutableSet<E> implements NavigableSet<E>, InterfaceC65681TrB<E> {
    public static final long serialVersionUID = 912559;
    public transient ImmutableSortedSet A00;
    public final transient Comparator A01;

    /* loaded from: classes10.dex */
    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final Comparator comparator;
        public final Object[] elements;

        public Object readResolve() {
            RRP rrp = new RRP(this.comparator);
            rrp.A08(this.elements);
            return RRP.A02(rrp);
        }

        public SerializedForm(Object[] comparator, Comparator elements) {
            this.comparator = elements;
            this.elements = comparator;
        }
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object e) {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        int A0G = regularImmutableSortedSet.A0G(e, true);
        if (A0G == regularImmutableSortedSet.size()) {
            return null;
        }
        return regularImmutableSortedSet.elements.get(A0G);
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return ((RegularImmutableSortedSet) this).elements.reverse().iterator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        if (!regularImmutableSortedSet.isEmpty()) {
            return AbstractC166987dD.A16(regularImmutableSortedSet.elements);
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object e) {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        int A0F = regularImmutableSortedSet.A0F(e, true) - 1;
        if (A0F == -1) {
            return null;
        }
        return regularImmutableSortedSet.elements.get(A0F);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object e) {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        int A0G = regularImmutableSortedSet.A0G(e, false);
        if (A0G == regularImmutableSortedSet.size()) {
            return null;
        }
        return regularImmutableSortedSet.elements.get(A0G);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        if (!regularImmutableSortedSet.isEmpty()) {
            return regularImmutableSortedSet.elements.get(AbstractC58318PtA.A08(regularImmutableSortedSet));
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object e) {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        int A0F = regularImmutableSortedSet.A0F(e, false) - 1;
        if (A0F == -1) {
            return null;
        }
        return regularImmutableSortedSet.elements.get(A0F);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object fromElement, Object toElement) {
        fromElement.getClass();
        toElement.getClass();
        C18C.A0E(AbstractC31175DnJ.A1S(this.A01.compare(fromElement, toElement)));
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        RegularImmutableSortedSet A0H = regularImmutableSortedSet.A0H(regularImmutableSortedSet.A0G(fromElement, true), regularImmutableSortedSet.size());
        return A0H.A0H(0, A0H.A0F(toElement, false));
    }

    public static RegularImmutableSortedSet A06(Comparator comparator) {
        if (NaturalOrdering.A00.equals(comparator)) {
            return RegularImmutableSortedSet.A00;
        }
        RegularImmutableSortedSet regularImmutableSortedSet = RegularImmutableSortedSet.A00;
        return new RegularImmutableSortedSet(ImmutableList.of(), comparator);
    }

    public static RegularImmutableSortedSet A07(Comparator comparator, Object[] n, int contents) {
        if (contents == 0) {
            return A06(comparator);
        }
        C1LH.A00(n, contents);
        Arrays.sort(n, 0, contents, comparator);
        int i = 1;
        for (int i2 = 1; i2 < contents; i2++) {
            Object obj = n[i2];
            if (comparator.compare(obj, n[i - 1]) != 0) {
                n[i] = obj;
                i++;
            }
        }
        Arrays.fill(n, i, contents, (Object) null);
        if (i < n.length / 2) {
            n = Arrays.copyOf(n, i);
        }
        RegularImmutableSortedSet regularImmutableSortedSet = RegularImmutableSortedSet.A00;
        return new RegularImmutableSortedSet(ImmutableList.asImmutableList(n, i), comparator);
    }

    private void readObject(ObjectInputStream unused) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.NavigableSet
    /* renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedSet descendingSet() {
        ImmutableSortedSet immutableSortedSet = this.A00;
        if (immutableSortedSet == null) {
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
            Comparator reverseOrder = Collections.reverseOrder(regularImmutableSortedSet.A01);
            if (regularImmutableSortedSet.isEmpty()) {
                immutableSortedSet = A06(reverseOrder);
            } else {
                immutableSortedSet = new RegularImmutableSortedSet(regularImmutableSortedSet.elements.reverse(), reverseOrder);
            }
            this.A00 = immutableSortedSet;
            immutableSortedSet.A00 = this;
        }
        return immutableSortedSet;
    }

    @Override // java.util.SortedSet, X.InterfaceC65681TrB
    public final Comparator comparator() {
        return this.A01;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray(), this.A01);
    }

    public ImmutableSortedSet(Comparator comparator) {
        this.A01 = comparator;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet headSet(Object toElement, boolean inclusive) {
        toElement.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.A0H(0, regularImmutableSortedSet.A0F(toElement, inclusive));
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet tailSet(Object fromElement, boolean inclusive) {
        fromElement.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.A0H(regularImmutableSortedSet.A0G(fromElement, inclusive), regularImmutableSortedSet.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object toElement) {
        toElement.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.A0H(0, regularImmutableSortedSet.A0F(toElement, false));
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet subSet(Object fromElement, boolean fromInclusive, Object toElement, boolean toInclusive) {
        fromElement.getClass();
        toElement.getClass();
        C18C.A0E(AbstractC31175DnJ.A1S(this.A01.compare(fromElement, toElement)));
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        RegularImmutableSortedSet A0H = regularImmutableSortedSet.A0H(regularImmutableSortedSet.A0G(fromElement, fromInclusive), regularImmutableSortedSet.size());
        return A0H.A0H(0, A0H.A0F(toElement, toInclusive));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object fromElement) {
        fromElement.getClass();
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) this;
        return regularImmutableSortedSet.A0H(regularImmutableSortedSet.A0G(fromElement, true), regularImmutableSortedSet.size());
    }
}
