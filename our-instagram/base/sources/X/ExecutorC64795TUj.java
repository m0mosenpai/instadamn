package X;

import java.util.concurrent.Executor;

/* renamed from: X.TUj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorC64795TUj implements Executor {
    public final /* synthetic */ InterfaceC216113n A00;
    public final /* synthetic */ Executor A01;

    public ExecutorC64795TUj(final InterfaceC216113n val$executor, final Executor val$nameSupplier) {
        this.A01 = val$nameSupplier;
        this.A00 = val$executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        Executor executor = this.A01;
        InterfaceC216113n interfaceC216113n = this.A00;
        command.getClass();
        executor.execute(new RunnableC64654TOl(interfaceC216113n, command));
    }
}
