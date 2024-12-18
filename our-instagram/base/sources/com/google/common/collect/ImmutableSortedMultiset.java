package com.google.common.collect;

import X.AbstractC167007dF;
import X.AbstractC31175DnJ;
import X.AbstractC43592JPx;
import X.AbstractC62759SPq;
import X.C00O;
import X.C18C;
import X.C4VF;
import X.InterfaceC65666Tqw;
import X.RRL;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes10.dex */
public abstract class ImmutableSortedMultiset<E> extends ImmutableMultiset<E> implements InterfaceC65666Tqw<E> {
    public static final long serialVersionUID = 912559;
    public transient ImmutableSortedMultiset A00;

    /* loaded from: classes10.dex */
    public final class SerializedForm implements Serializable {
        public final Comparator comparator;
        public final int[] counts;
        public final Object[] elements;

        public Object readResolve() {
            int length = this.elements.length;
            RRL rrl = new RRL(this.comparator);
            for (int i = 0; i < length; i++) {
                rrl.A04(this.elements[i], this.counts[i]);
            }
            return rrl.build();
        }

        public SerializedForm(InterfaceC65666Tqw interfaceC65666Tqw) {
            this.comparator = interfaceC65666Tqw.comparator();
            int size = interfaceC65666Tqw.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (AbstractC62759SPq abstractC62759SPq : interfaceC65666Tqw.entrySet()) {
                this.elements[i] = abstractC62759SPq.A01();
                this.counts[i] = abstractC62759SPq.A00();
                i++;
            }
        }
    }

    private void readObject(ObjectInputStream stream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final ImmutableSortedMultiset A0F() {
        ImmutableSortedMultiset descendingImmutableSortedMultiset;
        if (this instanceof DescendingImmutableSortedMultiset) {
            return ((DescendingImmutableSortedMultiset) this).A00;
        }
        ImmutableSortedMultiset immutableSortedMultiset = this.A00;
        if (immutableSortedMultiset != null) {
            return immutableSortedMultiset;
        }
        if (isEmpty()) {
            C4VF A01 = C4VF.A00(A0I().comparator()).A01();
            if (NaturalOrdering.A00.equals(A01)) {
                descendingImmutableSortedMultiset = RegularImmutableSortedMultiset.A03;
            } else {
                descendingImmutableSortedMultiset = new RegularImmutableSortedMultiset(A01);
            }
        } else {
            descendingImmutableSortedMultiset = new DescendingImmutableSortedMultiset(this);
        }
        this.A00 = descendingImmutableSortedMultiset;
        return descendingImmutableSortedMultiset;
    }

    public final ImmutableSortedMultiset A0G(BoundType upperBound, Object boundType) {
        if (this instanceof RegularImmutableSortedMultiset) {
            RegularImmutableSortedMultiset regularImmutableSortedMultiset = (RegularImmutableSortedMultiset) this;
            RegularImmutableSortedSet regularImmutableSortedSet = regularImmutableSortedMultiset.elementSet;
            upperBound.getClass();
            return regularImmutableSortedMultiset.A0J(0, regularImmutableSortedSet.A0F(boundType, AbstractC167007dF.A1X(upperBound, BoundType.CLOSED)));
        }
        return ((DescendingImmutableSortedMultiset) this).A00.A0H(upperBound, boundType).A0F();
    }

    public final ImmutableSortedMultiset A0H(BoundType lowerBound, Object boundType) {
        if (this instanceof RegularImmutableSortedMultiset) {
            RegularImmutableSortedMultiset regularImmutableSortedMultiset = (RegularImmutableSortedMultiset) this;
            RegularImmutableSortedSet regularImmutableSortedSet = regularImmutableSortedMultiset.elementSet;
            lowerBound.getClass();
            return regularImmutableSortedMultiset.A0J(regularImmutableSortedSet.A0G(boundType, AbstractC167007dF.A1X(lowerBound, BoundType.CLOSED)), regularImmutableSortedMultiset.A00);
        }
        return ((DescendingImmutableSortedMultiset) this).A00.A0G(lowerBound, boundType).A0F();
    }

    public final ImmutableSortedSet A0I() {
        if (this instanceof RegularImmutableSortedMultiset) {
            return ((RegularImmutableSortedMultiset) this).elementSet;
        }
        return ((DescendingImmutableSortedMultiset) this).A00.A0I().descendingSet();
    }

    @Override // X.InterfaceC65666Tqw
    public final /* bridge */ /* synthetic */ InterfaceC65666Tqw AOv() {
        if (this instanceof DescendingImmutableSortedMultiset) {
            return ((DescendingImmutableSortedMultiset) this).A00;
        }
        return A0F();
    }

    @Override // X.InterfaceC65666Tqw
    @Deprecated
    public final AbstractC62759SPq E4a() {
        throw AbstractC43592JPx.A11();
    }

    @Override // X.InterfaceC65666Tqw
    @Deprecated
    public final AbstractC62759SPq E4b() {
        throw AbstractC43592JPx.A11();
    }

    @Override // X.InterfaceC65666Tqw
    public final /* bridge */ /* synthetic */ InterfaceC65666Tqw Ep3(BoundType lowerBound, BoundType lowerBoundType, Object upperBound, Object upperBoundType) {
        C18C.A09(upperBound, upperBoundType, "Expected lowerBound <= upperBound but %s > %s", AbstractC31175DnJ.A1S(A0I().comparator().compare(upperBound, upperBoundType)));
        return A0H(lowerBound, upperBound).A0G(lowerBoundType, upperBoundType);
    }

    @Override // X.InterfaceC65666Tqw, X.InterfaceC65681TrB
    public final Comparator comparator() {
        return A0I().comparator();
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        throw C00O.createAndThrow();
    }
}
