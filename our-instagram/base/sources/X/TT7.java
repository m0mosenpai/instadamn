package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class TT7 implements Iterator, InterfaceC15590qF {
    public int A00;
    public int A01;
    public Object[] A02 = C6LW.A04.A02;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1Q(this.A01, this.A00);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC58321PtD.A10();
    }
}
