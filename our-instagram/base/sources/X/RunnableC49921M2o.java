package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.M2o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49921M2o implements Runnable {
    public final /* synthetic */ LJd A00;
    public final /* synthetic */ CountDownLatch A01;

    public RunnableC49921M2o(LJd lJd, CountDownLatch countDownLatch) {
        this.A01 = countDownLatch;
        this.A00 = lJd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.countDown();
        Runnable runnable = this.A00.A05;
        if (runnable != null) {
            runnable.run();
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
