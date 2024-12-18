package X;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes8.dex */
public final class M4J implements Runnable {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ CountDownLatch A01;

    public M4J(Runnable runnable, CountDownLatch countDownLatch) {
        this.A00 = runnable;
        this.A01 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.run();
        this.A01.countDown();
    }
}
