package X;

import com.google.common.collect.BoundType;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes10.dex */
public final class RS4 extends RSH implements NavigableSet, SortedSet {
    public final InterfaceC65666Tqw A00;

    @Override // java.util.NavigableSet
    public final Object ceiling(Object e) {
        AbstractC62759SPq AVu = this.A00.Epq(BoundType.CLOSED, e).AVu();
        if (AVu == null) {
            return null;
        }
        return AVu.A01();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.A00.comparator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new RS4(this.A00.AOv());
    }

    @Override // java.util.SortedSet
    public final Object first() {
        AbstractC62759SPq AVu = this.A00.AVu();
        if (AVu != null) {
            return AVu.A01();
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object e) {
        AbstractC62759SPq Cgb = this.A00.CMG(BoundType.CLOSED, e).Cgb();
        if (Cgb == null) {
            return null;
        }
        return Cgb.A01();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object toElement, boolean inclusive) {
        BoundType boundType;
        InterfaceC65666Tqw interfaceC65666Tqw = this.A00;
        if (inclusive) {
            boundType = BoundType.CLOSED;
        } else {
            boundType = BoundType.OPEN;
        }
        return new RS4(interfaceC65666Tqw.CMG(boundType, toElement));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object e) {
        AbstractC62759SPq AVu = this.A00.Epq(BoundType.OPEN, e).AVu();
        if (AVu == null) {
            return null;
        }
        return AVu.A01();
    }

    @Override // X.RSH, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new RSL(this.A00.entrySet().iterator(), 2);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        AbstractC62759SPq Cgb = this.A00.Cgb();
        if (Cgb != null) {
            return Cgb.A01();
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object e) {
        AbstractC62759SPq Cgb = this.A00.CMG(BoundType.OPEN, e).Cgb();
        if (Cgb == null) {
            return null;
        }
        return Cgb.A01();
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        AbstractC62759SPq E4a = this.A00.E4a();
        if (E4a == null) {
            return null;
        }
        return E4a.A01();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        AbstractC62759SPq E4b = this.A00.E4b();
        if (E4b == null) {
            return null;
        }
        return E4b.A01();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object fromElement, Object toElement) {
        return this.A00.Ep3(BoundType.CLOSED, BoundType.OPEN, fromElement, toElement).ARM();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object fromElement, boolean inclusive) {
        BoundType boundType;
        InterfaceC65666Tqw interfaceC65666Tqw = this.A00;
        if (inclusive) {
            boundType = BoundType.CLOSED;
        } else {
            boundType = BoundType.OPEN;
        }
        return new RS4(interfaceC65666Tqw.Epq(boundType, fromElement));
    }

    public RS4(InterfaceC65666Tqw multiset) {
        this.A00 = multiset;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object toElement) {
        return this.A00.CMG(BoundType.OPEN, toElement).ARM();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object fromElement, boolean fromInclusive, Object toElement, boolean toInclusive) {
        BoundType boundType;
        BoundType boundType2;
        InterfaceC65666Tqw interfaceC65666Tqw = this.A00;
        if (fromInclusive) {
            boundType = BoundType.CLOSED;
        } else {
            boundType = BoundType.OPEN;
        }
        if (toInclusive) {
            boundType2 = BoundType.CLOSED;
        } else {
            boundType2 = BoundType.OPEN;
        }
        return new RS4(interfaceC65666Tqw.Ep3(boundType, boundType2, fromElement, toElement));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object fromElement) {
        return this.A00.Epq(BoundType.CLOSED, fromElement).ARM();
    }
}
