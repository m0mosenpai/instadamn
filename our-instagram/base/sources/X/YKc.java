package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class YKc extends AtomicReference implements InterfaceC42071wx {
    public final InterfaceC42071wx A00;
    public final YKY A01;

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        this.A00.DVo(obj);
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        YKY yky = this.A01;
        yky.A09 = false;
        yky.A00();
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        YKY yky = this.A01;
        if (Y4X.A02(th, yky.A07)) {
            if (!yky.A08) {
                yky.A01.dispose();
            }
            yky.A09 = false;
            yky.A00();
            return;
        }
        AbstractC142886co.A02(th);
    }

    public YKc(InterfaceC42071wx interfaceC42071wx, YKY yky) {
        this.A00 = interfaceC42071wx;
        this.A01 = yky;
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        C6KP.A00(interfaceC41801wU, this);
    }
}
