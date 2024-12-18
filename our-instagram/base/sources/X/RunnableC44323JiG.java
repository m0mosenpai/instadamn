package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;

/* renamed from: X.JiG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44323JiG implements Runnable {
    public final /* synthetic */ ListenableFuture A00;
    public final /* synthetic */ InterfaceC24901Jp A01;

    public RunnableC44323JiG(ListenableFuture listenableFuture, InterfaceC24901Jp interfaceC24901Jp) {
        this.A01 = interfaceC24901Jp;
        this.A00 = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A01.resumeWith(this.A00.get());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            boolean z = th instanceof CancellationException;
            InterfaceC24901Jp interfaceC24901Jp = this.A01;
            if (z) {
                interfaceC24901Jp.AGJ(cause);
            } else {
                interfaceC24901Jp.resumeWith(new C09540e5(cause));
            }
        }
    }
}
