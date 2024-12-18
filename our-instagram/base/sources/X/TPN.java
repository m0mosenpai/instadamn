package X;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes10.dex */
public final class TPN implements Runnable {
    public final /* synthetic */ C1N8 A00;
    public final /* synthetic */ C49182Nr A01;
    public final /* synthetic */ ListenableFuture A02;

    public TPN(C1N8 c1n8, C49182Nr c49182Nr, ListenableFuture listenableFuture) {
        this.A02 = listenableFuture;
        this.A00 = c1n8;
        this.A01 = c49182Nr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A01.A07(this.A00.apply(this.A02.get()));
        } catch (Throwable th) {
            th = th;
            Throwable cause = th.getCause();
            if (cause != null) {
                th = cause;
            }
            this.A01.A08(th);
        }
    }
}
