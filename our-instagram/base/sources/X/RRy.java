package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.ImmutableEntry;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes10.dex */
public class RRy<K, V> extends TZF<K, Collection<V>> {
    public final transient Map A00;
    public final /* synthetic */ AbstractMapBasedMultimap A01;

    public RRy(final AbstractMapBasedMultimap this$0, Map submap) {
        this.A01 = this$0;
        this.A00 = submap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.A00;
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A01;
        if (map == abstractMapBasedMultimap.A01) {
            abstractMapBasedMultimap.clear();
            return;
        }
        C64748TSh c64748TSh = new C64748TSh(this);
        while (c64748TSh.hasNext()) {
            c64748TSh.next();
            c64748TSh.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object key) {
        Map map = this.A00;
        map.getClass();
        try {
            return map.containsKey(key);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object object) {
        if (this != object && !this.A00.equals(object)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object key) {
        Object obj;
        Map map = this.A00;
        map.getClass();
        try {
            obj = map.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj = null;
        }
        Collection collection = (Collection) obj;
        if (collection == null) {
            return null;
        }
        return this.A01.A09(key, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.TZF, java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        return this.A01.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object key) {
        Collection collection = (Collection) this.A00.remove(key);
        if (collection == null) {
            return null;
        }
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A01;
        Collection A08 = abstractMapBasedMultimap.A08();
        A08.addAll(collection);
        abstractMapBasedMultimap.A00 -= collection.size();
        collection.clear();
        return A08;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.A00.toString();
    }

    public final ImmutableEntry A00(Map.Entry entry) {
        Object key = entry.getKey();
        return new ImmutableEntry(key, this.A01.A09(key, AbstractC58318PtA.A0y(entry)));
    }
}
