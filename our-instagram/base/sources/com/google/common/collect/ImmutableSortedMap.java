package com.google.common.collect;

import X.AbstractC166987dD;
import X.AbstractC31175DnJ;
import X.AbstractC43592JPx;
import X.AbstractC58318PtA;
import X.AbstractC58322PtE;
import X.C18C;
import X.C1LC;
import X.C4VF;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes10.dex */
public final class ImmutableSortedMap<K, V> extends ImmutableMap<K, V> implements NavigableMap<K, V> {
    public static final ImmutableSortedMap A03;
    public static final Comparator A04;
    public static final long serialVersionUID = 0;
    public transient ImmutableSortedMap A00;
    public final transient ImmutableList A01;
    public final transient RegularImmutableSortedSet A02;

    /* renamed from: com.google.common.collect.ImmutableSortedMap$1EntrySet, reason: invalid class name */
    /* loaded from: classes10.dex */
    public class C1EntrySet extends ImmutableMapEntrySet<K, V> {
        public C1EntrySet() {
        }

        @Override // com.google.common.collect.ImmutableSet
        public final ImmutableList A0C() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                @Override // com.google.common.collect.ImmutableCollection
                public final boolean A0B() {
                    return true;
                }

                @Override // java.util.List
                /* renamed from: A0C, reason: merged with bridge method [inline-methods] */
                public final AbstractMap.SimpleImmutableEntry get(int index) {
                    ImmutableSortedMap immutableSortedMap = ImmutableSortedMap.this;
                    ImmutableSortedMap immutableSortedMap2 = ImmutableSortedMap.A03;
                    return new AbstractMap.SimpleImmutableEntry(immutableSortedMap.A02.elements.get(index), ImmutableSortedMap.this.A01.get(index));
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return ImmutableSortedMap.this.size();
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final C1LC iterator() {
            return asList().iterator();
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return asList().iterator();
        }
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object key) {
        return tailMap(key, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object key) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        key.getClass();
        return A00(0, regularImmutableSortedSet.A0F(key, true)).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object key) {
        return tailMap(key, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object key) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        key.getClass();
        return A00(0, regularImmutableSortedSet.A0F(key, false)).lastEntry();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object fromKey, Object toKey) {
        fromKey.getClass();
        toKey.getClass();
        C18C.A09(fromKey, toKey, "expected fromKey <= toKey but %s > %s", AbstractC31175DnJ.A1S(comparator().compare(fromKey, toKey)));
        return A00(0, this.A02.A0F(toKey, false)).tailMap(fromKey, true);
    }

    /* loaded from: classes10.dex */
    public class SerializedForm extends ImmutableMap.SerializedForm {
        public static final long serialVersionUID = 0;
        public final Comparator comparator;

        public SerializedForm(ImmutableSortedMap sortedMap) {
            super(sortedMap);
            this.comparator = sortedMap.comparator();
        }
    }

    static {
        NaturalOrdering naturalOrdering = NaturalOrdering.A00;
        A04 = naturalOrdering;
        A03 = new ImmutableSortedMap(ImmutableList.of(), null, ImmutableSortedSet.A06(naturalOrdering));
    }

    private ImmutableSortedMap A00(int fromIndex, int toIndex) {
        if (fromIndex == 0 && toIndex == size()) {
            return this;
        }
        if (fromIndex == toIndex) {
            return A01(comparator());
        }
        return new ImmutableSortedMap(this.A01.subList(fromIndex, toIndex), null, this.A02.A0H(fromIndex, toIndex));
    }

    public static ImmutableSortedMap A01(Comparator comparator) {
        if (NaturalOrdering.A00.equals(comparator)) {
            return A03;
        }
        return new ImmutableSortedMap(ImmutableList.of(), null, ImmutableSortedSet.A06(comparator));
    }

    private void readObject(ObjectInputStream stream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.NavigableMap
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap tailMap(Object fromKey, boolean inclusive) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        fromKey.getClass();
        return A00(regularImmutableSortedSet.A0G(fromKey, inclusive), size());
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.A02.comparator();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.A02.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        ImmutableSortedMap immutableSortedMap = this.A00;
        if (immutableSortedMap == null) {
            if (isEmpty()) {
                return A01(C4VF.A00(comparator()).A01());
            }
            return new ImmutableSortedMap(this.A01.reverse(), this, (RegularImmutableSortedSet) this.A02.descendingSet());
        }
        return immutableSortedMap;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.A02.first();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Object get(Object key) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        int i = -1;
        if (key != null) {
            try {
                int binarySearch = Collections.binarySearch(regularImmutableSortedSet.elements, key, regularImmutableSortedSet.A01);
                if (binarySearch >= 0) {
                    i = binarySearch;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (i == -1) {
            return null;
        }
        return this.A01.get(i);
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap headMap(Object toKey, boolean inclusive) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        toKey.getClass();
        return A00(0, regularImmutableSortedSet.A0F(toKey, inclusive));
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean isPartialView() {
        if (!this.A02.A0B() && !this.A01.A0B()) {
            return false;
        }
        return true;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final /* bridge */ /* synthetic */ ImmutableSet keySet() {
        return this.A02;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.A02.last();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet navigableKeySet() {
        return this.A02;
    }

    @Override // java.util.Map
    public final int size() {
        return this.A01.size();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final ImmutableCollection values() {
        return this.A01;
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public ImmutableSortedMap(ImmutableList keySet, ImmutableSortedMap valueList, RegularImmutableSortedSet descendingMap) {
        this.A02 = descendingMap;
        this.A01 = keySet;
        this.A00 = valueList;
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object key) {
        return AbstractC58322PtE.A0l(ceilingEntry(key));
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet createEntrySet() {
        if (isEmpty()) {
            return RegularImmutableSet.A03;
        }
        return new C1EntrySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet createKeySet() {
        throw AbstractC58318PtA.A0W("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection createValues() {
        throw AbstractC58318PtA.A0W("should never be called");
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) AbstractC166987dD.A16(entrySet().asList());
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object key) {
        return AbstractC58322PtE.A0l(floorEntry(key));
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object key) {
        return AbstractC58322PtE.A0l(higherEntry(key));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().asList().get(size() - 1);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object key) {
        return AbstractC58322PtE.A0l(lowerEntry(key));
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
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object toKey) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.A02;
        toKey.getClass();
        return A00(0, regularImmutableSortedSet.A0F(toKey, false));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return this.A02;
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap subMap(Object fromKey, boolean fromInclusive, Object toKey, boolean toInclusive) {
        fromKey.getClass();
        toKey.getClass();
        C18C.A09(fromKey, toKey, "expected fromKey <= toKey but %s > %s", AbstractC31175DnJ.A1S(comparator().compare(fromKey, toKey)));
        return A00(0, this.A02.A0F(toKey, toInclusive)).tailMap(fromKey, fromInclusive);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object fromKey) {
        return tailMap(fromKey, true);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return this.A01;
    }
}
