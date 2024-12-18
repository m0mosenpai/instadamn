package X;

import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class WUD implements InterfaceC65636Tpx {
    public final InterfaceC65636Tpx A00;
    public final Executor A01;

    @Override // X.InterfaceC65636Tpx
    public final void onSuccess(Object obj) {
        this.A01.execute(new RunnableC71416Wte(this, obj));
    }

    public WUD(InterfaceC65636Tpx interfaceC65636Tpx, Executor executor) {
        this.A01 = executor;
        this.A00 = interfaceC65636Tpx;
    }

    @Override // X.InterfaceC65338TiJ
    public final void onError(Throwable th) {
        throw C00O.createAndThrow();
    }
}
