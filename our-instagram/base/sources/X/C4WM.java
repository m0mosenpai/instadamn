package X;

import android.util.SparseBooleanArray;

/* renamed from: X.4WM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WM {
    public boolean A00;
    public final SparseBooleanArray A01 = new SparseBooleanArray();

    public final void A02(C4WO c4wo) {
        int i = 0;
        while (true) {
            SparseBooleanArray sparseBooleanArray = c4wo.A00;
            if (i < sparseBooleanArray.size()) {
                C4B8.A00(i, sparseBooleanArray.size());
                A01(sparseBooleanArray.keyAt(i));
                i++;
            } else {
                return;
            }
        }
    }

    public final C4WO A00() {
        C4B8.A04(!this.A00);
        this.A00 = true;
        return new C4WO(this.A01);
    }

    public final void A01(int i) {
        C4B8.A04(!this.A00);
        this.A01.append(i, true);
    }
}
