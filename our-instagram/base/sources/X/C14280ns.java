package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0ns, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14280ns extends AbstractExecutorService {
    public final int A00;
    public final int A01;
    public final InterfaceC14020nS A02;
    public final boolean A03;

    public C14280ns(int i, boolean z) {
        C13920nI c13920nI = C13920nI.A00;
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        C14360o3.A0B(c13920nI, 1);
        this.A02 = new C18220v9(c13920nI, A00);
        this.A01 = i;
        this.A00 = 3;
        this.A03 = z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        InterfaceC14020nS interfaceC14020nS = this.A02;
        final int i = this.A01;
        final int i2 = this.A00;
        final boolean z = this.A03;
        interfaceC14020nS.ATO(new AbstractRunnableC14200nk(i, i2, z) { // from class: X.0vG
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return Collections.emptyList();
    }
}
