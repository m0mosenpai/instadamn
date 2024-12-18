package X;

import android.util.LongSparseArray;

/* loaded from: classes11.dex */
public final class U5R {
    public final LongSparseArray A00;
    public final C78463fC A01;

    public final C135266Ab A00(C102884kP c102884kP, boolean z) {
        C14360o3.A0B(c102884kP, 0);
        long A02 = AbstractC37301Gc2.A02(Integer.valueOf(c102884kP.A04), Boolean.valueOf(z));
        C135266Ab c135266Ab = (C135266Ab) this.A00.get(A02);
        if (c135266Ab == null) {
            C135266Ab c135266Ab2 = (C135266Ab) this.A01.A00(Long.valueOf(A02));
            if (c135266Ab2 == null) {
                return null;
            }
            return c135266Ab2;
        }
        return c135266Ab;
    }

    public U5R(C78473fD c78473fD, C102884kP c102884kP) {
        this.A00 = new LongSparseArray(c102884kP.A0M().size());
        this.A01 = (C78463fC) c78473fD.A06.getValue();
    }

    public final void A01(C135266Ab c135266Ab, C102884kP c102884kP, boolean z) {
        AbstractC167017dG.A1N(c102884kP, c135266Ab);
        long A02 = AbstractC37301Gc2.A02(Integer.valueOf(c102884kP.A04), Boolean.valueOf(z));
        this.A00.put(A02, c135266Ab);
        this.A01.A01(Long.valueOf(A02), c135266Ab);
    }
}
