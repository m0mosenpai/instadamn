package X;

import com.google.common.collect.LinkedListMultimap;
import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes10.dex */
public final class TZN<V> extends AbstractSequentialList<V> {
    public final /* synthetic */ LinkedListMultimap A00;
    public final /* synthetic */ Object A01;

    public TZN(final LinkedListMultimap this$0, final Object val$key) {
        this.A00 = this$0;
        this.A01 = val$key;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int index) {
        return new TTR(this.A00, this.A01, index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        C61569Rps c61569Rps = (C61569Rps) this.A00.A04.get(this.A01);
        if (c61569Rps == null) {
            return 0;
        }
        return c61569Rps.A00;
    }
}
