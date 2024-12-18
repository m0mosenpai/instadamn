package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class TSX implements Iterator {
    public int A00;
    public C5MV A01 = null;
    public C5MV A02;
    public final /* synthetic */ C5MT A03;

    public TSX(C5MT c5mt) {
        this.A03 = c5mt;
        this.A02 = c5mt.A05.A02;
        this.A00 = c5mt.A00;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC25229BEm.A1a(this.A02, this.A03.A05);
    }

    @Override // java.util.Iterator
    public final void remove() {
        C5MV c5mv = this.A01;
        if (c5mv != null) {
            C5MT c5mt = this.A03;
            c5mt.A05(c5mv, true);
            this.A01 = null;
            this.A00 = c5mt.A00;
            return;
        }
        throw AbstractC58318PtA.A0Z();
    }
}
