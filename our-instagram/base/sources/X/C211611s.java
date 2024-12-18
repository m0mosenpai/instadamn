package X;

import java.util.Iterator;

/* renamed from: X.11s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C211611s extends AbstractC211711t implements Iterator {
    public C58345Ptg A00;
    public boolean A01 = true;
    public final /* synthetic */ C58336PtW A02;

    public C211611s(C58336PtW c58336PtW) {
        this.A02 = c58336PtW;
    }

    @Override // X.AbstractC211711t
    public final void A00(C58345Ptg c58345Ptg) {
        C58345Ptg c58345Ptg2 = this.A00;
        if (c58345Ptg == c58345Ptg2) {
            C58345Ptg c58345Ptg3 = c58345Ptg2.A01;
            this.A00 = c58345Ptg3;
            boolean z = false;
            if (c58345Ptg3 == null) {
                z = true;
            }
            this.A01 = z;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C58345Ptg c58345Ptg;
        if (this.A01) {
            c58345Ptg = this.A02.A02;
        } else {
            C58345Ptg c58345Ptg2 = this.A00;
            if (c58345Ptg2 != null) {
                c58345Ptg = c58345Ptg2.A00;
            } else {
                return false;
            }
        }
        if (c58345Ptg != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C58345Ptg c58345Ptg;
        if (this.A01) {
            this.A01 = false;
            c58345Ptg = this.A02.A02;
        } else {
            C58345Ptg c58345Ptg2 = this.A00;
            if (c58345Ptg2 != null) {
                c58345Ptg = c58345Ptg2.A00;
            } else {
                c58345Ptg = null;
            }
        }
        this.A00 = c58345Ptg;
        return c58345Ptg;
    }
}
