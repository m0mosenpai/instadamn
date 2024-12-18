package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.B0a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24901B0a implements Iterator, InterfaceC15590qF {
    public int A00;
    public final short[] A01;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1Q(this.A00, this.A01.length);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        short[] sArr = this.A01;
        if (i < sArr.length) {
            this.A00 = i + 1;
            return new C192498fr(sArr[i]);
        }
        throw new NoSuchElementException(String.valueOf(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC166987dD.A1D("Operation is not supported for read-only collection");
    }

    public C24901B0a(short[] sArr) {
        this.A01 = sArr;
    }
}
