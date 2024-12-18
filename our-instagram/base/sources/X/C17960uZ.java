package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0uZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17960uZ implements Iterator, InterfaceC15590qF {
    public Iterator A00;
    public final List A01 = new ArrayList();
    public final InterfaceC16660sJ A02;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.A00.next();
        Iterator it = (Iterator) this.A02.invoke(next);
        if (it != null && it.hasNext()) {
            this.A01.add(this.A00);
            this.A00 = it;
        } else {
            while (!this.A00.hasNext()) {
                List list = this.A01;
                if (!(!list.isEmpty())) {
                    break;
                }
                this.A00 = (Iterator) AbstractC001800i.A0K(list);
                AnonymousClass016.A14(list);
            }
        }
        return next;
    }

    public C17960uZ(Iterator it, InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = interfaceC16660sJ;
        this.A00 = it;
    }
}
