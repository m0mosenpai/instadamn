package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: X.K5x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractRunnableC45364K5x extends AbstractC73453Qw implements Runnable {
    public ListenableFuture A00;
    public Class A01;
    public Object A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.K5x, X.1Ke, java.lang.Object, java.lang.Runnable] */
    public static void A01(C2n2 c2n2, ListenableFuture listenableFuture, Executor executor) {
        ?? obj = new Object();
        listenableFuture.getClass();
        obj.A00 = listenableFuture;
        obj.A01 = Exception.class;
        obj.A02 = c2n2;
        listenableFuture.addListener(obj, MoreExecutors.rejectionPropagatingExecutor(executor, obj));
    }

    @Override // X.AbstractC25011Ke
    public final String A07() {
        String str;
        StringBuilder A11;
        ListenableFuture listenableFuture = this.A00;
        Class cls = this.A01;
        Object obj = this.A02;
        String A07 = super.A07();
        if (listenableFuture != null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(AbstractC111324zv.A00(2541));
            A1C.append(listenableFuture);
            str = AbstractC166997dE.A0x("], ", A1C);
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            A11 = AbstractC166997dE.A11(str);
            A11.append("exceptionType=[");
            A11.append(cls);
            A11.append("], fallback=[");
            A11.append(obj);
            A11.append("]");
        } else if (A07 != null) {
            A11 = AbstractC166997dE.A11(str);
            A11.append(A07);
        } else {
            return null;
        }
        return A11.toString();
    }

    @Override // X.AbstractC25011Ke
    public final void A08() {
        A0B(this.A00);
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object apply;
        ListenableFuture listenableFuture = this.A00;
        Class cls = this.A01;
        Object obj = this.A02;
        boolean z = true;
        boolean A1Z = AbstractC25229BEm.A1Z(listenableFuture) | AbstractC25229BEm.A1Z(cls);
        if (obj != null) {
            z = false;
        }
        if (!(z | A1Z) && !isCancelled()) {
            this.A00 = null;
            try {
                if (!(listenableFuture instanceof AbstractC25021Kf) || (th = ((AbstractC25021Kf) listenableFuture).A06()) == null) {
                    C18C.A0B(listenableFuture, "Future was expected to be done: %s", listenableFuture.isDone());
                    set(AbstractC53362cK.A00(listenableFuture));
                    return;
                }
            } catch (ExecutionException e) {
                th = e.getCause();
                if (th == null) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Future type ");
                    A1C.append(listenableFuture.getClass());
                    A1C.append(" threw ");
                    A1C.append(e.getClass());
                    th = AbstractC166987dD.A15(AbstractC166997dE.A0x(" without a cause", A1C));
                }
            } catch (Throwable th) {
                th = th;
            }
            if (!cls.isInstance(th)) {
                A0A(listenableFuture);
                return;
            }
            try {
                boolean z2 = this instanceof C45360K5t;
                if (z2) {
                    InterfaceC133315zy interfaceC133315zy = (InterfaceC133315zy) obj;
                    apply = interfaceC133315zy.ABq(th);
                    C18C.A08(apply, interfaceC133315zy, AbstractC111324zv.A00(3501));
                } else {
                    apply = ((C2n2) obj).apply(th);
                }
                if (z2) {
                    A0A((ListenableFuture) apply);
                } else {
                    set(apply);
                }
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    setException(th2);
                } finally {
                    this.A01 = null;
                    this.A02 = null;
                }
            }
        }
    }
}
