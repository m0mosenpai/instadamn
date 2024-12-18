package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* loaded from: classes10.dex */
public final class RM0 extends AbstractC64771TTf implements NavigableMap {
    public static final Comparator A03;
    public static final RM0 A04;
    public final transient RLz A00;
    public final transient RM4 A01;
    public final transient RM0 A02;

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.A01.A02;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.A01;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.A01.A02.compare(obj, obj2) <= 0) {
            return headMap(obj2, false).tailMap(obj, true);
        }
        throw AbstractC166987dD.A12(S2W.A00("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    static {
        RM8 rm8 = RM8.A00;
        A03 = rm8;
        RM4 A00 = RM4.A00(rm8);
        RMC rmc = RLz.A00;
        A04 = new RM0(RLy.A02, null, A00);
    }

    private final RM0 A00(int i, int i2) {
        if (i == 0) {
            if (i2 != this.A00.size()) {
                i = 0;
            } else {
                return this;
            }
        }
        if (i == i2) {
            return A01(this.A01.A02);
        }
        RM4 rm4 = this.A01;
        RLz rLz = this.A00;
        return new RM0(rLz.subList(i, i2), null, rm4.A0A(i, i2));
    }

    public static RM0 A01(Comparator comparator) {
        if (RM8.A00.equals(comparator)) {
            return A04;
        }
        RM4 A00 = RM4.A00(comparator);
        RMC rmc = RLz.A00;
        return new RM0(RLy.A02, null, A00);
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.A01.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        TSC rm6;
        Comparator rm7;
        RM0 rm0 = this.A02;
        if (rm0 == null) {
            boolean isEmpty = isEmpty();
            RM4 rm4 = this.A01;
            if (isEmpty) {
                Comparator comparator = rm4.A02;
                if (comparator instanceof TSC) {
                    rm6 = (TSC) comparator;
                } else {
                    rm6 = new RM6(comparator);
                }
                if (rm6 instanceof RM7) {
                    rm7 = ((RM7) rm6).A00;
                } else if (rm6 instanceof RM9) {
                    rm7 = RM8.A00;
                } else if (rm6 instanceof RM8) {
                    rm7 = RM9.A00;
                } else {
                    rm7 = new RM7(rm6);
                }
                return A01(rm7);
            }
            return new RM0(this.A00.A08(), this, rm4.descendingSet());
        }
        return rm0;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.A01.first();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.A01.last();
    }

    @Override // java.util.Map
    public final int size() {
        return this.A00.size();
    }

    public RM0(RLz rLz, RM0 rm0, RM4 rm4) {
        this.A01 = rm4;
        this.A00 = rLz;
        this.A02 = rm0;
    }

    @Override // java.util.NavigableMap
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final RM0 headMap(Object obj, boolean z) {
        obj.getClass();
        RM4 rm4 = this.A01;
        int binarySearch = Collections.binarySearch(rm4.A01, obj, rm4.A02);
        if (binarySearch >= 0) {
            if (z) {
                binarySearch++;
            }
        } else {
            binarySearch ^= -1;
        }
        return A00(0, binarySearch);
    }

    @Override // java.util.NavigableMap
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final RM0 tailMap(Object obj, boolean z) {
        obj.getClass();
        RM4 rm4 = this.A01;
        int binarySearch = Collections.binarySearch(rm4.A01, obj, rm4.A02);
        if (binarySearch >= 0) {
            if (!z) {
                binarySearch++;
            }
        } else {
            binarySearch ^= -1;
        }
        return A00(binarySearch, this.A00.size());
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return AbstractC58322PtE.A0l(ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) AbstractC166987dD.A16(entrySet().A08());
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return AbstractC58322PtE.A0l(floorEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return AbstractC58322PtE.A0l(higherEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().A08().get(AbstractC58318PtA.A08(this.A00));
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return AbstractC58322PtE.A0l(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw AbstractC43592JPx.A11();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.A01.A02.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        throw AbstractC166987dD.A12(S2W.A00("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
