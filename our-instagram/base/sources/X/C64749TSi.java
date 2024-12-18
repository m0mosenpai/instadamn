package X;

import java.util.Iterator;

/* renamed from: X.TSi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64749TSi implements Iterator {
    public Object A00;
    public boolean A01;
    public final Iterator A02;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.A01 && !this.A02.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.A01) {
            return this.A02.next();
        }
        Object obj = this.A00;
        this.A01 = false;
        this.A00 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C18C.A0H(!this.A01, "Can't remove after you've peeked at next");
        this.A02.remove();
    }

    public C64749TSi(Iterator iterator) {
        iterator.getClass();
        this.A02 = iterator;
    }
}
