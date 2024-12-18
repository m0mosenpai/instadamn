package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TSY implements Iterator {
    public final int A00;

    public TSY(int i) {
        this.A00 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.A00;
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.A00;
        throw AbstractC43592JPx.A11();
    }
}
