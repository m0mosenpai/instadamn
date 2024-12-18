package X;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B1I implements Callable {
    public final /* synthetic */ C2043992v A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public B1I(C2043992v c2043992v, String str, String str2) {
        this.A00 = c2043992v;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C2043992v c2043992v = this.A00;
        AbstractC29601bb abstractC29601bb = c2043992v.A08;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADp(1, this.A02);
        acquire.ADp(2, this.A01);
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
