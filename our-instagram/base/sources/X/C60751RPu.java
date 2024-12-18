package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.RPu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60751RPu<K, V> extends ConcurrentMapC200188tN<K, V>.AbstractCacheSet<Map.Entry<K, V>> {
    public final /* synthetic */ ConcurrentMapC200188tN A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60751RPu(final ConcurrentMapC200188tN this$0) {
        super(this$0);
        this.A00 = this$0;
    }

    public final boolean contains(Object o) {
        Map.Entry entry;
        Object key;
        ConcurrentMapC200188tN concurrentMapC200188tN;
        V v;
        if (!(o instanceof Map.Entry) || (key = (entry = (Map.Entry) o).getKey()) == null || (v = (concurrentMapC200188tN = this.A00).get(key)) == null || !concurrentMapC200188tN.A0A.A01(entry.getValue(), v)) {
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return new B0V(this.A00);
    }

    public final boolean remove(Object o) {
        Map.Entry entry;
        Object key;
        if (!(o instanceof Map.Entry) || (key = (entry = (Map.Entry) o).getKey()) == null || !this.A00.remove(key, entry.getValue())) {
            return false;
        }
        return true;
    }
}
