package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TSg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64747TSg implements Iterator {
    public Map.Entry A00;
    public final /* synthetic */ C60711RNn A01;
    public final /* synthetic */ Iterator A02;

    public C64747TSg(C60711RNn c60711RNn, Iterator it) {
        this.A01 = c60711RNn;
        this.A02 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A02.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry A1K = AbstractC166987dD.A1K(this.A02);
        this.A00 = A1K;
        return A1K.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Map.Entry entry = this.A00;
        if (AbstractC167007dF.A1W(entry)) {
            Collection A0y = AbstractC58318PtA.A0y(entry);
            this.A02.remove();
            this.A01.A01.A00 -= A0y.size();
            A0y.clear();
            this.A00 = null;
            return;
        }
        throw AbstractC166987dD.A14("no calls to next() since the last call to remove()");
    }
}
