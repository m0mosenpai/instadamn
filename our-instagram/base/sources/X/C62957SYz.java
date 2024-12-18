package X;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SYz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62957SYz {
    public Runnable A00;
    public ScheduledFuture A01;
    public boolean A02 = false;
    public final InterfaceC65489TlA A03;
    public final ScheduledExecutorService A04;

    public static synchronized void A00(final C62957SYz c62957SYz) {
        ScheduledFuture scheduledFuture;
        synchronized (c62957SYz) {
            if (c62957SYz.A02 && ((scheduledFuture = c62957SYz.A01) == null || scheduledFuture.isDone() || c62957SYz.A01.isCancelled())) {
                c62957SYz.A01 = c62957SYz.A04.schedule(new Runnable() { // from class: X.TKQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C62957SYz c62957SYz2 = C62957SYz.this;
                        synchronized (c62957SYz2) {
                            c62957SYz2.A01 = null;
                            if (c62957SYz2.A02) {
                                Runnable runnable = c62957SYz2.A00;
                                if (runnable != null) {
                                    try {
                                        runnable.run();
                                    } catch (Exception e) {
                                        c62957SYz2.A03.EmQ("OxygenInstallSDK_UNEXPECTED_THREAD_EXCEPTION", e);
                                    }
                                }
                                C62957SYz.A00(c62957SYz2);
                            }
                        }
                    }
                }, 500L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final synchronized void A01(boolean z) {
        this.A02 = z;
        if (z) {
            A00(this);
        } else {
            ScheduledFuture scheduledFuture = this.A01;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.A01 = null;
            }
        }
    }

    public C62957SYz(InterfaceC65489TlA interfaceC65489TlA, ScheduledExecutorService scheduledExecutorService) {
        this.A04 = scheduledExecutorService;
        this.A03 = interfaceC65489TlA;
    }
}
