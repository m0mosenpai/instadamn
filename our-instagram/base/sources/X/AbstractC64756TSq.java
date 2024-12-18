package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.ImmutableEntry;
import com.google.common.collect.Iterators$EmptyModifiableIterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TSq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64756TSq implements Iterator {
    public Object A00 = null;
    public Collection A01 = null;
    public Iterator A02 = Iterators$EmptyModifiableIterator.A01;
    public final Iterator A03;
    public final /* synthetic */ AbstractMapBasedMultimap A04;

    public AbstractC64756TSq(final AbstractMapBasedMultimap this$0) {
        this.A04 = this$0;
        this.A03 = AbstractC166997dE.A15(this$0.A01);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.A03.hasNext() && !this.A02.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.A02.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(this.A03);
            this.A00 = A1K.getKey();
            Collection A0y = AbstractC58318PtA.A0y(A1K);
            this.A01 = A0y;
            this.A02 = A0y.iterator();
        }
        return new ImmutableEntry(this.A00, this.A02.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A02.remove();
        Collection collection = this.A01;
        collection.getClass();
        if (collection.isEmpty()) {
            this.A03.remove();
        }
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A04;
        abstractMapBasedMultimap.A00--;
    }
}
