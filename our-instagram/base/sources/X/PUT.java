package X;

import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class PUT implements Callable {
    public final int A00;
    public final int A01;
    public final Object A02;

    public PUT(MXP mxp, int i, int i2) {
        this.A00 = i2;
        this.A02 = mxp;
        this.A01 = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        AbstractC29601bb abstractC29601bb;
        InterfaceC37561ot acquire;
        C1YP c1yp;
        C0eB c0eB;
        try {
            try {
                switch (this.A00) {
                    case 0:
                        ((C8J9) this.A02).A01.A08(this.A01);
                        return AbstractC166997dE.A0b();
                    case 1:
                        C2PZ c2pz = (C2PZ) this.A02;
                        abstractC29601bb = c2pz.A02;
                        acquire = abstractC29601bb.acquire();
                        acquire.ADi(1, this.A01);
                        c1yp = c2pz.A01;
                        c1yp.beginTransaction();
                        acquire.ATb();
                        c1yp.setTransactionSuccessful();
                        c0eB = C0eB.A00;
                        break;
                    case 2:
                        MXP mxp = (MXP) this.A02;
                        abstractC29601bb = mxp.A03;
                        acquire = abstractC29601bb.acquire();
                        acquire.ADi(1, this.A01);
                        c1yp = mxp.A02;
                        c1yp.beginTransaction();
                        acquire.ATb();
                        c1yp.setTransactionSuccessful();
                        c0eB = C0eB.A00;
                        break;
                    default:
                        MXP mxp2 = (MXP) this.A02;
                        abstractC29601bb = mxp2.A04;
                        acquire = abstractC29601bb.acquire();
                        acquire.ADi(1, 1L);
                        acquire.ADi(2, this.A01);
                        c1yp = mxp2.A02;
                        c1yp.beginTransaction();
                        acquire.ATb();
                        c1yp.setTransactionSuccessful();
                        c0eB = C0eB.A00;
                        break;
                }
                return c0eB;
            } finally {
                c1yp.endTransaction();
            }
        } finally {
            abstractC29601bb.release(acquire);
        }
    }

    public PUT(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }
}
