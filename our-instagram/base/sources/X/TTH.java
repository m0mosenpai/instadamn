package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TTH implements Iterator, C0s1 {
    public final TTK A00;

    public TTH(C58476Pw2 c58476Pw2) {
        C14360o3.A0B(c58476Pw2, 1);
        this.A00 = new TTK(c58476Pw2.A00, c58476Pw2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        TTK ttk = this.A00;
        C58477Pw3 next = ttk.next();
        return new C65125Te0(ttk.A01, ttk.A05.A03, next);
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A00.remove();
    }
}
