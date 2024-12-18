package X;

import java.util.Iterator;

/* renamed from: X.TSw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64762TSw implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ AbstractC64537TIt A02;

    public C64762TSw() {
    }

    public C64762TSw(AbstractC64537TIt abstractC64537TIt) {
        this.A02 = abstractC64537TIt;
        this.A00 = 0;
        this.A01 = abstractC64537TIt.A02();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1Q(this.A00, this.A01);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        byte b;
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            RMJ rmj = (RMJ) this.A02;
            if (rmj instanceof RMI) {
                RMI rmi = (RMI) rmj;
                b = ((RMJ) rmi).A00[rmi.A00 + i];
            } else {
                b = rmj.A00[i];
            }
            return Byte.valueOf(b);
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC43592JPx.A11();
    }
}
