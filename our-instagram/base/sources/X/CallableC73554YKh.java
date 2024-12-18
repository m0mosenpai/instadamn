package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.YKh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class CallableC73554YKh extends AtomicReference implements InterfaceC41801wU, Callable {
    public static final FutureTask A02;
    public static final FutureTask A03;
    public Thread A00;
    public final Runnable A01;

    static {
        Runnable runnable = C6DB.A04;
        A02 = new FutureTask(runnable, null);
        A03 = new FutureTask(runnable, null);
    }

    public CallableC73554YKh(Runnable runnable) {
        this.A01 = runnable;
    }

    public final void A00(Future future) {
        Object obj;
        do {
            obj = get();
            if (obj != A02) {
                if (obj == A03) {
                    future.cancel(AbstractC25229BEm.A1a(this.A00, Thread.currentThread()));
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.A00 = Thread.currentThread();
        try {
            this.A01.run();
            return null;
        } finally {
            lazySet(A02);
            this.A00 = null;
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future != A02 && future != (futureTask = A03) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(AbstractC25229BEm.A1a(this.A00, Thread.currentThread()));
        }
    }
}
