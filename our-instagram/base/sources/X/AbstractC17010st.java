package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0st, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17010st<K, V> implements Map<K, V>, InterfaceC15590qF {
    public abstract int A00();

    public abstract Collection A01();

    public abstract java.util.Set A02();

    public abstract java.util.Set A03();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public abstract boolean containsKey(Object obj);

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (size() == map.size()) {
                    java.util.Set<Map.Entry<K, V>> entrySet = map.entrySet();
                    if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
                        for (Map.Entry<K, V> entry : entrySet) {
                            if (entry != null) {
                                K key = entry.getKey();
                                V value = entry.getValue();
                                Object obj2 = get(key);
                                if (C14360o3.A0K(value, obj2)) {
                                    if (obj2 == null && !containsKey(key)) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        java.util.Set entrySet = entrySet();
        if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((Map.Entry) it.next()).getValue(), obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return A02();
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return A03();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return A00();
    }

    public final String toString() {
        return AbstractC001800i.A0P(", ", "{", "}", entrySet(), new C024809w(this));
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return A01();
    }
}
