package X;

import java.util.Iterator;

/* renamed from: X.2Zr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC51922Zr extends AbstractC211711t implements Iterator {
    public C58345Ptg A00;
    public C58345Ptg A01;

    public abstract C58345Ptg A01(C58345Ptg c58345Ptg);

    public abstract C58345Ptg A02(C58345Ptg c58345Ptg);

    @Override // X.AbstractC211711t
    public final void A00(C58345Ptg c58345Ptg) {
        C58345Ptg c58345Ptg2;
        C58345Ptg c58345Ptg3 = this.A00;
        if (c58345Ptg3 == c58345Ptg && c58345Ptg == this.A01) {
            c58345Ptg3 = null;
            this.A01 = null;
            this.A00 = null;
        }
        if (c58345Ptg3 == c58345Ptg) {
            c58345Ptg3 = A01(c58345Ptg3);
            this.A00 = c58345Ptg3;
        }
        C58345Ptg c58345Ptg4 = this.A01;
        if (c58345Ptg4 == c58345Ptg) {
            if (c58345Ptg4 != c58345Ptg3 && c58345Ptg3 != null) {
                c58345Ptg2 = A02(c58345Ptg4);
            } else {
                c58345Ptg2 = null;
            }
            this.A01 = c58345Ptg2;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A01 == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C58345Ptg c58345Ptg;
        C58345Ptg c58345Ptg2 = this.A01;
        C58345Ptg c58345Ptg3 = this.A00;
        if (c58345Ptg2 != c58345Ptg3 && c58345Ptg3 != null) {
            c58345Ptg = A02(c58345Ptg2);
        } else {
            c58345Ptg = null;
        }
        this.A01 = c58345Ptg;
        return c58345Ptg2;
    }
}
