package X;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: X.12R, reason: invalid class name */
/* loaded from: classes.dex */
public class C12R extends C12S {
    public ExecutorC213312l A00 = new ExecutorC213312l(AbstractC212912g.A01, AbstractC212912g.A02, "CoroutineScheduler", AbstractC212912g.A03);

    @Override // X.C12T
    public final void A04(Runnable runnable, C12W c12w) {
        ExecutorC213312l executorC213312l = this.A00;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC213312l.A0A;
        executorC213312l.A05(runnable, AbstractC212912g.A07, true);
    }

    @Override // X.C12T
    public final void A05(Runnable runnable, C12W c12w) {
        ExecutorC213312l executorC213312l = this.A00;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC213312l.A0A;
        executorC213312l.A05(runnable, AbstractC212912g.A07, false);
    }

    @Override // X.C12S, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A00.close();
    }
}
