package X;

import java.util.Iterator;

/* renamed from: X.TSd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64744TSd implements Iterator {
    public boolean A00 = true;
    public final /* synthetic */ Iterator A01;

    public C64744TSd(Iterator it) {
        this.A01 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.A01.next();
        this.A00 = false;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC58321PtD.A1T(!this.A00);
        this.A01.remove();
    }
}
