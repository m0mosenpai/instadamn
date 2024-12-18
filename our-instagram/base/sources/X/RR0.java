package X;

import com.google.common.collect.HashBiMap;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes10.dex */
public final class RR0<K, V> extends TZS<K, V, Map.Entry<K, V>> {
    public final /* synthetic */ HashBiMap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RR0(final HashBiMap this$0) {
        super(this$0);
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object o) {
        if (!(o instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) o;
        Object key = entry.getKey();
        Object value = entry.getValue();
        HashBiMap hashBiMap = this.A00;
        int A0A = hashBiMap.A0A(key, C1Jk.A02(key));
        if (A0A == -1 || !AbstractC50102Ry.A00(value, hashBiMap.A0C[A0A])) {
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
            int A0A = hashBiMap.A0A(key, A02);
            if (A0A != -1 && AbstractC50102Ry.A00(value, hashBiMap.A0C[A0A])) {
                HashBiMap.A07(hashBiMap, A0A, A02, C1Jk.A02(hashBiMap.A0C[A0A]));
                return true;
            }
            return false;
        }
        return false;
    }
}
