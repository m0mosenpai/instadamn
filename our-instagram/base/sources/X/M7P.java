package X;

/* loaded from: classes8.dex */
public final class M7P implements Runnable, InterfaceC41801wU {
    public Thread A00;
    public final AbstractC151006r1 A01;
    public final Runnable A02;

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        if (this.A00 == Thread.currentThread()) {
            AbstractC151006r1 abstractC151006r1 = this.A01;
            if (abstractC151006r1 instanceof C142976cx) {
                C142976cx c142976cx = (C142976cx) abstractC151006r1;
                if (!c142976cx.A01) {
                    c142976cx.A01 = true;
                    c142976cx.A00.shutdown();
                    return;
                }
                return;
            }
        }
        this.A01.dispose();
    }

    public M7P(AbstractC151006r1 abstractC151006r1, Runnable runnable) {
        this.A02 = runnable;
        this.A01 = abstractC151006r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00 = Thread.currentThread();
        try {
            this.A02.run();
        } finally {
            dispose();
            this.A00 = null;
        }
    }
}
