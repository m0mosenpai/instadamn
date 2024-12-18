package X;

import java.util.AbstractSet;
import java.util.Collection;

/* loaded from: classes10.dex */
public abstract class TZR<E> extends AbstractSet<E> {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection c) {
        return AbstractC103614ld.A06(c, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection c) {
        c.getClass();
        return super.retainAll(c);
    }
}
