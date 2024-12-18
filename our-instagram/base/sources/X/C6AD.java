package X;

/* renamed from: X.6AD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6AD extends AbstractC42051wv implements InterfaceCallableC206009Ad {
    public final Object A00;

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        RunnableC133245zq runnableC133245zq = new RunnableC133245zq(interfaceC42071wx, this.A00);
        interfaceC42071wx.Dpc(runnableC133245zq);
        runnableC133245zq.run();
    }

    @Override // X.InterfaceCallableC206009Ad, java.util.concurrent.Callable
    public final Object call() {
        return this.A00;
    }

    public C6AD(Object obj) {
        this.A00 = obj;
    }
}
