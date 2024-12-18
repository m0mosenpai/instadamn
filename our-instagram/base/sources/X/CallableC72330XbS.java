package X;

import java.util.concurrent.Callable;

/* renamed from: X.XbS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class CallableC72330XbS extends AbstractC42051wv implements Callable {
    public final Callable A00;

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        C72332XbU c72332XbU = new C72332XbU(interfaceC42071wx);
        interfaceC42071wx.Dpc(c72332XbU);
        if (c72332XbU.get() != 4) {
            try {
                Object call = this.A00.call();
                AbstractC42141x4.A01(call, "Callable returned null");
                int i = c72332XbU.get();
                if ((i & 54) == 0) {
                    InterfaceC42071wx interfaceC42071wx2 = c72332XbU.A01;
                    if (i == 8) {
                        c72332XbU.A00 = call;
                        c72332XbU.lazySet(16);
                        call = null;
                    } else {
                        c72332XbU.lazySet(2);
                    }
                    interfaceC42071wx2.DVo(call);
                    if (c72332XbU.get() != 4) {
                        interfaceC42071wx2.onComplete();
                    }
                }
            } catch (Throwable th) {
                AbstractC62281S5a.A00(th);
                if (c72332XbU.get() == 4) {
                    AbstractC142886co.A02(th);
                } else {
                    interfaceC42071wx.onError(th);
                }
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object call = this.A00.call();
        AbstractC42141x4.A01(call, "The callable returned a null value");
        return call;
    }

    public CallableC72330XbS(Callable callable) {
        this.A00 = callable;
    }
}
