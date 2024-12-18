package X;

import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class T2v implements InterfaceC65507Tlc {
    public final InterfaceC65507Tlc A00;
    public final Executor A01;

    @Override // X.InterfaceC65507Tlc
    public final void CyJ(final Throwable th) {
        this.A01.execute(new Runnable() { // from class: X.TOJ
            @Override // java.lang.Runnable
            public final void run() {
                T2v t2v = T2v.this;
                t2v.A00.CyJ(th);
            }
        });
    }

    @Override // X.InterfaceC65507Tlc
    public final void CyK(final SGB sgb) {
        this.A01.execute(new Runnable() { // from class: X.TOK
            @Override // java.lang.Runnable
            public final void run() {
                T2v t2v = this;
                t2v.A00.CyK(sgb);
            }
        });
    }

    public T2v(InterfaceC65507Tlc interfaceC65507Tlc, Executor executor) {
        this.A01 = executor;
        this.A00 = interfaceC65507Tlc;
    }
}
