package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: X.5zz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC133325zz extends AbstractC73453Qw implements Runnable {
    public ListenableFuture A00;
    public Object A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.5zz, X.1Ke, java.lang.Object, java.lang.Runnable, X.600] */
    public static AnonymousClass600 A01(InterfaceC133315zy input, ListenableFuture function, Executor executor) {
        ?? obj = new Object();
        obj.A00 = function;
        obj.A01 = input;
        function.addListener(obj, MoreExecutors.rejectionPropagatingExecutor(executor, obj));
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.5zz, X.1Ke, java.lang.Object, X.RSy, java.lang.Runnable] */
    public static C60787RSy A02(C2n2 input, ListenableFuture function, Executor executor) {
        ?? obj = new Object();
        function.getClass();
        obj.A00 = function;
        obj.A01 = input;
        function.addListener(obj, MoreExecutors.rejectionPropagatingExecutor(executor, obj));
        return obj;
    }

    @Override // X.AbstractC25011Ke
    public final String A07() {
        String str;
        StringBuilder sb;
        ListenableFuture listenableFuture = this.A00;
        Object obj = this.A01;
        String A07 = super.A07();
        if (listenableFuture != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("inputFuture=[");
            sb2.append(listenableFuture);
            sb2.append("], ");
            str = sb2.toString();
        } else {
            str = "";
        }
        if (obj != null) {
            sb = new StringBuilder();
            sb.append(str);
            sb.append("function=[");
            sb.append(obj);
            sb.append("]");
        } else if (A07 != null) {
            sb = new StringBuilder();
            sb.append(str);
            sb.append(A07);
        } else {
            return null;
        }
        return sb.toString();
    }

    @Override // X.AbstractC25011Ke
    public final void A08() {
        A0B(this.A00);
        this.A00 = null;
        this.A01 = null;
    }

    public Object A0C(Object function, Object result) {
        InterfaceC133315zy interfaceC133315zy = (InterfaceC133315zy) function;
        ListenableFuture ABq = interfaceC133315zy.ABq(result);
        C18C.A08(ABq, interfaceC133315zy, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s");
        return ABq;
    }

    public void A0D(Object result) {
        A0A((ListenableFuture) result);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable e;
        ListenableFuture listenableFuture = this.A00;
        Object obj = this.A01;
        boolean isCancelled = isCancelled();
        boolean z = true;
        boolean z2 = false;
        if (listenableFuture == null) {
            z2 = true;
        }
        boolean z3 = isCancelled | z2;
        if (obj != null) {
            z = false;
        }
        if (!(z3 | z)) {
            this.A00 = null;
            if (listenableFuture.isCancelled()) {
                A0A(listenableFuture);
                return;
            }
            try {
                C18C.A0B(listenableFuture, "Future was expected to be done: %s", listenableFuture.isDone());
                try {
                    Object A0C = A0C(obj, AbstractC53362cK.A00(listenableFuture));
                    this.A01 = null;
                    A0D(A0C);
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        setException(th);
                    } finally {
                        this.A01 = null;
                    }
                }
            } catch (Error | Exception e2) {
                e = e2;
                setException(e);
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                e = e3.getCause();
                setException(e);
            }
        }
    }
}
