package X;

import java.util.concurrent.Executor;

/* renamed from: X.0nb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC14110nb implements Executor {
    public final /* synthetic */ int A00;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C14120nc.A00().ATO(new AbstractRunnableC14200nk(this.A00) { // from class: X.0vQ
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
            }
        });
    }
}
