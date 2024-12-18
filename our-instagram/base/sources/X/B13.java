package X;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B13 implements Callable {
    public final /* synthetic */ C142456c7 A00;
    public final /* synthetic */ String A01;

    public B13(C142456c7 c142456c7, String str) {
        this.A00 = c142456c7;
        this.A01 = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C142456c7 c142456c7 = this.A00;
        AbstractC29601bb abstractC29601bb = c142456c7.A08;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADp(1, this.A01);
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
