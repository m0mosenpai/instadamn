package X;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes10.dex */
public final class TNW implements Runnable {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ CountDownLatch A01;

    public TNW(Runnable runnable, CountDownLatch countDownLatch) {
        this.A00 = runnable;
        this.A01 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.run();
        this.A01.countDown();
    }
}
