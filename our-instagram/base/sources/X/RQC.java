package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes10.dex */
public final class RQC<V> extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements java.util.Set<V> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RQC(final AbstractMapBasedMultimap this$0, Object key, java.util.Set delegate) {
        super(null, this$0, key, delegate);
        this.A00 = this$0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection c) {
        if (c.isEmpty()) {
            return false;
        }
        int size = size();
        boolean A06 = AbstractC103614ld.A06(c, (java.util.Set) this.A00);
        if (!A06) {
            return A06;
        }
        int size2 = this.A00.size();
        this.A00.A00 += size2 - size;
        A02();
        return A06;
    }
}
