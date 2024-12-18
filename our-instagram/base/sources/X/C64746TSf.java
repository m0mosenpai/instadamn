package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TSf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64746TSf implements Iterator {
    public Collection A00;
    public final Iterator A01;
    public final /* synthetic */ TZG A02;

    public C64746TSf(TZG tzg) {
        this.A02 = tzg;
        this.A01 = AbstractC166997dE.A15(tzg.A02);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry A1K = AbstractC166987dD.A1K(this.A01);
        this.A00 = AbstractC58318PtA.A0y(A1K);
        TZG tzg = this.A02;
        Object key = A1K.getKey();
        return new RNZ(key, tzg.A03.A00(key, AbstractC58318PtA.A0y(A1K)));
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (AbstractC167007dF.A1W(this.A00)) {
            this.A01.remove();
            this.A02.A03.A00 -= this.A00.size();
            this.A00.clear();
            this.A00 = null;
            return;
        }
        throw AbstractC166987dD.A14("no calls to next() since the last call to remove()");
    }
}
