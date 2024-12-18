package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class RRw<K, V> extends TZF<K, V> {
    public final InterfaceC28041Xi A00;
    public final Map A01;

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object key) {
        Map map = this.A01;
        if (map.containsKey(key)) {
            if (AbstractC58322PtE.A1V(this.A00, key, map.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object key) {
        Object obj = this.A01.get(key);
        if (obj != null && AbstractC58322PtE.A1V(this.A00, key, obj)) {
            return obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object key, Object value) {
        C18C.A0E(AbstractC58322PtE.A1V(this.A00, key, value));
        return this.A01.put(key, value);
    }

    public RRw(InterfaceC28041Xi unfiltered, Map predicate) {
        this.A01 = predicate;
        this.A00 = unfiltered;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            C18C.A0E(AbstractC58322PtE.A1V(this.A00, A1K.getKey(), A1K.getValue()));
        }
        this.A01.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object key) {
        if (containsKey(key)) {
            return this.A01.remove(key);
        }
        return null;
    }
}
