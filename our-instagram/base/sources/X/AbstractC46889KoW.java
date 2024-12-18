package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.KoW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46889KoW {
    public static final void A00(Runnable runnable) {
        if (C11T.A08()) {
            runnable.run();
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C11T.A03(new M4J(runnable, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            C0w9.A06("DirectNotificationActionService", "Error waiting for task to complete on UI thread", e);
        }
    }
}
