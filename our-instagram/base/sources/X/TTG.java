package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TTG implements Iterator, C0s1 {
    public final C65131Te6 A00;

    public TTG(Pw1 pw1) {
        C14360o3.A0B(pw1, 1);
        TT7[] tt7Arr = new TT7[8];
        int i = 0;
        do {
            tt7Arr[i] = new C65135TeA(this);
            i++;
        } while (i < 8);
        this.A00 = new C65131Te6(pw1, tt7Arr);
    }

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
}
