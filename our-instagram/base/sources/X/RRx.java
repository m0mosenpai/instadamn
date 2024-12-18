package X;

import java.util.Collection;

/* loaded from: classes10.dex */
public final class RRx<K, V> extends TZF<K, Collection<V>> {
    public final C46g A00;

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object key) {
        return this.A00.containsKey(key);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // X.TZF, java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        return this.A00.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.A00.keySet().size();
    }

    public RRx(C46g multimap) {
        this.A00 = multimap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object key) {
        if (containsKey(key)) {
            return this.A00.AXV(key);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object key) {
        if (containsKey(key)) {
            return this.A00.EEs(key);
        }
        return null;
    }
}
