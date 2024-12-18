package X;

import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class WU8 implements InterfaceC65635Tpw {
    public final InterfaceC65635Tpw A00;
    public final Executor A01;

    @Override // X.InterfaceC65635Tpw
    public final void onSuccess() {
        this.A01.execute(new RunnableC71252Wqh(this));
    }

    public WU8(InterfaceC65635Tpw interfaceC65635Tpw, Executor executor) {
        this.A01 = executor;
        this.A00 = interfaceC65635Tpw;
    }

    @Override // X.InterfaceC65338TiJ
    public final void onError(Throwable th) {
        throw C00O.createAndThrow();
    }
}
