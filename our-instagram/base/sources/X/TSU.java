package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TSU implements Iterator {
    public SQA A00;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1W(this.A00);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        SQA sqa = this.A00;
        if (sqa != null) {
            Object obj = sqa.A02;
            this.A00 = sqa.A01;
            return obj;
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw AbstractC43592JPx.A11();
    }
}
