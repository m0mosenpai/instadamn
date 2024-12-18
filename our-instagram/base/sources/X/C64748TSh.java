package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TSh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64748TSh implements Iterator {
    public Collection A00;
    public final Iterator A01;
    public final /* synthetic */ RRy A02;

    public C64748TSh(final RRy this$1) {
        this.A02 = this$1;
        this.A01 = AbstractC166997dE.A15(this$1.A00);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry A1K = AbstractC166987dD.A1K(this.A01);
        this.A00 = AbstractC58318PtA.A0y(A1K);
        return this.A02.A00(A1K);
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC58321PtD.A1T(AbstractC167007dF.A1W(this.A00));
        this.A01.remove();
        this.A02.A01.A00 -= this.A00.size();
        this.A00.clear();
        this.A00 = null;
    }
}
