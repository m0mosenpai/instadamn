package X;

import com.google.common.collect.HashBiMap;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes10.dex */
public final class RR1<K, V> extends TZS<K, V, K> {
    public final /* synthetic */ HashBiMap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RR1(final HashBiMap this$0) {
        super(this$0);
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object o) {
        return this.A00.containsKey(o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        int A02 = C1Jk.A02(o);
        HashBiMap hashBiMap = this.A00;
        int A0A = hashBiMap.A0A(o, A02);
        if (A0A != -1) {
            HashBiMap.A07(hashBiMap, A0A, A02, C1Jk.A02(hashBiMap.A0C[A0A]));
            return true;
        }
        return false;
    }
}
