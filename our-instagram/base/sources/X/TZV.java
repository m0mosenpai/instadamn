package X;

import java.util.AbstractSet;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public abstract class TZV<T> extends AbstractSet<T> {
    public final /* synthetic */ ConcurrentMapC200188tN A00;

    public TZV(final ConcurrentMapC200188tN this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] a) {
        ArrayList A11 = AbstractC58319PtB.A11(this);
        AbstractC63071Sbt.A02(A11, iterator());
        return A11.toArray(a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        ArrayList A11 = AbstractC58319PtB.A11(this);
        AbstractC63071Sbt.A02(A11, iterator());
        return A11.toArray();
    }
}
