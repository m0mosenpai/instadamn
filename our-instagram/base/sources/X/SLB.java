package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes10.dex */
public final class SLB {
    public final InterfaceC65489TlA A00;
    public final ScheduledExecutorService A01;

    public final void A00(final Runnable runnable) {
        this.A01.submit(new Runnable() { // from class: X.TNd
            @Override // java.lang.Runnable
            public final void run() {
                SLB slb = SLB.this;
                try {
                    runnable.run();
                } catch (Throwable th) {
                    slb.A00.EmQ("OxygenInstallSDK_UNEXPECTED_THREAD_EXCEPTION", th);
                }
            }
        });
    }

    public SLB(InterfaceC65489TlA interfaceC65489TlA) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.A00 = interfaceC65489TlA;
        this.A01 = newSingleThreadScheduledExecutor;
    }
}
