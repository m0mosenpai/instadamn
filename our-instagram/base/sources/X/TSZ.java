package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TSZ implements Iterator {
    public final Iterator A00;
    public final /* synthetic */ TZ4 A01;

    public TSZ(TZ4 tz4) {
        this.A01 = tz4;
        this.A00 = tz4.A00.iterator();
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
        throw AbstractC43592JPx.A11();
    }
}
