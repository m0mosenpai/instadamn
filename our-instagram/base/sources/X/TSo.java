package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TSo implements Iterator {
    public int A00 = -1;
    public Iterator A01;
    public boolean A02;
    public final /* synthetic */ TZI A03;

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.A02 = true;
        int i = this.A00 + 1;
        this.A00 = i;
        TZI tzi = this.A03;
        if (i < tzi.A00.size()) {
            return tzi.A00.get(this.A00);
        }
        Iterator it = this.A01;
        if (it == null) {
            it = AbstractC166997dE.A15(tzi.A01);
            this.A01 = it;
        }
        return it.next();
    }

    public TSo(TZI tzi) {
        this.A03 = tzi;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.A00 + 1;
        TZI tzi = this.A03;
        if (i >= tzi.A00.size()) {
            if (!tzi.A01.isEmpty()) {
                Iterator it = this.A01;
                if (it == null) {
                    it = AbstractC166997dE.A15(tzi.A01);
                    this.A01 = it;
                }
                if (!it.hasNext()) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.A02) {
            this.A02 = false;
            TZI tzi = this.A03;
            TZI.A03(tzi);
            if (this.A00 < tzi.A00.size()) {
                int i = this.A00;
                this.A00 = i - 1;
                TZI.A01(tzi, i);
                return;
            } else {
                Iterator it = this.A01;
                if (it == null) {
                    it = AbstractC166997dE.A15(tzi.A01);
                    this.A01 = it;
                }
                it.remove();
                return;
            }
        }
        throw AbstractC166987dD.A14("remove() was called before next()");
    }
}
