package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes10.dex */
public class RQ8<K> extends AbstractMapBasedMultimap<K, V>.KeySet implements SortedSet<K> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RQ8(final AbstractMapBasedMultimap this$0, SortedMap subMap) {
        super(this$0, subMap);
        this.A00 = this$0;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedMap) this.A00).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return ((SortedMap) this.A00).firstKey();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object toElement) {
        if (this instanceof RQ7) {
            return ((RQ7) this).headSet(toElement, false);
        }
        return new RQ8(this.A00, ((SortedMap) this.A00).headMap(toElement));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return ((SortedMap) this.A00).lastKey();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object fromElement, Object toElement) {
        if (this instanceof RQ7) {
            return ((RQ7) this).subSet(fromElement, true, toElement, false);
        }
        return new RQ8(this.A00, ((SortedMap) this.A00).subMap(fromElement, toElement));
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object fromElement) {
        if (this instanceof RQ7) {
            return ((RQ7) this).tailSet(fromElement, true);
        }
        return new RQ8(this.A00, ((SortedMap) this.A00).tailMap(fromElement));
    }
}
