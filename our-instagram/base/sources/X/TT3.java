package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class TT3 implements Iterator {
    public final Collection A00;
    public final Iterator A01;
    public final /* synthetic */ AbstractC64893TYt A02;

    public TT3(final AbstractC64893TYt this$1, Iterator delegateIterator) {
        this.A02 = this$1;
        this.A00 = this$1.A00;
        this.A01 = delegateIterator;
    }

    public final void A00() {
        AbstractC64893TYt abstractC64893TYt = this.A02;
        abstractC64893TYt.A01();
        if (abstractC64893TYt.A00 == this.A00) {
        } else {
            throw AbstractC58318PtA.A0z();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A01.remove();
        AbstractC64893TYt abstractC64893TYt = this.A02;
        AbstractMapBasedMultimap abstractMapBasedMultimap = abstractC64893TYt.A04;
        abstractMapBasedMultimap.A00--;
        abstractC64893TYt.A02();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        A00();
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        A00();
        return this.A01.next();
    }

    public TT3(final AbstractC64893TYt this$1) {
        Iterator it;
        this.A02 = this$1;
        Collection collection = this$1.A00;
        this.A00 = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.A01 = it;
    }
}
