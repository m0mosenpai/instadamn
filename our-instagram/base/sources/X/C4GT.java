package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.4GT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4GT implements C1NJ {
    public C73033Pe A00;
    public final CountDownLatch A01 = new CountDownLatch(1);

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        this.A00 = c73033Pe;
        this.A01.countDown();
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        this.A01.countDown();
    }
}
