package X;

import java.util.concurrent.Callable;

/* renamed from: X.B0m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC24913B0m implements Callable {
    public final /* synthetic */ C142456c7 A00;

    public CallableC24913B0m(C142456c7 c142456c7) {
        this.A00 = c142456c7;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C142456c7 c142456c7 = this.A00;
        AbstractC29601bb abstractC29601bb = c142456c7.A0B;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        try {
            C1YP c1yp = c142456c7.A07;
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
