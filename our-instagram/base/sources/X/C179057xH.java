package X;

import android.util.SparseArray;

/* renamed from: X.7xH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179057xH {
    public final C178747wm A01;
    public final SparseArray A02 = new SparseArray();
    public final SparseArray A00 = new SparseArray();

    public final void A01(InterfaceC179467xw interfaceC179467xw, InterfaceC179437xt interfaceC179437xt) {
        try {
            AbstractC1808580n.A03("sendOutputData");
            C179377xn c179377xn = (C179377xn) this.A00.get(0);
            if (c179377xn == null) {
                this.A01.A00(EnumC200658u8.A0B);
            } else if (interfaceC179437xt != null) {
                interfaceC179437xt.BaJ();
                InterfaceC179467xw A00 = C179377xn.A00(c179377xn, interfaceC179467xw);
                InterfaceC180227zC A01 = c179377xn.A01.A01();
                boolean z = c179377xn.A07;
                if (c179377xn.A02 == null) {
                    C81F c81f = new C81F(c179377xn.A05);
                    c179377xn.A02 = c81f;
                    c81f.ACv(A01);
                }
                C81F c81f2 = c179377xn.A02;
                if (z) {
                    c81f2.A01(A01, A00, interfaceC179437xt, null, true, false, false);
                    C179377xn.A01(c179377xn);
                } else {
                    c81f2.A00(A01, A00, interfaceC179437xt);
                }
            } else {
                c179377xn.A03(interfaceC179467xw);
            }
        } finally {
            AbstractC1808580n.A01();
        }
    }

    public static C179377xn A00(C178907x2 c178907x2, C179057xH c179057xH, int i) {
        SparseArray sparseArray = c179057xH.A00;
        C179377xn c179377xn = (C179377xn) sparseArray.get(i);
        if (c179377xn == null) {
            synchronized (sparseArray) {
                c179377xn = (C179377xn) sparseArray.get(i);
                if (c179377xn == null) {
                    c179377xn = new C179377xn(c179057xH.A01);
                    sparseArray.put(i, c179377xn);
                }
            }
        }
        if (!c178907x2.A07.A00.contains(c179377xn)) {
            c178907x2.A03(c179377xn);
        }
        return c179377xn;
    }

    public C179057xH(C178747wm c178747wm) {
        this.A01 = c178747wm;
    }
}
