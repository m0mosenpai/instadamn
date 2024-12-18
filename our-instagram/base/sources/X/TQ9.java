package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class TQ9 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ExecutorService A01;
    public final /* synthetic */ TimeUnit A02;

    public TQ9(ExecutorService executorService, long j, TimeUnit timeUnit) {
        this.A01 = executorService;
        this.A00 = j;
        this.A02 = timeUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ExecutorService executorService = this.A01;
            executorService.shutdown();
            executorService.awaitTermination(this.A00, this.A02);
        } catch (InterruptedException unused) {
        }
    }
}
