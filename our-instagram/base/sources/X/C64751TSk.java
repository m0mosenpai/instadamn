package X;

import java.util.Iterator;

/* renamed from: X.TSk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64751TSk implements Iterator {
    public int A00 = -1;
    public Iterator A01;
    public boolean A02;
    public final /* synthetic */ TZH A03;

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.A02 = true;
        int i = this.A00 + 1;
        this.A00 = i;
        TZH tzh = this.A03;
        if (i < tzh.A00.size()) {
            return tzh.A00.get(this.A00);
        }
        Iterator it = this.A01;
        if (it == null) {
            it = AbstractC166997dE.A15(tzh.A01);
            this.A01 = it;
        }
        return it.next();
    }

    public C64751TSk(TZH tzh) {
        this.A03 = tzh;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.A00 + 1;
        TZH tzh = this.A03;
        if (i >= tzh.A00.size()) {
            if (!tzh.A01.isEmpty()) {
                Iterator it = this.A01;
                if (it == null) {
                    it = AbstractC166997dE.A15(tzh.A01);
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
            TZH tzh = this.A03;
            TZH.A03(tzh);
            if (this.A00 < tzh.A00.size()) {
                int i = this.A00;
                this.A00 = i - 1;
                TZH.A01(tzh, i);
                return;
            } else {
                Iterator it = this.A01;
                if (it == null) {
                    it = AbstractC166997dE.A15(tzh.A01);
                    this.A01 = it;
                }
                it.remove();
                return;
            }
        }
        throw AbstractC166987dD.A14("remove() was called before next()");
    }
}
