package X;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: X.1Lv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25411Lv extends AbstractRunnableC25421Lw {
    public final Executor A00;
    public final Callable A01;
    public final /* synthetic */ C1LQ A02;
    public final /* synthetic */ C1LQ A03;

    public C25411Lv(final C1LQ this$0, Callable callable, Executor listenerExecutor) {
        this.A03 = this$0;
        this.A02 = this$0;
        listenerExecutor.getClass();
        this.A00 = listenerExecutor;
        this.A01 = callable;
    }

    @Override // X.AbstractRunnableC25421Lw
    public final Object A01() {
        return this.A01.call();
    }

    @Override // X.AbstractRunnableC25421Lw
    public final String A02() {
        return this.A01.toString();
    }

    @Override // X.AbstractRunnableC25421Lw
    public final void A04(Object result) {
        C1LQ c1lq = this.A02;
        C25051Kj c25051Kj = C1LT.A03;
        c1lq.A00 = null;
        this.A03.set(result);
    }

    @Override // X.AbstractRunnableC25421Lw
    public final void A05(Throwable error) {
        C1LQ c1lq = this.A02;
        C25051Kj c25051Kj = C1LT.A03;
        c1lq.A00 = null;
        if (error instanceof ExecutionException) {
            error = error.getCause();
        } else if (error instanceof CancellationException) {
            c1lq.cancel(false);
            return;
        }
        c1lq.setException(error);
    }

    @Override // X.AbstractRunnableC25421Lw
    public final boolean A06() {
        return this.A02.isDone();
    }
}
