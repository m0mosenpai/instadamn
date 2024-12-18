package X;

/* loaded from: classes12.dex */
public final class XMT implements InterfaceC41801wU, YRQ {
    public YP6 A00;
    public final InterfaceC42071wx A01;

    @Override // X.InterfaceC73610YPe
    public final void DVo(Object obj) {
        this.A01.DVo(obj);
    }

    @Override // X.InterfaceC73610YPe
    public final void Dpd(YP6 yp6) {
        if (this.A00 != null) {
            yp6.cancel();
            AbstractC142886co.A02(new IllegalStateException("Subscription already set!"));
        } else {
            this.A00 = yp6;
            this.A01.Dpc(this);
            yp6.EIy(Long.MAX_VALUE);
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A00.cancel();
        this.A00 = EnumC72444Xdo.A01;
    }

    @Override // X.InterfaceC73610YPe
    public final void onComplete() {
        this.A01.onComplete();
    }

    @Override // X.InterfaceC73610YPe
    public final void onError(Throwable th) {
        this.A01.onError(th);
    }

    public XMT(InterfaceC42071wx interfaceC42071wx) {
        this.A01 = interfaceC42071wx;
    }
}
