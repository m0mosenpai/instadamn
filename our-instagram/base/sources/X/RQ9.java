package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.AbstractSetMultimap;
import com.google.common.collect.ImmutableEntry;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes10.dex */
public final class RQ9<K, V> extends AbstractMapBasedMultimap<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RQ9(final AbstractMapBasedMultimap this$0, NavigableMap submap) {
        super(this$0, submap);
        this.A00 = this$0;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object key) {
        Map.Entry<K, V> ceilingEntry = ((NavigableMap) ((SortedMap) this.A00)).ceilingEntry(key);
        if (ceilingEntry == null) {
            return null;
        }
        return A00(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object key) {
        return ((NavigableMap) ((SortedMap) this.A00)).ceilingKey(key);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new RQ9(this.A00, ((NavigableMap) ((SortedMap) this.A00)).descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry<K, V> firstEntry = ((NavigableMap) ((SortedMap) this.A00)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return A00(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object key) {
        Map.Entry<K, V> floorEntry = ((NavigableMap) ((SortedMap) this.A00)).floorEntry(key);
        if (floorEntry == null) {
            return null;
        }
        return A00(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object key) {
        return ((NavigableMap) ((SortedMap) this.A00)).floorKey(key);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object toKey, boolean inclusive) {
        return new RQ9(this.A00, ((NavigableMap) ((SortedMap) this.A00)).headMap(toKey, inclusive));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object key) {
        Map.Entry<K, V> higherEntry = ((NavigableMap) ((SortedMap) this.A00)).higherEntry(key);
        if (higherEntry == null) {
            return null;
        }
        return A00(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object key) {
        return ((NavigableMap) ((SortedMap) this.A00)).higherKey(key);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry<K, V> lastEntry = ((NavigableMap) ((SortedMap) this.A00)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return A00(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object key) {
        Map.Entry<K, V> lowerEntry = ((NavigableMap) ((SortedMap) this.A00)).lowerEntry(key);
        if (lowerEntry == null) {
            return null;
        }
        return A00(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object key) {
        return ((NavigableMap) ((SortedMap) this.A00)).lowerKey(key);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object fromKey, boolean fromInclusive, Object toKey, boolean toInclusive) {
        return new RQ9(this.A00, ((NavigableMap) ((SortedMap) this.A00)).subMap(fromKey, fromInclusive, toKey, toInclusive));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object fromKey, boolean inclusive) {
        return new RQ9(this.A00, ((NavigableMap) ((SortedMap) this.A00)).tailMap(fromKey, inclusive));
    }

    public final /* bridge */ /* synthetic */ SortedSet A01() {
        return super.keySet();
    }

    public final ImmutableEntry A02(Iterator entryIterator) {
        Object unmodifiableList;
        if (!entryIterator.hasNext()) {
            return null;
        }
        Map.Entry A1K = AbstractC166987dD.A1K(entryIterator);
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        Collection A08 = abstractMapBasedMultimap.A08();
        A08.addAll(AbstractC58318PtA.A0y(A1K));
        entryIterator.remove();
        Object key = A1K.getKey();
        if (abstractMapBasedMultimap instanceof AbstractSetMultimap) {
            unmodifiableList = Collections.unmodifiableSet((java.util.Set) A08);
        } else {
            unmodifiableList = Collections.unmodifiableList((List) A08);
        }
        return new ImmutableEntry(key, unmodifiableList);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.SortedMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        return super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return A02(AbstractC166997dE.A14(this));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return A02(descendingMap().entrySet().iterator());
    }
}
