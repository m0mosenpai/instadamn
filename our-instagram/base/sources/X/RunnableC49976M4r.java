package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* renamed from: X.M4r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49976M4r implements Runnable {
    public final ListenableFuture A00;
    public final InterfaceC24901Jp A01;

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.A00;
        if (listenableFuture.isCancelled()) {
            this.A01.AGJ(null);
            return;
        }
        try {
            this.A01.resumeWith(AbstractC53362cK.A00(listenableFuture));
        } catch (ExecutionException e) {
            InterfaceC24901Jp interfaceC24901Jp = this.A01;
            Throwable cause = e.getCause();
            AbstractC167007dF.A1C(cause);
            interfaceC24901Jp.resumeWith(new C09540e5(cause));
        }
    }

    public RunnableC49976M4r(ListenableFuture listenableFuture, InterfaceC24901Jp interfaceC24901Jp) {
        this.A00 = listenableFuture;
        this.A01 = interfaceC24901Jp;
    }
}
