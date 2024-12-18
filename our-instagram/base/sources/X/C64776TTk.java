package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.TTk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64776TTk<K, V> implements Map<K, V>, InterfaceC16540rz {
    public final Map A00;

    @Override // java.util.Map
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.A00.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        C14360o3.A0B(map, 0);
        this.A00.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.A00.remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return this.A00.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return this.A00.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return this.A00.size();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return this.A00.values();
    }

    public C64776TTk(Map map) {
        this.A00 = map;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        while (size() >= 500) {
            remove(AbstractC001800i.A09(keySet()));
        }
        return this.A00.put(obj, obj2);
    }
}
