package X;

import android.util.SparseArray;

/* loaded from: classes12.dex */
public final class Y0E {
    public YPI A00;
    public boolean A01;
    public int A02;
    public int A03;
    public final SparseArray A04 = new SparseArray();
    public final SparseArray A05 = new SparseArray();

    public static void A00(Y0E y0e) {
        YPI ypi = y0e.A00;
        int AtK = ypi.AtK();
        int AtE = ypi.AtE();
        if (y0e.A03 != AtK || y0e.A02 != AtE) {
            y0e.A03 = AtK;
            y0e.A02 = AtE;
            y0e.A04.clear();
            y0e.A05.clear();
        }
    }

    public Y0E(YPI ypi) {
        this.A00 = ypi;
        this.A03 = ypi.AtK();
        this.A02 = this.A00.AtE();
    }
}
