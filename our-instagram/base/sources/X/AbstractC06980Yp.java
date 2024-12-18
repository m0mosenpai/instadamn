package X;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.0Yp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC06980Yp<K, V> extends AbstractMap<K, V> implements Map<K, V>, InterfaceC16540rz {
    public abstract /* bridge */ int A00();

    public abstract /* bridge */ Collection A01();

    public abstract java.util.Set A02();

    public abstract /* bridge */ java.util.Set A03();

    @Override // java.util.AbstractMap, java.util.Map
    public abstract Object put(Object obj, Object obj2);

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return A02();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return A03();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return A00();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return A01();
    }
}
