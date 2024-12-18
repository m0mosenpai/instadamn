package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes10.dex */
public final class RM4 extends RM5 implements NavigableSet, InterfaceC65680TrA {
    public static final RM4 A03;
    public transient RM4 A00;
    public final transient RLz A01;
    public final transient Comparator A02;

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.A02;
    }

    @Override // X.AbstractC64897TYx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.A01, obj, this.A02) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // X.RM5, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof java.util.Set)) {
                return false;
            }
            java.util.Set set = (java.util.Set) obj;
            RLz rLz = this.A01;
            if (rLz.size() != set.size()) {
                return false;
            }
            if (!isEmpty()) {
                Comparator comparator = this.A02;
                if (S2Y.A00(set, comparator)) {
                    Iterator it = set.iterator();
                    try {
                        RMC listIterator = rLz.listIterator(0);
                        while (listIterator.hasNext()) {
                            Object next = listIterator.next();
                            Object next2 = it.next();
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

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, obj2, true, false);
    }

    static {
        RMC rmc = RLz.A00;
        A03 = new RM4(RLy.A02, RM8.A00);
    }

    public static RM4 A00(Comparator comparator) {
        if (RM8.A00.equals(comparator)) {
            return A03;
        }
        RMC rmc = RLz.A00;
        return new RM4(RLy.A02, comparator);
    }

    @Override // java.util.NavigableSet
    /* renamed from: A09, reason: merged with bridge method [inline-methods] */
    public final RM4 descendingSet() {
        RM4 rm4 = this.A00;
        if (rm4 == null) {
            Comparator reverseOrder = Collections.reverseOrder(this.A02);
            if (isEmpty()) {
                rm4 = A00(reverseOrder);
            } else {
                rm4 = new RM4(this.A01.A08(), reverseOrder);
            }
            this.A00 = rm4;
            rm4.A00 = this;
        }
        return rm4;
    }

    public final RM4 A0A(int i, int i2) {
        if (i == 0) {
            if (i2 != this.A01.size()) {
                i = 0;
            } else {
                return this;
            }
        }
        if (i < i2) {
            RLz rLz = this.A01;
            return new RM4(rLz.subList(i, i2), this.A02);
        }
        return A00(this.A02);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        RLz rLz = this.A01;
        obj.getClass();
        int binarySearch = Collections.binarySearch(rLz, obj, this.A02);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        if (binarySearch == rLz.size()) {
            return null;
        }
        return rLz.get(binarySearch);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.A02;
        if (S2Y.A00(collection, comparator) && collection.size() > 1) {
            RMC listIterator = this.A01.listIterator(0);
            Iterator it = collection.iterator();
            if (!listIterator.hasNext()) {
                return false;
            }
            Object next = it.next();
            Object next2 = listIterator.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare < 0) {
                        if (!listIterator.hasNext()) {
                            return false;
                        }
                        next2 = listIterator.next();
                    } else {
                        if (compare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        } else {
            return super.containsAll(collection);
        }
        return false;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return this.A01.A08().listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        RLz rLz = this.A01;
        obj.getClass();
        int binarySearch = Collections.binarySearch(rLz, obj, this.A02);
        int i = binarySearch ^ (-1);
        if (binarySearch >= 0) {
            i = binarySearch + 1;
        }
        if (i == rLz.size()) {
            return null;
        }
        return rLz.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.A01.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A01.size();
    }

    public RM4(RLz rLz, Comparator comparator) {
        this.A02 = comparator;
        this.A01 = rLz;
    }

    @Override // java.util.NavigableSet
    /* renamed from: A0B, reason: merged with bridge method [inline-methods] */
    public final RM4 subSet(Object obj, Object obj2, boolean z, boolean z2) {
        obj.getClass();
        obj2.getClass();
        Comparator comparator = this.A02;
        if (comparator.compare(obj, obj2) <= 0) {
            RLz rLz = this.A01;
            int binarySearch = Collections.binarySearch(rLz, obj, comparator);
            if (binarySearch >= 0) {
                if (!z) {
                    binarySearch++;
                }
            } else {
                binarySearch ^= -1;
            }
            RM4 A0A = A0A(binarySearch, rLz.size());
            int binarySearch2 = Collections.binarySearch(A0A.A01, obj2, A0A.A02);
            if (binarySearch2 >= 0) {
                if (z2) {
                    binarySearch2++;
                }
            } else {
                binarySearch2 ^= -1;
            }
            return A0A.A0A(0, binarySearch2);
        }
        throw AbstractC58318PtA.A0Y();
    }

    @Deprecated
    public final void addFirst(Object obj) {
        throw AbstractC43592JPx.A11();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return AbstractC166987dD.A16(this.A01);
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        obj.getClass();
        RLz rLz = this.A01;
        int binarySearch = Collections.binarySearch(rLz, obj, this.A02);
        int i = binarySearch ^ (-1);
        if (binarySearch >= 0) {
            i = binarySearch + 1;
        }
        int i2 = i - 1;
        if (i2 == -1) {
            return null;
        }
        return rLz.get(i2);
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.A01, obj, this.A02);
        if (binarySearch >= 0) {
            if (z) {
                binarySearch++;
            }
        } else {
            binarySearch ^= -1;
        }
        return A0A(0, binarySearch);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            RLz rLz = this.A01;
            return rLz.get(AbstractC58318PtA.A08(rLz));
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        obj.getClass();
        RLz rLz = this.A01;
        int binarySearch = Collections.binarySearch(rLz, obj, this.A02);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        int i = binarySearch - 1;
        if (i == -1) {
            return null;
        }
        return rLz.get(i);
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

    @Deprecated
    public final Object removeFirst() {
        throw AbstractC43592JPx.A11();
    }

    @Deprecated
    public final Object removeLast() {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        RLz rLz = this.A01;
        int binarySearch = Collections.binarySearch(rLz, obj, this.A02);
        if (binarySearch >= 0) {
            if (!z) {
                binarySearch++;
            }
        } else {
            binarySearch ^= -1;
        }
        return A0A(binarySearch, rLz.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.A01, obj, this.A02);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        return A0A(0, binarySearch);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        RLz rLz = this.A01;
        int binarySearch = Collections.binarySearch(rLz, obj, this.A02);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        return A0A(binarySearch, rLz.size());
    }
}
