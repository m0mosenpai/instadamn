package X;

import java.util.concurrent.Callable;

/* renamed from: X.XbR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72329XbR extends AbstractC42051wv {
    public final C6D4 A00;
    public final Object A01;

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        try {
            Object apply = this.A00.apply(this.A01);
            AbstractC42141x4.A01(apply, "The mapper returned a null ObservableSource");
            InterfaceC42061ww interfaceC42061ww = (InterfaceC42061ww) apply;
            if (interfaceC42061ww instanceof Callable) {
                try {
                    Object call = ((Callable) interfaceC42061ww).call();
                    if (call == null) {
                        interfaceC42071wx.Dpc(EnumC137086Im.INSTANCE);
                        interfaceC42071wx.onComplete();
                        return;
                    } else {
                        RunnableC133245zq runnableC133245zq = new RunnableC133245zq(interfaceC42071wx, call);
                        interfaceC42071wx.Dpc(runnableC133245zq);
                        runnableC133245zq.run();
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    AbstractC62281S5a.A00(th);
                    interfaceC42071wx.Dpc(EnumC137086Im.INSTANCE);
                    interfaceC42071wx.onError(th);
                    return;
                }
            }
            interfaceC42061ww.EpF(interfaceC42071wx);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public C72329XbR(C6D4 c6d4, Object obj) {
        this.A01 = obj;
        this.A00 = c6d4;
    }
}
