package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.M7f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50042M7f implements Iterator, InterfaceC15590qF {
    public int A00;
    public Iterator A01;
    public final Iterator A02;
    public final /* synthetic */ M9O A03;

    public C50042M7f(M9O m9o) {
        this.A03 = m9o;
        this.A02 = m9o.A02.iterator();
    }

    private final boolean A00() {
        Iterator it;
        Iterator it2 = this.A01;
        if (it2 == null || !it2.hasNext()) {
            do {
                Iterator it3 = this.A02;
                if (it3.hasNext()) {
                    Object next = it3.next();
                    M9O m9o = this.A03;
                    it = (Iterator) m9o.A00.invoke(m9o.A01.invoke(next));
                } else {
                    this.A00 = 2;
                    this.A01 = null;
                    return false;
                }
            } while (!it.hasNext());
            this.A01 = it;
        }
        this.A00 = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.A00;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return A00();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.A00;
        if (i != 2) {
            if (i == 0 && !A00()) {
                throw new NoSuchElementException();
            }
            this.A00 = 0;
            Iterator it = this.A01;
            C14360o3.A0A(it);
            return it.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC166987dD.A1D(AbstractC111324zv.A00(30));
    }
}
