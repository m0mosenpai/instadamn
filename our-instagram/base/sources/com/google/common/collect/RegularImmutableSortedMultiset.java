package com.google.common.collect;

import X.AbstractC38301qK;
import X.AbstractC62759SPq;
import X.C18C;
import X.InterfaceC65666Tqw;
import com.google.common.collect.ImmutableSortedMultiset;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* loaded from: classes10.dex */
public final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    public final transient int A00;
    public final transient int A01;
    public final transient long[] A02;
    public final transient RegularImmutableSortedSet elementSet;
    public static final long[] A04 = {0};
    public static final ImmutableSortedMultiset A03 = new RegularImmutableSortedMultiset(NaturalOrdering.A00);

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean A0B() {
        if (this.A01 > 0 || this.A00 < this.A02.length - 1) {
            return true;
        }
        return false;
    }

    public final ImmutableSortedMultiset A0J(int from, int to) {
        int i = this.A00;
        C18C.A03(from, to, i);
        if (from == to) {
            Comparator comparator = A0I().comparator();
            if (NaturalOrdering.A00.equals(comparator)) {
                return A03;
            }
            return new RegularImmutableSortedMultiset(comparator);
        }
        if (from == 0 && to == i) {
            return this;
        }
        return new RegularImmutableSortedMultiset(this.elementSet.A0H(from, to), this.A02, this.A01 + from, to - from);
    }

    @Override // X.InterfaceC75173Zi
    public final int AL0(Object element) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.elementSet;
        if (element != null) {
            try {
                int binarySearch = Collections.binarySearch(regularImmutableSortedSet.elements, element, regularImmutableSortedSet.A01);
                if (binarySearch >= 0) {
                    long[] jArr = this.A02;
                    int i = this.A01 + binarySearch;
                    return (int) (jArr[i + 1] - jArr[i]);
                }
                return 0;
            } catch (ClassCastException unused) {
                return 0;
            }
        }
        return 0;
    }

    @Override // X.InterfaceC65666Tqw
    /* renamed from: ARL */
    public final /* bridge */ /* synthetic */ NavigableSet ARM() {
        return this.elementSet;
    }

    @Override // X.InterfaceC75173Zi
    public final /* bridge */ /* synthetic */ Set ARM() {
        return this.elementSet;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC75173Zi
    public final int size() {
        long[] jArr = this.A02;
        int i = this.A01;
        return AbstractC38301qK.A02(jArr[this.A00 + i] - jArr[i]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new ImmutableSortedMultiset.SerializedForm(this);
    }

    public RegularImmutableSortedMultiset(Comparator comparator) {
        this.elementSet = ImmutableSortedSet.A06(comparator);
        this.A02 = A04;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // X.InterfaceC65666Tqw
    public final AbstractC62759SPq AVu() {
        if (isEmpty()) {
            return null;
        }
        return A0E(0);
    }

    @Override // X.InterfaceC65666Tqw
    public final /* bridge */ /* synthetic */ InterfaceC65666Tqw CMG(BoundType upperBound, Object boundType) {
        return A0G(upperBound, boundType);
    }

    @Override // X.InterfaceC65666Tqw
    public final AbstractC62759SPq Cgb() {
        if (isEmpty()) {
            return null;
        }
        return A0E(this.A00 - 1);
    }

    @Override // X.InterfaceC65666Tqw
    public final /* bridge */ /* synthetic */ InterfaceC65666Tqw Epq(BoundType lowerBound, Object boundType) {
        return A0H(lowerBound, boundType);
    }

    public RegularImmutableSortedMultiset(RegularImmutableSortedSet elementSet, long[] cumulativeCounts, int offset, int length) {
        this.elementSet = elementSet;
        this.A02 = cumulativeCounts;
        this.A01 = offset;
        this.A00 = length;
    }
}
