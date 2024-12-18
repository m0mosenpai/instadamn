package X;

import com.google.common.collect.HashBiMap;
import java.util.Map;

/* renamed from: X.RQz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60763RQz<K, V> extends TZS<K, V, Map.Entry<V, K>> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object o) {
        if (!(o instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) o;
        Object key = entry.getKey();
        Object value = entry.getValue();
        HashBiMap hashBiMap = this.A00;
        int A0B = hashBiMap.A0B(key, C1Jk.A02(key));
        if (A0B == -1 || !AbstractC50102Ry.A00(hashBiMap.A0B[A0B], value)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        if (o instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) o;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int A02 = C1Jk.A02(key);
            HashBiMap hashBiMap = this.A00;
            int A0B = hashBiMap.A0B(key, A02);
            if (A0B != -1 && AbstractC50102Ry.A00(hashBiMap.A0B[A0B], value)) {
                hashBiMap.A0F(A0B, A02);
                return true;
            }
            return false;
        }
        return false;
    }
}
