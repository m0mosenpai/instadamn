package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class B0Z implements Iterator, InterfaceC15590qF {
    public int A00;
    public final long[] A01;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1Q(this.A00, this.A01.length);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        long[] jArr = this.A01;
        if (i < jArr.length) {
            this.A00 = i + 1;
            return new C192358fd(jArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC166987dD.A1D("Operation is not supported for read-only collection");
    }

    public B0Z(long[] jArr) {
        this.A01 = jArr;
    }
}
