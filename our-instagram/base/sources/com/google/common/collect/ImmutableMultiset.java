package com.google.common.collect;

import X.AbstractC103614ld;
import X.AbstractC167007dF;
import X.AbstractC43592JPx;
import X.AbstractC62759SPq;
import X.C18C;
import X.C1LC;
import X.C63033Sb7;
import X.InterfaceC75173Zi;
import X.RS1;
import X.RST;
import X.S36;
import com.google.common.collect.RegularImmutableMultiset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements InterfaceC75173Zi<E> {
    public static final long serialVersionUID = 912559;
    public transient ImmutableList A00;
    public transient ImmutableSet A01;

    /* loaded from: classes10.dex */
    public final class EntrySet extends IndexedImmutableSet {
        public static final long serialVersionUID = 0;

        public EntrySet() {
        }

        private void readObject(ObjectInputStream stream) {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean A0B() {
            return ImmutableMultiset.this.A0B();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object o) {
            if (!(o instanceof AbstractC62759SPq)) {
                return false;
            }
            AbstractC62759SPq abstractC62759SPq = (AbstractC62759SPq) o;
            if (abstractC62759SPq.A00() <= 0 || ImmutableMultiset.this.AL0(abstractC62759SPq.A01()) != abstractC62759SPq.A00()) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ImmutableMultiset.this.A0C().size();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }
    }

    /* loaded from: classes10.dex */
    public class EntrySetSerializedForm implements Serializable {
        public final ImmutableMultiset multiset;

        public Object readResolve() {
            return this.multiset.entrySet();
        }

        public EntrySetSerializedForm(ImmutableMultiset multiset) {
            this.multiset = multiset;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public abstract Object writeReplace();

    private void readObject(ObjectInputStream stream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final ImmutableSet A0C() {
        if (this instanceof RegularImmutableMultiset) {
            RegularImmutableMultiset regularImmutableMultiset = (RegularImmutableMultiset) this;
            ImmutableSet immutableSet = regularImmutableMultiset.A00;
            if (immutableSet == null) {
                RegularImmutableMultiset.ElementSet elementSet = new RegularImmutableMultiset.ElementSet();
                regularImmutableMultiset.A00 = elementSet;
                return elementSet;
            }
            return immutableSet;
        }
        if (this instanceof RegularImmutableSortedMultiset) {
            return ((RegularImmutableSortedMultiset) this).elementSet;
        }
        return ((ImmutableSortedMultiset) this).A0I();
    }

    @Override // X.InterfaceC75173Zi
    /* renamed from: A0D, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet entrySet() {
        ImmutableSet immutableSet = this.A01;
        if (immutableSet == null) {
            if (isEmpty()) {
                immutableSet = RegularImmutableSet.A03;
            } else {
                immutableSet = new EntrySet();
            }
            this.A01 = immutableSet;
        }
        return immutableSet;
    }

    public final AbstractC62759SPq A0E(int i) {
        if (this instanceof RegularImmutableMultiset) {
            C63033Sb7 c63033Sb7 = ((RegularImmutableMultiset) this).A01;
            C18C.A01(i, c63033Sb7.A02);
            return new RS1(c63033Sb7, i);
        }
        if (this instanceof RegularImmutableSortedMultiset) {
            RegularImmutableSortedMultiset regularImmutableSortedMultiset = (RegularImmutableSortedMultiset) this;
            E e = regularImmutableSortedMultiset.elementSet.elements.get(i);
            long[] jArr = regularImmutableSortedMultiset.A02;
            int i2 = regularImmutableSortedMultiset.A01 + i;
            return new Multisets$ImmutableEntry(e, (int) (jArr[i2 + 1] - jArr[i2]));
        }
        return (AbstractC62759SPq) ((DescendingImmutableSortedMultiset) this).A00.entrySet().asList().reverse().get(i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList asList() {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            ImmutableList asList = super.asList();
            this.A00 = asList;
            return asList;
        }
        return immutableList;
    }

    @Override // X.InterfaceC75173Zi
    @Deprecated
    public final int EEe(Object element, int occurrences) {
        throw AbstractC43592JPx.A11();
    }

    @Override // X.InterfaceC75173Zi
    @Deprecated
    public final boolean ESE(Object element, int oldCount, int newCount) {
        throw AbstractC43592JPx.A11();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object object) {
        return AbstractC167007dF.A1O(AL0(object));
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(Object[] dst, int offset) {
        C1LC it = entrySet().iterator();
        while (it.hasNext()) {
            AbstractC62759SPq abstractC62759SPq = (AbstractC62759SPq) it.next();
            Arrays.fill(dst, offset, abstractC62759SPq.A00() + offset, abstractC62759SPq.A01());
            offset += abstractC62759SPq.A00();
        }
        return offset;
    }

    @Override // java.util.Collection, X.InterfaceC75173Zi
    public final boolean equals(Object object) {
        return S36.A00(this, object);
    }

    @Override // java.util.Collection, X.InterfaceC75173Zi
    public final int hashCode() {
        return AbstractC103614ld.A00(entrySet());
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final C1LC iterator() {
        return new RST(entrySet().iterator());
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
