package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: X.TYo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64888TYo<V> extends AbstractCollection<V> {
    public final /* synthetic */ ConcurrentMapC200188tN A00;

    public C64888TYo(final ConcurrentMapC200188tN this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object o) {
        return this.A00.containsValue(o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new B0V(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] a) {
        ArrayList A11 = AbstractC58319PtB.A11(this);
        AbstractC63071Sbt.A02(A11, iterator());
        return A11.toArray(a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        ArrayList A11 = AbstractC58319PtB.A11(this);
        AbstractC63071Sbt.A02(A11, iterator());
        return A11.toArray();
    }
}
