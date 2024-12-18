package X;

import java.util.concurrent.Callable;

/* renamed from: X.6JA, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6JA {
    public static boolean A00(InterfaceC42061ww interfaceC42061ww, InterfaceC42071wx interfaceC42071wx, C6D4 c6d4) {
        boolean z = false;
        if (interfaceC42061ww instanceof Callable) {
            z = true;
            try {
                Object call = ((Callable) interfaceC42061ww).call();
                if (call != null) {
                    Object apply = c6d4.apply(call);
                    AbstractC42141x4.A01(apply, "The mapper returned a null ObservableSource");
                    InterfaceC42061ww interfaceC42061ww2 = (InterfaceC42061ww) apply;
                    if (interfaceC42061ww2 instanceof Callable) {
                        Object call2 = ((Callable) interfaceC42061ww2).call();
                        if (call2 != null) {
                            RunnableC133245zq runnableC133245zq = new RunnableC133245zq(interfaceC42071wx, call2);
                            interfaceC42071wx.Dpc(runnableC133245zq);
                            runnableC133245zq.run();
                            return true;
                        }
                    } else {
                        interfaceC42061ww2.EpF(interfaceC42071wx);
                        return true;
                    }
                }
                interfaceC42071wx.Dpc(EnumC137086Im.INSTANCE);
                interfaceC42071wx.onComplete();
            } catch (Throwable th) {
                AbstractC62281S5a.A00(th);
                interfaceC42071wx.Dpc(EnumC137086Im.INSTANCE);
                interfaceC42071wx.onError(th);
                return true;
            }
        }
        return z;
    }
}
