package X;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sea, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63175Sea {
    public boolean A00;
    public final Object A02 = AbstractC58318PtA.A0b();
    public final Queue A03 = new ArrayDeque();
    public final AtomicReference A01 = new AtomicReference();

    public static final void A00(C63175Sea c63175Sea) {
        synchronized (c63175Sea.A02) {
            Queue queue = c63175Sea.A03;
            if (queue.isEmpty()) {
                c63175Sea.A00 = false;
                return;
            }
            C62509SEl c62509SEl = (C62509SEl) queue.remove();
            c63175Sea.A01(c62509SEl.A00, c62509SEl.A01);
        }
    }

    private final void A01(final Runnable runnable, Executor executor) {
        try {
            executor.execute(new Runnable() { // from class: X.TOu
                @Override // java.lang.Runnable
                public final void run() {
                    C63175Sea c63175Sea = C63175Sea.this;
                    Runnable runnable2 = runnable;
                    AtomicReference atomicReference = c63175Sea.A01;
                    if (atomicReference.getAndSet(Thread.currentThread()) == null) {
                        try {
                            runnable2.run();
                            atomicReference.set(null);
                            C63175Sea.A00(c63175Sea);
                        } catch (Throwable th) {
                            try {
                                atomicReference.set(null);
                                C63175Sea.A00(c63175Sea);
                                throw th;
                            } finally {
                            }
                        }
                    } else {
                        throw AbstractC58318PtA.A0Z();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            A00(this);
        }
    }

    public final void A02(Runnable runnable, Executor executor) {
        synchronized (this.A02) {
            if (this.A00) {
                this.A03.add(new C62509SEl(runnable, executor));
            } else {
                this.A00 = true;
                A01(runnable, executor);
            }
        }
    }
}
