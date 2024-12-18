package com.google.common.collect;

import X.C18C;
import X.C1LC;
import X.C63033Sb7;
import com.google.common.collect.RegularImmutableMultiset;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {
    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList A0C() {
        return new ImmutableList<E>() { // from class: com.google.common.collect.IndexedImmutableSet.1
            @Override // com.google.common.collect.ImmutableCollection
            public final boolean A0B() {
                return IndexedImmutableSet.this.A0B();
            }

            @Override // java.util.List
            public final Object get(int index) {
                IndexedImmutableSet indexedImmutableSet = IndexedImmutableSet.this;
                if (indexedImmutableSet instanceof RegularImmutableMultiset.ElementSet) {
                    C63033Sb7 c63033Sb7 = RegularImmutableMultiset.this.A01;
                    C18C.A01(index, c63033Sb7.A02);
                    return c63033Sb7.A06[index];
                }
                return ImmutableMultiset.this.A0E(index);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return IndexedImmutableSet.this.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(Object[] dst, int offset) {
        return asList().copyIntoArray(dst, offset);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final C1LC iterator() {
        return asList().iterator();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return asList().iterator();
    }
}
