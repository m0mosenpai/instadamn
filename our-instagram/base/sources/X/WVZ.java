package X;

import android.util.SparseArray;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WVZ implements XEQ {
    public final SparseArray A00 = new SparseArray();
    public final C69193VjM A01;
    public final boolean A02;

    @Override // X.XEQ
    public final synchronized C1VO AgB(int i, int i2, int i3) {
        X7L x7l;
        if (this.A02) {
            C69193VjM c69193VjM = this.A01;
            do {
                synchronized (c69193VjM) {
                    x7l = null;
                    Iterator it = c69193VjM.A01.iterator();
                    if (it.hasNext()) {
                        x7l = (X7L) it.next();
                        it.remove();
                    }
                }
            } while (x7l != null);
        }
        return null;
    }

    @Override // X.XEQ
    public final synchronized C1VO Ajc(int i) {
        return null;
    }

    @Override // X.XEQ
    public final synchronized C1VO B4L(int i) {
        return null;
    }

    @Override // X.XEQ
    public final synchronized void DIK(C1VO c1vo, int i, int i2) {
        UOR uor = new UOR(c1vo, C3QQ.A03);
        C1VO.A01(C1VO.A00(C1VO.A05, C1VO.A06, uor));
    }

    @Override // X.XEQ
    public final synchronized void DIQ(C1VO c1vo, int i, int i2) {
        SparseArray sparseArray = this.A00;
        C1VO c1vo2 = (C1VO) sparseArray.get(i);
        if (c1vo2 != null) {
            sparseArray.delete(i);
            c1vo2.close();
        }
        UOR uor = new UOR(c1vo, C3QQ.A03);
        C1VO.A01(C1VO.A00(C1VO.A05, C1VO.A06, uor));
    }

    @Override // X.XEQ
    public final synchronized void clear() {
        SparseArray sparseArray = this.A00;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            C1VO.A01((C1VO) sparseArray.valueAt(i));
        }
        sparseArray.clear();
    }

    @Override // X.XEQ
    public final synchronized boolean contains(int i) {
        return false;
    }

    public WVZ(C69193VjM c69193VjM, boolean z) {
        this.A01 = c69193VjM;
        this.A02 = z;
    }
}
