package X;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* loaded from: classes11.dex */
public final class WT2 implements InterfaceC30920DiX {
    public final C69319VlR A02;
    public final /* synthetic */ WT3 A03;
    public SparseIntArray A01 = new SparseIntArray(1);
    public SparseIntArray A00 = new SparseIntArray(1);

    public WT2(C69319VlR c69319VlR, WT3 wt3) {
        this.A03 = wt3;
        this.A02 = c69319VlR;
    }

    @Override // X.InterfaceC30920DiX
    public final void dispose() {
        WT3 wt3 = this.A03;
        C69319VlR c69319VlR = this.A02;
        SparseArray sparseArray = wt3.A01;
        int size = sparseArray.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (sparseArray.valueAt(size) == c69319VlR) {
                    sparseArray.removeAt(size);
                }
            } else {
                return;
            }
        }
    }
}
