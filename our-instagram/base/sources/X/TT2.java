package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TT2 implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ AbstractC64539TIv A02;

    public TT2() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TT2(AbstractC64539TIv abstractC64539TIv) {
        this();
        this.A02 = abstractC64539TIv;
        this.A00 = 0;
        this.A01 = abstractC64539TIv.A05();
    }

    public final byte A00() {
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            return this.A02.A03(i);
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1Q(this.A00, this.A01);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(A00());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC43592JPx.A11();
    }
}
