package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.66h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC1345766h extends AtomicBoolean implements Runnable, InterfaceC41801wU {
    public final Runnable A00;

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        lazySet(true);
    }

    public RunnableC1345766h(Runnable runnable) {
        this.A00 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!get()) {
            try {
                this.A00.run();
            } finally {
                lazySet(true);
            }
        }
    }
}
