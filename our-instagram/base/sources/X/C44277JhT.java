package X;

import java.util.Iterator;

/* renamed from: X.JhT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44277JhT implements Iterator, C0s1 {
    public Object A00;
    public Iterator A01;
    public final /* synthetic */ C44275JhR A02;

    public C44277JhT(C44275JhR c44275JhR) {
        this.A02 = c44275JhR;
        this.A01 = AbstractC166997dE.A13(c44275JhR.A01);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.A01.next();
        this.A00 = next;
        if (next != null) {
            return next;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A01.remove();
        C44276JhS c44276JhS = this.A02.A00;
        Object obj = this.A00;
        if (obj != null && c44276JhS != null) {
            c44276JhS.A00(obj);
        }
    }
}
