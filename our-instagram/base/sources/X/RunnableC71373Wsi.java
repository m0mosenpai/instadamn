package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.Wsi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71373Wsi implements Runnable {
    public final /* synthetic */ CountDownLatch A00;

    public RunnableC71373Wsi(CountDownLatch countDownLatch) {
        this.A00 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.countDown();
    }
}
