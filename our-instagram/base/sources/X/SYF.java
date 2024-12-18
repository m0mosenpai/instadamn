package X;

import android.util.SparseArray;

/* loaded from: classes10.dex */
public final class SYF {
    public C63169SeU A00;
    public final SparseArray A01;

    public SYF(int i) {
        this.A01 = new SparseArray(i);
    }

    public final void A00(C63169SeU c63169SeU, int i, int i2) {
        int A08 = AbstractC58323PtF.A08(C63169SeU.A00(c63169SeU), i);
        SparseArray sparseArray = this.A01;
        SYF syf = (SYF) sparseArray.get(A08);
        if (syf == null) {
            syf = new SYF(1);
            sparseArray.put(AbstractC58323PtF.A08(C63169SeU.A00(c63169SeU), i), syf);
        }
        if (i2 > i) {
            syf.A00(c63169SeU, i + 1, i2);
        } else {
            syf.A00 = c63169SeU;
        }
    }

    public SYF() {
        this(1);
    }
}
