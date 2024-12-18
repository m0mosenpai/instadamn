package X;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B19 implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C2043992v A01;

    public B19(C2043992v c2043992v, long j) {
        this.A01 = c2043992v;
        this.A00 = j;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C2043992v c2043992v = this.A01;
        AbstractC29601bb abstractC29601bb = c2043992v.A06;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADi(1, this.A00);
        try {
            C1YP c1yp = c2043992v.A05;
            c1yp.beginTransaction();
            try {
                acquire.ATb();
                c1yp.setTransactionSuccessful();
                return C0eB.A00;
            } finally {
                c1yp.endTransaction();
            }
        } finally {
            abstractC29601bb.release(acquire);
        }
    }
}
