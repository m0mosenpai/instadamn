package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.17p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C225317p implements Iterator, InterfaceC15590qF {
    public int A00 = -1;
    public Object A01;
    public final Iterator A02;
    public final /* synthetic */ C225117n A03;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C225317p(C225117n c225117n) {
        this.A03 = c225117n;
        this.A02 = c225117n.A01.iterator();
    }

    private final void A00() {
        int i;
        while (true) {
            Iterator it = this.A02;
            if (it.hasNext()) {
                Object next = it.next();
                C225117n c225117n = this.A03;
                if (((Boolean) c225117n.A00.invoke(next)).booleanValue() == c225117n.A02) {
                    this.A01 = next;
                    i = 1;
                    break;
                }
            } else {
                i = 0;
                break;
            }
        }
        this.A00 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A00 == -1) {
            A00();
        }
        if (this.A00 == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.A00 == -1) {
            A00();
        }
        if (this.A00 != 0) {
            Object obj = this.A01;
            this.A01 = null;
            this.A00 = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
