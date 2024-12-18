package X;

import java.util.concurrent.ScheduledFuture;

/* renamed from: X.TJz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64562TJz implements Runnable {
    public final /* synthetic */ C140296Wh A00;

    public RunnableC64562TJz(C140296Wh c140296Wh) {
        this.A00 = c140296Wh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C140296Wh c140296Wh = this.A00;
        synchronized (c140296Wh) {
            if (c140296Wh.A03) {
                C103804lz c103804lz = c140296Wh.A01;
                if (c103804lz != null) {
                    c140296Wh.A03 = false;
                    c140296Wh.A08.A06();
                    ScheduledFuture scheduledFuture = c140296Wh.A02;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        c140296Wh.A02 = null;
                    }
                    c140296Wh.A01(c103804lz);
                } else {
                    C140296Wh.A00(c140296Wh, new C58601PyU(C05F.A01));
                }
            }
        }
    }
}
