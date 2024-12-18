package X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [K] */
/* renamed from: X.RRe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60765RRe<K> extends AbstractC139326Sn<K> {
    public final /* synthetic */ MapMakerInternalMap A00;

    public C60765RRe(final MapMakerInternalMap this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object o) {
        return this.A00.containsKey(o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new AbstractC116005Nc(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        return AbstractC167007dF.A1W(this.A00.remove(o));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }
}
