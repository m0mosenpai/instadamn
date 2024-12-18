package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0vL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18340vL implements InterfaceC14020nS {
    public final int A01;
    public final InterfaceC14020nS A02;
    public final AtomicInteger A03 = new AtomicInteger(0);
    public final BlockingQueue A00 = new LinkedBlockingDeque<AbstractRunnableC14200nk>() { // from class: X.0nh
        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
        public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
            return super.offerFirst(obj);
        }

        @Override // java.util.concurrent.LinkedBlockingDeque, java.util.AbstractQueue, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.Deque
        public final /* bridge */ /* synthetic */ Object remove() {
            return super.removeFirst();
        }
    };

    public C18340vL(InterfaceC14020nS interfaceC14020nS, int i) {
        this.A02 = interfaceC14020nS;
        this.A01 = i;
    }

    public static void A00(final C18340vL c18340vL) {
        final AbstractRunnableC14200nk abstractRunnableC14200nk;
        synchronized (c18340vL) {
            final AtomicInteger atomicInteger = c18340vL.A03;
            if (atomicInteger.get() < c18340vL.A01 && (abstractRunnableC14200nk = (AbstractRunnableC14200nk) c18340vL.A00.poll()) != null) {
                atomicInteger.incrementAndGet();
                c18340vL.A02.ATO(new AbstractRunnableC14200nk(abstractRunnableC14200nk, atomicInteger) { // from class: X.0vM
                    public final AbstractRunnableC14200nk A00;
                    public final AtomicInteger A01;

                    {
                        super(abstractRunnableC14200nk.runnableId, abstractRunnableC14200nk.priority, abstractRunnableC14200nk.isSendToNetworkThreadPool, abstractRunnableC14200nk.isMayRunDuringStartup);
                        this.A00 = abstractRunnableC14200nk;
                        this.A01 = atomicInteger;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.A00.run();
                        C18340vL c18340vL2 = C18340vL.this;
                        synchronized (c18340vL2) {
                            this.A01.decrementAndGet();
                        }
                        C18340vL.A00(c18340vL2);
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC14020nS
    public final void ATN(C14160ng c14160ng) {
        ATO(c14160ng.A00);
    }

    @Override // X.InterfaceC14020nS
    public final void ATO(AbstractRunnableC14200nk abstractRunnableC14200nk) {
        this.A00.add(abstractRunnableC14200nk);
        A00(this);
    }
}
