package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TTJ implements Iterator, C0s1 {
    public final TTK A00;

    public TTJ(C58476Pw2 c58476Pw2) {
        C14360o3.A0B(c58476Pw2, 1);
        this.A00 = new TTK(c58476Pw2.A00, c58476Pw2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.A00.next().A02;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A00.remove();
    }
}
