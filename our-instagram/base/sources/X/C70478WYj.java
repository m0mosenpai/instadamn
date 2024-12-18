package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.WYj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70478WYj implements XD7 {
    public final CountDownLatch A00 = AbstractC58319PtB.A15();
    public volatile C66287U7i A01;

    @Override // X.XD7
    public final void cancel() {
        AGG(null);
    }

    @Override // X.XD7
    public final void AGG(String str) {
        U7X u7x;
        C66287U7i c66287U7i = this.A01;
        if (c66287U7i != null) {
            c66287U7i.A0T = true;
            InterfaceC71998XEm interfaceC71998XEm = c66287U7i.A09;
            if (interfaceC71998XEm != null) {
                interfaceC71998XEm.cancel();
            }
            WDG wdg = c66287U7i.A06;
            if (wdg != null) {
                wdg.A0H = true;
            }
            if (!c66287U7i.A0C && (u7x = c66287U7i.A05) != null) {
                u7x.A00();
            }
            this.A01 = null;
        }
    }

    @Override // X.XD7
    public final void FDu() {
        this.A00.await();
    }

    public C70478WYj(C66287U7i c66287U7i) {
        this.A01 = c66287U7i;
    }
}
