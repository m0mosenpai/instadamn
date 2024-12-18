package X;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.KbE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46114KbE extends AbstractC151006r1 {
    public final AtomicBoolean A00 = new AtomicBoolean();
    public final C41781wS A01 = new Object();
    public final RunnableC143036d3 A02;
    public final C143026d2 A03;

    @Override // X.AbstractC151006r1
    public final InterfaceC41801wU A01(Runnable runnable, TimeUnit timeUnit, long j) {
        C41781wS c41781wS = this.A01;
        if (c41781wS.A01) {
            return EnumC137086Im.INSTANCE;
        }
        return this.A03.A02(c41781wS, runnable, timeUnit, j);
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        if (this.A00.compareAndSet(false, true)) {
            this.A01.dispose();
            RunnableC143036d3 runnableC143036d3 = this.A02;
            C143026d2 c143026d2 = this.A03;
            c143026d2.A00 = System.nanoTime() + runnableC143036d3.A00;
            runnableC143036d3.A02.offer(c143026d2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.1wS] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.6d2, X.1wU, X.6cx] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.6d2] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.6d2] */
    public C46114KbE(RunnableC143036d3 runnableC143036d3) {
        C143026d2 c142976cx;
        this.A02 = runnableC143036d3;
        C41781wS c41781wS = runnableC143036d3.A01;
        if (c41781wS.A01) {
            c142976cx = C143016d1.A04;
            this.A03 = c142976cx;
        }
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = runnableC143036d3.A02;
            if (!concurrentLinkedQueue.isEmpty()) {
                c142976cx = (C143026d2) concurrentLinkedQueue.poll();
                if (c142976cx != 0) {
                    break;
                }
            } else {
                c142976cx = new C142976cx(runnableC143036d3.A05);
                c142976cx.A00 = 0L;
                c41781wS.A7o(c142976cx);
                break;
            }
        }
        this.A03 = c142976cx;
    }
}
