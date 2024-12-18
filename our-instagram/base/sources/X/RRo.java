package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes10.dex */
public final class RRo<K, V> extends RSG<K, Collection<V>> {
    public final /* synthetic */ RRy A00;

    public RRo(final RRy this$1) {
        this.A00 = this$1;
    }

    @Override // X.RSG, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object o) {
        java.util.Set<Map.Entry<K, V>> entrySet = this.A00.A00.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(o);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C64748TSh(this.A00);
    }

    @Override // X.RSG, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        Object obj;
        if (!contains(o)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) o;
        entry.getClass();
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00.A01;
        Object key = entry.getKey();
        Map map = abstractMapBasedMultimap.A01;
        map.getClass();
        try {
            obj = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj = null;
        }
        Collection collection = (Collection) obj;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractMapBasedMultimap.A00 -= size;
            return true;
        }
        return true;
    }
}
