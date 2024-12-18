package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class B0X implements Iterator, InterfaceC15590qF {
    public int A00;
    public final byte[] A01;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1Q(this.A00, this.A01.length);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        byte[] bArr = this.A01;
        if (i < bArr.length) {
            this.A00 = i + 1;
            return new C192568fy(bArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC166987dD.A1D("Operation is not supported for read-only collection");
    }

    public B0X(byte[] bArr) {
        this.A01 = bArr;
    }
}
