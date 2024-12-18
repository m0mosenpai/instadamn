package X;

import com.facebook.msys.mca.Mailbox;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.M5l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49996M5l implements Runnable {
    public final /* synthetic */ Mailbox A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ C15370ps A02;

    public RunnableC49996M5l(Mailbox mailbox, CountDownLatch countDownLatch, C15370ps c15370ps) {
        this.A02 = c15370ps;
        this.A00 = mailbox;
        this.A01 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A00 = this.A00;
        this.A01.countDown();
    }
}
