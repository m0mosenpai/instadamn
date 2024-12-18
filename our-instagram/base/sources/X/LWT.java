package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class LWT implements ListenableFuture {
    public boolean A00;
    public final SettableFuture A01 = new Object();
    public final AnonymousClass195 A02;

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.A01.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (this.A01.cancel(z)) {
            this.A02.AGH(null);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj = this.A01.get(j, timeUnit);
        if (!(obj instanceof C47468Kxx)) {
            return obj;
        }
        throw new CancellationException().initCause(((C47468Kxx) obj).A00);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        SettableFuture settableFuture = this.A01;
        if (!settableFuture.isCancelled()) {
            if (!isDone() || this.A00) {
                return false;
            }
            try {
                if (!(AbstractC53362cK.A00(settableFuture) instanceof C47468Kxx)) {
                    return false;
                }
            } catch (CancellationException unused) {
            } catch (ExecutionException unused2) {
                this.A00 = true;
                return false;
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.A01.isDone();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public LWT(AnonymousClass195 anonymousClass195) {
        this.A02 = anonymousClass195;
    }

    public final String toString() {
        StringBuilder A1C;
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        A1C2.append(super.toString());
        A1C2.append("[status=");
        if (isDone()) {
            try {
                Object A00 = AbstractC53362cK.A00(this.A01);
                if (A00 instanceof C47468Kxx) {
                    StringBuilder A1C3 = AbstractC166987dD.A1C();
                    A1C3.append("CANCELLED, cause=[");
                    A1C3.append(((C47468Kxx) A00).A00);
                    A1C3.append(']');
                    A1C2.append(A1C3.toString());
                } else {
                    StringBuilder A1C4 = AbstractC166987dD.A1C();
                    A1C4.append(AbstractC111324zv.A00(3747));
                    A1C4.append(A00);
                    A1C4.append(']');
                    A1C2.append(A1C4.toString());
                }
            } catch (CancellationException unused) {
                A1C2.append("CANCELLED");
            } catch (ExecutionException e) {
                A1C = AbstractC166987dD.A1C();
                A1C.append(AbstractC111324zv.A00(3608));
                A1C.append(e.getCause());
                A1C.append(']');
            } catch (Throwable th) {
                A1C = AbstractC166987dD.A1C();
                A1C.append(AbstractC111324zv.A00(3789));
                A1C.append(th.getClass());
                A1C.append(AbstractC111324zv.A00(3341));
            }
            A1C2.append(']');
            return AbstractC166987dD.A19(A1C2);
        }
        A1C = AbstractC166987dD.A1C();
        A1C.append("PENDING, delegate=[");
        A1C.append(this.A01);
        A1C.append(']');
        A1C2.append(A1C.toString());
        A1C2.append(']');
        return AbstractC166987dD.A19(A1C2);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj = this.A01.get();
        if (!(obj instanceof C47468Kxx)) {
            return obj;
        }
        throw new CancellationException().initCause(((C47468Kxx) obj).A00);
    }
}
