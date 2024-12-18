package X;

import java.util.Iterator;

/* renamed from: X.TSv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64761TSv implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ AbstractC64536TIs A02;

    public C64761TSv() {
    }

    public C64761TSv(AbstractC64536TIs abstractC64536TIs) {
        this.A02 = abstractC64536TIs;
        this.A00 = 0;
        this.A01 = abstractC64536TIs.A01();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1Q(this.A00, this.A01);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            return Byte.valueOf(((RLN) this.A02).A00[i]);
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC43592JPx.A11();
    }
}
