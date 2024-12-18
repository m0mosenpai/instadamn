package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class TT1 implements Iterator {
    public final Collection A00;
    public final Iterator A01;
    public final /* synthetic */ AbstractC64892TYs A02;

    public TT1(AbstractC64892TYs abstractC64892TYs, Iterator it) {
        this.A02 = abstractC64892TYs;
        this.A00 = abstractC64892TYs.A00;
        this.A01 = it;
    }

    public TT1(AbstractC64892TYs abstractC64892TYs) {
        Iterator it;
        this.A02 = abstractC64892TYs;
        Collection collection = abstractC64892TYs.A00;
        this.A00 = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.A01 = it;
    }

    public final void A00() {
        AbstractC64892TYs abstractC64892TYs = this.A02;
        abstractC64892TYs.A01();
        if (abstractC64892TYs.A00 == this.A00) {
        } else {
            throw AbstractC58318PtA.A0z();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A01.remove();
        AbstractC64892TYs abstractC64892TYs = this.A02;
        AbstractC60698RNa abstractC60698RNa = abstractC64892TYs.A04;
        abstractC60698RNa.A00--;
        abstractC64892TYs.A02();
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
}
