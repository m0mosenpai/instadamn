package X;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2OD, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2OD {
    public static C43659JSr A00(Iterable futures) {
        C25051Kj c25051Kj = C1LT.A03;
        return new C43659JSr(ImmutableList.copyOf(futures), true);
    }

    public static ListenableFuture A02(Object value) {
        if (value == null) {
            return C25191Kx.A01;
        }
        return new C25191Kx(value);
    }

    public static void A03(final C2JL future, final ListenableFuture callback, Executor executor) {
        callback.addListener(new Runnable(future, callback) { // from class: X.2OF
            public final C2JL A00;
            public final Future A01;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                C2JL c2jl;
                Future future2 = this.A01;
                if ((future2 instanceof AbstractC25021Kf) && (th = ((AbstractC25021Kf) future2).A06()) != null) {
                    c2jl = this.A00;
                } else {
                    try {
                        C18C.A0B(future2, "Future was expected to be done: %s", future2.isDone());
                        this.A00.onSuccess(AbstractC53362cK.A00(future2));
                        return;
                    } catch (ExecutionException e) {
                        c2jl = this.A00;
                        th = e.getCause();
                    } catch (Throwable th) {
                        th = th;
                        c2jl = this.A00;
                    }
                }
                c2jl.onFailure(th);
            }

            {
                this.A01 = callback;
                this.A00 = future;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.L0k] */
            public final String toString() {
                JSR A00 = JSS.A00(this);
                C2JL c2jl = this.A00;
                ?? obj = new Object();
                A00.A00.A00 = obj;
                A00.A00 = obj;
                obj.A01 = c2jl;
                return A00.toString();
            }
        }, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.3R1, java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, X.3R0, java.lang.Object] */
    public static ListenableFuture A01(ListenableFuture delegate, ScheduledExecutorService time, TimeUnit unit, long scheduledExecutor) {
        if (!delegate.isDone()) {
            ?? obj = new Object();
            obj.A00 = delegate;
            ?? obj2 = new Object();
            obj2.A00 = obj;
            obj.A01 = time.schedule((Runnable) obj2, scheduledExecutor, unit);
            delegate.addListener(obj2, C1M8.A01);
            return obj;
        }
        return delegate;
    }
}
