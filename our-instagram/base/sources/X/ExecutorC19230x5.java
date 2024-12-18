package X;

import java.util.concurrent.Executor;

/* renamed from: X.0x5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC19230x5 implements Executor {
    public final Executor A00;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C14360o3.A0B(runnable, 0);
        this.A00.execute(runnable);
    }

    public ExecutorC19230x5(boolean z) {
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "IgQPLBackgroundExecution";
        this.A00 = new ExecutorC14040nU(new C18240vB(A00), 401, 5, z, false);
    }

    public ExecutorC19230x5() {
        this(false);
    }
}
