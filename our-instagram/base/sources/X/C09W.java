package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.09W, reason: invalid class name */
/* loaded from: classes.dex */
public final class C09W implements Map, InterfaceC16860se, InterfaceC16540rz {
    public final Map A00;
    public final InterfaceC16660sJ A01;

    @Override // java.util.Map
    public final void putAll(Map map) {
        C14360o3.A0B(map, 0);
        this.A00.putAll(map);
    }

    @Override // X.InterfaceC16860se
    public final Map BPc() {
        return this.A00;
    }

    @Override // X.InterfaceC16860se
    public final Object BZS(Object obj) {
        Map map = this.A00;
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            return this.A01.invoke(obj);
        }
        return obj2;
    }

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
    public final /* bridge */ java.util.Set entrySet() {
        return this.A00.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.A00.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.A00.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return this.A00.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.A00.put(obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.A00.remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public final String toString() {
        return this.A00.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return this.A00.values();
    }

    public C09W(Map map, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = map;
        this.A01 = interfaceC16660sJ;
    }
}
