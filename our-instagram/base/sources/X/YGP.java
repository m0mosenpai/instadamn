package X;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes12.dex */
public final class YGP implements Runnable {
    public final /* synthetic */ CountDownLatch A00;

    public YGP(CountDownLatch countDownLatch) {
        this.A00 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.countDown();
    }
}
