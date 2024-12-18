package X;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.Pvv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ExecutorC58470Pvv implements Executor {
    public final /* synthetic */ AbstractC25011Ke A00;
    public final /* synthetic */ Executor A01;

    public ExecutorC58470Pvv(final AbstractC25011Ke val$delegate, final Executor val$future) {
        this.A01 = val$future;
        this.A00 = val$delegate;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        try {
            this.A01.execute(command);
        } catch (RejectedExecutionException e) {
            this.A00.setException(e);
        }
    }
}
