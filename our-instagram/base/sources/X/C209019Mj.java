package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9Mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209019Mj {
    public final AtomicReference A00 = new AtomicReference(new CountDownLatch(0));

    public static CountDownLatch A00(C209019Mj c209019Mj) {
        Object obj = c209019Mj.A00.get();
        obj.getClass();
        return (CountDownLatch) obj;
    }

    public final void A01(int i) {
        CountDownLatch countDownLatch = (CountDownLatch) this.A00.getAndSet(new CountDownLatch(i));
        if (countDownLatch != null) {
            while (countDownLatch.getCount() > 0) {
                countDownLatch.countDown();
            }
        }
    }
}
