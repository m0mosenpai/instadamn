package X;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6JH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JH extends AbstractC151006r1 implements Runnable {
    public final Executor A02;
    public volatile boolean A04;
    public final AtomicInteger A03 = new AtomicInteger();
    public final C41781wS A00 = new Object();
    public final C6JI A01 = new C6JI();

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        if (!this.A04) {
            this.A04 = true;
            this.A00.dispose();
            if (this.A03.getAndIncrement() == 0) {
                this.A01.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6JI c6ji = this.A01;
        int i = 1;
        while (!this.A04) {
            Runnable runnable = (Runnable) c6ji.poll();
            if (runnable == null) {
                if (this.A04) {
                    break;
                }
                i = this.A03.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                runnable.run();
            }
        }
        c6ji.clear();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.1wS] */
    public C6JH(Executor executor) {
        this.A02 = executor;
    }
}
