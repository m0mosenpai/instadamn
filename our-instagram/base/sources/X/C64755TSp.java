package X;

import java.util.Iterator;

/* renamed from: X.TSp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64755TSp implements Iterator {
    public int A00 = -1;
    public Iterator A01;
    public boolean A02;
    public final /* synthetic */ TZJ A03;

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.A02 = true;
        int i = this.A00 + 1;
        this.A00 = i;
        TZJ tzj = this.A03;
        if (i < tzj.A00.size()) {
            return tzj.A00.get(this.A00);
        }
        Iterator it = this.A01;
        if (it == null) {
            it = AbstractC166997dE.A15(tzj.A01);
            this.A01 = it;
        }
        return it.next();
    }

    public C64755TSp(TZJ tzj) {
        this.A03 = tzj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.A00 + 1;
        TZJ tzj = this.A03;
        if (i >= tzj.A00.size()) {
            if (!tzj.A01.isEmpty()) {
                Iterator it = this.A01;
                if (it == null) {
                    it = AbstractC166997dE.A15(tzj.A01);
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
            TZJ tzj = this.A03;
            TZJ.A03(tzj);
            if (this.A00 < tzj.A00.size()) {
                int i = this.A00;
                this.A00 = i - 1;
                TZJ.A01(tzj, i);
                return;
            } else {
                Iterator it = this.A01;
                if (it == null) {
                    it = AbstractC166997dE.A15(tzj.A01);
                    this.A01 = it;
                }
                it.remove();
                return;
            }
        }
        throw AbstractC166987dD.A14("remove() was called before next()");
    }
}
