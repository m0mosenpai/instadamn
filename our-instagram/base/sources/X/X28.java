package X;

import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes11.dex */
public final class X28 extends TimerTask {
    public final /* synthetic */ C161917Nb A00;

    public X28(C161917Nb c161917Nb) {
        this.A00 = c161917Nb;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C69062VhD c69062VhD;
        C161917Nb c161917Nb = this.A00;
        ConcurrentLinkedQueue concurrentLinkedQueue = c161917Nb.A08;
        if (!concurrentLinkedQueue.isEmpty() && (c69062VhD = (C69062VhD) concurrentLinkedQueue.poll()) != null) {
            c161917Nb.A05.E5K(c69062VhD);
        }
    }
}
