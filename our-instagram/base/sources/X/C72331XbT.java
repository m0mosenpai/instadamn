package X;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.XbT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72331XbT extends AbstractC151006r1 implements InterfaceC41801wU {
    public volatile boolean A03;
    public final PriorityBlockingQueue A00 = new PriorityBlockingQueue();
    public final AtomicInteger A02 = new AtomicInteger();
    public final AtomicInteger A01 = new AtomicInteger();

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A03 = true;
    }

    @Override // X.AbstractC151006r1
    public final InterfaceC41801wU A00(Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return A02(runnable, timeUnit.convert(System.currentTimeMillis(), timeUnit));
    }

    @Override // X.AbstractC151006r1
    public final InterfaceC41801wU A01(Runnable runnable, TimeUnit timeUnit, long j) {
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long convert = timeUnit2.convert(System.currentTimeMillis(), timeUnit2) + timeUnit.toMillis(j);
        return A02(new YIU(this, runnable, convert), convert);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1wU, java.util.concurrent.atomic.AtomicReference] */
    public final InterfaceC41801wU A02(Runnable runnable, long j) {
        if (!this.A03) {
            YG2 yg2 = new YG2(Long.valueOf(j), runnable, this.A01.incrementAndGet());
            PriorityBlockingQueue priorityBlockingQueue = this.A00;
            priorityBlockingQueue.add(yg2);
            AtomicInteger atomicInteger = this.A02;
            if (atomicInteger.getAndIncrement() == 0) {
                int i = 1;
                while (true) {
                    if (this.A03) {
                        priorityBlockingQueue.clear();
                        break;
                    }
                    YG2 yg22 = (YG2) priorityBlockingQueue.poll();
                    if (yg22 == null) {
                        i = atomicInteger.addAndGet(-i);
                        if (i == 0) {
                            break;
                        }
                    } else if (!yg22.A03) {
                        yg22.A02.run();
                    }
                }
            } else {
                return new AtomicReference(new RunnableC73525YHp(yg2, this));
            }
        }
        return EnumC137086Im.INSTANCE;
    }
}
