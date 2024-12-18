package X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.RQo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractConcurrentMapC60760RQo<K, V> extends RQv<K, V> implements ConcurrentMap<K, V> {
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object key, Object value) {
        return ((MapMakerInternalMap.AbstractSerializationProxy) this).A00.putIfAbsent(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object key, Object value) {
        return ((MapMakerInternalMap.AbstractSerializationProxy) this).A00.remove(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object key, Object value) {
        return ((MapMakerInternalMap.AbstractSerializationProxy) this).A00.replace(key, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object key, Object oldValue, Object newValue) {
        return ((MapMakerInternalMap.AbstractSerializationProxy) this).A00.replace(key, oldValue, newValue);
    }
}
