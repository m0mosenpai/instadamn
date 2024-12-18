package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.4oP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105094oP implements Iterator, InterfaceC23621Ds, InterfaceC15590qF {
    public int A00;
    public Iterator A01;
    public InterfaceC23621Ds A02;
    public Object A03;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private final RuntimeException A00() {
        int i = this.A00;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException(AnonymousClass001.A0O("Unexpected state of the iterator: ", i));
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final C1JX A02(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        this.A03 = obj;
        this.A00 = 3;
        this.A02 = interfaceC23621Ds;
        return C1JX.A02;
    }

    @Override // X.InterfaceC23621Ds
    public final C12W getContext() {
        return AnonymousClass191.A00;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.A00;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw A00();
                }
                Iterator it = this.A01;
                C14360o3.A0A(it);
                if (it.hasNext()) {
                    this.A00 = 2;
                    return true;
                }
                this.A01 = null;
            }
            this.A00 = 5;
            InterfaceC23621Ds interfaceC23621Ds = this.A02;
            C14360o3.A0A(interfaceC23621Ds);
            this.A02 = null;
            interfaceC23621Ds.resumeWith(C0eB.A00);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.A00;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.A00 = 0;
                    Object obj = this.A03;
                    this.A03 = null;
                    return obj;
                }
                throw A00();
            }
            this.A00 = 1;
            Iterator it = this.A01;
            C14360o3.A0A(it);
            return it.next();
        }
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public final Object A01(InterfaceC23621Ds interfaceC23621Ds, InterfaceC224417g interfaceC224417g) {
        Object obj;
        Iterator it = interfaceC224417g.iterator();
        if (!it.hasNext()) {
            obj = C0eB.A00;
        } else {
            this.A01 = it;
            this.A00 = 2;
            this.A02 = interfaceC23621Ds;
            obj = C1JX.A02;
        }
        if (obj != C1JX.A02) {
            return C0eB.A00;
        }
        return obj;
    }

    @Override // X.InterfaceC23621Ds
    public final void resumeWith(Object obj) {
        AbstractC09560e7.A00(obj);
        this.A00 = 4;
    }
}
