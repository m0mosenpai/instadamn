package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class YKd extends AtomicReference implements InterfaceC42071wx {
    public final InterfaceC42071wx A00;
    public final YKX A01;

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        this.A00.DVo(obj);
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        YKX ykx = this.A01;
        ykx.A07 = false;
        ykx.A00();
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        this.A01.dispose();
        this.A00.onError(th);
    }

    public YKd(InterfaceC42071wx interfaceC42071wx, YKX ykx) {
        this.A00 = interfaceC42071wx;
        this.A01 = ykx;
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        C6KP.A00(interfaceC41801wU, this);
    }
}
