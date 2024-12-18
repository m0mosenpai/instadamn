package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TTF implements Iterator, C0s1 {
    public final C58729Q5u A00;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A00.remove();
    }

    public TTF(C5VS c5vs) {
        AbstractC128315r0[] abstractC128315r0Arr = new AbstractC128315r0[8];
        int i = 0;
        do {
            abstractC128315r0Arr[i] = new Q5x(this);
            i++;
        } while (i < 8);
        this.A00 = new C58729Q5u(c5vs, abstractC128315r0Arr);
    }
}
