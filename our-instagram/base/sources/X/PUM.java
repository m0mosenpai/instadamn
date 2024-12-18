package X;

import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class PUM implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C2PZ A01;
    public final /* synthetic */ String A02;

    public PUM(C2PZ c2pz, String str, long j) {
        this.A01 = c2pz;
        this.A00 = j;
        this.A02 = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C2PZ c2pz = this.A01;
        AbstractC29601bb abstractC29601bb = c2pz.A03;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADi(1, this.A00);
        acquire.ADp(2, this.A02);
        try {
            C1YP c1yp = c2pz.A01;
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
