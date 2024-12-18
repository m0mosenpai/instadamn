package X;

/* loaded from: classes12.dex */
public final class XMS implements InterfaceC42071wx, YP6 {
    public InterfaceC41801wU A00;
    public final InterfaceC73610YPe A01;

    @Override // X.YP6
    public final void EIy(long j) {
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        this.A01.DVo(obj);
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        this.A00 = interfaceC41801wU;
        this.A01.Dpd(this);
    }

    @Override // X.YP6
    public final void cancel() {
        this.A00.dispose();
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        this.A01.onComplete();
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        this.A01.onError(th);
    }

    public XMS(InterfaceC73610YPe interfaceC73610YPe) {
        this.A01 = interfaceC73610YPe;
    }
}
