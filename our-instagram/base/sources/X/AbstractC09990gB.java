package X;

import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.0gB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09990gB {
    public static final Object A0I(Object obj, Map map) {
        if (map instanceof InterfaceC16860se) {
            return ((InterfaceC16860se) map).BZS(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Key ");
        sb.append(obj);
        sb.append(" is missing in the map.");
        throw new NoSuchElementException(sb.toString());
    }

    public static final Map A0J(final Map map, final InterfaceC16660sJ interfaceC16660sJ) {
        if (map instanceof InterfaceC16860se) {
            return A0J(((InterfaceC16860se) map).BPc(), interfaceC16660sJ);
        }
        return new InterfaceC16860se<K, V>(map, interfaceC16660sJ) { // from class: X.0Yl
            public final Map A00;
            public final InterfaceC16660sJ A01;

            @Override // java.util.Map
            public final void clear() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Map
            public final Object put(Object obj, Object obj2) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Map
            public final void putAll(Map map2) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // java.util.Map
            public final Object remove(Object obj) {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            @Override // X.InterfaceC16860se
            public final Map BPc() {
                return this.A00;
            }

            @Override // X.InterfaceC16860se
            public final Object BZS(Object obj) {
                Map map2 = this.A00;
                Object obj2 = map2.get(obj);
                if (obj2 == null && !map2.containsKey(obj)) {
                    return this.A01.invoke(obj);
                }
                return obj2;
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

            {
                this.A00 = map;
                this.A01 = interfaceC16660sJ;
            }
        };
    }

    public static final Map A0K(Map map, InterfaceC16660sJ interfaceC16660sJ) {
        if (map instanceof C09W) {
            return A0K(((C09W) map).A00, interfaceC16660sJ);
        }
        return new C09W(map, interfaceC16660sJ);
    }
}
