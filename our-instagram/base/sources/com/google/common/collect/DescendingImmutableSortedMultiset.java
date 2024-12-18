package com.google.common.collect;

import X.AbstractC62759SPq;
import X.InterfaceC65666Tqw;
import com.google.common.collect.ImmutableSortedMultiset;
import java.util.NavigableSet;
import java.util.Set;

/* loaded from: classes10.dex */
public final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    public final transient ImmutableSortedMultiset A00;

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean A0B() {
        return this.A00.A0B();
    }

    @Override // X.InterfaceC75173Zi
    public final int AL0(Object element) {
        return this.A00.AL0(element);
    }

    @Override // X.InterfaceC65666Tqw
    public final AbstractC62759SPq AVu() {
        return this.A00.Cgb();
    }

    @Override // X.InterfaceC65666Tqw
    public final AbstractC62759SPq Cgb() {
        return this.A00.AVu();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC75173Zi
    public final int size() {
        return this.A00.size();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new ImmutableSortedMultiset.SerializedForm(this);
    }

    public DescendingImmutableSortedMultiset(ImmutableSortedMultiset forward) {
        this.A00 = forward;
    }

    @Override // X.InterfaceC65666Tqw
    /* renamed from: ARL */
    public final /* bridge */ /* synthetic */ NavigableSet ARM() {
        return A0I();
    }

    @Override // X.InterfaceC75173Zi
    public final /* bridge */ /* synthetic */ Set ARM() {
        return A0I();
    }

    @Override // X.InterfaceC65666Tqw
    public final /* bridge */ /* synthetic */ InterfaceC65666Tqw CMG(BoundType upperBound, Object boundType) {
        return A0G(upperBound, boundType);
    }

    @Override // X.InterfaceC65666Tqw
    public final /* bridge */ /* synthetic */ InterfaceC65666Tqw Epq(BoundType lowerBound, Object boundType) {
        return A0H(lowerBound, boundType);
    }
}
