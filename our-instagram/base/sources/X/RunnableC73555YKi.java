package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.YKi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73555YKi extends AtomicReference implements Runnable, InterfaceC41801wU {
    public final C73553YKg A00;
    public final C73553YKg A01;

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        if (getAndSet(null) != null) {
            C6KP.A01(this.A01);
            C6KP.A01(this.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.YKg, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.YKg, java.util.concurrent.atomic.AtomicReference] */
    public RunnableC73555YKi(Runnable runnable) {
        super(runnable);
        this.A01 = new AtomicReference();
        this.A00 = new AtomicReference();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                lazySet(null);
                C73553YKg c73553YKg = this.A01;
                C6KP c6kp = C6KP.A01;
                c73553YKg.lazySet(c6kp);
                this.A00.lazySet(c6kp);
            }
        }
    }
}
