package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes10.dex */
public class RQ5<K, V> extends AbstractMapBasedMultimap<K, V>.AsMap implements SortedMap<K, Collection<V>> {
    public SortedSet A00;
    public final /* synthetic */ AbstractMapBasedMultimap A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RQ5(final AbstractMapBasedMultimap this$0, SortedMap submap) {
        super(this$0, submap);
        this.A01 = this$0;
    }

    @Override // java.util.SortedMap, java.util.Map
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.A00;
        if (sortedSet == null) {
            if (this instanceof RQ9) {
                RQ9 rq9 = (RQ9) this;
                sortedSet = new RQ7(rq9.A00, (NavigableMap) ((SortedMap) rq9.A00));
            } else {
                sortedSet = new RQ8(this.A01, (SortedMap) this.A00);
            }
            this.A00 = sortedSet;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((SortedMap) this.A00).comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return ((SortedMap) this.A00).firstKey();
    }

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object toKey) {
        if (this instanceof RQ9) {
            return ((RQ9) this).headMap(toKey, false);
        }
        return new RQ5(this.A01, ((SortedMap) this.A00).headMap(toKey));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return ((SortedMap) this.A00).lastKey();
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object fromKey, Object toKey) {
        if (this instanceof RQ9) {
            return ((RQ9) this).subMap(fromKey, true, toKey, false);
        }
        return new RQ5(this.A01, ((SortedMap) this.A00).subMap(fromKey, toKey));
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object fromKey) {
        if (this instanceof RQ9) {
            return ((RQ9) this).tailMap(fromKey, true);
        }
        return new RQ5(this.A01, ((SortedMap) this.A00).tailMap(fromKey));
    }
}
