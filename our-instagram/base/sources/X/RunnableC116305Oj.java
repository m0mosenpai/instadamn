package X;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* renamed from: X.5Oj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC116305Oj extends AbstractOwnableSynchronizer implements Runnable {
    public final AbstractRunnableC25421Lw A00;

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.A00.toString();
    }

    public RunnableC116305Oj(AbstractRunnableC25421Lw task) {
        this.A00 = task;
    }

    public Thread getOwner() {
        return super.getExclusiveOwnerThread();
    }

    public static void A00(RunnableC116305Oj runnableC116305Oj, Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }
}
