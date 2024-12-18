package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.YFr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73488YFr implements InterfaceC42071wx {
    public Throwable A00;
    public final YKZ A01;
    public final C137416Km A02;
    public final AtomicReference A03 = new AtomicReference();
    public volatile boolean A04;

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        this.A04 = true;
        this.A01.A01();
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        this.A02.offer(obj);
        this.A01.A01();
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        C6KP.A03(interfaceC41801wU, this.A03);
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        this.A00 = th;
        this.A04 = true;
        this.A01.A01();
    }

    public C73488YFr(YKZ ykz, int i) {
        this.A01 = ykz;
        this.A02 = new C137416Km(i);
    }
}
