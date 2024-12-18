package X;

import com.google.common.collect.LinkedListMultimap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes10.dex */
public final class RSE<K> extends TZR<K> {
    public final /* synthetic */ LinkedListMultimap A00;

    public RSE(final LinkedListMultimap this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object key) {
        return this.A00.A04.containsKey(key);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C64758TSs(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        LinkedListMultimap linkedListMultimap = this.A00;
        TTR ttr = new TTR(linkedListMultimap, o);
        ArrayList A1E = AbstractC166987dD.A1E();
        AbstractC63071Sbt.A02(A1E, ttr);
        List unmodifiableList = Collections.unmodifiableList(A1E);
        LinkedListMultimap.A02(linkedListMultimap, o);
        return AbstractC166987dD.A1b(unmodifiableList);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.A04.size();
    }
}
